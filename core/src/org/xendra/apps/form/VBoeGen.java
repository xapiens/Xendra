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
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
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
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.compiere.apps.ADialog;
import org.compiere.apps.ALayout;
import org.compiere.apps.ALayoutConstraint;
import org.compiere.apps.StatusBar;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.grid.ed.VDate;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.compiere.minigrid.IDColumn;
import org.compiere.minigrid.MiniTable;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MBOE;
import org.compiere.model.MBOEConversionRate;
import org.compiere.model.MBOELine;
import org.compiere.model.MBPartner;
import org.compiere.model.MClient;
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
import org.compiere.model.persistence.X_M_ProductionLine;
import org.compiere.plaf.CompiereColor;
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
import org.compiere.util.MSort;
import org.compiere.util.Msg;
import org.compiere.util.Trx;
import org.compiere.util.Util;

/**
 *	Generate Bill of Exchange from Invoices pendings.
 *
 * 	@author 	xapiens
 * 	@version 	$Id: 2
 */
public class VBoeGen extends CFrame implements FormPanel, ActionListener, VetoableChangeListener, ChangeListener, TableModelListener
{
	
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
	private int m_C_GroupDoc_ID = 0;
	private boolean m_IsSOTrx = true;
	private boolean m_retention = false;
	private int m_C_BPartner_Location_ID = 0;
	private CTabbedPane tabbedPane = new CTabbedPane();
	private StatusBar statusBar = new StatusBar();
	private VLookup pickCurrencyInvoice;
	private VLookup pickConversionType;
	private VLookup pickDocType;
	private VDate pickGenDate = new VDate();
        private VDate pickDateAllocation = new VDate();
	
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
	private MiniTable invoiceTable = new MiniTable();	
	private MiniTable PortfolioTable = new MiniTable();
	private MiniTable PortinvoiceTable = new MiniTable();
	private MiniTable groupTable = new MiniTable();
	private MiniTable HistoryTable = new MiniTable();
	private JLabel invoiceInfo = new JLabel();
	private MiniTable boeTable = new MiniTable();	
	private JLabel boeInfo = new JLabel();

