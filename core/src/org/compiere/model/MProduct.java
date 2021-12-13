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
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_AD_Tree;
import org.compiere.model.persistence.X_I_Product;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_Product_Brand;
import org.compiere.model.persistence.X_M_Product_Group;
import org.compiere.model.reference.REF_AD_TreeTypeType;
import org.compiere.model.reference.REF_M_Product_ProductType;
import org.compiere.util.CCache;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;

/**
 * 	Product Model
 *
 *	@author Jorg Janke
 *	@version $Id: MProduct.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class MProduct extends X_M_Product
{
	/**
	 * 	Get MProduct from Cache
	 *	@param ctx context
	 *	@param M_Product_ID id
	 *	@return MProduct
	 */
	public static MProduct get (Properties ctx, int M_Product_ID, String trxName)
	{
		Integer key = new Integer (M_Product_ID);
		MProduct retValue = (MProduct) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MProduct (ctx, M_Product_ID, trxName);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	}	//	get
	
	/**
	 * Get MProduct using UPC/EAN (case sensitive)
	 * @param  ctx     Context
	 * @param  upc     The upc to look for
	 * @return List of MProduct
	 */
	public static List<MProduct> getByUPC(Properties ctx, String upc, String trxName)
	{
		final String whereClause = "UPC=?";
		Query q = new Query(ctx, Table_Name, whereClause, trxName);
		q.setParameters(upc).setClient_ID();
		return(q.list());
	}
	
	public static MProduct getByValue(Properties ctx, String value, String trxName)
	{
		final String whereClause = "Value=?";
		Query q = new Query(ctx, Table_Name, whereClause, trxName );
		q.setParameters(value).setClient_ID();
		return (q.first());
	}

	/**
	 * 	Get MProduct from Cache
	 *	@param ctx context
	 *	@param whereClause sql where clause
	 *	@param trxName trx
	 *	@return MProduct
	 */
	public static MProduct[] get (Properties ctx, String whereClause, String trxName)
	{
		String sql = "SELECT * FROM M_Product";
		if (whereClause != null && whereClause.length() > 0)
			sql += " WHERE AD_Client_ID=? AND " + whereClause;
		ArrayList<MProduct> list = new ArrayList<MProduct>();
		int AD_Client_ID = Env.getAD_Client_ID(ctx);
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setInt(1, AD_Client_ID);
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MProduct (ctx, rs, trxName));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e); 
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
		MProduct[] retValue = new MProduct[list.size ()];
		list.toArray (retValue);
		return retValue;
	}	//	get
	
	
	/**
	 * 	Is Product Stocked
	 * 	@param ctx context
	 *	@param M_Product_ID id
	 *	@return true if found and stocked - false otherwise
	 */
	public static boolean isProductStocked (Properties ctx, int M_Product_ID, String TrxName)
	{
		MProduct product = get (ctx, M_Product_ID, TrxName);
		return product.isStocked();
	}	//	isProductStocked
	
	/**	Cache						*/
	private static CCache<Integer,MProduct>	s_cache	= new CCache<Integer,MProduct>("M_Product", 200, 5);	//	5 minutes
	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MProduct.class);

	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_Product_ID id
	 *	@param trxName transaction
	 */
	public MProduct (Properties ctx, int M_Product_ID, String trxName)
	{
		super (ctx, M_Product_ID, trxName);
		if (M_Product_ID == 0)
		{
		//	setValue (null);
		//	setName (null);
		//	setM_Product_Category_ID (0);
		//	setC_TaxCategory_ID (0);
		//	setC_UOM_ID (0);
		//
			setProductType (REF_M_Product_ProductType.Item);	// I
			setIsBOM (false);	// N
			setIsInvoicePrintDetails (false);
			setIsPickListPrintDetails (false);
			setIsPurchased (true);	// Y
			setIsSold (true);	// Y
			setIsStocked (true);	// Y
			setIsSummary (false);
			setIsVerified (false);	// N
			setIsWebStoreFeatured (false);
			setIsSelfService(true);
			setIsExcludeAutoDelivery(false);
			setProcessing (false);	// N
		}
	}	//	MProduct

	/**
	 * 	Load constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MProduct (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MProduct

	/**
	 * 	Parent Constructor
	 *	@param et parent
	 */
	public MProduct (MExpenseType et)
	{
		this (et.getCtx(), 0, et.get_TrxName());
		setProductType(REF_M_Product_ProductType.ExpenseType);
		setExpenseType(et);
	}	//	MProduct
	
	/**
	 * 	Parent Constructor
	 *	@param resource parent
	 *	@param resourceType resource type
	 */
	public MProduct (MResource resource, MResourceType resourceType)
	{
		this (resource.getCtx(), 0, resource.get_TrxName());
		setProductType(REF_M_Product_ProductType.Resource);
		setResource(resource);
		setResource(resourceType);
	}	//	MProduct

	/**
	 * 	Import Constructor
	 *	@param impP import
	 */
	public MProduct (X_I_Product impP)
	{
		this (impP.getCtx(), 0, impP.get_TrxName());
		setClientOrg(impP);
		setUpdatedBy(impP.getUpdatedBy());
		//
		setValue(impP.getValue());
		setName(impP.getName());
		setShortName(impP.getShortName());
		setDescription(impP.getDescription());
		setDocumentNote(impP.getDocumentNote());
		setHelp(impP.getHelp());
		setUPC(impP.getUPC());
		setSKU(impP.getSKU());
		setC_TaxCategory_ID(impP.getC_TaxCategory_ID());
		setIsBOM(impP.isBOM());
		setC_UOM_ID(impP.getC_UOM_ID());
		setC_UOM_Order_ID(impP.getC_UOM_ID());
		setM_Product_Category_ID(impP.getM_Product_Category_ID());
		setM_Product_Type_ID(impP.getM_Product_Type_ID());
		setM_Product_Group_ID(impP.getM_Product_Group_ID());
		setM_Product_Generic_ID(impP.getM_Product_Generic_ID());
		setM_Product_Brand_ID(impP.getM_Product_Brand_ID());
		setProductType(impP.getProductType());
		setImageURL(impP.getImageURL());
		setDescriptionURL(impP.getDescriptionURL());
	}	//	MProduct
	
	/** Additional Downloads				*/
	private MProductDownload[] m_downloads = null;
	
	/**
	 * 	Set Expense Type
	 *	@param parent expense type
	 *	@return true if changed
	 */
	public boolean setExpenseType (MExpenseType parent)
	{
		boolean changed = false;
		if (!REF_M_Product_ProductType.ExpenseType.equals(getProductType()))
		{
			setProductType(REF_M_Product_ProductType.ExpenseType);
			changed = true;
		}
		if (parent.getS_ExpenseType_ID() != getS_ExpenseType_ID())
		{
			setS_ExpenseType_ID(parent.getS_ExpenseType_ID());
			changed = true;
		}
		if (parent.isActive() != isActive())
		{
			setIsActive(parent.isActive());
			changed = true;
		}
		//
		if (!parent.getValue().equals(getValue()))
		{
			setValue(parent.getValue());
			changed = true;
		}
		if (!parent.getName().equals(getName()))
		{
			setName(parent.getName());
			changed = true;
		}
		if ((parent.getDescription() == null && getDescription() != null)
			|| (parent.getDescription() != null && !parent.getDescription().equals(getDescription())))
		{
			setDescription(parent.getDescription());
			changed = true;
		}
		if (parent.getC_UOM_ID() != getC_UOM_ID())
		{
			setC_UOM_ID(parent.getC_UOM_ID());
			changed = true;
		}
		if (parent.getM_Product_Category_ID() != getM_Product_Category_ID())
		{
			setM_Product_Category_ID(parent.getM_Product_Category_ID());
			changed = true;
		}
		if (parent.getC_TaxCategory_ID() != getC_TaxCategory_ID())
		{
			setC_TaxCategory_ID(parent.getC_TaxCategory_ID());
			changed = true;
		}
		//
		return changed;
	}	//	setExpenseType
	
	/**
	 * 	Set Resource
	 *	@param parent resource
	 *	@return true if changed
	 */
	public boolean setResource (MResource parent)
	{
		boolean changed = false;
		if (!REF_M_Product_ProductType.Resource.equals(getProductType()))
		{
			setProductType(REF_M_Product_ProductType.Resource);
			changed = true;
		}
		if (parent.getS_Resource_ID() != getS_Resource_ID())
		{
			setS_Resource_ID(parent.getS_Resource_ID());
			changed = true;
		}
		if (parent.isActive() != isActive())
		{
			setIsActive(parent.isActive());
			changed = true;
		}
		//
		if (!parent.getValue().equals(getValue()))
		{
			setValue(parent.getValue());
			changed = true;
		}
		if (!parent.getName().equals(getName()))
		{
			setName(parent.getName());
			changed = true;
		}
		if ((parent.getDescription() == null && getDescription() != null)
			|| (parent.getDescription() != null && !parent.getDescription().equals(getDescription())))
		{
			setDescription(parent.getDescription());
			changed = true;
		}
		//
		return changed;
	}	//	setResource

	/**
	 * 	Set Resource Type
	 *	@param parent resource type
	 *	@return true if changed
	 */
	public boolean setResource (MResourceType parent)
	{
		boolean changed = false;
		if (REF_M_Product_ProductType.Resource.equals(getProductType()))
		{
			setProductType(REF_M_Product_ProductType.Resource);
			changed = true;
		}
		//
		if (parent.getC_UOM_ID() != getC_UOM_ID())
		{
			setC_UOM_ID(parent.getC_UOM_ID());
			changed = true;
		}
		if (parent.getM_Product_Category_ID() != getM_Product_Category_ID())
		{
			setM_Product_Category_ID(parent.getM_Product_Category_ID());
			changed = true;
		}
		if (parent.getC_TaxCategory_ID() != getC_TaxCategory_ID())
		{
			setC_TaxCategory_ID(parent.getC_TaxCategory_ID());
			changed = true;
		}
		//
		return changed;
	}	//	setResource
	
	
	/**	UOM Precision			*/
	private Integer		m_precision = null;
	
	/**
	 * 	Get UOM Standard Precision
	 *	@return UOM Standard Precision
	 */
	public int getUOMPrecision()
	{
		if (m_precision == null)
		{
			int C_UOM_ID = getC_UOM_ID();
			if (C_UOM_ID == 0)
				return 0;	//	EA
			m_precision = new Integer (MUOM.getPrecision(getCtx(), C_UOM_ID));
		}
		return m_precision.intValue();
	}	//	getUOMPrecision
	
	
	/**
	 * 	Create Asset Group for this product
	 *	@return asset group id
	 */
	public int getA_Asset_Group_ID()
	{
		MProductCategory pc = MProductCategory.get(getCtx(), getM_Product_Category_ID());
		return pc.getA_Asset_Group_ID();
	}	//	getA_Asset_Group_ID

	/**
	 * 	Create Asset for this product
	 *	@return true if asset is created
	 */
	public boolean isCreateAsset()
	{
		MProductCategory pc = MProductCategory.get(getCtx(), getM_Product_Category_ID());
		return pc.getA_Asset_Group_ID() != 0;
	}	//	isCreated

	/**
	 * 	Get Attribute Set
	 *	@return set or null
	 */
	public MAttributeSet getAttributeSet()
	{
		if (getM_AttributeSet_ID() != 0)
			return MAttributeSet.get(getCtx(), getM_AttributeSet_ID(), get_TrxName());
		return null;
	}	//	getAttributeSet
	
	/**
	 * 	Has the Product Instance Attribute
	 *	@return true if instance attributes
	 */
	public boolean isInstanceAttribute()
	{
		if (getM_AttributeSet_ID() == 0)
			return false;
		MAttributeSet mas = MAttributeSet.get(getCtx(), getM_AttributeSet_ID(), get_TrxName());
		return mas.isInstanceAttribute();
	}	//	isInstanceAttribute
	
	/**
	 * 	Create One Asset Per UOM
	 *	@return individual asset
	 */
	public boolean isOneAssetPerUOM()
	{
		MProductCategory pc = MProductCategory.get(getCtx(), getM_Product_Category_ID());
		if (pc.getA_Asset_Group_ID() == 0)
			return false;
		MAssetGroup ag = MAssetGroup.get(getCtx(), pc.getA_Asset_Group_ID());
		return ag.isOneAssetPerUOM();
	}	//	isOneAssetPerUOM
	
	/**
	 * 	Product is Item
	 *	@return true if item
	 */
	public boolean isItem()
	{
		return REF_M_Product_ProductType.Item.equals(getProductType());
	}	//	isItem
		
	/**
	 * 	Product is an Item and Stocked
	 *	@return true if stocked and item
	 */
	public boolean isStocked ()
	{
		return super.isStocked() && isItem();
	}	//	isStocked
	
	/**
	 * 	Is Service
	 *	@return true if service (resource, online)
	 */
	public boolean isService()
	{
		//	REF_M_Product_ProductType.Service, REF_M_Product_ProductType.Resource, REF_M_Product_ProductType.Online
		return !isItem();	//	
	}	//	isService
	
	/**
	 * 	Get UOM Symbol
	 *	@return UOM Symbol
	 */
	public String getUOMSymbol()
	{
		int C_UOM_ID = getC_UOM_ID();
		if (C_UOM_ID == 0)
			return "";
		return MUOM.get(getCtx(), C_UOM_ID).getUOMSymbol();
	}	//	getUOMSymbol
		
	/**
	 * 	Get Active(!) Product Downloads
	 * 	@param requery requery
	 *	@return array of downloads
	 */
	public MProductDownload[] getProductDownloads (boolean requery)
	{
		if (m_downloads != null && !requery)
			return m_downloads;
		//
		ArrayList<MProductDownload> list = new ArrayList<MProductDownload>();
		String sql = "SELECT * FROM M_ProductDownload "
			+ "WHERE M_Product_ID=? AND IsActive='Y' ORDER BY Name";
		//
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getM_Product_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MProductDownload (getCtx(), rs, get_TrxName()));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log (Level.SEVERE, sql, e);
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
		//
		m_downloads = new MProductDownload[list.size ()];
		list.toArray (m_downloads);
		return m_downloads;
	}	//	getProductDownloads
	
	/**
	 * 	Does the product have downloads
	 *	@return true if downloads exists
	 */
	public boolean hasDownloads()
	{
		getProductDownloads(false);
		return m_downloads != null && m_downloads.length > 0;
	}	//	hasDownloads
	
	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString()
	{
		StringBuffer sb = new StringBuffer("MProduct[");
		sb.append(get_ID()).append("-").append(getValue()).append("-").append(getName())
			.append("]");
		return sb.toString();
	}	//	toString

	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		//	Check Storage
		if (!newRecord && 	//	
			((is_ValueChanged("IsActive") && !isActive())		//	now not active 
			|| (is_ValueChanged("IsStocked") && !isStocked())	//	now not stocked
			|| (is_ValueChanged("ProductType") 					//	from Item
				&& REF_M_Product_ProductType.Item.equals(get_ValueOld("ProductType")))))
		{
			MStorage[] storages = MStorage.getOfProduct(getCtx(), get_ID(), get_TrxName());
			BigDecimal OnHand = Env.ZERO;
			BigDecimal Ordered = Env.ZERO;
			BigDecimal Reserved = Env.ZERO;
			for (int i = 0; i < storages.length; i++)
			{
				OnHand = OnHand.add(storages[i].getQtyOnHand());
				Ordered = OnHand.add(storages[i].getQtyOrdered());
				Reserved = OnHand.add(storages[i].getQtyReserved());
			}
			String errMsg = "";
			if (OnHand.signum() != 0)
				errMsg = "@QtyOnHand@ = " + OnHand;
			if (Ordered.signum() != 0)
				errMsg += " - @QtyOrdered@ = " + Ordered;
			if (Reserved.signum() != 0)
				errMsg += " - @QtyReserved@" + Reserved;
			if (errMsg.length() > 0)
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), errMsg));
				super.setLastError(Msg.parseTranslation(getCtx(), errMsg));
				return false;
			}
		}	//	storage
		
		//	Reset Stocked if not Item
		if (isStocked() && !REF_M_Product_ProductType.Item.equals(getProductType()))
			setIsStocked(false);
		
		//	UOM reset
		if (m_precision != null && is_ValueChanged("C_UOM_ID"))
			m_precision = null;
		
		return true;
	}	//	beforeSave

	/**
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (!success)
			return success;
		
		//	Value/Name change in Account
		if (!newRecord && (is_ValueChanged("Value") || is_ValueChanged("Name")))
			MAccount.updateValueDescription(getCtx(), "M_Product_ID=" + getM_Product_ID(), get_TrxName());
		
		//	Name/Description Change in Asset	MAsset.setValueNameDescription
		if (!newRecord && (is_ValueChanged("Name") || is_ValueChanged("Description")))
		{		
			String sql = " UPDATE A_Asset " 
			+ " SET Name=SUBSTR(bp.Name || ' - ' || p.Name,1,60), "
			+ " Description=p.Description " 
			+ " FROM M_Product p, C_BPartner bp " 
			+ " WHERE p.M_Product_ID=A_Asset.M_Product_ID " 
			+ " AND bp.C_BPartner_ID=A_Asset.C_BPartner_ID AND A_Asset.IsActive='Y' AND A_Asset.M_Product_ID=" + getM_Product_ID();						
			//	+ " AND GuaranteeDate > CURRENT_TIMESTAMP"

			int no = DB.executeUpdate(sql, get_TrxName());

			log.fine("Asset Description updated #" + no);
		}
		
		//	New - Acct, Tree, Old Costing
		if (newRecord)
		{
			insert_Accounting("M_Product_Acct", "M_Product_Category_Acct",
				"p.M_Product_Category_ID=" + getM_Product_Category_ID());
			insert_Tree(REF_AD_TreeTypeType.Product);
			//	New Costing
			// TODO : VERIFICAR OK - CARLOS			
			//
	/*		MAcctSchema[] mass = MAcctSchema.getClientAcctSchema(getCtx(), getAD_Client_ID(), get_TrxName());
			for (int i = 0; i < mass.length; i++)
			{
				//	Old
				MProductCosting pcOld = new MProductCosting(this, mass[i].getC_AcctSchema_ID());
				pcOld.save();
			}*/
		}
		
		//	New Costing
	// TODO : VERIFICAR OK - CARLOS
	//	if (newRecord || is_ValueChanged("M_Product_Category_ID"))
	//		MCost.create(this);

		return success;
	}	//	afterSave

	/**
	 * 	Before Delete
	 *	@return true if it can be deleted
	 */
	protected boolean beforeDelete ()
	{
		//	Check Storage
		if (isStocked() || REF_M_Product_ProductType.Item.equals(getProductType()))
		{
			MStorage[] storages = MStorage.getOfProduct(getCtx(), get_ID(), get_TrxName());
			BigDecimal OnHand = Env.ZERO;
			BigDecimal Ordered = Env.ZERO;
			BigDecimal Reserved = Env.ZERO;
			for (int i = 0; i < storages.length; i++)
			{
				OnHand = OnHand.add(storages[i].getQtyOnHand());
				Ordered = OnHand.add(storages[i].getQtyOrdered());
				Reserved = OnHand.add(storages[i].getQtyReserved());
			}
			String errMsg = "";
			if (OnHand.signum() != 0)
				errMsg = "@QtyOnHand@ = " + OnHand;
			if (Ordered.signum() != 0)
				errMsg += " - @QtyOrdered@ = " + Ordered;
			if (Reserved.signum() != 0)
				errMsg += " - @QtyReserved@" + Reserved;
			if (errMsg.length() > 0)
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), errMsg)); 
				return false;
			}
			
		}
		//	delete costing (old)
	/*	MProductCosting[] costings = MProductCosting.getOfProduct(getCtx(), get_ID(), get_TrxName());
		for (int i = 0; i < costings.length; i++)
			costings[i].delete(true, get_TrxName());*/
		//  delete costing (new)
	/*	MCost[] costs = MCost.getOfProduct(getCtx(), get_ID(), get_TrxName());
		for (int i = 0; i < costs.length; i++)
			costs[i].delete(true, get_TrxName());*/
		
		// PAtch : Arana , new method to delete all costs associated to a product.
		if (MCostCalc.deleteCostsForProduct(getAD_Client_ID(), 0, get_ID(), get_TrxName()) < 0) {
			log.saveError("Error", "Cant delete costs for product = "+get_ID()); 
			return false;
		}
		return delete_Accounting("M_Product_Acct");
	}	//	beforeDelete
	
	/**
	 * 	After Delete
	 *	@param success
	 *	@return deleted
	 */
	protected boolean afterDelete (boolean success)
	{
		if (success)
			delete_Tree(REF_AD_TreeTypeType.Product);
		return success;
	}	//	afterDelete
	
	/**
	 * Get attribute instance for this product by attribute name
	 * @param name
	 * @param trxName
	 * @return
	 */
	// TODO : Arana , nobody use this method
