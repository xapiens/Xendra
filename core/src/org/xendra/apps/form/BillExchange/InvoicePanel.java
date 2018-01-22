/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
package org.xendra.apps.form.BillExchange;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.compiere.apps.ADialog;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MBPartner;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.util.DB;
import org.compiere.util.Env;

import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JSplitPane;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class InvoicePanel extends JSplitPane implements ListSelectionListener, ActionListener, VetoableChangeListener {

	private JList listAllExchange  = new JList();
	private JList listSelExchange = new JList();
	private MBPartner partner;
	private MDocType doctype;
	private MCurrency currency;
	private final JPopupMenu popupMenu = new JPopupMenu();
	private final JMenu mnOrdenarPor = new JMenu("Ordenar por");
	private final JMenuItem mntmFecha = new JMenuItem("Fecha");
	private final JMenuItem mntmVencimiento = new JMenuItem("Vencimiento");	
	private final JMenuItem mntmDocumento = new JMenuItem("Documento");
	private final JMenuItem mntmMonto = new JMenuItem("Monto");
	private InvoiceHeader invoiceHeaderAll = new InvoiceHeader();
	private InvoiceHeader invoiceHeaderSel = new InvoiceHeader();
	private final JMenuItem mntmSeleccionar = new JMenuItem("Seleccionar");
	private final JPopupMenu popupMenu_1 = new JPopupMenu();
	private final JMenuItem mntmDeseleccionar = new JMenuItem("deseleccionar");
	private ArrayList<InvoiceItem> m_invoices = new ArrayList<InvoiceItem>() ;
	private BillExchangePanel m_billExchangePanel;
	private VLookup m_pickDocType;
	private VLookup m_pickPartner;
	private VLookup m_pickCurrency;
	private int m_WindowNo;

	public int getC_DocType_ID() {
		int C_DocType_ID = 0;
		if (doctype != null)
			C_DocType_ID = doctype.getC_DocType_ID();
		return C_DocType_ID;
	}

	public void setC_DocType_ID(Integer C_DocType_ID) {
		
		configure();
	}

	public int getC_BPartner_ID() {
		int C_BPartner_ID = 0;
		if (partner != null)
			C_BPartner_ID = partner.getC_BPartner_ID();
		return C_BPartner_ID;
	}

	public void setC_BPartner_ID(Integer C_BPartner_ID) {
		configure();
	}

	public boolean IsHasSelExchange() {
		return listSelExchange.getModel().getSize() > 0;
	}


	public InvoicePanel() {
		listAllExchange.setCellRenderer(new InvoiceRenderer());
		listAllExchange.getSelectionModel().addListSelectionListener(this);

		listSelExchange.setCellRenderer(new InvoiceRenderer());
		listSelExchange.getSelectionModel().addListSelectionListener(this);

		JScrollPane scrollPaneAll = new JScrollPane(listAllExchange);

		addPopup(listAllExchange, popupMenu);

		popupMenu.add(mnOrdenarPor);
		mntmFecha.addActionListener(this);

		mnOrdenarPor.add(mntmFecha);
		mntmDocumento.addActionListener(this);
		mnOrdenarPor.add(mntmDocumento);
		mntmVencimiento.addActionListener(this);

		mnOrdenarPor.add(mntmVencimiento);
		mntmMonto.addActionListener(this);		
		mnOrdenarPor.add(mntmMonto);
		mntmSeleccionar.addActionListener(this);		
		popupMenu.add(mntmSeleccionar);
		scrollPaneAll.setColumnHeaderView(invoiceHeaderAll);		
		setLeftComponent(scrollPaneAll);

		JScrollPane scrollPaneSel = new JScrollPane(listSelExchange);

		addPopup(listSelExchange, popupMenu_1);
		mntmDeseleccionar.addActionListener(this);		
		popupMenu_1.add(mntmDeseleccionar);
		scrollPaneSel.setColumnHeaderView(invoiceHeaderSel);
		setRightComponent(scrollPaneSel);

	}

	void configure() {		
		if (doctype == null || partner == null || currency == null)
		{
			return;
		}				
		invoiceHeaderAll.setTotal(Env.ZERO);
		m_invoices = new ArrayList<InvoiceItem>();
		DefaultListModel modelAll = new DefaultListModel();
		listAllExchange.setModel(modelAll);
		DefaultListModel modelSel = new DefaultListModel();
		listSelExchange.setModel(modelSel);

		StringBuilder sql = new StringBuilder("SELECT " +
				"i.DateInvoiced," +
				"i.C_Withholding_ID," +
				"daysbetween(now(),i.DateInvoiced) as daysbetween," +
				"i.DocumentNo," +
		"i.C_Invoice_ID,"); //  1..3		
		sql.append( "c.ISO_Code," +
		"i.GrandTotal, ");                            //  4..5    Orig Currency
		sql.append( "currencyConvert(i.GrandTotal,0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) as ConvertedAmount, "); //  6   #1  Converted
		sql.append( "currencyConvert(i.WithholdingAmt,0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) as ConvertedWithholdingAmt, "); //  6   #1  Converted
		sql.append( "currencyConvert(invoiceOpen(C_Invoice_ID,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) AS ConvertedOpen , " );  //  7   #2  Converted Open
		sql.append( "currencyConvert(invoiceDiscount(i.C_Invoice_ID,?,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) AS Discount," );              //  #3, #4
		sql.append( "i.MultiplierAP," +
				" i.c_bpartner_location_id," +
				" i.serial, " +
				"CASE WHEN i.IsSOTrx='Y' THEN '(Venta) ' || dt.name ELSE '(Compra) ' || dt.name END    AS C_DocTypeName," +
				" true AS isinvoice," +
				"pt.netdays, " +
		"cdt.codsunat" );
		sql.append( " FROM C_Invoice_v i ");		//  corrected for CM/Split
		sql.append( " INNER JOIN C_Currency c ON (i.C_Currency_ID=c.C_Currency_ID) ");
		sql.append( " LEFT OUTER JOIN C_DocType_trl dt ON i.c_doctype_id = dt.c_doctype_id ");
		sql.append( " LEFT OUTER JOIN C_Doctype cdt ON i.c_doctype_id = cdt.c_doctype_id  ");
		sql.append(" JOIN C_PaymentTerm pt on i.c_paymentterm_id = pt.c_paymentterm_id ");
		sql.append( " WHERE i.IsPaid='N' AND i.Processed='Y' ");
		sql.append(" AND i.IsSOTrx=");
		sql.append(doctype.isSOTrx() ? "'Y'" : "'N'");
		sql.append(" AND i.C_BPartner_ID=?  AND NOT EXISTS (SELECT 1 FROM C_BOELine WHERE C_Invoice_ID = i.C_Invoice_ID AND processed='N') "); 
		sql.append(" UNION ");  
		sql.append(" SELECT b.Dateboe," +
				   "b.C_Withholding_ID," +
				   "daysbetween(now(),b.Dateboe) as daysbetween," +
		"b.DocumentNo,b.C_BOE_ID, c.ISO_Code, b.GrandTotal,"); 
		sql.append(" CurrencyConvert(b.GrandTotal,0,b.C_Currency_ID,?,b.StatusDate,b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID) as ConvertedAmount,");
		sql.append(" 0 AS ConvertedWithholdingAmt,");
		sql.append(" CurrencyConvert(boeOpen(b.C_boe_ID),0,b.C_Currency_ID,?,b.StatusDate,b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID) AS ConvertedOpen,");
		sql.append(" 0 AS Discount, 1 as MultiplierAP, b.C_BPartner_Location_ID, '' as Serial, dt.name as C_DocTypeName, false AS isinvoice,0 as netdays,");
		sql.append(" dt.codsunat");
		sql.append(" from C_BOE b "); 
		sql.append(" JOIN C_Currency c ON (b.C_Currency_ID=c.C_Currency_ID) ");
		sql.append(" LEFT OUTER JOIN C_DOCTYPE DT on (b.C_Doctype_ID = dt.C_Doctype_ID) ");
		sql.append(" WHERE b.C_BPartner_ID=? AND b.docstatus = 'PD' AND b.IsSOTrx=");
		sql.append(doctype.isSOTrx() ? "'Y'" : "'N'");		

		try {
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, currency.getC_Currency_ID());
			pstmt.setInt(2, currency.getC_Currency_ID());
			pstmt.setInt(3, currency.getC_Currency_ID());
			//pstmt.setTimestamp(3, bp.getTransaction()); // fecha de pago para ver si aplica descuento
			Timestamp stamp = new Timestamp(System.currentTimeMillis());
			pstmt.setTimestamp(4, stamp);
			pstmt.setInt(5, currency.getC_Currency_ID());
			pstmt.setInt(6, partner.getC_BPartner_ID());
			// boe
			pstmt.setInt(7, currency.getC_Currency_ID());
			pstmt.setInt(8, currency.getC_Currency_ID());
			pstmt.setInt(9, partner.getC_BPartner_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				BigDecimal open = rs.getBigDecimal("ConvertedOpen");
				if (open == null)
					open = BigDecimal.ZERO;
				if (open.compareTo(Env.ZERO) != 0)
				{
					Timestamp DateInvoice = rs.getTimestamp(X_C_Invoice.COLUMNNAME_DateInvoiced);
					String Serial = rs.getString(X_C_Invoice.COLUMNNAME_Serial);
					String DocumentNo = rs.getString(X_C_Invoice.COLUMNNAME_DocumentNo);
					String codsunat = rs.getString(X_C_DocType.COLUMNNAME_CodSunat);
					Integer C_Invoice_ID = rs.getInt(X_C_Invoice.COLUMNNAME_C_Invoice_ID);
					Integer C_Withholding_ID = rs.getInt(X_C_Invoice.COLUMNNAME_C_Withholding_ID);
					BigDecimal Total = rs.getBigDecimal(X_C_Invoice.COLUMNNAME_GrandTotal);
					Integer daysbetween = rs.getInt("daysbetween");
					BigDecimal WithholdingAmt = rs.getBigDecimal("ConvertedWithholdingAmt");
					Integer netdays = rs.getInt("netdays");
					if (netdays > 0)
					{
						daysbetween = daysbetween - netdays;
						if (daysbetween < 0)
						{
							daysbetween = 0;
						}
					}
					InvoiceItem invoiceitem = new InvoiceItem();
					invoiceitem.setDateInvoice(DateInvoice);
					invoiceitem.setdaysbetween(daysbetween);
					invoiceitem.setSerial(Serial);				
					invoiceitem.setDocumentNo(DocumentNo);
					invoiceitem.setTaxID(codsunat);
					invoiceitem.setOpen(open);
					invoiceitem.setC_Withholding_ID(C_Withholding_ID);
					invoiceitem.setWithholdingAmt(WithholdingAmt);
					invoiceitem.setTotal(Total);
					invoiceitem.setC_Invoice_ID(C_Invoice_ID);
					invoiceitem.setIsInvoice(rs.getBoolean("isinvoice"));					
					m_invoices.add(invoiceitem);
				}
			}
			rs.close();
			pstmt.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		fillList(m_invoices);		
		String error = m_billExchangePanel.Load(partner);
		if (error.length() > 0)
		{
			ADialog.info(0, this, error);			
		}		
	}

	public void fillList(ArrayList<InvoiceItem> invoices) {		
		DefaultListModel model = new DefaultListModel();				
		listAllExchange.setModel(model);
		for (InvoiceItem invoice:invoices)
		{
			model.addElement(invoice);
		}		
	}

	public void valueChanged(ListSelectionEvent ev) {
		if (ev.getValueIsAdjusting())
			return;

		int selected[] = listAllExchange.getSelectedIndices();
		if (selected.length > 0)
		{
			BigDecimal total = Env.ZERO;
			DefaultListModel modelAll = (DefaultListModel) listAllExchange.getModel();
			for (int i = 0; i < selected.length; i++) {			
				//InvoiceItem invoice = invoices.get(selected[i]);
				InvoiceItem invoice = (InvoiceItem) modelAll.get(selected[i]);
				total = total.add(invoice.getOpen());
			}
			invoiceHeaderAll.setTotal(total);
		}		

	}

	public void clearSel() {
		DefaultListModel modelSel = (DefaultListModel) listSelExchange.getModel();
		while (modelSel.getSize() > 0)
		{
			modelSel.remove(0);
		}
		invoiceHeaderSel.setTotal(Env.ZERO);
	}

	private void updateSel() {
		ArrayList<InvoiceItem> invoices = new ArrayList<InvoiceItem>();
		DefaultListModel modelSel = (DefaultListModel) listSelExchange.getModel();
		BigDecimal total = Env.ZERO;
		for (int i=0;i < modelSel.getSize(); i ++)
		{
			InvoiceItem invoice = (InvoiceItem) modelSel.get(i);
			invoices.add(invoice);
			total = total.add(invoice.getOpen());
		}
		invoiceHeaderSel.setTotal(total);
		if (modelSel.getSize() > 0)
		{
			m_pickDocType.setReadWrite(false);
			m_pickPartner.setReadWrite(false);
		}
		else
		{
			m_pickDocType.setReadWrite(true);
			m_pickPartner.setReadWrite(true);			
		}
		m_billExchangePanel.setInvoices(invoices);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	public void setBillExchangePanel(BillExchangePanel billExchangePanel) {
		m_billExchangePanel = billExchangePanel;
		m_billExchangePanel.setInvoicePanel(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(mntmFecha))
		{
			DefaultListModel modelAll = (DefaultListModel) listAllExchange.getModel();
			ArrayList<InvoiceItem> invoicelist = new ArrayList<InvoiceItem>();
			for (int i=0;i < modelAll.size(); i++)
			{
				invoicelist.add((InvoiceItem) modelAll.get(i));
			}
			Collections.sort(invoicelist, new Comparator<InvoiceItem>() {
				public int compare(InvoiceItem one, InvoiceItem dos) {
					return one.compareToDate(dos);
				}
			});
			fillList(invoicelist);
		}
		else if (e.getSource().equals(mntmDocumento))
		{
			DefaultListModel modelAll = (DefaultListModel) listAllExchange.getModel();
			ArrayList<InvoiceItem> invoicelist = new ArrayList<InvoiceItem>();
			for (int i=0;i < modelAll.size(); i++)
			{
				invoicelist.add((InvoiceItem) modelAll.get(i));
			}				
			Collections.sort(invoicelist, new Comparator<InvoiceItem>() {
				public int compare(InvoiceItem one, InvoiceItem dos) {
					return one.compareDocTo(dos);
				}
			});
			fillList(invoicelist);			
		}
		else if (e.getSource().equals(mntmVencimiento))
		{
			DefaultListModel modelAll = (DefaultListModel) listAllExchange.getModel();
			ArrayList<InvoiceItem> invoicelist = new ArrayList<InvoiceItem>();
			for (int i=0;i < modelAll.size(); i++)
			{
				invoicelist.add((InvoiceItem) modelAll.get(i));
			}								
			Collections.sort(invoicelist, new Comparator<InvoiceItem>() {
				public int compare(InvoiceItem one, InvoiceItem dos) {
					return one.compareDays(dos);
				}
			});
			fillList(invoicelist);			
		}
		else if (e.getSource().equals(mntmMonto))
		{
			DefaultListModel modelAll = (DefaultListModel) listAllExchange.getModel();
			ArrayList<InvoiceItem> invoicelist = new ArrayList<InvoiceItem>();
			for (int i=0; i < modelAll.size(); i++)
			{
				invoicelist.add((InvoiceItem) modelAll.get(i));
			}
			Collections.sort(invoicelist, new Comparator<InvoiceItem>() {
				public int compare(InvoiceItem one, InvoiceItem dos) {
					return one.compareAmount(dos);
				}
			});
			fillList(invoicelist);
		}	
		else if (e.getSource().equals(mntmSeleccionar))
		{
			String error = m_billExchangePanel.isok();
			if (error.length() > 0)
			{
				ADialog.error(getWindowNo(), this, error);			
				return;
			}			
			int selected[] = listAllExchange.getSelectedIndices();				
			if (selected.length > 0)
			{					
				DefaultListModel modelAll = (DefaultListModel) listAllExchange.getModel();					
				DefaultListModel modelSel = (DefaultListModel) listSelExchange.getModel();									
				ArrayList<InvoiceItem> selInvoices = new ArrayList<InvoiceItem>();
				for (int i = 0; i < selected.length; i++) {			
					InvoiceItem invoice = (InvoiceItem) modelAll.get(selected[i]);
					selInvoices.add(invoice);
					modelSel.addElement(invoice);
				}																
				while (selInvoices.size() > 0)
				{
					InvoiceItem item = selInvoices.get(0);
					for (int i = 0; i < modelAll.getSize(); i++) {
						if (modelAll.get(i).equals(item))
						{
							modelAll.remove(i);
							selInvoices.remove(item);
							break;
						}								
					}											
				}
				updateSel();
			}						
		}		
		//
		else if (e.getSource().equals(mntmDeseleccionar))
		{			
			int selected[] = listSelExchange.getSelectedIndices();				
			if (selected.length > 0)
			{					
				DefaultListModel modelAll = (DefaultListModel) listAllExchange.getModel();					
				DefaultListModel modelSel = (DefaultListModel) listSelExchange.getModel();									
				ArrayList<InvoiceItem> unselInvoices = new ArrayList<InvoiceItem>();
				for (int i = 0; i < selected.length; i++) {			
					InvoiceItem invoice = (InvoiceItem) modelSel.get(selected[i]);
					unselInvoices.add(invoice);
					modelAll.addElement(invoice);
				}		
				while (unselInvoices.size() > 0)
				{
					InvoiceItem item = unselInvoices.get(0);
					for (int i = 0; i < modelSel.getSize(); i++) {
						if (modelSel.get(i).equals(item))
						{
							modelSel.remove(i);
							unselInvoices.remove(item);
							break;
						}								
					}											
				}
				updateSel();
			}				
		}			
	}

	public void setDocType(VLookup pickDocType) {
		m_pickDocType = pickDocType;
		m_pickDocType.addVetoableChangeListener(this);
		
	}

	public void setBPartner(VLookup pickPartner) {
		m_pickPartner = pickPartner;
		m_pickPartner.addVetoableChangeListener(this);
	}
	
	public void setCurrency(VLookup pickCurrency) {
		m_pickCurrency = pickCurrency;
		m_pickCurrency.addVetoableChangeListener(this);
	}
	
	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {
		String name = e.getPropertyName();
		Object value = e.getNewValue();		
		if (value == null)
			return;

		if (name.equals("C_BPartner_ID"))
			partner = MBPartner.get(Env.getCtx(), (Integer) value);
		else if (name.equals("C_DocType_ID"))
		{
			Integer C_DocType_ID = (Integer) value;
			doctype = MDocType.get(Env.getCtx(), C_DocType_ID);
			m_billExchangePanel.setDocType(doctype);
		}
		else if (name.equals("I_C_Currency_ID"))
		{
			currency = MCurrency.get(Env.getCtx(),(Integer) value);
		}
		//				
	}

	public void setWindowNo(int windowNo) {
		m_WindowNo = windowNo;		
	}
	public int getWindowNo() {
		return m_WindowNo;
	}
}