	private BigDecimal m_BoeItems = Env.ONE ;
	private BigDecimal m_BOEamount = Env.ZERO;
	private BigDecimal m_Invoiceamount = Env.ZERO;
	private Integer m_BeetweenBoes = new Integer(1) ;
	private String m_trxName;
	private Trx m_trx;
	private VLookup pickCurrencyBOE;
	private VNumber pickRate = new VNumber("pickRate", false, false, true, DisplayType.Amount, Msg.translate(Env.getCtx(), "MultiRate"));
	private int counterInvoiceSelected = 0;
	private int InvoiceAmount = 6;
	private int InvoiceAmountConverted = 7;
	private int Opened = 8;
	private int Applied = 9;
	private String m_TextMsg;
	private int BOETableColGenDate = 1;
	private int BOETableColDoc     = 2;
	private int BOETableColAmount  = 3;
	private int BOETableColDueDays = 4;
	private int BOETableColDueDate = 5;
	private int InvTableColisInvoice = 10;
	private int InvTableColRetention = 11;
	private boolean m_callout;
	private static Hashtable<Integer,KeyNamePair> s_Currencies = null;	//	EMU Currencies
	private MRetention retention = new MRetention(Env.getCtx(), 0, null);
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
			dynInit();
			jbInit();
			calcTotalInvoiceTableSelected();
			frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
	}

	private void dynInit() {		
		//
		//
                pickDateAllocation.setValue(new Date());

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
	}
	
	private void jbInit() {
		CompiereColor.setBackground(this);
//		//
		
		setGeneratedBoesTable(true);
		setInvoiceTable(true);
		setBOEPortafolio(true);
		setGroupTable(true);
		setHistoryTable(true);
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
		
		//BOEHistory.setLayout(new BorderLayout());
		invoicePanel.setLayout(new BorderLayout());
		invoicePanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID")) , BorderLayout.NORTH);
		invoicePanel.add(invoiceScrollPane, BorderLayout.CENTER);
		invoicePanel.add(invoiceInfo, BorderLayout.SOUTH);		
		invoiceScrollPane.getViewport().add(invoiceTable, null);
			
		NewBOEsPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_BOE_ID")), BorderLayout.NORTH);
		NewBOEsPanel.add(BoeScrollPane, BorderLayout.CENTER);
		NewBOEsPanel.add(boeInfo, BorderLayout.SOUTH);		
		BoeScrollPane.getViewport().add(boeTable, null);
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

                CPanel portfoliogroup = new CPanel();
                portfoliogroup.setLayout(new BorderLayout());
                portfoliogroup.add(PortfolioButton, BorderLayout.WEST);
                portfoliogroup.add(new JLabel("Fecha de Canje:", JLabel.RIGHT), BorderLayout.CENTER);
                portfoliogroup.add(pickDateAllocation, BorderLayout.EAST);

		PortfolioButton.setText("Procesar grupos seleccionados");
		PortfolioButton.setIcon(Env.getImageIcon("Process16.gif"));       //  16*1
		PortfolioButton.addActionListener(this);
		PortfolioButton.setEnabled(false);

                pickDateAllocation.setEnabled(false);
		
		AccountButton.setText("Ver asiento contable");
		AccountButton.setIcon(Env.getImageIcon("InfoAccount16.gif"));
		AccountButton.addActionListener(this);
		AccountButton.setEnabled(false);
		

		BOEApplyPanel.add(rightPanel, BorderLayout.CENTER);
				
		groupDocContainer.setLayout(new BorderLayout());
		groupDocContainer.add(new CLabel(Msg.translate(Env.getCtx(), "C_GroupDoc_ID"),JLabel.LEFT),BorderLayout.NORTH);
		groupDocContainer.add(groupScrollPanel, BorderLayout.CENTER);
		//groupDocContainer.add(PortfolioButton, BorderLayout.SOUTH);
                groupDocContainer.add(portfoliogroup, BorderLayout.SOUTH);
				
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
		
		historyScrollPanel.getViewport().add(HistoryTable, null);
		groupScrollPanel.getViewport().add(groupTable, null);
		
		PortfolioBOEContainer.setLayout(new BorderLayout());
		PortfolioBOEContainer.add(new CLabel(Msg.translate(Env.getCtx(), "C_BOE_ID"),JLabel.LEFT),BorderLayout.NORTH);
		PortfolioBOEContainer.add(portfolioBOEScrollPane);

		PortfolioInvoiceContainer.setLayout(new BorderLayout());
		PortfolioInvoiceContainer.add(new CLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID"),JLabel.LEFT),BorderLayout.NORTH);
		PortfolioInvoiceContainer.add(portfolioInvoiceScrollPane);
		
							
		portfolioBOEScrollPane.getViewport().add(PortfolioTable, null);
		portfolioInvoiceScrollPane.getViewport().add(PortinvoiceTable, null);
		
		tabbedPane.add(mainPanel,   Msg.getMsg(Env.getCtx(), "BillOfExchangeGeneration"));
		tabbedPane.add(BOEApplyPanel, Msg.getMsg(Env.getCtx(), "BillOfExchangeApply"));
		tabbedPane.addChangeListener(this);		
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
			m_Rate = MConversionRate.getRate ( getCurrencyBOE(), 
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
		else if (name.equals("fAmount"))
			calcTotalInvoiceTableSelected();
		lretention.setText(m_retention ? "Agente de retenci�n" : "");
	}
	
	private void loadGroup() {
		if (m_C_BPartner_ID == 0 || m_C_Currency_ID == 0 )
			return;
		StringBuffer sql = new StringBuffer("SELECT b.DocumentNo,b.C_GroupDoc_ID, b.Name "
				+ " FROM C_GroupDoc b "
				+ "WHERE b.C_BPartner_ID=? AND b.Processed='N'");
		try
		{
			int row = 0;
			groupTable.setRowCount(row);			
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, m_C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				groupTable.setRowCount(row+1);
				groupTable.setValueAt(new Boolean(false), row, 0);
				KeyNamePair pp = new KeyNamePair(rs.getInt(2), rs.getString(1));
				groupTable.setValueAt(pp, row, 1);
				groupTable.setValueAt(rs.getString(3), row, 2);
				row++;
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}		
	}
	private void loadBOEPortfolio() {
		if (m_C_BPartner_ID == 0 || m_C_Currency_ID == 0 )
			return;
		StringBuffer sql = new StringBuffer("SELECT b.DueDate,b.DocumentNo,b.C_BOE_ID, "
				+ "c.ISO_Code,"
				+ "b.DateBOE,"
				+ "b.GrandTotal"
				+ " FROM C_BOE b "
				+ " INNER JOIN C_Currency c ON (b.C_Currency_ID=c.C_Currency_ID) "
				+ "WHERE b.DocStatus='PT' AND b.Processed='N'"
				+ " AND b.C_BPartner_ID=?");
		try
		{
			int row = 0;
			PortfolioTable.setRowCount(row);
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, m_C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				BigDecimal open = rs.getBigDecimal(6);
				if (open == null)		//	no conversion rate
					open = Env.ZERO;				
				if (Env.ZERO.compareTo(open) != 0)
				{
					PortfolioTable.setRowCount(row+1);
					PortfolioTable.setValueAt(new Boolean(false), row, 0);
					PortfolioTable.setValueAt(rs.getTimestamp(1), row, 1);
					KeyNamePair pp = new KeyNamePair(rs.getInt(3), rs.getString(2));
					PortfolioTable.setValueAt(pp, row, 2);
					PortfolioTable.setValueAt(rs.getString(4), row, 3);
					PortfolioTable.setValueAt(open, row, 4);
					row++;
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
		generateButton.setEnabled(false);
		processButton.setEnabled(false);
		PortfolioButton.setEnabled(false);
                pickDateAllocation.setEnabled(false);
		AccountButton.setEnabled(false);
		m_C_BPartner_Location_ID = 0;
		m_RowActiveHistory = -1;
		log.config("BPartner=" + m_C_BPartner_ID + ", Cur=" + m_C_Currency_ID);
//		//  Need to have three values
		if (m_C_BPartner_ID == 0 || m_C_Currency_ID == 0 )
			return;
				
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		StringBuffer sql = new StringBuffer("SELECT i.DateInvoiced,i.DocumentNo,i.C_Invoice_ID,"); //  1..3
		sql.append( "c.ISO_Code,i.GrandTotal, ");                            //  4..5    Orig Currency
		sql.append( "currencyConvert(i.GrandTotal,0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) as ConvertedAmount, "); //  6   #1  Converted
		sql.append( "currencyConvert(invoiceOpen(C_Invoice_ID,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) AS ConvertedOpen , " );  //  7   #2  Converted Open
		sql.append( "currencyConvert(invoiceDiscount(i.C_Invoice_ID,?,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) AS Discount," );              //  #3, #4
		sql.append( "i.MultiplierAP, i.c_bpartner_location_id, i.serial, CASE WHEN i.IsSOTrx='Y' THEN '(Venta) ' || dt.name ELSE '(Compra) ' || dt.name END    AS C_DocTypeName, true AS isinvoice ");
		sql.append( " FROM C_Invoice_v i ");		//  corrected for CM/Split
		sql.append( " INNER JOIN C_Currency c ON (i.C_Currency_ID=c.C_Currency_ID) ");
		sql.append( " LEFT OUTER JOIN C_DocType_trl dt ON i.c_doctype_id = dt.c_doctype_id ");
		sql.append( " WHERE i.IsPaid='N' AND i.Processed='Y' ");
		sql.append(" AND i.IsSOTrx=");
		sql.append(m_IsSOTrx ? "'Y'" : "'N'");
		sql.append(" AND i.C_BPartner_ID=?  AND NOT EXISTS (SELECT 1 FROM C_BOELine WHERE C_Invoice_ID = i.C_Invoice_ID AND processed='N') "); 
		sql.append(" UNION ");  
		sql.append(" SELECT b.Dateboe,b.DocumentNo,b.C_BOE_ID, c.ISO_Code, b.GrandTotal,"); 
		sql.append(" CurrencyConvert(b.GrandTotal,0,b.C_Currency_ID,?,b.StatusDate,b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID) as ConvertedAmount,");
		sql.append(" CurrencyConvert(boeOpen(b.C_boe_ID),0,b.C_Currency_ID,?,b.StatusDate,b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID) AS ConvertedOpen,");
		sql.append(" 0 AS Discount, 1 as MultiplierAP, b.C_BPartner_Location_ID, '' as Serial, dt.name as C_DocTypeName, false AS isinvoice");
		sql.append(" from C_BOE b "); 
		sql.append(" JOIN C_Currency c ON (b.C_Currency_ID=c.C_Currency_ID) ");
		sql.append(" LEFT OUTER JOIN C_DOCTYPE DT on (b.C_Doctype_ID = dt.C_Doctype_ID) ");
		sql.append(" WHERE b.C_BPartner_ID=? AND b.docstatus = 'PD' AND b.IsSOTrx=");
		sql.append(m_IsSOTrx ? "'Y'" : "'N'");
		log.fine("InvSQL=" + sql.toString());
		try
		{
			int C_Currency_ID = MClient.get(Env.getCtx()).getC_Currency_ID();
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, C_Currency_ID);
			pstmt.setInt(2, m_C_Currency_ID);
			pstmt.setTimestamp(3, (Timestamp)pickGenDate.getValue()); // fecha de pago para ver si aplica descuento
			pstmt.setInt(4, C_Currency_ID);
			pstmt.setInt(5, m_C_BPartner_ID);
			// boe
			pstmt.setInt(6, C_Currency_ID);
			pstmt.setInt(7, m_C_Currency_ID);
			pstmt.setInt(8, m_C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			int row = 0;
			invoiceTable.setRowCount(row);			
			while (rs.next())
			{
				BigDecimal open = rs.getBigDecimal("ConvertedOpen");
				if (open == null)		//	no conversion rate
					open = Env.ZERO;				
				if (Env.ZERO.compareTo(open) != 0)
				{
					m_C_BPartner_Location_ID = rs.getInt("C_BPartner_Location_ID");
					invoiceTable.setRowCount(row+1);
					invoiceTable.setValueAt(new Boolean(false), row, 0);   //  C_Order_ID
					invoiceTable.setValueAt(rs.getTimestamp("DateInvoiced"), row, 1);   //  C_Order_ID
					invoiceTable.setValueAt(rs.getString("C_DocTypeName"), row, 2);   //  C_Order_ID
					invoiceTable.setValueAt(rs.getString("Serial"), row, 3);   //  C_Order_ID
					KeyNamePair pp = new KeyNamePair(rs.getInt(3), rs.getString(2));
					invoiceTable.setValueAt(pp, row, 4);   //  C_Order_ID
					invoiceTable.setValueAt(rs.getString("ISO_Code"), row, 5);   //  C_Order_ID
					invoiceTable.setValueAt(rs.getBigDecimal("GrandTotal"), row, 6);   //  C_Order_ID
					invoiceTable.setValueAt(rs.getBigDecimal("ConvertedAmount"), row, 7);   //  C_Order_ID				
					invoiceTable.setValueAt(open, row, 8);   //  C_Order_ID
					BigDecimal discount = rs.getBigDecimal("Discount");
					if (discount == null)	//	no concersion rate
						discount = Env.ZERO;
					invoiceTable.setValueAt(discount, row, 9);   //  C_Order_ID
					invoiceTable.setValueAt(rs.getBoolean("IsInvoice"), row, 10);   //  C_Order_ID
					row++;
				}
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		setHistoryTable(false);
		setcounterInvoiceSelected(0);
		calcTotalInvoiceTableSelected();
		clean(boeTable);
	}


	private void initialize() {
		m_BoeItems = Env.ONE ;
		m_BOEamount = Env.ZERO;
		m_Invoiceamount = Env.ZERO;
		m_BeetweenBoes = new Integer(1) ;		
	}


	private void setcounterInvoiceSelected(int counter) {
		if (counter > 0)
			generateButton.setEnabled(true);
		else
			generateButton.setEnabled(false);
		counterInvoiceSelected = counter;
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

	public void tableChanged(TableModelEvent e) {
		if (isCalloutActive())
			return;
		int row = e.getFirstRow();
		int col = e.getColumn();
		if (e.getSource().equals(invoiceTable.getModel()))
		{
			if (col == 0) {
				TableModel invoice = invoiceTable.getModel();
				if (((Boolean)invoice.getValueAt(row, col)).booleanValue())
				{
					setcounterInvoiceSelected(++counterInvoiceSelected);
					invoice.setValueAt(invoice.getValueAt(row, Opened), row, Applied);
				}
				else
				{
					setcounterInvoiceSelected(--counterInvoiceSelected);
					invoice.setValueAt(Env.ZERO, row, 9);
				}
			}
		    m_Invoiceamount = calcTotalInvoiceTableSelected();
			DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
			invoiceInfo.setText( Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(m_Invoiceamount) + " ");		
			int precision = MCurrency.getStdPrecision(Env.getCtx(), getCurrencyBOE());
			m_BOEamount = m_Invoiceamount.multiply(getRate()).setScale(precision, BigDecimal.ROUND_HALF_UP) ;
		}
                else if (e.getSource().equals(groupTable.getModel())) {
                                    int rows = groupTable.getRowCount();
                                    PortfolioButton.setEnabled(false);
                                    pickDateAllocation.setEnabled(false);
                                    for (int x = 0; x < rows; x++) {
                                        if (groupTable.getValueAt(x, 0) != null && ((Boolean) groupTable.getValueAt(x, 0)).booleanValue() && !PortfolioButton.isEnabled())
                                        {
                                            PortfolioButton.setEnabled(true);
                                            pickDateAllocation.setEnabled(true);
                                        }
                                    }
                }
                else if (e.getSource().equals(boeTable.getModel()))
		{
	        TableModel model = (TableModel)e.getSource();
	        if (col == BOETableColAmount)
	        {
	        	BigDecimal totalBOE = calcTotalBOETable();
	        	int precision = MCurrency.getStdPrecision(Env.getCtx(), getCurrencyBOE());
	        	if (totalBOE.equals(m_Invoiceamount.multiply(getRate()).setScale(precision, BigDecimal.ROUND_HALF_UP)))		  
					processButton.setEnabled(true);
	        	else
					processButton.setEnabled(false);
		    	DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		    	boeInfo.setText( Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(totalBOE) + " " + Msg.getMsg(Env.getCtx(), "Diff") + "  " + format.format(totalBOE.subtract(m_Invoiceamount.multiply(getRate()).setScale(precision, BigDecimal.ROUND_HALF_UP))) + " ");		        
	        		
	        }
	        if (col == BOETableColDueDays)
	        {
		        Object data = model.getValueAt(row, col);
		        Calendar c1 = Calendar.getInstance();
		        c1.setTime((Timestamp) pickGenDate.getValue());
		        c1.add(Calendar.DATE, (Integer) data);			     		        
		        boeTable.setValueAt( new Timestamp(c1.getTime().getTime()), row, BOETableColDueDate);
		        			        
	        }
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
		    	DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		    	BigDecimal totalBoe = calcTotalBOETable();
		    	boeInfo.setText( Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(totalBoe) + " " + Msg.getMsg(Env.getCtx(), "Diff") + "  " + format.format(totalBoe.subtract(m_BOEamount)) + " ");		        
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
				KeyNamePair group = (KeyNamePair)HistoryTable.getValueAt(m_RowActiveHistory , 0);
				if ( group.getKey() > 0 )
				{
					MGroupDoc doc = new MGroupDoc(Env.getCtx(), group.getKey(), null);
					int tableId = MAllocationHdr.Table_ID;
					int recordId = doc.getC_AllocationHdr_ID();
					MAllocationHdr alloc = new MAllocationHdr(Env.getCtx(), recordId, null);
					if (alloc.isPosted())
					{
						//new org.compiere.acct.AcctViewer (Env.getContextAsInt (Env.getCtx(), m_WindowNo, "AD_Client_ID"),
						//		tableId, recordId);
						MQuery query = new MQuery(MAllocationHdr.Table_Name);
						query.addRestriction("DocumentNo", MQuery.EQUAL,alloc.getDocumentNo());
						//new AReport (tableId, c, query, this, m_WindowNo, m_curTab.getWhereExtended());
						new AReport (tableId, null , query);
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
//		BigDecimal rate = MConversionRate.getRate (getCurrencyBOE() , 
//									m_Acct_C_Currency_ID, 
//									(Timestamp) pickGenDate.getValue(), 
//									getConversionType(),
//									Env.getAD_Client_ID(Env.getCtx()), 
//									Env.getAD_Org_ID(Env.getCtx()));
//		if (rate == null)
//				setTextMsg(select + Msg.translate(Env.getCtx(),"C_Conversion_Rate_ID") );
		
		if (getTextMsg().length()==0)
		{
		    m_Invoiceamount = calcTotalInvoiceTableSelected();
			DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
			invoiceInfo.setText( Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(m_Invoiceamount) + " ");		
			int precision = MCurrency.getStdPrecision(Env.getCtx(), getCurrencyBOE());
			m_BOEamount = m_Invoiceamount.multiply(getRate()).setScale(precision, BigDecimal.ROUND_HALF_UP) ;
			return true;
		}
		return false;
	}


	private boolean ProcessPortfolio() {		
		DefaultTableModel groupmodel =  (DefaultTableModel)groupTable.getModel();
		int rows = groupmodel.getRowCount();
		for (int i = 0; i < rows; i++)
		{
			if ((((Boolean)groupmodel.getValueAt(i, 0)).booleanValue()))
			{
				Trx m_trx = Trx.get(Trx.createTrxName("PortfolioProcess"), true);
				String trxName = m_trx.getTrxName();			
				
				KeyNamePair group = (KeyNamePair)groupmodel.getValueAt(i, 1);
				
				int m_C_Group_ID = group.getKey();			
				
				MGroupDoc groupdoc = new MGroupDoc(Env.getCtx(), m_C_Group_ID , trxName);

                                Timestamp datealloc = (Timestamp) pickDateAllocation.getValue();
                                // Env.getContextAsDate(Env.getCtx(), "#Date")
				
				MAllocationHdr alloc = new MAllocationHdr(Env.getCtx(),
						false /* is manual */, 
						datealloc,
						getCurrencyBOE(),
						Msg.translate(Env.getCtx(), "C_GroupDoc_ID") + ": " + groupdoc.getC_GroupDoc_ID(), 
						trxName);
				alloc.setAD_Org_ID(groupdoc.getAD_Org_ID());
				alloc.setIsExchange(true);
				//alloc.save(trxName);
				if (!alloc.save(trxName))
				{
					m_trx.rollback();
					m_trx.close();				
					return false;
				}											
				groupdoc.setC_AllocationHdr_ID(alloc.getC_AllocationHdr_ID());
				groupdoc.save(trxName);				
							
				MBOE[] boes = MBOE.getGroup(m_C_Group_ID, trxName);
				
				for (int j = 0; j < boes.length ; j++) 
				{
					MBOE boe = boes[j];
					boolean sucessfully = false;
					try {
						sucessfully  = boe.processIt(DocAction.ACTION_Portfolio);
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (sucessfully && boe.save())					
					{
						if (!boe.save(trxName))
						{
							m_trx.rollback();
							m_trx.close();				
							return false;
						}			
						
					}
					else
					{
						m_TextMsg = boe.getProcessMsg();
						m_trx.rollback();
						m_trx.close();				
						return false;						
					}
				}
				
				MRetention[] retentions = MRetention.getGroup(m_C_Group_ID, trxName);
				
				for (int j = 0; j < retentions.length ; j++) 
				{
					MRetention retention = retentions[j];
					boolean sucessfully = false;
					try {
						sucessfully  = retention.processIt(DocAction.ACTION_ToCollect);
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (sucessfully && retention.save())					
					{
						if (!retention.save(trxName))
						{
							m_trx.rollback();
							m_trx.close();				
							return false;
						}			
						
					}
					else
					{
						m_TextMsg = retention.getProcessMsg();
						m_trx.rollback();
						m_trx.close();				
						return false;						
					}					
				}
				
				alloc = new MAllocationHdr(Env.getCtx(), groupdoc.getC_AllocationHdr_ID(), trxName);
				if (alloc.processIt(DocAction.ACTION_Complete))
				{
					if (!alloc.save(trxName))
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
					m_TextMsg = alloc.getProcessMsg(); 
					return false;					
				}
				groupdoc.setProcessed(true);					
				if (!groupdoc.save())
				{
					m_trx.rollback();
					m_trx.close();	
					return false;
				}			
				if (!m_trx.commit()) {
					m_trx.rollback();
					m_trx.close();
					return false;
				}	
				m_trx.commit();
				m_trx.close();
				int r = HistoryTable.getRowCount();
				HistoryTable.setRowCount(r + 1 );
				HistoryTable.setValueAt(group, r, 0);
				HistoryTable.setValueAt(alloc.getDocumentNo(), r, 1);
				HistoryTable.setValueAt(alloc.getDateTrx(),r,2);
				HistoryTable.setValueAt(alloc.getDateAcct(),r,3);
				//groupmodel.removeRow(i);
			}
		}
		// eliminamos el consolidado de la grilla.
		int i = 0;
		while ( i < rows)
		{
			if (((Boolean)groupmodel.getValueAt(i, 0)).booleanValue())
			{
				groupmodel.removeRow(i);
				rows = groupmodel.getRowCount();
				i = 0;
			}				
			else
				i++;
		}        				
		clean(PortfolioTable);
		clean(PortinvoiceTable);
		return true;
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
	
	private BigDecimal calcTotalBOETable() {
		BigDecimal totalBoe = Env.ZERO;
		int rows = boeTable.getRowCount();
		if (rows == 0)
			return Env.ZERO;
		for (int i = 0; i < rows; i++)
		{
			BigDecimal line = (BigDecimal)boeTable.getValueAt(i, BOETableColAmount);
			if (line != null)
				totalBoe = totalBoe.add(line);
		}
		int precision = MCurrency.getStdPrecision(Env.getCtx(), getCurrencyBOE());
		return totalBoe.setScale(precision, BigDecimal.ROUND_HALF_UP);
	}
	
	private BigDecimal calcTotalInvoiceTableSelected() {		
		int rows = invoiceTable.getRowCount();	
		if (rows == 0)
			return Env.ZERO;
		setCalloutActive(true);		
		BigDecimal totalgroup = Env.ZERO;
		//BigDecimal totalgroupAply = Env.ZERO;
		BigDecimal totalOperation = Env.ZERO;
		BigDecimal totalOperationConverted = Env.ZERO;
		BigDecimal totaldoc = Env.ZERO;
		//
		BigDecimal totaldocConverted = Env.ZERO;
		BigDecimal rate = getRate();
		for (int i = 0; i < rows; i++)
		{
			invoiceTable.setValueAt(Env.ZERO, i, InvTableColRetention);
			if (invoiceTable.getValueAt(i, 0) != null && ((Boolean)invoiceTable.getValueAt(i, 0)).booleanValue())
			{
				BigDecimal group = (BigDecimal)invoiceTable.getValueAt(i, Applied);
				if (group != null)
				totalgroup = totalgroup.add(group);
				totaldoc = (BigDecimal)invoiceTable.getValueAt(i, Applied);
				totalOperation = (BigDecimal)invoiceTable.getValueAt(i, InvoiceAmount);
				KeyNamePair pp = (KeyNamePair)invoiceTable.getValueAt(i, 4);    //  Value
				int C_Invoice_ID = pp.getKey();
				MInvoice invoice = null;
				MBOE boe = null;
				boolean IsInvoice = ((Boolean)invoiceTable.getValueAt(i, 10)).booleanValue(); 
				if (IsInvoice)				
					invoice = MInvoice.get(Env.getCtx(), C_Invoice_ID);
				else
					boe = MBOE.get(Env.getCtx(), C_Invoice_ID, null);
				//
				BigDecimal operationConverted = MConversionRate.convertBase(Env.getCtx(), 
						IsInvoice ? invoice.getC_DocType_ID() : boe.getC_DocType_ID() , totalOperation,	//	CM adjusted 
						IsInvoice ? invoice.getC_Currency_ID() : boe.getC_Currency_ID(), 
						IsInvoice ?	invoice.getDateInvoiced() : boe.getDateBOE(), 
						IsInvoice ? invoice.getC_ConversionType_ID() : boe.getC_ConversionType_ID(), 
						IsInvoice ? invoice.getAD_Client_ID() : boe.getAD_Client_ID(),
						IsInvoice ? invoice.getAD_Org_ID() : boe.getAD_Org_ID());
				if (operationConverted != null)
					totalOperationConverted = totalOperationConverted.add(operationConverted);
				//
				if (totaldoc != null)
				{
					BigDecimal docConverted =  MConversionRate.convertBase(Env.getCtx(), 
					IsInvoice ? invoice.getC_DocType_ID() : boe.getC_DocType_ID() , totaldoc,	//	CM adjusted 
					IsInvoice ? invoice.getC_Currency_ID() : boe.getC_Currency_ID() ,
					IsInvoice ? invoice.getDateInvoiced() : boe.getDateBOE(), 
					IsInvoice ? invoice.getC_ConversionType_ID() : boe.getC_ConversionType_ID(),
					IsInvoice ? invoice.getAD_Client_ID() : boe.getAD_Client_ID(),
					IsInvoice ? invoice.getAD_Org_ID() : boe.getAD_Org_ID());
					if ( docConverted != null)
						totaldocConverted = totaldocConverted.add(docConverted);
				}
			}
				
		}
		if (m_retention)
		{
			for (int i = 0; i < rows; i++)
			{
				if (invoiceTable.getValueAt(i, 0) != null && ((Boolean)invoiceTable.getValueAt(i, 0)).booleanValue())
				{
					totaldoc = ((BigDecimal)invoiceTable.getValueAt(i, Applied));
		    		if (retention.isactive(totaldocConverted) || retention.isactive(totalOperationConverted) )
		    		{						
		    			BigDecimal retAmt = retention.calculateRetention(totaldoc , m_C_Currency_ID);
		    			if ( retAmt != null  )
		    			{
		    				invoiceTable.setValueAt(retAmt, i, InvTableColRetention);
		    				totalgroup = totalgroup.subtract(retAmt);
		    			}
		    		}
				}			
			}			
		}
		
		int precision = MCurrency.getStdPrecision(Env.getCtx(), getCurrencyInvoice());
		setCalloutActive(false);
		return totalgroup.setScale(precision, BigDecimal.ROUND_HALF_UP);
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
			BigDecimal total = calcTotalBOETable();
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
				String DocumentNo = (String) boeTable.getValueAt(j, BOETableColDoc);
				if (DocumentNo != null)
					boe.setDocumentNo(DocumentNo);
				boe.setGrandTotal((BigDecimal) boeTable.getValueAt(j, BOETableColAmount));
				boe.setDueDate((Timestamp) boeTable.getValueAt(j, BOETableColDueDate));
				boe.setC_ConversionType_ID(getConversionType());
				if (!boe.save())
				{
					m_trx.rollback();
					m_trx.close();					
					return false;
				}
				for (int k=0; k < invoiceTable.getRowCount(); k++)
				{
					if ((((Boolean)invoiceTable.getValueAt(k, 0)).booleanValue()))
					{
						boolean IsInvoice = (Boolean) invoiceTable.getValueAt(k, 10);
						KeyNamePair pp = (KeyNamePair)invoiceTable.getValueAt(k, 4);    //  Value
						// Invoice variables
						// xapiens :
						// el boe amount es variable, por tanto debemos "ajustar" 
						// la proporcion del mismo sobre la factura.
						// factor = boe amount / total
						// boeline = invoice x factor
						int C_Invoice_ID = pp.getKey();
						BigDecimal factor = boe.getGrandTotal().divide(total, 10 , BigDecimal.ROUND_HALF_UP);
						BigDecimal totalInvoice   = (BigDecimal)invoiceTable.getValueAt(k, Applied); // Converted Open
						BigDecimal totalRetention = (BigDecimal)invoiceTable.getValueAt(k, InvTableColRetention); // Converted Open
						totalInvoice = totalInvoice.subtract(totalRetention);
						totalInvoice = totalInvoice.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_UP);
						if (!getCurrencyBOE().equals(getCurrencyInvoice()))
							totalInvoice = totalInvoice.multiply(getRate());
						MBOELine boeline = new MBOELine(boe);		
						if (IsInvoice) 
							boeline.setC_Invoice_ID(C_Invoice_ID);
						else
						{
							boeline.setC_Invoice_ID(0);
							boeline.setRef_BOE_ID(C_Invoice_ID);
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
			for (int k=0; k < invoiceTable.getRowCount(); k++)
			{
				BigDecimal totalApply = (BigDecimal) invoiceTable.getValueAt(k, Applied);
				BigDecimal totalRetention = (BigDecimal) invoiceTable.getValueAt(k, InvTableColRetention);
				if ( totalRetention.compareTo(Env.ZERO) != 0 )
				{
					KeyNamePair pp = (KeyNamePair)invoiceTable.getValueAt(k, 4);    //  Value
					int C_Invoice_ID = pp.getKey();
					
					MInvoice invoice = MInvoice.get(Env.getCtx(), C_Invoice_ID);
					invoice.setC_GroupDoc_ID(groupdoc.getC_GroupDoc_ID());						
					invoice.save();
					
					MRetention retention = new MRetention(Env.getCtx(), 0, trxName);
					retention.setClientOrg(invoice.getAD_Client_ID(), invoice.getAD_Org_ID());
					retention.setC_Invoice_ID(C_Invoice_ID);
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
			DefaultTableModel invoicemodel =  (DefaultTableModel)invoiceTable.getModel();
			int m = 0;
			while ( m < invoiceTable.getRowCount() )
			{
				if ((((Boolean)invoiceTable.getValueAt(m, 0)).booleanValue()))	{
					invoicemodel.removeRow(m);	   
					m=0;
				}	
				else
					m++;
			}
			m_trx.close();
			clean(boeTable);
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
		StringBuffer sql = new StringBuffer(
				" SELECT * from boewiz(?,?,?,?,?,?);");
	
			log.fine(sql.toString());
			//  reset table
			int row = 0;
			boeTable.setRowCount(row);
			//  Execute
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
				boeTable.setColumnReadOnly(2, false);
				while (rs.next())
				{
					//  extend table
					boeTable.setRowCount(row+1);
										
					BigDecimal amount = rs.getBigDecimal(3);
					//  set values				
					boeTable.setValueAt(new IDColumn(rs.getInt(1)), row, 0);   //  C_Order_ID
					boeTable.setValueAt(rs.getTimestamp(2), row, BOETableColGenDate);              //  date generated
					boeTable.setValueAt(amount, row, BOETableColAmount);              //  Amount
					boeTable.setValueAt(m_BeetweenBoes * (row + 1), row, BOETableColDueDays);              //  Days
					boeTable.setValueAt(rs.getTimestamp(4), row, BOETableColDueDate);              //  due date
										
					//  prepare next
					row++;
				}
				rs.close();
				pstmt.close();
			}
			catch (SQLException e)
			{
				log.log(Level.SEVERE, sql.toString(), e);
			}
			//
			boeTable.autoSize();		
	}

	private void setHistoryTable(Boolean initialize)
	{
		if (initialize)
		{
			HistoryTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
			HistoryTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "C_AllocationHdr_ID")));
			HistoryTable.addColumn(Msg.translate(Env.getCtx(), "DateTrx"));
			HistoryTable.addColumn(Msg.translate(Env.getCtx(), "DateAcct"));
			int i = 0;
			HistoryTable.setColumnClass(i++, String.class, true);           //  0-Document No
			HistoryTable.setColumnClass(i++, String.class, true);           //  1-Allocation ID
			HistoryTable.setColumnClass(i++, Timestamp.class, true);           //  2-Date Allocation
			HistoryTable.setColumnClass(i++, Timestamp.class, true);           //  2-Date Allocation
			HistoryTable.autoSize();				
			DefaultTableModel model =  (DefaultTableModel)HistoryTable.getModel();
			model.addTableModelListener(this);
			HistoryTable.setModel(model);			
			HistoryTable.getSelectionModel().addListSelectionListener(
					new ListSelectionListener() {					
						public void valueChanged(ListSelectionEvent event) {
							m_RowActiveHistory = HistoryTable.getSelectedRow();
							AccountButton.setEnabled(true);
						}
					}
			);
			
			HistoryTable.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if ( key == KeyEvent.VK_DELETE)
					{
		            	if (ADialog.ask(0, m_frame, Msg.getMsg(Env.getCtx(), "DeleteRecord?")))
		            	{
		            		deleteHistoryGroupDoc();
		            	}	                           	
					}	
				}
				

				private boolean deletegroup(String TableName, int m_Group_ID) {
					StringBuffer sql = new StringBuffer("DELETE FROM "+TableName+" WHERE C_GroupDoc_ID=").append(m_Group_ID);
					int no = DB.executeUpdate(sql.toString(), getTrxName());
					return true;
				}
	
				private String getTrxName() {
					return m_trxName;
				}
	
			});
			
		}
		else
		{
			if (m_C_BPartner_ID == 0)
				return;
			
			StringBuffer sql = new StringBuffer("SELECT b.Name,b.C_GroupDoc_ID, b.DocumentNo, a.DocumentNo, a.DateTrx, a.Dateacct  "
					+ " FROM C_GroupDoc b left outer join c_allocationhdr a on b.c_allocationhdr_id = a.c_allocationhdr_id "
					+ " WHERE b.C_BPartner_ID=? AND b.Processed='Y'");
			
			try
			{
				PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
				pstmt.setInt(1, m_C_BPartner_ID);
				ResultSet rs = pstmt.executeQuery();
				int row = 0;
				HistoryTable.setRowCount(row);
				while (rs.next())
				{
					HistoryTable.setRowCount(row+1);
					KeyNamePair pp = new KeyNamePair(rs.getInt(2), rs.getString(1));
					HistoryTable.setValueAt(pp, row, 0);   //  C_GroupDoc_ID
					HistoryTable.setValueAt(rs.getString(4), row, 1);   //  Allocation DocumentNo
					HistoryTable.setValueAt(rs.getTimestamp(5), row, 2);   //  date trx
					HistoryTable.setValueAt(rs.getTimestamp(6), row, 3);   //  date acct
					row++;
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
	

	private void deleteHistoryGroupDoc() {
		try {
    		m_trx = Trx.get(Trx.createTrxName("BOEProcess"), true);
    		m_trxName = m_trx.getTrxName();
    		int row = HistoryTable.getSelectedRow();
    		Boolean lContinue = true;
    		KeyNamePair bg = (KeyNamePair) HistoryTable.getValueAt(row, 0);
    		
    		MGroupDoc gdoc = new MGroupDoc(Env.getCtx(), bg.getKey(), m_trxName);
    		MAllocationHdr hdr = new MAllocationHdr(Env.getCtx(), gdoc.getC_AllocationHdr_ID(), m_trxName); 
    		if (gdoc == null || hdr == null)		            		
    		{
    			ADialog.error(0, null,  "Asignación creada invalida");
    			return;
    		}
    		
    		String whereClause = "C_GroupDoc_ID = ".concat(String.valueOf(bg.getKey()));
    		
    		List<MBOE> boes = new Query(Env.getCtx(), MBOE.Table_Name , whereClause, m_trxName)
												.list();
    		for (MBOE boe : boes)
    			if (!boe.delete(true))
    			{
    				lContinue = false;
    				break;
    			}
    		
    		if (lContinue)
    		{
    			if (hdr.delete(true) && gdoc.delete(true))
    			{
    				DefaultTableModel model =  (DefaultTableModel) HistoryTable.getModel();
					model.removeRow(row);
    				m_trx.commit(true);
    				ADialog.info(0, this, "Eliminaci�n exitosa");
    			}
    			else
    			{
    				m_trx.rollback();
    				ADialog.info(0, this, "Eliminaci�n fallida");
    			}
    		}
    		else
    			m_trx.rollback();
    		
		} catch (Exception ex) {
			m_trx.rollback();
			ex.printStackTrace();
		}
		finally {
			m_trx.close();
			m_trx = null;
		}					
	}
	
	
	void setGeneratedBoesTable(boolean initialize)
	{
		if (initialize)
		{
			boeTable.addColumn("Gen_ID");
			boeTable.addColumn("GenDate");
			boeTable.addColumn("DocumentNo");
			boeTable.addColumn("Amount");
			boeTable.addColumn("DueDays");
			boeTable.addColumn("DueDate");
			//
			boeTable.setCellSelectionEnabled(false);
			boeTable.setRowSelectionAllowed(false);
			//  set details
			boeTable.setColumnClass(0, IDColumn.class, false, " ");
			boeTable.setColumnClass(BOETableColGenDate, Timestamp.class, false, Msg.translate(Env.getCtx(), "GenDate"));
			boeTable.setColumnReadOnly(BOETableColGenDate, true);
			boeTable.setColumnClass(BOETableColDoc, String.class, false, Msg.translate(Env.getCtx(),"DocumentNo"));
			boeTable.setColumnClass(BOETableColAmount, BigDecimal.class, false, Msg.translate(Env.getCtx(), "Amount"));
			// days
			boeTable.setColumnClass(BOETableColDueDays, Integer.class, false, Msg.translate(Env.getCtx(), "DueDays"));
			boeTable.setColumnClass(BOETableColDueDate, Timestamp.class, false, Msg.translate(Env.getCtx(), "DueDate"));
			//
			boeTable.autoSize();		
				
			DefaultTableModel model =  (DefaultTableModel)boeTable.getModel();
			model.addTableModelListener(this);
			boeTable.setModel(model);
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
			model.addTableModelListener(this);
			PortinvoiceTable.setModel(model);

		}
		
	}
	void setBOEPortafolio(boolean initialize)
	{
		if (initialize)
		{
			//  Header Info
			PortfolioTable.addColumn(Msg.translate(Env.getCtx(), "DueDate"));
			PortfolioTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
			PortfolioTable.addColumn(Msg.getMsg(Env.getCtx(), "TrxCurrency"));
			PortfolioTable.addColumn(Msg.translate(Env.getCtx(), "DateBoe"));
			PortfolioTable.addColumn(Msg.getMsg(Env.getCtx(), "OpenAmt"));
			int i = 0;
			PortfolioTable.setColumnClass(i++, Timestamp.class, true);        //  1-TrxDate
			PortfolioTable.setColumnClass(i++, String.class, true);           //  2-Document No
			PortfolioTable.setColumnClass(i++, String.class, true);       //  5-ConvAmt
			PortfolioTable.setColumnClass(i++, Timestamp.class, true);       //  5-ConvAmt
			PortfolioTable.setColumnClass(i++, BigDecimal.class, true);       //  6-ConvAmt Open
			PortfolioTable.autoSize();			
			
			DefaultTableModel model =  (DefaultTableModel)PortfolioTable.getModel();
			model.addTableModelListener(this);
			PortfolioTable.setModel(model);
			
			PortfolioTable.getSelectionModel().addListSelectionListener(
			        new ListSelectionListener() {
			            public void valueChanged(ListSelectionEvent event) {
			                int viewRow = PortfolioTable.getSelectedRow();
			                if (viewRow < 0) {
			                	
			                } else {
			                	KeyNamePair BOE = (KeyNamePair)PortfolioTable.getValueAt(viewRow, 1);
			                	int m_C_BOE_ID = BOE.getKey();
			                	 
			                	  
			                		
								StringBuffer sql = new StringBuffer("SELECT i.documentno,i.C_Invoice_ID, i.dateinvoiced, bl.amount, ")
								.append("b.C_BOE_ID,b.dateboe,b.documentno AS BOEDocumentNo,bl.c_invoice_id > 0 as IsInvoice")
								.append(" FROM c_boeline bl")
								.append(" LEFT outer JOIN c_invoice i " )
								.append(" ON (bl.c_invoice_id = i.c_invoice_id)  LEFT outer JOIN c_boe b ")
								.append(" ON (b.c_boe_id = bl.ref_boe_id) WHERE bl.c_boe_id = ?");
								try {
									PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
									pstmt.setInt(1, m_C_BOE_ID);
									ResultSet rs = pstmt.executeQuery();
									int row = 0;
									PortinvoiceTable.setRowCount(row);									
									while (rs.next())
									{
										PortinvoiceTable.setRowCount(row+1);
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
										
										PortinvoiceTable.setValueAt(pp2,row,0);
										PortinvoiceTable.setValueAt(DateDoc,row,1);
										BigDecimal total = rs.getBigDecimal(4);
										if (total == null)		//	no conversion rate
											total = Env.ZERO;
										PortinvoiceTable.setValueAt(total,row,2);
										row++;
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
			);		
			
		}
	}
	void setInvoiceTable(Boolean initialize)
	{
		if (initialize)
		{
			//  Header Info		
			invoiceTable.addColumn(Msg.getMsg(Env.getCtx(), "Select"));
			invoiceTable.addColumn(Msg.translate(Env.getCtx(), "Date"));
			invoiceTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "Documento")));
			invoiceTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "Serie")));
			invoiceTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
			invoiceTable.addColumn(Msg.translate(Env.getCtx(), "C_Currency_ID"));
			invoiceTable.addColumn(Msg.translate(Env.getCtx(), "Amount"));
			invoiceTable.addColumn(Msg.getMsg(Env.getCtx(), "ConvertedAmount"));
			invoiceTable.addColumn(Msg.getMsg(Env.getCtx(), "OpenAmt"));
			invoiceTable.addColumn(Msg.getMsg(Env.getCtx(), "AppliedAmt"));		
			invoiceTable.addColumn(Msg.translate(Env.getCtx(), "C_Invoice_ID"));
			invoiceTable.addColumn(Msg.translate(Env.getCtx(), "C_Retention_ID"));
	
			DefaultTableModel model =  (DefaultTableModel)invoiceTable.getModel();
			model.addTableModelListener(this);
			invoiceTable.setModel(model);
			
			//
			int i = 0;
			invoiceTable.setColumnClass(i++, Boolean.class, false);         //  0-Selection
			invoiceTable.setColumnClass(i++, Timestamp.class, true);        //  1-TrxDate
			invoiceTable.setColumnClass(i++, String.class, true);           //  2-Document Type
			invoiceTable.setColumnClass(i++, String.class, true);           //  3-Document serial
			invoiceTable.setColumnClass(i++, String.class, true);           //  4-Document No
			invoiceTable.setColumnClass(i++, String.class, true);           //  5-ISO Currency
			invoiceTable.setColumnClass(i++, BigDecimal.class, true);       //  6-Amount
			invoiceTable.setColumnClass(i++, BigDecimal.class, true);       //  7-ConvAmt
			invoiceTable.setColumnClass(i++, BigDecimal.class, true);       //  8-ConvAmt Open
			invoiceTable.setColumnClass(i++, BigDecimal.class, false);       //  9-Applied Amount		
			invoiceTable.setColumnClass(i++, Boolean.class, true);          // 10-Is Invoice
			invoiceTable.setColumnClass(i++, BigDecimal.class, true);       // 11 - InvTableColRetention
			invoiceTable.autoSize();
			final MSort sort = new MSort(0, null);
			sort.setSortAsc(true);
		}		
	}
	void setGroupTable(Boolean initialize)
	{
		if (initialize)
		{
			//  Header Info
			groupTable.addColumn(Msg.getMsg(Env.getCtx(), "Select"));
			groupTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
			groupTable.addColumn(Msg.translate(Env.getCtx(), "Name"));
			DefaultTableModel model =  (DefaultTableModel)groupTable.getModel();
			model.addTableModelListener(this);
			groupTable.setModel(model);
			int i = 0;
			groupTable.setColumnClass(i++, Boolean.class, false);         //  0-Selection
			groupTable.setColumnClass(i++, String.class, true);           //  2-Document No
			groupTable.setColumnClass(i++, String.class, true);           //  2-Document No
			groupTable.autoSize();									
			
			groupTable.getSelectionModel().addListSelectionListener(
					new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent event) {
							int viewRow = groupTable.getSelectedRow();
							clean(PortfolioTable);
							clean(PortinvoiceTable);
							if (viewRow < 0 ) {
								
							} else {
								if (m_C_BPartner_ID == 0 || m_C_Currency_ID == 0 )
									return;															
			                	KeyNamePair groupDoc = (KeyNamePair)groupTable.getValueAt(viewRow, 1);
			                	m_C_GroupDoc_ID = groupDoc.getKey();				
			                	
								StringBuffer sql = new StringBuffer("SELECT b.DueDate,b.DocumentNo,b.C_BOE_ID, "
										+ "c.ISO_Code,"
										+ "b.DateBOE,"
										+ "b.GrandTotal"
										+ " FROM C_BOE b "
										+ " INNER JOIN C_Currency c ON (b.C_Currency_ID=c.C_Currency_ID) "
										+ "WHERE b.DocStatus='DR' AND b.Processed='N'"
										+ " AND b.C_BPartner_ID=? AND b.C_GroupDoc_ID=?");
								try
								{
									PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
									pstmt.setInt(1, m_C_BPartner_ID);
									pstmt.setInt(2, m_C_GroupDoc_ID);
									ResultSet rs = pstmt.executeQuery();
									int row = 0;
									PortfolioTable.setRowCount(row);									
									while (rs.next())
									{
										BigDecimal open = rs.getBigDecimal(6);
										if (open == null)		//	no conversion rate
											open = Env.ZERO;
										if (Env.ZERO.compareTo(open) != 0)
										{
											PortfolioTable.setRowCount(row+1);
											PortfolioTable.setValueAt(rs.getTimestamp(1), row, 0);
											KeyNamePair pp = new KeyNamePair(rs.getInt(3), rs.getString(2));										
											PortfolioTable.setValueAt(pp, row, 1);
											PortfolioTable.setValueAt(rs.getString(4), row, 2);
											PortfolioTable.setValueAt(rs.getTimestamp(5), row, 3);
											PortfolioTable.setValueAt(rs.getBigDecimal(6), row, 4);
											int m_C_BOE_ID = rs.getInt(3);		
											row++;
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
						}
					}
			);
			
			groupTable.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if ( key == KeyEvent.VK_DELETE)
					{
		            	if (ADialog.ask(0, m_frame, Msg.getMsg(Env.getCtx(), "DeleteRecord?")))
		            	{	            		
		            		m_trx = Trx.get(Trx.createTrxName("BOEProcess"), true);
		            		m_trxName = m_trx.getTrxName();
		            		
		            		int selection = groupTable.getSelectedRow();	
		            		KeyNamePair group = (KeyNamePair)groupTable.getValueAt(selection, 1);
		            		int m_C_Group_ID = group.getKey();
		            		if ( deletegroup(MBOE.Table_Name, m_C_Group_ID) && 
		            			 deletegroup(MBOELine.Table_Name, m_C_Group_ID) && 
		            			 deletegroup(MGroupDoc.Table_Name, m_C_Group_ID) &&
		            			 deletegroup(MRetention.Table_Name, m_C_Group_ID))
		            		{
		    					m_trx.commit();
		    					clean(groupTable,selection);
		            			//model.removeRow(selection);	            			
		            		}
		            		else
		            			m_trx.rollback();
		            		m_trx.close();
		            		
		            		clean(PortfolioTable);
		            		clean(PortinvoiceTable);
		            		loadBPartner();
		            	}	                           	
					}	
				}
				
				private boolean deletegroup(String TableName, int m_Group_ID) {
					StringBuffer sql = new StringBuffer("DELETE FROM "+TableName+" WHERE C_GroupDoc_ID=").append(m_Group_ID);
					int no = DB.executeUpdate(sql.toString(), getTrxName());
					return true;
				}
	
				private String getTrxName() {
					return m_trxName;
				}
	
			});
		}
	}
	public boolean candispose() {
		return true;
	}	
}