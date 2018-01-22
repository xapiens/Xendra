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
import java.util.logging.*;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
//
import org.compiere.apps.*;
import org.compiere.minigrid.*;
import org.compiere.swing.*;
import org.compiere.util.*;

public class InfoPStock extends CDialog implements ListSelectionListener
{	
	private CPanel mainPanel = new CPanel();
	private BorderLayout mainLayout = new BorderLayout();
	private ConfirmPanel confirmPanel = new ConfirmPanel();
	private MiniTable miniTable = new MiniTable();	
	private JScrollPane scrollPane = new JScrollPane();
	private int M_Product_ID;
	private BigDecimal TotalQtybyUOM = Env.ZERO;
	private BigDecimal TotalQtybyUnits = Env.ZERO;
	private BigDecimal TotalQtyReserved = Env.ZERO;
	private BigDecimal TotalQtyOrdered = Env.ZERO;

	/**
	 * 	Constructor.
	 * 	Called from InfoProduct,cmd_InfoPAttribute
	 *	@param parent
	 */
	public InfoPStock (JDialog parent, int pProduct_ID)
	{		
		super (parent, Msg.getMsg(Env.getCtx(), "InfoPStock"), true);
		M_Product_ID = pProduct_ID;
		try
		{
			jbInit();
			dynInit();
			executeQuery();
			miniTable.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
	        Action actions = new AbstractAction() {

		    	  public void actionPerformed(ActionEvent e) {
		    		  dispose(true);
		    	  }
	        }; 		      		      	
	        miniTable.getActionMap().put("KEYENTER", actions);							
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "InfoPStock", e);
		}
		
