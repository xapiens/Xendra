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
import java.awt.Toolkit;
import java.awt.image.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Vector;
import java.util.logging.Level;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.ADialog;
import org.compiere.apps.ALayout;
import org.compiere.apps.ALayoutConstraint;
import org.compiere.apps.ConfirmPanel;
import org.compiere.apps.StatusBar;
import org.compiere.grid.ed.VDate;
import org.compiere.grid.ed.VLookup;

import org.compiere.minigrid.MiniTable;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MInvoice;
import org.compiere.model.MCharge;
import org.compiere.plaf.CompiereColor;
import org.compiere.swing.*;
import org.compiere.util.CLogger;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.plaf.XendraPLAF;

/**
 *	Document Modify
 *
 * 	@author 	xapiens
 * 	@version 	$Id: 
 */
//  , VetoableChangeListener
public class VInvoiceModify extends CFrame implements FormPanel
{

	private int m_WindowNo;
	private FormFrame m_frame;
	private BorderLayout mainLayout = new BorderLayout();
	private BorderLayout southLayout = new BorderLayout();
	private CPanel mainPanel = new CPanel();
	private CPanel parameterPanel = new CPanel();
	private CPanel linePanel = new CPanel();
	private CPanel southPanel = new CPanel();
	private StatusBar statusBar = new StatusBar();
	private CLabel lInvoice_ID = new CLabel (Msg.translate(Env.getCtx(), "C_Invoice_ID"));
	private CLabel lCharge_ID = new CLabel (Msg.translate(Env.getCtx(), "C_Charge_ID"));
	private VLookup fInvoice_ID;	
	private VLookup fCharge_ID;
	private CLabel lserie = new CLabel(Msg.translate(Env.getCtx(), "Serie"));
	private CLabel loldserie = new CLabel("");
	private CTextField fserie = new CTextField(10);
	//
	private CLabel lnumber = new CLabel(Msg.translate(Env.getCtx(), "DocumentNo"));
	private CLabel loldnumber = new CLabel("");
	private CTextField fnumber = new CTextField(10);		
	//
	private CLabel ldinvoice = new CLabel(Msg.translate(Env.getCtx(), "DateInvoiced"));
	private CLabel lolddinvoice = new CLabel("");
	private VDate fdinvoice = new VDate("DateInvoiced", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "DateInvoiced"));
	//
	private CLabel ldaccount = new CLabel(Msg.translate(Env.getCtx(), "DateAcct"));
	private CLabel lolddaccount = new CLabel("");
	private VDate fdaccount = new VDate("DateAcct", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "DateAcct"));
	//
	private JScrollPane invoiceScrollPane = new JScrollPane();
	private MiniTable invoiceTable = new MiniTable();
	ConfirmPanel confirmPanel = new ConfirmPanel(true, false, false, false, false, false, false);
	//
	private static CLogger log = CLogger.getCLogger(VBoeGen.class);
	private int m_Invoice_ID = 0;
	private MInvoiceLine[] lines;
	private int m_counter = 0;
	private int m_activeRow = 0;
	private int m_activeChargeCol = 2;
	private boolean m_IsEditingInvoice = false;
	private boolean m_IsChangeInfo = false;
	MInvoice m_invoice = null;

    private final Action printAction = new AbstractAction() {
        private static final long serialVersionUID = 1L;

        public void actionPerformed(ActionEvent e) {
            //print();
        	if (ADialog.ask(0, m_frame, Msg.getMsg(Env.getCtx(), "SaveRecord?")))
        	{
        		saveinvoice();
        	}
        }

		private void saveinvoice() {
			if ( m_invoice != null)
			{
				if ( !fserie.getValue().equals(m_invoice.getSerial()) )
					m_invoice.setSerial((String)fserie.getValue());
				//
				if ( !fnumber.getValue().equals(m_invoice.getDocumentNo()) )
					m_invoice.setDocumentNo((String)fnumber.getValue());
				//
				if ( !fdinvoice.getValue().equals(m_invoice.getDateInvoiced()) )
					m_invoice.setDateInvoiced((Timestamp)fdinvoice.getValue());
				//
				if ( !fdaccount.getValue().equals(m_invoice.getDateAcct()) )
					m_invoice.setDateAcct((Timestamp)fdaccount.getValue());
				m_invoice.save();
				
				for (int i = 0; i < lines.length; i++)
				{
					
					if ((((Boolean)invoiceTable.getValueAt(i, 0)).booleanValue()) && (!((Boolean)invoiceTable.getValueAt(i, 6)).booleanValue()))
					{
						lines[i].save();
					}
				}
				
			}
		}
    };
	

	public void init(int WindowNo, FormFrame frame) {
		m_WindowNo = WindowNo;
		m_frame = frame;		
		try
		{
			dynInit();
			jbInit();
			frame.getContentPane().add(mainPanel, BorderLayout.NORTH);
			frame.getContentPane().add(southPanel, BorderLayout.SOUTH);
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
		
	}

	private void jbInit() {
		CompiereColor.setBackground(this);
		mainPanel.setLayout(mainLayout);
		createToolBar();
		mainPanel.add(parameterPanel, BorderLayout.CENTER);
		//fInvoice_ID.setSize(20, 10);
		parameterPanel.setLayout(new ALayout());
		parameterPanel.add(lInvoice_ID, new ALayoutConstraint(0,0));
		parameterPanel.add(fInvoice_ID, null);
		// serie
		parameterPanel.add(lserie,      new ALayoutConstraint(1,0));
		parameterPanel.add(loldserie,   null);
		parameterPanel.add(fserie,      null);
		// number
		parameterPanel.add(lnumber,      new ALayoutConstraint(2,0));
		parameterPanel.add(loldnumber,   null);
		parameterPanel.add(fnumber,      null);		
		// document date
		parameterPanel.add(ldinvoice,      new ALayoutConstraint(3,0));
		parameterPanel.add(lolddinvoice,   null);
		parameterPanel.add(fdinvoice,      null);		
		// document account date
		parameterPanel.add(ldaccount,      new ALayoutConstraint(4,0));
		parameterPanel.add(lolddaccount,   null);
		parameterPanel.add(fdaccount,      null);		
		
		parameterPanel.setPreferredSize(new Dimension (500,170));
		// accounting date
		//this.add(mainPanel);
		mainPanel.add(invoiceScrollPane, BorderLayout.SOUTH);
		invoiceScrollPane.setPreferredSize(new Dimension(200, 200));
		invoiceScrollPane.getViewport().add(invoiceTable, null);
		// 
		linePanel.setLayout(new ALayout());
		linePanel.add(lCharge_ID, new ALayoutConstraint(0,0));
		linePanel.add(fCharge_ID, null);		
		//mainPanel.add(linePanel, BorderLayout.SOUTH);
		southPanel.setLayout(southLayout);
		southPanel.add(linePanel, BorderLayout.NORTH);
		southPanel.add(confirmPanel, BorderLayout.CENTER);
		southPanel.add(statusBar, BorderLayout.SOUTH);
		
	}

	private void dynInit() {
		
		//	5354 - C_CashLine.C_Invoice_ID
		fInvoice_ID = new VLookup("C_Invoice_ID", false, false, true,
			MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 5354, DisplayType.Search));
		fInvoice_ID.addActionListener(
				new ActionListener() {
					private boolean Processing = false;
					//private InvoiceListener invoiceListener;
										

					public void actionPerformed(ActionEvent e)
					{
						if (m_Invoice_ID == (Integer) fInvoice_ID.getValue())
							return;
						
						m_activeRow = 0;
						
						m_counter = 0;
						
						m_Invoice_ID = (Integer) fInvoice_ID.getValue();
						m_invoice = new MInvoice( Env.getCtx(), m_Invoice_ID, null);
						if ( m_invoice  != null )
						{
							m_IsEditingInvoice = true;
							//
							loldserie.setText(m_invoice.getSerial());
							fserie.setValue(m_invoice.getSerial());
							//
							loldnumber.setText(m_invoice.getDocumentNo());
							fnumber.setValue(m_invoice.getDocumentNo());
							//
							lolddinvoice.setText(m_invoice.getDateInvoiced().toString());
							fdinvoice.setValue(m_invoice.getDateInvoiced());
							//
							lolddaccount.setText(m_invoice.getDateAcct().toString());
							fdaccount.setValue(m_invoice.getDateAcct());
							//
							lines = m_invoice.getLines();		

							//invoiceTable.getSelectionModel().removeListSelectionListener(invoiceListener);
							//invoiceTable = new MiniTable();							//							
							//  Header Info
							Vector<String> columnNames = new Vector<String>();
							
							columnNames.add(Msg.translate(Env.getCtx(), "Change"));
							columnNames.add(Msg.translate(Env.getCtx(), "C_Charge_ID"));
							columnNames.add(Msg.translate(Env.getCtx(), "C_Charge_ID"));
							columnNames.add(Msg.translate(Env.getCtx(), "Qty"));
							columnNames.add(Msg.translate(Env.getCtx(), "PriceActual"));
							columnNames.add(Msg.translate(Env.getCtx(), "LineTotalAmt"));
							columnNames.add(Msg.translate(Env.getCtx(), "M_Product_ID"));
														
							Vector<Vector<Object>> data = new Vector<Vector<Object>>();
							while (m_counter < lines.length )
							{
									Vector<Object> line = new Vector<Object>();
									line.add(new Boolean(false));       //  0-Selection
									if ( lines[m_counter].getC_Charge_ID() > 0  )
									{
										MCharge charge = new MCharge(Env.getCtx(), lines[m_counter].getC_Charge_ID(), null );
										line.add(charge.getName());      
									}
									else
										line.add(Msg.translate(Env.getCtx(), "<>"));
									line.add(Msg.translate(Env.getCtx(), "<>"));
									line.add(lines[m_counter].getQtyEntered());
									line.add(lines[m_counter].getPriceActual());
									line.add(lines[m_counter].getLineNetAmt());
									line.add(new Boolean(lines[m_counter].getM_Product_ID() > 0));       //  0-Selection
									data.add(line);								
									m_counter++;
							}
							DefaultTableModel modelP = new DefaultTableModel(data, columnNames);
							//modelP.addTableModelListener(new ItineraryTableModelListener());
							invoiceTable.setModel(modelP);
							//invoiceTable.getSelectionModel().addListSelectionListener(invoiceListener);
							int i = 0;
							invoiceTable.setColumnClass(i++, Boolean.class, false);        //   1-Changed
							invoiceTable.setColumnClass(i++, String.class, true);        //   1-Charge
							invoiceTable.setColumnClass(i++, String.class, true);        //   2-Charge (Changes)
							invoiceTable.setColumnClass(i++, Integer.class, true);        //  3-Qty
							invoiceTable.setColumnClass(i++, BigDecimal.class, true);        //  4-PriceActual
							invoiceTable.setColumnClass(i++, BigDecimal.class, true);        //  5-LineTotalAmt
							invoiceTable.setColumnClass(i++, Boolean.class, true);        //  5-LineTotalAmt
							invoiceTable.autoSize();							
						}
						else
						{
							m_IsEditingInvoice = false;
							m_IsChangeInfo = false;
						}
						
					}
				}
		);
		fInvoice_ID.setBackground(XendraPLAF.getInfoBackground());
				

//		5296 - C_CashLine.C_Charge_ID
		fCharge_ID = new VLookup("C_Charge_ID", false, false, true,
				MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 5296, DisplayType.TableDir));
		fCharge_ID.addActionListener( new ActionListener() {
			private boolean Processing = false;

			public void actionPerformed(ActionEvent e) {
				if (invoiceTable.getSelectedRow() < m_counter)
				{
					if ( fCharge_ID.getValue() != null )
					{
						if ( (Integer)fCharge_ID.getValue() != lines[invoiceTable.getSelectedRow()].getC_Charge_ID() )
						{
							lines[invoiceTable.getSelectedRow()].setC_Charge_ID((Integer) fCharge_ID.getValue());
							invoiceTable.setValueAt(fCharge_ID.getDisplay(), invoiceTable.getSelectedRow(), m_activeChargeCol);
							invoiceTable.setValueAt(true, invoiceTable.getSelectedRow(), 0);
							m_IsChangeInfo = true;
						}
					}
				}
			}
		});
		lCharge_ID.setLabelFor(fCharge_ID);
		fCharge_ID.setBackground(XendraPLAF.getInfoBackground());
		
		confirmPanel.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				String cmd = e.getActionCommand();
				if (cmd.equals(ConfirmPanel.A_OK))
				{
					m_frame.dispose();
				}
				if (cmd.equals(ConfirmPanel.A_CANCEL))
				{
					m_frame.dispose();
				}								
			}
		});
		
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "BillOfExchangeGenerationStatus"));
		statusBar.setStatusDB("");
		
	}
	
	public void dispose() {
		if (m_frame != null)
			m_frame.dispose();
		m_frame = null;			
	}

