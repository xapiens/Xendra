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

import java.awt.event.KeyEvent;

/**
 * Interface for standarizing the event callbacks across all different callers.
 * @author Sergio Aguayo
 * @version $Id$
 */
public interface PosKeyEventInterface {
	
	/**
	 * This function will be called whenever a key is pressed.
	 * @param e	The key pressed.
	 */
	public void keyHandler(KeyEvent e);
}
