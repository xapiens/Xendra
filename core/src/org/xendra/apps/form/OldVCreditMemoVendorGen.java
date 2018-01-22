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
import org.xendra.objectview.ObjectViewModel;
import org.xendra.plaf.XendraPLAF;
import org.adempiere.util.ProcessUtil;
import org.compiere.apps.*;
import org.compiere.apps.form.*;
import org.compiere.grid.ed.*;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MAllocationLine;
import org.compiere.model.MDocType;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPInstance;
import org.compiere.model.MRole;
import org.compiere.model.MStorage;
import org.compiere.model.MUOM;
import org.compiere.model.MWarehouse;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.reference.REF_C_OrderDeliveryRule;
import org.compiere.plaf.*;
import org.compiere.print.*;
import org.compiere.process.*;
import org.compiere.swing.*;
import org.compiere.util.*;


/**
 *	Credit Memo Vendor Selection
 *
 *  @author xapiens
 *  @version $Id: VCreditMemoVendorGen.java 1528 2010-08-11 13:25:39Z xapiens $
 */
public class OldVCreditMemoVendorGen extends CPanel
	implements FormPanel, ActionListener, 
		ChangeListener, ASyncProcess, VetoableChangeListener
{
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
			jbInit();
			dynInit();
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
	private VLookup pickDeliveryRule;
	private ConfirmPanel confirmPanelSel = new ConfirmPanel(true);
	private ConfirmPanel confirmPanelGen = new ConfirmPanel(false, true, false, true, false, false, true);
	private StatusBar statusBar = new StatusBar();
	private CPanel genPanel = new CPanel();
	private BorderLayout genLayout = new BorderLayout();
	private CTextPane info = new CTextPane();
	private JScrollPane scrollInvoiceLinePane = new JScrollPane();
	private JCheckBox fAllocate = new JCheckBox();
	private VDate pickDate = new VDate();
	private VLookup pickCharge;
	private VNumber TotalCharge = new VNumber();
	//
	private CLabel labelSerial = new CLabel(Msg.translate(Env.getCtx(), "Serial"));
	private CTextField textSerial = new CTextField(10);
	private CLabel labelDocNumber = new CLabel(Msg.translate(Env.getCtx(), "DocumentNo"));
	private CTextField textDocNumber = new CTextField(10);
	private VComboBox 	pickWarehouse = new VComboBox();

	/** User selection */
	Vector<Vector<Object>> orderLineVector = new Vector<Vector<Object>>();
	
	private Trx trx = null;
	private StringBuffer iTextInOutGenerated;
	private VLookup pickDocType;
	private Integer m_C_Invoice_ID = 0;
	private Integer m_C_CreditMemo_ID = 0;
	private DefaultObjectViewModel modelCreditMemo;
	private ObjectView viewCreditMemo;
	private LineKeyAdapter lkaCreditMemo;	
	private CLabel TotalLines = new CLabel("0.00");
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
		CompiereColor.setBackground(this);
		
		JButton print = ConfirmPanel.createPrintButton(true);
		print.addActionListener(this);
		confirmPanelGen.addButton(print);
		
		TotalLines.setHorizontalAlignment(JLabel.RIGHT);
		TotalLines.setForeground(Color.BLACK);
		TotalLines.setFont(new java.awt.Font("Monospaced", 0, 30));

		IObjetViewColumn[] columnsCreditMemo = getColumns();
				
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
	    lkaCreditMemo.setContext(m_frame, this, viewCreditMemo, true /* show dialog info */, m_WindowNo, null, Env.ZERO, mTextToFind);
	    lkaCreditMemo.funcNextColumn("nextcolumn");
	    viewCreditMemo.addKeyListener(lkaCreditMemo);
	    viewCreditMemo.setContext(this);
	    viewCreditMemo.funcCalculateTotalLines("calculateCreditMemoVendorTotal");
	    fillPicks();
	    
		MLookupInfo lookupInfo = MLookupFactory.getLookupInfo (Env.getCtx(), m_WindowNo, 
				Util.getColumnID(MOrder.Table_ID, "C_DocTypeTarget_ID"), DisplayType.Table,
				Env.getLanguage(Env.getCtx()), "C_DocTypeTarget_ID", 170,
				false, "C_DocType.DocBaseType IN ('POO') AND C_DocType.IsActive='Y'");
		
		MLookup lookupDocType = new MLookup (lookupInfo, 0);
		pickDocType = new VLookup("C_DocTypeTarget_ID", true, false, true, lookupDocType);
		
		MLookup lookupInvoice = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 
				Util.getColumnID(MInvoice.Table_ID, "C_Invoice_ID"), 
				DisplayType.Search);
		
		 
		
		pickInvoice  = new VLookup("C_Invoice_ID", false, false, true, lookupInvoice);
		pickInvoice.addVetoableChangeListener(this);

		MLookup lookupCharge = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 
				Util.getColumnID(MOrder.Table_ID, "C_Charge_ID"), 
				DisplayType.Search);
		
		pickCharge = new VLookup("C_Charge_ID", false, false, true, lookupCharge);
		pickCharge.addVetoableChangeListener(this);

		MLookup lookupDeliveryRule = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 
				Util.getColumnID(MOrder.Table_ID, "DeliveryRule"), 
				DisplayType.List);
		
		pickDeliveryRule = new VLookup("DeliveryRule", false, false, true, lookupDeliveryRule);
		pickDeliveryRule.addVetoableChangeListener(this);
		
		selPanel.setLayout(new BorderLayout());
		lInvoice.setText(Msg.translate(Env.getCtx(), "C_Invoice_ID"));
		lInvoice.setLabelFor(pickInvoice);
		labelDocNumber.setLabelFor(textDocNumber);
		
		fAllocate.setText("NC descuenta a esta factura");
		fAllocate.setSelected(false);
		fAllocate.addChangeListener(this);
		pickDate.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		selNorthPanel.setLayout(new ALayout());
		tabbedPane.add(selPanel, Msg.getMsg(Env.getCtx(), "Select"));
		selPanel.add(selNorthPanel, BorderLayout.NORTH);
		selNorthPanel.add(lInvoice, new ALayoutConstraint(0,0));
		selNorthPanel.add(pickInvoice, null);
		selNorthPanel.add(fAllocate,null);
		selNorthPanel.add(labelSerial, new ALayoutConstraint(1,0));
		selNorthPanel.add(textSerial, null);		
		selNorthPanel.add(labelDocNumber, null);
		selNorthPanel.add(textDocNumber, null);
		selNorthPanel.add(new CLabel("Fecha de envio:"), null);
		selNorthPanel.add(pickDate, null);
		selNorthPanel.add(new CLabel("Tipo de Documento:"),new ALayoutConstraint(2,0));
		selNorthPanel.add(pickDocType,null);
		selNorthPanel.add(new CLabel(Msg.translate(Env.getCtx(), "M_Warehouse_ID")));
		selNorthPanel.add(pickWarehouse);
		selNorthPanel.add(new CLabel(Msg.translate(Env.getCtx(), "DeliveryRule")));
		selNorthPanel.add(pickDeliveryRule);
		selPanel.setName("selPanel");
		selPanel.add(confirmPanelSel, BorderLayout.SOUTH);
		scrollInvoiceLinePane.getViewport().add(viewCreditMemo, null);
		
		CreditMemoLinePanel.setLayout(new BorderLayout());
		CreditMemoLinePanel.add(new JScrollPane(scrollInvoiceLinePane), BorderLayout.CENTER);
		CreditMemoLinePanel.add(TotalLines, BorderLayout.SOUTH);
		
		chargePanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Charge_ID")),new ALayoutConstraint(0,0));
		chargePanel.add(pickCharge,null);
		chargePanel.add(TotalCharge,new ALayoutConstraint(1,0));		
		tabbedTypeCreditMemoPane.add(CreditMemoLinePanel,   Msg.translate(Env.getCtx(), "C_Invoice_ID"));
		tabbedTypeCreditMemoPane.add(chargePanel, Msg.translate(Env.getCtx(), "C_Charge_ID"));
		tabbedTypeCreditMemoPane.addChangeListener(this);				

		selPanel.add(tabbedTypeCreditMemoPane, BorderLayout.CENTER);
		confirmPanelSel.addActionListener(this);
		//
		tabbedPane.add(genPanel, Msg.getMsg(Env.getCtx(), "Generate"));
		genPanel.setLayout(genLayout);
		genPanel.add(info, BorderLayout.CENTER);
		genPanel.setEnabled(false);
		info.setBackground(XendraPLAF.getFieldBackground_Inactive());
		info.setEditable(false);
		genPanel.add(confirmPanelGen, BorderLayout.SOUTH);
		confirmPanelGen.addActionListener(this);
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
	/**
	 *	Action Listener
	 *  @param e event
	 */
	public void actionPerformed (ActionEvent e)
	{
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
			Boolean isBasedinLines = tabbedTypeCreditMemoPane.getSelectedIndex() == 0;
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
				
				Timestamp date = (Timestamp ) pickDate.getValue();
				if (date == null)
					date = Env.getContextAsDate(Env.getCtx(), "#Date");
				MOrder order = MOrder.copyFrom(	from, 
								date, 
								dt.getC_DocType_ID(), 
								from.isSOTrx(), false /* counter*/, true /*copyASI*/ , false /* include lines */ , trxName);
	
				order.setM_Warehouse_ID((Integer) pickWarehouse.getValue());
				order.setC_DocType_ID(dt.getC_DocType_ID());
				order.setDeliveryRule((String) pickDeliveryRule.getValue());
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
					String m_status = order.completeIt();		
					order.setDocStatus(m_status); 					
					if (order.getDocStatus().equals(DocAction.STATUS_Completed))
					{
						order.save(trxName);
						StringBuffer info = new StringBuffer("");
						// Generando Guia 
						//MInOut shipment = createShipment (dt,  order.getDateOrdered());
						MInOut shipment = new MInOut (order , dt.getC_DocTypeShipment_ID(), order.getDateOrdered());
						if (!shipment.save(trxName))
							throw new XendraException(CLogger.retrieveErrorString(null));
						//
						MOrderLine[] oLines = order.getLines(true, null);
						for (int i = 0; i < oLines.length; i++)
						{
							MOrderLine oLine = oLines[i];
							//
							MInOutLine ioLine = new MInOutLine(shipment);
							//	Qty = Ordered - Delivered
							BigDecimal MovementQty = oLine.getQtyOrdered().subtract(oLine.getQtyDelivered()); 
							//	Location
							int M_Locator_ID = MStorage.getM_Locator_ID (oLine.getM_Warehouse_ID(), 
									oLine.getM_Product_ID(), oLine.getM_AttributeSetInstance_ID(), 
									MovementQty, trxName);
							if (M_Locator_ID == 0)		//	Get default Location
							{
								MWarehouse wh = MWarehouse.get(Env.getCtx(), oLine.getM_Warehouse_ID());
								M_Locator_ID = wh.getDefaultLocator().getM_Locator_ID();
							}
							//
							ioLine.setOrderLine(oLine, M_Locator_ID, MovementQty);
							ioLine.setQty(MovementQty);
							if (oLine.getQtyEntered().compareTo(oLine.getQtyOrdered()) != 0)
								ioLine.setQtyEntered(MovementQty
									.multiply(oLine.getQtyEntered())
									.divide(oLine.getQtyOrdered(), 6, BigDecimal.ROUND_HALF_UP));
							if (!ioLine.save(trxName))
							{
								throw new XendraException("Could not create Shipment Line");
							}
						}
						//	Manually Process Shipment
						String status = shipment.completeIt();
						shipment.setDocStatus(status);
						shipment.save(trxName);
						if (!DocAction.STATUS_Completed.equals(status))
						{
							throw new XendraException("@M_InOut_ID@: " + shipment.getProcessMsg());
						}
						if (shipment == null)
							throw new XendraException(" no se pudo crear InOut");
						info.append("@M_InOut_ID@: ").append(shipment.getDocumentNo());
						order.setM_InOut_ID(shipment.get_ID());
						String msg = shipment.getProcessMsg();
						if (msg != null && msg.length() > 0)
							info.append(" (").append(msg).append(")");
						// Generando Factura
						MInvoice invoice = new MInvoice (order, dt.getC_DocTypeInvoice_ID(), order.getDateOrdered());
						if (!invoice.save(trxName))
							throw new XendraException("Could not create Invoice");
						
						//	If we have a Shipment - use that as a base
						if (shipment != null)
						{
							//
							MInOutLine[] sLines = shipment.getLines(false);
							for (int i = 0; i < sLines.length; i++)
							{
								MInOutLine sLine = sLines[i];
								//
								MInvoiceLine iLine = new MInvoiceLine(invoice);
								iLine.setShipLine(sLine);
								//	Qty = Delivered	
								iLine.setQtyEntered(sLine.getQtyEntered());
								iLine.setQtyInvoiced(sLine.getMovementQty());
								if (!iLine.save(trxName))
									throw new XendraException("Could not create Invoice Line from Shipment Line");
								//
								sLine.setIsInvoiced(true);
								if (!sLine.save(trxName))
								{
									log.warning("Could not update Shipment line: " + sLine);
								}
							}
						}
						//	Manually Process Invoice
						status = invoice.completeIt();
						invoice.setDocStatus(status);
						invoice.save(trxName);
						if (!DocAction.STATUS_Completed.equals(status))
							throw new XendraException("@C_Invoice_ID@: " + invoice.getProcessMsg());
						//
						shipment.setC_Invoice_ID(invoice.getC_Invoice_ID());
						shipment.save(trxName);
						
						m_C_CreditMemo_ID =  invoice.getC_Invoice_ID();
						invoice.setSerial((String) textSerial.getValue());
						invoice.setDocumentNo((String) textDocNumber.getValue());					
						invoice.setRef_Invoice_ID(invoicesrc.getC_Invoice_ID());
						invoice.save(trxName);
						generatorder_complete(invoice);
					}
					else
						throw new XendraException(order.getProcessMsg());
				}
				else
					throw new XendraException(CLogger.retrieveErrorString(null));
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
				//newInvoice.setC_Charge_ID((Integer) this.pickCharge.getValue());
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
				generatorder_complete(newInvoice);

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
		} catch (XendraException e) {
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
	public boolean candispose() {
		return true;
	}
}	//	VCreditMemoVendorGen
