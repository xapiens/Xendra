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
package org.compiere.apps.search;

import java.awt.*;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;

import javax.swing.JLabel;
import javax.swing.text.JTextComponent;

import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.*;
import org.compiere.grid.ed.*;
import org.compiere.minigrid.*;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MQuery;
import org.compiere.plaf.*;
import org.compiere.process.DocumentEngine;
import org.compiere.swing.*;
import org.compiere.util.*;


/**
 *  Info BOE
 *
 *  @author fervix
 *  revised by xapiens
 *  @version  $Id: 
 */
public class InfoBOE extends Info
{
	/**
	 *  Detail Protected Contructor
	 *  @param frame parent frame
	 *  @param modal modal
	 *  @param WindowNo window no
	 *  @param value query value
	 *  @param multiSelection multiple selections
	 *  @param whereClause where clause
	 */
	public InfoBOE(Frame frame, boolean modal, int WindowNo, String value,
		boolean multiSelection, String whereClause)
	{
		super (frame, modal, WindowNo, "b", "C_BOE_ID", multiSelection, whereClause);
		log.info( "InfoBOE");
		setTitle(Msg.getMsg(Env.getCtx(), "InfoBOE"));
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
	} 

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
	private CLabel lBPartner_ID = new CLabel(Msg.translate(Env.getCtx(), "BPartner"));
	private VLookup fBPartner_ID;
	//
	private CLabel lDateFrom = new CLabel(Msg.translate(Env.getCtx(), "DateOrdered"));
	private VDate fDateFrom = new VDate("DateFrom", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "DateFrom"));
	private CLabel lDateTo = new CLabel("-");
	private VDate fDateTo = new VDate("DateTo", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "DateTo"));
	private VCheckBox fIsPaid = new VCheckBox ("IsPaid", false, false, true, Msg.translate(Env.getCtx(), "IsPaid"), "", false);
	private VCheckBox fIsSOTrx = new VCheckBox ("IsSOTrx", false, false, true, Msg.translate(Env.getCtx(), "IsSOTrx"), "", false);
	private VCheckBox fIsRenewed = new VCheckBox ("IsRenewed", false, false, true, Msg.translate(Env.getCtx(),"IsRenewed"), "",false);
	/** From Clause             */
	private static String s_boeFROM =
		"C_BOE b ";

	/**  Array of Column Info    */
	private static final Info_Column[] s_invoiceLayout = {
		new Info_Column(" ", "b.C_BOE_ID", IDColumn.class),
		new Info_Column(Msg.translate(Env.getCtx(), "C_BPartner_ID"), "(SELECT Name FROM C_BPartner bp WHERE bp.C_BPartner_ID=b.C_BPartner_ID)", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "DateBoe"), "b.DateBoe", Timestamp.class),
		new Info_Column(Msg.translate(Env.getCtx(), "DocumentNo"), "b.DocumentNo", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "BOENo"), "b.BoeNo", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "C_Currency_ID"), "(SELECT ISO_Code FROM C_Currency c WHERE c.C_Currency_ID=b.C_Currency_ID)", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "GrandTotal"), "b.GrandTotal",  BigDecimal.class),
		new Info_Column(Msg.translate(Env.getCtx(), "OpenAmt"), "boeOpen(C_BOE_ID)", BigDecimal.class, true, true, null),
		new Info_Column(Msg.translate(Env.getCtx(), "ConvertedAmount"), "currencyBase(b.GrandTotal,b.C_Currency_ID,b.DateAcct, b.AD_Client_ID,b.AD_Org_ID)", BigDecimal.class),
		new Info_Column(Msg.translate(Env.getCtx(), "IsPaid"), "b.IsPaid", Boolean.class),
		new Info_Column(Msg.translate(Env.getCtx(), "DueDate"),"b.DueDate", Timestamp.class),
		new Info_Column(Msg.translate(Env.getCtx(), "IsSOTrx"), "b.IsSOTrx", Boolean.class),
		new Info_Column(Msg.translate(Env.getCtx(), "Description"), "b.Description", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "DocStatus"), "getreferencevalue('Document Status',b.docstatus)", String.class),
	};

	/**
	 *	Static Setup - add fields to parameterPanel
	 *  @throws Exception if Lookups cannot be initialized
	 */
	private void statInit() throws Exception
	{
		lDocumentNo.setLabelFor(fDocumentNo);
		fDocumentNo.setBackground(XendraPLAF.getInfoBackground());
		fDocumentNo.addActionListener(this);
		lDescription.setLabelFor(fDescription);
		fDescription.setBackground(XendraPLAF.getInfoBackground());
		fDescription.addActionListener(this);
		fIsPaid.setSelected(false);
		fIsPaid.addActionListener(this);		
		fIsSOTrx.setSelected(!"N".equals(Env.getContext(Env.getCtx(), p_WindowNo, "IsSOTrx")));
		fIsSOTrx.addActionListener(this);
		fIsRenewed.setSelected(false);
		fIsRenewed.addActionListener(this);
		//
		fBPartner_ID = new VLookup("C_BPartner_ID", false, false, true,
			MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, 3499, DisplayType.Search));
		lBPartner_ID.setLabelFor(fBPartner_ID);
		fBPartner_ID.setBackground(XendraPLAF.getInfoBackground());
		//
		lDateFrom.setLabelFor(fDateFrom);
		fDateFrom.setBackground(XendraPLAF.getInfoBackground());
		fDateFrom.setToolTipText(Msg.translate(Env.getCtx(), "DateFrom"));
		lDateTo.setLabelFor(fDateTo);
		fDateTo.setBackground(XendraPLAF.getInfoBackground());
		fDateTo.setToolTipText(Msg.translate(Env.getCtx(), "DateTo"));
		
		//actionLabel.setText(Msg.translate(Env.getCtx(), "DocStatus"));
		//
		parameterPanel.setLayout(new ALayout());
		//  First Row
		parameterPanel.add(lDocumentNo, new ALayoutConstraint(0,0));
		parameterPanel.add(fDocumentNo, null);
		parameterPanel.add(lBPartner_ID, null);
		parameterPanel.add(fBPartner_ID, null);
		parameterPanel.add(fIsSOTrx, new ALayoutConstraint(0,5));
		parameterPanel.add(fIsPaid, null);
		//  2nd Row
		parameterPanel.add(lDescription, new ALayoutConstraint(1,0));
		parameterPanel.add(fDescription, null);
		parameterPanel.add(lDateFrom, null);
		parameterPanel.add(fDateFrom, null);
		parameterPanel.add(lDateTo, null);
		parameterPanel.add(fDateTo, null);
		parameterPanel.add(fIsRenewed, new ALayoutConstraint(2,0));
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
		StringBuffer where = new StringBuffer("b.IsActive='Y'");
		if (p_whereClause.length() > 0)
			where.append(" AND ").append(Util.replace(p_whereClause, "C_BOE.", "b."));
		prepareTable(s_invoiceLayout,s_boeFROM, where.toString(), "2,3,4");
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
			sql.append(" AND UPPER(b.DocumentNo) LIKE ?");
		if (fDescription.getText().length() > 0)
			sql.append(" AND UPPER(b.Description) LIKE ?");
		if (fBPartner_ID.getValue() != null)
			sql.append(" AND b.C_BPartner_ID=?");
		//
		if (fDateFrom.getValue() != null || fDateTo.getValue() != null)
		{
			Timestamp from = (Timestamp)fDateFrom.getValue();
			Timestamp to = (Timestamp)fDateTo.getValue();
			if (from == null && to != null)
				sql.append(" AND TRUNC(b.DateBoe) <= ?");
			else if (from != null && to == null)
				sql.append(" AND TRUNC(b.DateBoe) >= ?");
			else if (from != null && to != null)
				sql.append(" AND TRUNC(b.DateBoe) BETWEEN ? AND ?");
		}
		sql.append(" AND b.IsPaid=? AND b.IsSOTrx=? AND b.IsRenewed=? ");

		//sql.append( " AND b.docstatus=?");
		log.finer(sql.toString());
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
		if (fBPartner_ID.getValue() != null)
		{
			Integer bp = (Integer)fBPartner_ID.getValue();
			pstmt.setInt(index++, bp.intValue());
			log.fine("BPartner=" + bp);
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
		pstmt.setString(index++, fIsPaid.isSelected() ? "Y" : "N");
		pstmt.setString(index++, fIsSOTrx.isSelected() ? "Y" : "N");
		pstmt.setString(index++, fIsRenewed.isSelected() ? "Y" : "N" );
			
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
		log.fine("String=" + s);
		return s;
	}   //  getSQLText
	

	/**
	 *	Zoom
	 */
	void zoom()
	{		
		log.info("");
		Integer C_Boe_ID = getSelectedRowKey();
		if (C_Boe_ID == null)
			return;
		MQuery query = new MQuery("C_BOE");
		query.addRestriction("C_BOE_ID", MQuery.EQUAL, C_Boe_ID);
		query.setRecordCount(1);
		int AD_WindowNo = getAD_Window_ID("C_BOE", fIsSOTrx.isSelected());
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
	 *	Save Selection Settings for PriceList
	 */
	void saveSelectionDetail()
	{
		//  publish for Callout to read
		Integer ID = getSelectedRowKey();
		Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "C_Boe_ID", ID == null ? "0" : ID.toString());
	}	//	saveSelectionDetail

}   //  InfoBoe

