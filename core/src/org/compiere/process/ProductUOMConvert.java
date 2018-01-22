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
package org.compiere.process;

import java.math.*;
import java.util.logging.*;

import org.compiere.model.MProduct;
import org.compiere.model.MUOM;
import org.compiere.model.MUOMConversion;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 *	Product UOM Conversion
 *	
 *  @author Jorg Janke
 *  @version $Id: ProductUOMConvert.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="M_Product_UOMConvert",
name="Product UOM Convert",
description="Brack-up or repackage same Products with different UOM",
help="Example: \"Product EA\" has a defined UOM Conversion to \"Product 6Pack\" and vice versa. This is a one-step replacement for defining BOM and creating/processes a Production.",
Identifier="169ac99e-110e-562f-e6cd-28adb03caef3",
classname="org.compiere.process.ProductUOMConvert",
updated="2015-06-20 10:10:12")
public class ProductUOMConvert extends SvrProcess
{
	/** Product From			*/
	@XendraProcessParameter(Name="Product",
			                ColumnName="M_Product_ID",
			                Description="Product, Service, Item",
			                Help="Identifies an item which is either purchased or sold in this organization.",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="c0f7c2af-b202-4486-463d-54d43675d753")	
	private int			p_M_Product_ID = 0;
	/** Product To				*/
	@XendraProcessParameter(Name="To Product",
			                ColumnName="M_Product_To_ID",
			                Description="Product to be converted to (must have UOM Conversion defined to From Product)",
			                Help="",
			                AD_Reference_ID=DisplayType.Table,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="bc2b2701-fe7c-c6d6-7f01-75c3c273dc9d")	
	private int			p_M_Product_To_ID = 0;
	/** Locator					*/
	@XendraProcessParameter(Name="Locator",
			                ColumnName="M_Locator_ID",
			                Description="Warehouse Locator",
			                Help="The Locator indicates where in a Warehouse a product is located.",
			                AD_Reference_ID=DisplayType.Locator,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="0",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="930b6974-edb4-f7c6-797d-925fdaf28c65")
	private int			p_M_Locator_ID = 0;
	/** Quantity				*/
	@XendraProcessParameter(Name="Quantity",
			                ColumnName="Qty",
			                Description="Quantity",
			                Help="The Quantity indicates the number of a specific product or item for this document.",
			                AD_Reference_ID=DisplayType.Quantity,
			                SeqNo=40,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="5bc646dc-aa0e-bd93-095e-dd3944014cbc")	
	private BigDecimal	p_Qty = null;

	/**
	 * 	Prepare
	 */
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("M_Product_ID"))
				p_M_Product_ID = para[i].getParameterAsInt();
			else if (name.equals("M_Product_To_ID"))
				p_M_Product_To_ID = para[i].getParameterAsInt();
			else if (name.equals("M_Locator_ID"))
				p_M_Locator_ID = para[i].getParameterAsInt();
			else if (name.equals("Qty"))
				p_Qty = (BigDecimal)para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 * 	Process
	 *	@return message
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		if (p_M_Product_ID == 0 || p_M_Product_To_ID == 0
			|| p_M_Locator_ID == 0 
			|| p_Qty == null || Env.ZERO.compareTo(p_Qty) == 0)
			throw new XendraUserError("Invalid Parameter");
		//
		MProduct product = MProduct.get(getCtx(), p_M_Product_ID, get_TrxName());
		MProduct productTo = MProduct.get(getCtx(), p_M_Product_To_ID, get_TrxName());
		log.info("Product=" + product + ", ProductTo=" + productTo 
			+ ", M_Locator_ID=" + p_M_Locator_ID + ", Qty=" + p_Qty);
		
		MUOMConversion[] conversions = MUOMConversion.getProductConversions(getCtx(), product.getM_Product_ID());
		MUOMConversion conversion = null;
		for (int i = 0; i < conversions.length; i++)
		{
			if (conversions[i].getC_UOM_To_ID() == productTo.getC_UOM_ID())
				conversion = conversions[i];
		}
		if (conversion == null)
			throw new XendraUserError("@NotFound@: @C_UOM_Conversion_ID@");
		
		MUOM uomTo = MUOM.get(getCtx(), productTo.getC_UOM_ID());
		BigDecimal qtyTo = p_Qty.divide(conversion.getDivideRate(), uomTo.getStdPrecision(), BigDecimal.ROUND_HALF_UP);
		BigDecimal qtyTo6 = p_Qty.divide(conversion.getDivideRate(), 6, BigDecimal.ROUND_HALF_UP);
		if (qtyTo.compareTo(qtyTo6) != 0)
			throw new XendraUserError("@StdPrecision@: " + qtyTo + " <> " + qtyTo6 
				+ " (" + p_Qty + "/" + conversion.getDivideRate() + ")");
		log.info(conversion + " -> " + qtyTo); 
		
		
		//	Set to Beta
		return "Not completed yet";
	}	//	doIt
	
}	//	ProductUOMConvert
