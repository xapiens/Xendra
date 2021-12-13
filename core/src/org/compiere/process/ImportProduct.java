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

import org.compiere.model.MProduct;
import org.compiere.model.MProductPrice;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_TaxCategory;
import org.compiere.model.persistence.X_I_Product;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_Product_Brand;
import org.compiere.model.persistence.X_M_Product_Category;
import org.compiere.model.persistence.X_M_Product_Generic;
import org.compiere.model.persistence.X_M_Product_Group;
import org.compiere.model.persistence.X_M_Product_PO;
import org.compiere.model.persistence.X_M_Product_Type;
import org.compiere.model.persistence.X_C_UOM;
import org.compiere.util.*;

import org.xendra.Constants;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
import org.xendra.util.UpdatePO;

/**
 *	Import Products from I_Product
 *
 * 	@author 	Jorg Janke
 * 	@version 	$Id: ImportProduct.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="Import_Product",
name="Import Products ",
description="Imports products from a file into the application",
help="Import Products will bring a file of products, in a predefined format into the application.<p>The Parameters are default values for null import record values, they do not overwrite any data.<p>If you select an existing price list and you have List, Standard, and Limit Price defined, they are directly created/updated.",
Identifier="3dc27912-c644-9cd0-a08e-3242544d8802",
classname="org.compiere.process.ImportProduct",
updated="2015-06-20 10:10:12")
public class ImportProduct extends SvrProcess
{
	/**	Client to be imported to		*/
	@XendraProcessParameter(Name="Client",
			ColumnName="AD_Client_ID",
			Description="Client/Tenant for this installation.",
			Help="A Client is a company or a legal entity. You cannot share data between Clients. Tenant is a synonym for Client.",
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
			Identifier="54820467-b45b-90fe-a069-4dcde05dd113")	
	private int				m_AD_Client_ID = 0;
	/**	Delete old Imported				*/
	@XendraProcessParameter(Name="Delete old imported records",
			ColumnName="DeleteOldImported",
			Description="Before processing delete old imported records in the import table",
			Help="",
			AD_Reference_ID=DisplayType.YesNo,
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
			Identifier="97226a41-9763-92ed-8b29-6d1cf7646a34")
	private boolean			m_deleteOldImported = false;

	/** Effective						*/
	private Timestamp		m_DateValue = null;
	/** Pricelist to Update				*/
	@XendraProcessParameter(Name="Price List Version",
			ColumnName="M_PriceList_Version_ID",
			Description="Identifies a unique instance of a Price List",
			Help="Each Price List can have multiple versions.  The most common use is to indicate the dates that a Price List is valid for.",
			AD_Reference_ID=DisplayType.TableDir,
			SeqNo=40,
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
			Identifier="392fe0b6-d2ff-656b-5a73-386247c073a0")	
	private int 			p_M_PriceList_Version_ID = 0;

	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (name.equals("AD_Client_ID"))
				m_AD_Client_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("DeleteOldImported"))
				m_deleteOldImported = "Y".equals(para[i].getParameter());
			else if (name.equals("M_PriceList_Version_ID"))
				p_M_PriceList_Version_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		if (m_DateValue == null)
			m_DateValue = new Timestamp (System.currentTimeMillis());
	}	//	prepare


	/**
	 *  Perrform process.
	 *  @return Message
	 *  @throws Exception
	 */
	protected String doIt() throws java.lang.Exception
	{
		StringBuffer sql = null;
		int no = 0;
		//String clientCheck = " AND AD_Client_ID=" + m_AD_Client_ID;

		//	****	Prepare	****
		UpdatePO o = new UpdatePO();
		//	Delete Old Imported
		if (m_deleteOldImported)
		{			
			o.setTablename(X_I_Product.Table_Name);
			o.setClient(m_AD_Client_ID);			
			no = o.delete("I_IsImported='Y'", get_TrxName());
			log.info("Delete Old Impored =" + no);
		}
		//
		List<X_I_Product> products = new Query(Env.getCtx(), X_I_Product.Table_Name, "I_IsImported='N'", get_TrxName()).list();
		for (X_I_Product product:products)
		{
			if (product.getX12DE355() != null && product.getX12DE355().length() >0)
			{
				X_C_UOM pb = new Query(Env.getCtx(), X_C_UOM.Table_Name, "uomsymbol = ? ",get_TrxName())
				.setParameters(product.getX12DE355()).first();
				if (pb == null)
				{
					pb = new X_C_UOM(Env.getCtx(), 0, get_TrxName());
					pb.setX12DE355(product.getX12DE355());
					pb.setUOMSymbol(product.getX12DE355());
					pb.setName(product.getX12DE355());
					pb.setStdPrecision(2);
					pb.setCostingPrecision(4);
					pb.save();
				}
			}

			if (product.getProductBrand_Value() != null && product.getProductBrand_Value().length() > 0)
			{
				X_M_Product_Brand pb = new Query(Env.getCtx(), X_M_Product_Brand.Table_Name, "name = ? ",get_TrxName())
				.setParameters(product.getProductBrand_Value()).first();
				if (pb == null)
				{
					pb = new X_M_Product_Brand(Env.getCtx(), 0, get_TrxName());
					pb.setValue(product.getProductBrand_Value());
					pb.setName(product.getProductBrand_Value());
					pb.save();
				}
			}
			if (product.getProductCategory_Value() != null && product.getProductCategory_Value().length() > 0)
			{
				X_M_Product_Category pb = new Query(Env.getCtx(), X_M_Product_Category.Table_Name, "value = ? ",get_TrxName())
				.setParameters(product.getProductCategory_Value()).first();
				if (pb == null)
				{
					pb = new X_M_Product_Category(Env.getCtx(), 0, get_TrxName());
					pb.setValue(product.getProductCategory_Value());
					pb.setName(product.getProductCategory_Value());
					pb.setPlannedMargin(BigDecimal.ZERO);
					pb.save();
				}				
			}
			if (product.getProductGeneric_Value() != null && product.getProductGeneric_Value().length() > 0)
			{
				X_M_Product_Generic pb = new Query(Env.getCtx(), X_M_Product_Generic.Table_Name, "value = ? ",get_TrxName())
				.setParameters(product.getProductGeneric_Value()).first();
				if (pb == null)
				{
					pb = new X_M_Product_Generic(Env.getCtx(), 0, get_TrxName());
					pb.setValue(product.getProductGeneric_Value());
					pb.setName(product.getProductGeneric_Value());
					pb.save();
				}								
			}			
			if (product.getProductGroup_Value() != null && product.getProductGroup_Value().length() > 0)
			{
				X_M_Product_Group pb = new Query(Env.getCtx(), X_M_Product_Group.Table_Name, "value = ? ",get_TrxName())
				.setParameters(product.getProductGroup_Value()).first();
				if (pb == null)
				{
					pb = new X_M_Product_Group(Env.getCtx(), 0, get_TrxName());
					pb.setValue(product.getProductGroup_Value());
					pb.setName(product.getProductGroup_Value());
					pb.save();
				}												
			}
		}
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setField(X_I_Product.COLUMNNAME_I_ErrorMsg, "");
		o.setField(X_I_Product.COLUMNNAME_I_IsImported, Constants.NO);
		o.setClient(m_AD_Client_ID);
		no = o.update("I_IsImported<>'Y' OR I_IsImported IS NULL", get_TrxName());		
		log.info("Reset=" + no);

		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");
		String fieldexpr = "(SELECT C_BPartner_ID FROM C_BPartner p WHERE i.BPartner_Value=p.Value AND i.AD_Client_ID=p.AD_Client_ID)"; 
		o.setFieldExpr(X_I_Product.COLUMNNAME_C_BPartner_ID, fieldexpr);		
		no = o.update("C_BPartner_ID IS NULL", get_TrxName());
		log.info("BPartner=" + no);
		//	****	Find Product
		//	EAN/UPC
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT M_Product_ID FROM M_Product p WHERE i.UPC=p.UPC AND i.AD_Client_ID=p.AD_Client_ID)";
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_ID, fieldexpr);		
		no = o.update("M_Product_ID IS NULL AND I_IsImported='N'", get_TrxName());
		log.info("Product Existing UPC=" + no);

		//	Value
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT M_Product_ID FROM M_Product p WHERE i.Value=p.Value AND i.AD_Client_ID=p.AD_Client_ID)";
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_ID, fieldexpr);		
		no = o.update("M_Product_ID IS NULL AND I_IsImported='N'", get_TrxName());
		log.info("Product Existing Value=" + no);

		//	BP ProdNo
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT M_Product_ID FROM M_Product_po p WHERE i.C_BPartner_ID=p.C_BPartner_ID AND i.VendorProductNo=p.VendorProductNo AND i.AD_Client_ID=p.AD_Client_ID)";
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_ID, fieldexpr);		
		no = o.update("M_Product_ID IS NULL AND I_IsImported='N'", get_TrxName());
		//no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.info("Product Existing Vendor ProductNo=" + no);

		//	Set Product Category
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		fieldexpr = String.format("(SELECT MAX(Value) FROM M_Product_Category WHERE IsDefault='Y' AND AD_Client_ID=%s)",m_AD_Client_ID);
		o.setFieldExpr(X_I_Product.COLUMNNAME_ProductCategory_Value, fieldexpr);		
		no = o.update("ProductCategory_Value IS NULL AND M_Product_Category_ID IS NULL AND M_Product_ID IS NULL AND I_IsImported<>'Y'" , get_TrxName());		
		log.fine("Set Category Default Value=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT M_Product_Category_ID FROM M_Product_Category c WHERE i.ProductCategory_Value=c.Value AND i.AD_Client_ID=c.AD_Client_ID)";
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_Category_ID, fieldexpr);		
		no = o.update("ProductCategory_Value IS NOT NULL AND M_Product_Category_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());  		
		log.info("Set Category=" + no);

		//	Set Product Type
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		fieldexpr = String.format("(SELECT MAX(Value) FROM M_Product_Type WHERE AD_Client_ID=%s)",m_AD_Client_ID);
		o.setFieldExpr(X_I_Product.COLUMNNAME_Producttype_Value, fieldexpr);		
		no = o.update("M_Product_Type_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Type Default Value=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");		
		fieldexpr = "(SELECT M_Product_Type_ID FROM M_Product_Type c WHERE i.ProductType_Value=c.Value AND i.AD_Client_ID=c.AD_Client_ID)";
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_Type_ID, fieldexpr);
		no = o.update("ProductType_Value IS NOT NULL AND M_Product_Type_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());		
		log.info("Set Type=" + no);			

		//	Set Product Group
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");		
		fieldexpr = "(SELECT M_Product_Group_ID FROM M_Product_Group c WHERE i.ProductGroup_Value=c.Value AND i.AD_Client_ID=c.AD_Client_ID)";
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_Group_ID, fieldexpr);
		no = o.update("ProductGroup_Value IS NULL AND M_Product_Group_ID IS NULL AND M_Product_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Group Default Value=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");		
		fieldexpr = "(SELECT M_Product_Group_ID FROM M_Product_Group c WHERE i.ProductGroup_Value=c.Value AND i.AD_Client_ID=c.AD_Client_ID)";
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_Group_ID, fieldexpr);
		no = o.update("ProductGroup_Value IS NOT NULL AND M_Product_Group_ID IS NULL AND I_IsImported<>'Y'",get_TrxName());
		log.info("Set Group=" + no);		

		//	Set Product Generic
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		fieldexpr = String.format("(SELECT MAX(Value) FROM M_Product_Group WHERE AD_Client_ID= %s)",m_AD_Client_ID); 
		o.setFieldExpr(X_I_Product.COLUMNNAME_ProductGeneric_Value, fieldexpr);
		no = o.update("ProductGeneric_Value IS NULL AND M_Product_Generic_ID IS NULL AND M_Product_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Generic Default Value=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");		
		fieldexpr = "(SELECT M_Product_Generic_ID FROM M_Product_Generic c WHERE i.ProductGeneric_Value=c.Value AND i.AD_Client_ID=c.AD_Client_ID)";
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_Generic_ID, fieldexpr);
		no = o.update("ProductGeneric_Value IS NOT NULL AND M_Product_Generic_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.info("Set Generic=" + no);

		//	Set Product Brand
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		fieldexpr = String.format("(SELECT MAX(Value) FROM M_Product_Brand WHERE AD_Client_ID=%s)",m_AD_Client_ID);
		o.setFieldExpr(X_I_Product.COLUMNNAME_ProductBrand_Value, fieldexpr);
		no = o.update("ProductBrand_Value IS NULL AND M_Product_Brand_ID IS NULL AND M_Product_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Brand Default Value=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT M_Product_Brand_ID FROM M_Product_Brand c WHERE i.ProductBrand_Value=c.Value AND i.AD_Client_ID=c.AD_Client_ID)";
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_Brand_ID, fieldexpr);
		no = o.update("ProductBrand_Value IS NOT NULL AND M_Product_Brand_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());		
		log.info("Set Brand=" + no);

		//
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");		
		o.setTablename(X_I_Product.Table_Name);
		o.setFieldExpr(X_I_Product.COLUMNNAME_Value, "p.Value");
		o.setFieldExpr(X_I_Product.COLUMNNAME_Name, "p.name");
		o.setFieldExpr(X_I_Product.COLUMNNAME_Description, "p.Description");
		o.setFieldExpr(X_I_Product.COLUMNNAME_DocumentNote, "p.DocumentNote");
		o.setFieldExpr(X_I_Product.COLUMNNAME_Help,"p.Help");
		o.setFieldExpr(X_I_Product.COLUMNNAME_UPC,"p.UPC");
		o.setFieldExpr(X_I_Product.COLUMNNAME_SKU,"p.SKU");
		o.setFieldExpr(X_I_Product.COLUMNNAME_Classification,"p.Classification");
		o.setFieldExpr(X_I_Product.COLUMNNAME_ProductType,"p.ProductType");
		o.setFieldExpr(X_I_Product.COLUMNNAME_Discontinued,"p.Discontinued");
		o.setFieldExpr(X_I_Product.COLUMNNAME_DiscontinuedBy, "p.DiscontinuedBy");
		o.setFieldExpr(X_I_Product.COLUMNNAME_ImageURL,"p.ImageURL");
		o.setFieldExpr(X_I_Product.COLUMNNAME_DescriptionURL, "p.DescriptionURL");
		o.setFieldExpr(X_I_Product.COLUMNNAME_C_UOM_ID, "p.C_UOM_ID");
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_Category_ID, "p.M_Product_Category_ID");
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_Type_ID, "p.M_Product_Type_ID");
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_Group_ID, "p.M_Product_Group_ID");
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_Generic_ID, "p.M_Product_Generic_ID");
		o.setFieldExpr(X_I_Product.COLUMNNAME_M_Product_Brand_ID, "p.M_Product_Brand_ID");
		o.setFieldExpr(X_I_Product.COLUMNNAME_Volume, "p.Volume");
		o.setFieldExpr(X_I_Product.COLUMNNAME_Weight, "p.Weight");
		o.setFieldExpr(X_I_Product.COLUMNNAME_ShelfWidth, "p.ShelfWidth");
		o.setFieldExpr(X_I_Product.COLUMNNAME_ShelfDepth, "p.ShelfDepth");
		o.setFieldExpr(X_I_Product.COLUMNNAME_UnitsPerPallet, "p.UnitsPerPallet");		
		no = o.update(String.format(" FROM M_Product p WHERE i.M_Product_ID = p.M_Product_ID  AND p.AD_Client_ID=%s", m_AD_Client_ID), get_TrxName());
		log.info("Set Product Exist=" + no);

		//	Invalid Category
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Invalid ProdCategory,'");
		o.update("M_Product_Category_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		if (no != 0)
			log.warning("Invalid Category=" + no);


		//	Set UOM (System/own)
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);		
		o.setAlias("i");
		fieldexpr = "(SELECT MAX(X12DE355) FROM C_UOM u WHERE u.IsDefault='Y' AND u.AD_Client_ID IN (0,i.AD_Client_ID))"; 
		o.setFieldExpr(X_I_Product.COLUMNNAME_X12DE355, fieldexpr);
		no = o.update("X12DE355 IS NULL AND C_UOM_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set UOM Default=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");
		fieldexpr = "(SELECT MAX(C_UOM_ID) FROM C_UOM u WHERE u.X12DE355=i.X12DE355 AND u.AD_Client_ID IN (0,i.AD_Client_ID))";
		o.setFieldExpr(X_I_Product.COLUMNNAME_C_UOM_ID, fieldexpr);
		no = o.update("C_UOM_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());		
		log.info("Set UOM=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");
		fieldexpr = "(SELECT MAX(C_UOM_ID) FROM C_UOM u WHERE u.uomsymbol=i.uomsymbol AND u.AD_Client_ID IN (0,i.AD_Client_ID))";
		o.setFieldExpr(X_I_Product.COLUMNNAME_C_UOM_ID, fieldexpr);
		no = o.update("C_UOM_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());		
		log.info("Set UOM=" + no);

		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_I_IsImported,"E");
		o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Invalid UOM, '");		
		no = o.update("C_UOM_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());		
		if (no != 0)
			log.warning("Invalid UOM=" + no);


		//	Set Currency
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");		
		fieldexpr = "(SELECT ISO_Code FROM C_Currency c INNER JOIN C_AcctSchema a ON (a.C_Currency_ID=c.C_Currency_ID) ";
		fieldexpr += " INNER JOIN AD_ClientInfo ci ON (a.C_AcctSchema_ID=ci.C_AcctSchema1_ID) ";
		fieldexpr += " WHERE ci.AD_Client_ID=i.AD_Client_ID) ";
		o.setFieldExpr(X_I_Product.COLUMNNAME_ISO_Code, fieldexpr);
		no = o.update("C_Currency_ID IS NULL AND ISO_Code IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Currency Default=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");		
		fieldexpr = "(SELECT C_Currency_ID FROM C_Currency c WHERE i.ISO_Code=c.ISO_Code AND c.AD_Client_ID IN (0,i.AD_Client_ID)) ";
		o.setFieldExpr(X_I_Product.COLUMNNAME_C_Currency_ID, fieldexpr);
		no = o.update("C_Currency_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.info("doIt- Set Currency=" + no);
		//		
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Currency,'");
		no = o.update("C_Currency_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		if (no != 0)
			log.warning("Currency Invalid" + no);
		//	Verify ProductType
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Invalid ProductType,'");
		no = o.update("ProductType NOT IN ('I','S') AND I_IsImported<>'Y'", get_TrxName());
		if (no != 0)
			log.warning("Invalid ProductType=" + no);

		//	Unique UPC/Value
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Value not unique,'");
		no = o.update("I_IsImported<>'Y' AND Value IN (SELECT Value FROM I_Product ii WHERE i.AD_Client_ID=ii.AD_Client_ID GROUP BY Value HAVING COUNT(*) > 1)", get_TrxName());		
		if (no != 0)
			log.warning("Not Unique Value=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=UPC not unique,'");
		no = o.update("I_IsImported<>'Y' AND UPC IN (SELECT UPC FROM I_Product ii WHERE i.AD_Client_ID=ii.AD_Client_ID GROUP BY UPC HAVING COUNT(*) > 1)", get_TrxName());
		if (no != 0)
			log.warning("Not Unique UPC=" + no);

		//	Mandatory Value
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=No Mandatory Value,'");
		no = o.update("Value IS NULL AND I_IsImported<>'Y'", get_TrxName());
		if (no != 0)
			log.warning("No Mandatory Value=" + no);

		//	Vendor Product No
		o = new UpdatePO();		
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setFieldExpr(X_I_Product.COLUMNNAME_VendorProductNo,"Value");
		no = o.update("C_BPartner_ID IS NOT NULL AND VendorProductNo IS NULL AND I_IsImported='N'", get_TrxName());
		log.info("VendorProductNo Set to Value=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=VendorProductNo not unique,'");
		no = o.update("I_IsImported<>'Y' AND C_BPartner_ID IS NOT NULL AND (C_BPartner_ID, VendorProductNo) IN (SELECT C_BPartner_ID, VendorProductNo FROM I_Product ii WHERE i.AD_Client_ID=ii.AD_Client_ID GROUP BY C_BPartner_ID, VendorProductNo HAVING COUNT(*) > 1)", get_TrxName());
		if (no != 0)
			log.warning("Not Unique VendorProductNo=" + no);
		
		X_C_TaxCategory taxcategory = new Query(Env.getCtx(), X_C_TaxCategory.Table_Name, "IsDefault = 'Y' AND AD_Client_ID = ?", get_TrxName())
			.setParameters(m_AD_Client_ID)
			.first();

		o = new UpdatePO();		
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_C_TaxCategory_ID, taxcategory.getC_TaxCategory_ID());
		no = o.update("C_TaxCategory_ID IS NULL AND I_IsImported='N'", get_TrxName());

		//		//	Get Default Tax Category
		//		int C_TaxCategory_ID = 0;
		//		try
		//		{
		//			PreparedStatement pstmt = DB.prepareStatement
		//				("SELECT C_TaxCategory_ID FROM C_TaxCategory WHERE IsDefault='Y'" + clientCheck, get_TrxName());
		//			ResultSet rs = pstmt.executeQuery();
		//			if (rs.next())
		//				C_TaxCategory_ID = rs.getInt(1);
		//			rs.close();
		//			pstmt.close();
		//		}
		//		catch (SQLException e)
		//		{
		//			throw new Exception ("TaxCategory", e);
		//		}
		//		log.fine("C_TaxCategory_ID=" + C_TaxCategory_ID);

		commit();

		//	-------------------------------------------------------------------
		int noInsert = 0;
		int noUpdate = 0;
		int noInsertPO = 0;
		int noUpdatePO = 0;

		//	Go through Records
		log.fine("start inserting/updating ...");
		List<X_I_Product> importproducts = new Query(Env.getCtx(), X_I_Product.Table_Name, "I_IsImported='N' AND AD_Client_ID = ?", get_TrxName())
		.setParameters(m_AD_Client_ID).list();
		for (X_I_Product iproduct:importproducts) {
			//int I_Product_ID = iproduct.getI_Product_ID();				
			int M_Product_ID = iproduct.getM_Product_ID();
			int C_BPartner_ID = iproduct.getC_BPartner_ID();
			boolean newProduct = M_Product_ID == 0;
			//	Product
			if (newProduct)			//	Insert new Product
			{
				iproduct.setC_TaxCategory_ID(taxcategory.getC_TaxCategory_ID());
				MProduct product = new MProduct(iproduct);
				//product.setC_TaxCategory_ID();
				if (product.save())
				{
					M_Product_ID = product.getM_Product_ID();
					iproduct.setM_Product_ID(M_Product_ID);
					log.finer("Insert Product");
					noInsert++;
				}
				else
				{
					o = new UpdatePO();
					o.setTablename(X_I_Product.Table_Name);
					o.setField(X_I_Product.COLUMNNAME_I_IsImported, "E");
					o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Insert Product failed'");
					o.update(String.format("I_Product_ID = %s", iproduct.getI_Product_ID()), get_TrxName());					
					continue;
				}
			} else {
				o = new UpdatePO();
				o.setTablename(X_M_Product.Table_Name);
				o.setAlias("p");
				o.setClient(m_AD_Client_ID);
				o.setFieldExpr(X_M_Product.COLUMNNAME_Value, "i.Value");
				o.setFieldExpr(X_M_Product.COLUMNNAME_Name,"i.Name"); 
				o.setFieldExpr(X_M_Product.COLUMNNAME_Description, "i.Description");
				o.setFieldExpr(X_M_Product.COLUMNNAME_DocumentNote, "i.DocumentNote");
				o.setFieldExpr(X_M_Product.COLUMNNAME_Help, "i.Help");
				o.setFieldExpr(X_M_Product.COLUMNNAME_UPC, "i.UPC");
				o.setFieldExpr(X_M_Product.COLUMNNAME_SKU, "i.SKU");
				o.setFieldExpr(X_M_Product.COLUMNNAME_C_TaxCategory_ID, "i.C_TaxCategory_ID");
				o.setFieldExpr(X_M_Product.COLUMNNAME_IsBOM,"i.IsBOM");
				o.setFieldExpr(X_M_Product.COLUMNNAME_Classification, "i.Classification");
				o.setFieldExpr(X_M_Product.COLUMNNAME_ProductType, "i.ProductType");
				o.setFieldExpr(X_M_Product.COLUMNNAME_Discontinued, "i.Discontinued");
				o.setFieldExpr(X_M_Product.COLUMNNAME_DiscontinuedBy, "i.DiscontinuedBy");
				o.setFieldExpr(X_M_Product.COLUMNNAME_ImageURL, "i.ImageURL");
				o.setFieldExpr(X_M_Product.COLUMNNAME_DescriptionURL, "i.DescriptionURL");
				o.setFieldExpr(X_M_Product.COLUMNNAME_C_UOM_ID, "i.C_UOM_ID");
				o.setFieldExpr(X_M_Product.COLUMNNAME_C_UOM_Order_ID, "i.C_UOM_Order_ID");
				o.setFieldExpr(X_M_Product.COLUMNNAME_M_Product_Category_ID, "i.M_Product_Category_ID");
				o.setFieldExpr(X_M_Product.COLUMNNAME_M_Product_Type_ID, "i.M_Product_Type_ID");
				o.setFieldExpr(X_M_Product.COLUMNNAME_M_Product_Group_ID, "i.M_Product_Group_ID");
				o.setFieldExpr(X_M_Product.COLUMNNAME_M_Product_Generic_ID, "i.M_Product_Generic_ID");
				o.setFieldExpr(X_M_Product.COLUMNNAME_M_Product_Brand_ID, "i.M_Product_Brand_ID");
				o.setFieldExpr(X_M_Product.COLUMNNAME_Volume, "i.Volume");
				o.setFieldExpr(X_M_Product.COLUMNNAME_Weight, "i.Weight");
				o.setFieldExpr(X_M_Product.COLUMNNAME_ShelfWidth, "i.ShelfWidth");
				o.setFieldExpr(X_M_Product.COLUMNNAME_ShelfHeight, "i.ShelfHeight");
				o.setFieldExpr(X_M_Product.COLUMNNAME_ShelfDepth, "i.ShelfDepth");
				o.setFieldExpr(X_M_Product.COLUMNNAME_UnitsPerPallet, "i.UnitsPerPallet");
				o.update(String.format("p.M_Product_ID = i.M_Product_ID  AND i.M_Product_ID = %s", iproduct.getM_Product_ID()), get_TrxName());
			}
			if (C_BPartner_ID != 0)
			{
				no = 0;
				//	If Product existed, Try to Update first
				o = new UpdatePO();
				o.setTablename(X_M_Product_PO.Table_Name);
				o.setClient(m_AD_Client_ID);
				o.setField(X_M_Product_PO.COLUMNNAME_M_Product_ID, iproduct.getM_Product_ID());
				o.setField(X_M_Product_PO.COLUMNNAME_C_BPartner_ID, iproduct.getC_BPartner_ID());
				o.setField(X_M_Product_PO.COLUMNNAME_IsCurrentVendor, Constants.YES);
				o.setField(X_M_Product_PO.COLUMNNAME_C_UOM_ID, iproduct.getC_UOM_ID());
				o.setField(X_M_Product_PO.COLUMNNAME_C_Currency_ID, iproduct.getC_Currency_ID());
				o.setField(X_M_Product_PO.COLUMNNAME_UPC, iproduct.getUPC());
				o.setField(X_M_Product_PO.COLUMNNAME_PriceList, iproduct.getPriceList());
				o.setField(X_M_Product_PO.COLUMNNAME_PricePO, iproduct.getPricePO());
				o.setField(X_M_Product_PO.COLUMNNAME_RoyaltyAmt, iproduct.getRoyaltyAmt());
				o.setField(X_M_Product_PO.COLUMNNAME_PriceEffective, iproduct.getPriceEffective());
				o.setField(X_M_Product_PO.COLUMNNAME_VendorProductNo, iproduct.getVendorProductNo());
				o.setField(X_M_Product_PO.COLUMNNAME_VendorCategory, iproduct.getVendorCategory());
				o.setField(X_M_Product_PO.COLUMNNAME_Manufacturer, iproduct.getManufacturer());
				o.setField(X_M_Product_PO.COLUMNNAME_Discontinued, iproduct.isDiscontinued() ? "Y":"N");
				o.setField(X_M_Product_PO.COLUMNNAME_DiscontinuedBy, iproduct.getDiscontinuedBy());
				o.setField(X_M_Product_PO.COLUMNNAME_Order_Min , iproduct.getOrder_Min());
				o.setField(X_M_Product_PO.COLUMNNAME_Order_Pack, iproduct.getOrder_Pack());
				o.setField(X_M_Product_PO.COLUMNNAME_CostPerOrder, iproduct.getCostPerOrder());
				o.setField(X_M_Product_PO.COLUMNNAME_DeliveryTime_Promised, iproduct.getDeliveryTime_Promised());
				no = 0;
				if (!newProduct) {
					no = o.update(String.format("WHERE M_Product_ID=%s AND C_BPartner_ID=%s",iproduct.getM_Product_ID(), C_BPartner_ID), get_TrxName());
				}		
				if (no == 0) {
					no = o.insert(get_TrxName());
				}
			}			
			if (p_M_PriceList_Version_ID != 0)
			{
				BigDecimal PriceList = iproduct.getPriceList();
				BigDecimal PriceStd = iproduct.getPriceStd();
				BigDecimal PriceLimit = iproduct.getPriceLimit();
				if (PriceStd.signum() != 0 || PriceLimit.signum() != 0 || PriceList.signum() != 0)
				{
					MProductPrice pp = MProductPrice.get(getCtx(), p_M_PriceList_Version_ID, M_Product_ID, get_TrxName());
					if (pp == null)
						pp = new MProductPrice (getCtx(), 
								p_M_PriceList_Version_ID, M_Product_ID, get_TrxName());
					pp.setPrices(PriceList, PriceStd, PriceLimit);
					pp.save();
				}
			}
			o = new UpdatePO();
			o.setTablename(X_I_Product.Table_Name);
			o.setField(X_I_Product.COLUMNNAME_I_IsImported, Constants.YES);
			o.setField(X_I_Product.COLUMNNAME_M_Product_ID, M_Product_ID);
			no = o.update(String.format("I_Product_ID = %s", iproduct.getI_Product_ID()), get_TrxName());						
		}
		commit();
		//	Set Error to indicator to not imported
		o = new UpdatePO();
		o.setTablename(X_I_Product.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_I_IsImported, Constants.NO);
		o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");		
		o.update("I_IsImported<>'Y'", get_TrxName());
		addLog (0, null, new BigDecimal (no), "@Errors@");
		addLog (0, null, new BigDecimal (noInsert), "@M_Product_ID@: @Inserted@");
		addLog (0, null, new BigDecimal (noUpdate), "@M_Product_ID@: @Updated@");
		addLog (0, null, new BigDecimal (noInsertPO), "@M_Product_ID@ @Purchase@: @Inserted@");
		addLog (0, null, new BigDecimal (noUpdatePO), "@M_Product_ID@ @Purchase@: @Updated@");
		return "";
	}	//	doIt

}	//	ImportProduct