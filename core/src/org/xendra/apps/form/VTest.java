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

//import org.xendra.pos.DefaultTableViewModel;
import java.awt.*;
import java.awt.event.*;

import java.awt.BorderLayout;
import java.io.File;
import java.util.logging.Level;

import javax.swing.*;
import javax.swing.event.*;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.AMenu;
import org.compiere.apps.ProcessModalDialog;
import org.compiere.apps.StatusBar;
import org.compiere.grid.ed.VLookup;

import org.compiere.plaf.CompiereColor;
import org.compiere.swing.CFrame;
import org.compiere.swing.CPanel;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Msg;

/**
 *	Template
 *
 * 	@author 	xapiens
 * 	@version 	$Id: 
 */
public class VTest extends CFrame implements FormPanel
{

	private int m_WindowNo;
	private FormFrame m_frame;
	private BorderLayout mainLayout = new BorderLayout(); 
	private CPanel mainPanel = new CPanel();
	private StatusBar statusBar = new StatusBar();
	private static File REPORT_HOME = null;

	private static CLogger log = CLogger.getCLogger(VBoeGen.class);

	public void init(int WindowNo, FormFrame frame) {
		m_WindowNo = WindowNo;
		m_frame = frame;		
		try
		{
			dynInit();
			jbInit();
			frame.getContentPane().add(this.mainPanel, BorderLayout.NORTH);
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
		mainPanel.add(new VLookup());
		this.add(mainPanel);
//		int processID = 1000;
//		
//		ProcessModalDialog dialog = new ProcessModalDialog(Env.getCtx(), Env.getWindow(m_WindowNo), Env.getHeader(Env.getCtx(), m_WindowNo),
//				this, m_WindowNo, processID, table_ID,
//				record_ID, startWOasking);
//		if (dialog.isValid())
//		{
//			dialog.validate();
//			dialog.pack();
//			AEnv.showCenterWindow(Env.getWindow(m_WindowNo), dialog);
//		}
		

		

	}

	private void dynInit() {
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "BillOfExchangeGenerationStatus"));
		statusBar.setStatusDB("");
		
	}	
	public void dispose() {
		if (m_frame != null)
			m_frame.dispose();
		m_frame = null;			
	}
	public boolean candispose() {
		return true;
	}		
}