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
package org.compiere.apps.search;

import java.awt.*;
import java.math.*;
import java.sql.*;
import java.util.*;

import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.*;
import org.compiere.grid.ed.*;
import org.compiere.minigrid.*;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MQuery;
import org.compiere.plaf.*;
import org.compiere.swing.*;
import org.compiere.util.*;

/**
 *  Info Invoice
 *
 *  @author Jorg Janke
 *  @version  $Id: InfoInvoice.java 5216 2014-02-01 00:40:07Z xapiens $
 */
public class InfoInvoice extends Info
{
	/**
	 *  Detail Protected Contructor
	 *
	 *  @param frame parent frame
	 *  @param modal modal
	 *  @param WindowNo window no
	 *  @param value query value
	 *  @param multiSelection multiple selections
	 *  @param whereClause where clause
	 */
	public InfoInvoice(Frame frame, boolean modal, int WindowNo, String value,
		boolean multiSelection, String whereClause)
	{
		super (frame, modal, WindowNo, "i", "C_Invoice_ID", multiSelection, whereClause);
		setTitle(Msg.getMsg(Env.getCtx(), "InfoInvoice"));
		//
		try
		{
			statInit();
			p_loadedOK = initInfo ();
		}
		catch (Exception e)
		{
			return;
		}
		//
		int no = p_table.getRowCount();
		setStatusLine(Integer.toString(no) + " " + Msg.getMsg(Env.getCtx(), "SearchRows_EnterQuery"), false);
		setStatusDB(Integer.toString(no));
		if (value != null && value.length() > 0)
		{
			fDocumentNo.setValue(value);
			executeQuery();
		}
		//
		pack();
		//	Focus
		fDocumentNo.requestFocus();
	}   //  InfoInvoice

	/**  String Array of Column Info    */
	private Info_Column[] m_generalLayout;
	/** list of query columns           */
	private ArrayList 	m_queryColumns = new ArrayList();
	/** Table Name              */
	private String      m_tableName;
	/** Key Column Name         */
	private String      m_keyColumn;

