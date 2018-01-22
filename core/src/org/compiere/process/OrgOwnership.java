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

//import org.compiere.model.*;
import java.util.logging.*;
import org.compiere.util.*;
import org.xendra.annotations.*;
/**
 *	Org Ownership Process
 *	
 *  @author Jorg Janke
 *  @version $Id: OrgOwnership.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="OrgOwnership Product",
name="Product Organization",
description="Set and verify Organization ownership of Products",
help="The process allows you to change or verify the organization ownership of Products and its dependent entities (BOM, Substitute, Replenish, Purchasing, Business Partner Info, Costing). <br>Select either a Product Category ar a specific Product.",
Identifier="e8d91505-fec1-9aa1-c89a-2edfb110dd9e",
classname="org.compiere.process.OrgOwnership",
updated="2015-06-20 10:10:12")
public class OrgOwnership extends SvrProcess
{
	/**	Organization Parameter		*/
	@XendraProcessParameter(Name="Organization",
			                ColumnName="AD_Org_ID",
			                Description="Organizational entity within client",
			                Help="An organization is a unit of your client or legal entity - examples are store, department. You can share data between organizations.",
			                AD_Reference_ID=DisplayType.TableDir,
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
			                Identifier="1d4c217e-2647-b456-d254-6512ce0223e8")	
	private int		p_AD_Org_ID = -1;
	@XendraProcessParameter(Name="Warehouse",
                ColumnName="M_Warehouse_ID",
                Description="Storage Warehouse and Service Point",
                Help="The Warehouse identifies a unique Warehouse where products are stored or Services are provided.",
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
                Identifier="12d84171-e2e3-d4a7-1db4-e99779945447")	
	private int		p_M_Warehouse_ID = -1;
	@XendraProcessParameter(Name="Product Category",
                ColumnName="M_Product_Category_ID",
                Description="Category of a Product",
                Help="Identifies the category which this product belongs to.  Product categories are used for pricing and selection.",
                AD_Reference_ID=DisplayType.TableDir,
                SeqNo=20,
                ReferenceValueID="",
                ValRuleID="",
                FieldLength=0,
                IsMandatory=false,
                IsRange=false,
                DefaultValue="-1",
                DefaultValue2="",
                vFormat="",
                valueMin="",
                valueMax="",
                DisplayLogic="",
                ReadOnlyLogic="",
                Identifier="76c79cf7-7014-0365-c2b7-92246416b801")	
	private int		p_M_Product_Category_ID = -1;
	@XendraProcessParameter(Name="Product",
                ColumnName="M_Product_ID",
                Description="Product, Service, Item",
                Help="Identifies an item which is either purchased or sold in this organization.",
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
                Identifier="2bfaba61-7376-6667-a7da-a73abdfcd471")
	private int		p_M_Product_ID = -1;
	@XendraProcessParameter(Name="Business Partner Group",
                ColumnName="C_BP_Group_ID",
                Description="Business Partner Group",
                Help="The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.",
                AD_Reference_ID=DisplayType.TableDir,
                SeqNo=20,
                ReferenceValueID="",
                ValRuleID="",
                FieldLength=0,
                IsMandatory=false,
                IsRange=false,
                DefaultValue="-1",
                DefaultValue2="",
                vFormat="",
                valueMin="",
                valueMax="",
                DisplayLogic="",
                ReadOnlyLogic="",
                Identifier="2fcb6cf0-4d53-1369-499f-005d3686bc10")	
	private int		p_C_BP_Group_ID = -1;
	@XendraProcessParameter(Name="Business Partner ",
                ColumnName="C_BPartner_ID",
                Description="Identifies a Business Partner",
                Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
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
                Identifier="d41cee97-58ee-2955-a01d-6326c12c4f9a")
	private int		p_C_BPartner_ID = -1;
	
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
			else if (name.equals("AD_Org_ID"))
				p_AD_Org_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("M_Warehouse_ID"))
				p_M_Warehouse_ID = ((BigDecimal)para[i].getParameter()).intValue();
				
			else if (name.equals("M_Product_Category_ID"))
				p_M_Product_Category_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("M_Product_ID"))
				p_M_Product_ID = ((BigDecimal)para[i].getParameter()).intValue();

			else if (name.equals("C_BP_Group_ID"))
				p_C_BP_Group_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("C_BPartner_ID"))
				p_C_BPartner_ID = ((BigDecimal)para[i].getParameter()).intValue();

			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message (clear text)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		log.info ("doIt - AD_Org_ID=" + p_AD_Org_ID);
		if (p_AD_Org_ID < 0)
			throw new IllegalArgumentException ("OrgOwnership - invalid AD_Org_ID=" + p_AD_Org_ID);
			
		generalOwnership();	
			
		if (p_M_Warehouse_ID > 0)
			return warehouseOwnership();
			
		if (p_M_Product_ID > 0 || p_M_Product_Category_ID > 0)
			return productOwnership();
			
		if (p_C_BPartner_ID > 0 || p_C_BP_Group_ID > 0)
			return bPartnerOwnership();

		
		return "* Not supported * **";
	}	//	doIt

	/**
	 * 	Set Warehouse Ownership
	 *	@return ""
	 */
	private String warehouseOwnership ()
	{
		log.info ("warehouseOwnership - M_Warehouse_ID=" + p_M_Warehouse_ID);
		if (p_AD_Org_ID == 0)
			throw new IllegalArgumentException ("Warehouse - Org cannot be * (0)");

		//	Set Warehouse
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE M_Warehouse "
			+ "SET AD_Org_ID=").append(p_AD_Org_ID)
			.append(" WHERE M_Warehouse_ID=").append(p_M_Warehouse_ID)
			.append(" AND AD_Client_ID=").append(getAD_Client_ID())
			.append(" AND AD_Org_ID<>").append(p_AD_Org_ID);
		int no = DB.executeUpdate(sql.toString(), get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "M_Warehouse_ID"));
		
		//	Set Accounts
		sql = new StringBuffer();
		sql.append("UPDATE M_Warehouse_Acct "
			+ "SET AD_Org_ID=").append(p_AD_Org_ID)
			.append(" WHERE M_Warehouse_ID=").append(p_M_Warehouse_ID)
			.append(" AND AD_Client_ID=").append(getAD_Client_ID())
			.append(" AND AD_Org_ID<>").append(p_AD_Org_ID);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "C_AcctSchema_ID"));

		//	Set Locators
		sql = new StringBuffer();
		sql.append("UPDATE M_Locator "
			+ "SET AD_Org_ID=").append(p_AD_Org_ID)
			.append(" WHERE M_Warehouse_ID=").append(p_M_Warehouse_ID)
			.append(" AND AD_Client_ID=").append(getAD_Client_ID())
			.append(" AND AD_Org_ID<>").append(p_AD_Org_ID);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "M_Locator_ID"));
	
		//	Set Storage
		sql = new StringBuffer();
		sql.append("UPDATE M_Storage s "
			+ "SET AD_Org_ID=").append(p_AD_Org_ID)
			.append(" WHERE EXISTS "
				+ "(SELECT * FROM M_Locator l WHERE l.M_Locator_ID=s.M_Locator_ID"
				+ " AND l.M_Warehouse_ID=").append(p_M_Warehouse_ID)
			.append(") AND AD_Client_ID=").append(getAD_Client_ID())
			.append(" AND AD_Org_ID<>").append(p_AD_Org_ID);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "Storage"));
			
		return "";
	}	//	warehouseOwnership

	/**
	 * 	Product Ownership
	 *	@return ""
	 */
	private String productOwnership ()
	{
		log.info ("productOwnership - M_Product_Category_ID=" + p_M_Product_Category_ID
			+ ", M_Product_ID=" + p_M_Product_ID);
			
		String set = " SET AD_Org_ID=" + p_AD_Org_ID;
		if (p_M_Product_Category_ID > 0)
			set += " WHERE EXISTS (SELECT * FROM M_Product p"
				+ " WHERE p.M_Product_ID=x.M_Product_ID AND p.M_Product_Category_ID=" 
					+ p_M_Product_Category_ID + ")";
		else
			set += " WHERE M_Product_ID=" + p_M_Product_ID;
		set += " AND AD_Client_ID=" + getAD_Client_ID() + " AND AD_Org_ID<>" + p_AD_Org_ID;
		log.fine("productOwnership - " + set);
		
		//	Product
		String sql = "UPDATE M_Product x " + set;
		int no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "M_Product_ID"));
		
		//	Acct
		sql = "UPDATE M_Product_Acct x " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "C_AcctSchema_ID"));
		
		//	BOM
		sql = "UPDATE M_Product_BOM x " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "M_Product_BOM_ID"));
		
		//	PO
		sql = "UPDATE M_Product_PO x " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "PO"));

		//	Trl
		sql = "UPDATE M_Product_Trl x " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "AD_Language"));

		return "";
	}	//	productOwnership

	/**
	 * 	Business Partner Ownership
	 *	@return ""
	 */
	private String bPartnerOwnership ()
	{
		log.info ("bPartnerOwnership - C_BP_Group_ID=" + p_C_BP_Group_ID
			+ ", C_BPartner_ID=" + p_C_BPartner_ID);
			
		String set = " SET AD_Org_ID=" + p_AD_Org_ID;
		if (p_C_BP_Group_ID > 0)
			set += " WHERE EXISTS (SELECT * FROM C_BPartner bp WHERE bp.C_BPartner_ID=x.C_BPartner_ID AND bp.C_BP_Group_ID=" + p_C_BP_Group_ID + ")";
		else
			set += " WHERE C_BPartner_ID=" + p_C_BPartner_ID;
		set += " AND AD_Client_ID=" + getAD_Client_ID() + " AND AD_Org_ID<>" + p_AD_Org_ID;
		log.fine("bPartnerOwnership - " + set);

		//	BPartner
		String sql = "UPDATE C_BPartner x " + set;
		int no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "C_BPartner_ID"));
		
		//	Acct xxx
		sql = "UPDATE C_BP_Customer_Acct x " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "C_AcctSchema_ID"));
		sql = "UPDATE C_BP_Employee_Acct x " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "C_AcctSchema_ID"));
		sql = "UPDATE C_BP_Vendor_Acct x " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "C_AcctSchema_ID"));
		
		//	Location
		sql = "UPDATE C_BPartner_Location x " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "C_BPartner_Location_ID"));

		//	Contcat/User
		sql = "UPDATE AD_User x " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "AD_User_ID"));
		
		//	BankAcct
		sql = "UPDATE C_BP_BankAccount x " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		addLog (0,null, new BigDecimal(no), Msg.translate(getCtx(), "C_BP_BankAccount_ID"));

		return "";
	}	//	bPartnerOwnership

	/**
	 * 	Set General Ownership (i.e. Org to 0).
	 * 	In general for items with two parents
	 */
	private void generalOwnership ()
	{
		String set = "SET AD_Org_ID=0 WHERE AD_Client_ID=" + getAD_Client_ID()
			+ " AND AD_Org_ID<>0"; 
			
		//	R_ContactInterest
		String sql = "UPDATE R_ContactInterest " + set;
		int no = DB.executeUpdate(sql, get_TrxName());
		if (no != 0)
			log.fine("generalOwnership - R_ContactInterest=" + no);

		//	AD_User_Roles
		sql = "UPDATE AD_User_Roles " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		if (no != 0)
			log.fine("generalOwnership - AD_User_Roles=" + no);
		
		//	C_BPartner_Product
		sql = "UPDATE C_BPartner_Product " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		if (no != 0)
			log.fine("generalOwnership - C_BPartner_Product=" + no);

		//	Withholding
		sql = "UPDATE C_BP_Withholding x " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		if (no != 0)
			log.fine("generalOwnership - C_BP_Withholding=" + no);

		//	Costing
		sql = "UPDATE M_Product_Costing " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		if (no != 0)
			log.fine("generalOwnership - M_Product_Costing=" + no);

		//	Replenish
		sql = "UPDATE M_Replenish " + set;
		no = DB.executeUpdate(sql, get_TrxName());
		if (no != 0)
			log.fine("generalOwnership - M_Replenish=" + no);
	
	}	//	generalOwnership


}	//	OrgOwnership
