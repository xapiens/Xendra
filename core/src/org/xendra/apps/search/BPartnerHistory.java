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
package org.xendra.apps.search;

import java.awt.*;
import java.awt.event.*;
import java.math.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import java.util.logging.*;

import org.apache.ecs.xhtml.option;
import org.compiere.apps.*;
import org.compiere.minigrid.*;
import org.compiere.swing.*;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.util.*;


/**
 *	Partner History 
 *
 *  @author xapiens
 *  @version  $Id: BPartnerHistory.java 508 2010-06-01 23:06:53Z xapiens $
 */
public class BPartnerHistory extends CDialog
	implements ActionListener, ChangeListener
{
	/**
	 *	Show Partner History
	 *	@param C_BPartner_ID partner
	 */
	public BPartnerHistory (Dialog frame, 
		int C_BPartner_ID )
	{
		super(frame, Msg.getMsg(Env.getCtx(), "History"), true);
		log.config("C_BPartner_ID=" + C_BPartner_ID);
		m_C_BPartner_ID = C_BPartner_ID;
		try
		{
			jbInit();
			dynInit();
		}
		catch(Exception ex)
		{
			log.log(Level.SEVERE, "", ex);
		}
		mainPanel.setPreferredSize(new Dimension(700,400));
		AEnv.positionCenterWindow(frame, this);
	}	//	InvoiceHistory

	private int		m_C_BPartner_ID;
	private BigDecimal m_Total = Env.ZERO;
	
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(BPartnerHistory.class);

	private CPanel 			mainPanel = new CPanel();
	private BorderLayout 	mainLayout = new BorderLayout();
	private CPanel 			northPanel = new CPanel();
	private JLabel 			label = new JLabel();
	private FlowLayout 		northLayout = new FlowLayout();
	//
	private ConfirmPanel 	confirmPanel = new ConfirmPanel();
	private JTabbedPane 	centerTabbedPane = new JTabbedPane();
	//
	private JScrollPane         salesPane = new JScrollPane();
	private MiniTable           m_tableSales = new MiniTable();
	private DefaultTableModel   m_modelSales = null;
	
	private JScrollPane 		pricePane = new JScrollPane();
	private MiniTable 			m_tablePrice = new MiniTable();
	private DefaultTableModel 	m_modelPrice = null;
	
	private JScrollPane 		reservedPane = new JScrollPane();
	private MiniTable 			m_tableReserved = new MiniTable();
	private DefaultTableModel 	m_modelReserved = null;
	
	private JScrollPane 		orderedPane = new JScrollPane();
	private MiniTable 			m_tableOrdered = new MiniTable();
	private DefaultTableModel 	m_modelOrdered = null;
	
	private JScrollPane 		unconfirmedPane = new JScrollPane();
	private MiniTable 			m_tableUnconfirmed = new MiniTable();
	private DefaultTableModel 	m_modelUnconfirmed = null;
	//private MLookup lookupInvoice;
	private MLookup lookupstatus;
	Object[] m_status;
	//Object[] m_BOEstatus;
	
	/**
	 *	Ststic Init
	 */
	void jbInit() throws Exception
	{
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		mainPanel.setLayout(mainLayout);
		label.setText("Label");
		northPanel.setLayout(northLayout);
		northLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(mainPanel);
		mainPanel.add(northPanel, BorderLayout.NORTH);
		northPanel.add(label, null);
		mainPanel.add(confirmPanel, BorderLayout.SOUTH);
		mainPanel.add(centerTabbedPane, BorderLayout.CENTER);
		centerTabbedPane.addChangeListener(this);
		centerTabbedPane.add(salesPane, Msg.getMsg(Env.getCtx(), "History"));
		centerTabbedPane.add(pricePane,   Msg.getMsg(Env.getCtx(), "PriceHistory"));
		centerTabbedPane.add(reservedPane, Msg.translate(Env.getCtx(), "QtyReserved"));
		centerTabbedPane.add(orderedPane, Msg.translate(Env.getCtx(), "QtyOrdered"));
		centerTabbedPane.add(unconfirmedPane, Msg.getMsg(Env.getCtx(), "QtyUnconfirmed"));
		//
		salesPane.getViewport().add(m_tableSales, null);
		pricePane.getViewport().add(m_tablePrice, null);
		reservedPane.getViewport().add(m_tableReserved, null);
		orderedPane.getViewport().add(m_tableOrdered, null);
		unconfirmedPane.getViewport().add(m_tableUnconfirmed, null);
		//
		confirmPanel.addActionListener(this);
	}	//	jbInit

	/**
	 *	Dynamic Init for Price Tab
	 */
	private boolean dynInit()
	{
		//
		int AD_Column_ID = Util.getColumnID(MInvoice.Table_ID,"DocStatus");	//	C_Order.C_PaymentTerm_ID
		lookupstatus = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, DisplayType.List);
		m_status = lookupstatus.getData (true, true, true, false)
		.toArray();    //  if r/o also inactive

		//String sql = "SELECT Name from C_BPartner WHERE C_BPartner_ID=?";
		//fillLabel (sql, m_C_BPartner_ID);

		Vector<String> columnNames = new Vector<String>();
		//columnNames.add(Msg.getMsg(Env.getCtx(), "Select"));
		columnNames.add(Msg.translate(Env.getCtx(), "Date"));
		columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "Documento")));
		columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "Serie")));
		columnNames.add(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
		columnNames.add(Msg.translate(Env.getCtx(), "C_Currency_ID"));
		columnNames.add(Msg.translate(Env.getCtx(), "Amount"));
		columnNames.add(Msg.getMsg(Env.getCtx(), "ConvertedAmount"));
		columnNames.add(Msg.getMsg(Env.getCtx(), "OpenAmt"));
		columnNames.add(Msg.translate(Env.getCtx(), "DocStatus"));
		columnNames.add(Msg.translate(Env.getCtx(), "C_Bank_ID"));
		columnNames.add(Msg.translate(Env.getCtx(), "C_BankAccount_ID"));
		columnNames.add(Msg.translate(Env.getCtx(), "C_Invoice_ID"));

		//	Fill Data
		Vector<Vector<Object>> data = null;
		data = fillsales();		//	Sales of BPartner

		String sql = "SELECT Name from C_BPartner WHERE C_BPartner_ID=?";
		fillLabel (sql, m_C_BPartner_ID);
		
		//  Table
		m_modelSales = new DefaultTableModel(data, columnNames);
		m_tableSales.setModel(m_modelSales);
		//  Set Model
		//
		int i = 0;
		//m_tableSales.setColumnClass(i++, Boolean.class, false);         //  0-Selection
		m_tableSales.setColumnClass(i++, Timestamp.class, true);        //  1-TrxDate
		m_tableSales.setColumnClass(i++, String.class, true);           //  2-Document Type
		m_tableSales.setColumnClass(i++, String.class, true);           //  3-Document serial
		m_tableSales.setColumnClass(i++, String.class, true);           //  4-Document No
		m_tableSales.setColumnClass(i++, String.class, true);           //  5-ISO Currency
		m_tableSales.setColumnClass(i++, BigDecimal.class, true);       //  6-Amount
		m_tableSales.setColumnClass(i++, BigDecimal.class, true);       //  7-ConvAmt
		m_tableSales.setColumnClass(i++, BigDecimal.class, true);       //  8-ConvAmt Open
		m_tableSales.setColumnClass(i++, String.class, true);           //  9-DocStatus
		m_tableSales.setColumnClass(i++, String.class, true);           // 10-Bank Name
		m_tableSales.setColumnClass(i++, String.class, true);           // 11-account No.
		m_tableSales.setColumnClass(i++, Boolean.class, true);          // 12-Is Invoice
		m_tableSales.autoSize();
		
		return data.size() != 0;
	}	//	dynInit


	/**
	 *	Get Info for Product for given Business Parner
	 */
	private Vector<Vector<Object>> queryProduct ()
	{
		String sql = "SELECT p.Name,l.PriceActual,l.PriceList,l.QtyInvoiced,"
			+ "i.DateInvoiced,dt.PrintName || ' ' || i.DocumentNo As DocumentNo,"
			+ "o.Name "
			+ "FROM C_Invoice i"
			+ " INNER JOIN C_InvoiceLine l ON (i.C_Invoice_ID=l.C_Invoice_ID)"
			+ " INNER JOIN C_DocType dt ON (i.C_DocType_ID=dt.C_DocType_ID)"
			+ " INNER JOIN AD_Org o ON (i.AD_Org_ID=o.AD_Org_ID)"
			+ " INNER JOIN M_Product p  ON (l.M_Product_ID=p.M_Product_ID) "
			+ "WHERE i.C_BPartner_ID=? "
			+ "ORDER BY i.DateInvoiced DESC";

		Vector<Vector<Object>> data = fillTable (sql, m_C_BPartner_ID);
		return data;
	}   //  queryProduct

	private String getStatus(String status)
	{
		String name = "";
		int size = m_status.length;
		String key = null;
		boolean lcontinue = true;
		int i = 0;
		//for (int i = 0; i < size; i++)
		while ( (i < size) && lcontinue )
		{
			ValueNamePair p = (ValueNamePair) m_status[i];
			key = String.valueOf(p.getID());
			if (status.equals(key))
			{
				name = p.getName();
				lcontinue = false;
			}
			i++;
		}		
		return name;
	}

	private Vector<Vector<Object>> fillsales()
	{
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		
		Integer m_C_AcctSchema_ID = Env.getContextAsInt(Env.getCtx(), "$C_AcctSchema_ID");
		MAcctSchema s_AcctSchema = new MAcctSchema (Env.getCtx(), m_C_AcctSchema_ID, null);		
		Integer m_C_Currency_ID = s_AcctSchema.getC_Currency_ID();   //  default
		


		StringBuffer sql = new StringBuffer("SELECT i.DateInvoiced,i.DocumentNo,i.C_Invoice_ID,")//  1..3
		.append("c.ISO_Code,i.GrandTotal, ")                            //  4..5    Orig Currency
		.append("currencyConvert(i.GrandTotal,0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) as ConvertedAmount, ") //  6   #1  Converted
		.append("currencyConvert(invoiceOpen(C_Invoice_ID,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) AS ConvertedOpen , ")  //  7   #2  Converted Open
		.append("currencyConvert(invoiceDiscount(i.C_Invoice_ID,?,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) AS Discount,") //  #3, #4
		.append("i.MultiplierAP, i.c_bpartner_location_id, i.serial, ")
	    .append("CASE WHEN EXISTS (SELECT 1 FROM C_BOELine WHERE C_Invoice_ID = i.C_Invoice_ID ) then 'LETRA REF: ' || (SELECT b.documentno from c_boe b where b.c_boe_id=(SELECT MAX(c_boe_id) FROM C_BOELine WHERE C_Invoice_ID = i.C_Invoice_ID)) || ' ' ELSE '' END || dt.name AS C_DocTypeName")
		.append(",i.DocStatus, '' AS bankname, '' AS accountno, true AS isinvoice")
		.append(" FROM C_Invoice_v i ")		//  corrected for CM/Split
		.append(" JOIN C_Currency c ON (i.C_Currency_ID=c.C_Currency_ID) ")
		.append(" LEFT OUTER JOIN C_DocType_trl dt ON i.c_doctype_id = dt.c_doctype_id ")
	
		.append(" WHERE i.C_BPartner_ID=? ") 

		.append(" UNION ")  
		.append(" SELECT b.Dateboe,b.DocumentNo,b.C_BOE_ID, c.ISO_Code, b.GrandTotal,")
		.append(" CurrencyConvert(b.GrandTotal,0,b.C_Currency_ID,?,b.StatusDate,b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID) as ConvertedAmount,")
		.append(" CASE WHEN b.isrenewed='Y' THEN 0 ELSE CurrencyConvert(boeOpen(b.C_boe_ID),0,b.C_Currency_ID,?,b.StatusDate,b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID) END AS ConvertedOpen,")
		.append(" 0 AS Discount, 1 as MultiplierAP, b.C_BPartner_Location_ID, '' as Serial,")
		.append(" CASE WHEN b.isrenewed='Y' then '(RENOVADA) ' ELSE '' END || dt.name as C_DocTypeName" )
		.append(",b.DocStatus, bank.name, ba.accountno, false AS isinvoice")
		.append(" from C_BOE b ")
		.append(" JOIN C_Currency c ON (b.C_Currency_ID=c.C_Currency_ID) ")
		.append(" LEFT OUTER JOIN C_DOCTYPE DT on (b.C_Doctype_ID = dt.C_Doctype_ID) ")
		.append(" LEFT OUTER JOIN c_bankaccount ba ON b.c_bankaccount_id = ba.c_bankaccount_id ")
		.append(" LEFT OUTER JOIN c_bank bank ON ba.c_bank_id = bank.c_bank_id ")
		.append(" WHERE b.C_BPartner_ID=? ");
		log.fine("InvSQL=" + sql.toString());		
		
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, m_C_Currency_ID);
			pstmt.setInt(2, m_C_Currency_ID);
			pstmt.setTimestamp(3, (Timestamp) Env.getContextAsDate(Env.getCtx(), "#Date")); // fecha de pago para ver si aplica descuento
			pstmt.setInt(4, m_C_Currency_ID);
			pstmt.setInt(5, m_C_BPartner_ID);
			// boe
			pstmt.setInt(6, m_C_Currency_ID);
			pstmt.setInt(7, m_C_Currency_ID);
			pstmt.setInt(8, m_C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				//m_C_BPartner_Location_ID = rs.getInt("C_BPartner_Location_ID");
				Vector<Object> line = new Vector<Object>();
				//line.add(new Boolean(false));       //  0-Selection
				line.add(rs.getTimestamp("DateInvoiced"));       //  1-TrxDate
				line.add(rs.getString("C_DocTypeName")); // 2-Doctype Name
				line.add(rs.getString("Serial")); // 3-serial Document
				KeyNamePair pp = new KeyNamePair(rs.getInt(3), rs.getString(2));
				line.add(pp);                       //  4-Value
				line.add(rs.getString("ISO_Code"));          //  5-ISO Code -- new 
				line.add(rs.getBigDecimal("GrandTotal"));      //  6-Amount
				line.add(rs.getBigDecimal("ConvertedAmount"));      //  7-ConvertedAmount
				BigDecimal open = rs.getBigDecimal("ConvertedOpen");
				if (open == null)		//	no conversion rate
					open = Env.ZERO;
				line.add(open);      				//  8-OpenAmt 
				BigDecimal discount = rs.getBigDecimal("Discount");
				if (discount == null)	//	no concersion rate
					discount = Env.ZERO;
				boolean IsInvoice = rs.getBoolean("IsInvoice");
				line.add(getStatus(rs.getString("DocStatus")));                       //  4-Value
				line.add(rs.getString("bankname"));
				line.add(rs.getString("accountno"));
				line.add(IsInvoice); // 10 - Is Invoiced
				m_Total = m_Total.add(open);
				data.add(line);
				
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}		
		return data;
	}
	/**
	 *	Fill Table
	 */
	private Vector<Vector<Object>> fillTable (String sql, int parameter)
	{
		log.fine(sql + "; Parameter=" + parameter);
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, parameter);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				Vector<Object> line = new Vector<Object>(6);
				//	0-Name, 1-PriceActual, 2-QtyInvoiced, 3-Discount, 4-DocumentNo, 5-DateInvoiced
				line.add(rs.getString(1));      //  Name
				line.add(rs.getBigDecimal(2));  //	Price
				line.add(new Double(rs.getDouble(4)));      //  Qty
				BigDecimal discountBD = Env.ZERO;
				try //  discoint can be indefinate
				{
					double discountD = (rs.getDouble(3)-rs.getDouble(2)) / rs.getDouble(3) * 100;
					discountBD = new BigDecimal(discountD);
				}
				catch (Exception e)
				{
					discountBD = Env.ZERO;
				}
				line.add(discountBD);           //  Discount
				line.add(rs.getString(6));      //  DocNo
				line.add(rs.getTimestamp(5));   //  Date
				line.add(rs.getString(7));		//	Org/Warehouse
				data.add(line);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		log.fine("#" + data.size());
		return data;
	}	//	fillTable

	/**
	 *	Set Label
	 *  to product or bp name
	 */
	private void fillLabel (String sql, int parameter)
	{
		log.fine(sql + "; Parameter=" + parameter);
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, parameter);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				label.setText( rs.getString(1) + "  " + format.format(m_Total) + " ");		
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
		}
	}	//	fillLabel


	/**
	 *	Action Listener
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals(ConfirmPanel.A_OK))
			dispose();
	}	//	actionPerformed


	/**
	 * 	Tab Changed
	 * 	@param e event
	 */
	public void stateChanged(ChangeEvent e)
	{
		if (centerTabbedPane.getSelectedIndex() == 1)
			initPriceHistory();
		else if (centerTabbedPane.getSelectedIndex() == 2)
			initReservedOrderedTab(true);
		else if (centerTabbedPane.getSelectedIndex() == 3)
			initReservedOrderedTab(false);
		else if (centerTabbedPane.getSelectedIndex() == 4)
			initUnconfirmedTab();
	}	//	stateChanged

	private void initPriceHistory()
	{
		//	Header
		Vector<String> columnNames = new Vector<String>();
		columnNames.add(Msg.translate(Env.getCtx(), "M_Product_ID"));
		columnNames.add(Msg.translate(Env.getCtx(), "PriceActual"));
		columnNames.add(Msg.translate(Env.getCtx(), "QtyInvoiced"));
		columnNames.add(Msg.translate(Env.getCtx(), "Discount"));
		columnNames.add(Msg.translate(Env.getCtx(), "DocumentNo"));
		columnNames.add(Msg.translate(Env.getCtx(), "DateInvoiced"));
		columnNames.add(Msg.translate(Env.getCtx(), "AD_Org_ID"));

		//	Fill Data
		Vector<Vector<Object>> data = null;
		data = queryProduct();		//	Product of BPartner

		//  Table
		m_modelPrice = new DefaultTableModel(data, columnNames);
		m_tablePrice.setModel(m_modelPrice);
		//
		m_tablePrice.setColumnClass(0, String.class, true);      //  Product/Partner
		m_tablePrice.setColumnClass(1, Double.class, true);  	 //  Price
		m_tablePrice.setColumnClass(2, Double.class, true);      //  Quantity
		m_tablePrice.setColumnClass(3, BigDecimal.class, true);  //  Discount (%) to limit precision
		m_tablePrice.setColumnClass(4, String.class, true);      //  DocNo
		m_tablePrice.setColumnClass(5, Timestamp.class, true);   //  Date
		m_tablePrice.setColumnClass(6, String.class, true);   	 //  Org
		//
		m_tablePrice.autoSize();
		//		
	}
	/**
	 *	Query Reserved/Ordered
	 *	@param reserved po/so
	 */
	private void initReservedOrderedTab (boolean reserved)
	{
		//	Done already
		if (reserved && m_modelReserved != null)
			return;
		if (!reserved && m_modelOrdered != null)
			return;
			
		//	Header
		Vector<String> columnNames = new Vector<String>();
		columnNames.add(Msg.translate(Env.getCtx(), "M_Product_ID"));
		columnNames.add(Msg.translate(Env.getCtx(), "PriceActual"));
		columnNames.add(Msg.translate(Env.getCtx(), reserved ? "QtyReserved" : "QtyOrdered"));
		columnNames.add(Msg.translate(Env.getCtx(), "Discount"));
		columnNames.add(Msg.translate(Env.getCtx(), "DocumentNo"));
		columnNames.add(Msg.translate(Env.getCtx(), "DateOrdered"));
		columnNames.add(Msg.translate(Env.getCtx(), "M_Warehouse_ID"));

		//	Fill Data
		Vector<Vector<Object>> data = null;
		
		String sql = "SELECT p.Name, ol.PriceActual,ol.PriceList,ol.QtyReserved,"
			+ "o.DateOrdered,dt.PrintName || ' ' || o.DocumentNo As DocumentNo, " 
			+ "w.Name "
			+ "FROM C_Order o"
			+ " INNER JOIN C_OrderLine ol ON (o.C_Order_ID=ol.C_Order_ID)"
			+ " INNER JOIN C_DocType dt ON (o.C_DocType_ID=dt.C_DocType_ID)"
			+ " INNER JOIN M_Warehouse w ON (ol.M_Warehouse_ID=w.M_Warehouse_ID)"
			+ " INNER JOIN M_Product p  ON (ol.M_Product_ID=p.M_Product_ID) "
			+ "WHERE ol.QtyReserved<>0"
			+ " AND o.C_BPartner_ID=?"
			+ " AND o.IsSOTrx=" + (reserved ? "'Y'" : "'N'")
			+ " ORDER BY o.DateOrdered";
		data = fillTable (sql, m_C_BPartner_ID);//	Product of BP
//		}

		//  Table
		MiniTable table = null;
		if (reserved)
		{
			m_modelReserved = new DefaultTableModel(data, columnNames); 
			m_tableReserved.setModel(m_modelReserved);
			table = m_tableReserved;
		}
		else
		{
			m_modelOrdered = new DefaultTableModel(data, columnNames); 
			m_tableOrdered.setModel(m_modelOrdered);
			table = m_tableOrdered;
		}
		//
		table.setColumnClass(0, String.class, true);      //  Product/Partner
		table.setColumnClass(1, BigDecimal.class, true);  //  Price
		table.setColumnClass(2, Double.class, true);      //  Quantity
		table.setColumnClass(3, BigDecimal.class, true);  //  Discount (%)
		table.setColumnClass(4, String.class, true);      //  DocNo
		table.setColumnClass(5, Timestamp.class, true);   //  Date
		table.setColumnClass(6, String.class, true);   	  //  Warehouse
		//
		table.autoSize();
	}	//	initReservedOrderedTab

	
	/**
	 *	Query Unconfirmed
	 */
	private void initUnconfirmedTab ()
	{
		//	Done already
		if (m_modelUnconfirmed != null)
			return;
			
		//	Header
		Vector<String> columnNames = new Vector<String>();
		columnNames.add(Msg.translate(Env.getCtx(), m_C_BPartner_ID == 0 ? "C_BPartner_ID" : "M_Product_ID"));
		columnNames.add(Msg.translate(Env.getCtx(), "MovementQty"));
		columnNames.add(Msg.translate(Env.getCtx(), "MovementDate"));
		columnNames.add(Msg.translate(Env.getCtx(), "IsSOTrx"));
		columnNames.add(Msg.translate(Env.getCtx(), "DocumentNo"));
		columnNames.add(Msg.translate(Env.getCtx(), "M_Warehouse_ID"));

		//	Fill Data
		String sql = null;
		int parameter = 0;
		sql = "SELECT p.Name,"
			+ " CASE WHEN io.IsSOTrx='Y' THEN iol.MovementQty*-1 ELSE iol.MovementQty END AS MovementQty,"
			+ " io.MovementDate,io.IsSOTrx,"
			+ " dt.PrintName || ' ' || io.DocumentNo As DocumentNo,"
			+ " w.Name "
			+ "FROM M_InOutLine iol"
			+ " INNER JOIN M_InOut io ON (iol.M_InOut_ID=io.M_InOut_ID)"
			+ " INNER JOIN M_Product p  ON (iol.M_Product_ID=p.M_Product_ID)"
			+ " INNER JOIN C_DocType dt ON (io.C_DocType_ID=dt.C_DocType_ID)"
			+ " INNER JOIN M_Warehouse w ON (io.M_Warehouse_ID=w.M_Warehouse_ID)"
			+ " INNER JOIN M_InOutLineConfirm lc ON (iol.M_InOutLine_ID=lc.M_InOutLine_ID) "
			+ "WHERE io.C_BPartner_ID=?"
			+ " AND lc.Processed='N' "
			+ "ORDER BY io.MovementDate,io.IsSOTrx";
		parameter = m_C_BPartner_ID;
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, parameter);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				Vector<Object> line = new Vector<Object>(6);
				//	1-Name, 2-MovementQty, 3-MovementDate, 4-IsSOTrx, 5-DocumentNo
				line.add(rs.getString(1));      		//  Name
				line.add(new Double(rs.getDouble(2)));  //  Qty
				line.add(rs.getTimestamp(3));   		//  Date
				line.add(new Boolean("Y".equals(rs.getString(4))));	//  IsSOTrx
				line.add(rs.getString(5));				//  DocNo
				line.add(rs.getString(6));				//  Warehouse
				data.add(line);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		log.fine("#" + data.size());

		//  Table
		m_modelUnconfirmed = new DefaultTableModel(data, columnNames); 
		m_tableUnconfirmed.setModel(m_modelUnconfirmed);
		MiniTable table = m_tableUnconfirmed;
		//
		table.setColumnClass(0, String.class, true);      //  Product/Partner
		table.setColumnClass(1, Double.class, true);  	  //  MovementQty
		table.setColumnClass(2, Timestamp.class, true);   //  MovementDate
		table.setColumnClass(3, Boolean.class, true);  	  //  IsSOTrx
		table.setColumnClass(4, String.class, true);      //  DocNo
		//
		table.autoSize();
	}	//	initUnconfirmedTab	
}	//	InvoiceHistory
