package org.xendra.apps.form;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import org.adempiere.util.ProcessUtil;
import org.compiere.apps.ADialog;
import org.compiere.apps.ConfirmPanel;
import org.compiere.apps.StatusBar;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import org.compiere.grid.ed.VLookup;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MAllocationLine;
import org.compiere.model.MDocType;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPInstance;
import org.compiere.model.MStorage;
import org.compiere.model.MUOM;
import org.compiere.model.MWarehouse;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.reference.REF_C_OrderDeliveryRule;
import org.compiere.print.MPrintFormat;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfo;

import java.awt.Insets;

import org.compiere.grid.ed.VDate;
import org.compiere.swing.CLabel;
import org.compiere.swing.CPanel;
import org.compiere.swing.CTabbedPane;
import org.compiere.swing.CTextField;
import org.compiere.grid.ed.VNumber;
import org.compiere.swing.CCheckBox;

import javax.swing.JScrollPane;

import org.xendra.exceptions.XendraException;
import org.xendra.line.LineKeyAdapter;
import org.xendra.objectview.DefaultObjectViewModel;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.ObjectView;
import org.xendra.objectview.ObjectViewModel;
import org.xendra.objectview.IObjetViewColumn;
import org.xendra.wf.WorkflowUtils;
import org.compiere.swing.CTextPane;
import org.compiere.util.ASyncProcess;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Trx;
import org.compiere.util.Util;

import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import javax.swing.SwingConstants;

import java.awt.FlowLayout;

