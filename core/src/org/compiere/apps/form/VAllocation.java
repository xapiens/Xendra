/******************************************************************************
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
import java.util.logging.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import org.xendra.exceptions.XendraException;
import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.*;
import org.compiere.grid.ed.*;
import org.compiere.minigrid.*;
import org.compiere.model.MAllocation;
import org.compiere.model.MBOE;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MPayment;
import org.compiere.model.MPaymentLine;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.plaf.*;
import org.compiere.process.*;
import org.compiere.swing.*;
import org.compiere.util.*;

/**
 * Allocation Form
 *
 * @author  Jorg Janke
 * @version $Id: VAllocation.java 5498 2014-12-22 06:24:51Z xapiens $
 * 
 * 2013-07-20 creando paymentline 
 * 
 */
public class VAllocation extends CPanel
	implements FormPanel, ActionListener, TableModelListener, VetoableChangeListener
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
					VAllocation alloc = new VAllocation();
				    JFrame frame = new JFrame("VAllocation");
				    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				    alloc.setOpaque(true);
				    frame.setContentPane(alloc.Initialize());
					AEnv.showCenterScreen(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	
	public VAllocation() throws Exception {
		Initialize();
	}	
	private CPanel Initialize() {
		
		int AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, X_C_Invoice.COLUMNNAME_C_Currency_ID);
		MLookup lookupCur = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		currencyPick = new VLookup(X_C_Invoice.COLUMNNAME_C_Currency_ID, true, false, true, lookupCur);
		currencyPick.setValue(new Integer(m_C_Currency_ID));
		currencyPick.addVetoableChangeListener(this);

		//  BPartner
		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, X_C_Invoice.COLUMNNAME_C_BPartner_ID);
		MLookup lookupBP = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.Search);
		bpartnerSearch = new VLookup(X_C_Invoice.COLUMNNAME_C_BPartner_ID, true, false, true, lookupBP);
		bpartnerSearch.addVetoableChangeListener(this);

		//  Translation
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "AllocateStatus"));
		statusBar.setStatusDB("");

		//  Date set to Login Date
		dateField.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		dateField.addVetoableChangeListener(this);
		//		
		//AD_Column_ID = MColumn.getColumn_ID(MInvoice.Table_Name, "AD_Org_ID", null);
		fOrg_ID = new VLookup("AD_Org_ID", false, false, true, MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 3660, DisplayType.TableDir));;		
		//fOrg_ID = new VLookup("AD_Org_ID", false, false, true, MLookupFactory.get(Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.Table));		
		lOrg_ID.setLabelFor(fOrg_ID);
		fOrg_ID.setBackground(XendraPLAF.getInfoBackground());		
		fOrg_ID.setValue(Env.getAD_Org_ID(Env.getCtx()));
		fOrg_ID.addActionListener(this);
		
		CompiereColor.setBackground(this);
		//
		mainPanel.setLayout(mainLayout);
		dateLabel.setText(Msg.getMsg(Env.getCtx(), "Date"));
		autoWriteOff.setSelected(false);
		autoWriteOff.setText(Msg.getMsg(Env.getCtx(), "AutoWriteOff", true));
		autoWriteOff.setToolTipText(Msg.getMsg(Env.getCtx(), "AutoWriteOff", false));
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
		parameterLayout.rowHeights = new int[]{0, 32, 0};
		//		
		parameterPanel.setLayout(parameterLayout);
		allocationPanel.setLayout(allocationLayout);
		bpartnerLabel.setText(Msg.translate(Env.getCtx(), "C_BPartner_ID"));
		paymentLabel.setRequestFocusEnabled(false);
		paymentLabel.setText(" " + Msg.translate(Env.getCtx(), "C_Payment_ID"));
		invoiceLabel.setRequestFocusEnabled(false);
		invoiceLabel.setText(" " + Msg.translate(Env.getCtx(), "C_Invoice_ID"));
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
		allocateButton.setEnabled(false);
		allocateButton.setText(Msg.getMsg(Env.getCtx(), "Process"));
		allocateButton.addActionListener(this);
		currencyLabel.setText(Msg.translate(Env.getCtx(), "C_Currency_ID"));
		multiCurrency.setText(Msg.getMsg(Env.getCtx(), "MultiCurrency"));
		multiCurrency.addActionListener(this);
		allocCurrencyLabel.setText(".");
		invoiceScrollPane.setPreferredSize(new Dimension(200, 200));
		paymentScrollPane.setPreferredSize(new Dimension(200, 200));
		mainPanel.add(parameterPanel, BorderLayout.NORTH);
		parameterPanel.add(bpartnerLabel, 	new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		parameterPanel.add(bpartnerSearch, 	new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(5, 0, 5, 5), 0, 0));
		parameterPanel.add(dateLabel, 		new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		parameterPanel.add(dateField, 		new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(5, 0, 5, 5), 0, 0));
		parameterPanel.add(lOrg_ID, 		new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		parameterPanel.add(fOrg_ID, 		new GridBagConstraints(5, 0, 1, 1, 0.0, 0.0,GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(5, 0, 5, 0), 0, 0));
		
		pickdateAcctLabel = new CLabel();
		pickdateAcctLabel.setText(Msg.getMsg(Env.getCtx(), "DateAcct"));
		GridBagConstraints gbc_pickdateAcctLabel = new GridBagConstraints();
		gbc_pickdateAcctLabel.insets = new Insets(5, 5, 5, 5);
		gbc_pickdateAcctLabel.gridx = 2;
		gbc_pickdateAcctLabel.gridy = 1;
		parameterPanel.add(pickdateAcctLabel, gbc_pickdateAcctLabel);
		
		pickdateAcct = new VDate("DateAcct", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "DateAcct"));
		GridBagConstraints gbc_pickdateAcct = new GridBagConstraints();
		gbc_pickdateAcct.fill = GridBagConstraints.BOTH;
		gbc_pickdateAcct.insets = new Insets(0, 0, 5, 5);
		gbc_pickdateAcct.gridx = 3;
		gbc_pickdateAcct.gridy = 1;
		pickdateAcct.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		pickdateAcct.addVetoableChangeListener(this);		
		parameterPanel.add(pickdateAcct, gbc_pickdateAcct);
		
		parameterPanel.add(currencyLabel, 	new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 0, 5), 0, 0));
		parameterPanel.add(currencyPick, 	new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(5, 0, 0, 5), 0, 0));
		parameterPanel.add(multiCurrency, 	new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 0, 5), 0, 0));
		parameterPanel.add(OnlyInvoices, 	new GridBagConstraints(4, 2, 1, 1, 0.0, 0.0,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 0, 5), 0, 0));				
		parameterPanel.add(IsNOSOTrx,   	new GridBagConstraints(5, 2, 1, 1, 0.0, 0.0,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 0, 0), 0, 0));				
		mainPanel.add(allocationPanel, BorderLayout.SOUTH);
		allocationPanel.add(differenceLabel,    new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 0), 0, 0));
		allocationPanel.add(differenceField,    new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));
		allocationPanel.add(allocateButton,     new GridBagConstraints(5, 0, 1, 1, 0.0, 0.0,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));
		allocationPanel.add(allocCurrencyLabel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		allocationPanel.add(autoWriteOff,       new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		paymentPanel.add(paymentLabel, BorderLayout.NORTH);
		paymentPanel.add(paymentInfo, BorderLayout.SOUTH);
		paymentPanel.add(paymentScrollPane, BorderLayout.CENTER);
		paymentScrollPane.setViewportView(paymentTable);
		invoicePanel.add(invoiceLabel, BorderLayout.NORTH);
		invoicePanel.add(invoiceInfo, BorderLayout.SOUTH);
		invoicePanel.add(invoiceScrollPane, BorderLayout.CENTER);
		invoiceScrollPane.setViewportView(invoiceTable);
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
		// TODO Auto-generated method stub
		
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

	//  Index	changed if multi-currency
	private int         i_payment = 7;
	//
	private int         i_open = 6;
	private int         i_discount = 7;
	private int         i_writeOff = 8;
	private int         i_applied = 9;
	private int         i_isinvoice = 10;
//	private int			i_multiplier = 10;
	//
	private CPanel mainPanel = new CPanel();
	private BorderLayout mainLayout = new BorderLayout();
	private CPanel parameterPanel = new CPanel();
	private CPanel allocationPanel = new CPanel();
	private GridBagLayout parameterLayout = new GridBagLayout();
	private JLabel bpartnerLabel = new JLabel();
	private VLookup bpartnerSearch = null;
	private MiniTable invoiceTable = new MiniTable();
	private MiniTable paymentTable = new MiniTable();
	private JSplitPane infoPanel = new JSplitPane();
	private CPanel paymentPanel = new CPanel();
	private CPanel invoicePanel = new CPanel();
	private JLabel paymentLabel = new JLabel();
	private JLabel invoiceLabel = new JLabel();
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
	private JLabel currencyLabel = new JLabel();
	private VLookup currencyPick = null;
	private JCheckBox multiCurrency = new JCheckBox();
	private JLabel allocCurrencyLabel = new JLabel();
	private StatusBar statusBar = new StatusBar();
	private JLabel dateLabel = new JLabel();
	private VDate dateField = new VDate();
	private JCheckBox autoWriteOff = new JCheckBox();
	private JCheckBox OnlyInvoices = new JCheckBox();
	private JCheckBox IsNOSOTrx = new JCheckBox();
	private CLabel lOrg_ID = new CLabel(Msg.translate(Env.getCtx(), "AD_Org_ID"));
	private VLookup fOrg_ID;	
	
	private ArrayList<Integer>	m_bpartnerCheck = new ArrayList<Integer>(); 
	CLabel pickdateAcctLabel;
	VDate pickdateAcct;

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
		int AD_Org_ID = 0;
		if (fOrg_ID.getValue() != null)
			AD_Org_ID = (Integer) fOrg_ID.getValue();
		System.out.println("Org "+fOrg_ID.getValue());
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
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		StringBuffer sql = new StringBuffer("SELECT p.DateTrx,p.DocumentNo,p.C_Payment_ID,"  //  1..3
			+ "c.ISO_Code,p.PayAmt,"                            //  4..5
			+ "currencyConvert(p.PayAmt,0,p.C_Currency_ID,?,p.DateTrx,p.C_ConversionType_ID,p.AD_Client_ID,p.AD_Org_ID),"//  6   #1
			+ "currencyConvert(paymentAvailable(C_Payment_ID),0,p.C_Currency_ID,?,p.DateTrx,p.C_ConversionType_ID,p.AD_Client_ID,p.AD_Org_ID),"  //  7   #2
			+ "p.MultiplierAP "
			+ "FROM C_Payment_v p"		//	Corrected for AP/AR
			+ " INNER JOIN C_Currency c ON (p.C_Currency_ID=c.C_Currency_ID) "
			+ "WHERE p.IsAllocated='N' AND p.Processed='Y' AND p.istransfer = 'N' "
			+ " AND p.C_Charge_ID IS NULL"		//	Prepayments OK
			+ " AND p.C_BPartner_ID=?") ;                		//      #3
		if (AD_Org_ID > 0)
			sql.append(" AND p.AD_Org_ID = " + AD_Org_ID);
		sql.append(" AND p.DocStatus = 'CO' ");
		if (!multiCurrency.isSelected())
			sql.append(" AND p.C_Currency_ID=?");				//      #4
		if (IsNOSOTrx.isSelected())
			sql.append(" AND p.isreceipt='N' ");					
		sql.append(" ORDER BY p.DateTrx,p.DocumentNo");
		log.fine("PaySQL=" + sql.toString());
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
				Vector<Object> line = new Vector<Object>();
				line.add(new Boolean(false));       //  0-Selection
				line.add(rs.getTimestamp(1));       //  1-TrxDate
				KeyNamePair pp = new KeyNamePair(rs.getInt(3), rs.getString(2));
				line.add(pp);                       //  2-DocumentNo
				if (multiCurrency.isSelected())
				{
					line.add(rs.getString(4));      //  3-Currency
					line.add(rs.getBigDecimal(5));  //  4-PayAmt
				}
				line.add(rs.getBigDecimal(6));      //  3/5-ConvAmt
				BigDecimal available = rs.getBigDecimal(7);
				if (available == null || available.signum() == 0)	//	nothing available
					continue;
				line.add(available);				//  4/6-ConvOpen/Available
				line.add(Env.ZERO);					//  5/7-Payment
//				line.add(rs.getBigDecimal(8));		//  6/8-Multiplier
				//
				data.add(line);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		//  Remove previous listeners
		paymentTable.getModel().removeTableModelListener(this);
		//  Header Info
		Vector<String> columnNames = new Vector<String>();
		columnNames.add(Msg.getMsg(Env.getCtx(), "Select"));
		columnNames.add(Msg.translate(Env.getCtx(), "Date"));
		columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
		if (multiCurrency.isSelected())
		{
			columnNames.add(Msg.getMsg(Env.getCtx(), "TrxCurrency"));
			columnNames.add(Msg.translate(Env.getCtx(), "Amount"));
		}
		columnNames.add(Msg.getMsg(Env.getCtx(), "ConvertedAmount"));
		columnNames.add(Msg.getMsg(Env.getCtx(), "OpenAmt"));
		columnNames.add(Msg.getMsg(Env.getCtx(), "AppliedAmt"));
//		columnNames.add(" ");	//	Multiplier

		//  Set Model
		DefaultTableModel modelP = new DefaultTableModel(data, columnNames);
		modelP.addTableModelListener(this);
		paymentTable.setModel(modelP);
		//
		int i = 0;
		paymentTable.setColumnClass(i++, Boolean.class, false);         //  0-Selection
		paymentTable.setColumnClass(i++, Timestamp.class, true);        //  1-TrxDate
		paymentTable.setColumnClass(i++, String.class, true);           //  2-Value
		if (multiCurrency.isSelected())
		{
			paymentTable.setColumnClass(i++, String.class, true);       //  3-Currency
			paymentTable.setColumnClass(i++, BigDecimal.class, true);   //  4-PayAmt
		}
		paymentTable.setColumnClass(i++, BigDecimal.class, true);       //  5-ConvAmt
		paymentTable.setColumnClass(i++, BigDecimal.class, true);       //  6-ConvOpen
		paymentTable.setColumnClass(i++, BigDecimal.class, false);      //  7-Allocated
//		paymentTable.setColumnClass(i++, BigDecimal.class, true);      	//  8-Multiplier

		//
		i_payment = multiCurrency.isSelected() ? 7 : 5;

		//  Table UI
		paymentTable.autoSize();


		/********************************
		 *  Load unpaid Invoices
		 *      1-TrxDate, 2-Value, (3-Currency, 4-InvAmt,)
		 *      5-ConvAmt, 6-ConvOpen, 7-ConvDisc, 8-WriteOff, 9-Applied
		 * 
		 */
		data = new Vector<Vector<Object>>();
		sql = new StringBuffer("SELECT i.DateInvoiced,i.DocumentNo,i.C_Invoice_ID,"); //  1..3
		sql.append("c.ISO_Code,i.GrandTotal*i.MultiplierAP, ");                          //  4..5    Orig Currency
		sql.append("currencyConvert(i.GrandTotal*i.MultiplierAP,0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) as ConvertedAmount, "); //  6   #1  Converted
		sql.append("currencyConvert(invoiceOpen(C_Invoice_ID,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID)*i.MultiplierAP as ConvertedOpen, ");  //  7   #2  Converted Open
		sql.append("currencyConvert(invoiceDiscount");                            //  8       AllowedDiscount
		sql.append("(i.C_Invoice_ID,?,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID)*i.Multiplier*i.MultiplierAP as Discount,");               //  #3, #4
		sql.append("i.MultiplierAP, i.c_bpartner_location_id, i.serial, CASE WHEN i.IsSOTrx='Y' THEN '(Venta) ' || dt.name ELSE '(Compra) ' || dt.name END    AS C_DocTypeName, true AS isinvoice ");
		sql.append("FROM C_Invoice_v i");		//  corrected for CM/Split
		sql.append(" INNER JOIN C_Currency c ON (i.C_Currency_ID=c.C_Currency_ID) ");
		sql.append(" LEFT OUTER JOIN C_DocType_trl dt ON i.c_doctype_id = dt.c_doctype_id ");
		sql.append(" LEFT OUTER JOIN C_DocType doc ON i.c_doctype_id = doc.c_doctype_id ");
		sql.append(" WHERE i.IsPaid='N' AND i.Processed='Y'");
		sql.append(" AND i.C_BPartner_ID=?");   //  #5
		if (IsNOSOTrx.isSelected())
			sql.append(" AND i.IsSOTrx='N' ");			
		if (!multiCurrency.isSelected())
			sql.append(" AND i.C_Currency_ID=? ");
		if (AD_Org_ID > 0)
			sql.append(" AND i.AD_Org_ID="+AD_Org_ID);    				
		sql.append(" AND i.DocStatus='CO' ");    
		if (!OnlyInvoices.isSelected())
		{
			sql.append(" UNION ALL ");  
			sql.append(" SELECT b.Dateboe,b.DocumentNo,b.C_BOE_ID, c.ISO_Code, b.GrandTotal,"); 
			sql.append(" CurrencyConvert(b.GrandTotal,0,b.C_Currency_ID,?,b.StatusDate,b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID) as ConvertedAmount,");
			sql.append(" CurrencyConvert(boeOpen(b.C_boe_ID),0,b.C_Currency_ID,?,b.StatusDate,b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID) AS ConvertedOpen,");
			sql.append(" 0 AS Discount, 1 as MultiplierAP, b.C_BPartner_Location_ID, '' as Serial, dt.name as C_DocTypeName, false AS isinvoice");
			sql.append(" from C_BOE b "); 
			sql.append(" JOIN C_Currency c ON (b.C_Currency_ID=c.C_Currency_ID) ");
			sql.append(" LEFT OUTER JOIN C_DOCTYPE DT on (b.C_Doctype_ID = dt.C_Doctype_ID) ");
			sql.append(" WHERE b.C_BPartner_ID=? AND b.docstatus != 'DR' ");
			if (IsNOSOTrx.isSelected())
				sql.append(" AND b.IsSOTrx='N' ");
			if (AD_Org_ID > 0)
				sql.append(" AND b.AD_Org_ID="+AD_Org_ID);    
		}
		log.fine("InvSQL=" + sql.toString());
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			int j = 1;
			pstmt.setInt(j++, m_C_Currency_ID);
			pstmt.setInt(j++, m_C_Currency_ID);
			pstmt.setTimestamp(j++, (Timestamp)dateField.getValue());
			pstmt.setInt(j++, m_C_Currency_ID);
			pstmt.setInt(j++, m_C_BPartner_ID);
			if (!multiCurrency.isSelected())
			{
				pstmt.setInt(j++, m_C_Currency_ID);
			}
			//if (!OnlyInvoices.isSelected() && !IsNOSOTrx.isSelected())
			if (!OnlyInvoices.isSelected())
			{
				pstmt.setInt(j++, m_C_Currency_ID);
				pstmt.setInt(j++, m_C_Currency_ID);
				pstmt.setInt(j++, m_C_BPartner_ID);
			}
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				Vector<Object> line = new Vector<Object>();
				line.add(new Boolean(false));       //  0-Selection
				line.add(rs.getTimestamp(1));       //  1-TrxDate
				line.add(rs.getString("C_DocTypeName")); // 2-Doctype Name
				line.add(rs.getString("Serial")); // 3-serial Document				
				KeyNamePair pp = new KeyNamePair(rs.getInt(3), rs.getString(2));
				line.add(pp);                       //  2-Value
				if (multiCurrency.isSelected())
				{
					line.add(rs.getString(4));      //  3-Currency
					line.add(rs.getBigDecimal(5));  //  4-Orig Amount
				}
				line.add(rs.getBigDecimal(6));      //  3/5-ConvAmt
				BigDecimal open = rs.getBigDecimal(7);
				if (open == null)		//	no conversion rate
					open = Env.ZERO;
				line.add(open);      				//  4/6-ConvOpen
				BigDecimal discount = rs.getBigDecimal(8);
				if (discount == null)	//	no concersion rate
					discount = Env.ZERO;
				line.add(discount);					//  5/7-ConvAllowedDisc
				line.add(Env.ZERO);      			//  6/8-WriteOff
				line.add(Env.ZERO);				    //  7/9-Applied
				line.add(rs.getBoolean("IsInvoice")); // 10 - Is Invoiced
//				line.add(rs.getBigDecimal(9));		//	8/10-Multiplier
				//	Add when open <> 0 (i.e. not if no conversion rate)
				if (Env.ZERO.compareTo(open) != 0)
					data.add(line);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}

		//  Remove previous listeners
		invoiceTable.getModel().removeTableModelListener(this);
		//  Header Info
		columnNames = new Vector<String>();
		columnNames.add(Msg.getMsg(Env.getCtx(), "Select"));
		columnNames.add(Msg.translate(Env.getCtx(), "Date"));
		columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "Documento")));
		columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "Serie")));		
		columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
		if (multiCurrency.isSelected())
		{
			columnNames.add(Msg.getMsg(Env.getCtx(), "TrxCurrency"));
			columnNames.add(Msg.translate(Env.getCtx(), "Amount"));
		}
		columnNames.add(Msg.getMsg(Env.getCtx(), "ConvertedAmount"));
		columnNames.add(Msg.getMsg(Env.getCtx(), "OpenAmt"));
		columnNames.add(Msg.getMsg(Env.getCtx(), "Discount"));
		columnNames.add(Msg.getMsg(Env.getCtx(), "WriteOff"));
		columnNames.add(Msg.getMsg(Env.getCtx(), "AppliedAmt"));
		columnNames.add(Msg.translate(Env.getCtx(), "C_Invoice_ID"));
