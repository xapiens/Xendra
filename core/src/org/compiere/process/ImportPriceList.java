/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
 * Contributor: Carlos Ruiz - globalqss                                       *
 *****************************************************************************/
package org.compiere.process;

import java.math.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.*;

import org.compiere.model.MPriceList;
import org.compiere.model.MPriceListVersion;
import org.compiere.model.MProductPrice;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_I_BPartner;
import org.compiere.model.persistence.X_I_PriceList;
import org.compiere.model.persistence.X_I_Product;
import org.compiere.model.persistence.X_M_DiscountSchema;
import org.compiere.model.persistence.X_M_PriceList;
import org.compiere.model.persistence.X_M_PriceList_Version;
import org.compiere.util.*;


import org.xendra.Constants;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
import org.xendra.util.UpdatePO;


/**
 *	Import PriceList from I_PriceList
 *
 * 	@author 	xapiens
 */
@XendraProcess(value="Import_PriceList",
name="Import_PriceList",
description="Import_PriceList",
help="",
Identifier="3faef0cc-3100-8a46-6a5e-33d7c54c5f04",
classname="org.compiere.process.ImportPriceList",
updated="2015-06-20 10:10:12")	
public class ImportPriceList extends SvrProcess
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
			FieldLength=10,
			IsMandatory=false,
			IsRange=false,
			DefaultValue="",
			DefaultValue2="",
			vFormat="",
			valueMin="",
			valueMax="",
			DisplayLogic="",
			ReadOnlyLogic="",
			Identifier="abd57faa-5d3d-f392-4eb5-ceaeb9b58d9d")	
	private int				m_AD_Client_ID = 0;	
	/** Organization to be imported to  */
	@XendraProcessParameter(Name="Organization",
			ColumnName="AD_Org_ID",
			Description="Organizational entity within client",
			Help="An organization is a unit of your client or legal entity - examples are store, department. You can share data between organizations.",
			AD_Reference_ID=DisplayType.TableDir,
			SeqNo=20,
			ReferenceValueID="",
			ValRuleID="",
			FieldLength=10,
			IsMandatory=false,
			IsRange=false,
			DefaultValue="",
			DefaultValue2="",
			vFormat="",
			valueMin="",
			valueMax="",
			DisplayLogic="",
			ReadOnlyLogic="",
			Identifier="c0e3db82-4dfb-4062-c372-7e31d5775dad")
	private int 			m_AD_Org_ID = 0;
	//private int 			p_M_PriceList_Version_ID = 0;
	/**	Delete old Imported				*/
	@XendraProcessParameter(Name="Delete old imported records",
			ColumnName="DeleteOldImported",
			Description="Before processing delete old imported records in the import table",
			Help="",
			AD_Reference_ID=DisplayType.YesNo,
			SeqNo=30,
			ReferenceValueID="",
			ValRuleID="",
			FieldLength=10,
			IsMandatory=false,
			IsRange=false,
			DefaultValue="",
			DefaultValue2="",
			vFormat="",
			valueMin="",
			valueMax="",
			DisplayLogic="",
			ReadOnlyLogic="",
			Identifier="8f174c9b-cbd3-324b-2bc0-c7f7d7d3151e")	
	private boolean			m_deleteOldImported = false;

	/** Effective						*/
	private Timestamp		m_DateValue = null;

	private String m_lang;

	ArrayList<String> list = new ArrayList<String>();
	ArrayList<KeyNamePair> pricelist 		= new ArrayList<KeyNamePair>();
	ArrayList<KeyNamePair> pricelistversion = new ArrayList<KeyNamePair>();
	ArrayList<KeyNamePair> discountschema 	= new ArrayList<KeyNamePair>();
	private Properties 		m_ctx;

	private MPriceListVersion plv;
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (name.equals(Constants.COLUMNNAME_AD_Client_ID))
				m_AD_Client_ID = para[i].getParameterAsInt();
			if (name.equals(Constants.COLUMNNAME_AD_Org_ID))
				m_AD_Org_ID = para[i].getParameterAsInt();
			else if (name.equals("DeleteOldImported"))
				m_deleteOldImported = "Y".equals(para[i].getParameter());
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
		String clientCheck = " AND AD_Client_ID=" + m_AD_Client_ID;		
		m_lang = Env.getAD_Language(m_ctx);
		String defaultName = Msg.translate(m_lang, "Standard");
		//	****	Prepare	****
		UpdatePO o = new UpdatePO();
		//	Delete Old Imported
		if (m_deleteOldImported)
		{
			o.setTablename(X_I_PriceList.Table_Name);
			o.setClient(m_AD_Client_ID);
			no = o.delete("I_IsImported='Y'", get_TrxName());			
			log.fine("Delete Old Impored =" + no);
		}

		//	Set Client, Org, IsActive, Created/Updated
		o = new UpdatePO();
		o.setTablename(X_I_PriceList.Table_Name);
		o.setField(X_I_PriceList.COLUMNNAME_I_IsImported, Constants.NO);
		o.setField(X_I_PriceList.COLUMNNAME_I_ErrorMsg, "");
		no = o.update("I_IsImported<>'Y' OR I_IsImported IS NULL", get_TrxName());
		log.fine("Reset=" + no);


		o = new UpdatePO();
		o.setTablename(X_I_PriceList.Table_Name);
		o.setAlias("i");
		String fieldexpr = "(SELECT C_UOM_ID FROM C_UOM u WHERE u.uomsymbol=i.uomsymbol AND u.AD_Client_ID IN (0,i.AD_Client_ID))";
		o.setFieldExpr(X_I_PriceList.COLUMNNAME_C_UOM_ID, fieldexpr);
		no = o.update("C_UOM_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());

		//	Set Currency
		o = new UpdatePO();
		o.setTablename(X_I_PriceList.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT C_Currency_ID FROM C_Currency c WHERE c.iso_code=i.iso_code)";
		o.setFieldExpr(X_I_PriceList.COLUMNNAME_C_Currency_ID, fieldexpr);		
		no = o.update("C_Currency_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Currency Default=" + no);

		o = new UpdatePO();
		o.setTablename(X_I_PriceList.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT M_Product_ID FROM M_Product p WHERE p.value=i.product_value)";
		o.setFieldExpr(X_I_PriceList.COLUMNNAME_M_Product_ID, fieldexpr);
		no = o.update("M_Product_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Product=" + no);

		//	Product Value is mandatory error
		o = new UpdatePO();
		o.setTablename(X_I_PriceList.Table_Name);
		o.setClient(m_AD_Client_ID);
		fieldexpr = "I_ErrorMsg||'ERR=Product Value is mandatory, '";
		o.setField(X_I_PriceList.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_PriceList.COLUMNNAME_I_ErrorMsg, fieldexpr);
		no = o.update("product_value=''  AND I_IsImported<>'Y'", get_TrxName());
		log.config("Value is mandatory=" + no);
		//
		//	Product is mandatory error
		o = new UpdatePO();
		o.setTablename(X_I_PriceList.Table_Name);
		o.setClient(m_AD_Client_ID);
		fieldexpr = "I_ErrorMsg ||'ERR=Product need exist, '";		
		o.setField(X_I_PriceList.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_PriceList.COLUMNNAME_I_ErrorMsg, fieldexpr);
		no = o.update("M_Product_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.config("Value is mandatory=" + no);
		
		// 		
		commit();
		//	-------------------------------------------------------------------
		int noInsert = 0;
		int noUpdate = 0;

		List<X_I_PriceList> iprices = new Query(Env.getCtx(), X_I_PriceList.Table_Name, "I_IsImported='N' AND AD_Client_ID = ?", get_TrxName())
		.setParameters(m_AD_Client_ID).list();
		for (X_I_PriceList iprice:iprices) {
			if (iprice.getM_Product_ID() > 0)
			{
				MPriceList pl = new Query(Env.getCtx(), MPriceList.Table_Name, "Name = ?", get_TrxName())
					.setParameters(iprice.getName()).first();
				if (pl == null) {
					pl = new MPriceList(Env.getCtx(), 0 , get_TrxName());					
					pl.setName(iprice.getName());
					pl.setIsTaxIncluded(iprice.isTaxIncluded());
					pl.setIsSOPriceList(iprice.isSOPriceList());
					pl.setC_Currency_ID(iprice.getC_Currency_ID());
					pl.setIsDefault(iprice.isDefault());
					if (pl.save()) {
						o = new UpdatePO();
						o.setTablename(MPriceList.Table_Name);
						o.setField(Constants.COLUMNNAME_AD_Client_ID, m_AD_Client_ID);
						o.update(String.format("%s=%s", MPriceList.COLUMNNAME_M_PriceList_ID, pl.getM_PriceList_ID()), get_TrxName());
					}
				}
				MPriceListVersion plv = new Query(Env.getCtx(), MPriceListVersion.Table_Name, "validfrom = ?", get_TrxName())
					.setParameters(iprice.getValidFrom()).first();
				if (plv == null) {
					X_M_DiscountSchema ds = new Query(Env.getCtx(), X_M_DiscountSchema.Table_Name, "IsActive = 'Y'", get_TrxName()).first();
					plv = new MPriceListVersion(pl);
					plv.setValidFrom(iprice.getValidFrom());
					plv.setM_DiscountSchema_ID(ds.getM_DiscountSchema_ID());
					plv.setName();
					if (plv.save()) {
						o = new UpdatePO();
						o.setTablename(MPriceListVersion.Table_Name);
						o.setField(Constants.COLUMNNAME_AD_Client_ID, m_AD_Client_ID);
						o.update(String.format("%s=%s", MPriceListVersion.COLUMNNAME_M_PriceList_Version_ID, plv.getM_PriceList_Version_ID()), get_TrxName());						
					}
				}
				MProductPrice pp = MProductPrice.get(getCtx(), plv.getM_PriceList_Version_ID(), iprice.getM_Product_ID(), get_TrxName());
				if (pp == null)
				{
					pp = new MProductPrice (getCtx(), 
							plv.getM_PriceList_Version_ID(), 
							iprice.getM_Product_ID(), 
							get_TrxName());
					noInsert++;
				}
				else
				{
					noUpdate++;
				}
				pp.setPrices(iprice.getPriceList(), iprice.getPriceStd(), iprice.getPriceLimit());
				pp.setC_UOM_ID(iprice.getC_UOM_ID());
				pp.save();					
				iprice.setI_IsImported(true);
				iprice.setProcessed(true);
				iprice.setProcessing(false);					
				iprice.save();
			}											
		}
		commit();
		//	Set Error to indicator to not imported
		o = new UpdatePO();
		o.setTablename(X_I_PriceList.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_I_IsImported,  Constants.NO);		
		o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
		no = o.update("I_IsImported<>'Y'", get_TrxName());		
		addLog (0, null, new BigDecimal (no), "@Errors@");
		addLog (0, null, new BigDecimal (noInsert), "@M_PriceList_ID@: @Inserted@");
		addLog (0, null, new BigDecimal (noUpdate), "@M_PriceList_ID@: @Updated@");
		return "";
	}	//	doIt

}	//	ImportListPrice