/*	public MAttributeInstance getAttributeInstance(String name, String trxName) {
		MAttributeInstance instance = null;
		
		MTable table = MTable.get(Env.getCtx(), MAttribute.Table_ID);
		MAttribute attribute = (MAttribute)table.getPO("Name = ?", new Object[]{name}, trxName);
		if ( attribute == null ) return null;
		table = MTable.get(Env.getCtx(), MAttributeInstance.Table_ID);
		instance = (MAttributeInstance)table.getPO(
				MAttributeInstance.COLUMNNAME_M_AttributeSetInstance_ID + "=?" 
				+ " and " + MAttributeInstance.COLUMNNAME_M_Attribute_ID + "=?" ,
				new Object[]{getM_AttributeSetInstance_ID(), attribute.getM_Attribute_ID()},
				trxName);
		return instance;
	}*/

	public String getGroup() {
		if (getM_Product_Group_ID() == 0)
			return "";
		X_M_Product_Group group = new X_M_Product_Group (getCtx(), getM_Product_Group_ID(), null);
		return group.getName();		
	}
	/**
	 * Gets Material Management Policy.
	 * Tries: Product Category, Client (in this order) 
	 * @return Material Management Policy
	 */
	public String getMMPolicy() {
		MProductCategory pc = MProductCategory.get(getCtx(), getM_Product_Category_ID());
		String MMPolicy = pc.getMMPolicy();
		if (MMPolicy == null || MMPolicy.length() == 0)
			MMPolicy = MClient.get(getCtx()).getMMPolicy();
		return MMPolicy;
	}
		
	/**
	 * Check if ASI is mandatory
	 * @param isSOTrx is outgoing trx?
	 * @return true if ASI is mandatory, false otherwise
	 */
	// TODO : Arana , nobody use this method
