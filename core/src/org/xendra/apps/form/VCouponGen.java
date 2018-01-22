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

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
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
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.ADialog;
import org.compiere.apps.ALayout;
import org.compiere.apps.ALayoutConstraint;
import org.compiere.apps.ConfirmPanel;
import org.compiere.apps.StatusBar;
import org.compiere.grid.ed.VLookup;

import org.compiere.minigrid.MiniTable;
import org.compiere.model.MCoupon;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.plaf.CompiereColor;
import org.compiere.swing.CFrame;
import org.compiere.swing.CLabel;
import org.compiere.swing.CPanel;
import org.compiere.swing.CTabbedPane;
import org.compiere.swing.CTextPane;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.Util;

import org.xendra.objectview.DefaultObjectViewModel;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.ObjectView;
import org.xendra.objectview.RowBase;
import org.xendra.objectview.IObjetViewColumn;
import org.xendra.objectview.ObjectViewModel;
import org.xendra.plaf.XendraPLAF;


/**
 *	VCouponGen form - generate coupons
 *
 * 	@author 	xapiens
 * 	@version 	$Id: 
 */
public class VCouponGen extends CFrame implements FormPanel, VetoableChangeListener, TableModelListener, ChangeListener, ActionListener
{

	private int m_WindowNo;
	private FormFrame m_frame;
	private BorderLayout mainLayout = new BorderLayout(); 
	private CPanel mainPanel = new CPanel();
	private CPanel GeneratePanel = new CPanel();
	private CLabel lTotalInvoice = new CLabel("0.00", JLabel.RIGHT);
	private BigDecimal TotalInvoice = Env.ZERO;
	private Integer Invoice_ID = 0;
	private BigDecimal TotalCoupon = Env.ZERO;
	private CLabel lTotalCoupon = new CLabel("0.00", JLabel.RIGHT);
	private ConfirmPanel confirmPanelGen = new ConfirmPanel(false, false, false, false, false, false, true);
	private CTabbedPane tabbedPane = new CTabbedPane();
	private StatusBar statusBar = new StatusBar();
	private VLookup pickPartner;
	private VLookup pickCharge;
	private JScrollPane invoiceScrollPane = new JScrollPane();
	private JScrollPane scroll_Coupons = new JScrollPane();
	private CPanel parameterPanel = new CPanel();
	private CPanel invoicePanel = new CPanel();
	private MiniTable invoiceTable = new MiniTable();	
	private JSplitPane infoPanel = new JSplitPane();
	private int mPosQty = -1;
	private CTextPane info = new CTextPane();
	private int SelectedRow;
	private int SelectedColumn;
	DefaultObjectViewModel m_model = null;
	ObjectView couponTable = null;
	private CPanel couponPanel = new CPanel();
	private boolean m_selectionActive = true;
	Vector<Vector<Object>> coupons = new Vector<Vector<Object>>();


	private static CLogger log = CLogger.getCLogger(VBoeGen.class);

