/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                       *
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
import java.util.List;
import java.util.logging.*;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MContactInterest;
import org.compiere.model.MLocation;
import org.compiere.model.MUser;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Contact;
import org.compiere.model.persistence.X_I_BPartner;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_I_Product;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.util.*;

import org.xendra.Constants;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
import org.xendra.util.UpdatePO;

/**
 *	Import BPartners from I_BPartner
 *
 * 	@author 	Jorg Janke
 * 	@version 	$Id: ImportBPartner.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="Import_BPartner",
name="Import Business Partners",
description="Import Business Partners",
help="The Parameters are default values for null import record values, they do not overwrite any data.",
Identifier="9f24810d-ca67-81f3-41c0-8a9dfeafe82a",
classname="org.compiere.process.ImportBPartner",
updated="2015-06-20 10:10:12")	
public class ImportBPartner extends SvrProcess
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
			Identifier="9fa3bd7d-fc69-6bdf-e9a9-bb62eb6fe36c")	
	private int				m_AD_Client_ID = 0;
	/**	Delete old Imported				*/
	@XendraProcessParameter(Name="Delete old imported records",
			ColumnName="DeleteOldImported",
			Description="Before processing delete old imported records in the import table",
			Help="",
			AD_Reference_ID=DisplayType.YesNo,
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
			Identifier="3ab11fbc-8ea3-1d2b-df0a-6b03a2e83baf")
	private boolean			m_deleteOldImported = false;

	/** Effective						*/
	private Timestamp		m_DateValue = null;

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

		//	****	Prepare	****
		UpdatePO o = new UpdatePO();
		//	Delete Old Imported
		if (m_deleteOldImported)
		{
			o.setTablename(X_I_BPartner.Table_Name);
			o.setClient(m_AD_Client_ID);
			no = o.delete("I_IsImported='Y'", get_TrxName());			
			log.fine("Delete Old Impored =" + no);
		}

		//	Set Client, Org, IsActive, Created/Updated
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setField(X_I_Product.COLUMNNAME_I_ErrorMsg, "");
		o.setField(X_I_Product.COLUMNNAME_I_IsImported, Constants.NO);
		o.setClient(m_AD_Client_ID);
		no = o.update("I_IsImported<>'Y' OR I_IsImported IS NULL", get_TrxName());		
		log.fine("Reset=" + no);

		//	Set BP_Group
		String fieldexpr = "(SELECT MAX(Value) FROM C_BP_Group g WHERE g.IsDefault='Y' AND g.AD_Client_ID=i.AD_Client_ID)";
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_GroupValue, fieldexpr);
		no = o.update("GroupValue IS NULL AND C_BP_Group_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());

		log.fine("Set Group Default=" + no);
		//
		fieldexpr = "(SELECT C_BP_Group_ID FROM C_BP_Group g WHERE i.GroupValue=g.Value AND g.AD_Client_ID=i.AD_Client_ID)";
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_C_BP_Group_ID, fieldexpr);
		no = o.update("C_BP_Group_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Group=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_BPartner.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Invalid Group,'");
		no = o.update("C_BP_Group_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.config("Invalid Group=" + no);

		//	Set Country
		/**
		sql = new StringBuffer ("UPDATE I_BPartner i "
			+ "SET CountryCode=(SELECT CountryCode FROM C_Country c WHERE c.IsDefault='Y'"
			+ " AND c.AD_Client_ID IN (0, i.AD_Client_ID) AND ROWNUM=1) "
			+ "WHERE CountryCode IS NULL AND C_Country_ID IS NULL"
			+ " AND I_IsImported<>'Y'").append(clientCheck);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Set Country Default=" + no);
		 **/
		//
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT C_Country_ID FROM C_Country c WHERE i.CountryCode=c.CountryCode AND c.AD_Client_ID IN (0, i.AD_Client_ID))";
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_C_Country_ID, fieldexpr);
		no = o.update("C_Country_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());		
		log.fine("Set Country=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_BPartner.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Invalid Country, '");
		no = o.update("C_Country_ID IS NULL AND (City IS NOT NULL OR Address1 IS NOT NULL) AND I_IsImported<>'Y'", get_TrxName());
		log.config("Invalid Country=" + no);

		//	Set Region
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT MAX(Name) FROM C_Region r WHERE r.IsDefault='Y' AND r.C_Country_ID=i.C_Country_ID AND r.AD_Client_ID IN (0, i.AD_Client_ID))"; 
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_RegionName, fieldexpr);
		no = o.update("RegionName IS NULL AND C_Region_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Region Default=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT C_Region_ID FROM C_Region r WHERE r.Name=i.RegionName AND r.C_Country_ID=i.C_Country_ID AND r.AD_Client_ID IN (0, i.AD_Client_ID))";
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_C_Region_ID, fieldexpr);
		no = o.update("C_Region_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Region=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_BPartner.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_I_ErrorMsg,"I_ErrorMsg||'ERR=Invalid Region, '");
		no = o.update("C_Region_ID IS NULL AND EXISTS (SELECT * FROM C_Country c WHERE c.C_Country_ID=i.C_Country_ID AND c.HasRegion='Y')", get_TrxName());
		//		+ " AND I_IsImported<>'Y'""
		log.config("Invalid Region=" + no);

		//	Set Greeting
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT C_Greeting_ID FROM C_Greeting g WHERE i.BPContactGreeting=g.Name AND g.AD_Client_ID IN (0, i.AD_Client_ID))";
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_C_Greeting_ID, fieldexpr);
		no = o.update("C_Greeting_ID IS NULL AND BPContactGreeting IS NOT NULL AND I_IsImported<>'Y'", get_TrxName());
		log.fine("Set Greeting=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);		
		//o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_BPartner.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_I_ErrorMsg,"I_ErrorMsg||'ERR=Invalid Greeting, '");
		no = o.update("C_Greeting_ID IS NULL AND BPContactGreeting IS NOT NULL AND I_IsImported<>'Y'", get_TrxName());
		log.config("Invalid Greeting=" + no);

		//	Existing User ?
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setAlias("i");		
		o.setClient(m_AD_Client_ID);
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_C_BPartner_ID, "u.C_BPartner_ID");
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_AD_User_ID, "u.AD_User_ID");
		no = o.update("FROM AD_User u WHERE i.EMail=u.EMail AND u.AD_Client_ID=i.AD_Client_ID AND I_IsImported='N'", get_TrxName());
		log.fine("Found EMail User=" + no);

		//	Existing BPartner ? Match Value
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT C_BPartner_ID FROM C_BPartner p WHERE i.Value=p.Value AND p.AD_Client_ID=i.AD_Client_ID)";
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_C_BPartner_ID, fieldexpr);
		no = o.update("C_BPartner_ID IS NULL AND Value IS NOT NULL AND I_IsImported='N'", get_TrxName());
		log.fine("Found BPartner=" + no);

		//	Existing Contact ? Match Name
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setAlias("i");
		fieldexpr = "(SELECT AD_User_ID FROM AD_User c WHERE i.ContactName=c.Name AND i.C_BPartner_ID=c.C_BPartner_ID AND c.AD_Client_ID=i.AD_Client_ID)";
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_AD_User_ID, fieldexpr);
		no = o.update("C_BPartner_ID IS NOT NULL AND AD_User_ID IS NULL AND ContactName IS NOT NULL AND I_IsImported='N'", get_TrxName());
		log.fine("Found Contact=" + no);

		//	Existing Location ? Exact Match
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setAlias("i");
		fieldexpr = "(SELECT C_BPartner_Location_ID FROM C_BPartner_Location bpl ";
		fieldexpr += " INNER JOIN C_Location l ON (bpl.C_Location_ID=l.C_Location_ID)";
		fieldexpr += " WHERE i.C_BPartner_ID=bpl.C_BPartner_ID AND bpl.AD_Client_ID=i.AD_Client_ID";
		fieldexpr += " AND COALESCE(i.Address1,'')=COALESCE(l.Address1,'') ";
		fieldexpr += " AND COALESCE(i.Address2,'')=COALESCE(l.Address2,'') ";
		fieldexpr += " AND COALESCE(i.City,'')=COALESCE(l.City,'') ";
		fieldexpr += " AND COALESCE(i.Postal,'')=COALESCE(l.Postal,'') ";
		fieldexpr += " AND COALESCE(i.Postal_Add,'')=COALESCE(l.Postal_Add,'')";
		fieldexpr += " AND COALESCE(i.C_Region_ID,0)=COALESCE(l.C_Region_ID,0) AND COALESCE(i.C_Country_ID,0)=COALESCE(l.C_Country_ID,0))"; 
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_C_BPartner_Location_ID, fieldexpr);
		no = o.update("C_BPartner_ID IS NOT NULL AND C_BPartner_Location_ID IS NULL AND I_IsImported='N'", get_TrxName());
		log.fine("Found Location=" + no);

		//	Interest Area
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setAlias("i");
		fieldexpr = "(SELECT R_InterestArea_ID FROM R_InterestArea ia WHERE i.InterestAreaName=ia.Name AND ia.AD_Client_ID=i.AD_Client_ID) ";
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_R_InterestArea_ID, fieldexpr);
		no = o.update("R_InterestArea_ID IS NULL AND InterestAreaName IS NOT NULL AND I_IsImported='N'", get_TrxName());
		log.fine("Set Interest Area=" + no);

		// Value is mandatory error
		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_BPartner.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_BPartner.COLUMNNAME_I_ErrorMsg,"I_ErrorMsg||'ERR=Value is mandatory, '");
		no = o.update("Value IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.config("Value is mandatory=" + no);

		String IdBPDocType="246094aa-4294-0df2-51fe-48832dd65b30";
		List<X_AD_Ref_List> reflist = null;  
		X_AD_Reference ref = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "Identifier = ?", get_TrxName()).setParameters(IdBPDocType).first();
		if (ref != null)
		{
			String list = "";
			if (ref.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
			{
				reflist = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "AD_Reference_ID = ?", get_TrxName())
				.setParameters(ref.getAD_Reference_ID()).list();

			}
			if (reflist != null)
			{

				for (X_AD_Ref_List reflst:reflist)
				{
					if (list.length() > 0)
						list += ',';
					list = list + String.format("'%s'",reflst.getValue());
				}
			}
			if (list.length() > 0) {
				o = new UpdatePO();
				o.setTablename(X_I_BPartner.Table_Name);
				o.setClient(m_AD_Client_ID);
				o.setField(X_I_BPartner.COLUMNNAME_I_IsImported, "E");
				o.setFieldExpr(X_I_BPartner.COLUMNNAME_I_ErrorMsg,"I_ErrorMsg||'ERR=Doc Type not exist, '");
				no = o.update("c_bp_doctypei IS NOT NULL AND c_bp_doctypei NOT IN (" +list+") AND I_IsImported<>'Y' ", get_TrxName());
				log.config("Doc Type not exist=" + no);
			} 
		}
		commit();
		//	-------------------------------------------------------------------
		int noInsert = 0;
		int noUpdate = 0;

		//	Go through Records
		sql = new StringBuffer ("SELECT * FROM I_BPartner "
				+ "WHERE I_IsImported='N'").append(clientCheck);
		try
		{
			List<X_I_BPartner> ipartners = new Query(Env.getCtx(), X_I_BPartner.Table_Name, "I_IsImported='N' AND AD_Client_ID = ?", get_TrxName())
			.setParameters(m_AD_Client_ID).list();
			for (X_I_BPartner ipartner:ipartners) {
				MBPartner bp = null;
				if (ipartner.getC_BPartner_ID() == 0) {
					bp = new MBPartner(ipartner);
					bp.setIsVendor(ipartner.isVendor());
					bp.setIsProspect(ipartner.isProspect());
					bp.setIsCustomer(ipartner.isCustomer());
					bp.setIsEmployee(ipartner.isEmployee());
					bp.setTaxID(ipartner.getTaxID());
					bp.setIsSalesRep(ipartner.isSalesRep());					
					//bp.setC_BP_DocTypeI(impBP.getC_BP_DocTypeI());
					BigDecimal CreditLimit = ipartner.getSO_CreditLimit();
					if (CreditLimit == null)
						CreditLimit = Env.ZERO;
					bp.setSO_CreditLimit(CreditLimit);					
					if (bp.save())
					{
						ipartner.setC_BPartner_ID(bp.getC_BPartner_ID());
						log.finest("Insert BPartner - " + bp.getC_BPartner_ID());
						noInsert++;
						if (ipartner.getContactName() != null && ipartner.getContactName().length() > 0)
						{					
							X_C_Contact contact = new Query(Env.getCtx(), X_C_Contact.Table_Name, "C_BPartner_ID = ?", null)
							.setParameters(ipartner.getC_BPartner_ID()).first();
							if (contact == null)
							{
								contact = new X_C_Contact(Env.getCtx(), 0, get_TrxName());
								contact.setName(ipartner.getContactName());
								contact.setC_BPartner_ID(bp.getC_BPartner_ID());														
								contact.save();
							}

						}
					}
					else
					{
						o = new UpdatePO();
						o.setTablename(X_I_BPartner.Table_Name);
						o.setAlias("i");
						o.setField(X_I_Product.COLUMNNAME_I_IsImported, "E");
						o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Cannot Insert BPartner, ' ");
						no = o.update(String.format("I_BPartner_ID=%s", ipartner.getI_BPartner_ID()), get_TrxName());
						continue;
					}										
				} else {
					bp = new Query(Env.getCtx(), MBPartner.Table_Name, "C_BPartner_ID = ?", get_TrxName())
					.setParameters(ipartner.getC_BPartner_ID()).first();
					if (ipartner.getName() != null)
					{
						bp.setName(ipartner.getName());
						bp.setName2(ipartner.getName2());
					}
					if (ipartner.getDUNS() != null)
						bp.setDUNS(ipartner.getDUNS());
					if (ipartner.getTaxID() != null)
						bp.setTaxID(ipartner.getTaxID());
					if (ipartner.getNAICS() != null)
						bp.setNAICS(ipartner.getNAICS());
					if (ipartner.getDescription() != null)
						bp.setDescription(ipartner.getDescription());
					if (ipartner.getC_BP_Group_ID() != 0)
						bp.setC_BP_Group_ID(ipartner.getC_BP_Group_ID());
					if (ipartner.getSO_CreditLimit() != null)
						bp.setSO_CreditLimit(ipartner.getSO_CreditLimit());
					if (bp.save())
					{
						if (ipartner.getContactName() != null && ipartner.getContactName().length() > 0)
						{					
							X_C_Contact contact = new Query(Env.getCtx(), X_C_Contact.Table_Name, "C_BPartner_ID = ?", null)
							.setParameters(ipartner.getC_BPartner_ID()).first();
							if (contact == null)
							{
								contact = new X_C_Contact(Env.getCtx(), 0, get_TrxName());
								contact.setName(ipartner.getContactName());
								contact.setC_BPartner_ID(bp.getC_BPartner_ID());														
								contact.save();
							}

						}						
						log.finest("Update BPartner - " + bp.getC_BPartner_ID());
						noUpdate++;
					}
					else
					{
						o = new UpdatePO();
						o.setTablename(X_I_BPartner.Table_Name);
						o.setAlias("i");
						o.setField(X_I_Product.COLUMNNAME_I_IsImported, "E");
						o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Cannot Update BPartner, ' ");
						no = o.update(String.format("I_BPartner_ID=%s", ipartner.getI_BPartner_ID()), get_TrxName());
						continue;
					}

				}
				//	****	Create/Update BPartner Location	****
				MBPartnerLocation bpl = null;
				if (ipartner.getC_BPartner_Location_ID() != 0)		//	Update Location
				{
					bpl = new MBPartnerLocation(getCtx(), ipartner.getC_BPartner_Location_ID(), get_TrxName());
					MLocation location = new MLocation(getCtx(), bpl.getC_Location_ID(), get_TrxName());
					location.setC_Country_ID(ipartner.getC_Country_ID());
					location.setC_Region_ID(ipartner.getC_Region_ID());
					location.setCity(ipartner.getCity());
					location.setAddress1(ipartner.getAddress1());
					location.setAddress2(ipartner.getAddress2());
					location.setPostal(ipartner.getPostal());
					location.setPostal_Add(ipartner.getPostal_Add());
					if (!location.save())
						log.warning("Location not updated");
					else
						bpl.setC_Location_ID(location.getC_Location_ID());
					if (ipartner.getPhone() != null)
						bpl.setPhone(ipartner.getPhone());
					if (ipartner.getPhone2() != null)
						bpl.setPhone2(ipartner.getPhone2());
					if (ipartner.getFax() != null)
						bpl.setFax(ipartner.getFax());
					bpl.save();
				}
				else 	//	New Location
					if (ipartner.getC_Country_ID() != 0
					&& ipartner.getAddress1() != null 
					&& ipartner.getCity() != null)
					{
						MLocation location = new MLocation(getCtx(), ipartner.getC_Country_ID(), 
								ipartner.getC_Region_ID(), ipartner.getCity(), get_TrxName());
						location.setAddress1(ipartner.getAddress1());
						location.setAddress2(ipartner.getAddress2());
						location.setPostal(ipartner.getPostal());
						location.setPostal_Add(ipartner.getPostal_Add());
						if (location.save())
							log.finest("Insert Location - " + location.getC_Location_ID());
						else
						{
							rollback();
							noInsert--;
							o = new UpdatePO();
							o.setTablename(X_I_BPartner.Table_Name);
							o.setField(X_I_Product.COLUMNNAME_I_IsImported, "E");
							o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Cannot Insert Location,'");
							no = o.update(String.format("I_BPartner_ID=%s", ipartner.getI_BPartner_ID()), get_TrxName());							
							continue;
						}
						//
						bpl = new MBPartnerLocation (bp);
						bpl.setC_Location_ID(location.getC_Location_ID());
						bpl.setPhone(ipartner.getPhone());
						bpl.setPhone2(ipartner.getPhone2());
						bpl.setFax(ipartner.getFax());
						if (bpl.save())
						{
							log.finest("Insert BP Location - " + bpl.getC_BPartner_Location_ID());
							ipartner.setC_BPartner_Location_ID(bpl.getC_BPartner_Location_ID());
						}
						else
						{
							rollback();
							noInsert--;
							o = new UpdatePO();
							o.setTablename(X_I_BPartner.Table_Name);
							o.setField(X_I_Product.COLUMNNAME_I_IsImported,  "E");
							o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Cannot Insert BPLocation, '");
							no = o.update(String.format("I_BPartner_ID=%s", ipartner.getI_BPartner_ID()), get_TrxName());
							continue;
						}
					}
					else
					{
						o = new UpdatePO();
						o.setTablename(X_I_BPartner.Table_Name);
						o.setField(X_I_Product.COLUMNNAME_I_IsImported,  "E");
						o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Cannot Insert Location, '");
						no = o.update(String.format("I_BPartner_ID=%s", ipartner.getI_BPartner_ID()), get_TrxName());						
						continue;

					}		
				//	****	Create/Update Contact	****
				MUser user = null;
				if (ipartner.getAD_User_ID() != 0)
				{
					user = new MUser (getCtx(), ipartner.getAD_User_ID(), get_TrxName());
					if (user.getC_BPartner_ID() == 0)
						user.setC_BPartner_ID(bp.getC_BPartner_ID());
					else if (user.getC_BPartner_ID() != bp.getC_BPartner_ID())
					{
						rollback();
						noInsert--;
						o = new UpdatePO();
						o.setTablename(X_I_BPartner.Table_Name);
						o.setAlias("i");
						o.setField(X_I_Product.COLUMNNAME_I_IsImported,  "E");
						o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'BP of User <> BP, '");
						no = o.update(String.format("I_BPartner_ID=%s", ipartner.getI_BPartner_ID()), get_TrxName());
						continue;
					}
					if (ipartner.getC_Greeting_ID() != 0)
						user.setC_Greeting_ID(ipartner.getC_Greeting_ID());
					String name = ipartner.getContactName();
					if (name == null || name.length() == 0)
						name = ipartner.getEMail();
					user.setName(name);
					if (ipartner.getTitle() != null)
						user.setTitle(ipartner.getTitle());
					if (ipartner.getContactDescription() != null)
						user.setDescription(ipartner.getContactDescription());
					if (ipartner.getComments() != null)
						user.setComments(ipartner.getComments());
					if (ipartner.getPhone() != null)
						user.setPhone(ipartner.getPhone());
					if (ipartner.getPhone2() != null)
						user.setPhone2(ipartner.getPhone2());
					if (ipartner.getFax() != null)
						user.setFax(ipartner.getFax());
					if (ipartner.getEMail() != null)
						user.setEMail(ipartner.getEMail());
					if (ipartner.getBirthday() != null)
						user.setBirthday(ipartner.getBirthday());
					if (bpl != null)
						user.setC_BPartner_Location_ID(bpl.getC_BPartner_Location_ID());
					if (user.save())
					{
						log.finest("Update BP Contact - " + user.getAD_User_ID());
					}
					else
					{
						rollback();
						noInsert--;
						o = new UpdatePO();
						o.setTablename(X_I_BPartner.Table_Name);
						o.setField(X_I_Product.COLUMNNAME_I_IsImported,  "E");
						o.setFieldExpr(X_I_Product.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Cannot Update BP Contact, '");
						no = o.update(String.format("I_BPartner_ID=%s", ipartner.getI_BPartner_ID()), get_TrxName());
						continue;
					}
				}
				//	Interest Area
				if (ipartner.getR_InterestArea_ID() != 0 && user != null)
				{
					MContactInterest ci = MContactInterest.get(getCtx(), 
							ipartner.getR_InterestArea_ID(), user.getAD_User_ID(), true, get_TrxName());
					ci.save();		//	don't subscribe or re-activate
				}
				//
				ipartner.setI_IsImported(true);
				ipartner.setProcessed(true);
				ipartner.setProcessing(false);
				ipartner.save();
				commit();
				//			}	//	for all I_Product

			}
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "", e);
			rollback();
		}

		o = new UpdatePO();
		o.setTablename(X_I_BPartner.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_Product.COLUMNNAME_I_IsImported,  Constants.NO);		
		o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
		no = o.update("I_IsImported<>'Y'", get_TrxName());
		addLog (0, null, new BigDecimal (no), "@Errors@");
		addLog (0, null, new BigDecimal (noInsert), "@C_BPartner_ID@: @Inserted@");
		addLog (0, null, new BigDecimal (noUpdate), "@C_BPartner_ID@: @Updated@");
		return "";
	}	//	doIt

}	//	ImportBPartner
