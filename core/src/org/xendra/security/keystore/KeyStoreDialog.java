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
package org.xendra.security.keystore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.compiere.apps.*;
import org.compiere.swing.*;
import net.miginfocom.swing.MigLayout;


/**
 *	Key Store Dialog
 *	
 *  @author Jorg Janke
 *  @version $Id: KeyStoreDialog.java,v 1.1 2007/06/15 00:16:54 sergioaguayo Exp $
 */
public class KeyStoreDialog extends CDialog
{

	/**
	 * 	Constructor
	 * 	@param owner frame
	 *	@param cn common name
	 *	@param ou org unit
	 *	@param o organization
	 *	@param l locale
	 *	@param s state
	 *	@param c country
	 *	@throws HeadlessException
	 */
	//public KeyStoreDialog (JFrame owner,
	  public KeyStoreDialog (String cn, String ou, String o, String l, String s, String c)
		throws HeadlessException
	{
		//super (owner, true);
		setTitle("Key Store Dialog");
		//
		jbInit();
		setValues(cn, ou, o, l, s, c);
		//
		//AEnv.showCenterWindow(owner, this);
		this.setModal(true);
		AEnv.showCenterWindow(null, this);
	}	//	KeyStoreDialog

	private CLabel 		lCN = new CLabel("(ON) Common Name");
	private CTextField 	fCN = new CTextField(20);
	private CLabel 		lOU = new CLabel("(OU) Organization Unit");
	private CTextField 	fOU = new CTextField(20);
	private CLabel 		lO = new CLabel("(O) Organization");
	private CTextField 	fO = new CTextField(20);
	private CLabel 		lL = new CLabel("(L) Locale/Town");
	private CTextField 	fL = new CTextField(20);
	private CLabel 		lS = new CLabel("(S) State");
	private CTextField 	fS = new CTextField(20);
	private CLabel 		lC = new CLabel("(C) Country (2 Char)");
	private CTextField 	fC = new CTextField(2);

	private CButton		bOK = ConfirmPanel.createOKButton("OK");
	private CButton		bCancel = ConfirmPanel.createCancelButton("Cancel");
	private boolean		m_ok = false;
	
	/**
	 * 	Static Layout
	 */
	private void jbInit()
	{
		CPanel panel = new CPanel(new ALayout());
		panel.setLayout(new MigLayout("", "[181px][252px]", "[19px][19px][19px][19px][19px][19px]"));
		panel.add(lCN, "cell 0 0,growx,aligny center");
		panel.add(fCN, "cell 1 0,growx,aligny top");
		panel.add(lOU, "cell 0 1,growx,aligny center");
		panel.add(fOU, "cell 1 1,growx,aligny top");
		panel.add(lO, "cell 0 2,growx,aligny center");
		panel.add(fO, "cell 1 2,growx,aligny top");
		panel.add(lL, "cell 0 3,growx,aligny center");
		panel.add(fL, "cell 1 3,growx,aligny top");
		panel.add(lS, "cell 0 4,growx,aligny center");
		panel.add(fS, "cell 1 4,growx,aligny top");
		panel.add(lC, "cell 0 5,growx,aligny center");
		panel.add(fC, "cell 1 5,growx,aligny top");
		//panel.setPreferredSize(new Dimension(400,150));
		//
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
		if (e.getSource() == bOK)
			m_ok = true;
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
	
	/**
	 * 	Set Values
	 *	@param cn common name
	 *	@param ou org unit
	 *	@param o organization
	 *	@param l locale
	 *	@param s state
	 *	@param c country
	 */
	public void setValues(String cn, String ou, String o, String l, String s, String c)
	{
		fCN.setText(cn);
		fOU.setText(ou);
		fO.setText(o);
		fL.setText(l);
		fS.setText(s);
		fC.setText(c);
	}	//	setValues

	/**
	 * 	Get CN
	 *	@return common name
	 */
	public String getCN()
	{
		return fCN.getText();
	}
	/**
	 * 	Get OU
	 *	@return organizational unit
	 */
	public String getOU()
	{
		return fOU.getText();
	}
	/**
	 * 	Get O
	 *	@return organization
	 */
	public String getO()
	{
		return fO.getText();
	}
	/**
	 * 	Get L
	 *	@return location/town
	 */
	public String getL()
	{
		return fL.getText();
	}
	/**
	 * 	Get S
	 *	@return state
	 */
	public String getS()
	{
		return fS.getText();
	}
	/**
	 * 	Get C
	 *	@return country
	 */
	public String getC()
	{
		return fC.getText();
	}
	
}	//	KeyStoreDialog