//	private class ItineraryTableModelListener implements TableModelListener {
//	    public void tableChanged(TableModelEvent e)
//	    {
//	      if (e.getType() == TableModelEvent.UPDATE)
//	      {
//			m_activeRow = invoiceTable.getSelectedRow();
//			if (m_activeRow < m_counter)
//			{
//				if ( lines[m_activeRow].getC_Charge_ID() != 0)
//					fCharge_ID.setValue(lines[m_activeRow].getC_Charge_ID());
//				else
//					fCharge_ID.setValue(null);
//			}			    	  
//	      }
//	    }
//	};
	
    protected void createToolBar() {
        final JToolBar bar = new JToolBar();
        
        bar.add(createActionButton(printAction,
                                   null,
                                   "22x22/document-print.png",
                                   "Print document"));
        
        bar.setFloatable(false);
        mainPanel.add(BorderLayout.NORTH, bar);
    }
    
    protected JButton createActionButton(Action action,
            String text,
            String image,
            String tooltip) 
    {
    	//final ImageIcon icon =	new ImageIcon(getClass().getResource(image));
    	final ImageIcon icon =	new ImageIcon(XendraPLAF.class.getResource("icons/Ok24.gif"));
    	//b.setIcon(new ImageIcon(XendraPLAF.class.getResource("icons/Ok24.gif")));
    	final double colorFactor = 0.9;

    	final RGBImageFilter filter = new RGBImageFilter() {
    		public int filterRGB(int x, int y, int rgb) {
    			final int alpha = (rgb >> 24) & 0xff;
    			final int red   = (rgb >> 16) & 0xff;
    			final int green = (rgb >>  8) & 0xff;
    			final int blue  = (rgb      ) & 0xff;
    			return ((int) (alpha * colorFactor) << 24)
    			| ((int) (red   * colorFactor) << 16)
    			| ((int) (green * colorFactor) << 8)    			
    			| ((int) (blue  * colorFactor));
    			}
    		};
    	final ImageIcon darkerIcon = new ImageIcon(
    			Toolkit.getDefaultToolkit().createImage(
    					new FilteredImageSource(icon.getImage().getSource(),
                   filter)));
    	
    	final JButton result = new JButton();
    	result.setAction(action);
    	result.setText(text);
    	result.setIcon(darkerIcon);
    	result.setBorderPainted(false);
    	result.setHorizontalTextPosition(SwingConstants.CENTER);
    	result.setVerticalTextPosition(SwingConstants.BOTTOM);
    	result.setMnemonic(0);
    	result.setToolTipText(tooltip);    
    	final Dimension dim = result.getPreferredSize();
    	result.setMaximumSize(new Dimension(32, dim.height));
    	result.addMouseListener(new MouseAdapter() {
    	public void mouseEntered(MouseEvent me) {
    		result.setBorderPainted(true);
    		result.setIcon(icon);
    		}
    	public void mouseExited(MouseEvent me) {
    		result.setBorderPainted(false);
    		result.setIcon(darkerIcon);
    		}
    	});

    	result.setBorderPainted(false);
    	result.setFocusPainted(false);

    return result;
    }
    
//	class InvoiceListener implements ListSelectionListener
//	{
//		public void valueChanged(ListSelectionEvent event) {
//			//m_activeCol = invoiceTable.getSelectedColumn();
//			m_activeRow = invoiceTable.getSelectedRow();
//			if (m_activeRow < m_counter)
//			{
//				if ( lines[m_activeRow].getC_Charge_ID() != 0)
//					fCharge_ID.setValue(lines[m_activeRow].getC_Charge_ID());
//				else
//					fCharge_ID.setValue(null);
//			}											
//			//int viewCol = invoiceTable.getSelectedColumn();
//		}
//	}
	public boolean candispose() {
		return true;
	}	
	
}
