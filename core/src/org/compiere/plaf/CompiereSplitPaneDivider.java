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
package org.compiere.plaf;

import java.awt.*;
import javax.swing.plaf.basic.*;

/**
 *  Split Pane Divider
 *
 *  @author     Jorg Janke
 *  @version    $Id: CompiereSplitPaneDivider.java,v 1.1 2007/06/14 23:44:17 sergioaguayo Exp $
 */
class CompiereSplitPaneDivider extends BasicSplitPaneDivider
{
	/**
	 *  Constructor
	 *  @param ui
	 */
	public CompiereSplitPaneDivider (BasicSplitPaneUI ui)
	{
		super (ui);
		//  BasicBorders$SplitPaneDividerBorder - ignored set after constructor
		setBorder(null);
	}   //  AdempiereSplitPaneDivider

	/**
	 *  Paints the divider.
	 *  If the border is painted, it creates a light gray bar on top/button.
	 *  Still, a light gray 1 pt shaddow border is painted on top/button
	 *  @param g
	 */
	public void paint (Graphics g)
	{
		//  BasicBorders$SplitPaneDividerBorder
		setBorder(null);
		super.paint(g);
	}   //  paint

}   //  AdempiereSplitPaneDivider
