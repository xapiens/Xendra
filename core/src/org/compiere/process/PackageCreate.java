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

import java.util.logging.*;

import org.compiere.model.MInOut;
import org.compiere.model.MPackage;
import org.compiere.model.MShipper;
import org.compiere.util.DisplayType;

import org.xendra.annotations.*; 
/**
 *	Create Package from Shipment for Shipper
 *	
 *  @author Jorg Janke
 *  @version $Id: PackageCreate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="M_Package_Create",
name="Create Package",
description="Create Package for Shipmet",
help="",
Identifier="40167b8d-4082-f969-950c-6146c8b283dc",
classname="org.compiere.process.PackageCreate",
updated="2015-06-20 10:10:12")	
public class PackageCreate extends SvrProcess
{
	/**	Shipper				*/
	@XendraProcessParameter(Name="Shipper",
			                ColumnName="M_Shipper_ID",
			                Description="Method or manner of product delivery",
			                Help="The Shipper indicates the method of delivering product",
			                AD_Reference_ID=DisplayType.TableDir,
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
			                Identifier="ef88e86a-9352-b5c7-9281-79faa02c049e")	
	private int		p_M_Shipper_ID = 0;
	/** Parent				*/
@XendraProcessParameter(Name="Shipment/Receipt",
                ColumnName="M_InOut_ID",
                Description="Material Shipment Document",
                Help="The Material Shipment / Receipt ",
                AD_Reference_ID=DisplayType.Search,
                SeqNo=10,
                ReferenceValueID="",
                ValRuleID="",
                FieldLength=0,
                IsMandatory=true,
                IsRange=false,
                DefaultValue="@M_InOut_ID@",
                DefaultValue2="",
                vFormat="",
                valueMin="",
                valueMax="",
                DisplayLogic="",
                ReadOnlyLogic="",
                Identifier="f5673881-c144-9500-fac4-775f6b7a45d9")
	private int		p_M_InOut_ID = 0;
	

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
			else if (name.equals("M_Shipper_ID"))
				p_M_Shipper_ID = para[i].getParameterAsInt();
			else if (name.equals("C_Invoice_ID"))
				p_M_InOut_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
		if (p_M_InOut_ID == 0)
			p_M_InOut_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@return message
	 *	@throws Exception
	 */
	protected String doIt () throws Exception
	{
		log.info("doIt - M_InOut_ID=" + p_M_InOut_ID + ", M_Shipper_ID=" + p_M_Shipper_ID);
		if (p_M_InOut_ID == 0)
			throw new IllegalArgumentException("No Shipment");
		if (p_M_Shipper_ID == 0)
			throw new IllegalArgumentException("No Shipper");
		MInOut shipment = new MInOut (getCtx(), p_M_InOut_ID, null);
		if (shipment.get_ID() != p_M_InOut_ID)
			throw new IllegalArgumentException("Cannot find Shipment ID=" + p_M_InOut_ID);
		MShipper shipper = new MShipper (getCtx(), p_M_Shipper_ID, get_TrxName());
		if (shipper.get_ID() != p_M_Shipper_ID)
			throw new IllegalArgumentException("Cannot find Shipper ID=" + p_M_InOut_ID);
		//
		
		MPackage pack = MPackage.create (shipment, shipper, null);
		
		return pack.getDocumentNo();
	}	//	doIt
	
}	//	PackageCreate