//		columnNames.add(" ");	//	Multiplier

		//  Set Model
		DefaultTableModel modelI = new DefaultTableModel(data, columnNames);
		modelI.addTableModelListener(this);
		invoiceTable.setModel(modelI);
		//
		i = 0;
		invoiceTable.setColumnClass(i++, Boolean.class, false);         //  0-Selection
		invoiceTable.setColumnClass(i++, Timestamp.class, true);        //  1-TrxDate
		invoiceTable.setColumnClass(i++, String.class, true);           //  2-Document Type
		invoiceTable.setColumnClass(i++, String.class, true);           //  3-Document serial		
		invoiceTable.setColumnClass(i++, String.class, true);           //  2-Value
		if (multiCurrency.isSelected())
		{
			invoiceTable.setColumnClass(i++, String.class, true);       //  3-Currency
			invoiceTable.setColumnClass(i++, BigDecimal.class, true);   //  4-Amt
		}
		invoiceTable.setColumnClass(i++, BigDecimal.class, true);       //  5-ConvAmt
		invoiceTable.setColumnClass(i++, BigDecimal.class, true);       //  6-ConvAmt Open
		invoiceTable.setColumnClass(i++, BigDecimal.class, false);      //  7-Conv Discount
		invoiceTable.setColumnClass(i++, BigDecimal.class, false);      //  8-Conv WriteOff
		invoiceTable.setColumnClass(i++, BigDecimal.class, false);      //  9-Conv Applied
		invoiceTable.setColumnClass(i++, Boolean.class, true);          // 10-Is Invoice