/*	public boolean isASIMandatory(boolean isSOTrx) {
		//
		//	If CostingLevel is BatchLot ASI is always mandatory - check all client acct schemas
		MAcctSchema[] mass = MAcctSchema.getClientAcctSchema(getCtx(), getAD_Client_ID(), get_TrxName());
		for (MAcctSchema as : mass)
		{
			String cl = getCostingLevel(as);
			if (MAcctSchema.COSTINGLEVEL_BatchLot.equals(cl)) {
				return true;
			}
		}
		//
		// Check Attribute Set settings
		int M_AttributeSet_ID = getM_AttributeSet_ID();
		if (M_AttributeSet_ID != 0)
		{
			MAttributeSet mas = MAttributeSet.get(getCtx(), M_AttributeSet_ID);
			if (mas == null || !mas.isInstanceAttribute())
				return false;
			// Outgoing transaction
			else if (isSOTrx)
				return mas.isMandatory();
			// Incoming transaction
			else // isSOTrx == false
				return mas.isMandatoryAlways();
		}
		//
		// Default not mandatory
		return false;
	}*/
	
	/**
	 * Get Product Costing Level
	 * @param as accounting schema
	 * @return product costing level
	 */
	// TODO : Solo usada por MCostDetail , luego sera eliminada
	public String getCostingLevel(MAcctSchema as)
	{
		MProductCategoryAcct pca = MProductCategoryAcct.get(getCtx(), getM_Product_Category_ID(), as.get_ID(), get_TrxName());
		String costingLevel = pca.getCostingLevel();
		if (costingLevel == null)
		{
			costingLevel = as.getCostingLevel();
		}
		return costingLevel;
	}

	public String getBrand() {
		String brand = "";
		if (this.getM_Product_Brand_ID() != 0)
		{
			X_M_Product_Brand pb = new X_M_Product_Brand(Env.getCtx(), getM_Product_Brand_ID(), get_TrxName());
			if (pb.getM_Product_Brand_ID() != 0)
				brand = pb.getName();
		}
		return brand;
	}

	public String getBrandValue() {
		String brand = "";
		if (this.getM_Product_Brand_ID() != 0)
		{
			X_M_Product_Brand pb = new X_M_Product_Brand(Env.getCtx(), getM_Product_Brand_ID(), get_TrxName());
			if (pb.getM_Product_Brand_ID() != 0)
				brand = pb.getValue();
		}
		return brand;
	}

	public MCampaignBonus[] getCampaignBonus() {
		return MCampaignBonus.getbyProduct(this, get_TrxName());		
	}

	public MCampaignDiscount[] getCampaignDiscount() {
		return MCampaignDiscount.getbyProduct(this, get_TrxName());	}
	
	/**
	 * Get Product Costing Method
	 * @param C_AcctSchema_ID accounting schema ID
	 * @return product costing method
	 */
	// TODO : Nobody use this method
/*	public String getCostingMethod(MAcctSchema as)
	{
		MProductCategoryAcct pca = MProductCategoryAcct.get(getCtx(), getM_Product_Category_ID(), as.get_ID(), get_TrxName());
		String costingMethod = pca.getCostingMethod();
		if (costingMethod == null)
		{
			costingMethod = as.getCostingMethod();
		}
		return costingMethod;
	}	*/

}	//	MProduct
