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
import java.awt.event.*;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
//
import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.*;
import org.compiere.grid.ed.*;
import org.compiere.minigrid.*;
import org.compiere.model.MClient;
import org.compiere.model.MQuery;
import org.compiere.plaf.*;
import org.compiere.swing.*;
import org.compiere.util.*;

/**
 *	Search Product and return selection
 *
 *  @author     Jorg Janke
 *  @version    $Id: InfoProduct.java 865 2008-03-20 00:23:42Z el_man $
 */
public final class InfoEquipment extends Info implements ActionListener
{
	public InfoEquipment(Frame frame, boolean modal, int WindowNo,
		int ua_equipment, String value,
		boolean multiSelection, String whereClause, boolean lockedCombos) 
	{
		super (frame, modal, WindowNo, "p", "Q_Equipment_ID", multiSelection, whereClause);
		log.info(value + ", Wh=" + ua_equipment + ",  WHERE=" + whereClause);
		setTitle(Msg.getMsg(Env.getCtx(), "InfoEquipment"));
		//
		statInit(lockedCombos);
		initInfo (value, ua_equipment);
		m_C_BPartner_ID = Env.getContextAsInt(Env.getCtx(), WindowNo, "C_BPartner_ID");

		//
		int no = p_table.getRowCount();
		setStatusLine(Integer.toString(no) + " " + Msg.getMsg(Env.getCtx(), "SearchRows_EnterQuery"), false);
		setStatusDB(Integer.toString(no));
		//	AutoQuery
		if (value != null && value.length() > 0)
			executeQuery();
		p_loadedOK = true;
		//	Focus
		fieldValue.requestFocus();

		AEnv.positionCenterWindow(frame, this);
	}

	/**
	 *	Standard Constructor
	 * 	@param frame frame
	 * 	@param modal modal
	 * 	@param WindowNo window no
	 * 	@param M_Warehouse_ID warehouse
	 * 	@param M_PriceList_ID price list
	 * 	@param value    Query Value or Name if enclosed in @
	 * 	@param multiSelection multiple selections
	 * 	@param whereClause where clause
	 */
	public InfoEquipment(Frame frame, boolean modal, int WindowNo,
		 String value,
		boolean multiSelection, String whereClause)
	{
		this(frame, modal, WindowNo,  0, value, multiSelection, whereClause, false);
	}	//	InfoProduct

	/** SQL From				*/
	private static final String s_productFrom =
		"Q_Equipment p"
		+ " LEFT OUTER JOIN QAttributeSet pa ON (p.QAttributeSet_ID=pa.QAttributeSet_ID)";

	/**  Array of Column Info    */
	private static Info_Column[] s_equipmentLayout = null;
	private static int INDEX_NAME = 0;
	private static int INDEX_PATTRIBUTE = 0;

	//
	private CLabel labelValue = new CLabel();
	private CTextField fieldValue = new CTextField(10);
	private CLabel labelName = new CLabel();
	private CTextField fieldName = new CTextField(10);
	private CLabel labelUA = new CLabel();
	private CTextField fieldUA = new CTextField(10);
	

	/**	Search Button				*/
	private CButton		m_InfoPAttributeButton = new CButton(Env.getImageIcon("PAttribute16.gif"));
	/** Instance Button				*/
	private CButton		m_PAttributeButton = null;
	/** ASI							*/
	private int			m_M_AttributeSetInstance_ID = -1;
	/** Locator						*/
	private int			m_M_Locator_ID = 0;

	private String		m_pAttributeWhere = null;
	private int			m_C_BPartner_ID = 0;

	/**
	 *	Static Setup - add fields to parameterPanel
	 */
	private void statInit(boolean locked)
	{
		labelValue.setText(Msg.getMsg(Env.getCtx(), "Value"));
		fieldValue.setBackground(XendraPLAF.getInfoBackground());
		fieldValue.addActionListener(this);
		
		labelName.setText(Msg.getMsg(Env.getCtx(), "Name"));
		fieldName.setBackground(XendraPLAF.getInfoBackground());
		fieldName.addActionListener(this);

		labelUA.setText(Msg.translate(Env.getCtx(), "UA"));
		fieldUA.setBackground(XendraPLAF.getInfoBackground());
		fieldUA.addActionListener(this);

		

		m_InfoPAttributeButton.setMargin(new Insets(2,2,2,2));
		m_InfoPAttributeButton.setToolTipText(Msg.getMsg(Env.getCtx(), "InfoPAttribute"));
		m_InfoPAttributeButton.addActionListener(this);

		//	Line 1
		parameterPanel.setLayout(new ALayout());
		parameterPanel.add(labelValue, new ALayoutConstraint(0,0));
		parameterPanel.add(fieldValue, null);
		parameterPanel.add(labelUA, null);
		parameterPanel.add(fieldUA, null);
	
		parameterPanel.add(m_InfoPAttributeButton);
		//	Line 2
		parameterPanel.add(labelName, new ALayoutConstraint(1,0));
		parameterPanel.add(fieldName, null);
		
		
		//	Product Attribute Instance
		m_PAttributeButton = ConfirmPanel.createPAttributeButton(true);
		confirmPanel.addButton(m_PAttributeButton);
		m_PAttributeButton.addActionListener(this);
		m_PAttributeButton.setEnabled(false);
	}	//	statInit

