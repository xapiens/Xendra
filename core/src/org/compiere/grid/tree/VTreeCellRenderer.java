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
package org.compiere.grid.tree;

import javax.swing.tree.*;
import java.awt.*;
import javax.swing.*;

import org.compiere.model.MTreeNode;

import org.xendra.plaf.XendraPLAF;

/**
 *	Tree Cell Renderer to context sensitive display Icon
 *  @author 	Jorg Janke
 *  @version 	$Id: VTreeCellRenderer.java 896 2008-04-01 23:56:06Z el_man $
 */
public final class VTreeCellRenderer extends DefaultTreeCellRenderer
{
	/**
	 *	Constructor
	 */
	public VTreeCellRenderer()
	{
		super();
	}	//	VTreeCellRenderer


	/**
	 *	Get Tree Cell Renderer Component.
	 *  Sets Icon, Name, Description for leaves
	 *  @param tree tree
	 *  @param value value
	 *  @param Selected selected
	 *  @param expanded expanded
	 *  @param leaf leaf
	 *  @param row row
	 *  @param HasFocus focus
	 *  @return renderer
	 */
	public Component getTreeCellRendererComponent(JTree tree, Object value,
		boolean Selected, boolean expanded, boolean leaf, int row, boolean HasFocus)
	{
		VTreeCellRenderer c = (VTreeCellRenderer)super.getTreeCellRendererComponent
			(tree, value, Selected, expanded, leaf, row, HasFocus);
		if (!leaf)
			return c;

		//	We have a leaf
		MTreeNode nd = (MTreeNode)value;
		Icon icon = nd.getIcon();
		if (icon != null)
			c.setIcon(icon);		
		c.setText(nd.getName());
		c.setToolTipText(nd.getDescription());		
		if (!Selected)
		{
			//c.setForeground(new Color(255,255,255) );
			c.setForeground(XendraPLAF.getTextColor_Normal());
			//c.setForeground(nd.getColor());
		}
		return c;
	}	//	getTreeCellRendererComponent

}	//	VTreeCellRenderer
