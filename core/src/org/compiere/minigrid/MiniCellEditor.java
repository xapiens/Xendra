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
package org.compiere.minigrid;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.math.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import org.compiere.grid.ed.*;
import org.compiere.util.*;

/**
 *  MiniTable Cell Editor based on class - Timestamp, BigDecimal
 *
 *  @author     Jorg Janke
 *  @version    $Id: MiniCellEditor.java 4545 2012-11-08 20:52:47Z xapiens $
 */
public class MiniCellEditor extends AbstractCellEditor implements TableCellEditor
{

	/**
	 *  Default Constructor
	 *  @param c Class
	 */
	
	public MiniCellEditor(Class c)
	{
		super();
		
		mc_c = c;
		//  Date
		if (c == Timestamp.class)
			m_editor = new VDate();
		else if (c == BigDecimal.class)
			m_editor = new VNumber("Amount", false, false, true, DisplayType.Amount, "Amount");
		else if (c == Double.class)
			m_editor = new VNumber("Number", false, false, true, DisplayType.Number, "Number");
		else if (c == Integer.class)
			m_editor = new VNumber("Integer", false, false, true, DisplayType.Integer, "Integer");
		else
			m_editor = new VString();

	}   //  MiniCellEditor

	private VEditor m_editor = null;
	private Class mc_c = null;

	/**
	 *	Sets an initial value for the editor. This will cause the editor to
	 *	stopEditing and lose any partially edited value if the editor is editing
	 *	when this method is called.
	 *	Returns the component that should be added to the client's Component hierarchy.
	 *	Once installed in the client's hierarchy this component
	 *	will then be able to draw and receive user input.
	 *  @param table
	 *  @param value
	 *  @param isSelected
	 *  @param row
	 *  @param column
	 *  @return Component
	 */
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column)
	{		
		//table.
	//	ADebug.trace(ADebug.l5_DData, "VCellEditor.getTableCellEditorComponent - " + value == null ? "null" : value.toString());
		//final JComponent editorComp = (JComponent)mc_c.getTableCellEditorComponent(table, value, isSelected, row, column);
		//this.super.getTableCellEditorComponent( table, value, isSelected, row, column);

//        JPanel panel = new JPanel(new BorderLayout()
//            protected boolean processKeyBinding(KeyStroke ks, KeyEvent e, int condition, boolean pressed){
//                InputMap map = this.getInputMap(condition);
//                ActionMap am = this.getActionMap();
//
//                if(map!=null && am!=null && isEnabled()){
//                    Object binding = map.get(ks);
//                    Action action = (binding==null) ? null : am.get(binding);
//                    if(action!=null){
//                        return SwingUtilities.notifyAction(action, ks, e, this,
//                                e.getModifiers());
//                    }
//                }
//                return false;
//            }
//        };		
//		
//        panel.setRequestFocusEnabled(true);
//        panel.add((Component) m_editor);
		//JComponent.processKeyBinding
//  LABS		
        //panel.add(customEditorButton, BorderLayout.EAST);        
		
		//	Set Value
		
		m_editor.setValue(value);
		if (m_editor instanceof VNumber)
		{
			((VNumber) m_editor).selectAll();
		}
		//	Set UI
		m_editor.setBorder(null);
	//	m_editor.setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
		m_editor.setFont(table.getFont());
		((Component) m_editor).requestFocus();
		return (Component)m_editor;
	}	//	getTableCellEditorComponent

	/**
	 *	Returns the value contained in the editor
	 *  @return value
	 */
	public Object getCellEditorValue()
	{
	//	ADebug.trace(ADebug.l5_DData, "VCellEditor.getCellEditorValue - ");

		if (m_editor != null)
			return m_editor.getValue();
		return null;
	}	//	getCellEditorValue

}   //  MiniCellEditor
