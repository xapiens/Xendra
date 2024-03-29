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
import java.awt.event.*;
import javax.swing.*;

import org.xendra.plaf.XendraPLAF;
import org.xendra.swing.LED;
import org.compiere.apps.ADialog;
import org.compiere.model.DataStatusEvent;
import org.compiere.plaf.*;
import org.compiere.swing.*;
import org.compiere.util.*;


/**
 *  Status Bar
 *
 *  @author 	Jorg Janke
 *  @version 	$Id: StatusBar.java 1141 2010-01-27 04:26:28Z xapiens $
 */
public class StatusBar extends JPanel
{
	/**
	 *	Standard Status Bar
	 */
	public StatusBar()
	{
		this(false);
	}	//	StatusBar

	/**
	 *	Status Bar with additional info
	 *  @param withInfo with info
	 */
	public StatusBar (boolean withInfo)
	{
		super();
		try
		{
			jbInit();
		}
		catch (Exception e)
		{}
		this.setName("statusBar");
		if (!withInfo)
			infoLine.setVisible(false);
	}	//	StatusBar

	private BorderLayout mainLayout = new BorderLayout();
	private JLabel statusLine = new JLabel();
	//private JLabel statusDB = new JLabel();
	private JLabel infoLine = new JLabel();
	//
	private boolean		mt_error;
	private String		mt_text;
	//
	private String      m_text;
	private DataStatusEvent m_dse = null;
	private boolean m_showDialog = false;

	/**
	 *	Static Init
	 *  @throws Exception
	 */
	private void jbInit() throws Exception
	{
		statusLine.setBorder(BorderFactory.createEtchedBorder());
		statusLine.setText("statusLine");
		statusLine.setOpaque(false);
//		statusDB.setForeground(Color.blue);
//		statusDB.setBorder(BorderFactory.createEtchedBorder());
//		statusDB.setText("#");
//		statusDB.setOpaque(false);
//		statusDB.addMouseListener(new StatusBar_mouseAdapter(this));
		this.setLayout(mainLayout);
		infoLine.setFont(XendraPLAF.getFont_Label());
		infoLine.setBorder(BorderFactory.createRaisedBevelBorder());
		infoLine.setHorizontalAlignment(SwingConstants.CENTER);
		infoLine.setHorizontalTextPosition(SwingConstants.CENTER);
		infoLine.setText("info");
		mainLayout.setHgap(2);
		mainLayout.setVgap(2);
		this.add(statusLine, BorderLayout.CENTER);
		//this.add(statusDB, BorderLayout.EAST);
		this.add(infoLine, BorderLayout.NORTH);
	}	//	jbInit

	
	/**************************************************************************
	 *	Set Standard Status Line (non error)
	 *  @param text text
	 */
	public void setStatusLine (String text)
	{
		if (text == null)
			setStatusLine("", false);
		else
			setStatusLine(text, false);
	}	//	setStatusLine

	/**
	 *	Set Status Line
	 *  @param text text
	 *  @param error error
	 */
	public void setStatusLine (String text, boolean error)
	{
		mt_error = error;
		mt_text = text;
		
		if (mt_error)
		{
			if (m_showDialog)
				ADialog.error(0, this, "Error", mt_text);
			statusLine.setForeground(XendraPLAF.getTextColor_Issue());
		}
		else
			statusLine.setForeground(XendraPLAF.getTextColor_OK());
		statusLine.setText(" " + mt_text);
		//
		Thread.yield();
	}	//	setStatusLine

	/**
	 * Gets the internal error status set in setStatusLine.
	 * @return true if error set, flase if doesn't.
	 */
	public boolean getErrorStatus() {
		return mt_error;
	}

	/**
	 *	Get Status Line text
	 *  @return StatusLine text
	 */
	public String getStatusLine ()
	{
		return statusLine.getText().trim();
	}	//	setStatusLine

	/**
	 *  Set ToolTip of StatusLine
	 *  @param tip tip
	 */
	public void setStatusToolTip (String tip)
	{
		statusLine.setToolTipText(tip);
	}   //  setStatusToolTip


	/**
	 *	Set Info Line
	 *  @param text text
	 */
	public void setInfo (String text)
	{
		if (!infoLine.isVisible())
			infoLine.setVisible(true);
		infoLine.setText(text);
	}	//	setInfo

	/**
	 *	Add Component to East of StatusBar
	 *  @param component component
	 */
	public void addStatusComponent (JComponent component)
	{
		this.add(component, BorderLayout.EAST);
	}   //  addStatusComponent

	public void setDialog(boolean b) {
		m_showDialog = b;		
	}

	public void addright(LED ledJMSServer) {
		// TODO Auto-generated method stub
		
	}

}	//	StatusBar