	/**
	 *	Dynamic Init
	 *
	 * @param value value
	 * @param M_Warehouse_ID warehouse
	 * @param M_PriceList_ID price list
	 */
	private void initInfo (String value, int ua_equipment)
	{
		//	Pick init
	//	fillPicks(M_PriceList_ID);
		
		/*if (M_PriceList_Version_ID == 0)
			M_PriceList_Version_ID = findPLV (M_PriceList_ID);*/
		//	Set Value or Name
		if (value.startsWith("@") && value.endsWith("@"))
			fieldName.setText(value.substring(1,value.length()-1));
		else
			fieldValue.setText(value);
		//	Set Warehouse
		/*if (M_Warehouse_ID == 0)
			M_Warehouse_ID = Env.getContextAsInt(Env.getCtx(), "#M_Warehouse_ID");
		if (M_Warehouse_ID != 0)
			setWarehouse (M_Warehouse_ID);
		// 	Set PriceList Version
		if (M_PriceList_Version_ID != 0)
			setPriceListVersion (M_PriceList_Version_ID);
*/
		//	Create Grid
		StringBuffer where = new StringBuffer();
		where.append("p.IsActive='Y'");
		/*if (M_Warehouse_ID != 0)
			where.append(" AND p.IsSummary='N'");*/
		//  dynamic Where Clause
		if (p_whereClause != null && p_whereClause.length() > 0)
			where.append(" AND ")   //  replace fully qalified name with alias
				.append(Util.replace(p_whereClause, "Q_Equipment.", "p."));
		//
		prepareTable(getProductLayout(),
			s_productFrom,
			where.toString(),
			"");

		//
	
	}	//	initInfo