public class VCreditMemoVendorGen extends CPanel
implements FormPanel, 
ActionListener,
ChangeListener, 
ASyncProcess, 				
VetoableChangeListener
{

	private CPanel contentPane;
	private String mTextToFind = "";
	ConfirmPanel confirmPanelSel;
	CTabbedPane tabbedPane;
	JPanel selNorthPanel;
	CPanel NorthPanel;
	CLabel lInvoice;
	VLookup pickInvoice;
	CCheckBox fAllocate;
	CLabel lSerial;
	CTextField textSerial;
	CLabel lblDocumentoNo;
	CTextField textDocNumber;
	CLabel lDateDoc;
	VDate pickDateDoc;
	CLabel lDocType;
	VLookup pickDocType;
	CLabel lDocAction;
	VLookup pickDocAction;
	CLabel lWarehouse;
	VLookup pickWarehouse;
	CLabel lDeliveryRule;
	VLookup pickDeliveryRule;
	JPanel selPanel;
	CTabbedPane selCenterPanel;
	JPanel chargePanel;	
	ObjectView viewCreditMemo;
	CLabel lblCargo;
	VLookup pickCharge;
	VNumber TotalCharge;
	CTextPane info;
	JPanel CreditMemoLinePanel;
	JScrollPane scrollPane;
	CLabel TotalLines;
	private int m_WindowNo;
	private FormFrame m_frame;
	private LineKeyAdapter lkaCreditMemo;
	private DefaultObjectViewModel modelCreditMemo;
	private static CLogger log = CLogger.getCLogger(VCreditMemoVendorGen.class);
	private StatusBar statusBar = new StatusBar();

	private Integer m_C_Invoice_ID = 0;
	private Integer m_C_CreditMemo_ID = 0;
	private Trx trx = null;

	private StringBuffer iTextInOutGenerated;
	private boolean			m_selectionActive = true;
	private Object 			m_C_BPartner_ID = null;
	CLabel lDateAcct;
	VDate pickDateAcct;

	private int SelectedColumn;
	private int SelectedRow;
	CPanel CreditMemoPanel;
	ConfirmPanel confirmPanelGen;
	CPanel genPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					org.compiere.Xendra.startupEnvironment(true);
					VCreditMemoVendorGen frame = new VCreditMemoVendorGen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public VCreditMemoVendorGen() throws Exception {
		Initialize();
	}


	/**
	 *	Initialize Panel
	 *  @param WindowNo window
	 *  @param frame frame
	 */
	public void init (int WindowNo, FormFrame frame)
	{
		log.info("");
		m_WindowNo = WindowNo;
		m_frame = frame;
		try
		{
			configureObjectView();
			CPanel panel = Initialize();			
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
		}
		catch(Exception ex)
		{
			log.log(Level.SEVERE, "init", ex);
		}
	}	//	init

	private CPanel Initialize() {
		setBounds(100,100, 797, 455);		
		contentPane = new CPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0, 0));

		tabbedPane = new CTabbedPane();
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		selPanel = new JPanel();
		tabbedPane.addTab(Msg.getMsg(Env.getCtx(), "Select"), null, selPanel, null);
		selPanel.setLayout(new BorderLayout(0, 0));

		lInvoice = new CLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID"));
		pickInvoice = new VLookup();
		pickInvoice.addVetoableChangeListener(this);
		pickInvoice.isUpdateable = true;
		pickInvoice.LookupName = "C_Invoice_ID";
		pickInvoice.m_DisplayType = DisplayType.Search;
		pickInvoice.m_AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, "C_Invoice_ID");
		pickInvoice.configure();
		fAllocate = new CCheckBox();
		fAllocate.setText("NC descuenta a esta factura");
		lDateAcct = new CLabel();
		lDateAcct.setText("Fecha contable:");
		pickDateAcct = new VDate();
		lSerial = new CLabel();
		lSerial.setText(Msg.translate(Env.getCtx(), "Serial"));
		textSerial = new CTextField(5);
		lblDocumentoNo = new CLabel();
		lblDocumentoNo.setText(Msg.translate(Env.getCtx(), "DocumentNo"));
		textDocNumber = new CTextField(10);
		lDateDoc = new CLabel();
		lDateDoc.setText("Fecha de envio:");
		pickDateDoc = new VDate();
		lDocType = new CLabel();
		lDocType.setText("Tipo de Documento");
		pickDocType = new VLookup();
		pickDocType.m_AD_Reference_Value_ID = 170;
		pickDocType.ValidationCode = "C_DocType.DocBaseType IN ('POO') AND C_DocType.IsActive='Y'";
		pickDocType.m_DisplayType = DisplayType.Table;
		pickDocType.m_AD_Column_ID = Util.getColumnID(MOrder.Table_ID, "C_DocTypeTarget_ID");
		pickDocType.isUpdateable = true;
		pickDocType.LookupName = "C_DocType_ID";
		pickDocType.configure();
		lWarehouse = new CLabel();
		lWarehouse.setText("Almacen");
		pickWarehouse = new VLookup();
		pickWarehouse.isUpdateable = true;
		pickWarehouse.m_DisplayType = DisplayType.TableDir;
		pickWarehouse.m_AD_Column_ID = Util.getColumnID(MInOut.Table_ID, "M_Warehouse_ID");
		pickWarehouse.LookupName="M_Warehouse_ID";
		pickWarehouse.configure();
		lDeliveryRule = new CLabel();
		lDeliveryRule.setText("Regla de entrega");
		pickDeliveryRule = new VLookup();
		pickDeliveryRule.LookupName = "DeliveryRule";
		pickDeliveryRule.isUpdateable = true;
		pickDeliveryRule.m_DisplayType = DisplayType.List;		
		pickDeliveryRule.m_AD_Column_ID = Util.getColumnID(MOrder.Table_ID, "DeliveryRule");
		pickDeliveryRule.configure();
		//
		lDocAction = new CLabel();
		lDocAction.setText("Accion");
		pickDocAction = new VLookup();
		pickDocAction.m_AD_Reference_Value_ID = 135;
		//pickDocAction.ValidationCode = "C_DocType.DocBaseType IN ('POO') AND C_DocType.IsActive='Y'";
		pickDocAction.m_DisplayType = DisplayType.List;
		pickDocAction.m_AD_Column_ID = Util.getColumnID(MOrder.Table_ID, "DocAction");
		pickDocAction.isUpdateable = true;
		pickDocAction.LookupName = "DocAction";
		pickDocAction.configure();

		selNorthPanel = new JPanel();		
		selNorthPanel.setLayout(new MigLayout());
		selNorthPanel.add(lInvoice);
		selNorthPanel.add(pickInvoice);		
		selNorthPanel.add(lDateAcct);
		selNorthPanel.add(pickDateAcct);
		selNorthPanel.add(fAllocate, "wrap");
		selNorthPanel.add(lSerial);
		selNorthPanel.add(textSerial);
		selNorthPanel.add(lblDocumentoNo);
		selNorthPanel.add(textDocNumber);
		selNorthPanel.add(lDateDoc);
		selNorthPanel.add(pickDateDoc, "wrap");
		selNorthPanel.add(lDocType);
		selNorthPanel.add(pickDocType);
		selNorthPanel.add(lWarehouse);
		selNorthPanel.add(pickWarehouse);
		selNorthPanel.add(lDeliveryRule);
		selNorthPanel.add(pickDeliveryRule, "wrap");
		selNorthPanel.add(lDocAction);
		selNorthPanel.add(pickDocAction);
		selPanel.add(selNorthPanel, BorderLayout.NORTH);
		//
		selCenterPanel = new CTabbedPane();
		selPanel.add(selCenterPanel, BorderLayout.CENTER);

		CreditMemoLinePanel = new JPanel();
		CreditMemoLinePanel.setBorder(null);
		selCenterPanel.addTab("Factura", null, CreditMemoLinePanel, null);
		CreditMemoLinePanel.setLayout(new BorderLayout(0, 0));				

		CreditMemoPanel = new CPanel();
		CreditMemoLinePanel.add(CreditMemoPanel, BorderLayout.CENTER);
		CreditMemoPanel.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane(viewCreditMemo);
		CreditMemoPanel.add(scrollPane, BorderLayout.CENTER);

		TotalLines = new CLabel();
		CreditMemoPanel.add(TotalLines, BorderLayout.SOUTH);
		TotalLines.setHorizontalAlignment(SwingConstants.RIGHT);
		TotalLines.setFont(new Font("Tahoma", Font.PLAIN, 30));
		TotalLines.setText("0.00");

		chargePanel = new JPanel();
		chargePanel.setLayout(new MigLayout());

		lblCargo = new CLabel();
		lblCargo.setText("cargo");
		chargePanel.add(lblCargo);		
		pickCharge = new VLookup();
		chargePanel.add(pickCharge);
		TotalCharge = new VNumber();
		chargePanel.add(TotalCharge);

		selCenterPanel.addTab("Cargo", null, chargePanel, null);

		confirmPanelSel = new ConfirmPanel(true);
		confirmPanelSel.addActionListener(this);
		selPanel.add(confirmPanelSel, BorderLayout.SOUTH);

		genPanel = new CPanel();
		tabbedPane.addTab(Msg.getMsg(Env.getCtx(), "Generate"), null, genPanel, null);
		genPanel.setLayout(new BorderLayout(0, 0));

		info = new CTextPane();
		genPanel.add(info, BorderLayout.CENTER);
		info.setReadWrite(false);

		confirmPanelGen = new ConfirmPanel(false, true, false, true, false, false, true);
		confirmPanelGen.addActionListener(this);
		genPanel.add(confirmPanelGen, BorderLayout.SOUTH);		
		return contentPane;
	}

	@SuppressWarnings("serial")
	private void configureObjectView() {
		IObjetViewColumn[] columnsCreditMemo = getColumns();

		modelCreditMemo = new DefaultObjectViewModel(columnsCreditMemo, null);

		viewCreditMemo = new ObjectView(modelCreditMemo);
		viewCreditMemo.setColumnSelectionAllowed(false);
		viewCreditMemo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		viewCreditMemo.configcontrols(m_WindowNo);
		viewCreditMemo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
		viewCreditMemo.getInputMap(JComponent.WHEN_FOCUSED)		     	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
		Action actions = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				//System.out.println("x");
			}
		}; 		      		      		
		viewCreditMemo.getActionMap().put("KEYENTER", actions);		      
		viewCreditMemo.setMakeIndex(true);

		viewCreditMemo.getSelectionModel().addListSelectionListener(
				new ListSelectionListener() {					
					public void valueChanged(ListSelectionEvent event) {
						List selection = viewCreditMemo.getSelectedRowObjects();
						CreditRow row = null;
						if (selection.size() > 0)
						{
							row = (CreditRow) selection.get(0);
							if (row != null && row.getM_Product_ID() > 0)
								Env.setContext (Env.getCtx (), m_WindowNo, "M_Product_ID", row.getM_Product_ID());
						}			  				

					}
				}
				);

		lkaCreditMemo = new LineKeyAdapter();
		lkaCreditMemo.setContext(m_frame, this, viewCreditMemo, true /* show dialog info */, m_WindowNo, null, Env.ZERO, mTextToFind);
		lkaCreditMemo.funcNextColumn("nextcolumn");
		viewCreditMemo.addKeyListener(lkaCreditMemo);
		viewCreditMemo.setContext(this);
		viewCreditMemo.funcCalculateTotalLines("calculateCreditMemoVendorTotal");		
	}

	private IObjetViewColumn[] getColumns() {
		ArrayList<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		Method getter;
		Method setter;
		try {
			getter = CreditRow.class.getDeclaredMethod("getSelect", null);
			setter = CreditRow.class.getDeclaredMethod("setSelect", new Class[] {Boolean.class});
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.getMsg(Env.getCtx(), "Select"), 
							null,
							(Method)   getter,
							(Method)   setter,
							true  /* visible */,
							null  /* format */ ,
							true /* sortable */,
							false /* searchable */,
							false, 0, 0
							));
			//
			getter = CreditRow.class.getDeclaredMethod("getRowID", null);
			setter = CreditRow.class.getDeclaredMethod("setRowID", new Class[] {Integer.class});
			newcolumns.add(new DefaultTableViewColumn
					(
							Util.cleanAmp(Msg.translate(Env.getCtx(), "Sequence")), 
							null,
							(Method)   getter,
							(Method)   setter,
							true  /* visible */,
							null  /* format */ ,
							true /* sortable */,
							false /* searchable */,
							false, 0, 0
							));
			//		 		    
			getter = CreditRow.class.getDeclaredMethod("getName", null);
			setter = null;
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.translate(Env.getCtx(), "Name"), 
							null,
							(Method)   getter,
							(Method)   setter,
							true  /* visible */,
							null  /* format */ ,
							true /* sortable */,
							false /* searchable */,
							false, 0, 0
							));		    
			//		 		    
			getter = CreditRow.class.getDeclaredMethod("getM_AttributeSetInstance_ID", null);
			setter = CreditRow.class.getDeclaredMethod("setM_AttributeSetInstance_ID", new Class[] {Integer.class});
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.translate(Env.getCtx(), "M_AttributeSetInstance_ID"), 
							null,
							(Method)   getter,
							(Method)   setter,
							true /* visible */, 
							null /* format */ , 
							true /* sortable */	, 
							false /* searchable */, 
							false, 
							8767, 
							35
							));		    		    
			getter = CreditRow.class.getDeclaredMethod("getQtyEntered", null);
			setter = CreditRow.class.getDeclaredMethod("setQtyEntered", new Class[] {BigDecimal.class});
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.translate(Env.getCtx(), "QtyEntered"),
							null,
							(Method)   getter,
							(Method)   setter,
							true  /* visible */,
							null  /* format */ ,
							true /* sortable */,
							false /* searchable */,
							false, 0, 0
							));
			//
			getter = CreditRow.class.getDeclaredMethod("getQtyInvoiced", null);
			setter = null;
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.translate(Env.getCtx(), "QtyInvoiced"),
							null,
							(Method)   getter,
							(Method)   setter,
							true  /* visible */,
							null  /* format */ ,
							true /* sortable */,
							false /* searchable */,
							false, 0, 0
							));		    
			//
			getter = CreditRow.class.getDeclaredMethod("getLineNet", null);
			setter = null;
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.translate(Env.getCtx(), "LineNet"),
							null,
							(Method)   getter,
							(Method)   setter,
							true  /* visible */,
							null  /* format */ ,
							true /* sortable */,
							false /* searchable */,
							false, 0, 0
							));		    
			//		 		    
			getter = CreditRow.class.getDeclaredMethod("getC_UOM_ID", null);
			setter = CreditRow.class.getDeclaredMethod("setC_UOM_ID", new Class[] {Integer.class});
			newcolumns.add(new DefaultTableViewColumn
					(
							Msg.translate(Env.getCtx(), "C_UOM_ID"), 
							null,
							(Method)   getter,
							(Method)   setter,
							true /* visible */, 
							null /* format */ , 
							true /* sortable */	, 
							false /* searchable */, 
							false, 
							2222, 
							0
							));
		} catch (Exception e) {
			e.printStackTrace();
		}
		IObjetViewColumn[] columns = new IObjetViewColumn[newcolumns.size ()];
		newcolumns.toArray(columns);
		return columns;		  
	}

	public void NewLine(CreditRow row) {
		Boolean lContinue = false;
		if (row != null)
		{
			if (row.getQtyInvoiced().compareTo(Env.ZERO) > 0)
				lContinue = true;
		}
		else
			lContinue = true;
		if (lContinue)
		{
			if ( viewCreditMemo.getCellEditor() != null )
				viewCreditMemo.getCellEditor().stopCellEditing();					
			AddLine();
		}
	}

	private void AddLine()
	{
		SelectedColumn = 0;
		CreditRow newrow = new CreditRow();
		( (DefaultObjectViewModel) this.viewCreditMemo.getDataModel()).addRow(newrow);    	
		SelectedRow = viewCreditMemo.getRowCount()-1;
		Rectangle rect = viewCreditMemo.getVisibleRect();
		Rectangle cRect = viewCreditMemo.getCellRect(SelectedRow, SelectedColumn, true);
		rect.y = cRect.y;
		rect.height = cRect.height;
		viewCreditMemo.scrollRectToVisible(rect);
		viewCreditMemo.changeSelection(SelectedRow, SelectedColumn , false, false);
		viewCreditMemo.repaint();		
	}


	@Override
	public void dispose() {
		if (m_frame != null)
			m_frame.dispose();
		m_frame = null;		
	}

	public void nextcolumn() {
		int nextColumn = lkaCreditMemo.getSelectedColumn() + 1;
		if ( nextColumn > viewCreditMemo.getColumnCount() )
			nextColumn = 0;					
		nextcolumn(nextColumn);
	}

	public void nextcolumn(int i) {
		int nextColumn = i;
		Rectangle rect = viewCreditMemo.getVisibleRect();
		Rectangle cRect = viewCreditMemo.getCellRect(lkaCreditMemo.getSelectedRow(), nextColumn, true);
		rect.y = cRect.y;
		rect.height = cRect.height;
		viewCreditMemo.scrollRectToVisible(rect);
		viewCreditMemo.changeSelection(lkaCreditMemo.getSelectedRow(), nextColumn, false, false);			        							
	}

	public void calculateCreditMemoVendorTotal()
	{
		ObjectViewModel adapter= viewCreditMemo.getDataModel();
		BigDecimal Total = Env.ZERO;
		for (int j = 0; j < adapter.getRowCount(); j++)
		{
			CreditRow row = (CreditRow) adapter.getRowObject(j);
			if (row.getSelect())
				Total = Total.add(row.getLineNet());
		}		
		if (Total == null)
			Total = Env.ZERO;
		TotalLines.setText(Total.toString());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		log.info("Cmd=" + e.getActionCommand());
		if (e.getActionCommand().equals(ConfirmPanel.A_CANCEL))
		{
			dispose();
			return;
		}		
		if (e.getActionCommand().equals(ConfirmPanel.A_PRINT))
		{
			Integer pf_ID = MPrintFormat.getPrintFormat_ID("CreditMemoWizard", MInvoice.Table_ID, Env.getAD_Client_ID(Env.getCtx()));
			if (pf_ID > 0)
			{
				MPrintFormat pf = MPrintFormat.get(Env.getCtx(), pf_ID, false);

				ProcessInfo pi = new ProcessInfo ("", pf.getJasperProcess_ID(), pf.getAD_Table_ID(), m_C_CreditMemo_ID);
				int xx = pi.getAD_Process_ID();

				MPInstance instance = new MPInstance(Env.getCtx(),pi.getAD_Process_ID(), m_C_CreditMemo_ID);
				if (!instance.save())
				{

				}		
				ProcessInfo pinfo = new ProcessInfo ("Nota de credito", xx);
				pinfo.setAD_PInstance_ID (instance.getAD_PInstance_ID());
				pinfo.setRecord_ID(m_C_CreditMemo_ID);				
				String trxName = "creditMemoGenerator";	
				trx = Trx.get(trxName, true);	//trx needs to be committed too

				ProcessUtil.startJavaProcess(Env.getCtx(), pinfo, trx);

				trx.close();
			}
			return;
		}
		if (m_selectionActive)
		{
			Boolean isBasedinLines = selCenterPanel.getSelectedIndex() == 0;
			String error = "";
			if ( isBasedinLines)
			{
				ObjectViewModel adapter= viewCreditMemo.getDataModel();
				int activerows = 0;
				for (int j = 0; j < adapter.getRowCount(); j++)
				{
					CreditRow row = (CreditRow) adapter.getRowObject(j);					
					if (row != null  && row.getSelect())
					{
						BigDecimal available = MStorage.getQtyAvailable	((Integer) pickWarehouse.getValue(), 0,row.getM_Product_ID(), 0, null);
						if (available == null)
							available = Env.ZERO;
						if (row.getQtyInvoiced().compareTo(available) > 0 && pickDeliveryRule.getValue().equals(REF_C_OrderDeliveryRule.Availability))
						{
							if (error.length() == 0)
								error = " no existe stock para: ";
							else 
								error.concat(",");
							String ProductName = DB.getSQLValueString(null, "Select name from M_Product where M_Product_ID=?", row.getM_Product_ID());
							if (ProductName == null)
								ProductName = "";
							error = error.concat(ProductName);

						}
						activerows++;
					}
				}	
				if (activerows == 0 )
					error = error.concat(" no se seleccionaron lineas\n");
				if (pickDocType.getValue() == null)
					error = error.concat(" no se definio el tipo de documento\n");
				if (textSerial.getValue().toString().length() == 0 )
					error = error.concat(" debe digitar la serie de la letra a generar");
				if (textDocNumber.getValue().toString().length() == 0 ) 
					error = error.concat(" debe digitar el numero de letra a generar");
				if ((Integer) pickWarehouse.getValue() == 0)
					error = error.concat(" debe escoger un almacen ");
			}
			else
			{
				if (pickCharge.getValue() == null)
					error = error.concat(" no se escogio el cargo\n");			

			}
			if (error.length() == 0)
				generateOrder (isBasedinLines);
			else
				ADialog.error(m_WindowNo, this, error);

		}
		else
			dispose();		
	}
	/**************************************************************************
	 *	Generate Order
	 */
	private void generateOrder (Boolean isBasedinLines)
	{		
		String trxName = "creditMemoVendorGenerator";	
		trx = Trx.get(trxName, true);	//trx needs to be committed too

		m_selectionActive = false;  //  prevents from being called twice
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "CreditMemoVendorGen"));

		try 
		{
			MInvoice invoicesrc = new MInvoice(Env.getCtx(), m_C_Invoice_ID, trxName);		

			if (isBasedinLines)
			{
				MOrder from = new MOrder(Env.getCtx(), invoicesrc.getC_Order_ID(), trxName);

				MDocType dt = MDocType.get(Env.getCtx(), (Integer) this.pickDocType.getValue());

				if (dt.getC_DocTypeInvoice_ID() == 0 || dt.getC_DocTypeShipment_ID() == 0)
					throw new XendraException("el tipo de documento debe tener asignado un tipo destino para Factura y/o para Guia");

				Timestamp dateDoc = (Timestamp ) pickDateDoc.getValue();
				Timestamp DateAcct = (Timestamp) pickDateAcct.getValue();
				if (dateDoc == null)
					dateDoc = Env.getContextAsDate(Env.getCtx(), "#Date");

				MOrder order = MOrder.copyFrom(	from, 
						dateDoc, 
						dt.getC_DocType_ID(), 
						from.isSOTrx(), false /* counter*/, true /*copyASI*/ , false /* include lines */ , trxName);
				MInvoice invoice = null;
				order.setM_Warehouse_ID((Integer) pickWarehouse.getValue());
				order.setC_DocType_ID(dt.getC_DocType_ID());
				order.setDeliveryRule((String) pickDeliveryRule.getValue());
				order.setDocStatus(DocAction.STATUS_Drafted);
				order.setDocAction(DocAction.ACTION_Complete);				
				if ( order.save(trxName) )
				{
					DefaultObjectViewModel adapter= (DefaultObjectViewModel) viewCreditMemo.getDataModel();
					int j = 0;
					while ( j < adapter.getRowCount())
					{
						CreditRow row = (CreditRow) adapter.getRowObject(j);
						if (row.getSelect())
						{
							MInvoiceLine iLine = new MInvoiceLine(Env.getCtx(), row.getC_InvoiceLine_ID(), trxName);
							if (iLine.getC_OrderLine_ID() == 0 )
								throw new XendraException("No existe una orden vinculada al producto "+row.getName());
							MOrderLine orderlineFrom = new MOrderLine(Env.getCtx(), iLine.getC_OrderLine_ID(), trxName);
							MOrderLine orderLineTo = new MOrderLine(order);							
							MOrderLine.copyValues(orderlineFrom, orderLineTo);
							orderLineTo.setQtyOrdered(Env.ZERO);
							orderLineTo.setQtyDelivered(Env.ZERO);
							orderLineTo.setQtyInvoiced(Env.ZERO);
							orderLineTo.setQtyReserved(Env.ZERO);
							orderLineTo.setOrder(order);
							orderLineTo.setC_Order_ID(order.getC_Order_ID());
							//orderLineTo.setQtyInvoiced(row.getQtyInvoiced());
							orderLineTo.setQtyOrdered(row.getQtyInvoiced());
							orderLineTo.setQtyEntered(row.getQtyEntered());
							//orderLineTo.setQtyOrdered(row.getQtyOrdered());
							orderLineTo.setLineNetAmt(row.getLineNet());							
							orderLineTo.setQtyDelivered(Env.ZERO);
							if (!orderLineTo.save(trxName)) {
								throw new XendraException(CLogger.retrieveErrorString(null));
							}
							else
							{
								//adapter.removeRow(j);
								((DefaultObjectViewModel) viewCreditMemo
										.getDataModel()).removeRow(row);								
								//( (DefaultTableViewModel) viewCreditMemo.getDataModel()).removeRows(viewCreditMemo.getSelectedRowObjects());
								j = 0;
								continue;
							}

						}
						j++;
					}						
					String action = (String) pickDocAction.getValue();				
					if (action == null)
						action = "";
					if (action.length() > 0)
					{
						String error = "";
						ProcessInfo pi = WorkflowUtils.Process(order, trxName);			
						if (!pi.isError())
						{									
							trx.commit();
							invoice = new MInvoice(Env.getCtx(), order.getC_Invoice_ID(), trxName);
						}
						else
						{
							throw new Exception(pi.getSummary());
						}
						generatorder_complete(order, invoice);
					}
				}
				else
					throw new Exception(CLogger.retrieveErrorString(null));
			}
			else
			{
				// is charge based
				MDocType dt = MDocType.get(Env.getCtx(), (Integer) this.pickDocType.getValue());
				MInvoice newInvoice = new MInvoice(Env.getCtx(), 0, trxName);
				newInvoice.setC_DocTypeTarget_ID(dt.getC_DocTypeInvoice_ID());
				newInvoice.setC_BPartner_ID(invoicesrc.getC_BPartner_ID());
				newInvoice.setIsSOTrx(false);
				newInvoice.setC_BPartner_Location_ID(invoicesrc.getC_BPartner_Location_ID());
				newInvoice.setC_Currency_ID(invoicesrc.getC_Currency_ID());
				newInvoice.setM_PriceList_ID(invoicesrc.getM_PriceList_ID());
				newInvoice.setSerial(textSerial.getValue().toString());
				newInvoice.setDocumentNo(textDocNumber.getValue().toString());					
				newInvoice.setRef_Invoice_ID(invoicesrc.getC_Invoice_ID());
				if (!newInvoice.save(trxName))
					throw new XendraException("La factura no se pudo grabar");
				MInvoiceLine iLine = new MInvoiceLine(newInvoice);
				iLine.setC_Charge_ID((Integer) this.pickCharge.getValue());
				BigDecimal totalCharge = (BigDecimal) TotalCharge.getValue(); 
				iLine.setPriceEntered(totalCharge);
				iLine.setPriceList(totalCharge);
				iLine.setPriceActual(totalCharge);
				iLine.setPriceLimit(totalCharge);
				iLine.setQtyEntered(Env.ONE);
				iLine.setQtyInvoiced(Env.ONE);
				if (!iLine.save(trxName))
					throw new XendraException("La linea no se pudo grabar");
				if (!newInvoice.calculateTaxTotal()) // setTotals
					throw new XendraException("no se pudo calcular el total");
				if (!newInvoice.save(trxName))
					throw new XendraException("La factura no se pudo grabar");				
				m_C_CreditMemo_ID =  newInvoice.getC_Invoice_ID();
				ProcessInfo pi = WorkflowUtils.Process(newInvoice, trxName);			
				if (!pi.isError())
				{									
					trx.commit();						
				}
				else
				{
					throw new Exception(pi.getSummary());
				}
				generatorder_complete(null, newInvoice);

			}
			if (this.fAllocate.isSelected())
			{
				MInvoice credit  = new MInvoice(Env.getCtx(), m_C_CreditMemo_ID, trxName);

				MAllocationHdr alloc = new MAllocationHdr(Env.getCtx(),
						false /* is manual */, 
						Env.getContextAsDate(Env.getCtx(), "#Date"), 
						invoicesrc.getC_Currency_ID(),
						"Factura : ".concat(invoicesrc.getDocumentNo()).concat("Nota de Credito: ").concat(textSerial.getValue().toString()).concat("-").concat(textDocNumber.getValue().toString()), 
						trxName);
				alloc.setAD_Org_ID(credit.getAD_Org_ID());	
				//alloc.save(trxName);
				if (alloc.save(trxName))
				{
					MAllocationLine aLineCredit  = null;
					MAllocationLine aLineInvoice = null;
					if (invoicesrc.isSOTrx())
					{
						aLineCredit  = new MAllocationLine (alloc, credit.getGrandTotal().negate(), Env.ZERO, Env.ZERO, Env.ZERO);
						aLineCredit.setC_Invoice_ID(m_C_CreditMemo_ID);
						aLineCredit.save();
						aLineInvoice = new MAllocationLine (alloc, credit.getGrandTotal(), Env.ZERO, Env.ZERO, Env.ZERO);
						aLineInvoice.setC_Invoice_ID(m_C_Invoice_ID);
						aLineInvoice.save();
					}
					else
					{
						aLineCredit  = new MAllocationLine (alloc, credit.getGrandTotal(), Env.ZERO, Env.ZERO, Env.ZERO);
						aLineCredit.setC_Invoice_ID(m_C_CreditMemo_ID);
						aLineCredit.save();
						aLineInvoice = new MAllocationLine (alloc, credit.getGrandTotal().negate(), Env.ZERO, Env.ZERO, Env.ZERO);
						aLineInvoice.setC_Invoice_ID(m_C_Invoice_ID);
						aLineInvoice.save();
					}	
					alloc.setDocStatus(alloc.completeIt());
					alloc.save(trxName);
				}
			}			
		} catch (Exception e) {
			trx.rollback();
			ADialog.error(m_WindowNo, this, e.getMessage());
			log.log(Level.SEVERE, "Exception while in process: "
					+ e.getMessage());
		}
		trx.close();
	}	//	generateShipments


	/**
	 *  Complete generating shipments.
	 *  Called from Unlock UI
	 *  @param pi process info
	 */
	private void generatorder_complete (MOrder order, MInvoice invoice)
	{
		//trx.commit();
		//  Switch Tabs
		tabbedPane.setSelectedIndex(1);
		//
		iTextInOutGenerated = new StringBuffer();
		iTextInOutGenerated.append("<br><br>");
		String docname = "";
		String docnro = "";
		if (order != null)
		{
			MDocType dt = MDocType.get(Env.getCtx(), order.getC_DocType_ID());
			docname = dt.getName();
			docnro = order.getDocumentNo();
			iTextInOutGenerated.append(String.format("<b>%s :", docname));
			iTextInOutGenerated.append(docnro);
			iTextInOutGenerated.append("</b><br><br>");
			MOrderLine[] fromLines = order.getLines();
			for (int i = 0; i < fromLines.length; i++)
			{
				MOrderLine line = fromLines[i];
				iTextInOutGenerated.append(line.getQtyInvoiced().setScale(2, BigDecimal.ROUND_HALF_UP));				
				iTextInOutGenerated.append(" ");
				iTextInOutGenerated.append(MUOM.get(Env.getCtx(), line.getC_UOM_ID()).getName());
				iTextInOutGenerated.append(" ");
				iTextInOutGenerated.append(line.getName());
				iTextInOutGenerated.append(" ");
				iTextInOutGenerated.append(line.getLineNetAmt().setScale(2, BigDecimal.ROUND_HALF_UP));
				iTextInOutGenerated.append("<br>");
			}			
		}
		else if (invoice != null)
		{
			MDocType dt = MDocType.get(Env.getCtx(), invoice.getC_DocType_ID());
			docname = dt.getName();
			docnro = invoice.getDocumentNo();
			iTextInOutGenerated.append(String.format("<b>%s :", docname));
			iTextInOutGenerated.append(docnro);
			iTextInOutGenerated.append("</b><br><br>");
			info.setText(iTextInOutGenerated.toString());			
			MInvoiceLine[] fromLines = invoice.getLines();
			for (int i = 0; i < fromLines.length; i++)
			{
				MInvoiceLine line = fromLines[i];
				iTextInOutGenerated.append(line.getQtyInvoiced().setScale(2, BigDecimal.ROUND_HALF_UP));				
				iTextInOutGenerated.append(" ");
				iTextInOutGenerated.append(MUOM.get(Env.getCtx(), line.getC_UOM_ID()).getName());
				iTextInOutGenerated.append(" ");
				iTextInOutGenerated.append(line.getName());
				iTextInOutGenerated.append(" ");
				iTextInOutGenerated.append(line.getLineNetAmt().setScale(2, BigDecimal.ROUND_HALF_UP));
				iTextInOutGenerated.append("<br>");
			}
		}
		//	Get results
	}   //  generatorder_complete


	/**************************************************************************
	 *  Lock User Interface.
	 *  Called from the Worker before processing
	 *  @param pi process info
	 */
	public void lockUI (ProcessInfo pi)
	{
		this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		this.setEnabled(false);
	}   //  lockUI

	/**
	 *  Unlock User Interface.
	 *  Called from the Worker when processing is done
	 *  @param pi result of execute ASync call
	 */
	public void unlockUI (ProcessInfo pi)
	{
		this.setEnabled(true);
		this.setCursor(Cursor.getDefaultCursor());
		//
		//generateShipments_complete(pi);
	}   //  unlockUI

	/**
	 *  Is the UI locked (Internal method)
	 *  @return true, if UI is locked
	 */
	public boolean isUILocked()
	{
		return this.isEnabled();
	}   //  isUILocked

	/**
	 *  Method to be executed async.
	 *  Called from the Worker
	 *  @param pi ProcessInfo
	 */
	public void executeASync (ProcessInfo pi)
	{
	}   //  executeASync

	public void vetoableChange(PropertyChangeEvent evt)	 {
		try {
			if (evt.getPropertyName().equals("C_Invoice_ID"))
			{
				if (evt.getNewValue() != null)
				{
					if ( evt.getNewValue() != evt.getOldValue() )
					{
						MInvoice invoice = MInvoice.get(Env.getCtx(), (Integer) evt.getNewValue());

						if (invoice.get_ID() == 0)
							throw new PropertyVetoException("Factura inexistente", evt);

						if (invoice.isSOTrx())
						{
							throw new PropertyVetoException("la factura debe ser de un proveedor", evt);
						}

						retrieveInvoiceLines((Integer) evt.getNewValue());
						//					
						if (invoice.get_ID() != 0)
							TotalCharge.setRange(Env.ZERO.doubleValue(), invoice.getGrandTotal().doubleValue());
					}
				}
			}
		}
		catch (PropertyVetoException e)
		{
			ADialog.info(m_WindowNo, this, e.getMessage());
		}
	}

	public void cleanlines()
	{
		viewCreditMemo.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		viewCreditMemo.selectAll();
		List selection = viewCreditMemo.getSelectedRowObjects();
		viewCreditMemo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		modelCreditMemo.removeRows(selection);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		int index = tabbedPane.getSelectedIndex();
		m_selectionActive = (index == 0);		
	}

	/**
	 *  Query Info
	 * @param pC_Invoice_ID 
	 */
	private void retrieveInvoiceLines(Integer pC_Invoice_ID)
	{
		m_C_Invoice_ID = pC_Invoice_ID;

		int AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());
		//  Create SQL

		StringBuffer sql = new StringBuffer("SELECT i.C_InvoiceLine_ID, " +
				"i.Line, i.M_Product_ID, i.QtyEntered, i.PriceActual, " +
				"i.C_UOM_ID, i.C_Invoice_ID, i.M_AttributeSetInstance_ID FROM c_invoiceLine i WHERE i.C_Invoice_ID=? ORDER BY i.Line");

		int count = 0;

		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, (Integer) pC_Invoice_ID);
			ResultSet rs = pstmt.executeQuery();

			DefaultObjectViewModel mModel= (DefaultObjectViewModel) viewCreditMemo.getDataModel();
			cleanlines();			
			//
			while (rs.next())
			{
				Integer M_Product_ID = rs.getInt("M_Product_ID");
				if (M_Product_ID > 0)
				{
					NewLine(null);
					CreditRow row = new CreditRow();
					row.setC_InvoiceLine_ID(rs.getInt("C_InvoiceLine_ID"));
					row.setRowID(rs.getInt("Line"));
					row.setM_Product_ID(rs.getInt("M_Product_ID"));
					row.setM_AttributeSetInstance_ID(rs.getInt("M_AttributeSetInstance_ID"));				
					row.setC_UOM_ID(rs.getInt("C_UOM_ID"));
					row.setPriceActual(rs.getBigDecimal("PriceActual"));
					row.setQtyEntered(rs.getBigDecimal("QtyEntered"));				
					Object SelectedRow = viewCreditMemo.getSelectedRowObject(); 
					mModel.updateRow(SelectedRow,row);
					count++;
				}
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		if (count == 0)
			ADialog.info(m_WindowNo, this, "Este documento no contiene productos");
		//
		//invoiceLineTable.autoSize();
		statusBar.setStatusDB(String.valueOf(viewCreditMemo.getRowCount()));
	}   //  executeQuery
	public boolean candispose() {
		return true;
	}		
}
