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
package org.compiere.apps.form;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.List;
import java.util.logging.*;

import javax.swing.*;
import javax.swing.table.TableModel;

import org.xendra.exceptions.XendraException;
import org.xendra.line.LineKeyAdapter;
import org.xendra.objectview.DefaultObjectViewModel;
import org.xendra.objectview.ObjectView;
import org.xendra.objectview.IObjetViewColumn;
import org.xendra.objectview.ObjectViewModel;
import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.*;
import org.compiere.grid.ed.*;
import org.compiere.model.MAllocation;
import org.compiere.model.MBOE;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MPayment;
import org.compiere.plaf.*;
import org.compiere.process.*;
import org.compiere.swing.*;
import org.compiere.util.*;

/**
 * Allocation Form
 *
 * @author  Jorg Janke
 * 		    xapiens - rewrite view objects 
 * @version $Id: VAllocation.java 3169 2011-06-25 03:28:16Z xapiens $
 */
@Deprecated
public class FAllocation extends CPanel
	implements FormPanel, ActionListener, VetoableChangeListener
{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					org.compiere.Xendra.startupEnvironment(true);
					FAllocation frame = new FAllocation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public FAllocation() throws Exception {
		Initialize();
	}
	private CPanel Initialize() {
		
		CompiereColor.setBackground(this);		
		mainPanel.setLayout(mainLayout);
		//
		int AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, "C_Currency_ID");
		MLookup lookupCur = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		currencyPick = new VLookup("C_Currency_ID", true, false, true, lookupCur);
		currencyPick.setValue(new Integer(m_C_Currency_ID));
		currencyPick.addVetoableChangeListener(this);

		//  BPartner
		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, "C_BPartner_ID");
		MLookup lookupBP = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.Search);
		bpartnerSearch = new VLookup("C_BPartner_ID", true, false, true, lookupBP);
		bpartnerSearch.addVetoableChangeListener(this);		
		//
		OnlyInvoices.setSelected(true);
		OnlyInvoices.setText("Solo facturas");
		OnlyInvoices.setToolTipText("muestra solo facturas ");
		OnlyInvoices.addActionListener(this);
		//
		IsNOSOTrx.setSelected(false);
		IsNOSOTrx.setText("Solo facturas de compra");
		IsNOSOTrx.setToolTipText("muestra solo facturas de compra ");
		IsNOSOTrx.addActionListener(this);
		//		
		parameterPanel.setLayout(parameterLayout);
		allocationPanel.setLayout(allocationLayout);
		paymentPanel.setLayout(paymentLayout);
		invoicePanel.setLayout(invoiceLayout);
		invoiceInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		invoiceInfo.setHorizontalTextPosition(SwingConstants.RIGHT);
		invoiceInfo.setText(".");
		paymentInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		paymentInfo.setHorizontalTextPosition(SwingConstants.RIGHT);
		paymentInfo.setText(".");
		differenceLabel.setText(Msg.getMsg(Env.getCtx(), "Difference"));
		differenceField.setBackground(XendraPLAF.getFieldBackground_Inactive());
		differenceField.setEditable(false);
		differenceField.setText("0");
		differenceField.setColumns(8);
		differenceField.setHorizontalAlignment(SwingConstants.RIGHT);
		allocateButton.setText(Msg.getMsg(Env.getCtx(), "Process"));
		allocateButton.addActionListener(this);
		multiCurrency.addActionListener(this);
		allocCurrencyLabel.setText(".");
		invoiceScrollPane.setPreferredSize(new Dimension(200, 200));
		paymentScrollPane.setPreferredSize(new Dimension(200, 200));
		mainPanel.add(parameterPanel, BorderLayout.NORTH);
		parameterPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_BPartner_ID")), new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
			,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		parameterPanel.add(bpartnerSearch, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
			,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));
		parameterPanel.add(new JLabel(Msg.getMsg(Env.getCtx(), "Date")), new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0
			,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		parameterPanel.add(dateField, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0
			,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));
		
		lOrg_ID = new CLabel();
		lOrg_ID.setText("AD_Org_ID");
		GridBagConstraints gbc_lOrg_ID = new GridBagConstraints();
		gbc_lOrg_ID.insets = new Insets(0, 0, 5, 5);
		gbc_lOrg_ID.gridx = 4;
		gbc_lOrg_ID.gridy = 0;
		parameterPanel.add(lOrg_ID, gbc_lOrg_ID);
		
		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, "AD_Org_ID");
		fOrg_ID = new VLookup("AD_Org_ID", false, false, true,
			MLookupFactory.get(Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir));
		lOrg_ID.setLabelFor(fOrg_ID);
		
		GridBagConstraints gbc_fOrg_ID = new GridBagConstraints();
		gbc_fOrg_ID.anchor = GridBagConstraints.WEST;
		gbc_fOrg_ID.insets = new Insets(0, 0, 5, 0);
		gbc_fOrg_ID.gridx = 5;
		gbc_fOrg_ID.gridy = 0;
		parameterPanel.add(fOrg_ID, gbc_fOrg_ID);
		
		lblDateacct = new CLabel();
		lblDateacct.setText("DateAcct");
		GridBagConstraints gbc_lblDateacct = new GridBagConstraints();
		gbc_lblDateacct.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateacct.gridx = 2;
		gbc_lblDateacct.gridy = 1;
		parameterPanel.add(lblDateacct, gbc_lblDateacct);
		
		pickdateAcct = new VDate();
		GridBagConstraints gbc_pickdateAcct = new GridBagConstraints();
		gbc_pickdateAcct.anchor = GridBagConstraints.WEST;
		gbc_pickdateAcct.insets = new Insets(0, 0, 5, 5);
		gbc_pickdateAcct.gridx = 3;
		gbc_pickdateAcct.gridy = 1;
		parameterPanel.add(pickdateAcct, gbc_pickdateAcct);
		parameterPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Currency_ID")), new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
			,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 0, 5), 0, 0));
		parameterPanel.add(currencyPick, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0
			,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 0, 5), 0, 0));
		
		GridBagConstraints gbc_multiCurrency = new GridBagConstraints();
		gbc_multiCurrency.insets = new Insets(5, 0, 0, 5);
		gbc_multiCurrency.gridx = 3;
		gbc_multiCurrency.gridy = 2;
		parameterPanel.add(multiCurrency, gbc_multiCurrency);
		parameterPanel.add(OnlyInvoices, new GridBagConstraints(4, 2, 1, 1, 0.0, 0.0
				,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 0, 5), 0, 0));				
		parameterPanel.add(IsNOSOTrx,    new GridBagConstraints(5, 2, 1, 1, 0.0, 0.0
				,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 0, 0), 0, 0));				
		mainPanel.add(allocationPanel, BorderLayout.SOUTH);
		allocationPanel.add(differenceLabel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
			,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 0, 5), 0, 0));
		allocationPanel.add(differenceField, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0
			,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 0, 5), 0, 0));
		
		autoWriteOff = new CCheckBox();
		autoWriteOff.setText("AutoWriteOff");
		GridBagConstraints gbc_autoWriteOff = new GridBagConstraints();
		gbc_autoWriteOff.insets = new Insets(0, 0, 0, 5);
		gbc_autoWriteOff.gridx = 4;
		gbc_autoWriteOff.gridy = 0;
		allocationPanel.add(autoWriteOff, gbc_autoWriteOff);
		allocationPanel.add(allocateButton, new GridBagConstraints(5, 0, 1, 1, 0.0, 0.0
			,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 0, 0, 0), 0, 0));
		allocationPanel.add(allocCurrencyLabel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
			,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 0, 5), 0, 0));
