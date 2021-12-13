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
package org.xendra.pos;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.math.*;
import java.sql.*;
import java.util.EventObject;

import javax.swing.*;
import javax.swing.table.*;
import org.compiere.grid.ed.*;
import org.compiere.util.*;

/**
 *  MiniTable Cell Editor based on class - Timestamp, BigDecimal
 *
 *  @author     Jorg Janke
 *  @version    $Id: MiniCellEditor.java 1150 2010-02-03 19:45:20Z xapiens $
 */
public class POSCellEditor extends AbstractCellEditor implements TableCellEditor
{
	/**
	 */
	private static final long serialVersionUID = 1L;
	private int m_displayType;
	private boolean decimal;
	/**
	 *  Default Constructor
	 * @param ColumnClass 
	 *  @param c Class
	 */
	
	public POSCellEditor(int displayType)
	{
		super();
		m_displayType = displayType;
		//mc_c = c;
		//  Date
		//if (c.equals("Timestamp"))
		if (DisplayType.isDate(m_displayType))
			m_editor = new VDate();
		//else if (c.equals("BigDecimal"))
		else if (DisplayType.isNumeric(m_displayType))
			m_editor = new VNumber("Amount", false, false, true, DisplayType.Amount, "Amount") 
			 {
				protected boolean processKeyBinding(KeyStroke ks, KeyEvent e, int condition, boolean pressed) {
										
					//if (!Character.isIdentifierIgnorable(e.getKeyChar()) && pressed)
					//{
						//super.processKeyBinding(ks, e, condition, pressed);
						if (!pressed)
							((JComponent)m_editor).grabFocus();
						else
						{
							Object value = m_editor.getValue();						
							if (value instanceof BigDecimal)
							{
								BigDecimal previousvalue = (BigDecimal) value;
								previousvalue = previousvalue.stripTrailingZeros();
								String temp = previousvalue.toString();
								//if (previousvalue.equals(Env.ZERO))
								//{
									switch (e.getKeyChar())
									{
										//	Number		===============================
										case '0':		case '1':		case '2':
										case '3':		case '4':		case '5':
										case '6':		case '7':		case '8':
										case '9':	    //case '.':		case ',':
										{
											//String temp = previou e.getKeyChar();
											//value = new BigDecimal(String.valueOf(e.getKeyChar()));
											temp = temp + String.valueOf(e.getKeyChar());
											//m_editor.setValue(value);
											BigDecimal xq = new BigDecimal(temp);
											System.out.println(" poscelleditor: "+xq.toString());
											m_editor.setValue(xq);
//											((JComponent)m_editor).grabFocus();
//											((JComponent)m_editor).invalidate();
//											((JComponent)m_editor).validate();
//											//((JComponent)m_editor)
//											((JComponent)m_editor).repaint();
//											c.invalidate();
//											c.pack();
//											c.validate();
//											c.repaint();

										}
									}
								//}
//								if (e.getKeyCode() == KeyEvent.VK_ENTER)	//	10
//								{
//									((JComponent)getParent()).grabFocus();
//									//((JComponent)m_editor).getParent();
//									//((JComponent)m_editor).
//									return false;
//								}
							}
						}
						//FocusEvent evt = new FocusEvent((Component) m_editor, FocusEvent.FOCUS_GAINED);
						//super.processFocusEvent(evt);						
								//						if (pressed)
//							((VNumber)m_editor).keyPressed(e);
//						else			
//						{
//						    ((VNumber)m_editor).keyReleased(e);
//						    //((JComponent)m_editor).grabFocus();
//						}
						//((VNumber)m_editor).keyTyped(e);
//						FocusEvent evt = new FocusEvent((Component) m_editor, FocusEvent.FOCUS_GAINED);
						//((JComponent)m_editor).grabFocus();
//						super.processFocusEvent(evt);
//						((JComponent)m_editor).grabFocus();
//						
//						Object value = m_editor.getValue();
//						if (value instanceof BigDecimal)
//						{
//							BigDecimal previousvalue = (BigDecimal) m_editor.getValue();
//							previousvalue = previousvalue.stripTrailingZeros();
//							switch (e.getKeyChar())
//							{
//								//	Number		===============================
//								case '0':		case '1':		case '2':
//								case '3':		case '4':		case '5':
//								case '6':		case '7':		case '8':
//								case '9':	    case '.':		case ',':
//								{
//									String temp = previousvalue.toString() + e.getKeyChar();
//									value = new BigDecimal(temp);
//								}
//							}
//							//String otra = m_editor.getDisplay();
////							if (e.getKeyChar()=='.')
////							{
////								if (!decimal)
////									decimal = true;
////							}
//							//previousvalue = previousvalue + e.getKeyChar();
//							//value = new BigDecimal(previousvalue);
//						}
//						//String previousvalue = m_editor.getValue().toString();
//						//previousvalue = previousvalue + e.getKeyChar();
//				//		m_editor.setValue(value);
//						//((JComponent)m_editor).setRequestFocusEnabled(true);
//					//	((Component)m_editor).dispatchEvent(new FocusEvent((Component) m_editor, FocusEvent.FOCUS_GAINED));
//						//super.processFocusEvent();
//						((VNumber)m_editor).keyPressed(e);
//						//((VNumber)m_editor).keyReleased(e);
//						FocusEvent evt = new FocusEvent((Component) m_editor, FocusEvent.FOCUS_GAINED);
//						//((JComponent)m_editor).grabFocus();
//						super.processFocusEvent(evt);
//						((JComponent)m_editor).grabFocus();
//						//((JComponent)m_editor).setRequestFocusEnabled(true);
						boolean retValue =	super.processKeyBinding(ks, e, condition, pressed);
						return retValue;
					//}
					//return false;
				}
		};
		//else if (DisplayType.i(m_displayType))
		//	m_editor = new VNumber("Number", false, false, true, DisplayType.Number, "Number");
		//else if (c.equals("Integer"))
		//	m_editor = new VNumber("Integer", false, false, true, DisplayType.Integer, "Integer");
		else
			m_editor = new VString();

	}   //  MiniCellEditor

	private VEditor m_editor = null;
	//private Class mc_c = null;

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
		m_editor.setValue(value);
		//	Set UI
		m_editor.setBorder(null);
		m_editor.setFont(table.getFont());
		//table.grabFocus();
		return (Component)m_editor;
	}	//	getTableCellEditorComponent

	/**
	 *	Returns the value contained in the editor
	 *  @return value
	 */
	public Object getCellEditorValue()
	{
		if (m_editor != null)
		{
			System.out.println(" getCellEditorValue:" + m_editor.getValue());
			return m_editor.getValue();
		}
		return null;
	}	//	getCellEditorValue

//	@Override
//	public boolean isCellEditable(EventObject anEvent)
//    {
//		if (anEvent instanceof KeyEvent) {
//			final KeyEvent keyEvent = (KeyEvent) anEvent;
//			SwingUtilities.invokeLater(new Runnable() {
//				public void run() {
//					if (!Character.isIdentifierIgnorable(keyEvent.getKeyChar())){
//						String previousvalue = m_editor.getValue().toString();
//						previousvalue = previousvalue + keyEvent.getKeyChar();
//						m_editor.setValue(previousvalue);
//					}
//				}
//			}
//					
//			);
//		}
//		return super.isCellEditable(anEvent);
//    }
	

}   //  POSCellEditor
