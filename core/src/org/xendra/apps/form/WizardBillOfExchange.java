package org.xendra.apps.form;

import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;

import org.compiere.apps.AEnv;
import org.compiere.apps.ALayout;
import org.compiere.apps.ALayoutConstraint;
import org.compiere.apps.ALogin;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.VInvoiceRow;
import org.compiere.model.MBPartner;
import org.compiere.model.MClient;
import org.compiere.model.MColumn;
import org.compiere.model.MConversionRate;
import org.compiere.model.MConversionType;
import org.compiere.model.MDocType;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MWithholding;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.swing.CFrame;
import org.compiere.swing.CLabel;
import org.compiere.swing.CPanel;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.Splash;
import org.compiere.util.Util;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Vector;
import java.util.logging.Level;

import javax.swing.JSplitPane;

import org.compiere.grid.ed.VDate;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.xendra.line.LineKeyAdapter;
import org.xendra.objectview.DefaultObjectViewModel;
import org.xendra.objectview.ObjectView;

public class WizardBillOfExchange extends CFrame implements VetoableChangeListener {

	private static final long serialVersionUID = -2550060138577485139L;
	private static CLogger log = CLogger.getCLogger(WizardBillOfExchange.class);
	/**
	 * Launch the application.
	 */
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
					WizardBillOfExchange frame = new WizardBillOfExchange();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private VLookup pickPartner = new VLookup();
	private VDate pickGenDate = new VDate();
	private VLookup pickDocType;
	private VNumber pickRate = new VNumber("pickRate", false, false, true, DisplayType.Amount, Msg.translate(Env.getCtx(), "MultiRate"));
	private VLookup pickCurrencyInvoice;
	private VLookup pickConversionType;
	private VLookup pickCurrencyBOE;
	private SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1,1,100,1);
	private SpinnerNumberModel spinModelBetween = new SpinnerNumberModel(1,1,365,7);
	private JSpinner NumberofBoEField = new JSpinner(spinnerModel);		
	private JSpinner BetweenofBoEField = new JSpinner(spinModelBetween);
	private int m_WindowNo;
	private FormFrame m_frame;
	private BusinessPartner bp = new BusinessPartner();
	private ObjectView invoiceView = new ObjectView();
	private ObjectView boeView = new ObjectView();
	private DefaultObjectViewModel invoicemodel = null;
	private DefaultObjectViewModel boemodel = null;
	private LineKeyAdapter lkaInvoice;
	private LineKeyAdapter lkaBoe;
	private CPanel parameterPanel = new CPanel();
	private CPanel invoicePanel = new CPanel();
	private JScrollPane invoiceScrollPane = new JScrollPane();
	private JLabel invoiceInfo = new JLabel();	
	private final VLookup lookup = new VLookup();
	private final VLookup lookup_x = new VLookup();

	public WizardBillOfExchange() {
		Initialize();
	}
	/**
	 * Create the frame.
	 */
	public CPanel Initialize() {

		bp.reset();

		setBounds(100, 100, 519, 367);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();

		graph.getModel().beginUpdate();
		try
		{
			Object v1 = graph.insertVertex(parent, null, "Hello", 20, 20, 80,
					30);
			Object v2 = graph.insertVertex(parent, null, "World!", 240, 150,
					80, 30);
			graph.insertEdge(parent, null, "Edge", v1, v2);
		}
		finally
		{
			graph.getModel().endUpdate();
		}

		Integer AD_Column_ID = MColumn.getColumn_ID(X_C_Order.Table_Name,"C_DocTypeTarget_ID", null);
		MLookupInfo lookupInfo = MLookupFactory.getLookupInfo (Env.getCtx(), m_WindowNo, AD_Column_ID, DisplayType.Table,
				Env.getLanguage(Env.getCtx()), "C_DocTypeTarget_ID", 170,
				false, "C_DocType.DocBaseType IN ('BOE') ");

		MLookup lookupDocType = new MLookup (lookupInfo, 0);

		AD_Column_ID = Util.getColumnID(X_C_Invoice.Table_ID,"C_Currency_ID");
		MLookup lookupCurrInvoice = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);		

		MLookup lookupCurrBOE = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);

		AD_Column_ID = Util.getColumnID(X_C_Invoice.Table_ID,"C_ConversionType_ID");
		MLookup lookupConversionType = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);

		String dtwhere = " docbasetype in ('BOE') AND IsSOTrx = 'Y' ";
		MDocType mt = new Query(Env.getCtx(), X_C_DocType.Table_Name, dtwhere, null)
		.setClient_ID()
		.first();
		bp.setC_DocType_ID(mt.getC_DocType_ID());
		if (mt.getC_ConversionType_ID() > 0)
			pickConversionType.setValue(mt.getC_ConversionType_ID());					

		CPanel panel = new CPanel();		
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{98, 0};
		gbl_panel.rowHeights = new int[]{41, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		pickPartner = VLookup.createBPartner(m_WindowNo);
		pickPartner.addVetoableChangeListener(this);
		//		GridBagConstraints gbc_pickPartner = new GridBagConstraints();
		//		gbc_pickPartner.insets = new Insets(0, 0, 5, 0);
		//		gbc_pickPartner.anchor = GridBagConstraints.WEST;
		//		gbc_pickPartner.gridx = 0;
		//		gbc_pickPartner.gridy = 0;
		//		panel.add(pickPartner, gbc_pickPartner);
		pickDocType = new VLookup("C_DocType_ID", true, false, true, lookupDocType);

		pickCurrencyInvoice = new VLookup("I_C_Currency_ID", true, false, true, lookupCurrInvoice);
		pickCurrencyInvoice.setValue(bp.getC_Currency_ID());
		pickCurrencyInvoice.addVetoableChangeListener(this);

		pickCurrencyBOE = new VLookup("B_C_Currency_ID", true, false, true, lookupCurrBOE);
		pickCurrencyBOE.setValue(bp.getC_Currency_ID());
		pickCurrencyBOE.addVetoableChangeListener(this);
		pickConversionType = new VLookup("C_ConversionType_ID", true, false, true, lookupConversionType);
		pickConversionType.setValue(MConversionType.getDefault(Env.getAD_Client_ID(Env.getCtx())));
		pickConversionType.addVetoableChangeListener(this);
		pickDocType.addVetoableChangeListener(this);
		pickDocType.setValue(bp.getC_DocType_ID());

		//parameterPanel.setLayout(new ALayout());
		GridBagLayout gbl_parameterPanel = new GridBagLayout();
		gbl_parameterPanel.columnWidths = new int[]{1, 0, 0};
		gbl_parameterPanel.rowHeights = new int[]{1, 0, 0};
		gbl_parameterPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_parameterPanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		parameterPanel.setLayout(gbl_parameterPanel);

		//		GridBagConstraints gbcx = new GridBagConstraints();
		//		gbcx.fill = GridBagConstraints.BOTH;
		//		gbcx.gridx = 0;
		//		gbcx.gridy = 1;		
		//		parameterPanel.add(pickPartner, gbcx);

		//		GridBagConstraints gbc_BetweenofBoEField = new GridBagConstraints();
		//		gbc_BetweenofBoEField.fill = GridBagConstraints.BOTH;
		//		gbc_BetweenofBoEField.gridx = 0;
		//		gbc_BetweenofBoEField.gridy = 0;
		//		parameterPanel.add(BetweenofBoEField, gbc_BetweenofBoEField);				
		//		//		parameterPanel.add(lretention, null);
		//		GridBagConstraints gbc_1 = new GridBagConstraints();
		//		gbc_1.fill = GridBagConstraints.BOTH;
		//		gbc_1.gridx = 0;
		//		gbc_1.gridy = 0;
		//		JLabel label_7 = new JLabel(Msg.translate(Env.getCtx(), "GenDate"));
		//		parameterPanel.add(label_7, gbc_1);		
		//		GridBagConstraints gbc_4 = new GridBagConstraints();
		//		gbc_4.fill = GridBagConstraints.BOTH;
		//		gbc_4.gridx = 0;
		//		gbc_4.gridy = 0;
		//		JLabel label_6 = new JLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID")+" "+Msg.translate(Env.getCtx(), "C_Currency_ID"));
		//		parameterPanel.add(label_6, gbc_4);
		//		GridBagConstraints gbc_2 = new GridBagConstraints();
		//		gbc_2.fill = GridBagConstraints.BOTH;
		//		gbc_2.gridx = 0;
		//		gbc_2.gridy = 0;
		//		JLabel label_5 = new JLabel(Msg.translate(Env.getCtx(), "C_DocType_ID"));
		//		parameterPanel.add(label_5, gbc_2);		
		//		GridBagConstraints gbc_3 = new GridBagConstraints();
		//		gbc_3.fill = GridBagConstraints.BOTH;
		//		gbc_3.gridx = 0;
		//		gbc_3.gridy = 0;
		//		CLabel label_4 = new CLabel(Msg.translate(Env.getCtx(), "Rate"));
		//		parameterPanel.add(label_4, gbc_3);
		//		GridBagConstraints gbc_5 = new GridBagConstraints();
		//		gbc_5.fill = GridBagConstraints.BOTH;
		//		gbc_5.gridx = 0;
		//		gbc_5.gridy = 0;
		//		CLabel label_3 = new CLabel(Msg.translate(Env.getCtx(), "C_BOE_ID")+" "+Msg.translate(Env.getCtx(), "C_Currency_ID"));
		//		parameterPanel.add(label_3, gbc_5);
		//		GridBagConstraints gbc_6 = new GridBagConstraints();
		//		gbc_6.fill = GridBagConstraints.BOTH;
		//		gbc_6.gridx = 0;
		//		gbc_6.gridy = 0;
		//		JLabel label_2 = new JLabel(Msg.translate(Env.getCtx(), "Days"));
		//		parameterPanel.add(label_2, gbc_6);
		//		
		//		GridBagConstraints gbc_7 = new GridBagConstraints();
		//		gbc_7.fill = GridBagConstraints.BOTH;
		//		gbc_7.gridx = 0;
		//		gbc_7.gridy = 0;
		//		CLabel label = new CLabel(Msg.translate(Env.getCtx(), "C_ConversionType_ID"));
		//		parameterPanel.add(label, gbc_7);		
		//		parameterPanel.add(pickGenDate, null);
		//		parameterPanel.add(pickDocType, null);
		//		parameterPanel.add(pickRate, null);		
		//		parameterPanel.add(pickCurrencyInvoice, null);
		//		parameterPanel.add(pickCurrencyBOE, null);
		//		parameterPanel.add(pickConversionType, null);

		//parameterPanel.setPreferredSize(new Dimension (200,170));

		GridBagConstraints gbc_parameters = new GridBagConstraints();
		gbc_parameters.fill = GridBagConstraints.BOTH;
		gbc_parameters.insets = new Insets(0, 0, 5, 0);
		gbc_parameters.anchor = GridBagConstraints.NORTHWEST;
		gbc_parameters.gridx = 0;
		gbc_parameters.gridy = 0;		
		panel.add(parameterPanel, gbc_parameters);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		JLabel label_1 = new JLabel(Msg.translate(Env.getCtx(), "C_BPartner_ID"));
		parameterPanel.add(label_1, gbc);

		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		parameterPanel.add(pickPartner, gbc_lblNewLabel);

		//						GridBagConstraints gbc_lookup_x = new GridBagConstraints();
		//						gbc_lookup_x.insets = new Insets(0, 0, 5, 0);
		//						gbc_lookup_x.gridx = 1;
		//						gbc_lookup_x.gridy = 0;
		//						parameterPanel.add(lookup_x, gbc_lookup_x);

		GridBagConstraints gbc_lookup = new GridBagConstraints();
		gbc_lookup.insets = new Insets(0, 0, 0, 5);
		gbc_lookup.gridx = 0;
		gbc_lookup.gridy = 1;
		parameterPanel.add(lookup, gbc_lookup);

		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		//JButton button = new JButton("buton");

		JSplitPane splitPane = new JSplitPane();
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.anchor = GridBagConstraints.NORTHWEST;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 2;
		panel.add(splitPane, gbc_splitPane);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.add(graphComponent, JSplitPane.TOP);				
		splitPane.add(invoicePanel, JSplitPane.BOTTOM);

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


		BorderLayout bl_invoicePanel = new BorderLayout();
		invoicePanel.setLayout(bl_invoicePanel);
		invoicePanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID")) , BorderLayout.NORTH);
		invoicePanel.add(invoiceScrollPane, BorderLayout.CENTER);
		invoicePanel.add(invoiceInfo, BorderLayout.SOUTH);		
		invoiceScrollPane.setViewportView(invoiceView);
		getContentPane().add(panel, BorderLayout.CENTER);
		return panel;
	}

	public void init(int WindowNo, FormFrame frame) {
		m_WindowNo = WindowNo;
		m_frame = frame;		
		getContentPane().add(Initialize(), BorderLayout.CENTER);
	}

	public void vetoableChange(PropertyChangeEvent e)
	throws PropertyVetoException {		

		String name = e.getPropertyName();
		Object value = e.getNewValue();		
		log.config(name + "=" + value);
		if (value == null)
			return;

		if (name.equals("C_BPartner_ID"))
		{
			//			m_Rate = MConversionRate.getRate ( getCurrencyBOE(), 
			//					getCurrencyInvoice(), 
			//					(Timestamp) pickGenDate.getValue(), 
			//					getConversionType(),
			//					Env.getAD_Client_ID(Env.getCtx()), 
			//					Env.getAD_Org_ID(Env.getCtx()));
			//			pickRate.setValue(m_Rate);
			bp.setC_BPartner_ID((Integer) value);								
			//m_IsSOTrx = partner.isCustomer();
			//m_retention = partner.isRetention() && m_IsSOTrx;						
			loadBPartner();
		}



	}

	private void loadBPartner() {
		if (!bp.CheckIsOK())
			return;
		//MBPartner partner = new MBPartner(Env.getCtx(), (Integer) value , null );

		//generateButton.setEnabled(false);
		//processButton.setEnabled(false);
		//PortfolioButton.setEnabled(false);
		//pickDateAllocation.setEnabled(false);
		//AccountButton.setEnabled(false);
		//m_C_BPartner_Location_ID = 0;
		//m_RowActiveHistory = -1;
		//		log.config("BPartner=" + m_C_BPartner_ID + ", Cur=" + m_C_Currency_ID);
		//		//  Need to have three values
		//		if (m_C_BPartner_ID == 0) // || m_C_Currency_ID == 0 )
		//			return;

		Vector<Vector<Object>> data = new Vector<Vector<Object>>();

		StringBuilder sql = new StringBuilder("SELECT i.DateInvoiced,i.DocumentNo,i.C_Invoice_ID,"); //  1..3		
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
		sql.append(bp.IsSOTrx() ? "'Y'" : "'N'");
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
		sql.append(bp.IsSOTrx() ? "'Y'" : "'N'");
		log.fine("InvSQL=" + sql.toString());
		try
		{
			int C_Currency_ID = MClient.get(Env.getCtx()).getC_Currency_ID();
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, C_Currency_ID);
			pstmt.setInt(2, bp.getC_Currency_ID());
			pstmt.setTimestamp(3, bp.getTransaction()); // fecha de pago para ver si aplica descuento
			pstmt.setInt(4, C_Currency_ID);
			pstmt.setInt(5, bp.getC_BPartner_ID());
			// boe
			pstmt.setInt(6, C_Currency_ID);
			pstmt.setInt(7, bp.getC_Currency_ID());
			pstmt.setInt(8, bp.getC_BPartner_ID());
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
					//					m_C_BPartner_Location_ID = row.getC_BPartner_Location_ID();
					//					row.setConvertedTo(C_CurrencyTo);					
					DefaultObjectViewModel mModel= (DefaultObjectViewModel) invoiceView.getDataModel();
					Object SelectedRow = invoiceView.getSelectedRowObject(); 
					mModel.updateRow(SelectedRow,row);					
				}

				//				BigDecimal open = rs.getBigDecimal("ConvertedOpen");
				//				if (open == null)		//	no conversion rate
				//					open = Env.ZERO;				
				//				if (Env.ZERO.compareTo(open) != 0)
				//				{
				//					m_C_BPartner_Location_ID = rs.getInt("C_BPartner_Location_ID");
				//					invoiceTable.setRowCount(row+1);
				//					invoiceTable.setValueAt(new Boolean(false), row, 0);   //  C_Order_ID
				//					invoiceTable.setValueAt(rs.getTimestamp("DateInvoiced"), row, 1);   //  C_Order_ID
				//					invoiceTable.setValueAt(rs.getString("C_DocTypeName"), row, 2);   //  C_Order_ID
				//					invoiceTable.setValueAt(rs.getString("Serial"), row, 3);   //  C_Order_ID
				//					KeyNamePair pp = new KeyNamePair(rs.getInt(3), rs.getString(2));
				//					invoiceTable.setValueAt(pp, row, 4);   //  C_Order_ID
				//					invoiceTable.setValueAt(rs.getString("ISO_Code"), row, 5);   //  C_Order_ID
				//					invoiceTable.setValueAt(rs.getBigDecimal("GrandTotal"), row, 6);   //  C_Order_ID
				//					invoiceTable.setValueAt(rs.getBigDecimal("ConvertedAmount"), row, 7);   //  C_Order_ID				
				//					invoiceTable.setValueAt(open, row, 8);   //  C_Order_ID
				//					BigDecimal discount = rs.getBigDecimal("Discount");
				//					if (discount == null)	//	no concersion rate
				//						discount = Env.ZERO;
				//					invoiceTable.setValueAt(discount, row, 9);   //  C_Order_ID
				//					invoiceTable.setValueAt(rs.getBoolean("IsInvoice"), row, 10);   //  C_Order_ID
				//					row++;
				//				}
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		//setHistoryTable(false);
		//setcounterInvoiceSelected(0);
		//calcTotalInvoiceTableSelected();
		//clean(boeTable);		
	}
	private class BusinessPartner {
		private int m_BPartner_ID = 0;
		private int m_Currency_ID = 0;
		private Timestamp Transaction = null;
		private boolean m_SOTrx;
		private int m_C_DocType_ID = 0;
		public Integer getC_BPartner_ID() {
			return m_BPartner_ID;
		}
		public Integer getC_DocType_ID() {
			return m_C_DocType_ID;
		}
		public void setC_DocType_ID(int C_DocType_ID) {
			m_C_DocType_ID = C_DocType_ID;

		}
		public void reset() {
			// TODO Auto-generated method stub

		}
		public boolean IsSOTrx() {			
			return m_SOTrx;
		}

		public void setIsSOTrx(boolean isSOTrx)
		{
			m_SOTrx = isSOTrx;
		}

		public boolean CheckIsOK() {
			boolean isOK = false;
			if (m_BPartner_ID > 0 && m_Currency_ID > 0)
			{
				isOK = true;
			}
			return isOK;
		}

		public void setC_BPartner_ID(Integer m_BPartner_ID) {
			this.m_BPartner_ID = m_BPartner_ID;
		}
		public Integer getC_Currency_ID() {
			return m_Currency_ID;
		}
		public void setC_Currency_ID(Integer m_Currency_ID) {
			this.m_Currency_ID = m_Currency_ID;
		}
		public Timestamp getTransaction() {
			return Transaction;
		}
		public void setTransaction(Timestamp transaction) {
			Transaction = transaction;
		}
	}
	public void calculateinvoice()
	{

	}
	public void calculateboe()
	{

	}
}