//		allocationPanel.add(autoWriteOff, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0
//			,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		paymentPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Payment_ID")), BorderLayout.NORTH);
		paymentPanel.add(paymentInfo, BorderLayout.SOUTH);
		paymentPanel.add(paymentScrollPane, BorderLayout.CENTER);
		paymentScrollPane.setViewportView(paymentView);
		invoicePanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID")), BorderLayout.NORTH);
		invoicePanel.add(invoiceInfo, BorderLayout.SOUTH);
		invoicePanel.add(invoiceScrollPane, BorderLayout.CENTER);
		invoiceScrollPane.setViewportView(invoiceView);
		//
		mainPanel.add(infoPanel, BorderLayout.CENTER);
		infoPanel.setOrientation(JSplitPane.VERTICAL_SPLIT);
		infoPanel.setBorder(BorderFactory.createEtchedBorder());
		infoPanel.setTopComponent(paymentPanel);
		infoPanel.setBottomComponent(invoicePanel);
		infoPanel.add(paymentPanel, JSplitPane.TOP);
		infoPanel.add(invoicePanel, JSplitPane.BOTTOM);
		infoPanel.setContinuousLayout(true);
		infoPanel.setPreferredSize(new Dimension(670,250));
		infoPanel.setDividerLocation(110);
		
		//  Translation
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "AllocateStatus"));
		statusBar.setStatusDB("");

		//  Date set to Login Date
		dateField.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		dateField.addVetoableChangeListener(this);		
		return mainPanel;
	}

	/**
	 *	Initialize Panel
	 *  @param WindowNo window
	 *  @param frame frame
	 */
	public void init (int WindowNo, FormFrame frame)
	{
		m_WindowNo = WindowNo;
		m_frame = frame;
		Env.setContext(Env.getCtx(), m_WindowNo, "IsSOTrx", "Y");   //  defaults to no
		m_C_Currency_ID = Env.getContextAsInt(Env.getCtx(), "$C_Currency_ID");   //  default
		//
		log.info("Currency=" + m_C_Currency_ID);
		try
		{
			configureObjectView();
			CPanel panel = Initialize();
			calculate();
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
	}	//	init

	private void configureObjectView() {
		IObjetViewColumn[] invcolumns = VInvoiceRow.getColumns();
	    
	    invoicemodel = new DefaultObjectViewModel(invcolumns, null);
	    invoiceView = new ObjectView(invoicemodel);
	    invoiceView.setColumnSelectionAllowed(false);
	    invoiceView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    invoiceView.configcontrols(m_WindowNo);
	    invoiceView.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    invoiceView.getInputMap(JComponent.WHEN_FOCUSED)		     	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    invoiceView.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				VInvoiceRow irow = (VInvoiceRow) invoiceView.getSelectedRowObjects().get(0);
				if (irow !=null && irow.IsChanged())
					calculate();
			}            
	      });	    	 
	    lkaInvoice = new LineKeyAdapter();
	    lkaInvoice.setContext(m_frame, this, invoiceView, true /* m_showdialoginfo */, m_WindowNo, null, null, null);
	    lkaInvoice.funcCalculateTotalLines("calculate");
	    lkaInvoice.setKeys(0, 0, 0, 0);
	    invoiceView.setContext(this);
	    invoiceView.funcCalculateTotalLines("calculate");
	    invoiceView.addKeyListener(lkaInvoice);	    
	    
	    //
		//TableViewColumn[] paycolumns = VPaymentRow.getColumns(multiCurrency.isSelected());
		IObjetViewColumn[] paycolumns = VPaymentRow.getColumns();
	    
		paymentmodel = new DefaultObjectViewModel(paycolumns, null);
	    paymentView = new ObjectView(paymentmodel);
	    paymentView.setColumnSelectionAllowed(false);
	    paymentView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    paymentView.configcontrols(m_WindowNo);
	    paymentView.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    paymentView.getInputMap(JComponent.WHEN_FOCUSED)		    .put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    paymentView.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				VPaymentRow irow = (VPaymentRow) paymentView.getSelectedRowObjects().get(0);
				if (irow!=null && irow.IsChanged())
					calculate();
			}            
	      });
	    
	    lkaPayment = new LineKeyAdapter();
	    lkaPayment.setContext(m_frame, this, paymentView, true /* m_showdialoginfo */, m_WindowNo, null, null, null);
	    lkaPayment.funcCalculateTotalLines("calculate");
	    lkaPayment.setKeys(0, 0, 0, 0);
	    paymentView.setContext(this);
	    paymentView.funcCalculateTotalLines("calculate");	   	   
	    paymentView.addKeyListener(lkaPayment);	  		
	}

	/**	Window No			*/
	private int         m_WindowNo = 0;
	/**	FormFrame			*/
	private FormFrame 	m_frame;
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(VAllocation.class);

	private boolean     m_calculating = false;
	private int         m_C_Currency_ID = 0;
	private int         m_C_BPartner_ID = 0;
	private int         m_noInvoices = 0;
	private int         m_noPayments = 0;
	//
	private CPanel mainPanel = new CPanel();
	private BorderLayout mainLayout = new BorderLayout();
	private CPanel parameterPanel = new CPanel();
	private CPanel allocationPanel = new CPanel();
	private GridBagLayout parameterLayout = new GridBagLayout();
	private VLookup bpartnerSearch = null;
	private ObjectView invoiceView = new ObjectView();
	private DefaultObjectViewModel invoicemodel;
	private DefaultObjectViewModel paymentmodel;
	private ObjectView paymentView = new ObjectView();
	private JSplitPane infoPanel = new JSplitPane();
	private CPanel paymentPanel = new CPanel();
	private CPanel invoicePanel = new CPanel();
	private BorderLayout paymentLayout = new BorderLayout();
	private BorderLayout invoiceLayout = new BorderLayout();
	private JLabel paymentInfo = new JLabel();
	private JLabel invoiceInfo = new JLabel();
	private JScrollPane paymentScrollPane = new JScrollPane();
	private JScrollPane invoiceScrollPane = new JScrollPane();
	private GridBagLayout allocationLayout = new GridBagLayout();
	private JLabel differenceLabel = new JLabel();
	private CTextField differenceField = new CTextField();
	private JButton allocateButton = new JButton();
	private VLookup currencyPick = null;
	private JLabel allocCurrencyLabel = new JLabel();
	private StatusBar statusBar = new StatusBar();
	private VDate dateField = new VDate();
	//private JCheckBox autoWriteOff = new JCheckBox();
	private JCheckBox OnlyInvoices = new JCheckBox();
	private JCheckBox IsNOSOTrx = new JCheckBox();
	
	private ArrayList<Integer>	m_bpartnerCheck = new ArrayList<Integer>();
	private LineKeyAdapter lkaInvoice;
	private LineKeyAdapter lkaPayment;
	CLabel lOrg_ID;
	VLookup fOrg_ID;
	CCheckBox multiCurrency = new CCheckBox(Msg.getMsg(Env.getCtx(), "MultiCurrency"));
	CLabel lblDateacct;
	VDate pickdateAcct;
	CCheckBox autoWriteOff;

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
	 *  Load Business Partner Info
	 *  - Payments
	 *  - Invoices
	 */
	private void loadBPartner ()
	{
		
		IObjetViewColumn[] invcolumns = VInvoiceRow.getColumns();	    
	    invoicemodel = new DefaultObjectViewModel(invcolumns, null);
	    invoiceView.setModel(invoicemodel);
	    
		//TableViewColumn[] paycolumns = VPaymentRow.getColumns(multiCurrency.isSelected());
	    IObjetViewColumn[] paycolumns = VPaymentRow.getColumns();
		paymentmodel = new DefaultObjectViewModel(paycolumns, null);
		paymentView.setModel(paymentmodel);

		
		log.config("BPartner=" + m_C_BPartner_ID + ", Cur=" + m_C_Currency_ID);
		//  Need to have both values
		if (m_C_BPartner_ID == 0 || m_C_Currency_ID == 0)
			return;

		//	Async BPartner Test
		Integer key = new Integer(m_C_BPartner_ID);
		if (!m_bpartnerCheck.contains(key))
		{
			new Thread()
			{
				public void run()
				{
					MPayment.setIsAllocated (Env.getCtx(), m_C_BPartner_ID, null);
					MInvoice.setIsPaid (Env.getCtx(), m_C_BPartner_ID, null);
				}
			}.start();
			m_bpartnerCheck.add(key);
		}
		
		/********************************
		 *  Load unallocated Payments
		 *      1-TrxDate, 2-DocumentNo, (3-Currency, 4-PayAmt,)
		 *      5-ConvAmt, 6-ConvOpen, 7-Allocated
		 */
		StringBuffer sql = new StringBuffer("SELECT p.DateTrx,p.DocumentNo,p.C_Payment_ID,"  //  1..3
			+ "p.C_Currency_ID,p.PayAmt,p.C_ConversionType_ID,"                            //  4..5
			+ "currencyConvert(p.PayAmt,0,p.C_Currency_ID,?,p.DateTrx,p.C_ConversionType_ID,p.AD_Client_ID,p.AD_Org_ID) as ConvAmt,"//  6   #1
			+ "currencyConvert(paymentAvailable(C_Payment_ID),0,p.C_Currency_ID,?,p.DateTrx,p.C_ConversionType_ID,p.AD_Client_ID,p.AD_Org_ID) as available,"  //  7   #2
			+ "p.MultiplierAP "
			+ "FROM C_Payment_v p"		//	Corrected for AP/AR
			//+ " INNER JOIN C_Currency c ON (p.C_Currency_ID=c.C_Currency_ID) "
			+ " WHERE p.IsAllocated='N' AND p.Processed='Y' "
			+ " AND p.C_Charge_ID IS NULL"		//	Prepayments OK
			+ " AND p.C_BPartner_ID=?");                  		//      #3
		if (!multiCurrency.isSelected())
			sql.append(" AND p.C_Currency_ID=?");				//      #4		
		if (IsNOSOTrx.isSelected())
			sql.append(" AND p.isreceipt='N' ");					
		sql.append(" ORDER BY p.DateTrx,p.DocumentNo");
		log.fine("PaySQL=" + sql.toString());
		cleanlines(paymentView, paymentmodel);
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, m_C_Currency_ID);
			pstmt.setInt(2, m_C_Currency_ID);
			pstmt.setInt(3, m_C_BPartner_ID);
			if (!multiCurrency.isSelected())
				pstmt.setInt(4, m_C_Currency_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				VPaymentRow row  = new VPaymentRow();
				row.setTrxDate(rs.getTimestamp("DateTrx"));
				row.setC_Payment_ID(rs.getInt("C_Payment_ID"));
				row.setC_Currency_ID(rs.getInt("C_Currency_ID")); // moneda del payment				
				row.setC_ConversionType_ID(rs.getInt("C_ConversionType_ID"));
				row.setAmount(rs.getBigDecimal("PayAmt"));
				row.setConvertedAmount(rs.getBigDecimal("ConvAmt"));
				row.setOpenAmt(rs.getBigDecimal("available"));
				DefaultObjectViewModel mModel= (DefaultObjectViewModel) paymentView.getDataModel();
				Object SelectedRow = paymentView.getSelectedRowObject(); 
				mModel.updateRow(SelectedRow,row);									
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}

		sql = new StringBuffer("SELECT i.C_Invoice_ID, true as isinvoice");																																										// #4
		sql.append(" FROM C_Invoice i"); 
		sql.append(" WHERE i.IsPaid='N' AND i.Processed='Y'");
		sql.append(" AND i.C_BPartner_ID=?"); 
		if (IsNOSOTrx.isSelected())
			sql.append(" AND i.IsSOTrx='N' ");
		sql.append(" AND i.C_Currency_ID=? "); 
		if (!OnlyInvoices.isSelected() && !IsNOSOTrx.isSelected()) {
			sql.append(" UNION ALL ");
			sql.append(" SELECT b.C_BOE_ID, false AS isinvoice");
			sql.append(" FROM C_BOE b ");
			sql.append(" WHERE b.C_BPartner_ID=? AND b.C_Currency_ID=? AND b.docstatus != 'DR' ");
		}

		log.fine("InvSQL=" + sql.toString());
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			int j = 1;
			pstmt.setInt(j++, m_C_BPartner_ID);
			pstmt.setInt(j++, m_C_Currency_ID);
			if (!OnlyInvoices.isSelected() && !IsNOSOTrx.isSelected())
			{
				pstmt.setInt(j++, m_C_BPartner_ID);
				pstmt.setInt(j++, m_C_Currency_ID);
			}
			cleanlines(invoiceView, invoicemodel);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				VInvoiceRow row  = new VInvoiceRow();
				if (row.setDoc_ID(rs.getInt("C_Invoice_ID"),rs.getBoolean("IsInvoice")))
				{
					row.setConvertedTo(m_C_Currency_ID);
					row.setC_CurrencyTo_ID(m_C_Currency_ID); 		  // moneda de la factura
					//row.setAmount(rs.getBigDecimal("GrandTotal"));
					//row.setConvertedAmount(rs.getBigDecimal("ConvertedAmount"));
					//row.setConvertedOpen(rs.getBigDecimal("ConvertedOpen"));
					//row.setOpen(rs.getBigDecimal("ConvertedOpen"));
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
		calculate();
	}   //  loadBPartner

	public void cleanlines(ObjectView view, DefaultObjectViewModel model)
	{
		view.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		view.selectAll();
        List selection = view.getSelectedRowObjects();
        view.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        model.removeRows(selection);        
	}
	
	/**************************************************************************
	 *  Action Listener.
	 *  - MultiCurrency
	 *  - Allocate
	 *  @param e event
	 */
	public void actionPerformed(ActionEvent e)
	{
		log.config("");
		if (e.getSource().equals(OnlyInvoices))
			loadBPartner();
		if (e.getSource().equals(IsNOSOTrx))
			loadBPartner();
		//	Allocate
		else if (e.getSource().equals(allocateButton))
		{
			allocateButton.setEnabled(false);
			saveData();
			loadBPartner();
			allocateButton.setEnabled(true);
		}
	}   //  actionPerformed

	private Object newrow(String typedoc) {
		Object object = null;
		if ( typedoc.compareTo("Invoice") == 0 )
			object = new VInvoiceRow();
		else if (typedoc.compareTo("Payment") == 0)
			object = new VPaymentRow();
		return object;
	}

	/**
	 *  Calculate Allocation info
	 */
	public void calculate ()
	{
		log.config("");
		//
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		Timestamp allocDate = null;
		m_noPayments = 0;
		// Payment
		BigDecimal totalPay = Env.ZERO;
		
		ObjectViewModel adapter = paymentView.getDataModel();
		//
//		if (autoWriteOff.isSelected() && invoiceView.getSelectedRowObjects() != null)
//		{
//			VInvoiceRow irow = (VInvoiceRow) invoiceView.getSelectedRowObjects().get(0);
//			
//			//BigDecimal openAmount = irow.getOpen();    //  Open Amount
//			BigDecimal openAmount = irow.getConvertedOpen();
// 			BigDecimal amount = openAmount.subtract((BigDecimal)irow.getDiscount());
//			amount = amount.subtract(irow.getApply());
//			irow.setWriteOff(amount);
//			//	Warning if > 30%
//			if (amount.doubleValue()/openAmount.doubleValue() > .30)
//				ADialog.warn(m_WindowNo, this, "AllocationWriteOffWarn");
// 		}		
		
		
		for (int j=0; j <  paymentView.getRowCount() ; j++)
		{
			VPaymentRow row = (VPaymentRow) adapter.getRowObject(j);
			if (row.getSelect())
			{
				Timestamp ts = row.getTrxDate();
				allocDate = TimeUtil.max(allocDate, ts);
				BigDecimal bd = row.getAppliedAmt();
				totalPay = totalPay.add(bd);
				m_noPayments++;
				//log.fine("Payment_" + i + " = " + bd + " - Total=" + totalPay);				
			}
		}		
		paymentInfo.setText(String.valueOf(m_noPayments) + " - "
			+ Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(totalPay) + " ");

		
		BigDecimal totalInv = Env.ZERO;
		m_noInvoices = 0;
		// Invoices
		adapter = invoiceView.getDataModel();
		for (int j=0; j <  invoiceView.getRowCount() ; j++)
		{
			VInvoiceRow irow = (VInvoiceRow) adapter.getRowObject(j);
			if (irow.getSelect())
			{
				Timestamp ts = irow.getTrxDate();
				allocDate = TimeUtil.max(allocDate, ts);
				//BigDecimal bd = (BigDecimal) irow.getApply();
	 			//amount = amount.
	 			if (irow.getApply().compareTo(Env.ZERO) == 0)
	 			{
					BigDecimal openAmount = irow.getConvertedOpen();
		 			BigDecimal amount = openAmount.subtract((BigDecimal)irow.getDiscount());	 				
	 				irow.setApply(amount);
	 			}
	 			
	 			BigDecimal bd = (BigDecimal) irow.getApply();
	 			bd = bd.subtract(irow.getWriteOff());				
	 			bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
				//BigDecimal openAmount = irow.getConvertedOpen();
	 			//BigDecimal amount = openAmount.subtract((BigDecimal)irow.getDiscount());
				
				//irow.setWriteOff(amount);
				
				
				//totalInv = totalInv.add(bd);
				totalInv = totalInv.add(bd);
				m_noInvoices++;
			}
		}		
		//  Invoices
		invoiceInfo.setText(String.valueOf(m_noInvoices) + " - "
			+ Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(totalInv) + " ");

		//	Set AllocationDate
		if (allocDate != null)
			dateField.setValue(allocDate);
		//  Set Allocation Currency
		allocCurrencyLabel.setText(currencyPick.getDisplay());
		//  Difference
		BigDecimal difference = totalPay.subtract(totalInv);
		differenceField.setText(format.format(difference));
		if (difference.compareTo(new BigDecimal(0.0)) == 0)
			allocateButton.setEnabled(true);
		else
			allocateButton.setEnabled(false);
		//paymentView
		//invoiceView.repaint();
	}   //  calculate

	/**
	 *  Vetoable Change Listener.
	 *  - Business Partner
	 *  - Currency
	 * 	- Date
	 *  @param e event
	 */
	public void vetoableChange (PropertyChangeEvent e)
	{
		String name = e.getPropertyName();
		Object value = e.getNewValue();
		log.config(name + "=" + value);
		if (value == null)
			return;

		//  BPartner
		if (name.equals("C_BPartner_ID"))
		{
			bpartnerSearch.setValue(value);
			m_C_BPartner_ID = ((Integer)value).intValue();
			loadBPartner();
		}
		//	Currency
		else if (name.equals("C_Currency_ID"))
		{
			m_C_Currency_ID = ((Integer)value).intValue();
			loadBPartner();
		}
		//	Date for Multi-Currency
		else if (name.equals("Date")) // && multiCurrency.isSelected())
			loadBPartner();
	}   //  vetoableChange

	
	/**************************************************************************
	 *  Save Data
	 */
	private void saveData()
	{
		if (m_noInvoices + m_noPayments == 0)
			return;

		//  fixed fields
		int AD_Client_ID = Env.getContextAsInt(Env.getCtx(), m_WindowNo, "AD_Client_ID");
		int AD_Org_ID = Env.getContextAsInt(Env.getCtx(), m_WindowNo, "AD_Org_ID");
		int C_BPartner_ID = m_C_BPartner_ID;
		int C_Order_ID = 0;
		int C_CashLine_ID = 0;
		Timestamp DateTrx = (Timestamp)dateField.getValue();		
		Timestamp DateAcct = null; //(Timestamp) pickdateAcct.getValue();
		
		int C_Currency_ID = m_C_Currency_ID;	//	the allocation currency
		//
		if (AD_Org_ID == 0)
		{
			ADialog.error(m_WindowNo, this, "Org0NotAllowed", null);
			return;
		}
		//
		log.config("Client=" + AD_Client_ID + ", Org=" + AD_Org_ID
			+ ", BPartner=" + C_BPartner_ID + ", Date=" + DateTrx);
		
		Trx trx = Trx.get(Trx.createTrxName("AL"), true);

		try {
		/**
		 * Generation of allocations:               amount/discount/writeOff
		 *  - if there is one payment -- one line per invoice is generated
		 *    with both the Invoice and Payment reference
		 *      Pay=80  Inv=100 Disc=10 WOff=10 =>  80/10/10    Pay#1   Inv#1
		 *    or
		 *      Pay=160 Inv=100 Disc=10 WOff=10 =>  80/10/10    Pay#1   Inv#1
		 *      Pay=160 Inv=100 Disc=10 WOff=10 =>  80/10/10    Pay#1   Inv#2
		 *
		 *  - if there are multiple payment lines -- the amounts are allocated
		 *    starting with the first payment and payment
		 *      Pay=60  Inv=100 Disc=10 WOff=10 =>  60/10/10    Pay#1   Inv#1
		 *      Pay=100 Inv=100 Disc=10 WOff=10 =>  20/0/0      Pay#2   Inv#1
		 *      Pay=100 Inv=100 Disc=10 WOff=10 =>  80/10/10    Pay#2   Inv#2
		 *
		 *  - if you apply a credit memo to an invoice
		 *              Inv=10  Disc=0  WOff=0  =>  10/0/0              Inv#1
		 *              Inv=-10 Disc=0  WOff=0  =>  -10/0/0             Inv#2
		 *
		 *  - if you want to write off a (partial) invoice without applying,
		 *    enter zero in applied
		 *              Inv=10  Disc=1  WOff=9  =>  0/1/9               Inv#1
		 *  Issues
		 *  - you cannot write-off a payment
		 */

		//  Payment - Loop and add them to paymentList/amountList
		int pRows = paymentView.getRowCount();
		ArrayList<BigDecimal> amountList = new ArrayList<BigDecimal>(pRows);
		ArrayList<MAllocation> payallocList = new ArrayList<MAllocation>(pRows);
		ArrayList<MAllocation> allocList = new ArrayList<MAllocation>(pRows);
		BigDecimal paymentAppliedAmt = Env.ZERO;
		for (int j=0; j <  paymentView.getRowCount() ; j++)
		{
			VPaymentRow row = (VPaymentRow) paymentView.getDataModel().getRowObject(j);
			if (row.getSelect())
			{
				m_noPayments++;
				BigDecimal PaymentAmt = row.getAppliedAmt();
				amountList.add(PaymentAmt);
				paymentAppliedAmt = paymentAppliedAmt.add(PaymentAmt);
				log.fine("C_Payment_ID=" + row.getC_Payment_ID()	
						+ " - PaymentAmt=" + PaymentAmt); // + " * " + Multiplier + " = " + PaymentAmtAbs);
				MAllocation alloc = new MAllocation();
				MPayment pay = row.getPayment();
				if (!alloc.addHeader(pay, DateTrx, pay.getDateAcct(), C_Currency_ID, trx.getTrxName()))						
					throw new XendraException("cantsaveAllocHeader");				
				payallocList.add(alloc);
				log.fine("C_Payment_ID=" + pay.getC_Payment_ID() 
					+ " - PaymentAmt=" + PaymentAmt); // + " * " + Multiplier + " = " + PaymentAmtAbs);				
			}
		}				
		log.config("Number of Payments=" + payallocList.size() + " - Total=" + paymentAppliedAmt);
		
		//	For all invoices
		int invoiceLines = 0;
		BigDecimal totalAppliedAmt = Env.ZERO;
		
		for (int j=0; j <  invoiceView.getRowCount() ; j++)
		{
			VInvoiceRow row = (VInvoiceRow) invoiceView.getDataModel().getRowObject(j);
			if (row.getSelect())
			{
				invoiceLines++;
				Integer C_Invoice_ID = row.getC_Invoice_ID();
				Boolean IsInvoice =  row.getIsInvoice();
				MInvoice inv  = null;
				MBOE boe = null;
				if (IsInvoice)
					inv = MInvoice.get(Env.getCtx(), C_Invoice_ID);
				else
					boe = MBOE.get(Env.getCtx(), C_Invoice_ID);
				BigDecimal invAppliedAmt = row.getApply();
				BigDecimal invDiscountAmt = row.getDiscount();
				BigDecimal invWriteOffAmt = row.getWriteOff();
				//BigDecimal OverUnderAmt = row.getOpen().subtract(row.getApply()).subtract(row.getDiscount()).subtract(row.getWriteOff());
				BigDecimal invOverUnderAmt = row.getConvertedOpen().subtract(row.getApply()).subtract(row.getDiscount()).subtract(row.getWriteOff());
				int noPayments = 0;
				for (int k = 0; k < payallocList.size() && invAppliedAmt.signum() != 0; k++)
				{
					MAllocation alloc = (MAllocation) payallocList.get(k);
					BigDecimal PaymentAmt = (BigDecimal)amountList.get(k);
					if (PaymentAmt.signum() != 0)
					{
						log.config(".. with payment #" + j + ", Amt=" + PaymentAmt);
						noPayments++;
						//  use Invoice Applied Amt
						BigDecimal amount = invAppliedAmt;
						//	Allocation Line
						if (IsInvoice)
						{
							if (!alloc.addLine(inv, amount, invDiscountAmt, invWriteOffAmt, invOverUnderAmt))
								throw new XendraException("cantsaveallocationline");
						}
						else
						{
							if (!alloc.addLine(boe, amount, invDiscountAmt, invWriteOffAmt, invOverUnderAmt))
								throw new XendraException("cantsaveallocationline");							
						}

						//  Apply Discounts and WriteOff only first time
						invDiscountAmt = Env.ZERO;
						invWriteOffAmt = Env.ZERO;
						//  subtract amount from Payment/Invoice
						invAppliedAmt = invAppliedAmt.subtract(amount);
						PaymentAmt = PaymentAmt.subtract(amount);
						log.fine("Allocation Amount=" + amount + " - Remaining  Applied=" + invAppliedAmt + ", Payment=" + PaymentAmt);
						amountList.set(j, PaymentAmt);  //  update
					}	//	for all applied amounts					
				}
				//  No Payments allocated and none existing (e.g. Inv/CM)
				if (noPayments == 0 && payallocList.size() == 0)
				{
					MAllocation alloc = null;
					if (allocList.size() == 0)
					{
						alloc = new MAllocation();					
						if (!alloc.addHeader(AD_Org_ID, DateTrx, DateAcct, C_Currency_ID, trx.getTrxName()))
							throw new XendraException("cantsaveAllocation");					
						allocList.add(alloc);
					}
					else
					{
						alloc = allocList.get(0);
					}
					int C_Payment_ID = 0;

					log.fine("C_Payment_ID=" + C_Payment_ID + ", C_Invoice_ID=" + C_Invoice_ID
						+ ", Amount=" + invAppliedAmt + ", Discount=" + invDiscountAmt + ", WriteOff=" + invWriteOffAmt);

					if (IsInvoice)
					{
						if (!alloc.addLine(inv, invAppliedAmt, invDiscountAmt, invWriteOffAmt, invOverUnderAmt))
							throw new XendraException("cantsaveAllocLine");					
					}
					else
					{
						if (!alloc.addLine(boe, invAppliedAmt, invDiscountAmt, invWriteOffAmt, invOverUnderAmt))
							throw new XendraException("cantsaveAllocLine");											
					}

					log.fine("Allocation Amount=" + invAppliedAmt);
				}
				totalAppliedAmt = totalAppliedAmt.add(invAppliedAmt);
				log.config("TotalRemaining=" + totalAppliedAmt);
			}
		}
		
		if (invoiceLines == 0 && payallocList.size() > 0 
				&& paymentAppliedAmt.signum() == 0)
			{
				for (int i = 0; i < payallocList.size(); i++)
				{
					MAllocation alloc = payallocList.get(i);
					BigDecimal PaymentAmt = (BigDecimal)amountList.get(i);
					if (alloc.addLine(PaymentAmt, Env.ZERO, Env.ZERO, Env.ZERO))
						throw new XendraException("cantsaveAllocHeader");
				}
			}	//	onlyPayments
		if (totalAppliedAmt.signum() != 0)
			log.log(Level.SEVERE, "Remaining TotalAppliedAmt=" + totalAppliedAmt);

		for (MAllocation alloc:payallocList)
		{
			if (!alloc.completeIt())
				throw new XendraException("cantcompletealloc");
		}
		for (MAllocation alloc:allocList)
		{
			if (!alloc.completeIt())
				throw new XendraException("cantcompletealloc");
		}		
		//if (!alloc.completeIt())
			
		//  Test/Set IsPaid for Invoice - requires that allocation is posted
		for (int i = 0; i < invoiceView.getRowCount(); i++)
		{
			//  Invoice line is selected
			VInvoiceRow row = (VInvoiceRow) invoiceView.getDataModel().getRowObject(i);
			if (row.getSelect())
			{
				Integer C_Invoice_ID = row.getC_Invoice_ID();
				Boolean IsInvoice =  row.getIsInvoice();				
				String sql = "";
				if (IsInvoice)
					sql = "SELECT invoiceOpen(C_Invoice_ID, 0) FROM C_Invoice WHERE C_Invoice_ID=?";
				else
					sql = "SELECT BOEOpen(C_BOE_ID) FROM C_BOE WHERE C_BOE_ID=?";
				
				BigDecimal open = DB.getSQLValueBD(trx.getTrxName(), sql, C_Invoice_ID);
				if (open != null && open.signum() == 0)
				{
					if (IsInvoice)
					{
						sql = "UPDATE C_Invoice SET IsPaid='Y' WHERE C_Invoice_ID=" + C_Invoice_ID;
						int no = DB.executeUpdate(sql, trx.getTrxName());
						log.config("Invoice #" + i + " is paid");
					}
					else
					{
						sql = "UPDATE C_BOE SET IsPaid='Y' WHERE C_BOE_ID=" + C_Invoice_ID;
						int no = DB.executeUpdate(sql, trx.getTrxName());
						log.config("BOE #" + i + " is paid");						
					}
				}
				else
					log.config("Invoice #" + i + " is not paid - " + open);
			}
		}
		//  Test/Set Payment is fully allocated
		//for (int i = 0; i < allocList.size(); i++)
		for (MAllocation alloc:payallocList)
		{
			//int C_Payment_ID = ((Integer)alloc.get(i)).intValue();
			//MPayment pay = new MPayment (Env.getCtx(), C_Payment_ID, trx.getTrxName());
			MPayment pay = alloc.getPayment();
			if (pay.testAllocation())
				pay.save();
			log.config("Payment #" +  (pay.isAllocated() ? " not" : " is") 
				+ " fully allocated");
		}
		payallocList.clear();
		amountList.clear();
		trx.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			trx.rollback();			
		}
		finally 
		{
			trx.close();
		}				
	}   //  saveData
	public boolean candispose() {
		return true;
	}

}   //  VAllocation
