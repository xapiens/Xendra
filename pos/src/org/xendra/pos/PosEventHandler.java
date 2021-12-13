package org.xendra.pos;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import org.compiere.util.*;

public class PosEventHandler extends DefaultKeyboardFocusManager
		implements ActionListener {


	/**
	 * PosKeyboardFocusManager
	 */
	public PosEventHandler(PosEventInterface parent) {
		super();
		this.parent = parent;
	} //	PosKeyboardFocusManager

	PosEventInterface parent = null;

	/** FirstIn First Out List */
	private LinkedList<KeyEvent>	m_fifo = new LinkedList<KeyEvent>();

	/** Last Key Type */
	private long m_lastWhen = 0;

	/** Timer */
	private javax.swing.Timer m_timer = null;
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(PosEventHandler.class);

	/**
	 * Dispose
	 */
	public void dispose() {
		if (m_timer != null)
			m_timer.stop();
		m_timer = null;
		if (m_fifo != null)
			m_fifo.clear();
		m_fifo = null;
	} //	dispose

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
	} //	start

	/**
	 * Stop Timer
	 */
	public void stop() {
		log.fine("PosKeyboardFocusManager.stop - " + m_timer); 

		if (m_timer != null)
			m_timer.stop();
	} //	stop

	/***************************************************************************
	 * Dispatch Key Event - queue
	 * 
	 * @param eevent
	 *            event
	 * @return true
	 */
	public boolean dispatchKeyEvent(KeyEvent event) {
		if (event.getID() == KeyEvent.KEY_PRESSED) {
			m_lastWhen = event.getWhen();
			parent.keyHandler(event);
		}
		if (m_timer == null)
			super.dispatchKeyEvent(event);
		else
			m_fifo.add(event);
		return true;
	} //	displatchEvent

	/**
	 * Action Performed - unqueue
	 * 
	 * @param e
	 *            event
	 */
	public void actionPerformed(ActionEvent e) {
		if (m_timer == null)
			return;
	//	log.fine( "actionPerformed - " + m_fifo.size()); 
		while (m_fifo.size() > 0) {
			KeyEvent event = (KeyEvent) m_fifo.removeFirst();
			super.dispatchKeyEvent(event);
		}
	} //	actionPerformed

} //	PosKeyboardFocusManager
