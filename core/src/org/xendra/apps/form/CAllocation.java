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

package org.xendra.apps.form;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.lang.reflect.Method;
import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.List;
import java.util.logging.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import org.xendra.exceptions.XendraException;
import org.xendra.objectview.DefaultObjectViewModel;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.ObjectView;
import org.xendra.objectview.ObjectViewAdapter;
import org.xendra.objectview.IObjetViewColumn;
import org.xendra.objectview.ObjectViewModel;
import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.*;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.form.VAllocation;
import org.compiere.grid.ed.*;
import org.compiere.minigrid.*;
import org.compiere.model.MCash;
import org.compiere.model.MCashLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MPayment;
import org.compiere.model.MRole;
import org.compiere.model.reference.REF_C_CashTrxType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.plaf.*;
import org.compiere.process.*;
import org.compiere.swing.*;
import org.compiere.util.*;


/**
 *	Cash Allocation.
 *
 * 	@author 	xapiens
 **/
// TableModelListener, 
public class CAllocation extends CFrame
implements FormPanel, ActionListener, ChangeListener, VetoableChangeListener
{

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
			dynInit();
			jbInit();
			calculate();
			frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
	}	//	init

	/**	Window No			*/
	private int         m_WindowNo = 0;
	/**	FormFrame			*/
	private FormFrame 	m_frame;
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(VAllocation.class);	
	//
	private int         i_open = 6;
	private int         i_discount = 7;
	private int         i_writeOff = 8;
	private int         i_applied = 9;
	
	private boolean     m_calculating = false;
	private int         m_C_Currency_ID = 0;
	private int         m_C_BPartner_ID = 0;
	private int         m_C_BPartnerHistory_ID = 0;
	private int 		m_C_CashBook_ID = 0;
	private int         m_noInvoices = 0;
	
	private CPanel searchPanel = new CPanel();
	private CPanel mainPanel = new CPanel();
	private CPanel parameterPanel = new CPanel();
	private CPanel allocationPanel = new CPanel();
	private CPanel cashPanel = new CPanel();
	private VLookup bpartnerSearch = null;		
	private StatusBar statusBar = new StatusBar();
	private VDate dateField = new VDate();
	private JSplitPane infoPanel = new JSplitPane();
	private CPanel invoicePanel = new CPanel();
	private JLabel invoiceInfo = new JLabel();
	private JScrollPane invoiceScrollPane = new JScrollPane();
	private JScrollPane historyScrollPane = new JScrollPane();
	private JLabel differenceLabel = new JLabel();
	private CTextField differenceField = new CTextField();
	private JButton allocateButton = new JButton();
	private VLookup currencyPick = null;
	private VLookup bCashBookSearch = null;
	private VLookup pickCashJournal = null;
	private JCheckBox multiCurrency = new JCheckBox();
	private JLabel allocCurrencyLabel = new JLabel();
	private ObjectView InvoiceView = new ObjectView();
	private MiniTable historyTable = new MiniTable();
	private JCheckBox autoWriteOff = new JCheckBox();
	private JCheckBox InCash = new JCheckBox();
	private CTextField fName = new CTextField(15);	
	private CTextField fDescription = new CTextField(20);	
	private VNumber fAmount = new VNumber("fAmount", false, false, true, DisplayType.Amount, Msg.translate(Env.getCtx(), "fAmount"));
	private ArrayList<Integer>	m_bpartnerCheck = new ArrayList<Integer>();
	private CTabbedPane tabbedPane = new CTabbedPane();
	private CPanel  m_addlButtons = null;
	private Waiting m_waiting;
	private DefaultObjectViewModel m_model;
	private Integer SelectedColumn = 0;
	private Integer SelectedRow = 0;
	private MLookup lookupCJ;
	private CLabel lOrg_ID = new CLabel(Msg.translate(Env.getCtx(), "AD_Org_ID"));
	private VLookup fOrg_ID;
	private BigDecimal totalInv;
	private BigDecimal totalPay;	
	
	public void dispose() {
		if (m_frame != null)
			m_frame.dispose();
		m_frame = null;	
	}

	public void actionPerformed(ActionEvent e) {
		log.config("");
		if (e.getSource().equals(multiCurrency))
		{
	        ObjectViewAdapter adapter = (ObjectViewAdapter) InvoiceView.getModel();
	        IObjetViewColumn[] columns = adapter.getModel().getColumns();
            for (int j = 0; j < columns.length; j++) {
                final IObjetViewColumn column = columns[j];                     
                if (column.getName().compareTo(Msg.getMsg(Env.getCtx(), "TrxCurrency")) == 0) {
                        if (multiCurrency.isSelected() != adapter.isVisible(column)) {                            	
                            adapter.setVisible(column, multiCurrency.isSelected());
                        }
                }
                if (column.getName().compareTo(Msg.translate(Env.getCtx(), "Amount")) == 0) {
                    if (multiCurrency.isSelected() != adapter.isVisible(column)) {                            	
                        adapter.setVisible(column, multiCurrency.isSelected());
                    }
                }		                                      
                
            }			
		}
			//loadBPartner();
		else if (e.getSource().equals(InCash))
		{
			loadBPartner();
		}
		//	Allocate
		else if (e.getSource().equals(allocateButton))
		{
			allocateButton.setEnabled(false);
			lock();
			if (saveData())
				loadBPartner();
			unlock();
			allocateButton.setEnabled(true);
		}		
	}

	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {

		String name = e.getPropertyName();
		Object value = e.getNewValue();		
		log.config(name + "=" + value);
		if (value == null)
			return;
		
		if (name.equals("C_Cash_ID"))
		{
			MCash cash = new MCash(Env.getCtx(), (Integer) value, null);
			if (cash.getStatementDate().compareTo((Timestamp) dateField.getValue()) != 0)
			{
				ADialog.error(m_WindowNo, null, "Error", String.format("La fecha %s no coincide",cash.getStatementDate().toString()));				
				return;
			}
		}
		if (name.equals("C_BPartner_ID"))
		{
			bpartnerSearch.setValue(value);			
			m_C_BPartner_ID = ((Integer)value).intValue();
			loadBPartner();
		}
		if (name.equals("C_CashBook_ID"))
		{
			bCashBookSearch.setValue(value);
			m_C_CashBook_ID = ((Integer)value).intValue();
		}
		//	Currency
		else if (name.equals("C_Currency_ID"))
		{
			m_C_Currency_ID = ((Integer)value).intValue();
			loadBPartner();
		}		
		//	Date for Multi-Currency
		else if (name.equals("Date")) 
		{ 
			if ( multiCurrency.isSelected()) 		
				loadBPartner();
		}		
		else if (name.equals("fAmount"))
			calculate();
				
	}
	
	private void loadBPartner ()
	{
		int AD_Org_ID = 0;
		if (fOrg_ID.getValue() != null)
			AD_Org_ID = (Integer) fOrg_ID.getValue();
		log.config("BPartner=" + m_C_BPartner_ID + ", Cur=" + m_C_Currency_ID + ", Cash Book=" + m_C_CashBook_ID);
		//  Need to have three values
		if (m_C_BPartner_ID == 0 || m_C_Currency_ID == 0 )
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
		
		cleanlines();
		
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		StringBuffer sqlprev = new StringBuffer("SELECT i.DateInvoiced,i.DocumentNo,i.C_Invoice_ID," //  1..3
			+ "c.ISO_Code,i.GrandTotal*i.MultiplierAP as Total, "                            //  4..5    Orig Currency
			+ "currencyConvert(i.GrandTotal*i.MultiplierAP,0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) as TotalConverted, " //  6   #1  Converted
			+ "currencyConvert(invoiceOpen(C_Invoice_ID,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID)*i.MultiplierAP, "  //  7   #2  Converted Open
			+ "currencyConvert(invoiceDiscount"                               //  8       AllowedDiscount
			
			+ "(i.C_Invoice_ID,?,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID)*i.Multiplier*i.MultiplierAP as DiscountConverted,"               //  #3, #4
			+ "i.MultiplierAP ,"
			+ "( SELECT sum(amount) from C_CashLine cl where cl.C_Invoice_ID = i.C_Invoice_ID and cl.processed = 'N') as Pending,"
			+ "( SELECT a.name from ad_user a where a.ad_user_id = i.salesrep_id) as vendorname "
			+ " FROM C_Invoice_v i"		//  corrected for CM/Split
			+ " INNER JOIN C_Currency c ON (i.C_Currency_ID=c.C_Currency_ID) "
			+ "WHERE i.IsPaid='N' AND i.Processed='Y'"
			+ " AND i.C_BPartner_ID=? ");
			if (AD_Org_ID > 0)
				sqlprev.append(" AND i.AD_Org_ID = " + AD_Org_ID);
			sqlprev.append(" AND i.DocStatus = 'CO' ");
		
		//
		if (!InCash.isSelected())
		{
			sqlprev = sqlprev.append("AND NOT EXISTS (SELECT * FROM C_CashLine cl WHERE cl.C_Invoice_ID = i.C_Invoice_ID)");
		}
			
		if (!multiCurrency.isSelected())
			sqlprev.append(" AND i.C_Currency_ID=?");                                   //  #6
		sqlprev.append(" ORDER BY i.DateInvoiced, i.DocumentNo");
		log.fine("InvSQL=" + sqlprev.toString());
		String sql  = MRole.getDefault(Env.getCtx(), false).addAccessSQL(sqlprev.toString(), "i", true, true);	//	RW to restrict Access
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, m_C_Currency_ID);
			pstmt.setInt(2, m_C_Currency_ID);
			pstmt.setTimestamp(3, (Timestamp)dateField.getValue());
			pstmt.setInt(4, m_C_Currency_ID);
			pstmt.setInt(5, m_C_BPartner_ID);
			if (!multiCurrency.isSelected())
				pstmt.setInt(6, m_C_Currency_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				BigDecimal open = rs.getBigDecimal(7);
				if (open == null)		//	no conversion rate
				open = Env.ZERO;
				if (Env.ZERO.compareTo(open) != 0)
				{
					CAllocationRow row = new CAllocationRow();
					row.setSelect(false);				
					row.setParent(this);
					row.setTrxDate(rs.getTimestamp("DateInvoiced"));
					row.setC_Invoice_ID(rs.getInt("C_Invoice_ID"));
					row.setPending(rs.getBigDecimal("Pending"));
					row.setDocumentNo(rs.getString("DocumentNo"));
					row.setISOCode(rs.getString("ISO_Code"));
					row.setOrigAmount(rs.getBigDecimal("Total"));
					row.setVendorName(rs.getString("vendorname"));
					row.setConvertedAmount(rs.getBigDecimal("TotalConverted"));
					row.setOpenAmt(open);
					BigDecimal discount = rs.getBigDecimal("DiscountConverted");
					if (discount == null)	//	no concersion rate
						discount = Env.ZERO;
					row.setDiscountAmount(discount);
					AddLine();
					int nPos = InvoiceView.getSelectedRow();
					DefaultObjectViewModel mModel= (DefaultObjectViewModel) InvoiceView.getDataModel();
					Object SelectedRow = InvoiceView.getSelectedRowObject(); 
					mModel.updateRow(SelectedRow,row);					
					InvoiceView.setRowSelectionInterval(nPos, nPos);							
				}
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sqlprev.toString(), e);
		}		
		calculate();
		tabbedPane.setEnabledAt(1, true);
	}
		
	/**
	 *  Dynamic Init (prepare dynamic fields)
	 *  @throws Exception if Lookups cannot be initialized
	 */
	private void dynInit() throws Exception
	{
		//  Date set to Login Date
		dateField.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		dateField.addVetoableChangeListener(this);			
		
		//  Currency
		int AD_Column_ID = Util.getColumnID(MInvoice.Table_ID,"C_Currency_ID");
		MLookup lookupCur = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		currencyPick = new VLookup("C_Currency_ID", true, false, true, lookupCur);
		currencyPick.setValue(new Integer(m_C_Currency_ID));
		currencyPick.addVetoableChangeListener(this);
		
		//  BPartner
		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID,"C_BPartner_ID");
		MLookup lookupBP = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.Search);
		bpartnerSearch = new VLookup("C_BPartner_ID", true, false, true, lookupBP);
		bpartnerSearch.addVetoableChangeListener(this);
		
		
		AD_Column_ID = Util.getColumnID(MCash.Table_ID,"C_CashBook_ID");
		MLookup lookupCB = MLookupFactory.get ( Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		bCashBookSearch = new VLookup("C_CashBook_ID", true, false, true, lookupCB);
		bCashBookSearch.addVetoableChangeListener(this);
		
		AD_Column_ID = Util.getColumnID(MCash.Table_ID, "C_Cash_ID");
		lookupCJ = MLookupFactory.get ( Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.Search);
		lookupCJ.setValidation(String.format("DOCSTATUS!='CO'",dateField.getValue().toString()));
		pickCashJournal = new VLookup("C_Cash_ID", true, false, true, lookupCJ);
		pickCashJournal.addVetoableChangeListener(this);		
		
		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, "AD_Org_ID");
		fOrg_ID = new VLookup("AD_Org_ID", false, false, true,
			MLookupFactory.get(Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir));
		lOrg_ID.setLabelFor(fOrg_ID);
		fOrg_ID.setBackground(XendraPLAF.getInfoBackground());
		fOrg_ID.setValue(Env.getAD_Org_ID(Env.getCtx()));
		
		
		if (bCashBookSearch.getValue() != null)
			m_C_CashBook_ID = (Integer) bCashBookSearch.getValue();		
		
		//  Translation
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "AllocateStatus"));
		statusBar.setStatusDB("");						
		fAmount.addVetoableChangeListener(this);				
		
	}
	
	private void refreshView()
	{
        List selection = InvoiceView.getSelectedRowObjects();
        CAllocationRow row = null;
        if (selection.size() > 0)
        {
            row = (CAllocationRow) selection.get(0);
            if (row == null)
            	return;
            if ( row.IsChanged() )
            {            
        		if (autoWriteOff.isSelected())
        		{		            				
    				BigDecimal amount = row.getOpenAmt();
    				amount = amount.subtract(row.getDiscountAmount());
    				amount = amount.subtract(row.getAppliedAmt());
    				row.setWriteOffAmount(amount);
        		}
        		calculate();
        		InvoiceView.repaint();
            	row.setIsChanged(false);
            }
            else
            {
            	if (row.getM_processMsg() != null )
            	{
        			ADialog.error(m_WindowNo, null, "Error", Msg.getMsg(Env.getCtx(),row.getM_processMsg()));
            		row.setM_processMsg(null);
            	}
            }			        		
        }			        								
	}
	
	/**
	 *  Static Init
	 *  @throws Exception
	 */
	private void jbInit() throws Exception
	{
		CompiereColor.setBackground(this);
		//
		IObjetViewColumn[] columns = getColumns();

	    CAllocationRow[] rows = { newrow() };
	    
	    m_model = new DefaultObjectViewModel(columns, null);
	    InvoiceView = new ObjectView(m_model);
	    InvoiceView.setColumnSelectionAllowed(false);
	    InvoiceView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    InvoiceView.configcontrols(m_WindowNo);
	    InvoiceView.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    InvoiceView.getInputMap(JComponent.WHEN_FOCUSED)		     	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    InvoiceView.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				refreshView();
			}            
	      });	    
	    
	    InvoiceView.addKeyListener(
	    		new KeyAdapter() { 			  
				public void keyPressed(KeyEvent e) {
		        	int key = e.getKeyCode();
		        	Boolean altdown = e.isAltDown();
		        	refreshView();
				}
		 });

		mainPanel.setLayout(new BorderLayout()/* mainLayout*/);
		autoWriteOff.setSelected(false);
		autoWriteOff.setText(Msg.getMsg(Env.getCtx(), "AutoWriteOff", true));
		autoWriteOff.setToolTipText(Msg.getMsg(Env.getCtx(), "AutoWriteOff", false));
		
		InCash.setSelected(false);
		InCash.setText(Msg.getMsg(Env.getCtx(), "InCash", true));
		InCash.setToolTipText(Msg.getMsg(Env.getCtx(), "InCash", false));
		InCash.addActionListener(this);
		//
		parameterPanel.setLayout(new GridBagLayout() /*parameterLayout*/);
		allocationPanel.setLayout(new GridBagLayout() /*allocationLayout*/);
		cashPanel.setLayout(new GridBagLayout() /*cashLayout*/);
		invoicePanel.setLayout(new BorderLayout() /*invoiceLayout*/);
		invoiceInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		invoiceInfo.setHorizontalTextPosition(SwingConstants.RIGHT);
		invoiceInfo.setText(".");
		
		fDescription.setBackground(XendraPLAF.getInfoBackground());
		fDescription.addActionListener(this);

		multiCurrency.setText(Msg.getMsg(Env.getCtx(), "MultiCurrency"));
		multiCurrency.addActionListener(this);
		allocCurrencyLabel.setText(".");
		
		differenceLabel.setText(Msg.getMsg(Env.getCtx(), "Difference"));
		differenceField.setBackground(XendraPLAF.getFieldBackground_Inactive());
		differenceField.setEditable(false);
		differenceField.setText("0");
		differenceField.setColumns(8);
		allocateButton.setText(Msg.getMsg(Env.getCtx(), "Process"));
		allocateButton.addActionListener(this);
		allocCurrencyLabel.setText(".");				
		
		invoiceScrollPane.setPreferredSize(new Dimension(200, 200));
		
		historyScrollPane.setPreferredSize(new Dimension(200, 200));
		
		mainPanel.add(parameterPanel, BorderLayout.NORTH);
		//tabbedPane.add(parameterPanel,        Msg.getMsg(Env.getCtx(), "ViewerQuery"));
		// partner
		parameterPanel.add(new CLabel(Msg.translate(Env.getCtx(), "C_BPartner_ID")), new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0	,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		parameterPanel.add(bpartnerSearch, 							  				 new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0 ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));
		parameterPanel.add(new CLabel(Msg.getMsg(Env.getCtx(), "Date")), 			 new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0	,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		parameterPanel.add(dateField, 												 new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0 ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));
		parameterPanel.add(lOrg_ID, 												 new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		parameterPanel.add(fOrg_ID, 												 new GridBagConstraints(5, 0, 1, 1, 0.0, 0.0,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));		
		parameterPanel.add(new CLabel(Msg.translate(Env.getCtx(), "C_Currency_ID")), new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0	,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		parameterPanel.add(currencyPick, 							                 new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));
		parameterPanel.add(multiCurrency, 											 new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));
		parameterPanel.add(InCash, 									    			 new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));		
		//
		mainPanel.add(allocationPanel, BorderLayout.SOUTH);
		//
		cashPanel.add(new CLabel(Msg.translate(Env.getCtx(),"C_CashBook_ID")), new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
				,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));		
		cashPanel.add(bCashBookSearch, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
				,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		cashPanel.add(new CLabel(Msg.translate(Env.getCtx(),"C_Cash_ID").concat(" (Solo cajas abiertas)")), new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0
				,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		cashPanel.add(pickCashJournal, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0
				,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));		
		//
		cashPanel.add(new CLabel(Msg.translate(Env.getCtx(), "Name")), new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
				,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		cashPanel.add(fName, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0
				,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		cashPanel.add(new CLabel(Msg.translate(Env.getCtx(), "Description")), new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0
				,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		cashPanel.add(fDescription, new GridBagConstraints(3, 1, 3, 1, 0.0, 0.0
				,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		cashPanel.add(new CLabel(Msg.translate(Env.getCtx(), "GrandTotal")), new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
				,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		cashPanel.add(fAmount, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0
				,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		//
		allocationPanel.add(new CLabel(Msg.getMsg(Env.getCtx(), "Difference")), new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
				,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 0), 0, 0));
		allocationPanel.add(differenceField, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0
				,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));
		allocationPanel.add(allocateButton, new GridBagConstraints(5, 1, 1, 1, 0.0, 0.0
				,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 0, 5, 5), 0, 0));
		allocationPanel.add(allocCurrencyLabel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0
				,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		allocationPanel.add(autoWriteOff, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0
				,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5+1, 5, 5), 0, 0));

		invoicePanel.add(new CLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID")), BorderLayout.NORTH);
		invoicePanel.add(invoiceInfo, BorderLayout.SOUTH);
		invoicePanel.add(invoiceScrollPane, BorderLayout.CENTER);
		//invoiceScrollPane.getViewport().add(invoiceTable, null);
		invoiceScrollPane.getViewport().add(InvoiceView, null);
		
		mainPanel.add(infoPanel, BorderLayout.CENTER);
		
		infoPanel.setOrientation(JSplitPane.VERTICAL_SPLIT);
		infoPanel.setBorder(BorderFactory.createEtchedBorder());
		infoPanel.setTopComponent(cashPanel);
		infoPanel.setBottomComponent(invoicePanel);
		infoPanel.add(cashPanel, JSplitPane.TOP);
		infoPanel.add(invoicePanel, JSplitPane.BOTTOM);
		infoPanel.setContinuousLayout(true);
		infoPanel.setPreferredSize(new Dimension(800,300));
		infoPanel.setDividerLocation(130);

		searchPanel.setLayout(new BorderLayout() /*searchLayout*/);
		//searchPanel.add(bpartnerSearch2,BorderLayout.NORTH);
		searchPanel.add(historyScrollPane, BorderLayout.CENTER);
		historyScrollPane.getViewport().add(historyTable, null);
		
		m_addlButtons = new CPanel(new FlowLayout(FlowLayout.LEFT));
		searchPanel.add(m_addlButtons, BorderLayout.SOUTH);

		//AppsAction aa = new AppsAction ("History", KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), null);
		AppsAction aa = new AppsAction ("History", null , null);
		CButton button = (CButton)aa.getButton();
		//searchPanel.add(button, BorderLayout.SOUTH);
		m_addlButtons.add(button);
		//button.setMargin(s_insets);
		
		//
		
		//frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		//searchPanel.setEnabled(false);		
		tabbedPane.add(mainPanel,   Msg.getMsg(Env.getCtx(), "PaymentAllocation"));
		tabbedPane.add(searchPanel, Msg.getMsg(Env.getCtx(), "History"));
		tabbedPane.setEnabledAt(1, false);
		tabbedPane.addChangeListener(this);
				

	}
	
	private CAllocationRow newrow() {
		return new CAllocationRow();
	}

	private IObjetViewColumn[] getColumns() {
		//Vector<Object> column = new Vector<Object>();
		ArrayList<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		Method getter;
		Method setter;
		try {
			getter = CAllocationRow.class.getDeclaredMethod("getSelect", null);
		    setter = CAllocationRow.class.getDeclaredMethod("setSelect", new Class[] {Boolean.class});
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.getMsg(Env.getCtx(), "Select"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ false, /* sortable */	 false, /* searchable */ false, 0, 0
	              ));
		    //
		    //
			getter = CAllocationRow.class.getDeclaredMethod("getTrxDate", null);
			setter = null;
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.translate(Env.getCtx(), "Date"), 
	            		  null,
	            		  (Method)   getter,
	            		  (Method)   setter,
	            		  true /* visible */ ,
	            		  null /* format */ ,
	            		  true /* sortable */,
	            		  false /* searchable */,
	            		  false /* IsColorColum */,
	            		  0, 0
	              ));
		    //
		    //
			getter = CAllocationRow.class.getDeclaredMethod("getDocumentNo", null);
			setter = null;
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")), 
	            		  null,
	            		  (Method)   getter,
	            		  (Method)   setter,
	            		  true /* visible */ ,
	            		  null /* format */ ,
	            		  true /* sortable */,
	            		  false /* searchable */,
	            		  false /* IsColorColum */,
	            		  0, 0
	              ));
		    //
		    //
			getter = CAllocationRow.class.getDeclaredMethod("getVendorName", null);
			setter = null;			
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.translate(Env.getCtx(), "salesrep_id"),
	            		  null,
	            		  (Method)   getter,
	            		  (Method)   setter,
	            		  true /* visible */ ,
	            		  null /* format */ ,
	            		  true /* sortable */,
	            		  false /* searchable */,
	            		  false /* IsColorColum */,
	            		  0, 0
	              ));
		    //
		    //		    
			getter = CAllocationRow.class.getDeclaredMethod("getISOCode", null);
			setter = null;			
		    newcolumns.add(new DefaultTableViewColumn
		              (
		            		  Msg.getMsg(Env.getCtx(), "TrxCurrency"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ true /* sortable */,	 false, /* searchable */ false, 0, 0
		              ));
		    //
			getter = CAllocationRow.class.getDeclaredMethod("getAmount", null);
		    setter = null;
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.translate(Env.getCtx(), "Amount"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ false, /* sortable */	 false, /* searchable */ false, 0, 0
	              ));
		    //
			getter = CAllocationRow.class.getDeclaredMethod("getConvertedAmount", null);
		    setter = null;
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.getMsg(Env.getCtx(), "ConvertedAmount"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ false, /* sortable */	 false, /* searchable */ false, 0, 0
	              ));
		    //
		    getter = CAllocationRow.class.getDeclaredMethod("getOpenAmt", null);
		    setter = null;
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.getMsg(Env.getCtx(), "OpenAmt"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ false, /* sortable */	 false, /* searchable */ false, 0, 0
	              ));
		    //
		    getter = CAllocationRow.class.getDeclaredMethod("getDiscountAmount", null);
		    setter = CAllocationRow.class.getDeclaredMethod("setDiscountAmount", new Class[] {BigDecimal.class});
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.getMsg(Env.getCtx(), "Discount"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ false, /* sortable */	 false, /* searchable */ false, 0, 0
	              ));
		    //
		    getter = CAllocationRow.class.getDeclaredMethod("getPending", null);
		    setter = null;		    
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.getMsg(Env.getCtx(), "Pendiente"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ false, /* sortable */	 false, /* searchable */ false, 0, 0
	              ));
		    //
		    getter = CAllocationRow.class.getDeclaredMethod("getWriteOffAmount", null);
		    setter = CAllocationRow.class.getDeclaredMethod("setWriteOffAmount", new Class[] {BigDecimal.class});		 
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.getMsg(Env.getCtx(), "WriteOff"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ false, /* sortable */	 false, /* searchable */ false, 0, 0
	              ));
		    //
		    getter = CAllocationRow.class.getDeclaredMethod("getAppliedAmt", null);
		    setter = CAllocationRow.class.getDeclaredMethod("setAppliedAmt", new Class[] {BigDecimal.class});
		    //NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.getMsg(Env.getCtx(), "AppliedAmt"), null,(Method) getter,(Method)   setter,true/* visible */, null /* format */, false /* sortable */	, false /* searchable */, false /* IsColor */, 0, 0
	              ));		    		    		    		    
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    IObjetViewColumn[] columns = new IObjetViewColumn[newcolumns.size ()];
        newcolumns.toArray(columns);
        return columns;		  
	}

	/**
	 *  Calculate Allocation info
	 */
	private void calculate ()
	{
		log.config("");
		//
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		Timestamp allocDate = null;
		
		//  Invoices
		//TableModel invoice = invoiceTable.getModel();
		totalInv = Env.ZERO;
		totalPay = Env.ZERO;
		//int rows = invoice.getRowCount();
		m_noInvoices = 0;
		
		if (fAmount.getValue() != null)
			totalPay = (BigDecimal) fAmount.getValue();
			
		ObjectViewModel adapter = InvoiceView.getDataModel();
		for (int j=0; j < InvoiceView.getRowCount() ; j++)
		{
			CAllocationRow row = (CAllocationRow) adapter.getRowObject(j);
			row.setRowID(j+1);
			Timestamp ts = (Timestamp) row.getTrxDate();
			allocDate = TimeUtil.max(allocDate, ts);
			BigDecimal bd = (BigDecimal) row.getAppliedAmt();
			totalInv = totalInv.add(bd);  //  Applied Inv
			m_noInvoices++;
		}		
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
		if (difference.compareTo(Env.ZERO) == 0)
			allocateButton.setEnabled(true);
		else
			allocateButton.setEnabled(false);
	}
	
	public BigDecimal getTotalPay()
	{
		return totalPay;
	}
	
	public BigDecimal getTotalInv()
	{
		return totalInv;
	}
	
	private boolean saveData()
	{
		if (m_noInvoices == 0)
			return false;		
		//  fixed fields
		int AD_Client_ID = Env.getContextAsInt(Env.getCtx(), m_WindowNo, "AD_Client_ID");
		int AD_Org_ID = Env.getContextAsInt(Env.getCtx(), m_WindowNo, "AD_Org_ID");
		int C_BPartner_ID = m_C_BPartner_ID;
		int C_CashBook_ID = m_C_CashBook_ID;
		Timestamp DateTrx = (Timestamp)dateField.getValue();
		int C_Currency_ID = m_C_Currency_ID;	//	the allocation currency
		//
		if (AD_Org_ID == 0)
		{
			ADialog.error(m_WindowNo, this, "Org0NotAllowed", null);
			return false;
		}
		//
		log.config("Client=" + AD_Client_ID + ", Org=" + AD_Org_ID
			+ ", BPartner=" + C_BPartner_ID + ", Date=" + DateTrx);
		
		//Trx trx = Trx.get(Trx.createTrxName("AL"), true);
		
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
		//  Invoices - Loop and generate alloctions
		MCash cash = null;
		//int iRows = invoiceTable.getRowCount();
		//DefaultTableModel invoice = (DefaultTableModel)invoiceTable.getModel();
		BigDecimal totalAppliedAmt = (BigDecimal) fAmount.getValue();		
		if (C_CashBook_ID == 0 && pickCashJournal.getValue() != null)
			cash = new MCash(Env.getCtx(), (Integer) pickCashJournal.getValue(), null);
		else if (C_CashBook_ID != 0)
			cash = MCash.get(Env.getCtx(), C_CashBook_ID, DateTrx, null);
		else
		{
			ADialog.error(m_WindowNo, this, "debe seleccionarse o caja o libro caja");
			return false;
		}
		
		if (cash.getStatementDate().compareTo((Timestamp) dateField.getValue()) != 0)
		{
			ADialog.error(m_WindowNo, this, "no es posible procesar caja o libro caja cuya fecha no coincida con la asignacion del pago");
			return false;
		}
		
	    Trx m_trx = Trx.get(Trx.createTrxName("CAllocationProcess"), true);
		String trxName = m_trx.getTrxName();			

		try {
			
			if (cash == null || cash.get_ID() == 0 || !cash.getDocStatus().equals(REF__DocumentStatus.Drafted) && C_CashBook_ID != 0 )
			{
				cash = new MCash(Env.getCtx(), 0, trxName);
				cash.setAD_Org_ID(AD_Org_ID);			
				cash.setC_CashBook_ID(C_CashBook_ID);
				cash.setDateAcct(DateTrx);
				cash.setName((String) fName.getValue());
				cash.setDescription((String) fDescription.getValue());
				if (cash.get_ID() == 0   &&  !cash.save()) {				
					log.log(Level.SEVERE, "cash not created");
					throw new XendraException("cash not created");
				}
			}						
			//	For all invoices
			int invoiceLines = 0;
			
			ObjectViewModel adapter = InvoiceView.getDataModel();
			for (int j=0; j <  InvoiceView.getRowCount() ; j++)
			{
				CAllocationRow row = (CAllocationRow) adapter.getRowObject(j);
				if (row.getSelect())
				{
					invoiceLines++;
					int C_Invoice_ID = row.getC_Invoice_ID();
					
					MInvoice invoice = MInvoice.get(Env.getCtx(), C_Invoice_ID);
					BigDecimal WithholdingPercent = Env.ZERO;
					if (invoice.getGrandTotal().signum() > 0 && invoice.getWithholdingAmt().signum() > 0 )
					{
						WithholdingPercent = invoice.getWithholdingAmt().divide(invoice.getGrandTotal(), BigDecimal.ROUND_HALF_UP);
						WithholdingPercent = WithholdingPercent.multiply(Env.ONEHUNDRED);						
					}					
					
					BigDecimal AppliedAmt = row.getAppliedAmt();					
					BigDecimal DiscountAmt = row.getDiscountAmount();
					BigDecimal WriteOffAmt = row.getWriteOffAmount();
					BigDecimal OverUnderAmt = row.getOpenAmt().subtract(AppliedAmt).subtract(DiscountAmt).subtract(WriteOffAmt);
					//if (WithholdingPercent.signum() > 0)
					//	WithholdingAmt = Util.percent(amount, WithholdingPercent);
					BigDecimal amount = AppliedAmt;
					BigDecimal WithholdingAmt = Env.ZERO;
					if (WithholdingPercent.signum() > 0 && amount.signum() > 0)
					{
						//WithholdingAmt = PayAmt; 
						WithholdingAmt = amount;
						amount = amount.multiply(Env.ONEHUNDRED);
						amount = amount.divide(Env.ONEHUNDRED.add(WithholdingPercent), BigDecimal.ROUND_HALF_UP);
						WithholdingAmt = WithholdingAmt.subtract(amount); 
					}												
					
					MCashLine line = new MCashLine(cash);
					line.setC_Currency_ID(C_Currency_ID);			
					line.setC_Invoice_ID(C_Invoice_ID);
					line.setCashType(REF_C_CashTrxType.Invoice);
					line.setC_BPartner_ID(C_BPartner_ID);
					line.setAmount(amount);					
					line.setWithholdingAmt(WithholdingAmt);
					line.setIsPartialPayment(OverUnderAmt.compareTo(BigDecimal.ZERO)!=0);
					if (!line.save()) 
					{
						log.log(Level.SEVERE,"Could not save cash line");
						throw new XendraException("Could not save cash line");
					}					
										
				}
			}					
			//	Should start WF
			if (cash.get_ID() != 0 && C_CashBook_ID != 0)
			{
				String docstatus = cash.completeIt(); 
				if (docstatus.compareTo(DocAction.STATUS_Completed) == 0 )
				{
					if (!cash.save())
						throw new XendraException("no se pudo grabar caja");
				}
				else
					throw new XendraException("no se pudo completar caja");
			}
			m_trx.commit(true);
		}
		catch (Exception e)
		{
			m_trx.rollback();
		}
		finally {
			m_trx.close();			
		}
		return true;
	}
	
	/**************************************************************************
	 *  Tab Changed
	 *  @param e ChangeEvent
	 */	
	public void stateChanged(ChangeEvent e)
	{
		if (tabbedPane.getSelectedIndex() == 1)   //  allow access to help
		{
			setHistory();								
		}
	}   //  stateChanged
	
	public void setHistory()
	{
		if ( m_C_BPartnerHistory_ID != m_C_BPartner_ID )
		{
			Vector<Vector<Object>> data = new Vector<Vector<Object>>();		
			StringBuffer sql = new StringBuffer("SELECT	al.c_allocationline_id,	checkno as type, al.c_payment_id as payid, p.datetrx as paydate,"
			+ "	p.payamt as paytotal,	i.documentno, i.dateinvoiced, i.grandtotal, al.amount, "
			+ " al.overunderamt "
		    + " FROM "
			+ " c_allocationline al " 
			+ " RIGHT JOIN c_payment p ON (al.c_payment_id = p.c_payment_id) " 
			+ "LEFT JOIN c_invoice i ON (al.c_invoice_id = i.c_invoice_id) " 
			+ " WHERE al.c_bpartner_id = ? UNION "
			+ " select " 
			+ " al.c_allocationline_id, "  	
			+ " '"+ Msg.getMsg(Env.getCtx(), "Cash") + "' as type, "
			+ " c.c_cash_id as payid, "
			+ " c.statementdate as paydate, "
			+ " c.statementdifference as paytotal, "
			+ " i.documentno, "
			+ " i.dateinvoiced, "
			+ " i.grandtotal, "
			+ " al.amount, "
			+ "overunderamt"
		    + " FROM " 
		    + "	c_allocationline al " 
			+ " RIGHT JOIN c_cashline cl ON (al.c_cashline_id = cl.c_cashline_id) " 
			+ " LEFT JOIN c_invoice i ON (al.c_invoice_id = i.c_invoice_id) " 
			+ " LEFT JOIN c_cash c ON (cl.c_cash_id = c.c_cash_id) "
			+ " WHERE al.c_bpartner_id = ? order by 1 " );		
			log.fine("InvSQL=" + sql.toString());
			try
			{
				PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
				pstmt.setInt(1, m_C_BPartner_ID);
				pstmt.setInt(2, m_C_BPartner_ID);
				ResultSet rs = pstmt.executeQuery();				
				BigDecimal totalpay = Env.ZERO;
				BigDecimal Grandtotal = Env.ZERO;
				BigDecimal payTotal = Env.ZERO;
				BigDecimal Amount = Env.ZERO;
				BigDecimal overunderamt = Env.ZERO;
				//int payid = rs.getInt(3);		
				int payid = 0;
				int grouppayid = 0;				
				while (rs.next())
				{
					payTotal     =  rs.getBigDecimal(5) == null ? Env.ZERO :   rs.getBigDecimal(5).abs();
					Grandtotal   =  rs.getBigDecimal(8) == null ? Env.ZERO :   rs.getBigDecimal(8).abs();
					Amount       =  rs.getBigDecimal(9) == null ? Env.ZERO :   rs.getBigDecimal(9).abs();
					overunderamt = rs.getBigDecimal(10) == null ? Env.ZERO :  rs.getBigDecimal(10).abs();
					payid = rs.getInt(3);
					if ( payid != grouppayid )
					{
						if ( grouppayid == 0 )
							grouppayid = payid;
						else
						{
							Vector<Object> subtotal = new Vector<Object>();
							subtotal.add(null);       //  1-type																		
							subtotal.add(null);     //  2-paydate
							subtotal.add(null);     //  3-paytotal
							subtotal.add(null);     //  4-documentno
							subtotal.add(null);     //  5-dateinvoiced
							subtotal.add(new BigDecimal(0));     //  6-Grandtotal
							subtotal.add(totalpay);     //  7-Amount
							subtotal.add(null);     // 8-overunderamt
							data.add(subtotal);
							totalpay = Env.ZERO;
							grouppayid = payid;
						}
					}														
					Vector<Object> line = new Vector<Object>();
					line.add(rs.getString(2));       //  1-type
					//KeyNamePair pp = new KeyNamePair(rs.getInt(3), rs.getString(2));
					//line.add(pp);                       //  2-Value
					//if (multiCurrency.isSelected())
					//{
					line.add(rs.getTimestamp(4));      //  2-paydate					
					line.add(payTotal);     //  paytotal rs(5)
					line.add(rs.getString(6));         //  4-documentno
					line.add(rs.getTimestamp(7));      //  5-dateinvoiced
					line.add(Grandtotal);     //  Grandtotal rs(8)
					line.add(Amount);     //  Amount rs(9)
					line.add(overunderamt);     // 8-overunderamt
					//	Add when open <> 0 (i.e. not if no conversion rate)									
					data.add(line);
					totalpay = totalpay.add(Amount);					
				}
				//
				Vector<Object> subtotal = new Vector<Object>();
				subtotal.add(null);       //  1-type																		
				subtotal.add(null);     //  2-paydate
				subtotal.add(null);     //  3-paytotal
				subtotal.add(null);     //  4-documentno
				subtotal.add(null);     //  5-dateinvoiced
				subtotal.add(new BigDecimal(0));     //  6-Grandtotal
				subtotal.add(totalpay);     //  7-Amount
				subtotal.add(null);     // 8-overunderamt
				data.add(subtotal);
				//
				rs.close();
				pstmt.close();					
			}
			catch (SQLException e)
			{
				log.log(Level.SEVERE, sql.toString(), e);
			}
			Vector<String> columnNames = new Vector<String>();
			//  Remove previous listeners
//			historyTable.getModel().removeTableModelListener(this);
			//  Header Info
			columnNames.add(Msg.translate(Env.getCtx(), "Mean"));
			//columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
			columnNames.add(Msg.getMsg(Env.getCtx(), "Date"));
			columnNames.add(Msg.getMsg(Env.getCtx(), "Amount"));
			columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
			columnNames.add(Msg.getMsg(Env.getCtx(), "PopDocDate"));
			columnNames.add(Msg.getMsg(Env.getCtx(), "Amount"));
			columnNames.add(Msg.getMsg(Env.getCtx(), "AmountPay"));
			columnNames.add(Msg.getMsg(Env.getCtx(), "AmountDue"));
			//columnNames.add(Msg.getMsg(Env.getCtx(), "AppliedAmt"));	
			
			//  Set Model
			DefaultTableModel modelI = new DefaultTableModel(data, columnNames);
//			modelI.addTableModelListener(this);
			historyTable.setModel(modelI);
			
			int i = 0;
			//historyTable.setColumnClass(i++, Boolean.class, false);         //  0-Selection
			historyTable.setColumnClass(i++, String.class, true);        //  1-type
			historyTable.setColumnClass(i++, Timestamp.class, true);           //  2-paydate
			historyTable.setColumnClass(i++, BigDecimal.class, true);       //  3-paytotal
			historyTable.setColumnClass(i++, String.class, true);   //  4-documentno
			historyTable.setColumnClass(i++, Timestamp.class, true);       //  5-Dateinvoiced
			historyTable.setColumnClass(i++, BigDecimal.class, true);       //  6-Grandtotal
			historyTable.setColumnClass(i++, BigDecimal.class, true);      //  7-Amount
			historyTable.setColumnClass(i++, BigDecimal.class, true);      //  8-overunderamt			//
			historyTable.setColorColumn(5);
			historyTable.setColorCompare(new BigDecimal(1));
			//historyTable.setColorColumn(modelIndex)
			//  Table UI
			historyTable.autoSize();		
			m_C_BPartnerHistory_ID = m_C_BPartner_ID;
		}
	}
	private void lock() {
		this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		m_waiting = new Waiting (this, Msg.getMsg(Env.getCtx(), "Processing"), false, 0);
		new Thread()
		{			
			public void run()
			{								
				if (m_waiting != null)
				{
					m_waiting.toFront();
					m_waiting.setVisible(true);
				}
			}
		}.start();
	}

	private void unlock ()
	{
		if (m_waiting != null)
			m_waiting.dispose();
		m_waiting = null;
		this.setCursor(Cursor.getDefaultCursor());
	}   //  unlock

	private void AddLine()
	{
		SelectedColumn = 0;
    	CAllocationRow newrow = new CAllocationRow();
    	( (DefaultObjectViewModel) InvoiceView.getDataModel()).addRow(newrow);    	
    	SelectedRow = InvoiceView.getRowCount()-1;
        Rectangle rect = InvoiceView.getVisibleRect();
        Rectangle cRect = InvoiceView.getCellRect(SelectedRow, SelectedColumn, true);
        rect.y = cRect.y;
        rect.height = cRect.height;
        InvoiceView.scrollRectToVisible(rect);
        InvoiceView.changeSelection(SelectedRow, SelectedColumn , false, false);
        InvoiceView.repaint();		
	}

	public void cleanlines()
	{
		InvoiceView.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		InvoiceView.selectAll();
        List selection = InvoiceView.getSelectedRowObjects();
        InvoiceView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        m_model.removeRows(selection);        
	}
	public boolean candispose() {
		return true;
	}	
}
