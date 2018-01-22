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
package org.compiere.apps;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.xendra.plaf.XendraPLAF;
import org.compiere.db.*;
import org.compiere.plaf.*;
import java.util.logging.*;
import org.compiere.util.*;

/**
 *  Glass Pane to display "waiting" and capture events while processing.
 *
 *  @author     Jorg Janke
 *  @version    $Id: AGlassPane.java 5483 2014-10-24 16:42:20Z xapiens $
 */
public class AGlassPane extends JPanel implements MouseListener, ActionListener
{
	/**
	 *  Constructor
	 */
	public AGlassPane()
	{
		this.setOpaque(false);
		this.setVisible(false);
		this.addMouseListener(this);
	}   //  AGlassPane

	/** The Image               */
	public static Image         s_image = Env.getImage("XE10030.gif");
	/** The Message Font        */
	public static Font          s_font = new Font("Dialog", 3, 14);
	/** The Message Color       */
	public static Color         s_color = XendraPLAF.getTextColor_OK();

	/** Gap between components  */
	private static final int    GAP = 4;
	private static final int RADIUS = 30;
	private static final int NUMBER_OF_CIRCLES = 10;	 
	private int darkCircle = 0;	
	private int value = 0;
	private Timer timer;
	/** The Message             */
	private String              m_message = Msg.getMsg(Env.getCtx(), "Processing");

	/** Timer                   */
	private Timer               m_timer;
	/** Value of timer          */
	private int                 m_timervalue = 0;
	private int                 m_timermax = 0;
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(AGlassPane.class);
	
	/**
	 *  Set Message
	 *  @param AD_Message to be translated - null resets to default message
	 */
	public void setMessage(String AD_Message)
	{
		if (AD_Message == null)
			m_message = Msg.getMsg(Env.getCtx(), "Processing");
		else if (AD_Message.length() == 0)
			m_message = AD_Message;		//	nothing
		else
			m_message = Msg.getMsg(Env.getCtx(), AD_Message);
		if (isVisible())
			repaint();
	}   //  setMessage

	/**
	 *  Get Message
	 *  @return displayed message
	 */
	public String getMessage()
	{
		return m_message;
	}   //  getMessage

	
	/**************************************************************************
	 *  Set and start Busy Counter if over 2 seconds
	 *  @param time in seconds
	 */
	public void setBusyTimer (int time)
	{
		log.config("Time=" + time);
		//  should we display a progress bar?
		//if (time < 2 || CConnection.get().isTerminalServer())
		if( time == 0)			
		{
			if (m_timer != null)
				m_timer.stop();
			m_timermax = 0;
			if (isVisible()) {
				setVisible(false);
				repaint();
			}
			return;
		}
//		else if (time < 2000)
//		{
//			m_timermax = 0;
//			if (isVisible())
//				repaint();
//			return;
//		}
//		else 
//		{
//		}
		m_timermax = time;
		m_timervalue = 0;

		//  Start Timer
		if (m_timer == null) {
			m_timer = new Timer (1000, this);     //  every second
		}		
		m_timer.start();
		if (!isVisible())
			setVisible(true);
		requestFocus();
		repaint();		
	}   //  setBusyTimer

	/**
	 *  ActionListener
	 *  @param e event
	 */
	public void actionPerformed (ActionEvent e)
	{
		if (m_timermax > 0)
		{
			m_timervalue++;
			if (m_timervalue > m_timermax)
				m_timervalue = 0;
			repaint();
		}
        value++;
        darkCircle = NUMBER_OF_CIRCLES - 1 - (value % NUMBER_OF_CIRCLES);
        repaint();		
	}   //  actionPerformed

	public void activate(String text) {
		setVisible( true );
	}
	
	/**************************************************************************
	 *  Paint Component.
	 *  <pre>
	 *      image
	 *      message
	 *      progressBar
	 *  </pre>
	 *  @param g
	 */
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;	
		
		Dimension panelSize = getSize();
		g2d.setColor(new Color(1f,1f,1f, 0.4f));      //  .5 is a bit too light
		g2d.fillRect(0,0, panelSize.width, panelSize.height);
		//
		g2d.setFont(s_font);
		g2d.setColor(s_color);
		FontMetrics fm = g.getFontMetrics();
		Dimension messageSize = new Dimension (fm.stringWidth(m_message), fm.getAscent() + fm.getDescent());
		Dimension imageSize = new Dimension (s_image.getWidth(this), s_image.getHeight(this));		
		Dimension progressSize = new Dimension(10, 30);

		//  Horizontal layout
		int height = imageSize.height + GAP + messageSize.height + GAP + progressSize.height;
		if (height > panelSize.height)
		{
			log.log(Level.SEVERE, "Panel too small - height=" + panelSize.height);
			return;
		}
		int yImage = (panelSize.height/2) - (height/2);
		int yMessage = yImage + imageSize.height + GAP + fm.getAscent();		
		int yProgress = yMessage + progressSize.height + GAP;

		//  Vertical layout
		if (imageSize.width > panelSize.width || messageSize.width > panelSize.width)
		{
			log.log(Level.SEVERE, "Panel too small - width=" + panelSize.width);
			return;
		}
		int xImage = (panelSize.width/2) - (imageSize.width/2);
		int xMessage = (panelSize.width/2) - (messageSize.width/2);
		int xProgress = (panelSize.width/2) - (progressSize.width/2);

		g2d.drawImage(s_image, xImage, yImage, this);
		g2d.drawString(m_message, xMessage, yMessage);
		int circularX, circularY;
		for (int i = 0; i < NUMBER_OF_CIRCLES; i++) {
		    circularX = xProgress + (int) (RADIUS * Math.sin((360 / NUMBER_OF_CIRCLES) * i * 3.14 / 180));
		    circularY = yProgress + (int) (RADIUS * Math.cos((360 / NUMBER_OF_CIRCLES) * i * 3.14 / 180));
		    if(darkCircle == i) {
		    	g2d.setColor(Color.BLACK);
		        g2d.fillOval(circularX, circularY, 10, 10);
		    	g2d.setColor(Color.WHITE);
		        g2d.drawOval(circularX, circularY, 10, 10);
		    } else {		    	
		    	g2d.setColor(Color.GRAY);
		    	g2d.fillOval(circularX, circularY, 10, 10);
		    	g2d.setColor(Color.WHITE);
		        g2d.drawOval(circularX, circularY, 10, 10);
		    }
		}
		 
		// in timer action class
		//
	}   //  paintComponent

	/**************************************************************************
	 *  Mouse Listener
	 *  @param e
	 */
	public void mouseClicked(MouseEvent e)
	{
		if (isVisible())
			e.consume();
	}
	/**
	 *  Mouse Listener
	 *  @param e
	 */
	public void mousePressed(MouseEvent e)
	{
		if (isVisible())
			e.consume();
	}
	/**
	 *  Mouse Listener
	 *  @param e
	 */
	public void mouseReleased(MouseEvent e)
	{
		if (isVisible())
			e.consume();
	}
	/**
	 *  Mouse Listener
	 *  @param e
	 */
	public void mouseEntered(MouseEvent e)
	{
		if (isVisible())
			e.consume();
	}
	/**
	 *  Mouse Listener
	 *  @param e
	 */
	public void mouseExited(MouseEvent e)
	{
		if (isVisible())
			e.consume();
	}

}   //  AGlassPane
