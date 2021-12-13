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

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
//
import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.*;
import org.compiere.grid.ed.*;
import org.compiere.minigrid.*;
import org.compiere.model.MClient;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MProduct;
import org.compiere.model.MQuery;
import org.compiere.model.MRole;
import org.compiere.plaf.*;
import org.compiere.swing.*;
import org.compiere.util.*;

/**
 *	Search Product and return selection
 *
 *  @author     Jorg Janke
 *  @version    $Id: InfoProduct.java 5493 2014-12-05 17:54:41Z xapiens $
 */
public final class InfoProduct extends Info implements ActionListener 
{
	public InfoProduct(Frame frame, boolean modal, int WindowNo,
		int M_Warehouse_ID, int M_PriceList_ID, int M_PriceList_Version_ID, String value,
		boolean multiSelection, String whereClause, boolean lockedCombos, boolean IsSOTrx) 
	{
		super (frame, modal, WindowNo, "p", "M_Product_ID", multiSelection, whereClause);
		log.info(value + ", Wh=" + M_Warehouse_ID + ", PL=" + M_PriceList_ID + ", PLV=" + M_PriceList_Version_ID + ", WHERE=" + whereClause);
		setTitle(Msg.getMsg(Env.getCtx(), "InfoProduct"));
		//
		statInit(lockedCombos);
		initInfo (value, M_Warehouse_ID, M_PriceList_ID, M_PriceList_Version_ID);
		m_C_BPartner_ID = Env.getContextAsInt(Env.getCtx(), WindowNo, "C_BPartner_ID");

		//
		int no = p_table.getRowCount();
		p_table.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
        Action actions = new AbstractAction() {

	    	  public void actionPerformed(ActionEvent e) {
	    		  dispose(true);
	    	  }
        }; 		      		      	
		p_table.getActionMap().put("KEYENTER", actions);				
		setStatusLine(Integer.toString(no) + " " + Msg.getMsg(Env.getCtx(), "SearchRows_EnterQuery"), false);
		setStatusDB(Integer.toString(no));
		//	AutoQuery
		if (value != null && value.length() > 0)
			executeQuery();
		p_loadedOK = true;
		//	Focus
		fieldValue.requestFocus();		
		m_IsSoTrx = IsSOTrx;
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
	public InfoProduct(Frame frame, boolean modal, int WindowNo,
		int M_Warehouse_ID, int M_PriceList_ID, String value,
		boolean multiSelection, String whereClause)
	{
		this(frame, modal, WindowNo, M_Warehouse_ID, M_PriceList_ID, 0, value, multiSelection, whereClause, false, false);
	}	//	InfoProduct

	/** SQL From				*/
	private static final String s_productFrom =
		"M_Product p"
		+ " LEFT OUTER JOIN M_Product_Brand pb ON (p.M_Product_Brand_ID=pb.M_Product_Brand_ID)"
		+ " LEFT OUTER JOIN M_ProductPrice pr ON (p.M_Product_ID=pr.M_Product_ID AND pr.IsActive='Y')"
		// + " LEFT OUTER JOIN M_"
		+ " LEFT OUTER JOIN M_AttributeSet pa ON (p.M_AttributeSet_ID=pa.M_AttributeSet_ID)"
	    + " LEFT OUTER JOIN M_Product_Group pg ON (p.M_Product_Group_ID=pg.M_Product_Group_ID) ";

	/**  Array of Column Info    */
	private static Info_Column[] s_productLayout = null;
	private static int INDEX_NAME = 0;
	private static int INDEX_PATTRIBUTE = 0;

	//
	private CLabel labelValue = new CLabel();
	private CTextField fieldValue = new CTextField(10);
	private CLabel labelName = new CLabel();
	private CTextField fieldName = new CTextField(10);
	private CLabel labelShortName = new CLabel();
	private CTextField fielShortdName = new CTextField(10);	
	private CLabel labelUPC = new CLabel();
	private CTextField fieldUPC = new CTextField(10);
	private CLabel labelSKU = new CLabel();
	private CTextField fieldSKU = new CTextField(10);
	private CLabel labelPriceList = new CLabel();
	private VComboBox pickPriceList = new VComboBox();
	private CLabel labelWarehouse = new CLabel();
	private VComboBox pickWarehouse = new VComboBox();
	
	private CLabel labelProductBrand = new CLabel();
	private VLookup pickProductBrand ; //= new VLookup();

	private CLabel labelProductGeneric = new CLabel();
	private VLookup pickProductGeneric ; //= new VLookup();
	
	private CLabel labelProductType = new CLabel();
	private VLookup pickProductType ; //= new VLookup();

	private CLabel labelProductGroup = new CLabel();
	private VLookup pickProductGroup ; //= new VLookup();
	
	private CLabel labelProductCategory = new CLabel();
	private VLookup pickProductCategory ; 
	
	/**	Search Button				*/
	private CButton		m_InfoPAttributeButton = new CButton(Env.getImageIcon("PAttribute16.gif"));
	/** Instance Button				*/
	private CButton		m_PAttributeButton = null;
	
	/** Stock available  */
	private CButton     m_PStock = null;
	/** ASI							*/
	private int			m_M_AttributeSetInstance_ID = -1;
	/** Locator						*/
	private int			m_M_Locator_ID = 0;

	private String		m_pAttributeWhere = null;
	private int			m_C_BPartner_ID = 0;
	
	private boolean m_IsSoTrx;

	/** Action String PStock  */
	private AppsAction aPStock;

	private CButton bPStock;
	public static final String A_PSTOCK = "Register";


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

		labelShortName.setText(Msg.translate(Env.getCtx(), "ShortName"));
		fielShortdName.setBackground(XendraPLAF.getInfoBackground());
		fielShortdName.addActionListener(this);
		
		labelUPC.setText(Msg.translate(Env.getCtx(), "UPC"));
		fieldUPC.setBackground(XendraPLAF.getInfoBackground());
		fieldUPC.addActionListener(this);

		labelSKU.setText(Msg.translate(Env.getCtx(), "SKU"));
		fieldSKU.setBackground(XendraPLAF.getInfoBackground());
		fieldSKU.addActionListener(this);
		
		labelWarehouse.setText(Msg.getMsg(Env.getCtx(), "Warehouse"));
		pickWarehouse.setBackground(XendraPLAF.getInfoBackground());
		
		labelPriceList.setText(Msg.getMsg(Env.getCtx(), "PriceListVersion"));
		pickPriceList.setBackground(XendraPLAF.getInfoBackground());

		labelProductBrand.setText(Msg.translate(Env.getCtx(), "M_Product_Brand_ID"));		
		int ColumnLookup = Util.getColumnID(MProduct.Table_ID,"M_Product_Brand_ID");
		pickProductBrand = new VLookup("M_Product_Brand_ID", false, false, true,
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, ColumnLookup, DisplayType.Search));
		pickProductBrand.setBackground(XendraPLAF.getInfoBackground());

