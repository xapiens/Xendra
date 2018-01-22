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
 *	Inventory Movement Callouts
 *	
 *  @author Jorg Janke
 *  @version $Id: CalloutMovement.java 5510 2015-01-30 22:20:50Z xapiens $
 */
public class CalloutMovement extends CalloutEngine
{
	/**
	 *  Product modified
	 * 		Set Attribute Set Instance
	 *
	 *  @param ctx      Context
	 *  @param WindowNo current Window No
	 *  @param mTab     Model Tab
	 *  @param mField   Model Field
	 *  @param value    The new value
	 *  @return Error message or ""
	 */
	public String product (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer M_Product_ID = (Integer)value;
		if (M_Product_ID == null || M_Product_ID.intValue() == 0)
			return "";
		//	Set Attribute
		if (Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "M_Product_ID") == M_Product_ID.intValue()
			&& Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "M_AttributeSetInstance_ID") != 0)
			mTab.setValue("M_AttributeSetInstance_ID", new Integer(Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "M_AttributeSetInstance_ID")));
		else
			mTab.setValue("M_AttributeSetInstance_ID", null);
		
		MProduct product = MProduct.get (ctx, M_Product_ID.intValue(), null);
		if (product.isStocked() && product.getC_UOM_Order_ID() != 0 )
			mTab.setValue("C_UOM_ID", product.getC_UOM_Order_ID());
		else
		{			
			mTab.setValue("C_UOM_ID", product.getC_UOM_ID());
		}			
		if (product.getC_UOM_ID() != product.getC_UOM_Order_ID())
		{
			mTab.setValue("QtyEntered", mTab.getValue("QtyEntered"));
		}
		else
			mTab.setValue("MovementQty", mTab.getValue("QtyEntered"));		
		return "";
	}   //  product
	
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
			boolean conversion = QtyEntered.compareTo(QtyOrdered) != 0;
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
			int C_UOM_To_ID = Env.getContextAsInt(ctx, WindowNo, "C_UOM_ID");
			MUOM uom = MUOM.get(Env.getCtx(), C_UOM_To_ID);
			if (QtyOrdered.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) > 0 && !uom.isSplit())
			{
				mTab.setValue("MovementQty", BigDecimal.ZERO);
				mTab.fireDataStatusEEvent ("NoDecimal", "0", true);
				setCalloutActive(false);
				return "";
			}			
			MProduct product = MProduct.get (ctx, M_Product_ID, null);
			if (product.isStocked())
			{
				int M_Warehouse_ID = Env.getContextAsInt(ctx, WindowNo, "M_Warehouse_ID");
				int M_AttributeSetInstance_ID = Env.getContextAsInt(ctx, WindowNo, "M_AttributeSetInstance_ID");
				BigDecimal available = MStorage.getQtyAvailable
					(M_Warehouse_ID, 0, M_Product_ID, M_AttributeSetInstance_ID, null);
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

	
	public String DocType (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		setCalloutActive(true);
		Integer C_DocType = (Integer) value;
		if (C_DocType == null || C_DocType.intValue() == 0)
			return "";
		String InTransit = "N";
		String sql = "SELECT d.IsInTransit "
			+ "FROM C_DocType d "
			+ "WHERE C_DocType_ID=?";	//	#1
		try
		{
				PreparedStatement pstmt = DB.prepareStatement(sql, null);
				pstmt.setInt(1, C_DocType.intValue());
				ResultSet rs = pstmt.executeQuery();
				if (rs.next())
					InTransit = rs.getString(1);
				rs.close();
				pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			return e.getLocalizedMessage();
		}
		mTab.setValue("IsInTransit", InTransit);
		setCalloutActive(false);
		return "";
	}
	
}	//	CalloutMove
