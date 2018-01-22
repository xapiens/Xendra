/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2009 Dravio SAC. All Rights Reserved.                		  *
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

package org.xendra.apps.form;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.util.logging.Level;

import javax.swing.JFrame;

import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.AEnv;
import org.compiere.apps.AMenu;
import org.compiere.apps.StatusBar;

import org.compiere.plaf.CompiereColor;
import org.compiere.swing.CFrame;
import org.compiere.swing.CPanel;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Msg;

/**
 *	Dated Check Wizard
 *
 * 	@author 	xapiens
 * 	@version 	$Id: 
 */
public class CDatedCheckWizard extends CFrame implements FormPanel
{

	private int m_WindowNo;
	private FormFrame m_Frame;
	private BorderLayout mainLayout = new BorderLayout(); 
	private CPanel mainPanel = new CPanel();
	private StatusBar statusBar = new StatusBar();;	
	private static CLogger log = CLogger.getCLogger(VBoeGen.class);

	public void init(int WindowNo, FormFrame frame) {
		m_WindowNo = WindowNo;
		m_Frame = frame;		
		try
		{
			dynInit();
			jbInit();
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
		
	}

	private void jbInit() {
		CompiereColor.setBackground(this);
		mainPanel.setLayout(mainLayout);
		
	}

	private void dynInit() {
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "DatedCheck"));
		statusBar.setStatusDB("");
	}
	
	public void dispose() {
		if (m_Frame != null)
			m_Frame.dispose();
		m_Frame = null;			
	}
	
	/**
	 * 	Start
	 * 	@param args Log Level e.g. ALL, FINE
	 */
	public static void main(String[] args)
	{		
		org.compiere.Xendra.startupEnvironment(true);
		AMenu menu = new AMenu();
		FormFrame ff = new FormFrame();
		ff.openForm("org.xendra.apps.form.CDatedCheckWizard","name");
		ff.pack();
		AEnv.addToWindowManager(ff);
		AEnv.showCenterScreen(ff);		
	}	//	main
	public boolean candispose() {
		return true;
	}	
}