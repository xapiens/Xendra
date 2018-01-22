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
import java.math.BigDecimal;

import javax.swing.*;

import org.compiere.apps.*;
import org.compiere.grid.ed.VNumber;
import org.compiere.model.MInvoice;
import org.compiere.swing.*;
import org.compiere.util.Env;
import org.compiere.util.Msg;


/**
 *	VoidTransaction Dialog
 *	
 *  @author xapiens
 */
public class VoidTransactionDialog extends CDialog
{

	/**
	 * 	Constructor
	 * 	@param owner frame
	 * @param m_WindowNo 
	 */
	public VoidTransactionDialog (JFrame owner,int pWindowNo, MInvoice invoice)
	{
		super (owner, true);
	
		m_WindowNo = pWindowNo;
		
		//m_GrandTotal = amount;
		m_invoice = invoice;
		
		setTitle(Msg.getMsg(Env.getCtx(), "VoidTransaction"));
		//
		jbInit();
		//
		
        addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent ce) {
            	fAmount.requestFocus();
            }
        });		
		AEnv.showCenterWindow(owner, this);
	}	//	DescriptionDialog

	private CLabel 		lAmount = new CLabel(Msg.translate(Env.getCtx(), "GrandTotal"));
	private VNumber 	fAmount = new VNumber();
	//private BigDecimal  m_GrandTotal = Env.ZERO;
	private MInvoice 	m_invoice = null;
	private CButton		bOK = ConfirmPanel.createOKButton("OK");
	private CButton		bCancel = ConfirmPanel.createCancelButton("Cancel");
	private boolean		m_ok = false;
	private int         m_WindowNo = 0;
	
	/**
	 * 	Static Layout
	 */
	private void jbInit()
	{
		CPanel panel = new CPanel(new ALayout());
		panel.add(lAmount, new ALayoutConstraint(0, 0));
		panel.add(fAmount, null);
		fAmount.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
		fAmount.getInputMap(JComponent.WHEN_FOCUSED)		     	.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");		      		      
		Action actions = new AbstractAction() {

	    	  public void actionPerformed(ActionEvent ae) {
	    		  BigDecimal AmountToCheck = (BigDecimal) fAmount.getValue();
	    		  if (m_invoice.getGrandTotal().compareTo(AmountToCheck) == 0)
	    		  {
	    			  m_ok = true;
	    			  dispose();
	    		  }
	    		  else
	    			  ADialog.info(m_WindowNo,null, "El total ingresado no coincide con el total del documento, verifique si esta anulando el documento correcto");
	    	  }
	      }; 		      		      
	    fAmount.getActionMap().put("KEYENTER", actions);		      
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add (panel, BorderLayout.CENTER);
		//
		CPanel confirmPanel = new CPanel(new FlowLayout(FlowLayout.RIGHT));
		confirmPanel.add(bCancel);
		confirmPanel.add(bOK);
		getContentPane().add (confirmPanel, BorderLayout.SOUTH);
		//
		bCancel.addActionListener(this);
		bOK.addActionListener(this);

	}	//	jbInit
	
	/**
	 * 	Action Listener
	 *	@param e evt
	 */
	public void actionPerformed (ActionEvent e)
	{
		  if (e.getSource().equals(bOK))
		  {
			  BigDecimal AmountToCheck = Env.ZERO;
			  if (fAmount.getValue() != null)
				  AmountToCheck = (BigDecimal) fAmount.getValue(); 
			  if (m_invoice.getGrandTotal().compareTo(AmountToCheck) == 0)
			  {
				  m_ok = true;
				  dispose();
			  }
		  }
		  else if (e.getSource().equals(bCancel))
		  	dispose();
	}	//	actionPerformed
	
	/**
	 * 	OK Pressed
	 *	@return true if OK
	 */
	public boolean isOK()
	{
		return m_ok;
	}	//	isOK
	
}	//	DescriptionDialog
