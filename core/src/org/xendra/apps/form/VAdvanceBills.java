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
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeEvent;

import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.ADialog;
import org.compiere.apps.ConfirmPanel;
import org.compiere.apps.StatusBar;

import org.compiere.model.GridTab;
import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.swing.CDialog;
import org.compiere.swing.CPanel;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.xendra.objectview.DefaultObjectViewModel;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.ObjectView;
import org.xendra.objectview.IObjetViewColumn;
import org.xendra.objectview.ObjectViewModel;

/**
 *	Advance Bills
 *
 * 	@author 	xapiens
 * 	@version 	$Id: 
 */
public class VAdvanceBills extends CDialog implements FormPanel, ActionListener
{
	public VAdvanceBills() {
		Initialize();
	}

	private CPanel Initialize() {
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "AdvanceBills"));
		statusBar.setStatusDB("");
		AdvancePanel.setLayout(new BorderLayout());
		AdvancePanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_Invoice_ID")) , BorderLayout.NORTH);
		AdvancePanel.add(advanceScrollPane, BorderLayout.CENTER);
		AdvancePanel.add(advanceInfo, BorderLayout.SOUTH);		
		advanceScrollPane.setViewportView(advanceTable);
		selPanel.setLayout(new BorderLayout());
		selPanel.setName("selPanel");
		confirmPanelSel.addActionListener(this);
		selPanel.add(confirmPanelSel, BorderLayout.SOUTH);		
		mainPanel.setLayout(mainLayout);
		mainPanel.add(AdvancePanel, BorderLayout.CENTER);
		mainPanel.add(selPanel, BorderLayout.SOUTH);
		mainPanel.setPreferredSize(new Dimension(550,200));
		return mainPanel;
	}

	private int m_WindowNo;
	private int m_curWindowNo = 0;
	private GridTab m_curTab = null;
	private FormFrame m_Frame;
	private BorderLayout mainLayout = new BorderLayout(); 
	private CPanel mainPanel = new CPanel();
	private CPanel selPanel = new CPanel();
	private StatusBar statusBar = new StatusBar();
	private ConfirmPanel confirmPanelSel = new ConfirmPanel(true);
	private ObjectView advanceTable = new ObjectView();
	private boolean m_IsSOTrx;
	private ProcessInfo m_pi;
	private CPanel AdvancePanel = new CPanel();
	private JScrollPane advanceScrollPane = new JScrollPane();
	private JLabel advanceInfo = new JLabel();
	private static CLogger log = CLogger.getCLogger(VBoeGen.class);

	public void init(int WindowNo, FormFrame frame) {
		m_WindowNo = WindowNo;		
		m_Frame = frame;		
		m_pi = m_Frame.getProcessInfo();
		setModal(true);
		setAlwaysOnTop(true);
		if (m_pi != null)
		{
			ProcessInfoParameter[] para = m_pi.getParameter();
			for (int i = 0; i < para.length; i++)
			{
				String name = para[i].getParameterName();
				if (name.equals("m_curWindowNo")) 
					m_curWindowNo = (Integer) para[i].getParameter();	
				if (name.equals("m_curTab"))
					m_curTab = (GridTab) para[i].getParameter();
			}
		}
		try
		{
			configureObjectView();
			CPanel panel = Initialize();			
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
			LoadAdvanced();
			//AEnv.showCenterScreen(this);
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
		
	}

	private void configureObjectView() {
		IObjetViewColumn[] columns = getColumns();
		AdvanceBillRow[] rows = { newrow() };
	    
	    m_model = new DefaultObjectViewModel(columns, null);
	    advanceTable = new ObjectView(m_model);
	    advanceTable.setColumnSelectionAllowed(false);
	    advanceTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    advanceTable.configcontrols(m_WindowNo);
	    advanceTable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    advanceTable.getInputMap(JComponent.WHEN_FOCUSED)		     	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	    advanceTable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				refreshView();
			}            
	      });	    
	    
	    advanceTable.addKeyListener(
	    		new KeyAdapter() { 			  
				public void keyPressed(KeyEvent e) {
		        	int key = e.getKeyCode();
		        	Boolean altdown = e.isAltDown();
		        	refreshView();
				}
		 });				
	}

	Timestamp date;
	String DocumentNo;
	String Serial;
	BigDecimal Amount;
	BigDecimal ConvertedAmount;
	private DefaultObjectViewModel m_model;
	private Integer SelectedColumn = 0;
	private Integer SelectedRow = 0;
	private Collection<Object> m_info;
	private CPanel m_Panel;
	
	
	private IObjetViewColumn[] getColumns() {
		Vector<Object> column = new Vector<Object>();
		ArrayList<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		Method getter;
		Method setter;
		try {
			getter = AdvanceBillRow.class.getDeclaredMethod("getSelect", null);
		    setter = AdvanceBillRow.class.getDeclaredMethod("setSelect", new Class[] {Boolean.class});
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.getMsg(Env.getCtx(), "Select"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ false, /* sortable */	 false, /* searchable */ false, 0, 0
	              ));
		    //
			getter = AdvanceBillRow.class.getDeclaredMethod("getSerial", null);
			setter = null;
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Util.cleanAmp(Msg.translate(Env.getCtx(), "Serial")), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ true /* sortable */,	 false, /* searchable */ false, 0, 0
	              ));
		    //
		    //		 		    
			getter = AdvanceBillRow.class.getDeclaredMethod("getDocumentNo", null);
			setter = null;
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.translate(Env.getCtx(), "DocumentNo"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ false, /* sortable */	 false, /* searchable */ false, 0, 0
	              ));
			getter = AdvanceBillRow.class.getDeclaredMethod("getISOCode", null);
			setter = null;			
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.translate(Env.getCtx(), "C_Currency_ID"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ false /* sortable */,	 false, /* searchable */ false, 0, 0
	              ));
			getter = AdvanceBillRow.class.getDeclaredMethod("getTotal", null);
			setter = AdvanceBillRow.class.getDeclaredMethod("setTotal", new Class[] {BigDecimal.class});
		    newcolumns.add(new DefaultTableViewColumn
		              (
		            		  Msg.getMsg(Env.getCtx(), "Invoiced"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ true /* sortable */,	 false, /* searchable */ false, 0, 0
		              ));		    		    
		    //		    
			getter = AdvanceBillRow.class.getDeclaredMethod("getAmountUsed", null);
		    setter = null;
		    newcolumns.add(new DefaultTableViewColumn
	              (
	            		  Msg.translate(Env.getCtx(), "Used"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ false, /* sortable */	 false, /* searchable */ false, 0, 0
	              ));		    
			getter = AdvanceBillRow.class.getDeclaredMethod("getAmount", null);
			setter = AdvanceBillRow.class.getDeclaredMethod("setAmount", new Class[] {BigDecimal.class});
		    newcolumns.add(new DefaultTableViewColumn
		              (
		            		  Msg.getMsg(Env.getCtx(), "Pending"), null,(Method)   getter,(Method)   setter,true, /* visible */ null, /* format */ true /* sortable */,	 false, /* searchable */ false, 0, 0
		              ));		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	    IObjetViewColumn[] columns = new IObjetViewColumn[newcolumns.size ()];
        newcolumns.toArray(columns);
        return columns;		  
	}
	
	private AdvanceBillRow newrow() {
		return new AdvanceBillRow();
	}
	
	private void refreshView()
	{
        List selection = advanceTable.getSelectedRowObjects();
        AdvanceBillRow row = null;
        if (selection.size() > 0)
        {
            row = (AdvanceBillRow) selection.get(0);
            if (row == null)
            	return;
            if ( row.IsChanged() )
            {            
        		calculate();
        		advanceTable.repaint();
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
	
	private void calculate ()
	{
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		
	}
	
	private void jbInit() {		
	}

	private void LoadAdvanced() {		
		try
		{
			MInvoice target = new MInvoice(Env.getCtx(), m_pi.getRecord_ID(), null);
			// Store Procedure @Identifier=ace9076e-0d66-2062-d630-9bbc0c743d27';
			PreparedStatement pstmt = DB.prepareStatement("SELECT * FROM InvoiceAdvanceOpen(?, ?)", null);			
			pstmt.setInt(1, target.getC_BPartner_ID());
			pstmt.setInt(2, target.getC_Currency_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				MInvoice invoice = MInvoice.get(Env.getCtx(), rs.getInt(X_C_Invoice.COLUMNNAME_C_Invoice_ID));
				MDocType dt = MDocType.get(Env.getCtx(), invoice.getC_DocType_ID());
				AdvanceBillRow row = new AdvanceBillRow();
				row.setSelect(false);
				row.setDocumentNo(invoice.getDocumentNo());
				row.setDateInvoiced(invoice.getDateInvoiced());				
				row.setC_DocTypeName(dt.getName());
				row.setSerial(invoice.getSerial());
				row.setC_Currency_ID(target.getC_Currency_ID());
				row.setC_Charge_ID(invoice.getC_Charge_ID());
				row.setC_Invoice_ID(invoice.getC_Invoice_ID());
				row.setTotal(invoice.getGrandTotal());
				BigDecimal Available = rs.getBigDecimal("Available");
				if (Available == null)
					Available = Env.ZERO;
				row.setMaxAmount(Available);
				row.setAmount(Available);
				BigDecimal AmountUsed = invoice.getGrandTotal().subtract(Available);
				if (AmountUsed == null)
					AmountUsed = Env.ZERO;
				row.setAmountUsed(AmountUsed);
				AddLine();
				int nPos = advanceTable.getSelectedRow();
				DefaultObjectViewModel mModel= (DefaultObjectViewModel) advanceTable.getDataModel();
				Object SelectedRow = advanceTable.getSelectedRowObject(); 
				mModel.updateRow(SelectedRow,row);
				advanceTable.setRowSelectionInterval(nPos, nPos);						
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, e.getMessage(), e);
		}
	}
	
	private void AddLine()
	{
		SelectedColumn = 0;
    	CAllocationRow newrow = new CAllocationRow();
    	( (DefaultObjectViewModel) advanceTable.getDataModel()).addRow(newrow);    	
    	SelectedRow = advanceTable.getRowCount()-1;
        Rectangle rect = advanceTable.getVisibleRect();
        Rectangle cRect = advanceTable.getCellRect(SelectedRow, SelectedColumn, true);
        rect.y = cRect.y;
        rect.height = cRect.height;
        advanceTable.scrollRectToVisible(rect);
        advanceTable.changeSelection(SelectedRow, SelectedColumn , false, false);
        advanceTable.repaint();		
	}
	
	public void dispose() {
		if (m_Frame != null)
		{
			m_Frame.setVisible(false);
			m_Frame.dispose();
		}
		m_Frame = null;		
		m_curTab = null;
		m_pi = null;
	}		
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(ConfirmPanel.A_CANCEL))
		{
			dispose();
			return;
		}
		saveSelection();
		dispose();		
	}
	
	private void saveSelection() {
		advanceTable.editingStopped(new ChangeEvent(this));
		if (m_pi == null)
			return;
		ObjectViewModel adapter = advanceTable.getDataModel();
		for (int i = 0; i < advanceTable.getRowCount(); i++)
		{
			AdvanceBillRow row = (AdvanceBillRow) adapter.getRowObject(i);			
			if (row.getSelect() && row.getAmount().compareTo(Env.ZERO) != 0)
			{				
				MInvoice target = new MInvoice(Env.getCtx(), m_pi.getRecord_ID(), null);
				MInvoiceLine targetline = new MInvoiceLine(target);
				targetline.setPriceActual(row.getAmount().negate());					targetline.setPriceEntered(row.getAmount().negate());
				targetline.setC_Charge_ID(row.getC_Charge_ID());
				targetline.setC_InvoiceAdvance_ID(row.getC_Invoice_ID());
				targetline.setQty(Env.ONE);							
				//
				targetline.save();
				
				if (m_info != null)
				{
					m_info.add(row.getC_Invoice_ID());
					m_info.add(row.getConvertedAmount());
				}
			}
		}
		if (m_curTab != null)
			m_curTab.dataRefresh();
		if (m_Panel != null)
			m_Panel.validate();
	}

	public void setInfo(Collection<Object> params) {
		m_info = params;
	}

	public void setPanel(CPanel cPanel) {
		m_Panel = cPanel;		
	}
	public boolean candispose() {
		return true;
	}		
}