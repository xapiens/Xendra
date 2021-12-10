/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2007 Dravio SAC. All Rights Reserved.                		  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.xendra.common;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.logging.Level;

import javax.swing.*;

import net.miginfocom.swing.MigLayout;

import org.compiere.apps.*;
import org.compiere.swing.*;
import org.compiere.util.*;
import org.jdesktop.fuse.InjectedResource;
import org.jdesktop.fuse.ResourceInjector;
import org.jdesktop.fuse.swing.SwingModule;

public final class ErrorPanel extends JPanel implements ICardPanel, ActionListener 
{	
	@InjectedResource
	private Font errorFont;
	
	private static CLogger log = CLogger.getCLogger(ErrorPanel.class);

	private static final String A_EXIT = "Cancelar";
	private AppsAction aExit;
	private CButton bExit;	
	private CPanel mainPanel = new CPanel();
	private Point pospanel;
	private String errormsg = "";
	private JLabel m_message = new JLabel();

	private String m_prevcard;
		
	
	public ErrorPanel (Point pos)
	{
		File resource = new File(Env.getResource("org.columba.core", "core.uitheme"));
		ResourceInjector.addModule(new SwingModule());
		ResourceInjector.get().load(resource);
		ResourceInjector.get().inject(this);
		pospanel = pos;
		try
		{
	        java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
	        forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
	        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);
			jbInit();
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "Find", e);
		}
	}

	private void jbInit() {	
		m_message.setFont(errorFont);
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer(Msg.translate(Env.getCtx(), "Cancel"));
		sb.append(" [ESC]");		
		aExit = new AppsAction (A_EXIT, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), sb.toString());
		aExit.setDelegate(this);		
		bExit = (CButton) aExit.getButton();
				
		//mainPanel.setLayout(new MigLayout("","75%,fill,grow","[fill,grow]"));
		mainPanel.setLayout(new MigLayout());
		mainPanel.add(m_message,"wrap");
		mainPanel.add(bExit);
		
		add(mainPanel);
	}	
			
	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();		
		
		if (c == bExit)
		{			
			hideform();
		}
	}	

	public void setMessage(String m_processMsg, String prevcard) {	
		setError(m_processMsg);		
		setPrevCard(prevcard);			
	}	
	
	private void setPrevCard(String prevcard) {
		if (prevcard.equals("errorpanel"))
			return;
		m_prevcard = prevcard;		
	}
	private String getPrevCard() {
		return m_prevcard;
	}

	public String getErrorMsg() { 
		return errormsg; 
	}
	
	public void setError(String error) {
		if (error != null && error.length() > 0)
		{
			errormsg = error;
			m_message.setText(Util.setMultiLineMessage(error,15,25));
		
		}
		else
		{
			errormsg = "";
		}
	}
	
	public void hideform()
	{
		setError("");
		setVisible(false);
		if (getPrevCard().equals("buttonpanel"))
			getPOSPanel().enableEnvironment();
		getPOSPanel().setError("");
		getPOSPanel().activecard(getPrevCard());		
	}	//	dispose	
	
	public Point getPOSPanel()
	{
		return pospanel;
	}
	public void selection()
	{
		bExit.grabFocus();		
		getPOSPanel().disableEnvironment();
	}

	@Override
	public void Void() {
		
	}
}