	/**
	 *	Fill Picks with values
	 *
	 * @param M_PriceList_ID price list
	 */
	/*
	private void fillPicks (int M_PriceList_ID)
	{
		//	Price List
		String SQL = "SELECT M_PriceList_Version.M_PriceList_Version_ID,"
			+ " M_PriceList_Version.Name || ' (' || c.Iso_Code || ')' AS ValueName "
			+ "FROM M_PriceList_Version, M_PriceList pl, C_Currency c "
			+ "WHERE M_PriceList_Version.M_PriceList_ID=pl.M_PriceList_ID"
			+ " AND pl.C_Currency_ID=c.C_Currency_ID"
			+ " AND M_PriceList_Version.IsActive='Y' AND pl.IsActive='Y'";
		//	Same PL currency as original one
		if (M_PriceList_ID != 0)
			SQL += " AND EXISTS (SELECT * FROM M_PriceList xp WHERE xp.M_PriceList_ID=" + M_PriceList_ID
				+ " AND pl.C_Currency_ID=xp.C_Currency_ID)";
		//	Add Access & Order
		SQL = MRole.getDefault().addAccessSQL (SQL, "M_PriceList_Version", true, false)	// fully qualidfied - RO 
			+ " ORDER BY M_PriceList_Version.Name";
		try
		{
			pickPriceList.addItem(new KeyNamePair (0, ""));
			PreparedStatement pstmt = DB.prepareStatement(SQL, null);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				KeyNamePair kn = new KeyNamePair (rs.getInt(1), rs.getString(2));
				pickPriceList.addItem(kn);
			}
			rs.close();
			pstmt.close();

			//	Warehouse
			SQL = MRole.getDefault().addAccessSQL (
				"SELECT M_Warehouse_ID, Value || ' - ' || Name AS ValueName "
				+ "FROM M_Warehouse "
				+ "WHERE IsActive='Y'",
					"M_Warehouse", MRole.SQL_NOTQUALIFIED, MRole.SQL_RO)
				+ " ORDER BY Value";
			pickWarehouse.addItem(new KeyNamePair (0, ""));
			pstmt = DB.prepareStatement(SQL, null);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				KeyNamePair kn = new KeyNamePair
					(rs.getInt("M_Warehouse_ID"), rs.getString("ValueName"));
				pickWarehouse.addItem(kn);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, SQL, e);
			setStatusLine(e.getLocalizedMessage(), true);
		}
	}	//	fillPicks
*/
	/**
	 *	Set Warehouse
	 *
	 * 	@param M_Warehouse_ID warehouse
	 */
	/*
	private void setWarehouse(int M_Warehouse_ID)
	{
		for (int i = 0; i < pickWarehouse.getItemCount(); i++)
		{
			KeyNamePair kn = (KeyNamePair)pickWarehouse.getItemAt(i);
			if (kn.getKey() == M_Warehouse_ID)
			{
				pickWarehouse.setSelectedIndex(i);
				return;
			}
		}
	}	//	setWarehouse

	/**
	 *	Set PriceList
	 *
	 * @param M_PriceList_Version_ID price list
	 */
	/*private void setPriceListVersion(int M_PriceList_Version_ID)
	{
		log.config("M_PriceList_Version_ID=" + M_PriceList_Version_ID);
		for (int i = 0; i < pickPriceList.getItemCount(); i++)
		{
			KeyNamePair kn = (KeyNamePair)pickPriceList.getItemAt(i);
			if (kn.getKey() == M_PriceList_Version_ID)
			{
				pickPriceList.setSelectedIndex(i);
				return;
			}
		}
		log.fine("NOT found");
	}	//	setPriceList

	/**
	 *	Find Price List Version and update context
	 *
	 * @param M_PriceList_ID price list
	 * @return M_PriceList_Version_ID price list version
	 */
	/*
	private int findPLV (int M_PriceList_ID)
	{
		Timestamp priceDate = null;
		//	Sales Order Date
		String dateStr = Env.getContext(Env.getCtx(), p_WindowNo, "DateOrdered"); 
		if (dateStr != null && dateStr.length() > 0)
			priceDate = Env.getContextAsDate(Env.getCtx(), p_WindowNo, "DateOrdered");
		else	//	Invoice Date
		{
			dateStr = Env.getContext(Env.getCtx(), p_WindowNo, "DateInvoiced");
			if (dateStr != null && dateStr.length() > 0)
				priceDate = Env.getContextAsDate(Env.getCtx(), p_WindowNo, "DateInvoiced");
		}
		//	Today
		if (priceDate == null) 
			priceDate = new Timestamp(System.currentTimeMillis());
		//
		log.config("M_PriceList_ID=" + M_PriceList_ID + " - " + priceDate);
		int retValue = 0;
		String sql = "SELECT plv.M_PriceList_Version_ID, plv.ValidFrom "
			+ "FROM M_PriceList pl, M_PriceList_Version plv "
			+ "WHERE pl.M_PriceList_ID=plv.M_PriceList_ID"
			+ " AND plv.IsActive='Y'"
			+ " AND pl.M_PriceList_ID=? "					//	1
			+ "ORDER BY plv.ValidFrom DESC";
		//	find newest one
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, M_PriceList_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next() && retValue == 0)
			{
				Timestamp plDate = rs.getTimestamp(2);
				if (!priceDate.before(plDate))
					retValue = rs.getInt(1);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		Env.setContext(Env.getCtx(), p_WindowNo, "M_PriceList_Version_ID", retValue);
		return retValue;
	}	//	findPLV

	
	/**************************************************************************
	 *	Construct SQL Where Clause and define parameters
	 *  (setParameters needs to set parameters)
	 *  Includes first AND
	 *  @return SQL WHERE clause
	 */
	
	String getSQLWhere()
	{
		StringBuffer where = new StringBuffer();

		//	Product Attribute Search
		if (m_pAttributeWhere != null)
		{
			where.append(m_pAttributeWhere);
			return where.toString();
		}

		//  => Value
		String value = fieldValue.getText().toUpperCase();
		if (!(value.equals("") || value.equals("%")))
			where.append(" AND UPPER(p.Value) LIKE ?");

		//  => Name
		String name = fieldName.getText().toUpperCase();
		if (!(name.equals("") || name.equals("%")))
			where.append(" AND UPPER(p.Name) LIKE ?");

		//  => UA
		String ua = fieldUA.getText().toUpperCase();
		if (!(ua.equals("") || ua.equals("%")))
			where.append(" AND UPPER(p.ua_equipment) LIKE ?");


		return where.toString();
	}	//	getSQLWhere

