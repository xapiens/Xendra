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
import java.awt.event.*;
import java.beans.*;
import java.math.*;
import java.text.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.text.*;
import org.compiere.apps.*;
import org.compiere.grid.ed.Calculator;
import org.compiere.grid.ed.MDocNumber;
import org.compiere.grid.ed.VEditor;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.ValuePreference;
import org.compiere.model.GridField;
import org.compiere.swing.*;
import org.compiere.util.*;


/**
 *	Number Control
 *
 * 	@author 	Jorg Janke
 * 	@version 	$Id: VNumber.java 1885 2010-10-30 21:19:27Z xapiens $
 */
public class SimpleNumericTextField extends JTextField
	implements VEditor, ActionListener, KeyListener, FocusListener
{
	private String m_oldText;
	protected int			m_displayType;	//  Currency / UoM via Context
	private DecimalFormat	m_format;
	private boolean			m_setting;
	private String m_initialText;
	private boolean m_modified;
	private static CLogger log = CLogger.getCLogger(SimpleNumericTextField.class);

	public void setDisplayType (int displayType)
	{
		m_displayType = displayType;
		if (!DisplayType.isNumeric(displayType))
			m_displayType = DisplayType.Number;
		m_format = DisplayType.getNumberFormat(displayType);
	}   //  setDisplayType


	public void setReadWrite(boolean rw) {
		setEditable(rw);		
	}

	public boolean isReadWrite() {
		return isEditable();
	}

	public void setMandatory(boolean mandatory) {
		
	}

	public boolean isMandatory() {
		return false;
	}

	public void setBackground(boolean error) {
		
	}

	public void setValue(Object value) {
		if ( value == null)
		{
			m_oldText = "";
		}
		else
		{
			m_oldText = m_format.format(value);
		}
		if (m_setting)
			return;
		setText (m_oldText);
		m_initialText = m_oldText;
		m_modified = false;		
//		if ( value instanceof BigDecimal)
//		{
//			this.setText(value.toString());			
//		}
	}

	@Override
	public Object getValue() {	
		if (getText() == null || getText().length() == 0)
			return null;
		String value = getText();
		//	return 0 if text deleted
		if (value == null || value.length() == 0)
		{
			if (!m_modified)
				return null;
			if (m_displayType == DisplayType.Integer)
				return new Integer(0);
			return Env.ZERO;
		}
		if (value.equals(".") || value.equals(",") || value.equals("-"))
			value = "0";
		try
		{
			Number number = m_format.parse(value);
			value = number.toString();      //	converts it to US w/o thousands
			BigDecimal bd = new BigDecimal(value);
			if (m_displayType == DisplayType.Integer)
				return new Integer(bd.intValue());
			if (bd.signum() == 0)
				return bd;
			return bd.setScale(m_format.getMaximumFractionDigits(), BigDecimal.ROUND_HALF_UP);
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "Value=" + value, e);
		}
		if (m_displayType == DisplayType.Integer)
			return new Integer(0);
		return Env.ZERO;
	}

	public String getDisplay() {
		return null;
	}

	public void propertyChange(PropertyChangeEvent arg0) {
		
	}

	public void focusGained(FocusEvent arg0) {
	}

	public void focusLost(FocusEvent arg0) {
	}

	public void keyPressed(KeyEvent arg0) {
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
		
	}

	public void actionPerformed(ActionEvent arg0) {
	}

	public void setField(GridField mField) {
		
	}

	public void dispose() {
		
	}
}	//	SimpleTextField
