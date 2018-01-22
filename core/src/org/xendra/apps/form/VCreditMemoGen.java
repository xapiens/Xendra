/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
package org.xendra.apps.form;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.List;
import java.util.logging.*;

import javax.swing.*;
import javax.swing.event.*;

import org.xendra.exceptions.XendraException;
import org.xendra.line.LineKeyAdapter;
import org.xendra.objectview.DefaultObjectViewModel;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.ObjectView;
import org.xendra.objectview.IObjetViewColumn;
import org.xendra.plaf.XendraPLAF;
import org.xendra.wf.WorkflowUtils;
import org.adempiere.util.ProcessUtil;
import org.compiere.apps.*;
import org.compiere.apps.form.*;
import org.compiere.grid.ed.*;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MAllocationLine;
import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPInstance;
import org.compiere.model.MRole;
import org.compiere.model.MUOM;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_InvoiceLine;
import org.compiere.model.persistence.X_C_Order;
//import org.compiere.model.persistence.X_C_POSLog;
import org.compiere.model.reference.REF_C_OrderDeliveryRule;
import org.compiere.plaf.*;
import org.compiere.print.*;
import org.compiere.process.*;
import org.compiere.swing.*;
import org.compiere.util.*;


/**
 *	Credit Memo Selection
 *
 *  @author xapiens
 *  @version $Id: VCreditMemo.java 1528 2010-08-11 13:25:39Z xapiens $
 */
