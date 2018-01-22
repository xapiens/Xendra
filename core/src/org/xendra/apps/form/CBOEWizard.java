/******************************************************************************
 * Copyright (C) 2009-2010 Dravio SAC. All Rights Reserved.                		  *
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

package org.xendra.apps.form;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.ALayout;
import org.compiere.apps.ALayoutConstraint;
import org.compiere.apps.ALogin;
import org.compiere.apps.AMenu;
import org.compiere.apps.StatusBar;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.form.VInvoiceRow;
import org.compiere.grid.ed.VDate;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.compiere.minigrid.MiniTable;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MBOE;
import org.compiere.model.MBOEConversionRate;
import org.compiere.model.MBOELine;
import org.compiere.model.MBPartner;
import org.compiere.model.MConversionRate;
import org.compiere.model.MConversionType;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MGroupDoc;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MOrder;
import org.compiere.model.MQuery;
import org.compiere.model.MRetention;
import org.compiere.model.Query;
import org.compiere.print.AReport;
import org.compiere.process.DocAction;
import org.compiere.swing.CFrame;
import org.compiere.swing.CLabel;
import org.compiere.swing.CPanel;
import org.compiere.swing.CTabbedPane;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.Splash;
import org.compiere.util.Trx;
import org.compiere.util.Util;
import org.xendra.exceptions.XendraException;
import org.xendra.line.LineKeyAdapter;
import org.xendra.objectview.DefaultObjectViewModel;
import org.xendra.objectview.ObjectView;
import org.xendra.objectview.IObjetViewColumn;

/**
 *	Generate Bill of Exchange from Invoices pendings.
 *
 * 	@author 	xapiens
 * 	@version 	$Id: 2
 */
public class CBOEWizard extends CFrame implements FormPanel, ActionListener, VetoableChangeListener, ChangeListener 
{

	CBOEWizard()
	{
		Initialize();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FormFrame m_frame;
	private int m_WindowNo;	
	private int m_Acct_C_Currency_ID;
	private int m_RowActiveHistory = -1;
	private BigDecimal m_Rate;
	private int m_C_Currency_ID;
	private int m_C_AcctSchema_ID;
	private int m_C_DocType_ID;
	private int m_C_BPartner_ID = 0;
	private boolean m_IsSOTrx = true;
	private boolean m_retention = false;
	private int m_C_BPartner_Location_ID = 0;
	private CTabbedPane tabbedPane = new CTabbedPane();
	private StatusBar statusBar = new StatusBar();
	private VLookup pickCurrencyInvoice;
	private VLookup pickConversionType;
	private VLookup pickDocType;
	private VDate pickGenDate = new VDate();
	
	private VLookup pickPartner;
	private JScrollPane invoiceScrollPane = new JScrollPane();
	private JScrollPane portfolioBOEScrollPane = new JScrollPane();
	private JScrollPane portfolioInvoiceScrollPane = new JScrollPane();
	private JScrollPane BoeScrollPane = new JScrollPane();
	private CPanel mainPanel = new CPanel();
	private GridBagLayout parameterLayout = new GridBagLayout();
	private CPanel parameterPanel = new CPanel();
	private CPanel WizPanel = new CPanel();
	private CPanel NewBOEsPanel = new CPanel(); 
	private CPanel invoicePanel = new CPanel();
	private CPanel BOEApplyPanel = new CPanel();
	private CPanel groupDocContainer = new CPanel();
	private CPanel HistoryContainer = new CPanel();
	private CPanel PortfolioBOEContainer = new CPanel();
	private CPanel PortfolioInvoiceContainer = new CPanel();
	private JScrollPane groupScrollPanel = new JScrollPane();
	private JScrollPane historyScrollPanel = new JScrollPane();
	private JSplitPane infoPanel = new JSplitPane();
	private JSplitPane PortfolioPanel = new JSplitPane();
	private JSplitPane leftPanel = new JSplitPane();
	private JSplitPane rightPanel = new JSplitPane();
	private JButton generateButton = new JButton();
	private JButton processButton = new JButton();
	private JButton PortfolioButton = new JButton();
	private JButton AccountButton = new JButton();
	private CLabel lretention = new CLabel("", JLabel.LEFT);
	private SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1,1,100,1);
	private SpinnerNumberModel spinModelBetween = new SpinnerNumberModel(1,1,365,7);
	private JSpinner NumberofBoEField = new JSpinner(spinnerModel);	
	private JSpinner BetweenofBoEField = new JSpinner(spinModelBetween);
	private static CLogger log = CLogger.getCLogger(VBoeGen.class);
	private ObjectView invoiceView = new ObjectView();
	private ObjectView portafolioView = new ObjectView();
	private MiniTable PortinvoiceTable = new MiniTable();
	private ObjectView groupView = new ObjectView();
	private ObjectView historyView = new ObjectView();
	private JLabel invoiceInfo = new JLabel();
	private ObjectView boeView = new ObjectView();
	private JLabel boeInfo = new JLabel();

	private BigDecimal m_BoeItems = Env.ONE ;
	private BigDecimal m_BOEamount = Env.ZERO;
	private BigDecimal m_Invoiceamount = Env.ZERO;
	private Integer m_BeetweenBoes = new Integer(1) ;
	private String m_trxName;
	private Trx m_trx;
	private VLookup pickCurrencyBOE;
	private VNumber pickRate = new VNumber("pickRate", false, false, true, DisplayType.Amount, Msg.translate(Env.getCtx(), "MultiRate"));
	private String m_TextMsg;
	private boolean m_callout;
	private static Hashtable<Integer,KeyNamePair> s_Currencies = null;	//	EMU Currencies
	private MRetention retention = new MRetention(Env.getCtx(), 0, null);
	DefaultObjectViewModel invoicemodel = null;
	DefaultObjectViewModel boemodel = null;
	DefaultObjectViewModel groupmodel = null;
	DefaultObjectViewModel portafoliomodel = null;
	DefaultObjectViewModel historymodel = null;
	private LineKeyAdapter lkaInvoice;
	private LineKeyAdapter lkaBoe;
	private LineKeyAdapter lkaGroup;
	private LineKeyAdapter lkaPortafolio;
	private LineKeyAdapter lkaHistory;
	
	public void dispose() {
		if (m_frame != null)
			m_frame.dispose();
		m_frame = null;			
	}
	
	
	public void init(int WindowNo, FormFrame frame) {
		m_WindowNo = WindowNo;
		m_frame = frame;		
		
		Env.setContext(Env.getCtx(), m_WindowNo, "IsSOTrx", "Y");   //  defaults to no
		m_C_AcctSchema_ID = Env.getContextAsInt(Env.getCtx(), "$C_AcctSchema_ID");
		MAcctSchema s_AcctSchema = new MAcctSchema (Env.getCtx(), m_C_AcctSchema_ID, null);		
		m_Acct_C_Currency_ID = s_AcctSchema.getC_Currency_ID();   //  default
		m_C_Currency_ID = m_Acct_C_Currency_ID;
		MCurrency dolares = MCurrency.getCurrencyDolar();
		if (dolares != null)
			m_C_Currency_ID = dolares.getC_Currency_ID();
		//
		log.info("Currency=" + m_C_Currency_ID);
		try
		{
			frame.getContentPane().add(Initialize(), BorderLayout.CENTER);
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
	}

	private CTabbedPane Initialize() {		
		int AD_Column_ID = Util.getColumnID(MInvoice.Table_ID,"C_Currency_ID");
		MLookup lookupCurrInvoice = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);		
		
		pickCurrencyInvoice = new VLookup("I_C_Currency_ID", true, false, true, lookupCurrInvoice);
		pickCurrencyInvoice.setValue(new Integer(m_C_Currency_ID));
		pickCurrencyInvoice.addVetoableChangeListener(this);
				
		MLookup lookupCurrBOE = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		
		pickCurrencyBOE = new VLookup("B_C_Currency_ID", true, false, true, lookupCurrBOE);
		pickCurrencyBOE.setValue(new Integer(m_C_Currency_ID));
		pickCurrencyBOE.addVetoableChangeListener(this);
		
		pickRate.setMandatory(true);
				
		pickPartner = VLookup.createBPartner(m_WindowNo);
		pickPartner.addVetoableChangeListener(this);
		
		AD_Column_ID = Util.getColumnID(MOrder.Table_ID,"C_DocTypeTarget_ID");
		
		MLookupInfo lookupInfo = MLookupFactory.getLookupInfo (Env.getCtx(), m_WindowNo, AD_Column_ID, DisplayType.Table,
				Env.getLanguage(Env.getCtx()), "C_DocTypeTarget_ID", 170,
				false, "C_DocType.DocBaseType IN ('BOE') ");
		
		MLookup lookupDocType = new MLookup (lookupInfo, 0);
		pickDocType = new VLookup("C_DocType_ID", true, false, true, lookupDocType);
		
		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID,"C_ConversionType_ID");
		MLookup lookupConversionType = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		pickConversionType = new VLookup("C_ConversionType_ID", true, false, true, lookupConversionType);
		pickConversionType.setValue(MConversionType.getDefault(Env.getAD_Client_ID(Env.getCtx())));
		pickConversionType.addVetoableChangeListener(this);