		AEnv.showCenterWindow(parent, this);
	}	//	InfoPStock}
	
	private void executeQuery()
	{
		
		StringBuffer sql = new StringBuffer(
				" SELECT w.M_Warehouse_ID, "
				+ "w.Value || ' - ' || w.Name AS ValueName, "
				+ "QtyByUOM(?,w.M_Warehouse_ID,0) AS QtyAvailable, "
				+ "nameByUOM(?,0) AS C_UOM_ID,"
				+ "Qtydiffbyuom(?,w.M_Warehouse_ID,0) AS QtyOnHand, "
				+ "nameByUOM(?,p.C_UOM_ID),"
				+ "bomQtyReserved(?,w.M_Warehouse_ID,0) AS QtyReserved, "
				+ "bomQtyOrdered(?,w.M_Warehouse_ID,0) AS QtyOrdered "
				+ " FROM M_Warehouse w, M_Product p  WHERE w.IsActive='Y' AND w.AD_Client_ID = "+Env.getAD_Client_ID(Env.getCtx())
				+ " AND p.M_Product_ID = ? "
				+ " ORDER BY QtyOnHand DESC");
	
			log.fine(sql.toString());

			//  reset table
			int row = 0;
			miniTable.setRowCount(row);
			
			//  Execute
			try
			{
				PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
				pstmt.setInt(1, M_Product_ID);
				pstmt.setInt(2, M_Product_ID);
				pstmt.setInt(3, M_Product_ID);
				pstmt.setInt(4, M_Product_ID);
				pstmt.setInt(5, M_Product_ID);
				pstmt.setInt(6, M_Product_ID);
				pstmt.setInt(7, M_Product_ID);

				ResultSet rs = pstmt.executeQuery();
				//
				while (rs.next())
				{
					BigDecimal QtyAvailable = rs.getBigDecimal(3);
					if (QtyAvailable == null)
						QtyAvailable = Env.ZERO;
					BigDecimal QtyOnHand = rs.getBigDecimal(5);
					if (QtyOnHand == null)
						QtyOnHand = Env.ZERO;
					BigDecimal QtyReserved =  rs.getBigDecimal(7);
					if (QtyReserved == null)
						QtyReserved = Env.ZERO;
					BigDecimal QtyOrdered = rs.getBigDecimal(8);
					if (QtyOrdered == null)
						QtyOrdered = Env.ZERO;
					//  extend table
					miniTable.setRowCount(row+1);
					//  set values
					miniTable.setValueAt(new IDColumn(rs.getInt(1)), row, 0);   //  M_Warehouse_ID
					miniTable.setValueAt(rs.getString(2), row, 1);              //  ValueName
					
					miniTable.setValueAt(QtyAvailable, row, 2);              //  QtyOnHand					
					miniTable.setValueAt(rs.getString(4),     row, 3);              //  NamebyUOM
					miniTable.setValueAt(QtyOnHand, row, 4);              //  QtyOrdered
					miniTable.setValueAt(rs.getString(6),     row, 5);              //  NamebyUOM
					miniTable.setValueAt(QtyReserved, row, 6);              //  QtyOnHand
					miniTable.setValueAt(QtyOrdered, row, 7);              //  QtyOnHand
					
					
					TotalQtybyUOM = TotalQtybyUOM.add(QtyAvailable);
					TotalQtybyUnits = TotalQtybyUnits.add(QtyOnHand);
					TotalQtyReserved = TotalQtyReserved.add(QtyReserved);
					TotalQtyOrdered = TotalQtyOrdered.add(QtyOrdered);
					//  prepare next
					row++;
				}
				miniTable.setRowCount(row+1);
				miniTable.setValueAt("Total", row, 1);              //  ValueName
				miniTable.setValueAt(TotalQtybyUOM, row, 2);              //  QtyOnHand
				miniTable.setValueAt(TotalQtybyUnits, row, 4);              //  QtyOnHand
				miniTable.setValueAt(TotalQtyReserved, row, 6);              //  QtyReserved
				miniTable.setValueAt(TotalQtyOrdered, row, 7);              //  QtyOrdered				
				rs.close();
				pstmt.close();
			}
			catch (SQLException e)
			{
				log.log(Level.SEVERE, sql.toString(), e);
			}
			//
			mainPanel.setPreferredSize(new Dimension(800,400));
			miniTable.autoSize();
			
	}
	/**
	 * 	Dynamic Init of the Center Panel
	 */	
	private void dynInit() {
				
		//  create Columns
		miniTable.addColumn("M_Warehouse_ID");
		miniTable.addColumn("Name");
		miniTable.addColumn("QtyOnHand");
		miniTable.addColumn("C_UOM_ID");
		miniTable.addColumn("QtyAvailable");
		miniTable.addColumn("C_UOM_ID2");
		miniTable.addColumn("QtyReserved");
		miniTable.addColumn("QtyOrdered");
		//
		miniTable.setMultiSelection(false);
		miniTable.setRowSelectionAllowed(false);
		//miniTable.set
		//  set details
		miniTable.setColumnClass(0, IDColumn.class, false, " ");
		miniTable.setColumnClass(1, String.class, true, Msg.translate(Env.getCtx(), "Name"));
		miniTable.setColumnClass(2, BigDecimal.class, true, Msg.translate(Env.getCtx(), "QtyAvailable"));
		miniTable.setColumnClass(3, String.class, true, Msg.translate(Env.getCtx(), "C_UOM_ID"));
		miniTable.setColumnClass(4, BigDecimal.class, true, Msg.translate(Env.getCtx(), "QtyAvailable"));
		miniTable.setColumnClass(5, String.class, true, Msg.translate(Env.getCtx(), "C_UOM_ID"));
		miniTable.setColumnClass(6, BigDecimal.class, true, Msg.translate(Env.getCtx(), "QtyReserved"));
		miniTable.setColumnClass(7, BigDecimal.class, true, Msg.translate(Env.getCtx(), "QtyOrdered"));
				
		scrollPane.getViewport().add(miniTable, null);
	}

	private void jbInit() {
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(mainLayout);		
		mainPanel.add(scrollPane, BorderLayout.CENTER);
		//	ConfirmPanel
		confirmPanel.addActionListener(this);
		mainPanel.add(confirmPanel, BorderLayout.SOUTH);				
	}

	private static CLogger log = CLogger.getCLogger(InfoPStock.class);

	public void valueChanged(ListSelectionEvent e) {
		if (e.getValueIsAdjusting())
			return;
		enableButtons();		
	}

	/**
	 *  Enable OK, History, Zoom if row selected
	 */
	void enableButtons ()
	{
		boolean enable = miniTable.getSelectedRow() != -1;
		confirmPanel.getOKButton().setEnabled(enable);
		
	}   //  enableButtons	

	/**
	 *	Dispose and save Selection
	 *	@param ok OK pressed
	 */
	public void dispose(boolean ok)
	{
		removeAll();
		super.dispose();
	}	//	dispose
	
	public void actionPerformed(ActionEvent e)
	{
		//  Confirm Panel
		String cmd = e.getActionCommand();
		if (cmd.equals(ConfirmPanel.A_OK))
		{
			dispose(true);
		}
		else if (cmd.equals(ConfirmPanel.A_CANCEL))
		{
			//m_cancel = true;
			dispose(false);
		}		
	}	
	
}	//	InfoPStock
