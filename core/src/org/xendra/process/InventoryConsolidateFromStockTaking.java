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
package org.xendra.process;

import java.math.*;
import java.sql.*;

import org.compiere.model.MAttributeSetInstance;
import org.compiere.model.MInventory;
import org.compiere.model.MProduct;
import org.compiere.model.MUOMConversion;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_Inventory;
import org.compiere.model.persistence.X_M_InventoryLine;
import org.compiere.model.persistence.X_M_Locator;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_StockTaking;
import org.compiere.model.persistence.X_M_StockTakingLine;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
import org.xendra.exceptions.XendraException;


/**
 *	Consolidate Inventory Count List with current Book value
 *	
 *  We consolidate TakingInventory in an Inventory defined, in case the product exists overwrite
 *  in case the product not exist add.
 *  
 *  @author xapiens
 */
@XendraProcess(value="InventoryConsolidateFromStockTaking",
name="InventoryConsolidateFromStockTaking",
description="Taking Inventory",
help="Taking Inventory",
Identifier="40b42607-f7f4-9868-b176-e7215f554eb7",				   
classname="org.xendra.process.InventoryConsolidateFromStockTaking",
updated="2015-06-20 10:10:12")	
public class InventoryConsolidateFromStockTaking extends SvrProcess
{

	/** Physical Inventory					*/
	private MInventory 	m_inventory = null;
	//private boolean IsQtyBookZero = false;
	@XendraProcessParameter(Name=X_M_Inventory.COLUMNNAME_M_Inventory_ID,	
	ColumnName=X_M_Inventory.COLUMNNAME_M_Inventory_ID,
	Description=X_M_Inventory.COLUMNNAME_M_Inventory_ID,
	Help=X_M_Inventory.COLUMNNAME_M_Inventory_ID,
	AD_Reference_ID=DisplayType.TableDir,
	SeqNo=10,
	ReferenceValueID="",	
	ValRuleID="",
	FieldLength=1,
	IsMandatory=false,
	IsRange=false,
	DefaultValue="",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="8845848f-5466-08a2-22e2-85f3ea4686f5")	
	private int M_Inventory_ID;
	
