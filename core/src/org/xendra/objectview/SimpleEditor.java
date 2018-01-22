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
package org.xendra.objectview;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.math.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import org.compiere.grid.ed.*;
import org.compiere.swing.CCheckBox;
import org.compiere.util.*;

/**
 *  @author     xapiens
 *  @version    $Id: simpleEditor.java 1885 2010-10-30 21:19:27Z xapiens $
 */
public class SimpleEditor extends AbstractCellEditor implements TableCellEditor
{

	public SimpleEditor(int displayType, boolean overwrite)
	{
		if (displayType == DisplayType.YesNo)
		{
			m_editor = new VCheckBox();
		}
		else if (DisplayType.isNumeric(displayType))
		{
			m_editor = new SimpleNumericTextField();
			((SimpleNumericTextField) m_editor).setDisplayType(displayType);
		}		
		if (m_editor == null)
			m_editor = new VString();
		m_overwrite = overwrite;
	}

	private VEditor m_editor = null;
	private Class mc_c = null;
	private boolean m_overwrite = false;

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
		if (m_editor == null)
			System.out.println("X");
		if (m_overwrite )
			m_editor.setValue(null);
		else
			m_editor.setValue(value);
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

}   
