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
package org.xendra.pos;

import java.awt.DefaultKeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import org.compiere.util.CLogger;

/**
 * Class for managing all key events.
 * @author Sergio Aguayo
 * @version $Id$
 *
 */
public class PosKeyEventHandler extends DefaultKeyboardFocusManager implements ActionListener {

	/**
	 * Callback for notifying about key events.
	 */
	PosKeyEventInterface parent = null;

	/**
	 *  FirstIn First Out List 
	 */
	private LinkedList<KeyEvent>	m_fifo = new LinkedList<KeyEvent>();

	/**
	 *  Timer 
	 */
	private javax.swing.Timer m_timer = null;

	/**	
	 * Logger			
	 */
	private static CLogger log = CLogger.getCLogger(PosKeyEventHandler.class);

	/**
	 * PosKeyboardFocusManager
	 */
	public PosKeyEventHandler(PosKeyEventInterface parent) {
		super();
		this.parent = parent;
	} 


	/**
	 * Cleans our stuff.
	 */
	public void dispose() {
		if (m_timer != null)
			m_timer.stop();
		m_timer = null;
		if (m_fifo != null)
			m_fifo.clear();
		m_fifo = null;
	}

	/**
	 * Start Timer
	 */
	public void start() {
		//	Unqueue time - 200 ms
		int delay = 200;
		log.fine("PosKeyboardFocusManager.start - " + delay); 
		if (m_timer == null)
			m_timer = new javax.swing.Timer(delay, this);
		if (!m_timer.isRunning())
			m_timer.start();
	}

	/**
	 * Stop Timer
	 */
	public void stop() {
		log.fine("PosKeyboardFocusManager.stop - " + m_timer); 

		if (m_timer != null)
			m_timer.stop();
	}

	/**
	 * Dispatch Key Event - queue
	 * 
	 * @param event	The event that has occured (may or not be key-related).
	 *            event
	 * @return true
	 */
	public boolean dispatchKeyEvent(KeyEvent event) {
		if (m_timer == null)
			super.dispatchKeyEvent(event);
		else
			m_fifo.add(event);
		if (event.getID() == KeyEvent.KEY_PRESSED) {
			parent.keyHandler(event);
		}		
		return true;
	}

	/**
	 * Action Performed - unqueue
	 * 
	 * @param e The event that occured.
	 *            
	 */
	public void actionPerformed(ActionEvent e) {
		if (m_timer == null)
			return;
		while (m_fifo.size() > 0) {
			KeyEvent event = (KeyEvent) m_fifo.removeFirst();
			super.dispatchKeyEvent(event);
		}
	}

}
