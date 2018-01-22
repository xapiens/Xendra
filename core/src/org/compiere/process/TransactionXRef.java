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
import org.compiere.util.*;
import org.xendra.annotations.*;

/**
 *	Material Transaction Cross Reference
 *	
 *  @author Jorg Janke
 *  @version $Id: TransactionXRef.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="M_TransactionXRef",
name="Material Reference",
description="Material Transactions Cross Reference (used/resourced)",
help="The report displays, e.g. where Material Receipts are used or Customer Shipments are resourced from",
Identifier="e1e9984c-ce4d-43e7-8235-516f6a777f6f",
classname="org.compiere.process.TransactionXRef",
updated="2015-06-20 10:10:12")
public class TransactionXRef extends SvrProcess
{
	@XendraProcessParameter(Name="Search Shipment/Receipt",
			                ColumnName="Search_InOut_ID",
			                Description="Material Shipment Document",
			                Help="The Material Shipment / Receipt ",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="e1692e72-3037-d2c2-074a-fc366da2d541")	
	private int		p_Search_InOut_ID = 0;
	@XendraProcessParameter(Name="Search Order",
			                ColumnName="Search_Order_ID",
			                Description="Order Identifier",
			                Help="Order is a control document.",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="4d1ed518-91d3-3256-13df-1f93a80c20ee")
	private int 	p_Search_Order_ID = 0;
	@XendraProcessParameter(Name="Search Invoice",
			                ColumnName="Search_Invoice_ID",
			                Description="Search Invoice Identifier",
			                Help="The Invoice Document.",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="1481972a-205c-905d-c315-8b3295c979f0")
	private int		p_Search_Invoice_ID = 0;
	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("Search_InOut_ID"))
				p_Search_InOut_ID = para[i].getParameterAsInt();
			else if (name.equals("Search_Order_ID"))
				p_Search_Order_ID = para[i].getParameterAsInt();
			else if (name.equals("Search_Invoice_ID"))
				p_Search_Invoice_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 * 	Process it
	 *	@return info
	 *	@throws Exception if error
	 */
	public String doIt () throws Exception
	{
		log.info("M_InOut_ID=" + p_Search_InOut_ID + ", C_Order_ID=" + p_Search_Order_ID
			+ ", C_Invoice_ID=" + p_Search_Invoice_ID);
		//
		if (p_Search_InOut_ID != 0)
			insertTrx(
				"SELECT COALESCE(ma.M_AttributeSetInstance_ID,iol.M_AttributeSetInstance_ID) "
				+ "FROM M_InOutLine iol"
				+ " LEFT OUTER JOIN M_InOutLineMA ma ON (iol.M_InOutLine_ID=ma.M_InOutLine_ID) "
				+ "WHERE M_InOut_ID=" + p_Search_InOut_ID
				);
		else if (p_Search_Order_ID != 0)
			insertTrx(
				"SELECT COALESCE(ma.M_AttributeSetInstance_ID,iol.M_AttributeSetInstance_ID) "
				+ "FROM M_InOutLine iol"
				+ " LEFT OUTER JOIN M_InOutLineMA ma ON (iol.M_InOutLine_ID=ma.M_InOutLine_ID) "
				+ " INNER JOIN M_InOut io ON (iol.M_InOut_ID=io.M_InOut_ID)"
				+ "WHERE io.C_Order_ID=" + p_Search_Order_ID
				);
		else if (p_Search_Invoice_ID != 0)
			insertTrx(
				"SELECT COALESCE(ma.M_AttributeSetInstance_ID,iol.M_AttributeSetInstance_ID) "
				+ "FROM M_InOutLine iol"
				+ " LEFT OUTER JOIN M_InOutLineMA ma ON (iol.M_InOutLine_ID=ma.M_InOutLine_ID) "
				+ " INNER JOIN C_InvoiceLine il ON (iol.M_InOutLine_ID=il.M_InOutLine_ID) "
				+ "WHERE il.C_Invoice_ID=" + p_Search_Invoice_ID
				);
		else
			throw new XendraUserError("Select one Parameter");
		//
		return "";
	}	//	doIt
	
	/**
	 * 	Get Trx
	 *	@param sqlSubSelect sql
	 */
	private void insertTrx (String sqlSubSelect)
	{
		String sql = "INSERT INTO T_Transaction "
			+ "(AD_PInstance_ID, M_Transaction_ID,"
			+ " AD_Client_ID, AD_Org_ID, IsActive, Created,CreatedBy, Updated,UpdatedBy,"
			+ " MovementType, M_Locator_ID, M_Product_ID, M_AttributeSetInstance_ID,"
			+ " MovementDate, MovementQty,"
			+ " M_InOutLine_ID, M_InOut_ID,"
			+ " M_MovementLine_ID, M_Movement_ID,"
			+ " M_InventoryLine_ID, M_Inventory_ID, "
			+ " C_ProjectIssue_ID, C_Project_ID, "
			+ " M_ProductionLine_ID, M_Production_ID, "
			+ " Search_Order_ID, Search_Invoice_ID, Search_InOut_ID) "
			//	Data
			+ "SELECT " + getAD_PInstance_ID() + ", M_Transaction_ID,"
			+ " AD_Client_ID, AD_Org_ID, IsActive, Created,CreatedBy, Updated,UpdatedBy,"
			+ " MovementType, M_Locator_ID, M_Product_ID, M_AttributeSetInstance_ID,"
			+ " MovementDate, MovementQty,"
			+ " M_InOutLine_ID, M_InOut_ID, "
			+ " M_MovementLine_ID, M_Movement_ID,"
			+ " M_InventoryLine_ID, M_Inventory_ID, "
			+ " C_ProjectIssue_ID, C_Project_ID, "
			+ " M_ProductionLine_ID, M_Production_ID, "
			//	Parameter
			+ p_Search_Order_ID + ", " + p_Search_Invoice_ID + "," + p_Search_InOut_ID + " "
			//
			+ "FROM M_Transaction_v "
			+ "WHERE M_AttributeSetInstance_ID > 0 AND M_AttributeSetInstance_ID IN (" 
			+ sqlSubSelect
			+ ") ORDER BY M_Transaction_ID";
		//
		int no = DB.executeUpdate(sql, get_TrxName());
		log.fine(sql);
		log.config("#" + no);
		
		//	Multi-Level
		
	}	//	insertTrx
	
}	//	TransactionXRef
