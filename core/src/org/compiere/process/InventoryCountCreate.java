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
import java.sql.*;

import org.compiere.model.MAttributeSet;
import org.compiere.model.MInventory;
import org.compiere.model.MInventoryLine;
import org.compiere.model.MInventoryLineMA;

import java.util.logging.*;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Create Inventory Count List with current Book value
 *	
 *  @author Jorg Janke
 *  @version $Id: InventoryCountCreate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="M_Inventory Create",
name="Create Inventory Count List ",
description="Create Inventory Count List",
help="The inventory count lines are generated.  You can add new lines or delete lines manually.",
Identifier="ae85e325-f1ca-9259-d0ee-84b04668afe5",
classname="org.compiere.process.InventoryCountCreate",
updated="2015-06-20 10:10:12")
public class InventoryCountCreate extends SvrProcess
{
	
	/** Physical Inventory Parameter		*/
	private int			p_M_Inventory_ID = 0;
	/** Physical Inventory					*/
	private MInventory 	m_inventory = null;
	/** Locator Parameter			*/
	@XendraProcessParameter(Name="Locator",
			                ColumnName="M_Locator_ID",
			                Description="Warehouse Locator",
			                Help="The Locator indicates where in a Warehouse a product is located.",
			                AD_Reference_ID=DisplayType.Locator,
			                SeqNo=5,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="0",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="6c695b91-c9ef-001a-2b59-5087054ee4e2")	
	private int			p_M_Locator_ID = 0;
	/** Locator Parameter			*/
	@XendraProcessParameter(Name="Locator Key",
			                ColumnName="LocatorValue",
			                Description="Key of the Warehouse Locator",
			                Help="",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=6,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=5,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="%",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="9beb78ac-a244-6970-f7e4-d9caa97cf3c1")		
	private String		p_LocatorValue = null;
	/** Product Parameter			*/
	@XendraProcessParameter(Name="Product Key",
			                ColumnName="ProductValue",
			                Description="Key of the Product",
			                Help="",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=15,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="%",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="24fda0d7-cb31-f474-f2b3-7df6dea0c939")	
	private String		p_ProductValue = null;
	/** Product Category Parameter	*/
	@XendraProcessParameter(Name="Product Category",
			                ColumnName="M_Product_Category_ID",
			                Description="Category of a Product",
			                Help="Identifies the category which this product belongs to.  Product categories are used for pricing and selection.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=15,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=6,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="0",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="40b9e286-a6dd-ebfa-d21f-d8aff02c75b3")	
	private int			p_M_Product_Category_ID = 0;
	/** Qty Range Parameter			*/
	@XendraProcessParameter(Name="Inventory Quantity",
			                ColumnName="QtyRange",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="N",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="65bf9da5-50aa-593a-1aa9-56ae98a0cd98")	
	private String		p_QtyRange = null;
	/** Update to What			*/
	@XendraProcessParameter(Name="Set Inventory Count to",
			                ColumnName="InventoryCountSet",
			                Description="Set the value of the inventory count to Zero or On Hand Quantity",
			                Help="",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=60,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="O",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="bf6f3dfe-156d-ddbf-4bf7-8901125ba10b")	
	private boolean	p_InventoryCountSetZero = false;
	/** Delete Parameter			*/
	@XendraProcessParameter(Name="Delete old/existing records",
			                ColumnName="DeleteOld",
			                Description="Otherwise records will be added",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=70,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="N",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="3a61fb0e-56c6-1c0a-d90d-19bb98997c25")	
	private boolean		p_DeleteOld = false;
	
	/** Inventory Line				*/
	private MInventoryLine	m_line = null; 

	
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
			else if (name.equals("M_Locator_ID"))
				p_M_Locator_ID = para[i].getParameterAsInt();
			else if (name.equals("LocatorValue"))
				p_LocatorValue = (String)para[i].getParameter();
			else if (name.equals("ProductValue"))
				p_ProductValue = (String)para[i].getParameter();
			else if (name.equals("M_Product_Category_ID"))
				p_M_Product_Category_ID = para[i].getParameterAsInt();
			else if (name.equals("QtyRange"))
				p_QtyRange = (String)para[i].getParameter();
			else if (name.equals("InventoryCountSet"))
				p_InventoryCountSetZero = "Z".equals(para[i].getParameter());
			else if (name.equals("DeleteOld"))
				p_DeleteOld = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_M_Inventory_ID = getRecord_ID();
	}	//	prepare

	
	/**
	 * 	Process
	 *	@return message
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		log.info("M_Inventory_ID=" + p_M_Inventory_ID
			+ ", M_Locator_ID=" + p_M_Locator_ID + ", LocatorValue=" + p_LocatorValue
			+ ", ProductValue=" + p_ProductValue 
			+ ", M_Product_Category_ID=" + p_M_Product_Category_ID
			+ ", QtyRange=" + p_QtyRange + ", DeleteOld=" + p_DeleteOld);
		m_inventory = new MInventory (getCtx(), p_M_Inventory_ID, get_TrxName());
		if (m_inventory.get_ID() == 0)
			throw new XendraSystemError ("Not found: M_Inventory_ID=" + p_M_Inventory_ID);
		if (m_inventory.isProcessed())
			throw new XendraSystemError ("@M_Inventory_ID@ @Processed@");
		//
		if (p_DeleteOld)
		{
			//Added Line by armen
			String sql1 = "DELETE FROM M_InventoryLineMA ma WHERE EXISTS "
				+ "(SELECT * FROM M_InventoryLine l WHERE l.M_InventoryLine_ID=ma.M_InventoryLine_ID"
				+ " AND Processed='N' AND M_Inventory_ID=" + p_M_Inventory_ID + ")";
			int no1 = DB.executeUpdate(sql1, get_TrxName());
			log.fine("doIt - Deleted MA #" + no1);
			//End of Added Line
			
			String sql = "DELETE FROM M_InventoryLine WHERE Processed='N' "
				+ "AND M_Inventory_ID=" + p_M_Inventory_ID;
			int no = DB.executeUpdate(sql, get_TrxName());
			log.fine("doIt - Deleted #" + no);
		}
		
		//	Create Null Storage records
		if (p_QtyRange != null && p_QtyRange.equals("="))
		{
			String sql = "INSERT INTO M_Storage "
				+ "(AD_Client_ID, AD_Org_ID, IsActive, Created, CreatedBy, Updated, UpdatedBy,"
				+ " M_Locator_ID, M_Product_ID, M_AttributeSetInstance_ID,"
				+ " QtyOnHand, QtyReserved, QtyOrdered, DateLastInventory) "
				+ "SELECT l.AD_CLIENT_ID, l.AD_ORG_ID, 'Y', CURRENT_TIMESTAMP, 0,CURRENT_TIMESTAMP, 0,"
				+ " l.M_Locator_ID, p.M_Product_ID, 0,"
				+ " 0,0,0,null "
				+ "FROM M_Locator l"
				+ " INNER JOIN M_Product p ON (l.AD_Client_ID=p.AD_Client_ID) "
				+ "WHERE l.M_Warehouse_ID=" + m_inventory.getM_Warehouse_ID();
			if (p_M_Locator_ID != 0)
				sql += " AND l.M_Locator_ID=" + p_M_Locator_ID;
			sql += " AND l.IsDefault='Y'"
				+ " AND p.IsActive='Y' AND p.IsStocked='Y' and p.ProductType='I'"
				+ " AND NOT EXISTS (SELECT * FROM M_Storage s"
					+ " INNER JOIN M_Locator sl ON (s.M_Locator_ID=sl.M_Locator_ID) "
					+ "WHERE sl.M_Warehouse_ID=l.M_Warehouse_ID"
					+ " AND s.M_Product_ID=p.M_Product_ID)";
			int no = DB.executeUpdate(sql, get_TrxName());
			log.fine("'0' Inserted #" + no);
		}

		StringBuffer sql = new StringBuffer(
			"SELECT s.M_Product_ID, s.M_Locator_ID, s.M_AttributeSetInstance_ID,"
			+ " s.QtyOnHand, p.M_AttributeSet_ID "
			+ "FROM M_Product p"
			+ " INNER JOIN M_Storage s ON (s.M_Product_ID=p.M_Product_ID)"
			+ " INNER JOIN M_Locator l ON (s.M_Locator_ID=l.M_Locator_ID) "
			+ "WHERE l.M_Warehouse_ID=?"
			+ " AND p.IsActive='Y' AND p.IsStocked='Y' and p.ProductType='I'");
		//
		if (p_M_Locator_ID != 0)
			sql.append(" AND s.M_Locator_ID=?");
		//
		if (p_LocatorValue != null && 
			(p_LocatorValue.trim().length() == 0 || p_LocatorValue.equals("%")))
			p_LocatorValue = null;
		if (p_LocatorValue != null)
			sql.append(" AND UPPER(l.Value) LIKE ?");
		//
		if (p_ProductValue != null && 
			(p_ProductValue.trim().length() == 0 || p_ProductValue.equals("%")))
			p_ProductValue = null;
		if (p_ProductValue != null)
			sql.append(" AND UPPER(p.Value) LIKE ?");
		//
		if (p_M_Product_Category_ID != 0)
			sql.append(" AND p.M_Product_Category_ID=?");
		
		//	Do not overwrite existing records
		if (!p_DeleteOld)
			sql.append(" AND NOT EXISTS (SELECT * FROM M_InventoryLine il "
			+ "WHERE il.M_Inventory_ID=?"
			+ " AND il.M_Product_ID=s.M_Product_ID"
			+ " AND il.M_Locator_ID=s.M_Locator_ID"
			+ " AND COALESCE(il.M_AttributeSetInstance_ID,0)=COALESCE(s.M_AttributeSetInstance_ID,0))");
		//	+ " AND il.M_AttributeSetInstance_ID=s.M_AttributeSetInstance_ID)");
		//
		sql.append(" ORDER BY l.Value, p.Value, s.QtyOnHand DESC");	//	Locator/Product
		//
		int count = 0;
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql.toString(), get_TrxName());
			int index = 1;
			pstmt.setInt (index++, m_inventory.getM_Warehouse_ID());
			if (p_M_Locator_ID != 0)
				pstmt.setInt(index++, p_M_Locator_ID);
			if (p_LocatorValue != null) 
				pstmt.setString(index++, p_LocatorValue.toUpperCase());
			if (p_ProductValue != null) 
				pstmt.setString(index++, p_ProductValue.toUpperCase());
			if (p_M_Product_Category_ID != 0)
				pstmt.setInt(index++, p_M_Product_Category_ID);
			if (!p_DeleteOld)
				pstmt.setInt(index++, p_M_Inventory_ID);
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				int M_Product_ID = rs.getInt(1);
				int M_Locator_ID = rs.getInt(2);
				int M_AttributeSetInstance_ID = rs.getInt(3);
				BigDecimal QtyOnHand = rs.getBigDecimal(4);
				if (QtyOnHand == null)
					QtyOnHand = Env.ZERO;
				int M_AttributeSet_ID = rs.getInt(5);
				//
				int compare = QtyOnHand.compareTo(Env.ZERO);
		        if (p_QtyRange == null
		        	|| (p_QtyRange.equals(">") && compare > 0)
		            || (p_QtyRange.equals("<") && compare < 0)
		            || (p_QtyRange.equals("=") && compare == 0)
		            || (p_QtyRange.equals("N") && compare != 0))
		        {
					count += createInventoryLine (M_Locator_ID, M_Product_ID, 
						M_AttributeSetInstance_ID, QtyOnHand, M_AttributeSet_ID);
		        }
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		
		//	Set Count to Zero
		if (p_InventoryCountSetZero)
		{
			String sql1 = "UPDATE M_InventoryLine l "
				+ "SET QtyCount=0 "
				+ "WHERE M_Inventory_ID=" + p_M_Inventory_ID;
			int no = DB.executeUpdate(sql1, get_TrxName());
			log.info("Set Cont to Zero=" + no);
		}
		
		//
		return "@M_InventoryLine_ID@ - #" + count;
	}	//	doIt
	
	/**
	 * 	Create/Add to Inventory Line
	 *	@param M_Product_ID product
	 *	@param M_Locator_ID locator
	 *	@param M_AttributeSetInstance_ID asi
	 *	@param QtyOnHand qty
	 *	@param M_AttributeSet_ID as
	 *	@return lines added
	 */
	private int createInventoryLine (int M_Locator_ID, int M_Product_ID, 
		int M_AttributeSetInstance_ID, BigDecimal QtyOnHand, int M_AttributeSet_ID)
	{
		boolean oneLinePerASI = false;
		if (M_AttributeSet_ID != 0)
		{
			MAttributeSet mas = MAttributeSet.get(getCtx(), M_AttributeSet_ID, get_TrxName());
			oneLinePerASI = mas.isInstanceAttribute();
		}
		if (oneLinePerASI)
		{
			MInventoryLine line = new MInventoryLine (m_inventory, M_Locator_ID, 
				M_Product_ID, M_AttributeSetInstance_ID, 
				QtyOnHand, QtyOnHand);		//	book/count
			if (line.save())
				return 1;
			return 0;
		}
		
		if (QtyOnHand.signum() == 0)
			M_AttributeSetInstance_ID = 0;
		
		if (m_line != null 
			&& m_line.getM_Locator_ID() == M_Locator_ID
			&& m_line.getM_Product_ID() == M_Product_ID)
		{
			if (QtyOnHand.signum() == 0)
				return 0;
			//	Same ASI (usually 0)
			if (m_line.getM_AttributeSetInstance_ID() == M_AttributeSetInstance_ID)
			{
				m_line.setQtyBook(m_line.getQtyBook().add(QtyOnHand));
				m_line.setQtyCount(m_line.getQtyCount().add(QtyOnHand));
				m_line.save();
				return 0;
			}
			//	Save Old Line info
			else if (m_line.getM_AttributeSetInstance_ID() != 0)
			{
				MInventoryLineMA ma = new MInventoryLineMA (m_line, 
					m_line.getM_AttributeSetInstance_ID(), m_line.getQtyBook());
				if (!ma.save())
					;
			}
			m_line.setM_AttributeSetInstance_ID(0);
			m_line.setQtyBook(m_line.getQtyBook().add(QtyOnHand));
			m_line.setQtyCount(m_line.getQtyCount().add(QtyOnHand));
			m_line.save();
			//
			MInventoryLineMA ma = new MInventoryLineMA (m_line, 
				M_AttributeSetInstance_ID, QtyOnHand);
			if (!ma.save())
				;
			return 0;
		}
		//	new line
		m_line = new MInventoryLine (m_inventory, M_Locator_ID, 
			M_Product_ID, M_AttributeSetInstance_ID, 
			QtyOnHand, QtyOnHand);		//	book/count
		if (m_line.save())
			return 1;
		return 0;
	}	//	createInventoryLine
	
}	//	InventoryCountCreate
