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
package org.xendra.apps.form;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

import javax.swing.*;

import org.compiere.apps.*;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.GridWindow;
import org.compiere.model.GridWindowVO;
import org.compiere.model.MColumn;
import org.compiere.model.MOrder;
import org.compiere.model.MWindow;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.swing.*;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.grid.VPanel;
import org.compiere.grid.ed.VEditor;
import org.compiere.grid.ed.VEditorFactory;
import org.compiere.grid.ed.VLookup;

/**
 *	DescriptionDialog Dialog
 *	
 *  @author xapiens
 */
public class DescriptionDialog extends CDialog implements VetoableChangeListener
{
	/**	Window No			*/
	private int         	m_WindowNo = 0;
	//private int m_C_Order_ID = 0;
	private MOrder order = null;
	private String defaultLayoutConstraints;
	private GridWindow m_mWindow;
	private GridTab m_mTab;
	private VPanel panel;
	
	private CButton		bOK = ConfirmPanel.createOKButton("OK");
	private CButton		bCancel = ConfirmPanel.createCancelButton("Cancel");
	private boolean		m_ok = false;
	CLabel lblVendedor;
	VLookup fieldSalesRep;
	CLabel lblDocumentno;
	CTextField pickDocumentNo;
	CCheckBox checkNew;

	
	public DescriptionDialog()
	{
		Initialize(null);
	}
	private void Initialize(MOrder order) {
		if (order == null)
		{
			
		}
		panel = new VPanel("name",0);		
		//MWindow window = new MWindow.getbyIdentifier("20e4f577-543f-2eef-00a1-a0538af1fd6e", null);
		MWindow window = null;
		if (order.isSOTrx())
		{
			window = new MWindow (Env.getCtx(), 143, null); 
		}
		else
		{
			//window = new MWindow (Env.getCtx(), 181, null);
			window = new Query(Env.getCtx(), MWindow.Table_Name, "identifier = ?", null)
				.setParameters("041b9539-24f3-7494-c2fa-c360634d60b2").first();
		}
		if (window != null && window.getAD_Window_ID() > 0)
		{						
			GridWindowVO wVO = AEnv.getMWindowVO (m_WindowNo, window.getAD_Window_ID(), 0);
			m_mWindow = new GridWindow (wVO);
			m_mTab = m_mWindow.getTab(0);
			m_mWindow.initTab(0);
			int fields = m_mTab.getFieldCount();
			for (int i=0; i < fields; i++)
			{
				GridField mField = m_mTab.getField(i);
				MColumn column = MColumn.get(Env.getCtx(), mField.getAD_Column_ID());
				//mField.setValue(, false);
				//mField.setValueValidate(order.get_Value(column.getName()), false);
				if (mField.isDisplayed() && mField.isMandatory(false) && mField.isEditable(false) && mField.isUpdateable() 
						&& (column.getAD_Reference_ID() == DisplayType.Text || 
							column.getAD_Reference_ID() == DisplayType.Amount ||
							column.getAD_Reference_ID() == DisplayType.Date || 
							column.getAD_Reference_ID() == DisplayType.DateTime || 
							column.getAD_Reference_ID() == DisplayType.List)
						|| mField.getColumnName().equals(X_C_Order.COLUMNNAME_Description)
						|| mField.getColumnName().equals(X_C_Order.COLUMNNAME_DateOrdered)
						|| mField.getColumnName().equals(X_C_Order.COLUMNNAME_C_BPartner_ID))							
				{
					VEditor vEditor = VEditorFactory.getEditor(m_mTab, mField, false);
					if (vEditor == null)
					{						
						continue;
					}
					vEditor.setValue(order.get_Value(column.getColumnName()));
					//  MField => VEditor - New Field value to be updated to editor
					mField.addPropertyChangeListener(vEditor);
					//  VEditor => this - New Editor value to be updated here (MTable)
					vEditor.addVetoableChangeListener(this);					
					//  Add to VPanel
					//panel.addFieldBuffered(vEditor, mField);
					panel.addField(vEditor, mField);
					//  APanel Listen to buttons
//					if (mField.getDisplayType() == DisplayType.Button && m_aPanel != null)
//						((JButton)vEditor).addActionListener (m_aPanel);
				}				
			}
			
			//			
		}				
		getContentPane().add (panel, BorderLayout.CENTER);
		
		CPanel confirmPanel = new CPanel(new FlowLayout(FlowLayout.RIGHT));
		
		confirmPanel.add(bCancel);
		confirmPanel.add(bOK);
		getContentPane().add (confirmPanel, BorderLayout.SOUTH);
		//
		bCancel.addActionListener(this);
		bOK.addActionListener(this);		
	}

	/**
	 * 	Constructor
	 * 	@param owner frame
	 */
	public DescriptionDialog (JFrame owner,MOrder order, String trxName)
	{
		super (owner, true);
		setTitle(Msg.getMsg(Env.getCtx(), "Description"));
		//
        java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
        forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);					
		if (order != null)
		{			
			Initialize(order);
			this.order = order;
		}
		//
		AEnv.showCenterWindow(owner, this);
	}	//	DescriptionDialog
	
	/**
	 * 	Action Listener
	 *	@param e evt
	 */
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource().equals(fieldSalesRep))
		{
			Object value = fieldSalesRep.getValue();
			if (value == null || ( value != null && value.toString().length()==0) )
			{
				if (fieldSalesRep.isMandatory())
				{
					fieldSalesRep.requestFocus();
					return;
				}
			}
		}
				
		if (e.getSource() == bOK)
		{			
			m_ok = true;
			dispose();
		}
		else if (e.getSource() == bCancel)
		{
			m_ok = false;
			dispose();
		}
	}	//	actionPerformed
	
	/**
	 * 	OK Pressed
	 *	@return true if OK
	 */
	public boolean isOK()
	{
		return m_ok;
	}	//	isOK
	
	public MOrder getOrder()
	{
		return order;
	}
	
	public Boolean IsNew() {
		return (Boolean) checkNew.getValue();
	}
	@Override
	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {
		Object newValue = e.getNewValue();
		if (newValue != null)
		{			
			order.set_ValueOfColumn(e.getPropertyName(), newValue);
			System.out.println(newValue);
		}
	}	
}	//	DescriptionDialog