	public void init(int WindowNo, FormFrame frame) {
		m_WindowNo = WindowNo;
		m_frame = frame;		
		try
		{
			dynInit();
			jbInit();
			frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
			frame.getContentPane().add(confirmPanelGen, BorderLayout.SOUTH);
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
		
	}

	private void jbInit() {
		CompiereColor.setBackground(this);
		parameterPanel.setLayout(new ALayout());
		parameterPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_BPartner_ID")), new ALayoutConstraint(0,0));
		parameterPanel.add(pickPartner, null);
		parameterPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Charge_ID")), new ALayoutConstraint(1,0));
		parameterPanel.add(pickCharge, null);	
		//parameterPanel.add(new JLabel("Procesar"), new ALayoutConstraint(0,0));
		//parameterPanel.add(pickPartner, null);
		
		invoicePanel.setLayout(new BorderLayout());
		invoicePanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID")) , BorderLayout.NORTH);
		invoicePanel.add(invoiceScrollPane, BorderLayout.CENTER);
		invoicePanel.add(lTotalInvoice, BorderLayout.SOUTH);
		invoiceScrollPane.getViewport().add(invoiceTable, null);

		IObjetViewColumn[] columns = getColumns();
		CouponRow[] rows = { newrow() };
		m_model = new DefaultObjectViewModel(columns, Arrays.asList(rows));
	    couponTable = new ObjectView(m_model);
	    couponTable.setColumnSelectionAllowed(false);
	    couponTable.setSurrendersFocusOnKeystroke(true);
	    couponTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		settingsPosPositions();
        couponTable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	      couponTable.getInputMap(JComponent.WHEN_FOCUSED)		     	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");		      		      
	      Action actions = new AbstractAction() {

	    	  public void actionPerformed(ActionEvent ae) {
	    		  
	    	  }
	      }; 		      		      
		couponTable.getActionMap().put("KEYENTER", actions);		      
	    couponTable.setMakeIndex(true);		
		couponTable.addKeyListener(new KeyAdapter() 
		{ 
			public void keyPressed(KeyEvent e) { 
		        	int key = e.getKeyCode();
		        	System.out.println(key);
		        	SelectedColumn = couponTable.getSelectedColumn();
		        	SelectedRow = couponTable.getSelectedRow();
		        	if ( key == KeyEvent.VK_NUMPAD0)
		        		key = KeyEvent.VK_0;
		        	else if ( key == KeyEvent.VK_NUMPAD1)
		        		key = KeyEvent.VK_1;			        	
		        	else if ( key == KeyEvent.VK_NUMPAD2)
		        		key = KeyEvent.VK_2;
		        	else if ( key == KeyEvent.VK_NUMPAD3)
		        		key = KeyEvent.VK_3;
		        	else if ( key == KeyEvent.VK_NUMPAD4)
		        		key = KeyEvent.VK_4;
		        	else if ( key == KeyEvent.VK_NUMPAD5)
		        		key = KeyEvent.VK_5;
		        	else if ( key == KeyEvent.VK_NUMPAD6)
		        		key = KeyEvent.VK_6;
		        	else if ( key == KeyEvent.VK_NUMPAD7)
		        		key = KeyEvent.VK_7;
		        	else if ( key == KeyEvent.VK_NUMPAD8)
		        		key = KeyEvent.VK_8;
		        	else if ( key == KeyEvent.VK_NUMPAD9)
		        		key = KeyEvent.VK_9;
		        	else if ( key == KeyEvent.VK_SHIFT )
		        		return;
		        	else if ( key == KeyEvent.VK_ESCAPE	|| key == KeyEvent.VK_LEFT 
		        			|| key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_UP 
		        			|| key == KeyEvent.VK_DOWN )
		        	{
		        		super.keyPressed(e);
		        		//return;        			
		        	}		     
		        	String strKey = new Character((char) key).toString();
		        	if ( key == KeyEvent.VK_ENTER && SelectedColumn == 0 )
		        	{
		        		ObjectViewModel pos = couponTable.getDataModel();			        					        	
		        		if (pos.getRowCount()-1 == SelectedRow )
			        	{
		        			CouponRow row = (CouponRow) pos.getRowObject(SelectedRow);
			        		if (row != null )
			        		{
			        			NewLine(row);	
			        		}
			        	}	
		        		else
		        			nextcolumn();
		        	}			        	
		        	else if ( key == KeyEvent.VK_DELETE)
		        	{
		            	if ( ADialog.ask(m_WindowNo, m_frame, Msg.getMsg(Env.getCtx(), "DeleteRecord?")))
		            	{
		                    List selection = couponTable.getSelectedRowObjects();
		                    ( (DefaultObjectViewModel) couponTable.getDataModel()).removeRows(selection); 
		                    if (couponTable.getRowCount()==0)
		                    {
		                    	NewLine(null);
		                    }
		            	}
		        	}
		        	else if ( key == KeyEvent.VK_ENTER && SelectedColumn == mPosQty )
		        	{			        		
		        		if ( couponTable.getCellEditor() != null )
		        		{
		        			couponTable.getCellEditor().stopCellEditing();		
		        		}			        		
		                ObjectViewModel pos = couponTable.getDataModel();
		                CouponRow row = (CouponRow) pos.getRowObject(SelectedRow);
		                if (SelectedRow == pos.getRowCount()-1)
		                	NewLine(row);
		        	}
		        	else if ( key == KeyEvent.VK_ENTER)
		        	{
		                ObjectViewModel pos = couponTable.getDataModel();
		                CouponRow row = (CouponRow) pos.getRowObject(SelectedRow);
		        		nextcolumn();
		        	}
		        	if (Env.getContextAsInt(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "VIEWCHANGE") == 1)
		        	{
		        		tableViewChanged();
		        	}
			  }
			  
			public void NewLine(CouponRow row) {
				Boolean lContinue = false;
				if (row != null)
				{
					if (row.getQty().compareTo(Env.ZERO) > 0)
					lContinue = true;
				}
				else
					lContinue = true;
				if (lContinue)
				{
					CouponRow newrow = new CouponRow();
			    	( (DefaultObjectViewModel) couponTable.getDataModel()).addRow(newrow);	            	
			    	int LastRow = couponTable.getRowCount()-1;
			        Rectangle rect = couponTable.getVisibleRect();
			        Rectangle cRect = couponTable.getCellRect(LastRow, 0, true);
			        rect.y = cRect.y;
			        rect.height = cRect.height;
			        couponTable.scrollRectToVisible(rect);
					couponTable.changeSelection(LastRow, 0, false, false);
			        couponTable.getTableHeader().repaint();
			        couponTable.repaint();
				}
			}

			private void nextcolumn() {
					int nextColumn = SelectedColumn + 1;
					if ( nextColumn > couponTable.getColumnCount() )
						nextColumn = 0;					
					nextcolumn(nextColumn);
			}

			private void nextcolumn(int i) {
				int nextColumn = i;
                Rectangle rect = couponTable.getVisibleRect();
                Rectangle cRect = couponTable.getCellRect(SelectedRow, nextColumn, true);
                rect.y = cRect.y;
                rect.height = cRect.height;
                couponTable.scrollRectToVisible(rect);
                couponTable.changeSelection(SelectedRow, nextColumn, false, false);			        							
			}
			});
	    		
		scroll_Coupons.getViewport().add(couponTable,null);		
		
		couponPanel.setLayout(new BorderLayout());
		couponPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Coupon_ID")) , BorderLayout.NORTH);
		couponPanel.add(scroll_Coupons, BorderLayout.CENTER);
		couponPanel.add(lTotalCoupon , BorderLayout.SOUTH);
		
		infoPanel.setOrientation(JSplitPane.VERTICAL_SPLIT);
		infoPanel.setBorder(BorderFactory.createEtchedBorder());
		infoPanel.add(invoicePanel, JSplitPane.TOP);
		infoPanel.add(couponPanel, JSplitPane.BOTTOM);
		//infoPanel.setContinuousLayout(true);
		//infoPanel.setPreferredSize(new Dimension(800,300));
		infoPanel.setDividerLocation(130);
		
				  

		mainPanel.setLayout(mainLayout);
		mainPanel.add(parameterPanel, BorderLayout.NORTH);
		mainPanel.add(infoPanel, BorderLayout.CENTER);		
		//mainPanel.add(, BorderLayout.SOUTH);
		confirmPanelGen.addActionListener(this);
		
		GeneratePanel.setLayout(new BorderLayout());
		GeneratePanel.add(info, BorderLayout.CENTER);
		GeneratePanel.setEnabled(false);
		info.setBackground(XendraPLAF.getFieldBackground_Inactive());
		info.setEditable(false);
		//GeneratePanel.add(confirmPanelGen, BorderLayout.SOUTH);
		
		
		tabbedPane.add(mainPanel,   Msg.getMsg(Env.getCtx(), "CouponGeneration"));
		tabbedPane.add(GeneratePanel, Msg.getMsg(Env.getCtx(), "CouponGenerate"));
		tabbedPane.addChangeListener(this);		
		//
	      		
	}
	
	public class CouponRow extends RowBase
	{
		BigDecimal denomination;
		BigDecimal Qty;
		CouponRow()
		{
			denomination = Env.ZERO;
			Qty = Env.ZERO;
		}
		public BigDecimal getDenomination() {
			return denomination;
		}
		public void setDenomination(BigDecimal mDenomination) {
			mDenomination = mDenomination.setScale(2, BigDecimal.ROUND_HALF_UP);
			denomination = mDenomination;
			setIsChanged();
		}
		public BigDecimal getQty() {
			return Qty;
		}
		public void setQty(BigDecimal qty) {
			qty = qty.setScale(2, BigDecimal.ROUND_HALF_UP);
			Qty = qty;
			setIsChanged();
		}
		private void setIsChanged()
		{
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "VIEWCHANGE",  "1");			
		}
	}