	private int M_Warehouse_ID;
	Hashtable AttributeSetInstances = new Hashtable();
	List<String> errors = new ArrayList<String>();
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals(X_M_Inventory.COLUMNNAME_M_Inventory_ID))
				M_Inventory_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare
	
	/**
	 * 	Consolidate Stock Taking
	 *	@return info
	 *	@throws Exception
	 */		
	public String doIt () throws Exception
	{		
		int no = 0;		
		try {
			String sql = "SELECT M_Warehouse_ID from M_Inventory WHERE M_Inventory_ID = ?";
			int M_Warehouse_ID = DB.getSQLValue(null, sql, M_Inventory_ID);
			
			sql = "SELECT COUNT(*) from M_StockTaking st WHERE st.processed = 'N' AND M_Warehouse_ID = ?";
			no = DB.getSQLValue(null, sql, M_Warehouse_ID);
			if (no == 0)
			{				
				throw new Exception ("no hay toma de inventario disponible para el almacen seleccionado");
			}
			// list of locators
			List<X_M_Locator> locators = new Query(Env.getCtx(), X_M_Locator.Table_Name, "M_Warehouse_ID = ?", get_TrxName())
			.setParameters(M_Warehouse_ID).list();
			//
			// Update the AttributeSetInstance
			//			
			String where = "processed = 'N' AND M_Warehouse_ID = ?";
			List<X_M_StockTaking> liststocktaking = new Query(Env.getCtx(), X_M_StockTaking.Table_Name, where, get_TrxName())
			.setParameters(M_Warehouse_ID)
			.list();
			for (X_M_StockTaking st:liststocktaking)
			{
								
				where = "M_StockTaking_ID = ?";
				List<X_M_StockTakingLine> stline = new Query(Env.getCtx(), X_M_StockTakingLine.Table_Name, where, get_TrxName())
					.setParameters(st.getM_StockTaking_ID())
					.list();
				for (X_M_StockTakingLine stl:stline)
				{
					MProduct product =  new Query(Env.getCtx(), X_M_Product.Table_Name, "M_Product_ID = ? ", get_TrxName())
						.setParameters(stl.getM_Product_ID()).first();

					if (product == null)
					{
						String error = String.format("Product %d not exists\n", stl.getM_Product_ID());
						errors.add(error);																
						stl.setErrorMsg(error);						
					}						
					X_M_Locator stocklocator = null;					
					for (X_M_Locator locator:locators)
					{
						if (locator.getM_Locator_ID() == stl.getM_Locator_ID())
						{
							stocklocator = locator;
						}
					}
					if (stocklocator == null)
					{
						if (locators.size() == 1)
						{
							stocklocator = locators.get(0);							
						}
					}
					if (stocklocator == null)						
					{
						String error = String.format("El Locator es obligatorio");
						errors.add(error);
						stl.setErrorMsg(error);
					}
					else
					{
						stl.setM_Locator_ID(stocklocator.getM_Locator_ID());
						stl.save();
					}
					Integer M_AttributeSetInstance_ID = stl.getM_AttributeSetInstance_ID();
					if (M_AttributeSetInstance_ID == null)
						M_AttributeSetInstance_ID = 0;
					
					if (M_AttributeSetInstance_ID > 0)
					{
						MAttributeSetInstance mas = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name,"M_AttributeSetInstance_ID = ?", get_TrxName())
							.setParameters(M_AttributeSetInstance_ID).first();
						if (mas != null)
						{							
							if (AttributeSetInstances.containsKey(M_AttributeSetInstance_ID))
							{			
								String error = "";
								if (mas.getGuaranteeDate() == null)
								{
									if (stl.getGuaranteeDate() != null)
										error += "Fecha";
								}
								else if (mas.getGuaranteeDate().compareTo(stl.getGuaranteeDate()) != 0)
									error += "Fecha";
								if (mas.getLot() == null)
								{
									if (stl.getLot() != null)
										error += "Lot";
								}
								else if (mas.getLot().compareTo(stl.getLot()) != 0)
									error += "Lot";
								
								MProduct prevproduct = MProduct.get(Env.getCtx(), (Integer) AttributeSetInstances.get(M_AttributeSetInstance_ID), get_TrxName());
								if (prevproduct.getName().compareTo(product.getName()) != 0)
									error += "Product";
									//String error = String.format("el Lote para %s ya esta siendo usado por %s y el Lote o Fecha son diferentes\n", product.getName(), prevproduct.getName());
								if (error.length() > 0)
								{									
									error = String.format("%s %s", error, prevproduct.getName());
									errors.add(error);
									stl.setErrorMsg(error);
									stl.save();									
								}								
							}
							else
							{
								mas.setLot(stl.getLot());
								mas.setGuaranteeDate(stl.getGuaranteeDate());
								mas.save();				
								AttributeSetInstances.put(M_AttributeSetInstance_ID, product.getM_Product_ID());
							}
						}
						else
						{
							M_AttributeSetInstance_ID = 0;							
						}
					}	
					if (stl.getLot() != null && stl.getLot().length() > 0 && product.getM_AttributeSet_ID() > 0 && M_AttributeSetInstance_ID == 0)
					{
						Timestamp guaranteedate = null;
						if (stl.getGuaranteeDate() == null)
							guaranteedate = new Timestamp(System.currentTimeMillis());
						else
							guaranteedate = stl.getGuaranteeDate();
						
						Calendar cal = Calendar.getInstance();
						cal.setTime(guaranteedate);
						cal.set(Calendar.HOUR_OF_DAY, 0);
						cal.set(Calendar.MINUTE, 0);
						cal.set(Calendar.SECOND, 0);
						cal.set(Calendar.MILLISECOND, 0);
						long time = cal.getTimeInMillis();																									
						guaranteedate = new Timestamp(time);
						//MAttributeSetInstance mas = new Query(Env.getCtx(), MAttributeSetInstance.Table_Name, where, get_TrxName())
						//	.setParameters(stl.getLot(), stl.getGuaranteeDate() ).first();
						where = "Lot = ? AND GuaranteeDate = ?";
						MAttributeSetInstance mas = new Query(Env.getCtx(), MAttributeSetInstance.Table_Name, where, get_TrxName())
						.setParameters(stl.getLot(), guaranteedate ).first();
						if (mas == null)
						{
							mas = new MAttributeSetInstance(Env.getCtx(), 0, get_TrxName());
							mas.setM_AttributeSet_ID(product.getM_AttributeSet_ID());
							mas.setLot(stl.getLot());
							//mas.setGuaranteeDate(stl.getGuaranteeDate());
							mas.setGuaranteeDate(guaranteedate);
							mas.setDescription();
							if (mas.save())
							{
								M_AttributeSetInstance_ID = mas.getM_AttributeSetInstance_ID();
								stl.setM_AttributeSetInstance_ID(M_AttributeSetInstance_ID);	
								stl.save();
							}
							else
							{
								System.out.println("X");
							}
						}	
						else
						{
							//if (mas.getLot().compareTo(stl.getLot()) != 0 || mas.getGuaranteeDate().compareTo(stl.getGuaranteeDate()) != 0)
							if (mas.getLot().compareTo(stl.getLot()) != 0 || mas.getGuaranteeDate().compareTo(guaranteedate) != 0)							
							{
								MProduct prevproduct = MProduct.get(Env.getCtx(), (Integer) AttributeSetInstances.get(M_AttributeSetInstance_ID), get_TrxName());
								String error = String.format("el Lote para %s ya esta siendo usado por %s y el Lote o Fecha son diferentes\n", product.getName(), prevproduct.getName());
								errors.add(error);																
								stl.setErrorMsg(error);
								stl.save();								
							}	
							else
							{
								stl.setM_AttributeSetInstance_ID(mas.getM_AttributeSetInstance_ID());	
								stl.save();								
							}
						}
					}							
				}
			}			
			// como hay error no continuamos
			if (errors.size() > 0)
				throw new Exception();		
			// continuamos
			List<X_M_InventoryLine> ilines = new ArrayList<X_M_InventoryLine>();
			for (X_M_StockTaking st:liststocktaking)
			{
				st.setM_Inventory_ID(M_Inventory_ID);
				st.save();
				
				where = "M_StockTaking_ID = ?";
				List<X_M_StockTakingLine> stline = new Query(Env.getCtx(), X_M_StockTakingLine.Table_Name, where, get_TrxName())
					.setParameters(st.getM_StockTaking_ID())
					.list();
				for (X_M_StockTakingLine stl:stline)
				{
					MProduct product =  new Query(Env.getCtx(), X_M_Product.Table_Name, "M_Product_ID = ? ", get_TrxName())
					.setParameters(stl.getM_Product_ID()).first();
					String query = "";
					X_M_InventoryLine iline;
					if (stl.getM_AttributeSetInstance_ID() > 0)
					{
						query = "M_Inventory_ID = ? AND M_Locator_ID = ? AND M_Product_ID = ? AND M_AttributeSetInstance_ID = ?";
						iline = new Query(Env.getCtx(), X_M_InventoryLine.Table_Name, query , get_TrxName())
						.setParameters(M_Inventory_ID, stl.getM_Locator_ID(), stl.getM_Product_ID(), stl.getM_AttributeSetInstance_ID()).first();
					}
					else
					{
						query = "M_Inventory_ID = ? AND M_Locator_ID = ? AND M_Product_ID = ?";											
						iline = new Query(Env.getCtx(), X_M_InventoryLine.Table_Name,query, get_TrxName())
						.setParameters(M_Inventory_ID, stl.getM_Locator_ID(), stl.getM_Product_ID()).first();
					}
					if (iline == null)
					{						
						iline = new X_M_InventoryLine(Env.getCtx(), 0, get_TrxName());
						iline.setM_Inventory_ID(M_Inventory_ID);
						iline.setM_Locator_ID(stl.getM_Locator_ID());
						iline.setM_Product_ID(stl.getM_Product_ID());						
						if (stl.getM_AttributeSetInstance_ID() > 0)
							iline.setM_AttributeSetInstance_ID(stl.getM_AttributeSetInstance_ID());
						//						
					} 

					if (!ilines.contains(iline))
						ilines.add(iline);
					
					BigDecimal QtyCount = stl.getQtyCount(); 
					if (QtyCount == null)
						QtyCount = BigDecimal.ZERO;
					
					BigDecimal QtyEntered = MUOMConversion.convertProductFrom (Env.getCtx(), stl.getM_Product_ID(), stl.getC_UOM_ID(), QtyCount);
					if (QtyEntered == null)
						QtyEntered = QtyCount;
																				
					iline.setQtyCount(iline.getQtyCount().add(QtyEntered));
					if (!iline.save())
					{
						errors.add(String.format("Inventory line with Product %s can't be save",product.getName()));
						throw new Exception();
					}
					
					stl.setM_InventoryLine_ID(iline.getM_InventoryLine_ID());
					if (!stl.save())
					{
						errors.add(String.format("taking line with Product %s can't be save",product.getName()));
						throw new Exception();
					}
				}
			}
			int line = 0;
			for (X_M_InventoryLine iline:ilines) {				
				line = line + 10;
				iline.setLine(line);
				iline.save();
			}						
		}
		catch (Exception e)
		{
			errors.add(e.getMessage());
			//error = e.getMessage();
			e.printStackTrace();
		}
		String msg = "";
		for (String error:errors)
		{
			msg += error;
		}		
		if (msg.length() == 0)
			msg = "@M_StockTaking_ID@ - #" + no; 
		return msg;		
	}
}	//	InventoryConsolidateFromStockTaking