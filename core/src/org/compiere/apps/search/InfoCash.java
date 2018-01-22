package org.compiere.apps.search;

import java.awt.Frame;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.ALayout;
import org.compiere.apps.ALayoutConstraint;
import org.compiere.grid.ed.VDate;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.compiere.minigrid.IDColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.swing.CCheckBox;
import org.compiere.swing.CLabel;
import org.compiere.swing.CTextField;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;

public class InfoCash extends Info {
	/**
	 *  Detail Protected Contructor
	 *  @param frame parent frame
	 *  @param modal modal
	 *  @param WindowNo window no
	 *  @param value query value
	 *  @param multiSelection multiple selections
	 *  @param whereClause whwre clause
	 */
	protected InfoCash(Frame frame, boolean modal, int WindowNo, String value,
		boolean multiSelection, String whereClause)
	{
		super (frame, modal, WindowNo, "c", "C_Cash_ID", multiSelection, whereClause);
		log.info( "InfoCashLine");
		setTitle(Msg.getMsg(Env.getCtx(), "InfoCashLine"));
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
			fName.setValue(value);
			executeQuery();
		}
		//
		pack();
		//	Focus
		fName.requestFocus();
	}   //  InfoCashLine

	/** list of query columns           */
	private ArrayList 	m_queryColumns = new ArrayList();
	/** Table Name              */
	private String      m_tableName;
	/** Key Column Name         */
	private String      m_keyColumn;

	//  Static Info
	private CLabel lCash_ID = new CLabel(Msg.translate(Env.getCtx(), "DocumentNo"));
	private CTextField fCash_ID = new CTextField(10);
	private CLabel lName = new CLabel(Msg.translate(Env.getCtx(), "Name"));
	private CTextField fName = new CTextField(10);
	private CLabel lCashBook_ID = new CLabel(Msg.translate(Env.getCtx(), "C_CashBook_ID"));
	private VLookup fCashBook_ID;