	//  Static Info
	private CLabel lDocumentNo = new CLabel(Msg.translate(Env.getCtx(), "DocumentNo"));
	private CTextField fDocumentNo = new CTextField(10);
	private CLabel lDescription = new CLabel(Msg.translate(Env.getCtx(), "Description"));
	private CTextField fDescription = new CTextField(10);
	//
	private CLabel lOrg_ID = new CLabel(Msg.translate(Env.getCtx(), "AD_Org_ID"));
	private VLookup fOrg_ID;
	private CLabel lBPartner_ID = new CLabel(Msg.translate(Env.getCtx(), "BPartner"));
	private VLookup fBPartner_ID;
	private CLabel lOrder_ID = new CLabel(Msg.translate(Env.getCtx(), "C_Order_ID"));
	private VLookup fOrder_ID;
	private VCheckBox fIsPaid = new VCheckBox ("IsPaid", false, false, true, Msg.translate(Env.getCtx(), "IsPaid"), "", false);
	private VCheckBox fIsSOTrx = new VCheckBox ("IsSOTrx", false, false, true, Msg.translate(Env.getCtx(), "IsSOTrx"), "", false);
	private VCheckBox fIsCash = new VCheckBox ("IsCash", false, false, true, Msg.translate(Env.getCtx(), "IsCash"), "", false);
	//
	private CLabel lDateFrom = new CLabel(Msg.translate(Env.getCtx(), "DateInvoiced"));
	private VDate fDateFrom = new VDate("DateFrom", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "DateFrom"));
	private CLabel lDateTo = new CLabel("-");
	private VDate fDateTo = new VDate("DateTo", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "DateTo"));
	private CLabel lAmtFrom = new CLabel(Msg.translate(Env.getCtx(), "GrandTotal"));
	private VNumber fAmtFrom = new VNumber("AmtFrom", false, false, true, DisplayType.Amount, Msg.translate(Env.getCtx(), "AmtFrom"));
	private CLabel lAmtTo = new CLabel("-");
	private VNumber fAmtTo = new VNumber("AmtTo", false, false, true, DisplayType.Amount, Msg.translate(Env.getCtx(), "AmtTo"));
	private CLabel lDocType = new CLabel(Msg.translate(Env.getCtx(), "C_DocType_ID"));
	private VLookup fDocType;
	
	/**  Array of Column Info    */
	private static final Info_Column[] s_invoiceLayout = {
		new Info_Column(" ", "i.C_Invoice_ID", IDColumn.class),
		new Info_Column(Msg.translate(Env.getCtx(), "C_BPartner_ID"), "(SELECT Name FROM C_BPartner bp WHERE bp.C_BPartner_ID=i.C_BPartner_ID)", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "DateInvoiced"), "i.DateInvoiced", Timestamp.class),
		new Info_Column(Msg.translate(Env.getCtx(), "M_PriceList_ID"), "(SELECT Name FROM M_PriceList pl WHERE pl.M_PriceList_ID=i.m_PriceList_ID)", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "C_DocType_ID"), "(SELECT Name FROM C_DocType dt WHERE dt.C_DocType_ID=i.C_DocType_ID)", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "Serial"), "i.Serial", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "DocumentNo"), "i.DocumentNo", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "C_Currency_ID"), "(SELECT ISO_Code FROM C_Currency c WHERE c.C_Currency_ID=i.C_Currency_ID)", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "GrandTotal"), "i.GrandTotal",  BigDecimal.class),
		new Info_Column(Msg.translate(Env.getCtx(), "ConvertedAmount"), "currencyBase(i.GrandTotal, i.C_Currency_ID, i.DateAcct, i.AD_Client_ID, i.AD_Org_ID)", BigDecimal.class),
		new Info_Column(Msg.translate(Env.getCtx(), "OpenAmt"), "invoiceOpen(C_Invoice_ID,C_InvoicePaySchedule_ID)", BigDecimal.class, true, true, null),
		new Info_Column(Msg.translate(Env.getCtx(), "IsPaid"), "i.IsPaid", Boolean.class),
		new Info_Column(Msg.translate(Env.getCtx(), "IsSOTrx"), "i.IsSOTrx", Boolean.class),		
		new Info_Column(Msg.translate(Env.getCtx(), "DocStatus"), "getreferencevalue('_Document Status',i.DocStatus)", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "Description"), "i.Description", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "POReference"), "i.POReference", String.class),		
		new Info_Column("", "''", KeyNamePair.class, "i.C_InvoicePaySchedule_ID"),
		//new Info_Column(Msg.translate(Env.getCtx(), "M_Warehouse_ID"), "(select Name from M_Warehouse where M_Warehouse_ID = (select m_warehouse_id from m_inout io where io.C_Invoice_ID = i.C_Invoice_ID))", String.class)
	};
	private static int INDEX_PAYSCHEDULE = s_invoiceLayout.length - 1;	//	last item

	/**
	 *	Static Setup - add fields to parameterPanel
	 *	@throws Exception
	 */
	private void statInit() throws Exception
	{
		lDocumentNo.setLabelFor(fDocumentNo);
		fDocumentNo.setBackground(XendraPLAF.getInfoBackground());
		fDocumentNo.addActionListener(this);
		lDescription.setLabelFor(fDescription);
		fDescription.setBackground(XendraPLAF.getInfoBackground());
		fDescription.addActionListener(this);
	//	lPOReference.setLabelFor(lPOReference);
	//	fPOReference.setBackground(XendraPLAF.getInfoBackground());
	//	fPOReference.addActionListener(this);
		fIsPaid.setSelected(false);
		fIsPaid.addActionListener(this);
		fIsSOTrx.setSelected(!"N".equals(Env.getContext(Env.getCtx(), p_WindowNo, "IsSOTrx")));
		fIsSOTrx.addActionListener(this);
		fIsCash.setSelected(true);
		fIsCash.addActionListener(this);
		//
		int AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, "AD_Org_ID");
		fOrg_ID = new VLookup("AD_Org_ID", false, false, true,
			MLookupFactory.get(Env.getCtx(), p_WindowNo, 0, AD_Column_ID, DisplayType.TableDir));
		lOrg_ID.setLabelFor(fOrg_ID);
		fOrg_ID.setBackground(XendraPLAF.getInfoBackground());
		// C_Invoice.C_DocType_ID
		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, "C_DocType_ID");
		fDocType = new VLookup("C_DocType_ID", false, false, true,
			MLookupFactory.get(Env.getCtx(), p_WindowNo, 0, AD_Column_ID, DisplayType.Search));
		lDocType.setLabelFor(fDocType);
		fDocType.setBackground(XendraPLAF.getInfoBackground());
		//	C_Invoice.C_BPartner_ID
		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, "C_BPartner_ID");
		fBPartner_ID = new VLookup("C_BPartner_ID", false, false, true,
			MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, AD_Column_ID, DisplayType.Search));
		lBPartner_ID.setLabelFor(fBPartner_ID);
		fBPartner_ID.setBackground(XendraPLAF.getInfoBackground());
		//	C_Invoice.C_Order_ID
		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, "C_Order_ID");
		fOrder_ID = new VLookup("C_Order_ID", false, false, true,
			MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, AD_Column_ID, DisplayType.Search));
		lOrder_ID.setLabelFor(fOrder_ID);
		fOrder_ID.setBackground(XendraPLAF.getInfoBackground());
		//
		lDateFrom.setLabelFor(fDateFrom);
		fDateFrom.setBackground(XendraPLAF.getInfoBackground());
		fDateFrom.setToolTipText(Msg.translate(Env.getCtx(), "DateFrom"));
		lDateTo.setLabelFor(fDateTo);
		fDateTo.setBackground(XendraPLAF.getInfoBackground());
		fDateTo.setToolTipText(Msg.translate(Env.getCtx(), "DateTo"));
		lAmtFrom.setLabelFor(fAmtFrom);
		fAmtFrom.setBackground(XendraPLAF.getInfoBackground());
		fAmtFrom.setToolTipText(Msg.translate(Env.getCtx(), "AmtFrom"));
		lAmtTo.setLabelFor(fAmtTo);
		fAmtTo.setBackground(XendraPLAF.getInfoBackground());
		fAmtTo.setToolTipText(Msg.translate(Env.getCtx(), "AmtTo"));
		//
		parameterPanel.setLayout(new ALayout());
		//  First Row
		parameterPanel.add(lDocumentNo, new ALayoutConstraint(0,0));
		parameterPanel.add(fDocumentNo, null);
		parameterPanel.add(lBPartner_ID, null);
		parameterPanel.add(fBPartner_ID, null);
		parameterPanel.add(fIsSOTrx, new ALayoutConstraint(0,5));
		parameterPanel.add(fIsPaid, null);
		parameterPanel.add(fIsCash, null);
		//  2nd Row
		parameterPanel.add(lDescription, new ALayoutConstraint(1,0));
		parameterPanel.add(fDescription, null);
		parameterPanel.add(lDateFrom, null);
		parameterPanel.add(fDateFrom, null);
		parameterPanel.add(lDateTo, null);
		parameterPanel.add(fDateTo, null);
		parameterPanel.add(lOrg_ID, null);
		parameterPanel.add(fOrg_ID, null);

		//  3rd Row
		parameterPanel.add(lOrder_ID, new ALayoutConstraint(2,0));
		parameterPanel.add(fOrder_ID, null);
		parameterPanel.add(lAmtFrom, null);
		parameterPanel.add(fAmtFrom, null);
		parameterPanel.add(lAmtTo, null);
		parameterPanel.add(fAmtTo, null);
		parameterPanel.add(lDocType, null);
		parameterPanel.add(fDocType, null);		
	}	//	statInit

	/**
	 *	General Init
	 *	@return true, if success
	 */
	private boolean initInfo ()
	{
		//  Set Defaults
		String bp = Env.getContext(Env.getCtx(), p_WindowNo, "C_BPartner_ID");
		if (bp != null && bp.length() != 0)
			fBPartner_ID.setValue(new Integer(bp));

		//  prepare table
		StringBuffer where = new StringBuffer("i.IsActive='Y'");
		if (p_whereClause.length() > 0)
		{
			where.append(" AND ").append(Util.replace(p_whereClause, "C_Invoice.", "i."));
			if (!p_whereClause.contains("'VO'"))
				where.append(" AND i.DocStatus!='VO'");
		}
		prepareTable(s_invoiceLayout,
			" C_Invoice_v i",   //  corrected for CM
			where.toString(),
			"3 DESC,2,4");
		//
	//	MAllocationLine.setIsPaid(Env.getCtx(), 0, null);
		return true;
	}	//	initInfo

	
	/**************************************************************************
	 *	Construct SQL Where Clause and define parameters.
	 *  (setParameters needs to set parameters)
	 *  Includes first AND
	 *  @return sql
	 */
	String getSQLWhere()
	{
		StringBuffer sql = new StringBuffer();
		if (fDocumentNo.getText().length() > 0)
			sql.append(" AND UPPER(i.DocumentNo) LIKE ?");
		if (fDescription.getText().length() > 0)
			sql.append(" AND UPPER(i.Description) LIKE ?");
	//	if (fPOReference.getText().length() > 0)
	//		sql.append(" AND UPPER(i.POReference) LIKE ?");
		//
		if (fBPartner_ID.getValue() != null)
			sql.append(" AND i.C_BPartner_ID=?");
		//
		if (fOrder_ID.getValue() != null)
			sql.append(" AND i.C_Order_ID=?");
		//
		if (fDateFrom.getValue() != null || fDateTo.getValue() != null)
		{
			Timestamp from = (Timestamp)fDateFrom.getValue();
			Timestamp to = (Timestamp)fDateTo.getValue();
			if (from == null && to != null)
				sql.append(" AND TRUNC(i.DateInvoiced) <= ?");
			else if (from != null && to == null)
				sql.append(" AND TRUNC(i.DateInvoiced) >= ?");
			else if (from != null && to != null)
				sql.append(" AND TRUNC(i.DateInvoiced) BETWEEN ? AND ?");
		}
		//
		if (fAmtFrom.getValue() != null || fAmtTo.getValue() != null)
		{
			BigDecimal from = (BigDecimal)fAmtFrom.getValue();
			BigDecimal to = (BigDecimal)fAmtTo.getValue();
			if (from == null && to != null)
				sql.append(" AND i.GrandTotal <= ?");
			else if (from != null && to == null)
				sql.append(" AND i.GrandTotal >= ?");
			else if (from != null && to != null)
				sql.append(" AND i.GrandTotal BETWEEN ? AND ?");
		}
		if (fDocType.getValue() != null)
		{
			sql.append(" AND i.C_DocType_ID = ? ");
		}
		
		//
		sql.append(" AND i.IsPaid=? AND i.IsSOTrx=? ");
		
		if (fIsCash.isSelected())
		{
			//sql.append(" AND i.C_INVOICE_ID NOT IN (SELECT C_INVOICE_ID  FROM C_CASHLINE) ");
			sql.append("AND NOT EXISTS (SELECT * FROM C_CashLine c WHERE i.C_INVOICE_ID=c.C_Invoice_ID AND i.DocStatus='DR')");
		}

	//	log.fine( "InfoInvoice.setWhereClause", sql.toString());
		return sql.toString();
	}	//	getSQLWhere

	/**
	 *  Set Parameters for Query.
	 *  (as defined in getSQLWhere)
	 *  @param pstmt statement
	 *  @param forCount for counting records
	 *  @throws SQLException
	 */
	void setParameters(PreparedStatement pstmt, boolean forCount) throws SQLException
	{
		int index = 1;
		if (fDocumentNo.getText().length() > 0)
			pstmt.setString(index++, getSQLText(fDocumentNo));
		if (fDescription.getText().length() > 0)
			pstmt.setString(index++, getSQLText(fDescription));
	//	if (fPOReference.getText().length() > 0)
	//		pstmt.setString(index++, getSQLText(fPOReference));
		//
		if (fBPartner_ID.getValue() != null)
		{
			Integer bp = (Integer)fBPartner_ID.getValue();
			pstmt.setInt(index++, bp.intValue());
			log.fine("BPartner=" + bp);
		}
		//
		if (fOrder_ID.getValue() != null)
		{
			Integer order = (Integer)fOrder_ID.getValue();
			pstmt.setInt(index++, order.intValue());
			log.fine("Order=" + order);
		}
		//
		if (fDateFrom.getValue() != null || fDateTo.getValue() != null)
		{
			Timestamp from = (Timestamp)fDateFrom.getValue();
			Timestamp to = (Timestamp)fDateTo.getValue();
			log.fine("Date From=" + from + ", To=" + to);
			if (from == null && to != null)
				pstmt.setTimestamp(index++, to);
			else if (from != null && to == null)
				pstmt.setTimestamp(index++, from);
			else if (from != null && to != null)
			{
				pstmt.setTimestamp(index++, from);
				pstmt.setTimestamp(index++, to);
			}
		}
		//
		if (fAmtFrom.getValue() != null || fAmtTo.getValue() != null)
		{
			BigDecimal from = (BigDecimal)fAmtFrom.getValue();
			BigDecimal to = (BigDecimal)fAmtTo.getValue();
			log.fine("Amt From=" + from + ", To=" + to);
			if (from == null && to != null)
				pstmt.setBigDecimal(index++, to);
			else if (from != null && to == null)
				pstmt.setBigDecimal(index++, from);
			else if (from != null && to != null)
			{
				pstmt.setBigDecimal(index++, from);
				pstmt.setBigDecimal(index++, to);
			}
		}
		if (fDocType.getValue() != null)
		{
			pstmt.setInt(index++, (Integer) fDocType.getValue() );
		}
		pstmt.setString(index++, fIsPaid.isSelected() ? "Y" : "N");
		pstmt.setString(index++, fIsSOTrx.isSelected() ? "Y" : "N");
		//pstmt.setString(index++, fIsCash.isSelected() ? "Y" : "N");
	}   //  setParameters

	/**
	 *  Get SQL WHERE parameter
	 *  @param f field
	 *  @return sql
	 */
	private String getSQLText (CTextField f)
	{
		String s = f.getText().toUpperCase();
		if (!s.endsWith("%"))
			s += "%";
		log.fine( "String=" + s);
		return s;
	}   //  getSQLText
	
	/**
	 *	Zoom
	 */
	void zoom()
	{
		log.info( "InfoInvoice.zoom");
		Integer C_Invoice_ID = getSelectedRowKey();
		if (C_Invoice_ID == null)
			return;
		MQuery query = new MQuery("C_Invoice");
		query.addRestriction("C_Invoice_ID", MQuery.EQUAL, C_Invoice_ID);
		query.setRecordCount(1);
		int AD_WindowNo = getAD_Window_ID("C_Invoice", fIsSOTrx.isSelected());
		zoom (AD_WindowNo, query);
	}	//	zoom

	/**
	 *	Has Zoom
	 *  @return true
	 */
	boolean hasZoom()
	{
		return true;
	}	//	hasZoom

	/**
	 *	Save Selection Settings
	 */
	void saveSelectionDetail()
	{
		//  publish for Callout to read
		Integer ID = getSelectedRowKey();
		Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "C_Invoice_ID", ID == null ? "0" : ID.toString());
		//
		int C_InvoicePaySchedule_ID = 0;
		int row = p_table.getSelectedRow();
		if (row >= 0)
		{
			Object value = p_table.getValueAt(row, INDEX_PAYSCHEDULE);
			if (value != null && value instanceof KeyNamePair)
				C_InvoicePaySchedule_ID = ((KeyNamePair)value).getKey();
		}
		if (C_InvoicePaySchedule_ID <= 0)	//	not selected
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "C_InvoicePaySchedule_ID", "0");
		else
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "C_InvoicePaySchedule_ID", String.valueOf(C_InvoicePaySchedule_ID));
	}	//	saveSelectionDetail
	
	
}   //  InfoInvoice