	/**
	 *  Set Parameters for Query
	 *  (as defined in getSQLWhere)
	 *
	 * @param pstmt pstmt
	 *  @param forCount for counting records
	 * @throws SQLException
	 */
	void setParameters(PreparedStatement pstmt, boolean forCount) throws SQLException
	{
		int index = 1;

	
		//  => Value
		String value = fieldValue.getText().toUpperCase();
		if (!(value.equals("") || value.equals("%")))
		{
			if (!value.endsWith("%"))
				value += "%";
			pstmt.setString(index++, value);
			log.fine("Value: " + value);
		}

		//  => Name
		String name = fieldName.getText().toUpperCase();
		if (!(name.equals("") || name.equals("%")))
		{
			if (!name.endsWith("%"))
				name += "%";
			pstmt.setString(index++, name);
			log.fine("Name: " + name);
		}

		//  => UA
		String ua = fieldUA.getText().toUpperCase();
		if (!(ua.equals("") || ua.equals("%")))
		{
			if (!ua.endsWith("%"))
				ua += "%";
			pstmt.setString(index++, ua);
			log.fine("UA: " + ua);
		}

		

	}   //  setParameters

	
	/**************************************************************************
	 *  Action Listner
	 *	@param e event
	 */
	public void actionPerformed (ActionEvent e)
	{
		//  don't requery if fieldValue and fieldName are empty
	/*	if ((e.getSource() == pickWarehouse || e.getSource() == pickPriceList)
			&& (fieldValue.getText().length() == 0 && fieldName.getText().length() == 0))
			return;*/
			
		//	Product Attribute Search
		if (e.getSource().equals(m_InfoPAttributeButton))
		{
			cmd_InfoPAttribute();
			return;		
		}
		m_pAttributeWhere = null;
		
		//	Query Product Attribure Instance
		int row = p_table.getSelectedRow();
		if (e.getSource().equals(m_PAttributeButton) && row != -1)
		{
			Integer productInteger = getSelectedRowKey();
			String productName = (String)p_table.getValueAt(row, INDEX_NAME);
		//	KeyNamePair warehouse = (KeyNamePair)pickWarehouse.getSelectedItem();
		/*	if (productInteger == null || productInteger.intValue() == 0 || warehouse == null)
				return;*/
			String title = productName;
			
		/*	PAttributeInstance pai = new PAttributeInstance (this, title, 
				warehouse.getKey(), 0, productInteger.intValue(), m_C_BPartner_ID);
			m_M_AttributeSetInstance_ID = pai.getM_AttributeSetInstance_ID();
			m_M_Locator_ID = pai.getM_Locator_ID();
			if (m_M_AttributeSetInstance_ID != -1)
				dispose(true);*/
			return;			
		}
		//
		super.actionPerformed(e);
	}   //  actionPerformed

	/**
	 *  Enable PAttribute if row selected/changed
	 */
	void enableButtons ()
	{
		m_M_AttributeSetInstance_ID = -1;
		if (m_PAttributeButton != null)
		{
			int row = p_table.getSelectedRow();
			boolean enabled = false;
			if (row >= 0)
			{
				Object value = p_table.getValueAt(row, INDEX_PATTRIBUTE);
				enabled = Boolean.TRUE.equals(value);
			}
			m_PAttributeButton.setEnabled(enabled);
		}
		super.enableButtons();
	}   //  enableButtons

	/**
	 * 	Query per Product Attribute.
	 *  <code>
	 * 	Available synonyms:
	 *		M_Product p
	 *		M_ProductPrice pr
	 *		M_AttributeSet pa
	 *	</code>
	 */
	private void cmd_InfoPAttribute()
	{
		InfoPAttribute ia = new InfoPAttribute(this);
		m_pAttributeWhere = ia.getWhereClause();
		if (m_pAttributeWhere != null)
			executeQuery();
	}	//	cmdInfoAttribute

	/**
	 *	Show History
	 */
	void showHistory()
	{
		log.info("");
		Integer M_Equipment_ID = getSelectedRowKey();
		if (M_Equipment_ID == null)
			return;
	
		int M_AttributeSetInstance_ID = m_M_AttributeSetInstance_ID;
		if (m_M_AttributeSetInstance_ID < -1)	//	not selected
			M_AttributeSetInstance_ID = 0;
		//
		/*InvoiceHistory ih = new InvoiceHistory (this, 0, 
			M_Equipment_ID.intValue(), M_Warehouse_ID, M_AttributeSetInstance_ID);
		ih.setVisible(true);
		ih = null;*/
	}	//	showHistory