		String sql = "SELECT C_DocType_ID  "
			+ "FROM c_doctype "
			+ "WHERE docbasetype in ('BOE') AND AD_Client_ID = "+Env.getAD_Client_ID(Env.getCtx())+" AND ISSOTRX='Y'";
		m_C_DocType_ID = DB.getSQLValue(null, sql);
		pickDocType.addVetoableChangeListener(this);
		pickDocType.setValue(new Integer(m_C_DocType_ID));
		MDocType mt = MDocType.get(Env.getCtx(), (Integer) m_C_DocType_ID);
		if (mt.getC_ConversionType_ID() > 0)
			pickConversionType.setValue(mt.getC_ConversionType_ID());			
		
		NumberofBoEField.addChangeListener(this);
		BetweenofBoEField.addChangeListener(this);
		
		//  Translation
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "BillOfExchangeGenerationStatus"));
		statusBar.setStatusDB("");

		//  Date set to Login Date
		pickGenDate.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		pickGenDate.addVetoableChangeListener(this);													

	    invoicemodel = new DefaultObjectViewModel(VInvoiceRow.getColumns(), null);		
		invoiceView = new ObjectView(invoicemodel);
		invoiceView.setColumnSelectionAllowed(false);
		invoiceView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		invoiceView.configcontrols(m_WindowNo);
		invoiceView.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
		invoiceView.getInputMap(JComponent.WHEN_FOCUSED)		   	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
		
	    lkaInvoice = new LineKeyAdapter();
	    lkaInvoice.setContext(m_frame, this, invoiceView, true /* m_showdialoginfo */, m_WindowNo, null, null, null);
	    lkaInvoice.funcCalculateTotalLines("calculateinvoice");
	    lkaInvoice.setKeys(0, 0, 0, 0);
	    
	    invoiceView.setContext(this);
	    invoiceView.funcCalculateTotalLines("calculateinvoice");
	    invoiceView.addKeyListener(lkaInvoice);	    
		
	    boemodel = new DefaultObjectViewModel(CBOERow.getColumns(), null);	   
	    boeView = new ObjectView(boemodel);
	    boeView.setColumnSelectionAllowed(false);
	    boeView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    boeView.configcontrols(m_WindowNo);
	    boeView.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    boeView.getInputMap(JComponent.WHEN_FOCUSED)		    .put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");

	    lkaBoe = new LineKeyAdapter();
	    lkaBoe.setContext(m_frame, this, boeView, true /* m_showdialoginfo */, m_WindowNo, null, null, null);
	    lkaBoe.funcCalculateTotalLines("calculateboe");
	    lkaBoe.setKeys(0, 0, 0, 0);

	    boeView.setContext(this);
	    boeView.funcCalculateTotalLines("calculateboe");
	    boeView.addKeyListener(lkaBoe);	    	    
		
	    groupmodel = new DefaultObjectViewModel(CGroupRow.getColumns(), null);
	    groupView = new ObjectView(groupmodel);
	    groupView.setColumnSelectionAllowed(false);
	    groupView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    groupView.configcontrols(m_WindowNo);
	    groupView.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    groupView.getInputMap(JComponent.WHEN_FOCUSED)		   		.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");

	    groupView.getSelectionModel().addListSelectionListener(
	    		new ListSelectionListener() {					
	    			public void valueChanged(ListSelectionEvent event) {
	    				List selection = groupView.getSelectedRowObjects();
	    				CGroupRow row = null;
	    				if (selection.size() > 0)
	    				{
	    					row = (CGroupRow) selection.get(0);
	    					if (row != null)
	    					{
								clean(PortinvoiceTable);								
								loadportafolio(DocAction.STATUS_Drafted,m_C_BPartner_ID, row.getC_GroupDoc_ID());
	    					}
	    				}			  				

	    			}
	    		}
	    );

	    

	    lkaGroup = new LineKeyAdapter();
	    lkaGroup.setContext(m_frame, this, groupView, true /* m_showdialoginfo */, m_WindowNo, null, null, null);
	    //lkaGroup.funcCalculateTotalLines("calculateboe");
	    lkaGroup.setKeys(0, 0, 0, 0);

	    groupView.setContext(this);
	    groupView.funcCalculateTotalLines("calculategroup");
	    groupView.addKeyListener(lkaBoe);	    	    

	    portafoliomodel = new DefaultObjectViewModel(CPortafolioRow.getColumns(), null);
	    portafolioView = new ObjectView(portafoliomodel);
	    portafolioView.setColumnSelectionAllowed(false);
	    portafolioView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    portafolioView.configcontrols(m_WindowNo);
	    portafolioView.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    portafolioView.getInputMap(JComponent.WHEN_FOCUSED)		   		.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");

	    portafolioView.getSelectionModel().addListSelectionListener(
	    	new ListSelectionListener() {					
	    			public void valueChanged(ListSelectionEvent event) {
						List selection = portafolioView.getSelectedRowObjects();
						CPortafolioRow row = null;
						if (selection.size() > 0)
						{
							row = (CPortafolioRow) selection.get(0);
							if (row != null)
							{
								StringBuffer sql = new StringBuffer("SELECT i.documentno,i.C_Invoice_ID, i.dateinvoiced, bl.amount, ")
								.append("b.C_BOE_ID,b.dateboe,b.documentno AS BOEDocumentNo,bl.c_invoice_id > 0 as IsInvoice")
								.append(" FROM c_boeline bl")
								.append(" LEFT outer JOIN c_invoice i " )
								.append(" ON (bl.c_invoice_id = i.c_invoice_id)  LEFT outer JOIN c_boe b ")
								.append(" ON (b.c_boe_id = bl.ref_boe_id) WHERE bl.c_boe_id = ?");
								try {
									PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
									pstmt.setInt(1, row.getC_BOE_ID());
									ResultSet rs = pstmt.executeQuery();
									int rowX = 0;
									PortinvoiceTable.setRowCount(rowX);									
									while (rs.next())
									{
										PortinvoiceTable.setRowCount(rowX+1);
										Boolean IsInvoice = rs.getBoolean("IsInvoice");
										KeyNamePair pp2 = null;
										Timestamp DateDoc = null;
										if (IsInvoice)
										{
											 pp2 = new KeyNamePair(rs.getInt("C_Invoice_ID"), rs.getString("DocumentNo"));
											 DateDoc = rs.getTimestamp("DateInvoiced");
										}
										else
										{
											 pp2 = new KeyNamePair(rs.getInt("C_BOE_ID"), rs.getString("DocumentNo"));
											 DateDoc = rs.getTimestamp("DateBOE");
										}
										
										PortinvoiceTable.setValueAt(pp2,rowX,0);
										PortinvoiceTable.setValueAt(DateDoc,rowX,1);
										BigDecimal total = rs.getBigDecimal(4);
										if (total == null)		//	no conversion rate
											total = Env.ZERO;
										PortinvoiceTable.setValueAt(total,rowX,2);
										rowX++;
									}
									rs.close();
									pstmt.close();								
								}							
								catch (SQLException e)
								{
									log.log(Level.SEVERE, sql.toString(), e);
								}													
							}        	
						}
	    			}
	    	});
	    			
	    lkaPortafolio = new LineKeyAdapter();
	    lkaPortafolio.setContext(m_frame, this, portafolioView, true /* m_showdialoginfo */, m_WindowNo, null, null, null);
	    //lkaGroup.funcCalculateTotalLines("calculateboe");
	    lkaPortafolio.setKeys(0, 0, 0, 0);
	    
	    historymodel = new DefaultObjectViewModel(HistoryRow.getColumns(), null);
	    historyView = new ObjectView(historymodel);
	    historyView.setColumnSelectionAllowed(false);
	    historyView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    historyView.configcontrols(m_WindowNo);
	    historyView.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    historyView.getInputMap(JComponent.WHEN_FOCUSED)		   		.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    lkaHistory = new LineKeyAdapter();
	    lkaHistory.setContext(m_frame, this, historyView, true /* m_showdialoginfo */, m_WindowNo, null, null, null);
	    lkaHistory.funcValidationForDelLine("deleteHistoryGroupDoc");
	    //lkaGroup.funcCalculateTotalLines("calculateboe");
	    lkaHistory.setKeys(0, 0, 0, 0);
	    
		setPortinvoiceTable(true);
		
		mainPanel.setLayout(new BorderLayout());
		parameterPanel.setLayout(parameterLayout);
		
		NewBOEsPanel.setLayout(new BorderLayout());
		
		invoiceInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		invoiceInfo.setHorizontalTextPosition(SwingConstants.RIGHT);
		invoiceInfo.setText(".");
		
		boeInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		boeInfo.setHorizontalTextPosition(SwingConstants.RIGHT);
		boeInfo.setText(".");
		
		generateButton.setText(Msg.getMsg(Env.getCtx(), "Preview")+" "+Msg.translate(Env.getCtx(), "C_BOE_ID"));
		generateButton.addActionListener(this);
		generateButton.setEnabled(false);
		
		processButton.setText(Msg.getMsg(Env.getCtx(), "Process"));
		processButton.addActionListener(this);
		processButton.setEnabled(false);
					
		mainPanel.add(parameterPanel, BorderLayout.NORTH);

		parameterPanel.setLayout(new ALayout());
		parameterPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_BPartner_ID")), new ALayoutConstraint(0,0));
		parameterPanel.add(pickPartner, null);
		parameterPanel.add(lretention, null);
		parameterPanel.add(new JLabel(Msg.translate(Env.getCtx(), "GenDate")),  new ALayoutConstraint(1,0));		
		parameterPanel.add(pickGenDate, null);
		parameterPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_DocType_ID")),  new ALayoutConstraint(2,0));		
		parameterPanel.add(pickDocType, null);
		parameterPanel.add(new CLabel(Msg.translate(Env.getCtx(), "Rate")), null);
		parameterPanel.add(pickRate, null);		
		parameterPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID")+" "+Msg.translate(Env.getCtx(), "C_Currency_ID")), new ALayoutConstraint(3,0));
		parameterPanel.add(pickCurrencyInvoice, null);
		parameterPanel.add(new CLabel(Msg.translate(Env.getCtx(), "C_BOE_ID")+" "+Msg.translate(Env.getCtx(), "C_Currency_ID")), null);
		parameterPanel.add(pickCurrencyBOE, null);
		
		parameterPanel.add(BetweenofBoEField, new ALayoutConstraint(4,0));				
		parameterPanel.add(new JLabel(Msg.translate(Env.getCtx(), "Days")), null);						
		
		parameterPanel.add(new CLabel(Msg.translate(Env.getCtx(), "C_ConversionType_ID")), null);
		parameterPanel.add(pickConversionType, null);
		
		parameterPanel.setPreferredSize(new Dimension (200,170));
		
		// second tab
		
		BOEApplyPanel.setLayout(new BorderLayout());
		
		invoicePanel.setLayout(new BorderLayout());
		invoicePanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID")) , BorderLayout.NORTH);
		invoicePanel.add(invoiceScrollPane, BorderLayout.CENTER);
		invoicePanel.add(invoiceInfo, BorderLayout.SOUTH);		
		//invoiceScrollPane.getViewport().add(invoiceTable, null);
		invoiceScrollPane.getViewport().add(invoiceView, null);
			
		NewBOEsPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_BOE_ID")), BorderLayout.NORTH);
		NewBOEsPanel.add(BoeScrollPane, BorderLayout.CENTER);
		NewBOEsPanel.add(boeInfo, BorderLayout.SOUTH);		
		//BoeScrollPane.getViewport().add(boeTable, null);
		BoeScrollPane.getViewport().add(boeView, null);
