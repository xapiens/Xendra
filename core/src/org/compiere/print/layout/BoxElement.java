/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
package org.compiere.print.layout;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.Properties;

import org.compiere.model.reference.REF_AD_PrintFormatItemShapeType;
import org.compiere.model.reference.REF_AD_PrintFormatType;
import org.compiere.print.MPrintFormatItem;


/**
 *	Line / Box Element
 *	
 *  @author Jorg Janke
 *  @version $Id: BoxElement.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class BoxElement extends PrintElement
{
	/**
	 * 	BoxElement
	 * 	@param item item
	 * 	@param color color
	 */
	public BoxElement (MPrintFormatItem item, Color color)
	{
		super ();
		if (item != null && item.isTypeBox())
		{
			m_item = item;
			m_color = color;
		}
	}	//	BoxElement
	
	/** The Item					*/
	private MPrintFormatItem 	m_item = null;
	private Color				m_color = Color.BLACK;

	/**
	 * 	Calculate Size
	 *	@return true if calculated
	 */
	protected boolean calculateSize ()
	{
		p_width = 0;
		p_height = 0;
		if (m_item == null)
			return true;
		return true;
	}	//	calculateSize

	/**
	 * 	Paint
	 *	@param g2D graphics
	 *	@param pageNo page
	 *	@param pageStart page start
	 *	@param ctx context
	 *	@param isView true if Java
	 */
	public void paint (Graphics2D g2D, int pageNo, Point2D pageStart,
		Properties ctx, boolean isView)
	{
		if (m_item == null)
			return;
		//
		g2D.setColor(m_color);
		BasicStroke s = new BasicStroke(m_item.getLineWidth());
		g2D.setStroke(s);
		//
		Point2D.Double location = getAbsoluteLocation(pageStart);
		int x = (int)location.x;
		int y = (int)location.y;

		int width = m_item.getMaxWidth();
		int height = m_item.getMaxHeight();
		
		if (m_item.getPrintFormatType().equals(REF_AD_PrintFormatType.Line))
			g2D.drawLine(x, y, x+width, y+height);
		else
		{
			String type = m_item.getShapeType();
			if (type == null)
				type = "";
			if (m_item.isFilledRectangle())
			{
				if (type.equals(REF_AD_PrintFormatItemShapeType.Rectangle3D))
					g2D.fill3DRect(x, y, width, height, true);
				else if (type.equals(REF_AD_PrintFormatItemShapeType.Oval))
					g2D.fillOval(x, y, width, height);
				else if (type.equals(REF_AD_PrintFormatItemShapeType.RoundRectangle))
					g2D.fillRoundRect(x, y, width, height, m_item.getArcDiameter(), m_item.getArcDiameter());
				else
					g2D.fillRect(x, y, width, height);
			}
			else
			{
				if (type.equals(REF_AD_PrintFormatItemShapeType.Rectangle3D))
					g2D.draw3DRect(x, y, width, height, true);
				else if (type.equals(REF_AD_PrintFormatItemShapeType.Oval))
					g2D.drawOval(x, y, width, height);
				else if (type.equals(REF_AD_PrintFormatItemShapeType.RoundRectangle))
					g2D.drawRoundRect(x, y, width, height, m_item.getArcDiameter(), m_item.getArcDiameter());
				else
					g2D.drawRect(x, y, width, height);
			}
		}
	}	//	paint
	
}	//	BoxElement