	/**
	 *	Has History
	 *
	 * @return true (has history)
	 */
	boolean hasHistory()
	{
		return true;
	}	//	hasHistory

	/**
	 *	Zoom
	 */
	void zoom()
	{
		log.info("");
		Integer Q_Equipment_ID = getSelectedRowKey();
		if (Q_Equipment_ID == null)
			return;
	//	AEnv.zoom(MProduct.Table_ID, M_Product_ID.intValue(), true);	//	SO
		
		MQuery query = new MQuery("Q_Equipment");
		query.addRestriction("Q_Equipment_ID", MQuery.EQUAL, Q_Equipment_ID);
		query.setRecordCount(1);
		int AD_WindowNo = getAD_Window_ID("Q_Equipment", true);	//	SO
		zoom (AD_WindowNo, query);
	}	//	zoom

	/**
	 *	Has Zoom
	 *  @return (has zoom)
	 */
	boolean hasZoom()
	{
		return true;
	}	//	hasZoom

	/**
	 *	Customize
	 */
	void customize()
	{
		log.info("");
	}	//	customize

	/**
	 *	Has Customize
	 *  @return false (no customize)
	 */
	boolean hasCustomize()
	{
		return false;	//	for now
	}	//	hasCustomize

	/**
	 *	Save Selection Settings for PriceList
	 */
	void saveSelectionDetail()
	{
		//  publish for Callout to read
		Integer ID = getSelectedRowKey();
		Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "Q_Equipment_ID", ID == null ? "0" : ID.toString());
	
		//
		if (m_M_AttributeSetInstance_ID == -1)	//	not selected
		{
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "QAttributeSetInstance_ID", "0");
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_Locator_ID", "0");
		}
		else
		{
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "QAttributeSetInstance_ID", 
				String.valueOf(m_M_AttributeSetInstance_ID));
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_Locator_ID", 
				String.valueOf(m_M_Locator_ID));
		}
	}	//	saveSelectionDetail

	/**
	 *  Get Product Layout
	 *
	 * @return array of Column_Info
	 */
	private Info_Column[] getProductLayout()
	{
		if (s_equipmentLayout != null)
			return s_equipmentLayout;
		//  Euro 13
		MClient client = MClient.get(Env.getCtx());
		if ("FRIE".equals(client.getValue()))
		{
			final Info_Column[] frieLayout = {
				new Info_Column(" ", "p.Q_Equipment_ID", IDColumn.class),
		//		new Info_Column(Msg.translate(Env.getCtx(), "Value"), "p.Value", String.class),
				new Info_Column(Msg.translate(Env.getCtx(), "Name"), "p.Name", String.class),
				new Info_Column(Msg.translate(Env.getCtx(), "ua_equipment"), "p.ua_equipment", Integer.class),
				new Info_Column(Msg.translate(Env.getCtx(), "IsInstanceAttribute"), "pa.IsInstanceAttribute", Boolean.class)
			};
			INDEX_NAME = 2;
			INDEX_PATTRIBUTE = frieLayout.length - 1;	//	last item
			s_equipmentLayout = frieLayout; 
			return s_equipmentLayout;
		}
		//
		if (s_equipmentLayout == null)
		{
			ArrayList<Info_Column> list = new ArrayList<Info_Column>();
			list.add(new Info_Column(" ", "p.Q_Equipment_ID", IDColumn.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "Value"), "p.Value", String.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "Name"), "p.Name", String.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "IsInstanceAttribute"), "pa.IsInstanceAttribute", Boolean.class));
			s_equipmentLayout = new Info_Column[list.size()];
			list.toArray(s_equipmentLayout);
			INDEX_NAME = 3;
			INDEX_PATTRIBUTE = s_equipmentLayout.length - 1;	//	last item
		}
		return s_equipmentLayout;
	}   //  getProductLayout
	
	/**
	 * 	System has Unforfirmed records
	 *	@return true if unconfirmed
	 */
	private boolean isUnconfirmed()
	{
		int no = DB.getSQLValue(null, 
			"SELECT COUNT(*) FROM M_InOutLineConfirm WHERE AD_Client_ID=?", 
			Env.getAD_Client_ID(Env.getCtx()));
		if (no > 0)
			return true;
		no = DB.getSQLValue(null, 
			"SELECT COUNT(*) FROM M_MovementLineConfirm WHERE AD_Client_ID=?", 
			Env.getAD_Client_ID(Env.getCtx()));
		return no > 0;
	}	//	isUnconfirmed

}	//	InfoProduct
