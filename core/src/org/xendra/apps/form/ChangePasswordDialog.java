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
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;

import javax.swing.*;

import org.compiere.apps.*;
import org.compiere.grid.ed.VNumber;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MConversionRate;
import org.compiere.model.MConversionType;
import org.compiere.model.MCurrency;
import org.compiere.model.MUser;
import org.compiere.swing.*;
import org.compiere.util.Env;
import org.compiere.util.Msg;


/**
 *	ChangePasswordDialog Dialog
 *	
 *  @author xapiens
 */
public class ChangePasswordDialog extends CDialog
{

	/**
	 * 	Constructor
	 * 	@param owner frame
	 */
	public ChangePasswordDialog (JFrame owner)
	{
		super (owner, true);
		setTitle("cambia password");		
		//
		jbInit();
		this.setPreferredSize(new Dimension(400,200));
		//
		AEnv.showCenterWindow(owner, this);
	}	//	ChangePasswordDialog

	private CButton		bOK = ConfirmPanel.createOKButton("OK");
	private CButton		bCancel = ConfirmPanel.createCancelButton("Cancel");
	private CLabel passwordLabel = new CLabel("nuevo password:");
	private CLabel confirmpasswordLabel = new CLabel("confirma password");
	private JPasswordField passwordField = new JPasswordField();
	private JPasswordField confirmpasswordField = new JPasswordField();
	private CPanel customizePane = new CPanel();
	private Boolean m_ok = true;
	/**
	 * 	Static Layout
	 */
	private void jbInit()
	{
		getContentPane().setLayout(new BorderLayout());
		
		passwordLabel.setRequestFocusEnabled(false);
		passwordLabel.setLabelFor(passwordField);
		confirmpasswordLabel.setRequestFocusEnabled(false);
		confirmpasswordLabel.setLabelFor(confirmpasswordField);		
		
		//
		GridBagLayout customizeLayout = new GridBagLayout();
		customizePane.setLayout(customizeLayout);
		customizePane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		customizePane.setLayout(new GridBagLayout());					
		customizePane.add(passwordLabel,        new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0	,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		customizePane.add(passwordField,        new GridBagConstraints(1, 0, 3, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 5, 2), 0, 0));			
		customizePane.add(confirmpasswordLabel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0	,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		customizePane.add(confirmpasswordField, new GridBagConstraints(1, 1, 3, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 0), 0, 0));

		getContentPane().add (customizePane, BorderLayout.CENTER);
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
		if (e.getSource() == bOK )
		{
			String password1 = String.valueOf(passwordField.getPassword());
			String password2 = String.valueOf(confirmpasswordField.getPassword());
			if (password1.equals(password2))
			{
				Integer AD_User_ID = Env.getContextAsInt(Env.getCtx(), "#AD_User_ID");
				MUser user = MUser.get(Env.getCtx(), AD_User_ID);
				user.setPassword(password1);
				user.setIsChangePassword(false);
				Env.setContext(Env.getCtx(), "#IsChangePassword", "N");
				if (user.save())
				{
					ADialog.info(0, this, "contraseña cambiada exitosamente");
				}
			}
			else
			{
				//ADialog.info(m_WindowNo, this, "");
				ADialog.info(0, this, "no coincide la contraseña");
			}
		}
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
		
}	//	ChangePasswordDialog
