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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;

import org.compiere.util.*;

/**
 *	Inventory Movement Line Callouts
 *	
 *  @author Jorg Janke
 *  @version $Id: CalloutMovement.java 2198 2010-12-17 20:01:28Z xapiens $
 */
public class CalloutMovementLine extends CalloutEngine
{
	
	public String qty(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{		
		if (isCalloutActive() || value == null)
			return "";
		setCalloutActive(true);
	
		int M_Product_ID = Env.getContextAsInt(ctx, WindowNo, "M_Product_ID");

		BigDecimal QtyOrdered = Env.ZERO;
		BigDecimal QtyEntered = Env.ZERO;
		//
		//	UOM Changed - convert from Entered -> Product
		if (mField.getColumnName().equals("C_UOM_ID"))
		{
			int C_UOM_To_ID = ((Integer)value).intValue();
			QtyEntered = (BigDecimal)mTab.getValue("QtyEntered");
			BigDecimal QtyEntered1 = QtyEntered.setScale(MUOM.getPrecision(ctx, C_UOM_To_ID), BigDecimal.ROUND_HALF_UP);
			if (QtyEntered.compareTo(QtyEntered1) != 0)
			{
				log.fine("Corrected QtyEntered Scale UOM=" + C_UOM_To_ID 
					+ "; QtyEntered=" + QtyEntered + "->" + QtyEntered1);  
				QtyEntered = QtyEntered1;
				mTab.setValue("QtyEntered", QtyEntered);
			}
			QtyOrdered = MUOMConversion.convertProductFrom (ctx, M_Product_ID, 
				C_UOM_To_ID, QtyEntered);
			if (QtyOrdered == null)
				QtyOrdered = QtyEntered;
			Boolean conversion = QtyEntered.compareTo(QtyOrdered) != 0;
			Env.setContext(ctx, WindowNo, "UOMConversion", conversion ? "Y" : "N");
			mTab.setValue("MovementQty", QtyOrdered);
		}
		//	QtyEntered changed - calculate QtyOrdered
		else if (mField.getColumnName().equals("QtyEntered") || mField.getColumnName().equals("M_Product_ID"))
		{
			int C_UOM_To_ID = Env.getContextAsInt(ctx, WindowNo, "C_UOM_ID");
			if (mField.getColumnName().equals("M_Product_ID"))
			{
				QtyEntered = (BigDecimal)mTab.getValue("QtyEntered");
				C_UOM_To_ID = (Integer) mTab.getValue("C_UOM_ID");
			}
			else
				QtyEntered = (BigDecimal)value;
			BigDecimal QtyEntered1 = QtyEntered.setScale(MUOM.getPrecision(ctx, C_UOM_To_ID), BigDecimal.ROUND_HALF_UP);
			if (QtyEntered.compareTo(QtyEntered1) != 0)
			{
				log.fine("Corrected QtyEntered Scale UOM=" + C_UOM_To_ID 
					+ "; QtyEntered=" + QtyEntered + "->" + QtyEntered1);  
				QtyEntered = QtyEntered1;
				mTab.setValue("QtyEntered", QtyEntered);
			}
			QtyOrdered = MUOMConversion.convertProductFrom (ctx, M_Product_ID, 
				C_UOM_To_ID, QtyEntered);
			if (QtyOrdered == null)
				QtyOrdered = QtyEntered;
			boolean conversion = QtyEntered.compareTo(QtyOrdered) != 0;
			log.fine("UOM=" + C_UOM_To_ID 
				+ ", QtyEntered=" + QtyEntered
				+ " -> " + conversion 
				+ " QtyOrdered=" + QtyOrdered);
			Env.setContext(ctx, WindowNo, "UOMConversion", conversion ? "Y" : "N");
			mTab.setValue("MovementQty", QtyOrdered);
		}
		//
		
		if (mField.getColumnName().equals("MovementQty"))
			QtyOrdered = (BigDecimal) value;
		else
			QtyOrdered = (BigDecimal)mTab.getValue("MovementQty");
		if (M_Product_ID != 0 
			&& QtyOrdered.signum() > 0)		//	no negative (returns)
		{
			MProduct product = MProduct.get (ctx, M_Product_ID, null);
			if (product.isStocked())
			{
				Integer M_Locator_ID = (Integer) mTab.getValue("M_Locator_ID");
				MLocator locator =  MLocator.get(ctx, M_Locator_ID);
				int M_Warehouse_ID = locator.getM_Warehouse_ID();
				//int M_Warehouse_ID = Env.getContextAsInt(ctx, WindowNo, "M_Warehouse_ID");
				int M_AttributeSetInstance_ID = Env.getContextAsInt(ctx, WindowNo, "M_AttributeSetInstance_ID");
				BigDecimal available = MStorage.getQtyAvailable
					(M_Warehouse_ID, M_Locator_ID, M_Product_ID, M_AttributeSetInstance_ID, null);
				if (available == null)
					available = Env.ZERO;
				if (available.signum() == 0)
					mTab.fireDataStatusEEvent ("NoQtyAvailable", "0", false);
				else if (available.compareTo(QtyOrdered) < 0)
					mTab.fireDataStatusEEvent ("InsufficientQtyAvailable", available.toString(), false);
			}
		}		
		//
		setCalloutActive(false);
		return "";
	}	//	qty
	
}	//	CalloutMove
