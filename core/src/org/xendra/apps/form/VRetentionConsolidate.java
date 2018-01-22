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
import java.awt.Component;
import java.awt.Dimension;
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
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.compiere.acct.Doc;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.ADialog;
import org.compiere.apps.ALayout;
import org.compiere.apps.ALayoutConstraint;
import org.compiere.apps.StatusBar;
import org.compiere.grid.ed.VLookup;

import org.compiere.minigrid.MiniTable;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MGroupDoc;
import org.compiere.model.MInvoice;
import org.compiere.model.MRetention;
import org.compiere.plaf.CompiereColor;
import org.compiere.process.DocAction;
import org.compiere.swing.CFrame;
import org.compiere.swing.CLabel;
import org.compiere.swing.CPanel;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.Trx;
import org.compiere.util.Util;

/**
 *	Perception
 *
 * 	@author 	xapiens
 * 	@version 	$Id: 
 */
public class VRetentionConsolidate extends CFrame implements FormPanel, VetoableChangeListener, TableModelListener, ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3840357166676397441L;
	private int m_WindowNo;
	private FormFrame m_frame;
	private CPanel mainPanel = new CPanel();
	private StatusBar statusBar = new StatusBar();
	private CPanel parameterPanel = new CPanel();
	private JSplitPane retentionPanel = new JSplitPane();
	private JScrollPane toSelectScrollPane = new JScrollPane();
	private JScrollPane SelectedScrollPane = new JScrollPane();
	private MiniTable toSelectTable = new MiniTable();
	private MiniTable SelectedTable = new MiniTable();
	private static CLogger log = CLogger.getCLogger(VRetentionConsolidate.class);
	private VLookup pickPartner;
	private Integer C_BPartner_ID;
	private JButton consolidator = new JButton();
	private JButton generator = new JButton();
 	private CPanel toSelectPanel = new CPanel();
 	private CPanel SelectedPanel = new CPanel();
	private CLabel byPickup = new CLabel("0.00", JLabel.RIGHT);
	private MAcctSchema[] ass = null;
	private Timestamp today = new Timestamp(System.currentTimeMillis());
	

	public void init(int WindowNo, FormFrame frame) {
		m_WindowNo = WindowNo;
		m_frame = frame;		
		try
		{
			dynInit();
			jbInit();
			frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
		
	}

	private void jbInit() {
		CompiereColor.setBackground(this);
		consolidator .setText("Consolidar Retencion");
		consolidator.setIcon(Env.getImageIcon("Process16.gif"));       //  16*1
		consolidator.addActionListener(this);
		consolidator.setEnabled(false);
		generator .setText("Generar Retencion");
		generator.setIcon(Env.getImageIcon("Process16.gif"));       //  16*1
		generator.addActionListener(this);
		generator.setEnabled(false);				
		
		mainPanel.setLayout(new BorderLayout());
		retentionPanel.setLayout(new BorderLayout());
		mainPanel.add(parameterPanel, BorderLayout.NORTH);		
		mainPanel.add(retentionPanel, BorderLayout.CENTER);
		parameterPanel.setLayout(new ALayout());
		parameterPanel.add(new JLabel(Msg.translate(Env.getCtx(), "C_BPartner_ID")), new ALayoutConstraint(0,0));
		parameterPanel.add(pickPartner, null);		
		//
		toSelectPanel .setLayout(new BorderLayout());
		toSelectPanel.add(byPickup,BorderLayout.NORTH);
		toSelectPanel.add(toSelectScrollPane,BorderLayout.CENTER);
		toSelectPanel.add(consolidator,BorderLayout.SOUTH);
		toSelectScrollPane.getViewport().add(toSelectTable, null);
		//
		SelectedPanel.setLayout(new BorderLayout());
		SelectedPanel.add(SelectedScrollPane, BorderLayout.CENTER);
		SelectedPanel.add(generator, BorderLayout.SOUTH);
		SelectedScrollPane.getViewport().add(SelectedTable, null);
		retentionPanel.setOrientation(JSplitPane.VERTICAL_SPLIT);
		retentionPanel.setBorder(BorderFactory.createEtchedBorder());
		retentionPanel.add(toSelectPanel, JSplitPane.TOP);
		retentionPanel.add(SelectedPanel, JSplitPane.BOTTOM);
		retentionPanel.setDividerLocation(200);
		retentionPanel.setPreferredSize(new Dimension (800,400));
	}

	private void dynInit() {

		int AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());
		ass = MAcctSchema.getClientAcctSchema(Env.getCtx(), AD_Client_ID);
		
		pickPartner = VLookup.createBPartner(m_WindowNo);
		pickPartner.addVetoableChangeListener(this);

		
		settoSelectTable(true);
		
		setSelectedTable(true);
		
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "Perception"));
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
		
		if (name.equals("C_BPartner_ID"))
		{
			C_BPartner_ID = (Integer) e.getNewValue();
			loadBPartner();
		}
	}
	
	private void loadBPartner() {
		StringBuffer sql = null;
		String IsRetention = Env.getContext(Env.getCtx(), "$IsRetention");
		try
		{
			sql = new StringBuffer("SELECT i.DateInvoiced,i.DocumentNo,r.c_retention_id,"); //  1..3
			sql.append( "c.ISO_Code,i.GrandTotal, ");                            //  4..5    Orig Currency
			sql.append( "i.serial, CASE WHEN i.IsSOTrx='Y' THEN '(Venta) ' || dt.name ELSE '(Compra) ' || dt.name END    AS C_DocTypeName, ");
			sql.append( "r.taxamt, r.taxbaseamt , r.DocumentNo as retDocumentNo, c.C_currency_ID");
			sql.append( " FROM c_retention r ");	
			sql.append( " LEFT OUTER JOIN C_invoice_v i ON (r.c_invoice_id = i.c_invoice_id)");
			sql.append( " INNER JOIN C_Currency c ON (r.C_Currency_ID=c.C_Currency_ID) ");
			sql.append( " LEFT OUTER JOIN C_DocType_trl dt ON i.c_doctype_id = dt.c_doctype_id ");
			sql.append( " LEFT OUTER JOIN C_DocType doc ON i.c_doctype_id = doc.c_doctype_id ");
			//sql.append( " WHERE r.DocStatus='TC' AND COALESCE(r.c_groupdoc_id,0) = 0 ");
			sql.append( " WHERE r.DocStatus='TC' ");
			sql.append(" AND i.IsSOTrx='Y' AND r.C_BPartner_ID =?");
			
			int row = 0;
			toSelectTable.setRowCount(row);
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				toSelectTable.setRowCount(row+1);
				toSelectTable.setValueAt(new Boolean(false), row, 0);  
				toSelectTable.setValueAt(rs.getTimestamp("DateInvoiced"), row, 1);     
				toSelectTable.setValueAt(rs.getString("C_DocTypeName"), row, 2);       
				toSelectTable.setValueAt(rs.getString("serial"), row, 3);              
				toSelectTable.setValueAt(rs.getString("retDocumentNo"), row, 4);              
				KeyNamePair key = new KeyNamePair(rs.getInt(3), rs.getString(2));
				toSelectTable.setValueAt(key, row, 5);
				KeyNamePair currency = new KeyNamePair(rs.getInt(11), rs.getString(4));
				toSelectTable.setValueAt(currency, row, 6);              
				toSelectTable.setValueAt(rs.getBigDecimal("TaxAmt"), row, 7);          
				toSelectTable.setValueAt(rs.getBigDecimal("TaxBaseAmt"), row, 8);             
				row++;						
			}
			//toSelectTable.setColumnReadOnly(1, false);
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		toSelectTable.autoSize();
	}

	public void tableChanged(TableModelEvent e) {
		int row = e.getFirstRow();
		int col = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        if (model == toSelectTable.getModel())
        {
			if (col == 0 || col == 7) {
				totalpickup();
			}        	
        }
        else if (model == SelectedTable.getModel())
        {
        	if (col == 0) {
        		int rows = model.getRowCount();
        		generator.setEnabled(false);
        		for (int i = 0; i < rows; i++)
        		{
                   	if ( model.getValueAt(i, 0)!=null && ((Boolean)model.getValueAt(i, 0)).booleanValue() && !consolidator.isEnabled())
                   		generator.setEnabled(true);        			
        		}
        		
        	}
        }
	}

	private void totalpickup() {
		TableModel toselect = toSelectTable.getModel();
		int rows = toselect.getRowCount();
		BigDecimal total = Env.ZERO;
		consolidator.setEnabled(false);
		String ISO_Code = "";
		for (int i = 0; i < rows; i++)
		{
			if (toselect.getValueAt(i, 0)==null)
				continue;
			
           	if ( ((Boolean)toselect.getValueAt(i, 0)).booleanValue() && !consolidator.isEnabled())
           		consolidator.setEnabled(true);
			
			if (((Boolean)toselect.getValueAt(i, 0)).booleanValue())
			{
				total = total.add((BigDecimal) toselect.getValueAt(i, 7));              //  Amount			
				if (toselect.getValueAt(i, 6) == null) {}
				else if (ISO_Code.length() == 0)
					ISO_Code = toselect.getValueAt(i, 6).toString();
				else if (ISO_Code.compareTo(toselect.getValueAt(i, 6).toString()) != 0)
				{
					toselect.setValueAt(new Boolean(false), i, 0);
					ADialog.info(0, m_frame, "Debe seleccionar retenciones que tengan la misma moneda");
					return;
				}
			}
		}
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		byPickup.setText(format.format(total));
	}

	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();
		if (c==consolidator)
		{			
			if (ADialog.ask(0, m_frame, "Consolidado de retenciones\n Va a consolidar las retenciones seleccionadas del estado de 'Por recoger' a 'recogidas' consolidadas en un solo documento \nesta seguro de continuar?"))
			{
				if (consolidate())
					ADialog.info(0, m_frame, "Consolidación completada");
				else
					ADialog.info(0, m_frame, "La Consolidación no pudo ser completada");
			}
			else
			{}
		}
		else if (c==generator)
		{
			if (ADialog.ask(0, m_frame, "Generador de retenciones consolidada\n Va a generar las retenciones consolidadas seleccionadas \nesta seguro de continuar?"));
			if (generate())
				ADialog.info(0, m_frame, "Generación completada");
			else
				ADialog.info(0, m_frame, "La Generación no pudo ser completada");
				
		}		
	}

	private boolean consolidate() {
		TableModel toselect = toSelectTable.getModel();
		int rows = toselect.getRowCount();		
		BigDecimal TaxAmt = Env.ZERO;
		Vector<Object> line = new Vector<Object>();
		//String ISO_Code = "";
		KeyNamePair currency = null;
		for (int i = 0; i < rows; i++)
		{
			if (((Boolean)toselect.getValueAt(i, 0)).booleanValue())
			{
				KeyNamePair id  = (KeyNamePair) toselect.getValueAt(i, 5);
				//ISO_Code = (String) toselect.getValueAt(i, 6);
				if (currency == null)
					currency = (KeyNamePair) toselect.getValueAt(i, 6);
				line.add(id);				
				BigDecimal TaxAmtLine = (BigDecimal) toselect.getValueAt(i, 7);
				line.add(TaxAmtLine); // taxamt
				TaxAmt = TaxAmt.add(TaxAmtLine);
				 
			}
		}
		// actualizar vista
		DefaultTableModel model =  (DefaultTableModel)SelectedTable.getModel();
		int row = model.getRowCount();		
		SelectedTable.setRowCount(row+1);
		SelectedTable.setValueAt(new Boolean(false), row, 0);              //  date
		SelectedTable.setValueAt(line, row, 1);              //  date
		SelectedTable.setValueAt(today, row, 2);              //  date 
		SelectedTable.setValueAt("", row, 3);              //  document
		SelectedTable.setValueAt(currency, row, 4);
		SelectedTable.setValueAt(TaxAmt, row, 5);              // tax amt		
		settoSelectTable(false);
		consolidator.setEnabled(false);
		return true;
	}
	
	private boolean generate() {
		Trx m_trx = Trx.get(Trx.createTrxName("rcprocess"), true);
		String m_trxName = m_trx.getTrxName();
		MGroupDoc groupdoc = new MGroupDoc(Env.getCtx(), 0, m_trxName);
		groupdoc.setC_BPartner_ID(C_BPartner_ID);
		KeyNamePair currency = null;
		if (!groupdoc.save())
		{
			m_trx.rollback();
			m_trx.close();
			return false;
		}				
		DefaultTableModel selected = (DefaultTableModel) SelectedTable.getModel();
		int rows = selected.getRowCount();
		
		for (int i = 0; i < rows; i++)
		{
			if (((Boolean)selected.getValueAt(i, 0)).booleanValue() && selected.getValueAt(i, 3).toString().length() > 0)
			{				
				MRetention retention = new MRetention(Env.getCtx(), 0 , m_trxName);
				if (currency == null)
					currency = (KeyNamePair) SelectedTable.getValueAt(i,4); 
				retention.setC_GroupDoc_ID(groupdoc.getC_GroupDoc_ID());
				retention.setDocStatus(DocAction.STATUS_ToCollect);
				retention.setDocAction(DocAction.ACTION_Collect);
				retention.setStatusDate((Timestamp) selected.getValueAt(i, 2));
				retention.setDateRetention((Timestamp) selected.getValueAt(i, 2));
				retention.setDocumentNo((String) selected.getValueAt(i, 3));
				retention.setC_Currency_ID(currency.getKey());
				retention.setC_BPartner_ID(C_BPartner_ID);
				retention.setTaxAmt((BigDecimal) SelectedTable.getValueAt(i,5));								
				if (!retention.save())
				{
					m_trx.rollback();
					m_trx.close();
					return false;
				}				
				try {
					retention.processIt(DocAction.ACTION_Collect);
					retention.save();
				} catch (Exception e) {
					e.printStackTrace();
					m_trx.rollback();
					m_trx.close();
					return false;			
				}				
				// ok como todo estuvo ok, procedemos a alterar las retenciones por recoger.
        		Vector<Object> collected = (Vector<Object>) SelectedTable.getValueAt(i, 1);
        		i = 0;
        		while ( i < collected.size())
        		{
        			if (collected.get(i) instanceof KeyNamePair)
        			{
        				
            			KeyNamePair k = (KeyNamePair) collected.get(i);
            			MRetention ret = new MRetention(Env.getCtx(), k.getKey(), null);
            			
            			if(collected.get(i+1) instanceof BigDecimal)
            			{
            				BigDecimal TaxAmt = (BigDecimal) collected.get(i+1);
            				BigDecimal diff = ret.getTaxAmt().subtract(TaxAmt);
            				if (diff.compareTo(Env.ZERO) != 0)
            				{
                    			MInvoice invoice = new MInvoice(Env.getCtx(), ret.getC_Invoice_ID(), null);
                    			MDocType doc = MDocType.get(Env.getCtx(), invoice.getC_DocType_ID());
                    			ret.setTaxAmt(diff);
            					MRetention newret = new MRetention(Env.getCtx(), 0, m_trxName);            					
            					newret.setDocStatus(DocAction.STATUS_Closed);
            					newret.setStatusDate(today);
            					newret.setDocumentNo(ret.getDocumentNo());
            					newret.setC_Currency_ID(ret.getC_Currency_ID());
            					newret.setC_BPartner_ID(ret.getC_BPartner_ID());
            					newret.setTaxAmt(TaxAmt);
                    			newret.setC_GroupDoc_ID(groupdoc.getC_GroupDoc_ID());
            					if ( !ret.save() || !newret.save()  )
            					{
            						m_trx.rollback();
            						m_trx.close();
            						return false;
            					}				
		            			String docname = invoice.isSOTrx() ? "(Venta) " : "(Compra) ";
		            			docname = docname + doc.getPrintName(Env.getAD_Language(Env.getCtx()));
		            			int row = toSelectTable.getRowCount();
		        				toSelectTable.setRowCount(row+1);
		        				toSelectTable.setValueAt(new Boolean(false), row, 0);  
		        				toSelectTable.setValueAt(invoice.getDateInvoiced(), row, 1);           
		        				toSelectTable.setValueAt(docname, row, 2);              
		        				toSelectTable.setValueAt(invoice.getSerial(), row, 3);  
		        				toSelectTable.setValueAt(ret.getDocumentNo(), row, 4);
		        				toSelectTable.setValueAt(k, row, 5);              
		        				toSelectTable.setValueAt(currency, row, 6); 
		        				toSelectTable.setValueAt(diff, row, 7);
            				}
            				else
            				{
            					ret.setDocStatus(DocAction.STATUS_Closed);
            					ret.setC_GroupDoc_ID(groupdoc.getC_GroupDoc_ID());
            					if ( !ret.save()  )
            					{
            						m_trx.rollback();
            						m_trx.close();
            						return false;
            					}				            					
            				}
            			}		            							        			              
        			}
        			i++;
        		}		
			}
			else if (selected.getValueAt(i, 3).toString().length() == 0)
			{
				ADialog.info(0, m_frame, "las retenciones consolidadas requieren un numero de documento");
				m_trx.rollback();
				m_trx.close();
				return false;				
			}
		}
		// eliminamos el consolidado de la grilla.
		int i = 0;
		while ( i < rows)
		{
			if (((Boolean)selected.getValueAt(i, 0)).booleanValue())
			{
				selected.removeRow(i);
				rows = selected.getRowCount();
				i = 0;
			}				
			else
				i++;
		}        				
		m_trx.commit();
		m_trx.close();					
		settoSelectTable(false);
		generator.setEnabled(false);										
		return true;
	}
	
	void settoSelectTable(Boolean initialize) {
		
		if (initialize)
		{
			toSelectTable.addColumn(Msg.getMsg(Env.getCtx(), "Select"));
			toSelectTable.addColumn(Msg.translate(Env.getCtx(), "Date"));
			toSelectTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "Documento")));
			toSelectTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "Serie")));
			toSelectTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
			toSelectTable.addColumn(Msg.translate(Env.getCtx(), "C_Retention_ID"));
			toSelectTable.addColumn(Msg.translate(Env.getCtx(), "C_Currency_ID"));
			toSelectTable.addColumn(Msg.translate(Env.getCtx(), "taxamt"));
			toSelectTable.addColumn(Msg.getMsg(Env.getCtx(), "taxbaseamt"));
			
			//
			toSelectTable.setCellSelectionEnabled(false);
			toSelectTable.setRowSelectionAllowed(false);
			//  set details
			int i = 0;
			toSelectTable.setColumnClass(i++, Boolean.class, false, " ");
			toSelectTable.setColumnClass(i++, Timestamp.class, true, Msg.translate(Env.getCtx(), Msg.translate(Env.getCtx(), "Date")));
			toSelectTable.setColumnClass(i++, String.class, true, Msg.translate(Env.getCtx(),"DocumentNo"));
			toSelectTable.setColumnClass(i++, String.class, true, Msg.translate(Env.getCtx(),"Serie"));
			toSelectTable.setColumnClass(i++, String.class, true, Msg.translate(Env.getCtx(),"DocumentNo"));
			toSelectTable.setColumnClass(i++, String.class, true, Msg.translate(Env.getCtx(),"C_Retention_ID"));
			toSelectTable.setColumnClass(i++, String.class, true, Msg.translate(Env.getCtx(),"C_Currency_ID"));
			toSelectTable.setColumnClass(i++, BigDecimal.class, false, Msg.translate(Env.getCtx(), "TaxAmt"));
			toSelectTable.setColumnClass(i++, BigDecimal.class, true, Msg.translate(Env.getCtx(), "TaxBaseAmt"));
			//		
				
			DefaultTableModel model =  (DefaultTableModel)toSelectTable.getModel();
			model.addTableModelListener(this);
			toSelectTable.setModel(model);
		}
		else
		{
			DefaultTableModel model =  (DefaultTableModel)toSelectTable.getModel();
			int numRows = model.getRowCount();
			int i = 0;
			while ( i < numRows)
			{
				if (((Boolean)toSelectTable.getValueAt(i, 0)).booleanValue())
				{
					model.removeRow(i);
					numRows = model.getRowCount();
					i = 0;
				}				
				else
					i++;
			}
		}
	}
	
	
	void setSelectedTable(Boolean initialize) {
		
		if (initialize)
		{
			SelectedTable.addColumn(Msg.getMsg(Env.getCtx(), "Select"));
			SelectedTable.addColumn(Msg.translate(Env.getCtx(), "Retenciones por recoger"));
			SelectedTable.addColumn(Msg.translate(Env.getCtx(), "Date"));
			SelectedTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
			SelectedTable.addColumn(Msg.translate(Env.getCtx(), "C_Currency_ID"));
			SelectedTable.addColumn(Msg.getMsg(Env.getCtx(), "taxbaseamt"));
			
			//
			SelectedTable.setCellSelectionEnabled(false);
			SelectedTable.setRowSelectionAllowed(false);

			//  set details
			int i = 0;
			SelectedTable.setColumnClass(i++, Boolean.class, false, " ");
			SelectedTable.setColumnClass(i++, Object.class, true, "Retenciones por recoger");
			SelectedTable.setColumnClass(i++, Timestamp.class, false, Msg.translate(Env.getCtx(), Msg.translate(Env.getCtx(), "Date")));
			SelectedTable.setColumnClass(i++, String.class, false, Msg.translate(Env.getCtx(),"DocumentNo"));
			SelectedTable.setColumnClass(i++, String.class, true, Msg.translate(Env.getCtx(),"C_Currency_ID"));			
			SelectedTable.setColumnClass(i++, BigDecimal.class, true, Msg.translate(Env.getCtx(), "TaxBaseAmt"));
			//
			SelectedTable.autoSize();		
				
			DefaultTableModel model =  (DefaultTableModel)SelectedTable.getModel();
			model.addTableModelListener(this);
			SelectedTable.setModel(model);
			SelectedTable.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if ( key == KeyEvent.VK_DELETE)
					{
		            	if (ADialog.ask(0, m_frame, Msg.getMsg(Env.getCtx(), "DeleteRecord?")))
		            	{
		            		int selection = SelectedTable.getSelectedRow();
		            		DefaultTableModel model =  (DefaultTableModel) SelectedTable.getModel();		            		
		            		Vector<Object> collected = (Vector<Object>) SelectedTable.getValueAt(selection, 1);
		            		int i = 0;
		            		while ( i < collected.size())
		            		{
		            			if (collected.get(i) instanceof KeyNamePair)
		            			{
		            				
			            			KeyNamePair k = (KeyNamePair) collected.get(i);
			            			MRetention retention = new MRetention(Env.getCtx(), k.getKey(), null);
			            			MInvoice invoice = new MInvoice(Env.getCtx(), retention.getC_Invoice_ID(), null);
			            			MDocType doc = MDocType.get(Env.getCtx(), invoice.getC_DocType_ID());
			            			MCurrency currency = MCurrency.get(Env.getCtx(), invoice.getC_Currency_ID());
			            			KeyNamePair money = new KeyNamePair(currency.getC_Currency_ID(), currency.getISO_Code());
			            			String docname = invoice.isSOTrx() ? "(Venta) " : "(Compra) ";
			            			docname = docname + doc.getPrintName(Env.getAD_Language(Env.getCtx()));		    
			            			int row = toSelectTable.getRowCount();
			        				toSelectTable.setRowCount(row+1);
			        				toSelectTable.setValueAt(new Boolean(false), row, 0);  
			        				toSelectTable.setValueAt(invoice.getDateInvoiced(), row, 1);           
			        				toSelectTable.setValueAt(docname, row, 2);              
			        				toSelectTable.setValueAt(invoice.getSerial(), row, 3);  
			        				toSelectTable.setValueAt(retention.getDocumentNo(), row, 4);
			        				toSelectTable.setValueAt(k, row, 5);              
			        				toSelectTable.setValueAt(money, row, 6);              
			            			if(collected.get(i+1) instanceof BigDecimal)
			            			{
			            				toSelectTable.setValueAt(retention.getTaxAmt(), row, 7);
			            			}		            							        			              
			        				toSelectTable.setValueAt(retention.getTaxBaseAmt(), row, 8);          		            					            				
		            			}
		            			i++;
		            		}
		            		model.removeRow(selection);
		            	}	                           	
					}	
				}				
			});
			
		}
		else
		{
			
		}
	}
	public boolean candispose() {
		return true;
	}		
}