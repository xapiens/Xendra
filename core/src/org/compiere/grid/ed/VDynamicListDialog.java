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
package org.compiere.grid.ed;

import java.awt.*;
import java.awt.event.*;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;

import org.compiere.apps.*;
import org.compiere.apps.search.*;
import org.compiere.swing.*;
import org.compiere.util.*;
import org.xendra.objectview.RowBase;

/**
 *  Dinamic List Dialog Editor.
 * 	Called from VPAttribute.actionPerformed
 *
 *  @author xapiens
 *  @version $Id: VPAttributeDialog.java 508 2007-11-24 23:06:53Z el_man $
 */
public class VDynamicListDialog extends CDialog
	implements ActionListener
{
	private Integer m_value;
	private RowBase[] m_childs;
	private RowBase m_child = null;

	/**
	 *	Product Attribute Instance Dialog
	 *	@param frame parent frame
	 *  @param Integer value
	 *  @param RowBase[]
	 * 	@param WindowNo window
	 */
	public VDynamicListDialog (Frame frame,Integer value, RowBase[] childs , int WindowNo)
	{
		super (frame, Msg.translate(Env.getCtx(), "M_AttributeSetInstance_ID") , true);
		m_value = value;
		m_childs = childs;
		m_WindowNo = Env.createWindowNo (this);

		try
		{
			jbInit();
		}
		catch(Exception ex)
		{
			log.log(Level.SEVERE, "VPAttributeDialog" + ex);
		}
		//	Dynamic Init
		if (!initAttributes ())
		{
			dispose();
			return;
		}
		AEnv.showCenterWindow(frame, this);
	}	//	VPAttributeDialog

	private int						m_WindowNo;
	/**	Change							*/
	private boolean					m_changed = false;
	
	private CLogger					log = CLogger.getCLogger(getClass());
	/** Row Counter					*/
	private int						m_row = 0;
	/** List of Editors				*/
	//	Lot Popup
	JPopupMenu 					popupMenu = new JPopupMenu();
	//	Ser No
	//
	private BorderLayout mainLayout = new BorderLayout();
	private CPanel centerPanel = new CPanel();
	private ALayout centerLayout = new ALayout(5,5, true);
	private ConfirmPanel confirmPanel = new ConfirmPanel (true);

	/**
	 *	Layout
	 * 	@throws Exception
	 */
	private void jbInit () throws Exception
	{
		this.getContentPane().setLayout(mainLayout);
		this.getContentPane().add(centerPanel, BorderLayout.CENTER);
		this.getContentPane().add(confirmPanel, BorderLayout.SOUTH);
		centerPanel.setLayout(centerLayout);
		//
		confirmPanel.addActionListener(this);
	}	//	jbInit

	/**
	 *	Dyanmic Init.
	 *  @return true if initialized
	 */
	private boolean initAttributes ()
	{
		if (m_value == 0)
			return false;
			
		if (m_childs.length == 0)
			return false;
		
		//	Get Model
		ButtonGroup opc = new ButtonGroup();
		JRadioButton[] rb = new JRadioButton[m_childs.length];
		ButtonGroup group = new ButtonGroup();

		for (RowBase child:m_childs)
		{
			CLabel label = new CLabel (child.getName());
			//centerPanel.add(label, new ALayoutConstraint(m_row++,0));
			rb[m_row] = new JRadioButton(child.getName(), child.getRowID() > 0);
			rb[m_row].setActionCommand(String.valueOf(m_row));
			rb[m_row].addActionListener(this);
			centerPanel.add(rb[m_row], new ALayoutConstraint(m_row,0));					
			//centerPanel.add(fieldGuaranteeDate, null);
			group.add(rb[m_row]);
			m_row++;
		}
		//	Window usually to wide (??)
		Dimension dd = centerPanel.getPreferredSize();
		dd.width = Math.min(500, dd.width);
		centerPanel.setPreferredSize(dd);
		return true;
	}	//	initAttribute


	/**
	 *	dispose
	 */
	public void dispose()
	{
		removeAll();
		Env.clearWinContext(m_WindowNo);
		//
		//
		super.dispose();
	}	//	dispose

	public RowBase getSelectedChild()
	{
		return m_child;
	}
	/**
	 *	ActionListener
	 *  @param e event
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() instanceof JRadioButton)
		{
			Integer pos = Integer.valueOf(e.getActionCommand());
			m_child = m_childs[pos];
		}
		//		OK
		else if (e.getActionCommand().equals(ConfirmPanel.A_OK))
		{
			if (saveSelection())
				dispose();
		}
		//	Cancel
		else if (e.getActionCommand().equals(ConfirmPanel.A_CANCEL))
		{
			m_changed = false;
			dispose();
		}
		//	Zoom M_Lot
		else
			log.log(Level.SEVERE, "not found - " + e);
	}	//	actionPerformed

	/**
	 *	Save Selection
	 *	@return true if saved
	 */
	private boolean saveSelection()
	{		
		if (m_child != null)
			m_changed = true;
		return true;
	}	//	saveSelection

	
	/**
	 * 	Value Changed
	 *	@return true if changed
	 */
	public boolean isChanged()
	{
		return m_changed;
	}	//	isChanged

} //	VPAttributeDialog

/*****************************************************************************
 *	Mouse Listener for Popup Menu
 */
final class VDynamicListDialog_mouseAdapter extends java.awt.event.MouseAdapter
{
	/**
	 *	Constructor
	 *  @param adaptee adaptee
	 */
	VDynamicListDialog_mouseAdapter(VDynamicListDialog adaptee)
	{
		m_adaptee = adaptee;
	}	//	VPAttributeDialog_mouseAdapter

	private VDynamicListDialog m_adaptee;

	/**
	 *	Mouse Listener
	 *  @param e MouseEvent
	 */
	public void mouseClicked(MouseEvent e)
	{
	//	System.out.println("mouseClicked " + e.getID() + " " + e.getSource().getClass().toString());
		//	popup menu
		if (SwingUtilities.isRightMouseButton(e))
			m_adaptee.popupMenu.show((Component)e.getSource(), e.getX(), e.getY());
	}	//	mouse Clicked

}	//	VPAttributeDialog_mouseAdapter