    private CouponRow newrow() {
		return new CouponRow();
	}

	public IObjetViewColumn[] getColumns()
    {
    	  Vector<Vector<Object>> columnsPOS = new Vector<Vector<Object>>();
		  try {
			  Vector<Object> column = new Vector<Object>();
			  column.add("Denominacion");      	// name
			  column.add(null);       			// comparator
    	      column.add(CouponRow.class.getDeclaredMethod("getDenomination", null));
			  column.add(CouponRow.class.getDeclaredMethod("setDenomination", new Class[] {BigDecimal.class}));
			  column.add(true);					// pDefaultVisible
			  column.add(null);					// pFormat
			  column.add(false);				// sortable
			  column.add(false);				// searchable
			  column.add(false);				// IsColorColumn
			  column.add(0);					// AD_Column_ID
			  column.add(0);					// AD_Reference_ID
			  //column.add(DisplayType.Number);
			  columnsPOS.add(column);
			  column = new Vector<Object>();
			  column.add(Msg.translate(Env.getCtx(), "Qty"));       	// name
			  column.add(null);       			// comparator
			  column.add(CouponRow.class.getDeclaredMethod("getQty", null));    // getter
			  column.add(CouponRow.class.getDeclaredMethod("setQty", new Class[] {BigDecimal.class}));    				// setter
			  column.add(true);					// pDefaultVisible
			  column.add(null);					// pFormat
			  column.add(false);				// sortable
			  column.add(false);				// searchable
			  column.add(false);				// IsColorColumn
			  column.add(0);					// AD_Column_ID
			  column.add(0);					// AD_Reference_ID			  
			  //column.add(DisplayType.Number);
			  columnsPOS.add(column);			  
		  } catch (SecurityException e1) {
				e1.printStackTrace();
		  } catch (NoSuchMethodException e1) {
				e1.printStackTrace();
		  }    // getter
		  
		  IObjetViewColumn[] columns = null;
		  
		  ArrayList<DefaultTableViewColumn> list = new ArrayList<DefaultTableViewColumn>();
   		  Enumeration en = columnsPOS.elements();
   		  
		  while (en.hasMoreElements())
		  {
		  	  Vector<Object> columna =  (Vector<Object>) en.nextElement();
			  list.add( new DefaultTableViewColumn
				                (
				              		  (String)     columna.elementAt(0),
				            		  (Comparator) columna.elementAt(1),
				            		  (Method)     columna.elementAt(2),
				            		  (Method)     columna.elementAt(3),		            
				            		  (Boolean)    columna.elementAt(4),
				            		  (Format)     columna.elementAt(5),
				            		  (Boolean)    columna.elementAt(6),
				            		  (Boolean)    columna.elementAt(7),
				            		  (Boolean)    columna.elementAt(8),
				            		  (Integer)    columna.elementAt(9),
				            		  (Integer)    columna.elementAt(10)
					            )
			   );											 
		  }
		  
          columns = new IObjetViewColumn[list.size ()];
          list.toArray(columns);
          return columns;
    }