		labelProductGeneric.setText(Msg.translate(Env.getCtx(), "M_Product_Generic_ID"));		
		ColumnLookup = Util.getColumnID(MProduct.Table_ID,"M_Product_Generic_ID");
		pickProductGeneric = new VLookup("M_Product_Generic_ID", false, false, true,
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, ColumnLookup, DisplayType.Search));
		pickProductGeneric.setBackground(XendraPLAF.getInfoBackground());

		
		labelProductType.setText(Msg.translate(Env.getCtx(), "M_Product_Type_ID"));				
		ColumnLookup = Util.getColumnID(MProduct.Table_ID,"M_Product_Type_ID");
		pickProductType = new VLookup("M_Product_Type_ID", false, false, true,
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, ColumnLookup, DisplayType.Search));
		pickProductType.setBackground(XendraPLAF.getInfoBackground());

		labelProductGroup.setText(Msg.translate(Env.getCtx(), "M_Product_Group_ID"));			
		ColumnLookup = Util.getColumnID(MProduct.Table_ID,"M_Product_Group_ID");
		pickProductGroup = new VLookup("M_Product_Group_ID", false, false, true,
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, ColumnLookup, DisplayType.Search));
		pickProductGroup.setBackground(XendraPLAF.getInfoBackground());
		
		labelProductCategory.setText(Msg.translate(Env.getCtx(),"M_Product_Category_ID"));
		ColumnLookup = Util.getColumnID(MProduct.Table_ID,"M_Product_Category_ID");
		pickProductCategory = new VLookup("M_Product_Category_ID", false, false, true,
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, ColumnLookup, DisplayType.Search));
		pickProductCategory.setBackground(XendraPLAF.getInfoBackground());
		
		
		if (locked) {
			pickWarehouse.setEnabled(false);
			pickPriceList.setEnabled(false);
		}

		m_InfoPAttributeButton.setMargin(new Insets(2,2,2,2));
		m_InfoPAttributeButton.setToolTipText(Msg.getMsg(Env.getCtx(), "InfoPAttribute"));
		m_InfoPAttributeButton.addActionListener(this);

		//	Line 1
		parameterPanel.setLayout(new ALayout());
		parameterPanel.add(labelValue, new ALayoutConstraint(0,0));
		parameterPanel.add(fieldValue, null);
		parameterPanel.add(labelUPC, null);
		parameterPanel.add(fieldUPC, null);
		parameterPanel.add(labelWarehouse, null);
		parameterPanel.add(pickWarehouse, null);
		parameterPanel.add(m_InfoPAttributeButton);
		//	Line 2
		parameterPanel.add(labelName, new ALayoutConstraint(1,0));
		parameterPanel.add(fieldName, null);
		parameterPanel.add(labelSKU, null);
		parameterPanel.add(fieldSKU, null);
		parameterPanel.add(labelPriceList, null);
		parameterPanel.add(pickPriceList, null);
		// Line 3
		parameterPanel.add(labelProductBrand, new ALayoutConstraint(2,0));
		parameterPanel.add(pickProductBrand, null);
		parameterPanel.add(labelProductGeneric, null);
		parameterPanel.add(pickProductGeneric, null);
		parameterPanel.add(labelProductType, null);
		parameterPanel.add(pickProductType, null);
		// Line 4
		parameterPanel.add(labelShortName, new ALayoutConstraint(3,0));
		parameterPanel.add(fielShortdName, null);		
		parameterPanel.add(labelProductGroup, null);
		parameterPanel.add(pickProductGroup, null);
		parameterPanel.add(labelProductCategory, null);
		parameterPanel.add(pickProductCategory, null);
		
		//	Product Attribute Instance
		m_PAttributeButton = ConfirmPanel.createPAttributeButton(true);
		confirmPanel.addButton(m_PAttributeButton);
		m_PAttributeButton.addActionListener(this);
		m_PAttributeButton.setEnabled(false);
		
		aPStock   = new AppsAction (A_PSTOCK, KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0) , "F6");
		aPStock.setDelegate(this);
		bPStock = (CButton) aPStock.getButton();
		bPStock.setMargin(new Insets (0, 10, 0, 10));
		confirmPanel.addButton(bPStock);		
		// Product Stock Available
		//m_PStock = ConfirmPanel.createPStock(true);
		//confirmPanel.addButton(m_PStock);
		//m_PStock.addActionListener(this);
		//m_PStock.setEnabled(true);
	}	//	statInit

	/**
	 *	Dynamic Init
	 *
	 * @param value value
	 * @param M_Warehouse_ID warehouse
	 * @param M_PriceList_ID price list
	 */
	private void initInfo (String value, int M_Warehouse_ID, int M_PriceList_ID, int M_PriceList_Version_ID)
	{
		//	Pick init
		fillPicks(M_PriceList_ID);
		
		if (M_PriceList_Version_ID == 0)
			M_PriceList_Version_ID = findPLV (M_PriceList_ID);
		//	Set Value or Name
		if (value.startsWith("@")) //&& value.endsWith("@"))
			fieldName.setText(value.substring(1));
		else
			fieldValue.setText(value);
		//	Set Warehouse
		if (M_Warehouse_ID == 0)
			M_Warehouse_ID = Env.getContextAsInt(Env.getCtx(), "#M_Warehouse_ID");
		if (M_Warehouse_ID != 0)
			setWarehouse (M_Warehouse_ID);
		// 	Set PriceList Version
		if (M_PriceList_Version_ID != 0)
			setPriceListVersion (M_PriceList_Version_ID);

		//	Create Grid
		StringBuffer where = new StringBuffer();
		where.append("p.IsActive='Y'");
		if (M_Warehouse_ID != 0)
			where.append(" AND p.IsSummary='N'");
		//  dynamic Where Clause
		if (p_whereClause != null && p_whereClause.length() > 0)
			where.append(" AND ")   //  replace fully qalified name with alias
				.append(Util.replace(p_whereClause, "M_Product.", "p."));
		//
		prepareTable(getProductLayout(),
			s_productFrom,
			where.toString(),
			"p.Name");
		//"Name DESC, QtyAvailable DESC, Margin DESC"
		//
		pickWarehouse.addActionListener(this);
		pickPriceList.addActionListener(this);
	}	//	initInfo

	public boolean dispatchKeyEvent(KeyEvent event) {
		if (event.getID() == KeyEvent.KEY_PRESSED) {
			//parent.keyHandler(event);
		}
		return true;
	}
	
	/**
	 *	Fill Picks with values
	 *
	 * @param M_PriceList_ID price list
	 */
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
			if (MRole.getDefault().isOnlySoPriceListAccess())
				SQL += " AND EXISTS (SELECT * FROM M_PriceList xp WHERE xp.M_PriceList_ID=" + M_PriceList_ID
				+ " AND pl.issopricelist='Y' AND pl.C_Currency_ID=xp.C_Currency_ID)";				
			else				
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

	/**
	 *	Set Warehouse
	 *
	 * 	@param M_Warehouse_ID warehouse
	 */
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
	private void setPriceListVersion(int M_PriceList_Version_ID)
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
		
		//	Optional PLV
		int M_PriceList_Version_ID = 0;
		KeyNamePair pl = (KeyNamePair)pickPriceList.getSelectedItem();
		if (pl != null)
			M_PriceList_Version_ID = pl.getKey();
		if (M_PriceList_Version_ID != 0)
			where.append(" AND pr.M_PriceList_Version_ID=?");
		
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
		if (!(name.equals("") || name.equals("%"))) {
			String strname = "";
			java.util.List<String> pos = new ArrayList<String>();
			StringTokenizer str = new StringTokenizer(name, " ");
			while (str.hasMoreElements()) {
				String key = str.nextElement().toString();
				if (strname.length() > 1) 
					strname += " AND ";
				else 
					strname += " AND (";
				strname +=" p.NAME ~? ";
			}
			strname += ")";
			//where.append(" AND UPPER(p.Name) LIKE ?");
			where.append(strname);
		}
		
		//  => ShortName
		String shortname = fielShortdName.getText().toUpperCase();
		if (!(shortname.equals("") || shortname.equals("%")))
			where.append(" AND UPPER(p.ShortName) LIKE ?");
		
		//  => UPC
		String upc = fieldUPC.getText().toUpperCase();
		if (!(upc.equals("") || upc.equals("%")))
			where.append(" AND UPPER(p.UPC) LIKE ?");

		//  => SKU
		String sku = fieldSKU.getText().toUpperCase();
		if (!(sku.equals("") || sku.equals("%")))
			where.append(" AND UPPER(p.SKU) LIKE ?");

		//  => Brand
		int ProductBrand = pickProductBrand.getValue()!=null ? (Integer) pickProductBrand.getValue():0;
		if (ProductBrand != 0)
			where.append(" AND p.M_Product_Brand_ID=?");

		//  => Generic
		int ProductGeneric = pickProductGeneric.getValue()!=null ? (Integer) pickProductGeneric.getValue():0;
		if (ProductGeneric != 0)
			where.append(" AND p.M_Product_Generic_ID=?");

		//  => Type
		int ProductType = pickProductType.getValue()!=null ? (Integer) pickProductType.getValue():0;
		if (ProductType != 0)
			where.append(" AND p.M_Product_Type_ID=?");
		
		//  => Group
		int ProductGroup = pickProductGroup.getValue()!=null ? (Integer) pickProductGroup.getValue():0;
		if (ProductGroup != 0)
			where.append(" AND p.M_Product_Group_ID=?");

		// => Category
		int ProductCategory = pickProductCategory.getValue()!=null ? (Integer) pickProductCategory.getValue():0;
		if (ProductCategory != 0)
			where.append(" AND p.M_Product_Category_ID=?");
		
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

		//  => Warehouse
		int M_Warehouse_ID = 0;
		KeyNamePair wh = (KeyNamePair)pickWarehouse.getSelectedItem();
		if (wh != null)
			M_Warehouse_ID = wh.getKey();
		if (!forCount)	//	parameters in select
		{
			for (int i = 0; i < p_layout.length; i++)
			{
				if (p_layout[i].getColSQL().indexOf('?') != -1)
					pstmt.setInt(index++, M_Warehouse_ID);
			}
		}
		log.fine("M_Warehouse_ID=" + M_Warehouse_ID + " (" + (index-1) + "*)");

		//  => PriceList
		int M_PriceList_Version_ID = 0;
		KeyNamePair pl = (KeyNamePair)pickPriceList.getSelectedItem();
		if (pl != null)
			M_PriceList_Version_ID = pl.getKey();
		if (M_PriceList_Version_ID != 0)
		{
			pstmt.setInt(index++, M_PriceList_Version_ID);
			log.fine("M_PriceList_Version_ID=" + M_PriceList_Version_ID);
		}
		//	Rest of Parameter in Query for Attribute Search
		if (m_pAttributeWhere != null)
			return;

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
			StringTokenizer str = new StringTokenizer(name, " ");
			while (str.hasMoreElements()) {
				String key = str.nextElement().toString();
				pstmt.setString(index++, key);
			}
		}

		String shortname = fielShortdName.getText().toUpperCase();
		if (!(shortname.equals("") || shortname.equals("%")))
		{
			if (!shortname.endsWith("%"))
				shortname += "%";
			pstmt.setString(index++, shortname);
			log.fine("ShortName: " + shortname);
		}		
		
		
		//  => UPC
		String upc = fieldUPC.getText().toUpperCase();
		if (!(upc.equals("") || upc.equals("%")))
		{
			if (!upc.endsWith("%"))
				upc += "%";
			pstmt.setString(index++, upc);
			log.fine("UPC: " + upc);
		}

		//  => SKU
		String sku = fieldSKU.getText().toUpperCase();
		if (!(sku.equals("") || sku.equals("%")))
		{
			if (!sku.endsWith("%"))
				sku += "%";
			pstmt.setString(index++, sku);
			log.fine("SKU: " + sku);
		}

		int ProductBrand = pickProductBrand.getValue()!=null ? (Integer) pickProductBrand.getValue():0;
		if (ProductBrand != 0)
		{
			pstmt.setInt(index++, ProductBrand);
			log.fine("M_Product_Brand_ID: " + ProductBrand);
		}

		int ProductGeneric = pickProductGeneric.getValue()!=null ? (Integer) pickProductGeneric.getValue():0;
		if (ProductGeneric != 0)
		{
			pstmt.setInt(index++, ProductGeneric);
			log.fine("M_Product_Group_ID: " + ProductGeneric);
		}

		int ProductType = pickProductType.getValue()!=null ? (Integer) pickProductType.getValue():0;
		if (ProductType != 0)
		{
			pstmt.setInt(index++, ProductType);
			log.fine("M_Product_Group_ID: " + ProductType);
		}
		
		int ProductGroup = pickProductGroup.getValue()!=null ? (Integer) pickProductGroup.getValue():0;
		if (ProductGroup != 0)
		{
			pstmt.setInt(index++, ProductGroup);
			log.fine("M_Product_Group_ID: " + ProductGroup);
		}
		
		int ProductCategory = pickProductCategory.getValue()!=null ? (Integer) pickProductCategory.getValue():0;
		if (ProductCategory != 0)
		{
			pstmt.setInt(index++, ProductCategory);
			log.fine("M_Product_Category_ID: " + ProductCategory);
		}
		

	}   //  setParameters

	
	/**************************************************************************
	 *  Action Listner
	 *	@param e event
	 */
	public void actionPerformed (ActionEvent e)
	{
		//  don't requery if fieldValue and fieldName are empty
		if ((e.getSource() == pickWarehouse || e.getSource() == pickPriceList)
			&& (fieldValue.getText().length() == 0 && fieldName.getText().length() == 0))
			return;
			
		//	Product Attribute Search
		if (e.getSource().equals(m_InfoPAttributeButton))
		{
			cmd_InfoPAttribute();
			return;		
		}
		if (e.getSource().equals(bPStock))
		{
			cmd_InfoPStock();
			return;
		}
		m_pAttributeWhere = null;
		
		//	Query Product Attribure Instance
		int row = p_table.getSelectedRow();
		if (e.getSource().equals(m_PAttributeButton) && row != -1)
		{
			Integer productInteger = getSelectedRowKey();
			String productName = (String)p_table.getValueAt(row, INDEX_NAME);
			KeyNamePair warehouse = (KeyNamePair)pickWarehouse.getSelectedItem();
			if (productInteger == null || productInteger.intValue() == 0 || warehouse == null)
				return;
			String title = warehouse.getName() + " - " + productName;
			PAttributeInstance pai = new PAttributeInstance (this, title, 
				warehouse.getKey(), 0, productInteger.intValue(), m_C_BPartner_ID);
			m_M_AttributeSetInstance_ID = pai.getM_AttributeSetInstance_ID();
			m_M_Locator_ID = pai.getM_Locator_ID();
			if (m_M_AttributeSetInstance_ID != -1)
				dispose(true);
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

	private void cmd_InfoPStock()
	{
		//Info
		Integer M_Product_ID = getSelectedRowKey();
		if (M_Product_ID == null)
			return;
		// Stock por almacen.
    	InfoPStock is = new InfoPStock(this, M_Product_ID );
		
	}
	/**
	 *	Show History
	 */
	void showHistory()
	{
		log.info("");
		Integer M_Product_ID = getSelectedRowKey();
		if (M_Product_ID == null)
			return;
		KeyNamePair kn = (KeyNamePair)pickWarehouse.getSelectedItem();
		int M_Warehouse_ID = kn.getKey();
		int M_AttributeSetInstance_ID = m_M_AttributeSetInstance_ID;
		if (m_M_AttributeSetInstance_ID < -1)	//	not selected
			M_AttributeSetInstance_ID = 0;
		//
		InvoiceHistory ih = new InvoiceHistory (this, 0, 
			M_Product_ID.intValue(), M_Warehouse_ID, M_AttributeSetInstance_ID, m_IsSoTrx);
		ih.setVisible(true);
		ih = null;
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
		Integer M_Product_ID = getSelectedRowKey();
		if (M_Product_ID == null)
			return;
	//	AEnv.zoom(MProduct.Table_ID, M_Product_ID.intValue(), true);	//	SO
		
		MQuery query = new MQuery("M_Product");
		query.addRestriction("M_Product_ID", MQuery.EQUAL, M_Product_ID);
		query.setRecordCount(1);
		int AD_WindowNo = getAD_Window_ID("M_Product", true);	//	SO
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
		Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_Product_ID", ID == null ? "0" : ID.toString());
		KeyNamePair kn = (KeyNamePair)pickPriceList.getSelectedItem();
		Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_PriceList_Version_ID", kn.getID());
		kn = (KeyNamePair)pickWarehouse.getSelectedItem();
		Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_Warehouse_ID", kn.getID());
		//
		if (m_M_AttributeSetInstance_ID == -1)	//	not selected
		{
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_AttributeSetInstance_ID", "0");
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_Locator_ID", "0");
		}
		else
		{
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_AttributeSetInstance_ID", 
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
		if (s_productLayout != null)
			return s_productLayout;
		MClient client = MClient.get(Env.getCtx());		
		
		if (s_productLayout == null)
		{
			ArrayList<Info_Column> list = new ArrayList<Info_Column>();
			list.add(new Info_Column(" ", "p.M_Product_ID", IDColumn.class));			
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "Discontinued").substring(0, 1), "p.Discontinued", Boolean.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "Value"), "p.Value", String.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "Name"), "p.Name", String.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "M_Product_Brand_ID"),"pb.name", String.class));
			if (!client.isWithoutConversion())
			{
				list.add(new Info_Column(Msg.translate(Env.getCtx(), "QtyAvailable"), "QtyByUOM(p.M_Product_ID,?,0) AS QtyAvailable2", BigDecimal.class));
				list.add(new Info_Column(Msg.translate(Env.getCtx(), "C_UOM_ID"), "nameByUOM(p.M_Product_ID,0)",String.class));
				list.add(new Info_Column(Msg.translate(Env.getCtx(), "PriceList"), "priceByUOM(p.M_Product_ID,pr.M_PriceList_Version_ID,0) AS PriceList2", BigDecimal.class));
			}			
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "QtyAvailable"), "qtydiffbyuom(p.M_Product_ID,?,0) AS QtyAvailable", Double.class, true, true, null));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "C_UOM_ID"), "nameByUOM(p.M_Product_ID,p.C_UOM_ID)",String.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "PriceList"), "bomPriceList(p.M_Product_ID, pr.M_PriceList_Version_ID) AS PriceList",  BigDecimal.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "PriceStd"), "bomPriceStd(p.M_Product_ID, pr.M_PriceList_Version_ID) AS PriceStd", BigDecimal.class));																					
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "QtyOnHand"), "bomQtyOnHand(p.M_Product_ID,?,0) AS QtyOnHand", Double.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "QtyReserved"), "bomQtyReserved(p.M_Product_ID,?,0) AS QtyReserved", Double.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "QtyOrdered"), "bomQtyOrdered(p.M_Product_ID,?,0) AS QtyOrdered", Double.class));
			//list.add(new Info_Column(Msg.translate(Env.getCtx(), "M_Product_Brand_ID"),"b.name", String.class));			
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "Group"),"pg.Name", String.class));			
			if (isUnconfirmed())
			{
				list.add(new Info_Column(Msg.translate(Env.getCtx(), "QtyUnconfirmed"), "(SELECT SUM(c.TargetQty) FROM M_InOutLineConfirm c INNER JOIN M_InOutLine il ON (c.M_InOutLine_ID=il.M_InOutLine_ID) INNER JOIN M_InOut i ON (il.M_InOut_ID=i.M_InOut_ID) WHERE c.Processed='N' AND i.M_Warehouse_ID=? AND il.M_Product_ID=p.M_Product_ID) AS QtyUnconfirmed", Double.class));
				list.add(new Info_Column(Msg.translate(Env.getCtx(), "QtyUnconfirmedMove"), "(SELECT SUM(c.TargetQty) FROM M_MovementLineConfirm c INNER JOIN M_MovementLine ml ON (c.M_MovementLine_ID=ml.M_MovementLine_ID) INNER JOIN M_Locator l ON (ml.M_LocatorTo_ID=l.M_Locator_ID) WHERE c.Processed='N' AND l.M_Warehouse_ID=? AND ml.M_Product_ID=p.M_Product_ID) AS QtyUnconfirmedMove", Double.class));
			}
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "Margin"), "bomPriceStd(p.M_Product_ID, pr.M_PriceList_Version_ID)-bomPriceLimit(p.M_Product_ID, pr.M_PriceList_Version_ID) AS Margin", BigDecimal.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "PriceLimit"), "bomPriceLimit(p.M_Product_ID, pr.M_PriceList_Version_ID) AS PriceLimit", BigDecimal.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "IsInstanceAttribute"), "pa.IsInstanceAttribute", Boolean.class));
			list.add(new Info_Column(Msg.translate(Env.getCtx(), "ShortName"), "p.ShortName", String.class));
			s_productLayout = new Info_Column[list.size()];
			list.toArray(s_productLayout);
			INDEX_NAME = 3;
			INDEX_PATTRIBUTE = s_productLayout.length - 2;
		}
		return s_productLayout;
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
