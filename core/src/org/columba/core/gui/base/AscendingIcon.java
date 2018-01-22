//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the 
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.
package org.columba.core.gui.base;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;

@SuppressWarnings( { "serial", "serial" })
public class AscendingIcon extends ImageIcon {

	private Color color = new Color(100,100,100);

	public AscendingIcon() {
		super();
	}

	public AscendingIcon(Color color) {
		super();
		this.color = color;
	}
	
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;

		int[] xp = new int[3];
		int[] yp = new int[3];

		xp[0] = x;
		xp[1] = x + 9;
		xp[2] = x + 4;

		yp[0] = y;
		yp[1] = y;
		yp[2] = y + 5;

		g2.setColor(color);
		g2.fillPolygon(xp, yp, 3);
	}

	/**
	 * @see javax.swing.Icon#getIconHeight()
	 */
	public int getIconHeight() {
		return 6;
	}

	/**
	 * @see javax.swing.Icon#getIconWidth()
	 */
	public int getIconWidth() {
		return 10;
	}

}