//						
		infoPanel.setOrientation(JSplitPane.VERTICAL_SPLIT);
		infoPanel.setBorder(BorderFactory.createEtchedBorder());
		infoPanel.add(invoicePanel, JSplitPane.TOP);
		infoPanel.add(NewBOEsPanel, JSplitPane.BOTTOM);
		infoPanel.setContinuousLayout(true);
		infoPanel.setPreferredSize(new Dimension(800,300));
		infoPanel.setDividerLocation(130);
		
		mainPanel.add(infoPanel, BorderLayout.CENTER);
		
		mainPanel.add(WizPanel, BorderLayout.SOUTH);

		WizPanel.setLayout(new ALayout());
		WizPanel.add(NumberofBoEField, null);
		WizPanel.add(new CLabel(Msg.getMsg(Env.getCtx(), "NoOfBOE"), JLabel.LEFT), null);
		WizPanel.add(generateButton, null);
		WizPanel.add(processButton, null);

		PortfolioButton.setText("Procesar grupos seleccionados");
		PortfolioButton.setIcon(Env.getImageIcon("Process16.gif"));       //  16*1
		PortfolioButton.addActionListener(this);
		PortfolioButton.setEnabled(false);
		
		AccountButton.setText("Ver asiento contable");
		AccountButton.setIcon(Env.getImageIcon("InfoAccount16.gif"));
		AccountButton.addActionListener(this);
		AccountButton.setEnabled(false);
		

		BOEApplyPanel.add(rightPanel, BorderLayout.CENTER);
				
		groupDocContainer.setLayout(new BorderLayout());
		groupDocContainer.add(new CLabel(Msg.translate(Env.getCtx(), "C_GroupDoc_ID"),JLabel.LEFT),BorderLayout.NORTH);
		groupDocContainer.add(groupScrollPanel, BorderLayout.CENTER);
		groupDocContainer.add(PortfolioButton, BorderLayout.SOUTH);
				
		HistoryContainer.setLayout(new BorderLayout());
		HistoryContainer.add(new CLabel("Historico",JLabel.LEFT), BorderLayout.NORTH);
		HistoryContainer.add(historyScrollPanel, BorderLayout.CENTER);
		HistoryContainer.add(AccountButton, BorderLayout.SOUTH);
		leftPanel.setOrientation(JSplitPane.VERTICAL_SPLIT);
		leftPanel.setBorder(BorderFactory.createEtchedBorder());
		leftPanel.add(groupDocContainer, JSplitPane.TOP);
		//leftPanel.add(parameterPanel2, )
		leftPanel.add(PortfolioPanel, JSplitPane.BOTTOM);
		leftPanel.setContinuousLayout(true);
		leftPanel.setPreferredSize(new Dimension(300,300));
		leftPanel.setDividerLocation(150);
		
		rightPanel.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		rightPanel.setBorder(BorderFactory.createEtchedBorder());
		rightPanel.add(leftPanel, JSplitPane.LEFT);
		rightPanel.add(HistoryContainer, JSplitPane.RIGHT);
		rightPanel.setContinuousLayout(true);
		rightPanel.setPreferredSize(new Dimension(400,100));
		rightPanel.setDividerLocation(500);
	
		PortfolioPanel.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		PortfolioPanel.setBorder(BorderFactory.createEtchedBorder());
		PortfolioPanel.add(PortfolioBOEContainer, JSplitPane.LEFT);
		PortfolioPanel.add(PortfolioInvoiceContainer, JSplitPane.RIGHT);
		PortfolioPanel.setContinuousLayout(true);
		PortfolioPanel.setPreferredSize(new Dimension(400,300));
		PortfolioPanel.setDividerLocation(250);
		
		historyScrollPanel.getViewport().add(historyView, null);
		groupScrollPanel.getViewport().add(groupView, null);
		
		PortfolioBOEContainer.setLayout(new BorderLayout());
		PortfolioBOEContainer.add(new CLabel(Msg.translate(Env.getCtx(), "C_BOE_ID"),JLabel.LEFT),BorderLayout.NORTH);
		PortfolioBOEContainer.add(portfolioBOEScrollPane);

		PortfolioInvoiceContainer.setLayout(new BorderLayout());
		PortfolioInvoiceContainer.add(new CLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID"),JLabel.LEFT),BorderLayout.NORTH);
		PortfolioInvoiceContainer.add(portfolioInvoiceScrollPane);
		
							
		//portfolioBOEScrollPane.getViewport().add(PortfolioTable, null);
		portfolioBOEScrollPane.getViewport().add(portafolioView, null);
		portfolioInvoiceScrollPane.getViewport().add(PortinvoiceTable, null);
		
		tabbedPane.add(mainPanel,   Msg.getMsg(Env.getCtx(), "BillOfExchangeGeneration"));
		tabbedPane.add(BOEApplyPanel, Msg.getMsg(Env.getCtx(), "BillOfExchangeApply"));
		tabbedPane.addChangeListener(this);				
		return tabbedPane;
	}

	/**
	 *	Fill s_Currencies with EMU currencies
	 */
	private void loadCurrencies()
	{
		s_Currencies = new Hashtable<Integer,KeyNamePair>(12);	//	Currenly only 10+1
		String SQL = "SELECT C_Currency_ID, ISO_Code FROM C_Currency "
			+ "WHERE (IsEMUMember='Y' AND EMUEntryDate<CURRENT_TIMESTAMP) OR IsEuro='Y' "
			+ "ORDER BY 2";
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(SQL, null);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				s_Currencies.put(new Integer(id), new KeyNamePair(id, name));
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, SQL, e);
		}
	}	//	loadCurrencies
	
	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {
		
		String name = e.getPropertyName();
		Object value = e.getNewValue();		
		log.config(name + "=" + value);
		if (value == null)
			return;
		
		if (name.equals("I_C_Currency_ID"))
		{
			m_Rate = MConversionRate.getRate (getCurrencyBOE(), 
					(Integer) value, 
					(Timestamp) pickGenDate.getValue(), 
					getConversionType(),
					Env.getAD_Client_ID(Env.getCtx()), 
					Env.getAD_Org_ID(Env.getCtx()));
			pickRate.setValue(m_Rate);
			m_C_Currency_ID = (Integer) value;
			loadBPartner();
		}
		if (name.equals("B_C_Currency_ID"))
		{
			m_Rate = MConversionRate.getRate ((Integer) value, 
					getCurrencyInvoice(), 
					(Timestamp) pickGenDate.getValue(), 
					getConversionType(),
					Env.getAD_Client_ID(Env.getCtx()), 
					Env.getAD_Org_ID(Env.getCtx()));
			pickRate.setValue(m_Rate);			
			loadBPartner();
		}
		if (name.equals("C_DocType_ID"))
		{
			MDocType mt = MDocType.get(Env.getCtx(), (Integer) value);
			if (mt.getC_ConversionType_ID() > 0)
				pickConversionType.setValue(mt.getC_ConversionType_ID());
			if ( m_IsSOTrx != mt.isSOTrx())
			{
				m_IsSOTrx = mt.isSOTrx();
				loadBPartner();
				MBPartner partner = new MBPartner(Env.getCtx(), m_C_BPartner_ID, null );
				m_retention = partner.isRetention() && m_IsSOTrx;				
			}
		}
		if (name.equals("C_BPartner_ID"))
		{
			m_Rate = MConversionRate.getRate (getCurrencyBOE(), 
					getCurrencyInvoice(), 
					(Timestamp) pickGenDate.getValue(), 
					getConversionType(),
					Env.getAD_Client_ID(Env.getCtx()), 
					Env.getAD_Org_ID(Env.getCtx()));
			pickRate.setValue(m_Rate);
			pickPartner.setValue(value);			
			m_C_BPartner_ID = ((Integer)value).intValue();
			MBPartner partner = new MBPartner(Env.getCtx(), m_C_BPartner_ID, null );
			//m_IsSOTrx = partner.isCustomer();
			m_retention = partner.isRetention() && m_IsSOTrx;						
			loadBPartner();
		}
//		if (name.equals("IsSOTrx"))
//		{
//			loadBPartner();
//		}		
		if (name.equals("Date"))
		{
			m_Rate = MConversionRate.getRate (getCurrencyBOE(), 
					getCurrencyInvoice(), 
					(Timestamp) value, 
					getConversionType(),
					Env.getAD_Client_ID(Env.getCtx()), 
					Env.getAD_Org_ID(Env.getCtx()));
			pickRate.setValue(m_Rate);			
		}
		//else if (name.equals("fAmount"))
		//	calcTotalInvoiceTableSelected();
		lretention.setText(m_retention ? "Agente de retenci�n" : "");
	}
	
	private void loadGroup() {
		if (m_C_BPartner_ID == 0 || m_C_Currency_ID == 0 )
			return;
		StringBuffer sql = new StringBuffer("SELECT DocumentNo,C_GroupDoc_ID,Name  FROM C_GroupDoc WHERE C_BPartner_ID=? AND Processed='N'");
		try
		{
			IObjetViewColumn[] groupcols = CGroupRow.getColumns();	    
		    groupmodel = new DefaultObjectViewModel(groupcols, null);
		    groupView.setModel(groupmodel);									    
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, m_C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				CGroupRow row = new CGroupRow();
				row.setC_GroupDoc_ID(rs.getInt("C_GroupDoc_ID"));
				row.setDocumentNo(rs.getString("DocumentNo"));
				row.setName(rs.getString("Name"));
													
				DefaultObjectViewModel mModel= (DefaultObjectViewModel) groupView.getDataModel();
				Object SelectedRow = groupView.getSelectedRowObject(); 
				mModel.updateRow(SelectedRow,row);								
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}		
	}
	
	public void loadportafolio(String Status, int BPartner_ID, int GroupDoc_ID) 
	{
		StringBuffer sql = new StringBuffer("SELECT DueDate,DocumentNo,C_Currency_ID,DateBOE,GrandTotal FROM C_BOE ");
		sql.append(" WHERE DocStatus=? AND Processed='N' AND C_BPartner_ID=? ");
		if (GroupDoc_ID > 0)
			sql.append(" AND C_GroupDoc_ID=?");
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setString(1, Status);
			pstmt.setInt(2, BPartner_ID);
			if (GroupDoc_ID > 0)
				pstmt.setInt(3, GroupDoc_ID);
			ResultSet rs = pstmt.executeQuery();

			IObjetViewColumn[] portafoliocols = CPortafolioRow.getColumns();	    
			portafoliomodel = new DefaultObjectViewModel(portafoliocols, null);
			portafolioView.setModel(portafoliomodel);									    
			//int rowX = 0;
			//PortfolioTable.setRowCount(row);									
			while (rs.next())
			{
				BigDecimal open = rs.getBigDecimal("GrandTotal");
				if (open == null)		//	no conversion rate
					open = Env.ZERO;
				if (Env.ZERO.compareTo(open) != 0)
				{										
					CPortafolioRow prow = new CPortafolioRow();
					prow.setDueDate(rs.getTimestamp("DueDate"));
					prow.setDocumentNo(rs.getString("DocumentNo"));
					prow.setC_Currency_ID(rs.getInt("C_Currency_ID"));
					prow.setDateBOE(rs.getTimestamp("DateBOE"));
					prow.setOpenAmt(open);

					DefaultObjectViewModel mModel= (DefaultObjectViewModel) portafolioView.getDataModel();
					Object SelectedRow = portafolioView.getSelectedRowObject(); 
					mModel.updateRow(SelectedRow,prow);
				}
			}										
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
	}
	
	private void loadBPartner() {
		initialize();
		
	    invoicemodel = new DefaultObjectViewModel((IObjetViewColumn[]) VInvoiceRow.getColumns(), null);
	    invoiceView.setModel(invoicemodel);
		
	    boemodel = new DefaultObjectViewModel((IObjetViewColumn[]) CBOERow.getColumns(), null);
	    boeView.setModel(boemodel);
	    
		generateButton.setEnabled(false);
		processButton.setEnabled(false);
		PortfolioButton.setEnabled(false);
		AccountButton.setEnabled(false);
		m_C_BPartner_Location_ID = 0;
		m_RowActiveHistory = -1;
		log.config("BPartner=" + m_C_BPartner_ID + ", Cur=" + m_C_Currency_ID);
		if (m_C_BPartner_ID == 0 || m_C_Currency_ID == 0 )
			return;
		
		Integer C_CurrencyTo = (Integer) pickCurrencyBOE.getValue();
				
		StringBuffer sql = new StringBuffer("SELECT i.C_Invoice_ID,true AS isinvoice,");
		sql.append( "currencyConvert(invoiceOpen(C_Invoice_ID,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) AS ConvertedOpen " );  //  7   #2  Converted Open
		sql.append( " FROM C_Invoice_v i ");		//  corrected for CM/Split
		sql.append( " WHERE i.IsPaid='N' AND i.Processed='Y' ");
		sql.append(" AND i.C_Currency_ID=?");
		sql.append(" AND i.IsSOTrx=");
		sql.append(m_IsSOTrx ? "'Y'" : "'N'");
		sql.append(" AND i.C_BPartner_ID=?  AND NOT EXISTS (SELECT 1 FROM C_BOELine WHERE C_Invoice_ID = i.C_Invoice_ID AND processed='N') "); 
		sql.append(" UNION ");  
		sql.append(" SELECT b.C_BOE_ID,  false AS isinvoice,");
		sql.append(" CurrencyConvert(boeOpen(b.C_boe_ID),0,b.C_Currency_ID,?,b.StatusDate,b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID) AS ConvertedOpen");
		sql.append(" from C_BOE b "); 
		sql.append(" WHERE b.C_Currency_ID=? AND b.C_BPartner_ID=? AND b.docstatus = 'PD' AND b.IsSOTrx=");
		sql.append(m_IsSOTrx ? "'Y'" : "'N'");
		
		log.fine("InvSQL=" + sql.toString());
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, m_C_Currency_ID);
			pstmt.setInt(2, m_C_Currency_ID);
			pstmt.setInt(3, m_C_BPartner_ID);
			// boe
			pstmt.setInt(4, m_C_Currency_ID);
			pstmt.setInt(5, m_C_Currency_ID);
			pstmt.setInt(6, m_C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				BigDecimal open = rs.getBigDecimal("ConvertedOpen");
				if (open == null)		//	no conversion rate
					open = Env.ZERO;				
				if (Env.ZERO.compareTo(open) != 0)
				{
					VInvoiceRow row = new VInvoiceRow();					
					row.setDoc_ID(rs.getInt("C_Invoice_ID"), rs.getBoolean("IsInvoice"));
					m_C_BPartner_Location_ID = row.getC_BPartner_Location_ID();
					row.setConvertedTo(C_CurrencyTo);					
					DefaultObjectViewModel mModel= (DefaultObjectViewModel) invoiceView.getDataModel();
					Object SelectedRow = invoiceView.getSelectedRowObject(); 
					mModel.updateRow(SelectedRow,row);					
				}
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		//setHistoryTable(false);
		loadHistory(m_C_BPartner_ID);
		//clean(boeTable);
	}


	private void initialize() {
		m_BoeItems = Env.ONE ;
		m_BOEamount = Env.ZERO;
		m_Invoiceamount = Env.ZERO;
		m_BeetweenBoes = new Integer(1) ;		
	}

	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == NumberofBoEField)
		{
			m_BoeItems = new BigDecimal(NumberofBoEField.getValue().toString());
			return;
		}
		if (e.getSource() == BetweenofBoEField)
		{
			m_BeetweenBoes = ((Integer)BetweenofBoEField.getValue()).intValue();
			return;
		}

		if (tabbedPane.getSelectedIndex() == 1)  // segundo tab
		{
			loadGroup();			
		}
	}
	
	private boolean isCalloutActive() {
		return m_callout;
	}


	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();
		if (c==generateButton)
		{			
			if ( processButton.isEnabled() )
				processButton.setEnabled(false);
			if (validateRulesGeneral())
			{
				createBOES();
//		    	DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
//		    	BigDecimal totalBoe = calcTotalBOETable();
//		    	boeInfo.setText( Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(totalBoe) + " " + Msg.getMsg(Env.getCtx(), "Diff") + "  " + format.format(totalBoe.subtract(m_BOEamount)) + " ");		        
				processButton.setEnabled(true);
			}
			else
				ADialog.error(0, this, getTextMsg());
		}
		if (c==processButton)
		{
				if (buildGroupDoc())
					ADialog.info(0, this, "ProcessOK");
				else
					ADialog.error(0, this, getTextMsg());
		}
		if (c==PortfolioButton)
		{
			if (ADialog.ask(m_WindowNo, this, "StartProcess?"))
			{
				if (ProcessPortfolio())
					ADialog.info(0,this, "ProcessOK");
				else
					ADialog.error(0, this, getTextMsg());
			}
		}
		if (c==AccountButton)
		{
			if (m_RowActiveHistory > -1)
			{
				List select = historyView.getSelectedRowObjects();
				HistoryRow row = (HistoryRow) select.get(0);
				if (row != null)
				{
					MGroupDoc doc = new MGroupDoc(Env.getCtx(), row.getC_GroupDoc(), null);
					MAllocationHdr alloc = new MAllocationHdr(Env.getCtx(), doc.getC_AllocationHdr_ID(), null);
					if (alloc.isPosted())
					{
						MQuery query = new MQuery(MAllocationHdr.Table_Name);
						query.addRestriction("DocumentNo", MQuery.EQUAL,alloc.getDocumentNo());
						new AReport (MAllocationHdr.Table_ID, null , query);
					}
					else
					{
						ADialog.info(m_WindowNo, null, "este grupo no ha sido contabilizado");
					}					
				}
			}
		}
	}

	public String getTextMsg() 
	{
		return m_TextMsg;
	}
	
	
	public void setTextMsg (String TextMsg)
	{
		if (TextMsg == null || TextMsg.length() == 0)
			return;
		String oldText = getTextMsg();
		if (oldText == null || oldText.length() == 0)
			m_TextMsg = Util.trimSize("Error" + "\n - " + TextMsg,1000);
		else if (TextMsg != null && TextMsg.length() > 0)
			m_TextMsg = Util.trimSize(oldText + "\n - " + TextMsg,1000);
	}	//	setTextMsg	
	
	private boolean validateRulesGeneral() {
		m_TextMsg ="";
		String select = Msg.translate(Env.getCtx(),"Select") + " "; 
		// chequeamos que existe documento. y moneda seleccionada
		if ( pickDocType.getValue() == null )
			setTextMsg(select + Msg.translate(Env.getCtx(),"C_DocType_ID"));
		if ( pickCurrencyInvoice.getValue() == null )		
			setTextMsg(select + Msg.translate(Env.getCtx(), "C_Currency_ID"));
		if ( pickCurrencyBOE.getValue() == null )		
			setTextMsg(select + Msg.translate(Env.getCtx(), "C_Currency_ID"));
		if ( getRate().equals(Env.ZERO) )
			setTextMsg(select + Msg.translate(Env.getCtx(), "Rate"));
		
		if (getTextMsg().length()==0)
		{
		    //m_Invoiceamount = calcTotalInvoiceTableSelected();
			DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
			invoiceInfo.setText( Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(m_Invoiceamount) + " ");		
			int precision = MCurrency.getStdPrecision(Env.getCtx(), getCurrencyBOE());
			m_BOEamount = m_Invoiceamount.multiply(getRate()).setScale(precision, BigDecimal.ROUND_HALF_UP) ;
			return true;
		}
		return false;
	}

	private boolean ProcessPortfolio() {		
		for (int i=0; i <  groupmodel.getRowCount() ; i++)
		{
			CGroupRow row = (CGroupRow) groupView.getDataModel().getRowObject(i);
			if (row.getSelect())
			{
				try {
					Trx m_trx = Trx.get(Trx.createTrxName("PortfolioProcess"), true);
					String trxName = m_trx.getTrxName();			

					MGroupDoc groupdoc = new MGroupDoc(Env.getCtx(), row.getC_GroupDoc_ID() , trxName);

					MAllocationHdr alloc = new MAllocationHdr(Env.getCtx(),
							false /* is manual */, 
							Env.getContextAsDate(Env.getCtx(), "#Date"), 
							getCurrencyBOE(),
							Msg.translate(Env.getCtx(), "C_GroupDoc_ID") + ": " + groupdoc.getC_GroupDoc_ID(), 
							trxName);
					alloc.setAD_Org_ID(groupdoc.getAD_Org_ID());
					alloc.setIsExchange(true);
					if (!alloc.save(trxName))
						throw new XendraException("no se grabo allocation");
					
					groupdoc.setC_AllocationHdr_ID(alloc.getC_AllocationHdr_ID());
					groupdoc.save(trxName);


					MBOE[] boes = MBOE.getGroup(row.getC_GroupDoc_ID(), trxName);

					for (int j = 0; j < boes.length ; j++) 
					{
						MBOE boe = boes[j];
						boolean sucessfully = false;
						try {
							sucessfully  = boe.processIt(DocAction.ACTION_Portfolio);
						} catch (Exception e) {
							e.printStackTrace();
						}
						if (!sucessfully || !boe.save())					
							throw new XendraException("no se grabo allocation");					}

					MRetention[] retentions = MRetention.getGroup(row.getC_GroupDoc_ID(), trxName);

					for (int j = 0; j < retentions.length ; j++) 
					{
						MRetention retention = retentions[j];
						boolean sucessfully = false;
						try {
							sucessfully  = retention.processIt(DocAction.ACTION_ToCollect);
						} catch (Exception e) {
							e.printStackTrace();
						}
						if (!sucessfully || !retention.save())					
							throw new XendraException("no se grabo allocation");					}

					alloc = new MAllocationHdr(Env.getCtx(), groupdoc.getC_AllocationHdr_ID(), trxName);
					if (alloc.processIt(DocAction.ACTION_Complete))
					{
						if (!alloc.save(trxName))
							throw new XendraException("no se grabo allocation");	
					}
					else
						throw new XendraException(alloc.getProcessMsg());
					
					groupdoc.setProcessed(true);					
					if (!groupdoc.save())
						throw new XendraException("no se grabo allocation");
					if (!m_trx.commit()) 
						throw new XendraException("no se grabo allocation");											
					m_trx.close();
					HistoryRow hrow = new HistoryRow();
					hrow.setC_GroupDoc(row.getC_GroupDoc_ID());
					hrow.setDocumentNo(alloc.getDocumentNo());
					hrow.setTrxDate(alloc.getDateTrx());
					hrow.setDateAcct(alloc.getDateAcct());

					DefaultObjectViewModel mModel= (DefaultObjectViewModel) historyView.getDataModel();
					Object SelectedRow = historyView.getSelectedRowObject(); 
					mModel.updateRow(SelectedRow,hrow);
				} catch (Exception ex) {
					m_trx.rollback();
					ADialog.error(0, this, ex.getMessage());
					ex.printStackTrace();
				}
				finally {
					m_trx.close();
					m_trx = null;
				}					
				//groupmodel.removeRow(i);
			}
		}
		// eliminamos el consolidado de la grilla.
		cleanlines(historyView);
		return true;
	}

	public void cleanlines(ObjectView view)
	{
		view.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		view.selectAll();
        List selection = view.getSelectedRowObjects();
        view.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ((DefaultObjectViewModel) view.getDataModel()).removeRows(selection);        
	}
	
	private void clean(MiniTable table, int pos) {
		DefaultTableModel model =  (DefaultTableModel) table.getModel();
		int numRows = model.getRowCount();
		if (pos == 0) {
			while (numRows > 0 )
			{
				model.removeRow(0);
				numRows = model.getRowCount();
			}
		}
		else
		{
			if (pos <= numRows)
				model.removeRow(pos);
		}
	}
	private void clean(MiniTable table) {
		clean(table, 0);
	}
	
	public void calculategroup()
	{
		List selection = groupView.getSelectedRowObjects();
		CGroupRow row =  (CGroupRow) selection.get(0);
		if (PortfolioButton.isEnabled())
			PortfolioButton.setEnabled(false);
		if (row.getSelect())
		{
			PortfolioButton.setEnabled(true);
		}
	}
	
	public void calculateboe()
	{
		if ( boeView.getRowCount() <= 0)
			return;
		
		//BigDecimal Total = Env.ZERO;
		m_BOEamount = Env.ZERO;
		for (int j=0; j <  boeView.getRowCount() ; j++)
		{
			CBOERow brow = (CBOERow) boeView.getDataModel().getRowObject(j);
			if (brow.getSelect())
			{
				BigDecimal line = brow.getAmount();
				if (line != null)
					m_BOEamount = m_BOEamount.add(line);														
			}			
		}
		int precision = MCurrency.getStdPrecision(Env.getCtx(), (Integer) pickCurrencyBOE.getValue());
		m_BOEamount = m_BOEamount.setScale(precision, BigDecimal.ROUND_HALF_UP);
    	DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
    	boeInfo.setText( Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(m_BOEamount) + " " + Msg.getMsg(Env.getCtx(), "Diff") + "  " + format.format(m_BOEamount.subtract(m_Invoiceamount.multiply(getRate()).setScale(precision, BigDecimal.ROUND_HALF_UP))) + " ");		        		
		
	}
	public void calculateinvoice()
	{
		if ( invoiceView.getRowCount() <= 0 )
			return;
		
		if (generateButton.isEnabled())
			generateButton.setEnabled(false);

				
		//BigDecimal totalgroup = Env.ZERO;
		m_Invoiceamount = Env.ZERO;
		//BigDecimal totalDoc = Env.ZERO;
		//BigDecimal totalOperation = Env.ZERO;
		BigDecimal totalOperationConverted = Env.ZERO;
		BigDecimal totaldocConverted = Env.ZERO;
		
		for (int j=0; j <  invoiceView.getRowCount() ; j++)
		{
			VInvoiceRow irow = (VInvoiceRow) invoiceView.getDataModel().getRowObject(j);
			if (irow.getSelect())
			{
				//Timestamp ts = irow.getTrxDate();
				//BigDecimal group = (BigDecimal) irow.getApply();
				if (irow.getApply() != null)
				{
					//totalgroup = totalgroup.add(group);
					m_Invoiceamount = m_Invoiceamount.add(irow.getApply());
					//totalDoc = group;					
					//totalOperation = irow.getAmount();
					totalOperationConverted = totalOperationConverted.add(irow.ConvertedAmount(irow.getAmount()));
					totaldocConverted = totalOperationConverted.add(irow.ConvertedAmount(irow.getApply()));
					if (!generateButton.isEnabled())
						generateButton.setEnabled(true);
				}
				
				//m_noInvoices++;
			}
		}		
		if (m_retention)
		{
			for (int j=0; j <  invoiceView.getRowCount() ; j++)
			{
				VInvoiceRow irow = (VInvoiceRow) invoiceView.getDataModel().getRowObject(j);
				if (irow.getSelect())
				{
					//totalDoc = (BigDecimal) irow.getApply();
		    		if (retention.isactive(totaldocConverted) || retention.isactive(totalOperationConverted) )
		    		{						
		    			//BigDecimal retAmt = retention.calculateRetention(totalDoc , m_C_Currency_ID);
		    			BigDecimal retAmt = retention.calculateRetention(irow.getApply(), m_C_Currency_ID);
		    			if ( retAmt != null  )
		    			{
		    				irow.setRetention(retAmt);
		    				m_Invoiceamount = m_Invoiceamount.subtract(retAmt);
		    			}
		    		}
				}			
			}			
		}		
	    //m_Invoiceamount = calcTotalInvoiceTableSelected();
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		invoiceInfo.setText( Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(m_Invoiceamount) + " ");		
		int precision = MCurrency.getStdPrecision(Env.getCtx(), (Integer) pickCurrencyBOE.getValue());
		m_BOEamount = m_Invoiceamount.multiply(getRate()).setScale(precision, BigDecimal.ROUND_HALF_UP) ;
	}	

	private void setCalloutActive(boolean b) {
		m_callout = b;
	}

	private boolean buildGroupDoc() {
		//
		if (!validateRulesGeneral())
			return false;
		if (ADialog.ask(m_WindowNo, this, "StartProcess?"))
		{		
		  Trx m_trx = Trx.get(Trx.createTrxName("BoeGenProcess"), true);
		  String trxName = m_trx.getTrxName();			
		  try 
		  {
			MGroupDoc groupdoc = new MGroupDoc(Env.getCtx(), 0, trxName);
			groupdoc.setName(new Date().toString());
			groupdoc.setC_BPartner_ID(m_C_BPartner_ID);
			if (!groupdoc.save(trxName))
			{
				m_trx.rollback();
				m_trx.close();					
				return false;
			}
			if (!getRate().equals(Env.ZERO))
			{				
				MBOEConversionRate boeconversionrate = new MBOEConversionRate(Env.getCtx(), 0, trxName);
				boeconversionrate.setC_GroupDoc_ID(groupdoc.getC_GroupDoc_ID());
				boeconversionrate.setC_Currency_ID(getCurrencyBOE());
				boeconversionrate.setC_Currency_ID_To(getCurrencyInvoice());				
				boeconversionrate.setValidFrom((Timestamp) pickGenDate.getValue());
				boeconversionrate.setValidTo((Timestamp) pickGenDate.getValue());
				if (getRate().compareTo(Env.ONE) > 0)
				{
					double dd = 1 / getRate().doubleValue();							
					boeconversionrate.setRate(new BigDecimal(dd));
				}
				else
					boeconversionrate.setRate(getRate());
				if (!boeconversionrate.save(trxName))
				{
					m_trx.rollback();
					m_trx.close();					
					return false;									
				}
			}
			else
			{
				m_trx.rollback();
				m_trx.close();					
				return false;				
			}
			//BigDecimal total = calcTotalBOETable();
			for (int j=0; j < m_BoeItems.intValue(); j++)
			{
				MBOE boe = new MBOE(Env.getCtx(), 0, trxName);						
				boe.setC_BPartner_ID(m_C_BPartner_ID);
				boe.setC_GroupDoc_ID(groupdoc.getC_GroupDoc_ID());
				boe.setC_DocType_ID((Integer) pickDocType.getValue());
				boe.setC_DocTypeTarget_ID((Integer) pickDocType.getValue());
				boe.setDocAction(DocAction.ACTION_Portfolio);
				boe.setC_BPartner_Location_ID(m_C_BPartner_Location_ID);
				boe.setC_Currency_ID(getCurrencyBOE());
				boe.setDateBOE((Timestamp) pickGenDate.getValue());
				boe.setStatusDate((Timestamp) pickGenDate.getValue());
				boe.setIsSOTrx(m_IsSOTrx);
				
				CBOERow boerow = (CBOERow) boeView.getDataModel().getRowObject(j);
				//String DocumentNo = (String) boeTable.getValueAt(j, BOETableColDoc);
				String DocumentNo = boerow.getDocumentNo();
				if (DocumentNo != null)
					boe.setDocumentNo(DocumentNo);
				//boe.setGrandTotal((BigDecimal) boeTable.getValueAt(j, BOETableColAmount));
				boe.setGrandTotal(boerow.getAmount());
				//boe.setDueDate((Timestamp) boeTable.getValueAt(j, BOETableColDueDate));
				boe.setDueDate(boerow.getDueDate());
				boe.setC_ConversionType_ID(getConversionType());
				if (!boe.save())
				{
					m_trx.rollback();
					m_trx.close();					
					return false;
				}
				for (int k=0; k < invoiceView.getRowCount(); k++)
				{
					VInvoiceRow irow = (VInvoiceRow) invoiceView.getDataModel().getRowObject(k);
					if (irow.getSelect())
					{
						//boolean IsInvoice = (Boolean) invoiceTable.getValueAt(k, 10);
						boolean IsInvoice = irow.getIsInvoice();
						
						//KeyNamePair pp = (KeyNamePair)invoiceTable.getValueAt(k, 4);    //  Value
						
						// Invoice variables
						// xapiens :
						// el boe amount es variable, por tanto debemos "ajustar" 
						// la proporcion del mismo sobre la factura.
						// factor = boe amount / total
						// boeline = invoice x factor
						//int C_Invoice_ID = pp.getKey();
						//BigDecimal factor = boe.getGrandTotal().divide(total, 10 , BigDecimal.ROUND_HALF_UP);
						BigDecimal factor = boe.getGrandTotal().divide(m_BOEamount, 10, BigDecimal.ROUND_HALF_UP);
						//BigDecimal totalInvoice   = (BigDecimal)invoiceTable.getValueAt(k, Applied); // Converted Open
						BigDecimal totalInvoice = irow.getApply();
						//BigDecimal totalRetention = (BigDecimal)invoiceTable.getValueAt(k, InvTableColRetention); // Converted Open
						// donde se pone el valor de converted amount ????????
						BigDecimal totalRetention = irow.getConvertedAmount();
						totalInvoice = totalInvoice.subtract(totalRetention);
						totalInvoice = totalInvoice.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_UP);
						if (!getCurrencyBOE().equals(getCurrencyInvoice()))
							totalInvoice = totalInvoice.multiply(getRate());
						MBOELine boeline = new MBOELine(boe);		
						if (IsInvoice) 
							boeline.setC_Invoice_ID(irow.getC_Invoice_ID());
						else
						{
							boeline.setC_Invoice_ID(0);
							boeline.setRef_BOE_ID(irow.getC_Invoice_ID());
						}
						boeline.setC_GroupDoc_ID(groupdoc.getC_GroupDoc_ID());
						boeline.setAmount(totalInvoice);																		
						boeline.save();					
					}
				}
			}
			if (!m_trx.commit()) {
				m_trx.rollback();
				m_trx.close();
				return false;
			}							
			log.log(Level.FINE, "BOE generation saving finish");
			// create retentions
			for (int k=0; k < invoiceView.getRowCount(); k++)
			{
				VInvoiceRow irow = (VInvoiceRow) invoiceView.getDataModel().getRowObject(k);
				//BigDecimal totalApply = (BigDecimal) invoiceTable.getValueAt(k, Applied);
				BigDecimal totalApply = irow.getApply();
				//BigDecimal totalRetention = (BigDecimal) invoiceTable.getValueAt(k, InvTableColRetention);
				BigDecimal totalRetention = irow.getRetention();
				if ( totalRetention.compareTo(Env.ZERO) != 0 )
				{
					//KeyNamePair pp = (KeyNamePair)invoiceTable.getValueAt(k, 4);    //  Value
					//int C_Invoice_ID = pp.getKey();
					MInvoice invoice = irow.getInvoice();					
					//MInvoice invoice = MInvoice.get(Env.getCtx(), C_Invoice_ID);
					invoice.setC_GroupDoc_ID(groupdoc.getC_GroupDoc_ID());						
					invoice.save();
					
					MRetention retention = new MRetention(Env.getCtx(), 0, trxName);
					retention.setClientOrg(invoice.getAD_Client_ID(), invoice.getAD_Org_ID());
					retention.setC_Invoice_ID(invoice.getC_Invoice_ID());
					retention.setDateRetention(invoice.getDateInvoiced());
					retention.setStatusDate((Timestamp) pickGenDate.getValue());
					retention.setC_BPartner_ID(invoice.getC_BPartner_ID());
					retention.setC_GroupDoc_ID(groupdoc.getC_GroupDoc_ID());
					retention.setC_Currency_ID(invoice.getC_Currency_ID());					
					retention.setDocAction(DocAction.ACTION_ToCollect);
					retention.setTaxAmt(totalRetention);
					retention.setTaxBaseAmt(totalApply);
					retention.save();
					if (!m_trx.commit()) {
						m_trx.rollback();
						m_trx.close();
						return false;
					}													
				}
			}
			// update the invoiceTable removing the process invoices
			DefaultTableModel invoicemodel =  (DefaultTableModel)invoiceView.getModel();
			int m = 0;
			while ( m < invoiceView.getRowCount() )
			{
				VInvoiceRow irow = (VInvoiceRow) invoiceView.getDataModel().getRowObject(m);
				if (irow.getSelect())
				{
				//if ((((Boolean)invoiceTable.getValueAt(m, 0)).booleanValue()))	{
					//invoicemodel.removeRow(m);
					( (DefaultObjectViewModel) invoiceView.getDataModel()).removeRow(irow);
					m=0;
				}	
				else
					m++;
			}
			m_trx.close();
			//clean(boeTable);
			generateButton.setEnabled(false);
			processButton.setEnabled(false);			
			return true;
		  }
   		  catch (Exception e) {
			m_trx.rollback();
			m_trx.close();
			log.log(Level.SEVERE, "Exception while in process: " + e.toString());
			return false;  
		  }   		  
		}
		return false;
	}

	private Integer getCurrencyInvoice()
	{
		return (Integer) pickCurrencyInvoice.getValue();
	}
	
	private Integer getCurrencyBOE()
	{
		return (Integer) pickCurrencyBOE.getValue();
	}

	private Integer getConversionType() {
		int rate = 0;
		if (pickConversionType.getValue()!= null)
			rate = (Integer) pickConversionType.getValue();
		return rate;
	}
	
	private BigDecimal getRate() {
		BigDecimal rate = Env.ZERO;
		if (!pickCurrencyInvoice.getValue().equals(pickCurrencyBOE.getValue()))
		{
			if ( pickRate.getValue()!=null )
			{
				rate = (BigDecimal) pickRate.getValue();
				if ( pickCurrencyInvoice.getValue().equals(m_Acct_C_Currency_ID))
				{
					double dd = 1 / rate.doubleValue();							
					rate = new BigDecimal(dd);
				}
			}				
		}
		else if (pickCurrencyInvoice.getValue().equals(pickCurrencyBOE.getValue()))
		{
			rate = Env.ONE;
		}
		return rate;
	}


	private void createBOES()
	{		
	    boemodel = new DefaultObjectViewModel((IObjetViewColumn[]) CBOERow.getColumns(), null);
	    boeView.setModel(boemodel);
		
		StringBuffer sql = new StringBuffer(
				" SELECT * from boewiz(?,?,?,?,?,?);");
		
			log.fine(sql.toString());
			int rowid = 1;
			try			
			{
				PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
				pstmt.setBigDecimal(1, m_BoeItems);
				pstmt.setBigDecimal(2, m_BOEamount);
				pstmt.setBigDecimal(3, m_Invoiceamount);
				pstmt.setBigDecimal(4, getRate());
				pstmt.setTimestamp (5, (Timestamp) pickGenDate.getValue());				
				pstmt.setInt(6, m_BeetweenBoes);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next())
				{
					CBOERow row = new CBOERow();			
					Timestamp trxdate = rs.getTimestamp(2); 
					BigDecimal amount = rs.getBigDecimal(3);
					Timestamp duedate = rs.getTimestamp(4);
					
					row.setTrxDate(trxdate);
					row.setAmount(amount);
					row.setDueDays(m_BeetweenBoes * rowid);
					row.setDueDate(duedate);
					
					DefaultObjectViewModel mModel= (DefaultObjectViewModel) boeView.getDataModel();
					Object SelectedRow = boeView.getSelectedRowObject(); 
					mModel.updateRow(SelectedRow,row);					
															
					//  prepare next
					rowid++;
				}
				rs.close();
				pstmt.close();
			}
			catch (SQLException e)
			{
				log.log(Level.SEVERE, sql.toString(), e);
			}
			//boeView.autoSize();
	}

	private void loadHistory(int CBPartner_ID)
	{
		if (CBPartner_ID == 0)
			return;
	    historymodel = new DefaultObjectViewModel((IObjetViewColumn[]) HistoryRow.getColumns(), null);
	    historyView.setModel(historymodel);
	    
		StringBuffer sql = new StringBuffer("SELECT b.C_AllocationHdr_ID, b.Name,b.C_GroupDoc_ID, b.DocumentNo, a.DocumentNo as allocDocumentNo, a.DateTrx, a.Dateacct  "
				+ " FROM C_GroupDoc b JOIN c_allocationhdr a on b.c_allocationhdr_id = a.c_allocationhdr_id "
				+ " WHERE b.C_BPartner_ID=? AND b.Processed='Y'");
		
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, CBPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				
				HistoryRow row = new HistoryRow();
				row.setC_GroupDoc(rs.getInt("C_GroupDoc_ID"));
				row.setC_AllocationHdr_ID(rs.getInt("C_AllocationHDR_ID"));
				row.setDocumentNo(rs.getString("allocDocumentNo"));
				row.setDateAcct(rs.getTimestamp("DateAcct"));
				row.setTrxDate(rs.getTimestamp("DateTrx"));
				
				DefaultObjectViewModel mModel= (DefaultObjectViewModel) historyView.getDataModel();
				Object SelectedRow = historyView.getSelectedRowObject(); 
				mModel.updateRow(SelectedRow,row);				
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
	}

	public void deleteHistoryGroupDoc() {
		try {
    		m_trx = Trx.get(Trx.createTrxName("BOEProcess"), true);
    		m_trxName = m_trx.getTrxName();
    		List sel = this.historyView.getSelectedRowObjects();
    		if (sel.get(0) != null)
    		{
    			HistoryRow row = (HistoryRow) sel.get(0);
        		MGroupDoc gdoc = new MGroupDoc(Env.getCtx(), row.getC_GroupDoc(), m_trxName);
        		MAllocationHdr hdr = new MAllocationHdr(Env.getCtx(), gdoc.getC_AllocationHdr_ID(), m_trxName); 
        		if (gdoc == null || hdr == null)		            		
        			throw new XendraException("Asignación creada invalida");
        		
        		String whereClause = "C_GroupDoc_ID = ".concat(String.valueOf(row.getC_GroupDoc()));
        		
        		List<MBOE> boes = new Query(Env.getCtx(), MBOE.Table_Name , whereClause, m_trxName)
    												.list();
        		for (MBOE boe : boes)
        		{
        			if (!boe.delete(true))
        				throw new XendraException("no se pudo eliminar boe");
        		
        			if (hdr.delete(true) && gdoc.delete(true))
        			{
        				((DefaultObjectViewModel)historyView.getDataModel()).removeRow(row);
        				m_trx.commit(true);
        				ADialog.info(0, this, "Eliminaci�n exitosa");        				
        			}
        			else
        				throw new XendraException("no se pudo eliminar");
        		}        			
    		}
    		
		} catch (Exception ex) {
			m_trx.rollback();
			ADialog.error(0, this, ex.getMessage());
			ex.printStackTrace();
		}
		finally {
			m_trx.close();
			m_trx = null;
		}					
	}
		
	void setPortinvoiceTable(boolean initialize)
	{
		if (initialize)
		{
			//  Header Info
			PortinvoiceTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
			PortinvoiceTable.addColumn(Msg.translate(Env.getCtx(), "DateInvoiced"));							
			PortinvoiceTable.addColumn(Msg.getMsg(Env.getCtx(), "OpenAmt"));
			int i = 0;
			PortinvoiceTable.setColumnClass(i++, String.class, true);           //  2-Document No
			PortinvoiceTable.setColumnClass(i++, Timestamp.class, true);        //  1-TrxDate							
			PortinvoiceTable.setColumnClass(i++, BigDecimal.class, true);       //  6-ConvAmt Open
			PortinvoiceTable.autoSize();
			
			DefaultTableModel model =  (DefaultTableModel)PortinvoiceTable.getModel();
			PortinvoiceTable.setModel(model);
		}
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					org.compiere.Xendra.startup(true);
					Splash splash = Splash.getSplash();
					ALogin login = new ALogin(splash);
					if (!login.initLogin())		//	no automatic login
					{
						//	Center the window
						try
						{
							AEnv.showCenterScreen(login);	//	HTML load errors
						}
						catch (Exception ex)
						{
							log.severe(ex.toString());
						}
						if (!login.isConnected() || !login.isOKpressed())
							AEnv.exit(1);
					}										
					CBOEWizard frame = new CBOEWizard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	public static void main(String[] args)
//	{		
//		org.compiere.Xendra.startupEnvironment(true);
//		AMenu menu = new AMenu();
//		FormFrame ff = new FormFrame();
//		ff.openForm("org.xendra.apps.form.CBOEWizard","name");
//		ff.pack();
//		AEnv.addToWindowManager(ff);
//		AEnv.showCenterScreen(ff);		
//	}	//	main

	public boolean candispose() {
		return true;
	}
	
}

