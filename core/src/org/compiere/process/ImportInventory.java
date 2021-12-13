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
import java.util.List;
import java.util.logging.*;

import org.compiere.model.MAttributeSet;
import org.compiere.model.MAttributeSetInstance;
import org.compiere.model.MInventory;
import org.compiere.model.MInventoryLine;
import org.compiere.model.MProduct;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_I_Inventory;
import org.compiere.model.reference.REF_M_InventoryType;
import org.compiere.util.*;

import org.xendra.Constants;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
import org.xendra.util.UpdatePO;

/**
 * Import Physical Inventory fom I_Inventory
 * 
 * @author Jorg Janke
 * @version $Id: ImportInventory.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value = "Import_Inventory", name = "Import Inventory", description = "Import Physical Inventory", help = "The Parameters are default values for null import record values, they do not overwrite any data.", Identifier = "b484f1fb-0fc1-6dde-62ab-d7f21945baf0", classname = "org.compiere.process.ImportInventory", updated = "2015-06-20 10:10:12")
public class ImportInventory extends SvrProcess {
	/** Client to be imported to */
	@XendraProcessParameter(Name = "Client", ColumnName = "AD_Client_ID", Description = "Client/Tenant for this installation.", Help = "A Client is a company or a legal entity. You cannot share data between Clients. Tenant is a synonym for Client.", AD_Reference_ID = DisplayType.TableDir, SeqNo = 10, ReferenceValueID = "", ValRuleID = "", FieldLength = 0, IsMandatory = true, IsRange = false, DefaultValue = "", DefaultValue2 = "", vFormat = "", valueMin = "", valueMax = "", DisplayLogic = "", ReadOnlyLogic = "", Identifier = "660c3e19-3559-9255-bfcf-3e218e58606b")
	private int p_AD_Client_ID = 0;
	/** Organization to be imported to */
	@XendraProcessParameter(Name = "Organization", ColumnName = "AD_Org_ID", Description = "Organizational entity within client", Help = "An organization is a unit of your client or legal entity - examples are store, department. You can share data between organizations.", AD_Reference_ID = DisplayType.TableDir, SeqNo = 20, ReferenceValueID = "", ValRuleID = "", FieldLength = 0, IsMandatory = true, IsRange = false, DefaultValue = "-1", DefaultValue2 = "", vFormat = "", valueMin = "", valueMax = "", DisplayLogic = "", ReadOnlyLogic = "", Identifier = "c50981cd-9b90-b70c-fb33-f5dcbbcfe137")
	private int p_AD_Org_ID = 0;
	/** Location to be imported to */
	@XendraProcessParameter(Name = "Locator", ColumnName = "M_Locator_ID", Description = "Warehouse Locator", Help = "The Locator indicates where in a Warehouse a product is located.", AD_Reference_ID = DisplayType.Locator, SeqNo = 30, ReferenceValueID = "", ValRuleID = "", FieldLength = 0, IsMandatory = true, IsRange = false, DefaultValue = "0", DefaultValue2 = "", vFormat = "", valueMin = "", valueMax = "", DisplayLogic = "", ReadOnlyLogic = "", Identifier = "3efdc423-841b-8da4-2cf4-5f5bc814ddc1")
	private int p_M_Locator_ID = 0;
	/** Default Date */
	@XendraProcessParameter(Name = "Movement Date", ColumnName = "MovementDate", Description = "Date a product was moved in or out of inventory", Help = "The Movement Date indicates the date that a product moved in or out of inventory.  This is the result of a shipment, receipt or inventory movement.", AD_Reference_ID = DisplayType.Date, SeqNo = 40, ReferenceValueID = "", ValRuleID = "", FieldLength = 0, IsMandatory = true, IsRange = false, DefaultValue = "@#Date@", DefaultValue2 = "", vFormat = "", valueMin = "", valueMax = "", DisplayLogic = "", ReadOnlyLogic = "", Identifier = "9de95d14-31c6-3691-6668-6a6a001ebdfd")
	private Timestamp p_MovementDate = null;
	/** Delete old Imported */
	@XendraProcessParameter(Name = "Delete old imported records", ColumnName = "DeleteOldImported", Description = "Before processing delete old imported records in the import table", Help = "", AD_Reference_ID = DisplayType.YesNo, SeqNo = 50, ReferenceValueID = "", ValRuleID = "", FieldLength = 0, IsMandatory = false, IsRange = false, DefaultValue = "", DefaultValue2 = "", vFormat = "", valueMin = "", valueMax = "", DisplayLogic = "", ReadOnlyLogic = "", Identifier = "acef9033-bf18-9b3b-7a26-98abe812e927")
	private boolean p_DeleteOldImported = false;

	/**
	 * Prepare - e.g., get Parameters.
	 */
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Client_ID"))
				p_AD_Client_ID = ((BigDecimal) para[i].getParameter())
				.intValue();
			else if (name.equals("AD_Org_ID"))
				p_AD_Org_ID = ((BigDecimal) para[i].getParameter()).intValue();
			else if (name.equals("M_Locator_ID"))
				p_M_Locator_ID = ((BigDecimal) para[i].getParameter())
				.intValue();
			else if (name.equals("MovementDate"))
				p_MovementDate = (Timestamp) para[i].getParameter();
			else if (name.equals("DeleteOldImported"))
				p_DeleteOldImported = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	} // prepare

	/**
	 * Perrform process.
	 * 
	 * @return Message
	 * @throws Exception
	 */
	protected String doIt() throws java.lang.Exception
	{
		log.info("M_Locator_ID=" + p_M_Locator_ID + ",MovementDate=" + p_MovementDate);
		//
		StringBuffer sql = null;
		int no = 0;

		//	****	Prepare	****
		UpdatePO o = new UpdatePO();
		//	Delete Old Imported
		if (p_DeleteOldImported)
		{
			o.setTablename(X_I_Inventory.Table_Name);
			o.setClient(p_AD_Client_ID);
			no = o.delete("I_IsImported='Y'", get_TrxName());
			log.fine("Delete Old Impored =" + no);
		}

		//	Set Client, Org, Location, IsActive, Created/Updated
		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setField(X_I_Inventory.COLUMNNAME_I_ErrorMsg, "");
		o.setFieldExpr(X_I_Inventory.COLUMNNAME_M_Warehouse_ID, "NULL");
		o.setField(X_I_Inventory.COLUMNNAME_I_IsImported, Constants.NO);
		no = o.update("I_IsImported<>'Y' OR I_IsImported IS NULL", get_TrxName());
		log.info ("Reset=" + no);

		String fieldexpr = ""; 
		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setField(X_I_Inventory.COLUMNNAME_I_IsImported, Constants.ERROR);
		o.setFieldExpr(X_I_Inventory.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Invalid Org,'");
		o.setAlias("o");
		o.setClient(p_AD_Client_ID);
		String where = "(AD_Org_ID IS NULL OR AD_Org_ID=0 OR ";
		where += " EXISTS (SELECT * FROM AD_Org oo WHERE o.AD_Org_ID=oo.AD_Org_ID AND (oo.IsSummary='Y' OR oo.IsActive='N')))";
		where += " AND I_IsImported<>'Y'"; 
		no = o.update(where, get_TrxName());
		if (no != 0)
			log.warning ("Invalid Org=" + no);


		//	Location
		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setAlias("i");
		o.setClient(p_AD_Client_ID);
		fieldexpr = "(SELECT MAX(M_Locator_ID) FROM M_Locator l WHERE i.LocatorValue=l.Value AND i.AD_Client_ID=l.AD_Client_ID)";
		o.setFieldExpr(X_I_Inventory.COLUMNNAME_M_Locator_ID, fieldexpr);
		no = o.update("M_Locator_ID IS NULL AND LocatorValue IS NOT NULL AND I_IsImported<>'Y'", get_TrxName());

		log.fine("Set Locator from Value =" + no);
		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setAlias("i");
		o.setClient(p_AD_Client_ID);
		fieldexpr = "(SELECT MAX(M_Locator_ID) FROM M_Locator l WHERE i.X=l.X AND i.Y=l.Y AND i.Z=l.Z AND i.AD_Client_ID=l.AD_Client_ID)";
		o.setFieldExpr(X_I_Inventory.COLUMNNAME_M_Locator_ID, fieldexpr);
		no = o.update("M_Locator_ID IS NULL AND X IS NOT NULL AND Y IS NOT NULL AND Z IS NOT NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Locator from X,Y,Z =" + no);
		if (p_M_Locator_ID != 0)
		{
			o = new UpdatePO();
			o.setTablename(X_I_Inventory.Table_Name);
			o.setField(X_I_Inventory.COLUMNNAME_M_Locator_ID, p_M_Locator_ID);
			o.setClient(p_AD_Client_ID);
			no = o.update("M_Locator_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
			log.fine("Set Locator from Parameter=" + no);
		}
		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setClient(p_AD_Client_ID);
		o.setField(X_I_Inventory.COLUMNNAME_I_IsImported, Constants.ERROR);
		o.setFieldExpr(X_I_Inventory.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=No Location,'");
		no = o.update("M_Locator_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());		
		if (no != 0)
			log.warning ("No Location=" + no);

		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setAlias("i");
		o.setClient(p_AD_Client_ID);
		fieldexpr ="(SELECT M_Warehouse_ID FROM M_Locator l WHERE i.M_Locator_ID=l.M_Locator_ID)";
		o.setFieldExpr(X_I_Inventory.COLUMNNAME_M_Warehouse_ID, fieldexpr);
		no = o.update("M_Locator_ID IS NOT NULL AND I_IsImported<>'Y'", get_TrxName());

		log.fine("Set Warehouse from Locator =" + no);
		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setClient(p_AD_Client_ID);
		o.setField(X_I_Inventory.COLUMNNAME_I_IsImported, Constants.ERROR);
		o.setFieldExpr(X_I_Inventory.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=No Warehouse,'");
		no = o.update("M_Warehouse_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		if (no != 0)
			log.warning ("No Warehouse=" + no);


		//	Product
		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setAlias("i");
		o.setClient(p_AD_Client_ID);
		fieldexpr = "(SELECT MAX(M_Product_ID) FROM M_Product p WHERE i.Product_Value=p.Value AND i.AD_Client_ID=p.AD_Client_ID)"; 
		o.setFieldExpr(X_I_Inventory.COLUMNNAME_M_Product_ID, fieldexpr);
		no = o.update("M_Product_ID IS NULL AND Product_Value IS NOT NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Product from Value=" + no);

		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setAlias("i");
		o.setClient(p_AD_Client_ID);
		fieldexpr = "(SELECT MAX(M_Product_ID) FROM M_Product p WHERE i.UPC=p.UPC AND i.AD_Client_ID=p.AD_Client_ID) ";
		o.setFieldExpr(X_I_Inventory.COLUMNNAME_M_Product_ID, fieldexpr);
		no = o.update("M_Product_ID IS NULL AND UPC IS NOT NULL AND I_IsImported<>'Y'", get_TrxName());		
		log.fine("Set Product from UPC=" + no);

		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setClient(p_AD_Client_ID);
		o.setField(X_I_Inventory.COLUMNNAME_I_IsImported, Constants.ERROR);
		o.setFieldExpr(X_I_Inventory.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=No Product,'");
		no = o.update("M_Product_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		if (no != 0)
			log.warning ("No Product=" + no);

		//	No QtyCount
		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setClient(p_AD_Client_ID);
		o.setField(X_I_Inventory.COLUMNNAME_I_IsImported, Constants.ERROR);
		o.setFieldExpr(X_I_Inventory.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=No Qty Count,'");
		no = o.update("QtyCount IS NULL AND I_IsImported<>'Y'", get_TrxName());	
		if (no != 0)
			log.warning ("No QtyCount=" + no);

		commit();

		MInventory inventory = null;
		int x_M_Warehouse_ID = -1;
		Timestamp x_MovementDate = null;
		int noInsert = 0;
		int noInsertLine = 0;

		List<X_I_Inventory> inventories = new Query(Env.getCtx(), X_I_Inventory.Table_Name, "I_IsImported='N'", get_TrxName())
		.setOrderBy("M_Warehouse_ID, TRUNC(MovementDate), I_Inventory_ID").list();
		for (X_I_Inventory imp:inventories) {
			Timestamp MovementDate = TimeUtil.getDay(imp.getMovementDate());
			if (inventory == null
					|| imp.getM_Warehouse_ID() != x_M_Warehouse_ID
					|| !MovementDate.equals(x_MovementDate))
			{
				inventory = new MInventory (getCtx(), 0, get_TrxName());
				inventory.setClientOrg(imp.getAD_Client_ID(), imp.getAD_Org_ID());
				inventory.setDescription("I " + imp.getM_Warehouse_ID() + " " + MovementDate);
				inventory.setM_Warehouse_ID(imp.getM_Warehouse_ID());				
				inventory.setMovementDate(MovementDate);
				//
				if (!inventory.save())
				{
					log.log(Level.SEVERE, "Inventory not saved");
					break;
				}
				x_M_Warehouse_ID = imp.getM_Warehouse_ID();
				x_MovementDate = MovementDate;
				noInsert++;
			}

			//	Line
			int M_AttributeSetInstance_ID = 0;
			if (imp.getLot() != null || imp.getSerNo() != null)
			{
				MProduct product = MProduct.get(getCtx(), imp.getM_Product_ID(), get_TrxName());
				MAttributeSet mas = product.getAttributeSet();
				if (mas == null) {
					String m_lang  = Env.getAD_Language(Env.getCtx());
					String defaultName = Msg.translate(m_lang, "Standard");
					mas = new Query(Env.getCtx(), MAttributeSet.Table_Name, "name = ?", get_TrxName()).setParameters(defaultName).first();
					if (mas == null) {
						mas = new MAttributeSet(Env.getCtx(), 0, get_TrxName());
						mas.setName(defaultName);
						if (imp.getLot() != null)
							mas.setIsLot(true);
						if (imp.getSerNo() != null)
							mas.setIsSerNo(true);
						mas.save();
					}			
					product.setM_AttributeSet_ID(mas.getM_AttributeSet_ID());
					product.save();
				}
				MAttributeSetInstance masi = new MAttributeSetInstance(getCtx(), 0, mas.getM_AttributeSet_ID(), get_TrxName());
				if (mas.isLot() && imp.getLot() != null)
					masi.setLot(imp.getLot(), imp.getM_Product_ID());
				if (mas.isSerNo() && imp.getSerNo() != null)
					masi.setSerNo(imp.getSerNo());
				masi.setDescription();
				masi.save();
				M_AttributeSetInstance_ID = masi.getM_AttributeSetInstance_ID();
				//}
			}
			MInventoryLine line = new MInventoryLine (inventory, 
					imp.getM_Locator_ID(), imp.getM_Product_ID(), M_AttributeSetInstance_ID,
					imp.getQtyBook(), imp.getQtyCount());
			line.setCost(imp.getCost());
			line.setInventoryType(REF_M_InventoryType.InitialCharge);
			if (line.save())
			{
				imp.setI_IsImported(true);
				imp.setM_Inventory_ID(line.getM_Inventory_ID());
				imp.setM_InventoryLine_ID(line.getM_InventoryLine_ID());
				imp.setProcessed(true);
				if (imp.save())
					noInsertLine++;
			}			
		}
		o = new UpdatePO();
		o.setTablename(X_I_Inventory.Table_Name);
		o.setField(X_I_Inventory.COLUMNNAME_I_IsImported, Constants.NO);
		o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
		no = o.update("I_IsImported<>'Y'", get_TrxName());		
		addLog (0, null, new BigDecimal (no), "@Errors@");
		addLog (0, null, new BigDecimal (noInsert), "@M_Inventory_ID@: @Inserted@");
		addLog (0, null, new BigDecimal (noInsertLine), "@M_InventoryLine_ID@: @Inserted@");
		return "";
	}	//	doIt

} // ImportInventory