	private void dynInit() {
		pickPartner = VLookup.createBPartner(m_WindowNo);
		pickPartner.addVetoableChangeListener(this);

		MLookup lookupCharge = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 
				Util.getColumnID(MInvoice.Table_ID, "C_Charge_ID"), 
				DisplayType.Search);
		
		pickCharge = new VLookup("C_Charge_ID", false, false, true, lookupCharge);
		pickCharge.addVetoableChangeListener(this);

		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "CouponGenerationStatus"));
		statusBar.setStatusDB("");
		
	}
	
	public void dispose() {
		if (m_frame != null)
			m_frame.dispose();
		m_frame = null;			
	}

	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {
		String name = e.getPropertyName();
		Object value = e.getNewValue();		
		log.config(name + "=" + value);
		if (value == null)
			return;
		
		if (name.equals("C_BPartner_ID") && value != null )
		{			
			loadBPartner((Integer)value);
		}
		
	}	
	
	private void loadBPartner(Integer C_BPartner_ID) {
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		StringBuffer sql = new StringBuffer("SELECT i.DateInvoiced,i.DocumentNo,i.C_Invoice_ID," //  1..3
		+ "c.ISO_Code,i.GrandTotal, "                            //  4..5    Orig Currency
		+ "i.GrandTotal, " //  6   #1  Converted
		+ "invoiceOpen(C_Invoice_ID,0) AS Open , "  //  7   #2  Converted Open
		+ "i.MultiplierAP, i.serial, dt.name  AS C_DocTypeName"
		+ " FROM C_Invoice_v i "		//  corrected for CM/Split
		+ " INNER JOIN C_Currency c ON (i.C_Currency_ID=c.C_Currency_ID) "
		+ " LEFT OUTER JOIN C_DocType_trl dt ON i.c_doctype_id = dt.c_doctype_id "
		+ " WHERE i.Processed='Y'");
		sql.append(" AND i.C_BPartner_ID=?  AND NOT EXISTS (SELECT 1 FROM C_Coupon WHERE C_Invoice_ID = i.C_Invoice_ID ) "); 
		log.fine("InvSQL=" + sql.toString());
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				Vector<Object> line = new Vector<Object>();
				line.add(new Boolean(false));       //  0-Selection
				line.add(rs.getTimestamp("DateInvoiced"));       //  1-TrxDate
				line.add(rs.getString("C_DocTypeName")); // 2-Doctype Name
				line.add(rs.getString("Serial")); // 3-serial Document
				KeyNamePair pp = new KeyNamePair(rs.getInt(3), rs.getString(2));
				line.add(pp);                       //  4-Value
				line.add(rs.getString("ISO_Code"));          //  5-ISO Code -- new 
				line.add(rs.getBigDecimal("GrandTotal"));      //  6-Amount
				BigDecimal open = rs.getBigDecimal("Open");
				if (open == null)		//	no conversion rate
					open = Env.ZERO;
				line.add(open);      				//  8-OpenAmt 
				data.add(line);				
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		
		invoiceTable.getModel().removeTableModelListener(this);
		
		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add(Msg.getMsg(Env.getCtx(), "Select"));
		columnNames.add(Msg.translate(Env.getCtx(), "Date"));
		columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "Documento")));
		columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "Serie")));
		columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
		columnNames.add(Msg.translate(Env.getCtx(), "C_Currency_ID"));
		columnNames.add(Msg.translate(Env.getCtx(), "Amount"));
		columnNames.add(Msg.getMsg(Env.getCtx(), "OpenAmt"));
		//  Set Model
		DefaultTableModel modelI = new DefaultTableModel(data, columnNames);
		modelI.addTableModelListener(this);
		invoiceTable.setModel(modelI);
		//
		int i = 0;
		invoiceTable.setColumnClass(i++, Boolean.class, false);         //  0-Selection
		invoiceTable.setColumnClass(i++, Timestamp.class, true);        //  1-TrxDate
		invoiceTable.setColumnClass(i++, String.class, true);           //  2-Document Type
		invoiceTable.setColumnClass(i++, String.class, true);           //  3-Document serial
		invoiceTable.setColumnClass(i++, String.class, true);           //  4-Document No
		invoiceTable.setColumnClass(i++, String.class, true);           //  5-ISO Currency
		invoiceTable.setColumnClass(i++, BigDecimal.class, true);       //  6-Amount
		invoiceTable.setColumnClass(i++, BigDecimal.class, true);       //  7-Open
		invoiceTable.autoSize();
	}

	public void tableViewChanged() {
		TotalCoupon = Env.ZERO;
		int rows = couponTable.getRowCount();
        ObjectViewModel pos = couponTable.getDataModel();
		for (int i = 0; i < rows; i++)
		{
            CouponRow row = (CouponRow) pos.getRowObject(i);
            BigDecimal temp = row.getDenomination().multiply(row.getQty());
			//BigDecimal temp = ((BigDecimal)couponTable.getValueAt(i, 1)).multiply((BigDecimal)couponTable.getValueAt(i, 0));
			if (temp.compareTo(Env.ZERO) > 0)				
				TotalCoupon = TotalCoupon.add(temp);
		}
		lTotalCoupon.setText(TotalCoupon.toString());		
	}
	
	public void tableChanged(TableModelEvent e) {
		TotalInvoice = Env.ZERO;
		int rows = invoiceTable.getRowCount();
		for (int i = 0; i < rows; i++)
		{
			if (((Boolean)invoiceTable.getValueAt(i, 0)).booleanValue())
			{
				KeyNamePair invoice = (KeyNamePair)invoiceTable.getValueAt(i, 4);
				Invoice_ID = Integer.valueOf(invoice.getID());
				TotalInvoice = TotalInvoice.add((BigDecimal)invoiceTable.getValueAt(i, 6));
			}
		}
		lTotalInvoice.setText(TotalInvoice.toString());	
	}

	public void stateChanged(ChangeEvent e) {
		int index = tabbedPane.getSelectedIndex();
		m_selectionActive  = (index == 0);
	}
	
	private void settingsPosPositions() {
		Enumeration<TableColumn> columns = couponTable.getColumnModel().getColumns();
		int k = 0;
		for (;columns.hasMoreElements();)
		{
			TableColumn tcolumn = columns.nextElement();
			if ( tcolumn.getHeaderValue().equals(Msg.translate(Env.getCtx(), "Qty")) )
				mPosQty = k;
			k++;
		}			          				
	}

	public void actionPerformed(ActionEvent e) {
		if ( m_selectionActive)
		{
			generateCoupons();
		}
		else
		{
			if (ADialog.ask(0, m_frame, "Grabar Cupones?"))
			{
				saveCoupons();
				dispose();		
			}
		}
	}
	private void saveCoupons()
	{
		Enumeration en = coupons.elements();
		MInvoice invoice = MInvoice.get(Env.getCtx(), Invoice_ID);
		String sql = "SELECT MAX(C_TAX_ID) FROM C_InvoiceLine where C_Invoice_ID = ? ";
		int TaxID = DB.getSQLValue(null, sql, Invoice_ID);		
		while (en.hasMoreElements())
		{
			Vector<Object> coupon =  (Vector<Object>) en.nextElement();
			MCoupon Coupon = new MCoupon (Env.getCtx(), 0, null);
			BigDecimal amount = (BigDecimal) coupon.lastElement();			
			Coupon.setC_BPartner_ID(invoice.getC_BPartner_ID());
			Coupon.setC_Currency_ID(invoice.getC_Currency_ID());
			Coupon.setC_Invoice_ID(invoice.getC_Invoice_ID());
			Coupon.setC_Charge_ID((Integer) pickCharge.getValue());
			Coupon.setC_Tax_ID(TaxID);
			Coupon.setClientOrg(invoice.getAD_Client_ID(), invoice.getAD_Org_ID());
			Coupon.setGrandTotal(amount);
			Coupon.save();
		}						
	}
	private void generateCoupons() {
		if (TotalInvoice.compareTo(Env.ZERO) == 0)
		{
			ADialog.error(m_WindowNo, this, "Debe seleccionar una factura para el proceso");
			return;
		}
		if (TotalCoupon.compareTo(Env.ZERO) == 0)
		{
			ADialog.error(m_WindowNo, this, "Debe agregar los tipos de cupones a generarse");
			return;
		}
		if ( TotalInvoice.compareTo(TotalCoupon) != 0)
		{
			ADialog.error(m_WindowNo, this, "la factura y el total de cupones debe ser exacto");
			return;			
		}
		if (Invoice_ID == 0)
		{
			ADialog.error(m_WindowNo, this, "la factura seleccionada es invalida");
			return;
		}
		if ( pickCharge.getValue() == null)
		{
			ADialog.error(m_WindowNo, this, "se necesita escoger un cargo");
			return;
		}
		int rows = couponTable.getRowCount();
		ObjectViewModel pos = couponTable.getDataModel();
		for (int i = 0; i < rows; i++)
		{
            CouponRow row = (CouponRow) pos.getRowObject(i);

			Integer count = row.getQty().intValue();
			BigDecimal amountcoupon = row.getDenomination();
			for (int j = 0; j < count; j++)
			{
				Vector<Object> coupon = new Vector<Object>();
				coupon.add(amountcoupon);
				coupons.add(coupon);				
			}
		}
		StringBuffer iTextInOutGenerated = new StringBuffer();
		Enumeration en = coupons.elements();
		while (en.hasMoreElements())
		{
			Vector<Object> coupon =  (Vector<Object>) en.nextElement();
			iTextInOutGenerated.append("<b>")//.append(pi.getSummary())
			.append("</b><br>(").append(coupon.elementAt(0)).append(")<br>");			
			
		}		
//		iTextInOutGenerated.append("<b>")//.append(pi.getSummary())
//			.append("</b><br>(")
//			.append(Msg.getMsg(Env.getCtx(), "InOutGenerateInfo"))
//			//  Shipments are generated depending on the Delivery Rule selection in the Order
//			.append(")<br>");
//			//.append(pi.getLogInfo(true));
		info.setText(iTextInOutGenerated.toString());
		tabbedPane.setSelectedIndex(1);
	}
	public boolean candispose() {
		return true;
	}		
}