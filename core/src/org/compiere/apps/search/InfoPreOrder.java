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
import java.sql.*;
import java.util.*;

import javax.swing.event.ListSelectionEvent;
//
import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.*;
import org.compiere.apps.search.Info;
import org.compiere.apps.search.Info_Column;
import org.compiere.grid.ed.*;
import org.compiere.minigrid.*;
import org.compiere.swing.*;
import org.compiere.util.*;

public class InfoPreOrder extends Info
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * 	Constructor.
	 * 	Called from InfoPreOrder
	 *	@param parent
	 */
	public InfoPreOrder (Frame frame, boolean modal, int WindowNo,
			String value, boolean isSOTrx,
			boolean multiSelection, String whereClause)
	{		
		super (frame, modal, WindowNo, "p", "C_PreOrder_ID", multiSelection, whereClause);
		log.info(value);
		setTitle(Msg.getMsg(Env.getCtx(), "InfoPreOrder"));
		m_isSOTrx = isSOTrx;
		
		statInit();
		initInfo (value, whereClause);
		
		int no = p_table.getRowCount();		
//		p_table.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
//        Action actions = new AbstractAction() {
//
//	    	  public void actionPerformed(ActionEvent e) {
//	    		  dispose(true);
//	    	  }
//        }; 		      		      	
//		p_table.getActionMap().put("KEYENTER", actions);		
		setStatusLine(Integer.toString(no) + " " + Msg.getMsg(Env.getCtx(), "SearchRows_EnterQuery"), false);
		setStatusDB(Integer.toString(no));
		//	AutoQuery
		if (value != null && value.length() > 0)
			executeQuery();
		p_loadedOK = true;
		//	Focus
		fieldDocumentNo.requestFocus();

		AEnv.positionCenterWindow(frame, this);
		
	}	//	InfoPreOrder
	
	private void initInfo(String value, String whereClause) {
		//	Create Grid
		StringBuffer where = new StringBuffer();
		where.append("p.IsActive='Y'");
		if (whereClause != null && whereClause.length() > 0)
			where.append(" AND ").append(whereClause);
		
		prepareTable(s_preorderLayout, s_preorderFROM,
			where.toString(),
			"p.documentno DESC");

		//  Set Value
		if (value == null)
			value = "%";
		if (!value.endsWith("%"))
			value += "%";

		//	Put query string in Name if not numeric
		if (value.equals("%"))
			fieldName.setText(value);
		//	No Numbers entered
		else if ((value.indexOf('0')+value.indexOf('1')+value.indexOf('2')+value.indexOf('3')+value.indexOf('4') +value.indexOf('5')
			+value.indexOf('6')+value.indexOf('7')+value.indexOf('8')+value.indexOf('9')) == -10)
		{
			if (value.startsWith("%"))
				fieldName.setText(value);
			else
				fieldName.setText("%" + value);
		}
		//	Number entered
		else
			fieldDocumentNo.setText(value);
		
	}

	/**
	 *	Construct SQL Where Clause and define parameters.
	 *  (setParameters needs to set parameters)
	 *  Includes first AND
	 *  @return WHERE clause
	 */
	String getSQLWhere()
	{
		ArrayList<String> list = new ArrayList<String>();
		//	=> Value
		String value = fieldDocumentNo.getText().toUpperCase();
		if (!(value.equals("") || value.equals("%")))
			list.add ("UPPER(p.documentno) LIKE ?");
		//	=> Name
		String name = fieldName.getText().toUpperCase();
		if (!(name.equals("") || name.equals("%")))
			list.add ("UPPER(bp.Name) LIKE ?");
		//	=> Name2
		String name2 = fieldName2.getText().toUpperCase();
		if (!(name2.equals("") || name2.equals("%")))
			list.add ("UPPER(bp.Name2) LIKE ?");		
		//	=> Contact

		StringBuffer sql = new StringBuffer();
		int size = list.size();
		//	Just one
		if (size == 1)
			sql.append(" AND ").append(list.get(0));
		else if (size > 1)
		{
			boolean AND = checkAND.isSelected();
			sql.append(" AND ");
			if (!AND)
				sql.append("(");
			for (int i = 0; i < size; i++)
			{
				if (i > 0)
					sql.append(AND ? " AND " : " OR ");
				sql.append(list.get(i));
			}
			if (!AND)
				sql.append(")");
		}

		//	Static SQL
		if (checkCustomer.isSelected())
		{
			sql.append(" AND ");
			if (m_isSOTrx)
				sql.append ("bp.IsCustomer='Y'");
			else
				sql.append ("bp.IsVendor='Y'");
		}
		return sql.toString();
	}	//	getSQLWhere
	
	/**
	 *  Set Parameters for Query.
	 *  (as defined in getSQLWhere)
	 *  @param pstmt pstmt
	 *  @param forCount for counting records
	 *  @throws SQLException
	 */
	void setParameters(PreparedStatement pstmt, boolean forCount) throws SQLException
	{
		int index = 1;
		//	=> Value
		String DocumentNro = fieldDocumentNo.getText().toUpperCase();
		if (!(DocumentNro.equals("") || DocumentNro.equals("%")))
		{
			if (!DocumentNro.endsWith("%"))
				DocumentNro += "%";
			pstmt.setString(index++, DocumentNro);
			log.fine("DocumentNro: " + DocumentNro);
		}
		//	=> Name
		String name = fieldName.getText().toUpperCase();
		if (!(name.equals("") || name.equals("%")))
		{
			if (!name.endsWith("%"))
				name += "%";
			pstmt.setString(index++, name);
			log.fine("Name: " + name);
		}
		//	=> Name2
		String name2 = fieldName2.getText().toUpperCase();
		if (!(name2.equals("") || name2.equals("%")))
		{
			if (!name2.endsWith("%"))
				name2 += "%";
			pstmt.setString(index++, name2);
			log.fine("Name2: " + name2);
		}		
	}   //  setParameters
	
	
	public void saveSelectionDetail()
	{
		Integer ID = getSelectedRowKey();
		Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "C_PreOrder_ID", ID == null ? "0" : ID.toString());
	}
	/** From Clause             */
	private static String s_preorderFROM = "C_PreOrder p"
		+ " LEFT OUTER JOIN C_BPartner_Location l ON (p.C_BPartner_ID=l.C_BPartner_ID AND l.IsActive='Y')"
		+ " LEFT OUTER JOIN C_BPartner bp ON (p.C_BPartner_ID=bp.C_BPartner_ID)"
		+ " LEFT OUTER JOIN AD_User c ON (p.C_BPartner_ID=c.C_BPartner_ID AND (c.C_BPartner_Location_ID IS NULL OR c.C_BPartner_Location_ID=l.C_BPartner_Location_ID) AND c.IsActive='Y')" 
		+ " LEFT OUTER JOIN C_Location a ON (l.C_Location_ID=a.C_Location_ID)";
	
	/**  Array of Column Info    */
	private static Info_Column[] s_preorderLayout = {
		new Info_Column(" ", "p.C_PreOrder_ID", IDColumn.class),
		new Info_Column(Msg.translate(Env.getCtx(), "Document"), "p.documentno AS Name", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "TaxId"), "bp.taxid", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "Name"), "bp.Name", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "Contact"), "c.Name AS Contact", KeyNamePair.class, "c.AD_User_ID"),
		new Info_Column(Msg.translate(Env.getCtx(), "Phone"), "c.Phone", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "Postal"), "a.Postal", KeyNamePair.class, "l.C_BPartner_Location_ID"),
		new Info_Column(Msg.translate(Env.getCtx(), "City"), "a.City", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "Address1"), "a.Address1", String.class),
	};	

	
	private CLabel labelDocumentNo = new CLabel();
	private CTextField fieldDocumentNo = new CTextField(10);
	private CLabel labelName = new CLabel();;
	private CTextField fieldName = new CTextField(10);
	private CLabel labelName2 = new CLabel();;
	private CTextField fieldName2 = new CTextField(10);
	private boolean m_isSOTrx;
	private VCheckBox checkAND = new VCheckBox();
	private VCheckBox checkCustomer = new VCheckBox();

	//private Worker m_worker = null;
	
	/**
	 *	Static Setup - add fields to parameterPanel
	 */
	private void statInit()
	{
		labelDocumentNo.setText(Msg.getMsg(Env.getCtx(), "DocumentNo"));
		fieldDocumentNo.setBackground(XendraPLAF.getInfoBackground());
		fieldDocumentNo.addActionListener(this);

		labelName.setText(Msg.getMsg(Env.getCtx(), "Name"));
		fieldName.setBackground(XendraPLAF.getInfoBackground());
		fieldName.addActionListener(this);

		labelName2.setText(Msg.getMsg(Env.getCtx(), "Name"));
		fieldName2.setBackground(XendraPLAF.getInfoBackground());
		fieldName2.addActionListener(this);
		
		checkAND.setText(Msg.getMsg(Env.getCtx(), "SearchAND"));
		checkAND.setToolTipText(Msg.getMsg(Env.getCtx(), "SearchANDInfo"));
		checkAND.setSelected(true);
		checkAND.addActionListener(this);		
		if (m_isSOTrx)
			checkCustomer.setText(Msg.getMsg(Env.getCtx(), "OnlyCustomers"));
		else
			checkCustomer.setText(Msg.getMsg(Env.getCtx(), "OnlyVendors"));
		checkCustomer.setSelected(true);
		checkCustomer.setFocusable(false);
		checkCustomer.setRequestFocusEnabled(false);
		checkCustomer.addActionListener(this);
		//
		parameterPanel.setLayout(new ALayout());
		//

		parameterPanel.add(labelDocumentNo, new ALayoutConstraint(0,0));
		parameterPanel.add(fieldDocumentNo, null);
		parameterPanel.add(labelName, null);
		parameterPanel.add(fieldName, null);
		parameterPanel.add(labelName2, null);
		parameterPanel.add(fieldName2, null);
		
		parameterPanel.add(checkCustomer, null);
		//		
		parameterPanel.add(checkAND, new ALayoutConstraint(1,0));
		
	}	//	statInit	

	private static CLogger log = CLogger.getCLogger(InfoPStock.class);

	public void valueChanged(ListSelectionEvent e) {
		if (e.getValueIsAdjusting())
			return;
		enableButtons();		
	}

}	//	InfoPreOrder