//		invoiceTable.setColumnClass(i++, BigDecimal.class, true);      	//  10-Multiplier
		//  Table UI
		invoiceTable.autoSize();

		i_open = multiCurrency.isSelected() ? 6 : 4;
		i_discount = multiCurrency.isSelected() ? 9 : 7;
		i_writeOff = multiCurrency.isSelected() ? 10 : 8;
		i_applied = multiCurrency.isSelected() ? 11 : 9;
		i_isinvoice = multiCurrency.isSelected() ? 12 : 10;
//		i_multiplier = multiCurrency.isSelected() ? 10 : 8;

		//  Calculate Totals
		calculate();
	}   //  loadBPartner


	
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
		if (e.getSource().equals(multiCurrency))
			loadBPartner();
		//	Allocate
		else if (e.getSource().equals(allocateButton))
		{
			allocateButton.setEnabled(false);
			String error = saveData();		
			if (error.length() > 0)
			{
				ADialog.error(m_WindowNo, this, Msg.translate(Env.getCtx(), error));
			}
			else
			{
				loadBPartner();
				allocateButton.setEnabled(true);
			}
		}
	}   //  actionPerformed

	/**
	 *  Table Model Listener.
	 *  - Recalculate Totals
	 *  @param e event
	 */
	public void tableChanged(TableModelEvent e)
	{
		boolean isUpdate = (e.getType() == TableModelEvent.UPDATE);
		//  Not a table update
		if (!isUpdate)
		{
			calculate();
			return;
		}

		/**
		 *  Setting defaults
		 */
		if (m_calculating)  //  Avoid recursive calls
			return;
		m_calculating = true;
		int row = e.getFirstRow();
		int col = e.getColumn();
		boolean isInvoice = (e.getSource().equals(invoiceTable.getModel()));
		log.config("Row=" + row 
			+ ", Col=" + col + ", InvoiceTable=" + isInvoice);

		//  Payments
		if (!isInvoice)
		{
			TableModel payment = paymentTable.getModel();
			if (col == 0)
			{
				//  selected - set payment amount
				if (((Boolean)payment.getValueAt(row, col)).booleanValue())
				{
					BigDecimal amount = (BigDecimal)payment.getValueAt(row, i_open);   //  Open Amount
					payment.setValueAt(amount, row, i_payment);
				}
				else    //  de-selected
					payment.setValueAt(Env.ZERO, row, i_payment);
			}
		}

		//  Invoice Selection
		else if (col == 0)
		{
			TableModel invoice = invoiceTable.getModel();
			//  selected - set applied amount
			if (((Boolean)invoice.getValueAt(row, col)).booleanValue())
			{
				BigDecimal amount = (BigDecimal)invoice.getValueAt(row, i_open + 2);    //  Open Amount
				amount = amount.subtract((BigDecimal)invoice.getValueAt(row, i_discount));
				invoice.setValueAt(Env.ZERO, row, i_writeOff);     //  to be sure
				invoice.setValueAt(amount, row, i_applied);
			}
			else    //  de-selected
			{
				invoice.setValueAt(Env.ZERO, row, i_writeOff);
				invoice.setValueAt(Env.ZERO, row, i_applied);
			}
			invoiceTable.repaint(); //  update r/o
		}

		//  Invoice - Try to balance entry
		else if (autoWriteOff.isSelected())
		{
			TableModel invoice = invoiceTable.getModel();
			//  if applied entered, adjust writeOff
			if (col == i_applied)
			{
				BigDecimal openAmount = (BigDecimal)invoice.getValueAt(row, i_open + 2);    //  Open Amount
				BigDecimal amount = openAmount.subtract((BigDecimal)invoice.getValueAt(row, i_discount));
				amount = amount.subtract((BigDecimal)invoice.getValueAt(row, i_applied));
				invoice.setValueAt(amount, row, i_writeOff);
				//	Warning if > 30%
				if (amount.doubleValue()/openAmount.doubleValue() > .30)
					ADialog.warn(m_WindowNo, this, "AllocationWriteOffWarn");
			}
			else    //  adjust applied
			{
				BigDecimal amount = (BigDecimal)invoice.getValueAt(row, i_open + 2);    //  Open Amount
				amount = amount.subtract((BigDecimal)invoice.getValueAt(row, i_discount));
				amount = amount.subtract((BigDecimal)invoice.getValueAt(row, i_writeOff));
				invoice.setValueAt(amount, row, i_applied);
			}
		}

		m_calculating = false;
		calculate();
	}   //  tableChanged

	/**
	 *  Calculate Allocation info
	 */
	private void calculate ()
	{
		log.config("");
		//
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		
		Timestamp allocDate = null;
		Timestamp allocDateAcct = null;
		//  Payment
		TableModel payment = paymentTable.getModel();
		BigDecimal totalPay = new BigDecimal(0.0);
		int rows = payment.getRowCount();
		m_noPayments = 0;
		for (int i = 0; i < rows; i++)
		{
			if (((Boolean)payment.getValueAt(i, 0)).booleanValue())
			{
				//
				KeyNamePair pp = (KeyNamePair)payment.getValueAt(i, 2);   //  Value
				int C_Payment_ID = pp.getKey();
				Timestamp ts = DB.getSQLValueTS(null, "SELECT dateacct FROM  c_payment WHERE C_Payment_ID = ?", C_Payment_ID);
				allocDateAcct = TimeUtil.max(allocDateAcct, ts);
				//				
				ts = (Timestamp)payment.getValueAt(i, 1);
				allocDate = TimeUtil.max(allocDate, ts);
				BigDecimal bd = (BigDecimal)payment.getValueAt(i, i_payment);
				totalPay = totalPay.add(bd);  //  Applied Pay
				m_noPayments++;
				log.fine("Payment_" + i + " = " + bd + " - Total=" + totalPay);
			}
		}
		paymentInfo.setText(String.valueOf(m_noPayments) + " - "
			+ Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(totalPay) + " ");

		//  Invoices
		TableModel invoice = invoiceTable.getModel();
		BigDecimal totalInv = new BigDecimal(0.0);
		rows = invoice.getRowCount();
		m_noInvoices = 0;

		for (int i = 0; i < rows; i++)
		{
			if (((Boolean)invoice.getValueAt(i, 0)).booleanValue())
			{
				Timestamp ts = (Timestamp)invoice.getValueAt(i, 1);
				allocDate = TimeUtil.max(allocDate, ts);
				BigDecimal bd = (BigDecimal)invoice.getValueAt(i, i_applied);
				totalInv = totalInv.add(bd);  //  Applied Inv
				m_noInvoices++;
				log.fine("Invoice_" + i + " = " + bd + " - Total=" + totalPay);
			}
		}
		invoiceInfo.setText(String.valueOf(m_noInvoices) + " - "
			+ Msg.getMsg(Env.getCtx(), "Sum") + "  " + format.format(totalInv) + " ");


		//	Set AllocationDate
		if (allocDate != null)
			dateField.setValue(allocDate);
		if (allocDateAcct != null)
			pickdateAcct.setValue(allocDateAcct);
		//  Set Allocation Currency
		allocCurrencyLabel.setText(currencyPick.getDisplay());
		//  Difference
		BigDecimal difference = totalPay.subtract(totalInv);
		differenceField.setText(format.format(difference));
		if (difference.compareTo(new BigDecimal(0.0)) == 0)
			allocateButton.setEnabled(true);
		else
			allocateButton.setEnabled(false);
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
		else if (name.startsWith("Date") && multiCurrency.isSelected())
			loadBPartner();
	}   //  vetoableChange

	
	private String saveData()
	{
		
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
		
		String error = "";
		
		Trx trx = Trx.get(Trx.createTrxName(Util.getUUID()), true);
		
		try 
		{				
			if (m_noInvoices + m_noPayments == 0)
				return error;

			int pRows = paymentTable.getRowCount();
			TableModel paymentTableModel = paymentTable.getModel();
			int iRows = invoiceTable.getRowCount();
			TableModel invoiceTableModel = invoiceTable.getModel();
			BigDecimal paymentAppliedAmt = Env.ZERO;
			BigDecimal totalAppliedAmt = Env.ZERO;
			
			ArrayList<Vector> payList = new ArrayList<Vector>();
			ArrayList<Vector> invList = new ArrayList<Vector>();
			//ArrayList<Vector> invpayList = new ArrayList<Vector>();
			for (int i = 0; i < pRows; i++)
			{
				if (((Boolean)paymentTableModel.getValueAt(i, 0)).booleanValue())
				{
					KeyNamePair pp = (KeyNamePair)paymentTableModel.getValueAt(i, 2);   //  Value
					int C_Payment_ID = pp.getKey();
					MPayment payment = new MPayment(Env.getCtx(), C_Payment_ID, trx.getTrxName());
					if (payment.getDocStatus().equals(DocAction.STATUS_Completed))
					{
						if (!payment.RestoreIt())
						{
							throw new XendraException(payment.getProcessMsg());
						}
						payment.save();
					}					
					BigDecimal PaymentAmt = (BigDecimal)paymentTableModel.getValueAt(i, i_payment);  //  Applied Payment
					Vector pay = new Vector();
					pay.add(C_Payment_ID);
					pay.add(PaymentAmt);
					payList.add(pay);
				}
			}
			
			//	For all invoices
			int invoiceLines = 0;
			int noPayments = 0;
			
			for (int i = 0; i < iRows; i++)
			{
				//  Invoice line is selected
				if (((Boolean)invoiceTableModel.getValueAt(i, 0)).booleanValue())
				{
					invoiceLines++;
					KeyNamePair pp = (KeyNamePair)invoiceTableModel.getValueAt(i, 4);    //  Value
					//  Invoice variables
					int C_Invoice_ID = pp.getKey();
					
					Boolean IsInvoice = (Boolean) invoiceTableModel.getValueAt(i, i_isinvoice);

					MInvoice invoice = null;
					MBOE boe = null;
					
					if (IsInvoice)
						invoice = new MInvoice(Env.getCtx(), C_Invoice_ID, trx.getTrxName());
					else
						boe = new MBOE(Env.getCtx(), C_Invoice_ID, trx.getTrxName());
					
					BigDecimal AppliedAmt = (BigDecimal)invoiceTableModel.getValueAt(i, i_applied);
					//  semi-fixed fields (reset after first invoice)
					BigDecimal DiscountAmt = (BigDecimal)invoiceTableModel.getValueAt(i, i_discount);
					BigDecimal WriteOffAmt = (BigDecimal)invoiceTableModel.getValueAt(i, i_writeOff);
					//	OverUnderAmt needs to be in Allocation Currency
					BigDecimal OverUnderAmt = ((BigDecimal)invoiceTableModel.getValueAt(i, i_open + 2))
							.subtract(AppliedAmt).subtract(DiscountAmt).subtract(WriteOffAmt);
					
					Vector inv = new Vector();
					inv.add(C_Invoice_ID);
					inv.add(IsInvoice);
					inv.add(AppliedAmt);
					inv.add(DiscountAmt);
					inv.add(WriteOffAmt);
					inv.add(OverUnderAmt);
					invList.add(inv);										
					
					for (int j = 0; j < payList.size() && AppliedAmt.signum() != 0; j++)
					{
						Vector pay = payList.get(j);
						int C_Payment_ID = (Integer) pay.get(0);
						BigDecimal PaymentAmt = (BigDecimal) pay.get(1);						
						//noPayments++;
						
						if (PaymentAmt.signum() != 0)
						{
							noPayments++;
							
							MPayment payment = new MPayment(Env.getCtx(), C_Payment_ID, trx.getTrxName());
							BigDecimal amount = AppliedAmt;
							DiscountAmt = Env.ZERO;
							WriteOffAmt = Env.ZERO;
							//  subtract amount from Payment/Invoice
							log.fine("Allocation Amount=" + amount + " - Remaining  Applied=" + AppliedAmt + ", Payment=" + PaymentAmt);
							BigDecimal WithholdingAmt = Env.ZERO;
							MPaymentLine payline = new MPaymentLine(Env.getCtx(), 0, trx.getTrxName());
							payline.setPayment(payment);
							if (invoice != null)
							{						
								BigDecimal WithholdingPercent = Env.ZERO;
								
								payline.setC_Invoice_ID(C_Invoice_ID);								
								payline.setC_Currency_ID(invoice.getC_Currency_ID());
								payline.setC_ConversionType_ID(invoice.getC_ConversionType_ID());
								
								if (invoice.getGrandTotal().signum() > 0 && invoice.getWithholdingAmt().signum() > 0 )
								{
									WithholdingPercent = invoice.getWithholdingAmt().divide(invoice.getGrandTotal(), BigDecimal.ROUND_HALF_UP);
									WithholdingPercent = WithholdingPercent.multiply(Env.ONEHUNDRED);						
								}					
								
								amount = AppliedAmt;								
								if (WithholdingPercent.signum() > 0 && amount.signum() > 0)
								{
									//WithholdingAmt = PayAmt; 
									WithholdingAmt = amount;
									amount = amount.multiply(Env.ONEHUNDRED);
									amount = amount.divide(Env.ONEHUNDRED.add(WithholdingPercent), BigDecimal.ROUND_HALF_UP);
									WithholdingAmt = WithholdingAmt.subtract(amount); 
								}
								payline.setPayAmt(amount);
								payline.setWithholdingAmt(WithholdingAmt);

							}
							else if (boe != null)
							{
								payline.setC_BOE_ID(C_Invoice_ID);
								payline.setC_Currency_ID(boe.getC_Currency_ID());
								payline.setC_ConversionType_ID(boe.getC_ConversionType_ID());
								payline.setPayAmt(amount);
							}							
							
							payline.save();
							
							AppliedAmt = AppliedAmt.subtract(amount.add(WithholdingAmt));
							PaymentAmt = PaymentAmt.subtract(amount.add(WithholdingAmt));							
							pay.set(1, PaymentAmt);
							payList.set(j, pay);							
						}
					}					
					//totalAppliedAmt = totalAppliedAmt.add(AppliedAmt);
					log.config("TotalRemaining=" + totalAppliedAmt);
				}   //  invoice selected
			}   //  invoice loop			
			
			if (noPayments == 0)
			{
				MAllocation alloc = null;
				for (Vector inv:invList)
				{
					Integer 	C_Invoice_ID	= (Integer) inv.get(0);
					Boolean 	IsInvoice 		= (Boolean) inv.get(1);	
					BigDecimal	AppliedAmt 		= (BigDecimal) inv.get(2);
					BigDecimal	DiscountAmt 	= (BigDecimal) inv.get(3);
					BigDecimal	WriteOffAmt 	= (BigDecimal) inv.get(4);
					BigDecimal 	OverUnderAmt 	= (BigDecimal) inv.get(5);
					
					Integer AD_Org_ID = 0;
					MInvoice invo = null;
					MBOE boe = null;
					if (IsInvoice)
					{
						invo = new MInvoice(Env.getCtx(), C_Invoice_ID, trx.getTrxName());
						AD_Org_ID = invo.getAD_Org_ID();
					}	
					else
					{
						boe = new MBOE(Env.getCtx(), C_Invoice_ID, trx.getTrxName());
						AD_Org_ID = boe.getAD_Org_ID();
					}
					
					if (alloc == null)
					{
						alloc = new MAllocation();					
						if (!alloc.addHeader( AD_Org_ID, 
								 (Timestamp) dateField.getValue(), 
								 (Timestamp) pickdateAcct.getValue(), 
								 m_C_Currency_ID, 
								 trx.getTrxName()))
								throw new XendraException("cantsaveAllocation");																
					}
					
					if (IsInvoice)
					{
						if (!alloc.addLine(invo, AppliedAmt, DiscountAmt, WriteOffAmt, OverUnderAmt))
							throw new XendraException("cantsaveAllocLine");					
					}
					else
					{
						if (!alloc.addLine(boe,  
								AppliedAmt, DiscountAmt, WriteOffAmt, OverUnderAmt))
							throw new XendraException("cantsaveAllocLine");											
					}					
				}
				if (alloc != null)
				{
					if (!alloc.completeIt())
						throw new XendraException(alloc.getProcessMsg());
				}
			}
			else
			{
				for (int j = 0; j < payList.size(); j++)
				{
					Vector pay = payList.get(j);
					int C_Payment_ID = (Integer) pay.get(0);
					MPayment payment = new MPayment(Env.getCtx(), C_Payment_ID, trx.getTrxName());
					if (payment.completeIt().equals(DocAction.STATUS_Completed))
					{
						payment.setDocStatus(DocAction.STATUS_Completed);
						payment.save();
					}
				}				
			}
			trx.commit();
		}
		catch (Exception e)
		{
			trx.rollback();
			error = e.getMessage();
		}
		finally
		{
			trx.close();
		}
		return error;
	}
	public boolean candispose() {
		return true;
	}	
}   //  VAllocation