//	private CLabel lOrg_ID = new CLabel(Msg.translate(Env.getCtx(), "AD_Org_ID"));
//	private VLookup fOrg_ID;
//	private CLabel lCharge_ID = new CLabel(Msg.translate(Env.getCtx(), "C_Charge_ID"));
//	private VLookup fCharge_ID;
	//
	private CLabel lDateFrom = new CLabel(Msg.translate(Env.getCtx(), "StatementDate"));
	private VDate fDateFrom = new VDate("DateFrom", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "DateFrom"));
	private CLabel lDateTo = new CLabel("-");
	private VDate fDateTo = new VDate("DateTo", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "DateTo"));

	/**  Array of Column Info    */
	private static final Info_Column[] s_cashLayout = {
		new Info_Column(" ", "c.C_Cash_ID", IDColumn.class),
		new Info_Column("ID", "c.C_Cash_ID", Integer.class),
		new Info_Column(Msg.translate(Env.getCtx(), "C_CashBook_ID"),
			"(SELECT cb.Name FROM C_CashBook cb WHERE cb.C_CashBook_ID=c.C_CashBook_ID)", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "StatementDate"),
			"c.StatementDate", Timestamp.class),
		new Info_Column(Msg.translate(Env.getCtx(), "Name"),
			"c.Name", String.class),
	//	new Info_Column(Msg.translate(Env.getCtx(), "C_Currency_ID"),
	//		"(SELECT ISO_Code FROM C_Currency c WHERE c.C_Currency_ID=cl.C_Currency_ID)", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "EndingBalance"),
			"c.EndingBalance",  BigDecimal.class, true, true, null),
		//
		new Info_Column(Msg.translate(Env.getCtx(), "Description"),
			"c.Description", String.class)
	};

	/**
	 *	Static Setup - add fields to parameterPanel
	 *  @throws Exception if Lookups cannot be created
	 */
	private void statInit() throws Exception
	{
		lCash_ID.setLabelFor(fCash_ID);
		fCash_ID.setBackground(XendraPLAF.getInfoBackground());
		fCash_ID.addActionListener(this);

		lName.setLabelFor(fName);
		fName.setBackground(XendraPLAF.getInfoBackground());
		fName.addActionListener(this);
		//
	//	fOrg_ID = new VLookup("AD_Org_ID", false, false, true,
	//		MLookupFactory.create(Env.getCtx(), 3486, m_WindowNo, DisplayType.TableDir, false),
	//		DisplayType.TableDir, m_WindowNo);
	//	lOrg_ID.setLabelFor(fOrg_ID);
	//	fOrg_ID.setBackground(XendraPLAF.getInfoBackground());
		//	5249 - C_Cash.C_CashBook_ID
		fCashBook_ID = new VLookup("C_CashBook_ID", false, false, true,
			MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, 5249, DisplayType.TableDir));
		lCashBook_ID.setLabelFor(fCashBook_ID);
		fCashBook_ID.setBackground(XendraPLAF.getInfoBackground());
		//	5354 - C_CashLine.C_Invoice_ID
		//	5296 - C_CashLine.C_Charge_ID
		//	5291 - C_CashLine.C_Cash_ID
		//
		lDateFrom.setLabelFor(fDateFrom);
		fDateFrom.setBackground(XendraPLAF.getInfoBackground());
		fDateFrom.setToolTipText(Msg.translate(Env.getCtx(), "DateFrom"));
		lDateTo.setLabelFor(fDateTo);
		fDateTo.setBackground(XendraPLAF.getInfoBackground());
		fDateTo.setToolTipText(Msg.translate(Env.getCtx(), "DateTo"));
		//
		parameterPanel.setLayout(new ALayout());
		//  First Row
		parameterPanel.add(lCash_ID, new ALayoutConstraint(0,0));
		parameterPanel.add(fCash_ID, null);
		parameterPanel.add(lCashBook_ID, null);
		parameterPanel.add(fCashBook_ID, null);

		parameterPanel.add(lName, new ALayoutConstraint(1,0));
		parameterPanel.add(fName, null);
		//  2nd Row
		parameterPanel.add(lDateFrom, null);
		parameterPanel.add(fDateFrom, null);
		parameterPanel.add(lDateTo, null);
		parameterPanel.add(fDateTo, null);
	//	parameterPanel.add(lOrg_ID, null);
	//	parameterPanel.add(fOrg_ID, null);
	}	//	statInit

	/**
	 *	General Init
	 *	@return true, if success
	 */
	private boolean initInfo ()
	{
		//  prepare table
		StringBuffer where = new StringBuffer("c.IsActive='Y'");
		if (p_whereClause.length() > 0)
			where.append(" AND ").append(Util.replace(p_whereClause, "C_Cash.", "c."));
		prepareTable (s_cashLayout,
			"C_Cash c",
			where.toString(),
			"c.StatementDate");

		return true;
	}	//	initInfo

	
	/**************************************************************************
	 *	Construct SQL Where Clause and define parameters
	 *  (setParameters needs to set parameters)
	 *  Includes first AND
	 *  @return sql where clause
	 */
	String getSQLWhere()
	{
		StringBuffer sql = new StringBuffer();
		if (fCash_ID.getText().length() > 0)
			sql.append(" AND c.C_Cash_ID LIKE ?");
		if (fName.getText().length() > 0)
			sql.append(" AND UPPER(c.Name) LIKE ?");
		//
		if (fCashBook_ID.getValue() != null)
			sql.append(" AND c.C_CashBook_ID=?");
		//
		if (fDateFrom.getValue() != null || fDateTo.getValue() != null)
		{
			Timestamp from = (Timestamp)fDateFrom.getValue();
			Timestamp to = (Timestamp)fDateTo.getValue();
			if (from == null && to != null)
				sql.append(" AND TRUNC(c.StatementDate) <= ?");
			else if (from != null && to == null)
				sql.append(" AND TRUNC(c.StatementDate) >= ?");
			else if (from != null && to != null)
				sql.append(" AND TRUNC(c.StatementDate) BETWEEN ? AND ?");
		}
		//
		log.fine(sql.toString());
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
		if (fCash_ID.getText().length() > 0)
			pstmt.setString(index++, getSQLText(fCash_ID));
		if (fName.getText().length() > 0)
			pstmt.setString(index++, getSQLText(fName));
		//
		if (fCashBook_ID.getValue() != null)
		{
			Integer cb = (Integer)fCashBook_ID.getValue();
			pstmt.setInt(index++, cb.intValue());
			log.fine("CashBook=" + cb);
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
	}   //  setParameters

	/**
	 *  Get SQL WHERE parameter
	 *  @param f field
	 *  @return Upper case text with % at the end
	 */
	private String getSQLText (CTextField f)
	{
		String s = f.getText().toUpperCase();
		if (!s.endsWith("%"))
			s += "%";
		log.fine( "String=" + s);
		return s;
	}   //  getSQLText
}