public class VCreditMemoGen extends CPanel
implements FormPanel, ActionListener, 
ChangeListener, ASyncProcess, VetoableChangeListener
{

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
					VCreditMemoGen alloc = new VCreditMemoGen();
					JFrame frame = new JFrame("CreditMemo");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					alloc.setOpaque(true);
					alloc.Initialize();
					frame.getContentPane().add(alloc.getTabbedPane(), BorderLayout.CENTER);			
					frame.getContentPane().add(alloc.getStatusBar(), BorderLayout.SOUTH);				    
					AEnv.showCenterScreen(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	

	protected Component getTabbedPane() {
		return tabbedPane; 
	}

	protected Component getStatusBar() {
		return statusBar;
	}

	private CPanel mainPanel = null;
	public VCreditMemoGen() throws Exception {
		// quitar el comentario solo cuando se use el generador de ventanas por un tema de inicializacion de variables
		// Initialize();
	}

	private CPanel Initialize() {

		if (mainPanel != null)
			return mainPanel;

		mainPanel = new CPanel();
		CompiereColor.setBackground(this);

		JButton print = ConfirmPanel.createPrintButton(true);
		print.addActionListener(this);
		confirmPanelGen.addButton(print);

		infosearch.setHorizontalAlignment(JLabel.LEFT);
		infosearch.setForeground(Color.BLACK);
		infosearch.setFont(new java.awt.Font("Monospaced", 0, 20));

		IObjetViewColumn[] columnsCreditMemo = getColumns();
		//CreditRow[] rows = { newrow() };

		//modelCreditMemo = new DefaultTableViewModel(columnsCreditMemo, Arrays.asList(rows));
		modelCreditMemo = new DefaultObjectViewModel(columnsCreditMemo, null);

		viewCreditMemo = new ObjectView(modelCreditMemo);
		viewCreditMemo.setColumnSelectionAllowed(false);
		viewCreditMemo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		viewCreditMemo.configcontrols(m_WindowNo);
		viewCreditMemo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
		viewCreditMemo.getInputMap(JComponent.WHEN_FOCUSED)		     	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
		Action actions = new AbstractAction() {

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
		lkaCreditMemo.setContext(m_frame, this, viewCreditMemo, true /* show dialog info */, m_WindowNo, infosearch, Env.ZERO, mTextToFind);

		fillPicks();

		MLookupInfo lookupInfo = MLookupFactory.getLookupInfo (Env.getCtx(), m_WindowNo, 
				Util.getColumnID(MOrder.Table_ID, X_C_Order.COLUMNNAME_C_DocTypeTarget_ID), DisplayType.Table,
				Env.getLanguage(Env.getCtx()), X_C_Order.COLUMNNAME_C_DocTypeTarget_ID, 170,
				false, "C_DocType.DocBaseType IN ('SOO') AND C_DocType.DocSubType IN ('RM') AND C_DocType.IsActive='Y' AND C_DocType.AD_Org_ID =".concat(String.valueOf(Env.getAD_Org_ID(Env.getCtx()))));

		MLookup lookupDocType = new MLookup (lookupInfo, 0);
		pickDocType = new VLookup(X_C_Order.COLUMNNAME_C_DocTypeTarget_ID, true, false, true, lookupDocType);
		pickDocType.addActionListener(this);

		MLookup lookupInvoice = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 
				Util.getColumnID(MInvoice.Table_ID, "C_Invoice_ID"), 
				DisplayType.Search);

		pickInvoice  = new VLookup("C_Invoice_ID", false, false, true, lookupInvoice);
		pickInvoice.addVetoableChangeListener(this);

		MLookup lookupCharge = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 
				Util.getColumnID(MInvoice.Table_ID, "C_Charge_ID"), 
				DisplayType.Search);

		pickCharge = new VLookup("C_Charge_ID", false, false, true, lookupCharge);
		pickCharge.addVetoableChangeListener(this);

		selPanel.setLayout(new BorderLayout());
		lInvoice.setText(Msg.translate(Env.getCtx(), "C_Invoice_ID"));
		lInvoice.setLabelFor(pickInvoice);
		labelDocNumber.setLabelFor(textDocNumber);

		fAllocate.setText("NC descuenta a esta factura");
		fAllocate.setSelected(false);
		fAllocate.addChangeListener(this);
		pickDate.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		selNorthPanel.setLayout(new ALayout());		
		selPanel.add(selNorthPanel, BorderLayout.NORTH);
		selNorthPanel.add(lInvoice, new ALayoutConstraint(0,0));
		selNorthPanel.add(pickInvoice, null);
		selNorthPanel.add(fAllocate,null);
		selNorthPanel.add(labelDocNumber, null);
		selNorthPanel.add(textDocNumber, null);
		selNorthPanel.add(new CLabel("Fecha de envio:"), null);
		selNorthPanel.add(pickDate, null);
		//selNorthPanel.add(fAllocate,null);
		selNorthPanel.add(new CLabel("Tipo de Documento:"),new ALayoutConstraint(2,0));
		selNorthPanel.add(pickDocType,null);
		selNorthPanel.add(new CLabel(Msg.translate(Env.getCtx(), "M_Warehouse_ID")));
		selNorthPanel.add(pickWarehouse);
		selPanel.setName("selPanel");
		selPanel.add(confirmPanelSel, BorderLayout.SOUTH);
		scrollInvoiceLinePane.setViewportView(viewCreditMemo);

		CreditMemoLinePanel.setLayout(new BorderLayout());
		CreditMemoLinePanel.add(infosearch, BorderLayout.NORTH);
		//CreditMemoLinePanel.add(totalOfPointOfPurchasePanel, BorderLayout.SOUTH);			  
		CreditMemoLinePanel.add(new JScrollPane(scrollInvoiceLinePane), BorderLayout.CENTER);


		chargePanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Charge_ID")),new ALayoutConstraint(0,0));
		chargePanel.add(pickCharge,null);
		chargePanel.add(TotalCharge,new ALayoutConstraint(1,0));		
		//tabbedTypeCreditMemoPane.add(scrollInvoiceLinePane,   Msg.translate(Env.getCtx(), "C_Invoice_ID"));
		tabbedTypeCreditMemoPane.add(CreditMemoLinePanel,   Msg.translate(Env.getCtx(), "C_Invoice_ID"));
		tabbedTypeCreditMemoPane.add(chargePanel, Msg.translate(Env.getCtx(), "C_Charge_ID"));
		tabbedTypeCreditMemoPane.addChangeListener(this);				


		selPanel.add(tabbedTypeCreditMemoPane, BorderLayout.CENTER);
		//selPanel.add(chargePanel, BorderLayout.CENTER);
		confirmPanelSel.addActionListener(this);
		//
		genPanel.setLayout(genLayout);
		genPanel.add(info, BorderLayout.CENTER);
		genPanel.setEnabled(false);
		info.setBackground(XendraPLAF.getFieldBackground_Inactive());
		info.setEditable(false);
		genPanel.add(confirmPanelGen, BorderLayout.SOUTH);
		confirmPanelGen.addActionListener(this);

		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "InOutGenerateSel"));//@@
		statusBar.setStatusDB(" ");
		//	Tabbed Pane Listener
		tabbedPane.add(selPanel, Msg.getMsg(Env.getCtx(), "Select"));
		tabbedPane.add(genPanel, Msg.getMsg(Env.getCtx(), "Generate"));
		tabbedPane.addChangeListener(this);

		mainPanel.add(tabbedPane, BorderLayout.CENTER);
		mainPanel.add(statusBar, BorderLayout.SOUTH);
		return mainPanel;
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
			Initialize();
			frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);			
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
		}
		catch(Exception ex)
		{
			log.log(Level.SEVERE, "init", ex);
		}
	}	//	init

	/**	Window No			*/
	private int         	m_WindowNo = 0;
	/**	FormFrame			*/
	private FormFrame 		m_frame;

	private boolean			m_selectionActive = true;
	private Object 			m_C_BPartner_ID = null;
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(VCreditMemoGen.class);
	//
	private CTabbedPane tabbedPane = new CTabbedPane();
	private CTabbedPane tabbedTypeCreditMemoPane = new CTabbedPane();
	private CPanel selPanel = new CPanel();
	private CPanel selNorthPanel = new CPanel();
	private CPanel chargePanel = new CPanel();
	private CLabel lInvoice = new CLabel();
	private VLookup pickInvoice;
	private ConfirmPanel confirmPanelSel = new ConfirmPanel(true);
	private ConfirmPanel confirmPanelGen = new ConfirmPanel(false, true, false, true, false, false, true);
	private StatusBar statusBar = new StatusBar();
	private CPanel genPanel = new CPanel();
	private BorderLayout genLayout = new BorderLayout();
	private CTextPane info = new CTextPane();
	private JScrollPane scrollInvoiceLinePane = new JScrollPane();
	//private MiniTable invoiceLineTable = new MiniTable();
	private JCheckBox fAllocate = new JCheckBox();
	private VDate pickDate = new VDate();
	private VLookup pickCharge;
	private VNumber TotalCharge = new VNumber();
	private int orderQtyInvoiced = 7;
	//
	private CLabel labelDocNumber = new CLabel(Msg.translate(Env.getCtx(), "DocumentNo"));
	private CTextField textDocNumber = new CTextField(10);
	private VComboBox 	pickWarehouse = new VComboBox();

	/** User selection */
	Vector<Vector<Object>> orderLineVector = new Vector<Vector<Object>>();

	private Trx trx = null;
	private boolean m_callout = false;
	private StringBuffer iTextInOutGenerated;
	private VLookup pickDocType;
	private Integer m_C_Invoice_ID = 0;
	private Integer m_C_CreditMemo_ID = 0;
	private DefaultObjectViewModel modelCreditMemo;
	private ObjectView viewCreditMemo;
	private LineKeyAdapter lkaCreditMemo;
	private CLabel infosearch = new CLabel("");
	private String mTextToFind = "";
	private CPanel CreditMemoLinePanel = new CPanel();
	private int SelectedColumn;
	private int SelectedRow;
	/**
	 *	Static Init.
	 *  <pre>
	 *  selPanel (tabbed)
	 *      fOrg, fBPartner
	 *      scrollPane & miniTable
	 *  genPanel
	 *      info
	 *  </pre>
	 *  @throws Exception
	 */
	void jbInit() throws Exception
	{
	}	//	jbInit

	private CreditRow newrow() {
		return new CreditRow();
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
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		IObjetViewColumn[] columns = new IObjetViewColumn[newcolumns.size ()];
		newcolumns.toArray(columns);
		return columns;		  
	}

	/**
	 *	Dynamic Init.
	 *	- Create GridController & Panel
	 *	- AD_Column_ID from C_Order
	 */
	private void dynInit()
	{		
		//	Info
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "InOutGenerateSel"));//@@
		statusBar.setStatusDB(" ");
		//	Tabbed Pane Listener
		tabbedPane.addChangeListener(this);
	}	//	dynInit

	/**
	 *  Query Info
	 * @param pC_Invoice_ID 
	 */
	private void retrieveInvoiceLines(Integer pC_Invoice_ID)
	{
		m_C_Invoice_ID = pC_Invoice_ID;		
		List<MInvoiceLine> lines = new Query(Env.getCtx(), X_C_InvoiceLine.Table_Name, "C_Invoice_ID = ? ", null).setParameters(m_C_Invoice_ID).list();
		if (lines != null)
		{
			DefaultObjectViewModel mModel= (DefaultObjectViewModel) viewCreditMemo.getDataModel();
			cleanlines();			
			for (MInvoiceLine line:lines)
			{
				NewLine(null);
				CreditRow row = new CreditRow();
				row.setC_InvoiceLine_ID(line.getC_InvoiceLine_ID());
				row.setRowID(line.getLine());
				row.setM_Product_ID(line.getM_Product_ID());
				row.setM_AttributeSetInstance_ID(line.getM_AttributeSetInstance_ID());				
				row.setC_UOM_ID(line.getC_UOM_ID());
				row.setPriceActual(line.getPriceActual());
				row.setQtyEntered(line.getQtyEntered());
				row.setDiscount(line.getDiscount());
				row.setDiscount1(line.getDiscount1());
				row.setDiscount2(line.getDiscount2());
				row.setDiscount3(line.getDiscount3());
				row.setDiscount4(line.getDiscount4());				
				Object SelectedRow = viewCreditMemo.getSelectedRowObject(); 
				mModel.updateRow(SelectedRow,row);								
			}
		}
		statusBar.setStatusDB(String.valueOf(viewCreditMemo.getRowCount()));
	}   //  executeQuery

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

	/**
	 * 	Dispose
	 */
	 public void dispose()
	 {
		 if (m_frame != null)
			 m_frame.dispose();
		 m_frame = null;
	 }	//	dispose

	 /**
	  *	Action Listener
	  *  @param e event
	  */
	 public void actionPerformed (ActionEvent e)
	 {
		 Component c = (Component) e.getSource();
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
		 if (c.getName().equals(X_C_Order.COLUMNNAME_C_DocTypeTarget_ID))
		 {			
			 MDocType dt = MDocType.get(Env.getCtx(), (Integer) pickDocType.getValue());				
			 if (dt.getC_DocTypeShipment_ID() == 0)
			 {
				 pickDocType.setValue(null);
				 ADialog.error(m_WindowNo, this, "el tipo de documento no indica el tipo de guia ");					
			 }
			 return;
		 }				
		 if (m_selectionActive)
		 {
			 Boolean isBasedinLines = tabbedTypeCreditMemoPane.getSelectedIndex() == 0;
			 String error = "";
			 if ( isBasedinLines )
			 {
				 DefaultObjectViewModel adapter= (DefaultObjectViewModel) viewCreditMemo.getDataModel();
				 int activerows = 0;
				 for (int j = 0; j < adapter.getRowCount(); j++)
				 {
					 CreditRow row = (CreditRow) adapter.getRowObject(j);					
					 if (row != null  && row.getSelect())
						 activerows++;
				 }				
				 if (activerows == 0 )
					 error = error.concat(" no se seleccionaron lineas\n");
				 if (pickDocType.getValue() == null)
					 error = error.concat(" no se definio el tipo de documento\n");			
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
	 }	//	actionPerformed


	 /**
	  *	Change Listener (Tab changed)
	  *  @param e event
	  */
	 public void stateChanged (ChangeEvent e)
	 {		
		 int index = tabbedPane.getSelectedIndex();
		 m_selectionActive = (index == 0);
	 }	//	stateChanged

	 /**************************************************************************
	  *	Generate Order
	  */
	 private void generateOrder (Boolean isBasedinLines)
	 {		
		 String trxName = Util.getUUID();	
		 trx = Trx.get(trxName, true);	//trx needs to be committed too

		 m_selectionActive = false;  //  prevents from being called twice
		 statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "CreditMemoGen"));

		 try 
		 {
			 MInvoice invoice = null;
			 MInvoice invoiceref = new MInvoice(Env.getCtx(), m_C_Invoice_ID, trxName);		

			 //int C_POSLog_ID = invoiceref.getC_POSLog_ID();
			 //int POS_ID = 0;
			 //PO po = new Query(Env.getCtx(),"C_POSLog", "C_POSLog_ID = ?", null).setParameters(C_POSLog_ID).first();
			 //if (po != null)
			 //{
			 //	POS_ID = po.get_ValueAsInt("C_POS_ID");
			 //}			
			 //X_C_POSLog poslog = new X_C_POSLog(Env.getCtx(), C_POSLog_ID, null);						
			 if (isBasedinLines)
			 {				
				 // al generar una nota de credito sobre una factura
				 // y la factura origen tiene percepcion se debera recalcular la percepcion
				 // siempre y cuando no este cancelada.
				 BigDecimal GrandTotal 		= invoiceref.getGrandTotal();
				 BigDecimal WithholdingAmt 	= invoiceref.getWithholdingAmt();
				 BigDecimal LineNetAmt 		= Env.ZERO;
				 MOrder from = new MOrder(Env.getCtx(), invoiceref.getC_Order_ID(), trxName);

				 MDocType dt = MDocType.get(Env.getCtx(), (Integer) this.pickDocType.getValue());

				 Timestamp date = (Timestamp ) pickDate.getValue();
				 if (date == null)
					 date = Env.getContextAsDate(Env.getCtx(), "#Date");
				 MOrder order = MOrder.copyFrom(	from, 
						 date, 
						 dt.getC_DocType_ID(), 
						 from.isSOTrx(), false /* counter*/, true /*copyASI*/ , false /* include lines */ , trxName);

				 order.setM_Warehouse_ID((Integer) pickWarehouse.getValue());
				 order.setC_DocType_ID(dt.getC_DocType_ID());
				 
				 String DocumentNo = (String) textDocNumber.getValue();
				 order.setDocumentNoToInvoice(DocumentNo);
				 //
				 order.setDeliveryRule(REF_C_OrderDeliveryRule.Force);
				 order.setDocAction(DocAction.ACTION_Complete);
				 if ( order.save(trxName) )
				 {
					 int linesprocessed = 0;
					 DefaultObjectViewModel adapter= (DefaultObjectViewModel) viewCreditMemo.getDataModel();
					 int j = 0;
					 int Line = 10;
					 while ( j < adapter.getRowCount())
					 {
						 CreditRow row = (CreditRow) adapter.getRowObject(j);
						 if (row.getSelect())
						 {
							 MInvoiceLine iLine = new MInvoiceLine(Env.getCtx(), row.getC_InvoiceLine_ID(), trxName);
							 MOrderLine orderlineFrom = new MOrderLine(Env.getCtx(), iLine.getC_OrderLine_ID(), trxName);
							 MOrderLine orderLineTo = new MOrderLine(order);							
							 MOrderLine.copyValues(orderlineFrom, orderLineTo);
							 orderLineTo.setLine(Line);
							 //orderLineTo.setQtyOrdered(Env.ZERO);
							 orderLineTo.setQtyDelivered(Env.ZERO);
							 orderLineTo.setQtyInvoiced(Env.ZERO);
							 orderLineTo.setQtyReserved(Env.ZERO);
							 orderLineTo.setOrder(order);
							 orderLineTo.setC_Order_ID(order.getC_Order_ID());
							 //orderLineTo.setQtyInvoiced(row.getQtyInvoiced());
							 orderLineTo.setQtyOrdered(row.getQtyInvoiced());
							 orderLineTo.setQtyEntered(row.getQtyEntered());
							 orderLineTo.setDiscount(row.getDiscount());
							 orderLineTo.setDiscount1(row.getDiscount1());
							 orderLineTo.setDiscount2(row.getDiscount2());
							 orderLineTo.setDiscount3(row.getDiscount3());
							 orderLineTo.setDiscount4(row.getDiscount4());
							 //orderLineTo.setQtyOrdered(row.getQtyOrdered());
							 orderLineTo.setLineNetAmt(row.getLineNet());
							 LineNetAmt = LineNetAmt.add(row.getLineNet());
							 //orderLineTo.setQtyDelivered(Env.ZERO);
							 Line = Line + 10;
							 if (!orderLineTo.save(trxName)) {
								 throw new XendraException("La linea de orden no pudo ser creada");
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
					 String error = "";
					 ProcessInfo pi = WorkflowUtils.Process(order, trxName);			
					 if (!pi.isError())
					 {									
						 trx.commit();
						 invoice = new MInvoice(Env.getCtx(), order.getC_Invoice_ID(), trxName);
						 invoice.setRef_Invoice_ID(invoiceref.getC_Invoice_ID());
						 invoice.save();
						 generatorder_complete(invoice);
					 }
					 else
					 {
						 throw new Exception(pi.getSummary());
					 }					
					 //					String m_status = order.completeIt();		
					 //					order.setDocStatus(m_status);
					 //					if (order.getDocStatus().equals(DocAction.STATUS_Completed))
					 //					{
					 //						order.save();
					 //						m_C_CreditMemo_ID =  order.getC_Invoice_ID();
					 //						MInvoice newInvoice = new MInvoice(Env.getCtx(), order.getC_Invoice_ID(), trxName);
					 //						newInvoice.setDocumentNo(textDocNumber.getValue().toString());					
					 //						newInvoice.setRef_Invoice_ID(invoice.getC_Invoice_ID());
					 //						newInvoice.save(trxName);
					 //						generatorder_complete(newInvoice);
					 //						// Agregando al POS Log 
					 //						if (POS_ID > 0)
					 //						{
					 //							try {
					 //							Class<?> clazz = Class.forName("org.compiere.model.persistence.X_C_POSLog");							
					 //							Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});							
					 //							PO poslog = (PO)constructor.newInstance(new Object[] {Env.getCtx(), 0, null});						
					 //							//poslog = new X_C_POSLog(Env.getCtx(), 0, trxName);
					 //							//poslog.setC_POS_ID(POS_ID); /* ID del POS Terminal */
					 //							poslog.set_ValueOfColumn("C_POS_ID", POS_ID);
					 //							//poslog.setC_Order_ID(order.getC_Order_ID());
					 //							poslog.set_ValueOfColumn(X_C_Order.COLUMNNAME_C_Order_ID, order.getC_Order_ID());
					 //							//poslog.setC_Invoice_ID(order.getC_Invoice_ID());
					 //							poslog.set_ValueOfColumn(X_C_Invoice.COLUMNNAME_C_Invoice_ID, order.getC_Invoice_ID());
					 //							//poslog.setC_DocTypeInvoice_ID(dt.getC_DocTypeInvoice_ID());
					 //							poslog.set_ValueOfColumn("C_DocTypeInvoice_ID", dt.getC_DocTypeInvoice_ID());
					 //							//poslog.setC_DocTypeShipment_ID(dt.getC_DocTypeShipment_ID());
					 //							poslog.set_ValueOfColumn("C_DocTypeShipment_ID", dt.getC_DocTypeShipment_ID());
					 //							//poslog.setC_DocTypeOrder_ID(order.getC_DocType_ID());
					 //							poslog.set_ValueOfColumn("C_DocTypeOrder_ID", order.getC_DocType_ID());
					 //							//poslog.setDateTrx(date);
					 //							poslog.set_ValueOfColumn("DateTrx", date);							
					 //							//poslog.setDocStatus(newInvoice.getDocStatus());
					 //							poslog.set_ValueOfColumn(X_C_Order.COLUMNNAME_DocStatus, newInvoice.getDocStatus());
					 //							//poslog.setGrandTotal(order.getGrandTotal());
					 //							poslog.set_ValueOfColumn(X_C_Order.COLUMNNAME_GrandTotal, order.getGrandTotal());
					 //							//poslog.setIsPrinted(true);
					 //							poslog.set_ValueOfColumn(X_C_Order.COLUMNNAME_IsPrinted, true);							
					 //							//poslog.setProcessed(false);
					 //							poslog.set_ValueOfColumn(X_C_Order.COLUMNNAME_Processed, false);
					 //							//poslog.setProcessing(false);
					 //							poslog.set_ValueOfColumn(X_C_Order.COLUMNNAME_Processing, false);
					 //							poslog.save();
					 //							}
					 //							catch (Exception e)
					 //							{
					 //								e.printStackTrace();
					 //							}
					 //						}
					 //					}
					 //					if (WithholdingAmt.compareTo(Env.ZERO) > 0 && 
					 //						( !invoice.isPaid() && !invoice.IsChangebyBOE() ) 
					 //					   )
					 //					{
					 //						BigDecimal whPct = WithholdingAmt.divide(GrandTotal, BigDecimal.ROUND_HALF_UP);
					 //						whPct = whPct.multiply(Env.ONEHUNDRED);
					 //						if (whPct.signum() > 0)
					 //						{
					 //							LineNetAmt = GrandTotal.subtract(LineNetAmt); 
					 //							WithholdingAmt = Util.percent(LineNetAmt, whPct); 
					 //							invoice.setWithholdingAmt(WithholdingAmt);
					 //							invoice.save();
					 //						}														
					 //					}
					 //					else
					 //						throw new XendraException(order.getProcessMsg());
				 }
				 else
					 throw new XendraException("La Orden no pudo ser creada, esto ocurre en un 90% de los casos debido a saturacion de red, espere un momento y reintente");
			 }
			 else
			 {
				 // is charge based				
				 MDocType dt = MDocType.get(Env.getCtx(), (Integer) this.pickDocType.getValue());
				 MInvoice newInvoice = new MInvoice(Env.getCtx(), 0, trxName);
				 newInvoice.setC_DocTypeTarget_ID(dt.getC_DocTypeInvoice_ID());
				 newInvoice.setC_BPartner_ID(invoiceref.getC_BPartner_ID());
				 newInvoice.setC_BPartner_Location_ID(invoiceref.getC_BPartner_Location_ID());
				 //newInvoice.setC_Charge_ID((Integer) this.pickCharge.getValue());
				 newInvoice.setC_Currency_ID(invoiceref.getC_Currency_ID());
				 newInvoice.setM_PriceList_ID(invoiceref.getM_PriceList_ID());
				 newInvoice.setDocumentNo(textDocNumber.getValue().toString());					
				 newInvoice.setRef_Invoice_ID(invoiceref.getC_Invoice_ID());
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

				 BigDecimal GrandTotal 		= invoiceref.getGrandTotal();
				 //BigDecimal WithholdingAmt 	= invoice.getWithholdingAmt();
				 BigDecimal LineNetAmt		= Env.ZERO;
				 //				if (
				 //					WithholdingAmt.compareTo(Env.ZERO) > 0 
				 //						&& 
				 //					( !invoice.isPaid() && !invoice.IsChangebyBOE() )
				 //					)
				 //				{
				 //					BigDecimal whPct = WithholdingAmt.divide(GrandTotal, BigDecimal.ROUND_HALF_UP);
				 //					whPct = whPct.multiply(Env.ONEHUNDRED);
				 //					if (whPct.signum() > 0)
				 //					{
				 //						LineNetAmt = GrandTotal.subtract(totalCharge); 
				 //						WithholdingAmt = Util.percent(LineNetAmt, whPct); 
				 //						invoice.setWithholdingAmt(WithholdingAmt);
				 //						invoice.save();
				 //					}														
				 //				}				

				 generatorder_complete(newInvoice);

			 }
			 if (this.fAllocate.isSelected())
			 {
				 MInvoice credit  = new MInvoice(Env.getCtx(), m_C_CreditMemo_ID, trxName);

				 MAllocationHdr alloc = new MAllocationHdr(Env.getCtx(),
						 false /* is manual */, 
						 Env.getContextAsDate(Env.getCtx(), "#Date"), 
						 invoiceref.getC_Currency_ID(),
						 "Factura : ".concat(invoiceref.getDocumentNo()).concat("Nota de Credito: ").concat(textDocNumber.getValue().toString()), 
						 trxName);
				 alloc.setAD_Org_ID(credit.getAD_Org_ID());	
				 //alloc.save(trxName);
				 if (alloc.save(trxName))
				 {
					 MAllocationLine aLineCredit  = null;
					 MAllocationLine aLineInvoice = null;
					 if (invoiceref.isSOTrx())
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
	 private void generatorder_complete (MInvoice invoice)
	 {

		 trx.commit();

		 //  Switch Tabs
		 tabbedPane.setSelectedIndex(1);
		 //
		 iTextInOutGenerated = new StringBuffer();
		 iTextInOutGenerated.append("<br><br>")
		 .append("<b>NOTA DE CREDITO No. ")
		 .append(invoice.getDocumentNo())
		 .append("</b><br><br>");
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
		 info.setText(iTextInOutGenerated.toString());

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

	 public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
		 if (evt.getPropertyName().equals("C_Invoice_ID"))
		 {
			 if (evt.getNewValue() != null)
			 {
				 MInvoice invoice = MInvoice.get(Env.getCtx(), (Integer) evt.getNewValue());
				 if (!invoice.getDocStatus().equals(DocAction.STATUS_Completed) && !invoice.getDocStatus().equals(DocAction.STATUS_Closed))
				 {
					 ADialog.error(m_WindowNo, this, "el documento no esta completado o cerrado ");
					 throw new PropertyVetoException ("DocNotCompleted", evt);
				 }
				 if ( evt.getNewValue() != evt.getOldValue() )					 
				 {					 
					 retrieveInvoiceLines((Integer) evt.getNewValue());
				 }
				 //				 
				 if (invoice.get_ID() != 0)
					 TotalCharge.setRange(Env.ZERO.doubleValue(), invoice.getGrandTotal().doubleValue());
			 }
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

	 private void fillPicks ()
	 {
		 try 
		 {
			 //	Warehouse
			 String sql = "SELECT M_Warehouse_ID, Value || ' - ' || Name AS ValueName "
					 + "FROM M_Warehouse "
					 + "WHERE IsActive='Y'";
			 sql = MRole.getDefault().addAccessSQL (sql,
					 "M_Warehouse", MRole.SQL_NOTQUALIFIED, MRole.SQL_RO)
					 + " ORDER BY Value";
			 pickWarehouse.addItem(new KeyNamePair (0, ""));
			 CPreparedStatement pstmt = DB.prepareStatement(sql, null);
			 ResultSet rs = pstmt.executeQuery();
			 while (rs.next())
			 {
				 KeyNamePair kn = new KeyNamePair
						 (rs.getInt("M_Warehouse_ID"), rs.getString("ValueName"));
				 pickWarehouse.addItem(kn);
			 }
			 rs.close();
			 pstmt.close();			
		 }
		 catch (SQLException e)
		 {

		 }
	 }	//	fillPicks
	 public boolean candispose() {
		 return true;
	 }		
}	//	VInOutGen
