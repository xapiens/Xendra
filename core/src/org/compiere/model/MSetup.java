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

import java.io.*;
import java.security.KeyStore;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.process.*;
import org.compiere.util.*;
import org.compiere.apps.ProcessCtl;
import org.compiere.model.persistence.X_AD_ClientInfo;
import org.compiere.model.persistence.X_AD_OrgInfo;
import org.compiere.model.persistence.X_AD_Preference;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_AD_User_Roles;
import org.compiere.model.persistence.X_C_AcctSchema_Default;
import org.compiere.model.persistence.X_C_AcctSchema_Element;
import org.compiere.model.persistence.X_C_AcctSchema_GL;
import org.compiere.model.persistence.X_C_BP_Group;
import org.compiere.model.persistence.X_C_Campaign;
import org.compiere.model.persistence.X_C_Channel;
import org.compiere.model.persistence.X_C_Cycle;
import org.compiere.model.persistence.X_C_Project;
import org.compiere.model.persistence.X_C_SalesRegion;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.model.persistence.X_C_TaxCategory;
import org.compiere.model.persistence.X_C_UOM;
import org.compiere.model.persistence.X_I_BPartner;
import org.compiere.model.persistence.X_I_Inventory;
import org.compiere.model.persistence.X_I_PriceList;
import org.compiere.model.persistence.X_I_Product;
import org.compiere.model.persistence.X_M_Product_Category;
import org.compiere.model.reference.REF_AD_RolePreferenceType;
import org.compiere.model.reference.REF_C_AcctSchemaElementType;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF_C_DocTypeSubType;
import org.compiere.model.reference.REF_AD_RoleUserLevel;
import org.compiere.model.reference.REF_C_ElementType;
import org.compiere.model.reference.REF_GLCategoryType;
import org.compiere.model.reference.REF_M_DiscountType;
import org.xendra.Constants;
import org.xendra.util.UpdatePO;
/**
 * Initial Setup Model
 *
 * @author Jorg Janke
 * @version $Id: MSetup.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public final class MSetup
{
	/**
	 *  Constructor
	 *  @param ctx context
	 *  @param WindowNo window
	 */
	public MSetup(Properties ctx, int WindowNo)
	{
		m_lang  = Env.getAD_Language(Env.getCtx());
		m_WindowNo = WindowNo;
	}   //  MSetup

	/**	Logger			*/
	protected CLogger	log = CLogger.getCLogger(getClass());

	private Trx				m_trx = Trx.get(Trx.createTrxName("Setup"), true);
	private String          m_lang;
	private int             m_WindowNo;
	private StringBuffer    m_info;
	//
	private String          m_clientName;
	//	private String          m_orgName;
	//
	private String          m_stdColumns = "AD_Client_ID,AD_Org_ID,IsActive,Created,CreatedBy,Updated,UpdatedBy";
	//private String          m_stdValues;
	private String          m_stdValuesOrg;
	//
	private NaturalAccountMap<String,MElementValue> m_nap = null;
	//
	private MClient			m_client;
	private MOrg			m_org;
	private MAcctSchema		m_as;
	//
	private int     		AD_User_ID;
	private String  		AD_User_Name;
	private int     		AD_User_U_ID;
	private String  		AD_User_U_Name;
	private MCalendar		m_calendar;
	private int     		m_AD_Tree_Account_ID;
	private int     		C_Cycle_ID;
	//
	private boolean         m_hasProject = false;
	private boolean         m_hasMCampaign = false;
	private boolean         m_hasSRegion = false;
	/** Account Creation OK		*/
	private boolean m_accountsOK = false;

	/**
	 *  Create Client Info.
	 *  - Client, Trees, Org, Role, User, User_Role
	 *  @param clientName client name
	 *  @param orgName org name
	 *  @param userClient user id client
	 *  @param userOrg user id org
	 * @param lang 
	 *  @return true if created
	 */
	public boolean createClient (String clientValue, String clientName, String orgName,
			String userClient, String userOrg, Language lang)
	{
		log.info(clientName);
		m_trx.start();

		//  info header
		m_info = new StringBuffer();
		//  Standarc columns
		String name = null;		
		int no = 0;

		/**
		 *  Create Client
		 */
		try {
			//name = clientName;
			name = clientValue;
			if (name == null || name.length() == 0)
				name = "newClient";
			m_clientName = name;
			m_client = new MClient(Env.getCtx(), 0, true, m_trx.getTrxName());
			m_client.setValue(clientValue);
			m_client.setName(clientName);
			m_client.setPluginUpdate(true);
			m_client.setAD_Language(lang.getAD_Language());
			if (!m_client.save())
			{
				throw new Exception("Client NOT created");
			}
			int AD_Client_ID = m_client.getAD_Client_ID();
			Env.setContext(Env.getCtx(), m_WindowNo, "AD_Client_ID", AD_Client_ID);
			Env.setContext(Env.getCtx(), "#AD_Client_ID", AD_Client_ID);

			//	Standard Values
			//m_stdValues = String.valueOf(AD_Client_ID) + ",0,'Y',CURRENT_TIMESTAMP,0,CURRENT_TIMESTAMP,0";
			//  Info - Client
			m_info.append(Msg.translate(m_lang, "AD_Client_ID")).append("=").append(name).append("\n");

			//	Setup Sequences
			if (!MSequence.checkClientSequences (Env.getCtx(), AD_Client_ID, m_trx.getTrxName()))
			{
				throw new Exception ("Sequences NOT created");
			}


			//  Trees and Client Info
			if (!m_client.setupClientInfo(m_lang))
			{
				throw new Exception ("Client Info NOT created");
			}
			m_AD_Tree_Account_ID = m_client.getSetup_AD_Tree_Account_ID();

			/**
			 *  Create Org
			 */
			name = orgName;
			if (name == null || name.length() == 0)
				name = "newOrg";
			m_org = new MOrg (m_client, name);
			if (!m_org.save())
			{
				throw new Exception("Organization NOT created");
			}
			Env.setContext(Env.getCtx(), m_WindowNo, "AD_Org_ID", getAD_Org_ID());
			Env.setContext(Env.getCtx(), "#AD_Org_ID", getAD_Org_ID());			
			m_stdValuesOrg = AD_Client_ID + "," + getAD_Org_ID() + ",'Y',CURRENT_TIMESTAMP,0,CURRENT_TIMESTAMP,0";
			//  Info
			m_info.append(Msg.translate(m_lang, "AD_Org_ID")).append("=").append(name).append("\n");

			/**
			 *  Create Roles
			 *  - Admin
			 *  - User
			 */
			name = m_clientName + " Admin";
			MRole admin = new MRole(Env.getCtx(), 0, m_trx.getTrxName());
			admin.setClientOrg(m_client);
			admin.setName(name);
			admin.setUserLevel(REF_AD_RoleUserLevel.ClientPlusOrganization);
			admin.setPreferenceType(REF_AD_RolePreferenceType.Client);
			admin.setIsShowAcct(true);
			if (!admin.save())
			{
				throw new Exception("Admin Role A NOT inserted");
			}
			//	OrgAccess x, 0
			MRoleOrgAccess adminClientAccess = new MRoleOrgAccess (admin, 0);
			if (!adminClientAccess.save())
				log.log(Level.SEVERE, "Admin Role_OrgAccess 0 NOT created");
			//  OrgAccess x,y
			MRoleOrgAccess adminOrgAccess = new MRoleOrgAccess (admin, m_org.getAD_Org_ID());
			if (!adminOrgAccess.save())
				log.log(Level.SEVERE, "Admin Role_OrgAccess NOT created");

			//  Info - Admin Role
			m_info.append(Msg.translate(m_lang, "AD_Role_ID")).append("=").append(name).append("\n");

			//
			name = m_clientName + " User";
			MRole user = new MRole (Env.getCtx(), 0, m_trx.getTrxName());
			user.setClientOrg(m_client);
			user.setName(name);
			if (!user.save())
			{
				throw new Exception("User Role A NOT inserted");
			}
			//  OrgAccess x,y
			MRoleOrgAccess userOrgAccess = new MRoleOrgAccess (user, m_org.getAD_Org_ID());
			if (!userOrgAccess.save())
				log.log(Level.SEVERE, "User Role_OrgAccess NOT created");

			//  Info - Client Role
			m_info.append(Msg.translate(m_lang, "AD_Role_ID")).append("=").append(name).append("\n");

			/**
			 *  Create Users
			 *  - Client
			 *  - Org
			 */
			name = userClient;
			if (name == null || name.length() == 0)
				name = m_clientName + "Client";
			AD_User_ID = getNextID(AD_Client_ID, "AD_User");		
			AD_User_Name = name;
			name = DB.TO_STRING(name);

			UpdatePO o = new UpdatePO();
			o.setTablename(X_AD_User.Table_Name);
			o.setField(X_AD_User.COLUMNNAME_AD_User_ID, AD_User_ID);
			o.setField(X_AD_User.COLUMNNAME_Name, name);
			o.setField(X_AD_User.COLUMNNAME_Description, name);
			o.setField(X_AD_User.COLUMNNAME_Password, name);
			no = o.insert(m_trx.getTrxName());
			if (no != 1)
			{
				throw new Exception(String.format("Admin User NOT inserted - %s", AD_User_Name));
			}
			//  Info
			m_info.append(Msg.translate(m_lang, "AD_User_ID")).append("=").append(AD_User_Name).append("/").append(AD_User_Name).append("\n");

			name = userOrg;
			if (name == null || name.length() == 0)
				name = m_clientName + "Org";
			AD_User_U_ID = getNextID(AD_Client_ID, "AD_User");
			AD_User_U_Name = name;
			name = DB.TO_STRING(name);
			o = new UpdatePO();
			o.setTablename(X_AD_User.Table_Name);
			o.setField(X_AD_User.COLUMNNAME_AD_User_ID, AD_User_U_ID);
			o.setField(X_AD_User.COLUMNNAME_Name, name);
			o.setField(X_AD_User.COLUMNNAME_Description, name);
			o.setField(X_AD_User.COLUMNNAME_Password, name);
			no = o.insert(m_trx.getTrxName());		
			if (no != 1)
			{
				throw new Exception(String.format("Org User NOT inserted - %s" , AD_User_U_Name));
			}
			//  Info
			m_info.append(Msg.translate(m_lang, "AD_User_ID")).append("=").append(AD_User_U_Name).append("/").append(AD_User_U_Name).append("\n");

			/**
			 *  Create User-Role
			 */
			//  ClientUser          - Admin & User
			o = new UpdatePO();
			o.setTablename(X_AD_User_Roles.Table_Name);
			o.setField(X_AD_User_Roles.COLUMNNAME_AD_User_ID, AD_User_ID);
			o.setField(X_AD_User_Roles.COLUMNNAME_AD_Role_ID, admin.getAD_Role_ID());
			no = o.insert(m_trx.getTrxName());				
			if (no != 1)
				log.log(Level.SEVERE, "UserRole ClientUser+Admin NOT inserted");
			o = new UpdatePO();
			o.setTablename(X_AD_User_Roles.Table_Name);
			o.setField(X_AD_User_Roles.COLUMNNAME_AD_User_ID, AD_User_ID);
			o.setField(X_AD_User_Roles.COLUMNNAME_AD_Role_ID, user.getAD_Role_ID());
			no = o.insert(m_trx.getTrxName());				
			if (no != 1)
				log.log(Level.SEVERE, "UserRole ClientUser+User NOT inserted");
			//  OrgUser             - User
			o = new UpdatePO();
			o.setTablename(X_AD_User_Roles.Table_Name);
			o.setField(X_AD_User_Roles.COLUMNNAME_AD_User_ID, AD_User_U_ID);
			o.setField(X_AD_User_Roles.COLUMNNAME_AD_Role_ID, user.getAD_Role_ID());
			no = o.insert(m_trx.getTrxName());						
			if (no != 1)
				log.log(Level.SEVERE, "UserRole OrgUser+Org NOT inserted");

			//	Processors
			MAcctProcessor ap = new MAcctProcessor(m_client, AD_User_ID);
			ap.save();

			MRequestProcessor rp = new MRequestProcessor (m_client, AD_User_ID);
			rp.save();

			log.info("fini");
		} catch (Exception e) {
			String err = e.getMessage();
			log.log(Level.SEVERE, err);
			m_info.append(err);
			m_trx.rollback();
			m_trx.close();
			return false;			
		}		
		return true;
	}   //  createClient



	/**************************************************************************
	 *  Create Accounting elements.
	 *  - Calendar
	 *  - Account Trees
	 *  - Account Values
	 *  - Accounting Schema
	 *  - Default Accounts
	 *
	 *  @param currency currency
	 *  @param hasProduct has product segment
	 *  @param hasBPartner has bp segment
	 *  @param hasProject has project segment
	 *  @param hasMCampaign has campaign segment
	 *  @param hasSRegion has sales region segment
	 *  @param AccountingFile file name of accounting file
	 *  @return true if created
	 */
	public boolean createAccounting(KeyNamePair currency,
			boolean hasProduct, boolean hasBPartner, boolean hasProject,
			boolean hasMCampaign, boolean hasSRegion,
			File AccountingFile)
	{
		try {
			log.info(m_client.toString());
			//
			m_hasProject = hasProject;
			m_hasMCampaign = hasMCampaign;
			m_hasSRegion = hasSRegion;

			//  Standard variables
			m_info = new StringBuffer();
			String name = null;
			StringBuffer sqlCmd = null;
			int no = 0;

			/**
			 *  Create Calendar
			 */
			m_calendar = new MCalendar(m_client);
			if (!m_calendar.save())
			{
				throw new Exception("Calendar NOT inserted");
			}
			//  Info
			m_info.append(Msg.translate(m_lang, "C_Calendar_ID")).append("=").append(m_calendar.getName()).append("\n");

			if (m_calendar.createYear(m_client.getLocale()) == null)
				log.log(Level.SEVERE, "Year NOT inserted");

			//	Create Account Elements
			name = m_clientName + " " + Msg.translate(m_lang, "Account_ID");		
			//MElement element = new MElement (m_client, name, REF_C_AcctSchemaElementType.Account, m_AD_Tree_Account_ID);
			MElement element = new MElement (m_client, name, REF_C_ElementType.Account, m_AD_Tree_Account_ID);
			if (!element.save())
			{
				throw new Exception("Acct Element NOT inserted");
			}
			int C_Element_ID = element.getC_Element_ID();
			m_info.append(Msg.translate(m_lang, "C_Element_ID")).append("=").append(name).append("\n");

			//	Create Account Values
			m_nap = new NaturalAccountMap<String,MElementValue>(Env.getCtx(), m_trx.getTrxName());
			String errMsg = m_nap.parseFile(AccountingFile);
			if (errMsg.length() != 0)
			{
				throw new Exception(errMsg);
			}
			if (m_nap.saveAccounts(getAD_Client_ID(), getAD_Org_ID(), C_Element_ID))
				m_info.append(Msg.translate(m_lang, "C_ElementValue_ID")).append(" # ").append(m_nap.size()).append("\n");
			else
			{
				throw new Exception("Acct Element Values NOT inserted");
			}

			int C_ElementValue_ID = m_nap.getC_ElementValue_ID("DEFAULT_ACCT");
			log.fine("C_ElementValue_ID=" + C_ElementValue_ID);

			/**
			 *  Create AccountingSchema
			 */
			m_as = new MAcctSchema (m_client, currency);
			if (!m_as.save())
			{
				throw new Exception("AcctSchema NOT inserted");
			}
			//  Info
			m_info.append(Msg.translate(m_lang, "C_AcctSchema_ID")).append("=").append(m_as.getName()).append("\n");

			ValueNamePair[] results = MRefList.getList("24957d9a-7342-7c9b-45fa-52d6e887e0d5");
			int AD_Client_ID = m_client.getAD_Client_ID();
			int Element_OO=0, Element_AC=0, Element_PR=0, Element_BP=0, Element_PJ=0,
					Element_MC=0, Element_SR=0;		
			for (ValueNamePair result:results) {
				String IsMandatory = null;
				String IsBalanced = "N";
				int SeqNo = 0;		
				int C_AcctSchema_Element_ID = 0;			
				String ElementType = result.getValue();
				name = result.getName();
				if (ElementType.equals(REF_C_AcctSchemaElementType.Organization)) 
				{
					C_AcctSchema_Element_ID = getNextID(AD_Client_ID, "C_AcctSchema_Element");
					Element_OO = C_AcctSchema_Element_ID;
					IsMandatory = "Y";
					IsBalanced = "Y";
					SeqNo = 10;
				}
				else if (ElementType.equals(REF_C_AcctSchemaElementType.Account))
				{
					C_AcctSchema_Element_ID = getNextID(AD_Client_ID, "C_AcctSchema_Element");
					Element_AC = C_AcctSchema_Element_ID;
					IsMandatory = "Y";
					SeqNo = 20;
				}
				else if (ElementType.equals(REF_C_AcctSchemaElementType.Product) && hasProduct)
				{
					C_AcctSchema_Element_ID = getNextID(AD_Client_ID, "C_AcctSchema_Element");
					Element_PR = C_AcctSchema_Element_ID;
					IsMandatory = "N";
					SeqNo = 30;
				}
				else if (ElementType.equals(REF_C_AcctSchemaElementType.BPartner) && hasBPartner)
				{
					C_AcctSchema_Element_ID = getNextID(AD_Client_ID, "C_AcctSchema_Element");
					Element_BP = C_AcctSchema_Element_ID;
					IsMandatory = "N";
					SeqNo = 40;
				}
				else if (ElementType.equals(REF_C_AcctSchemaElementType.Project) && hasProject)
				{
					C_AcctSchema_Element_ID = getNextID(AD_Client_ID, "C_AcctSchema_Element");
					Element_PJ = C_AcctSchema_Element_ID;
					IsMandatory = "N";
					SeqNo = 50;
				}
				else if (ElementType.equals(REF_C_AcctSchemaElementType.Campaign) && hasMCampaign)
				{
					C_AcctSchema_Element_ID = getNextID(AD_Client_ID, "C_AcctSchema_Element");
					Element_MC = C_AcctSchema_Element_ID;
					IsMandatory = "N";
					SeqNo = 60;
				}
				else if (ElementType.equals(REF_C_AcctSchemaElementType.SalesRegion) && hasSRegion)
				{
					C_AcctSchema_Element_ID = getNextID(AD_Client_ID, "C_AcctSchema_Element");
					Element_SR = C_AcctSchema_Element_ID;
					IsMandatory = "N";
					SeqNo = 70;
				}
				//	Not OT, LF, LT, U1, U2, AY
				if (IsMandatory != null)
				{
					UpdatePO o = new UpdatePO();
					o.setTablename(X_C_AcctSchema_Element.Table_Name);
					o.setField(X_C_AcctSchema_Element.COLUMNNAME_C_AcctSchema_Element_ID, C_AcctSchema_Element_ID);
					o.setField(X_C_AcctSchema_Element.COLUMNNAME_C_AcctSchema_ID, m_as.getC_AcctSchema_ID());
					o.setField(X_C_AcctSchema_Element.COLUMNNAME_ElementType, ElementType);
					o.setField(X_C_AcctSchema_Element.COLUMNNAME_Name, name);
					o.setField(X_C_AcctSchema_Element.COLUMNNAME_SeqNo, SeqNo);
					o.setField(X_C_AcctSchema_Element.COLUMNNAME_IsMandatory, IsMandatory);
					o.setField(X_C_AcctSchema_Element.COLUMNNAME_IsBalanced, IsBalanced);
					no = o.insert(m_trx.getTrxName());				
					if (no == 1)
						m_info.append(Msg.translate(m_lang, "C_AcctSchema_Element_ID")).append("=").append(name).append("\n");

					/** Default value for mandatory elements: OO and AC */
					if (ElementType.equals(REF_C_AcctSchemaElementType.Organization))
					{
						o = new UpdatePO();
						o.setTablename(X_C_AcctSchema_Element.Table_Name);
						o.setField(Constants.COLUMNNAME_AD_Org_ID, getAD_Org_ID());
						no = o.update(String.format("C_AcctSchema_Element_ID='%s'",C_AcctSchema_Element_ID),m_trx.getTrxName());										
						if (no != 1)
							log.log(Level.SEVERE, "Default Org in AcctSchamaElement NOT updated");
					}
					if (ElementType.equals(REF_C_AcctSchemaElementType.Account))
					{
						o = new UpdatePO();
						o.setTablename(X_C_AcctSchema_Element.Table_Name);
						o.setField(X_C_AcctSchema_Element.COLUMNNAME_C_ElementValue_ID, C_ElementValue_ID);
						o.setField(X_C_AcctSchema_Element.COLUMNNAME_C_Element_ID, C_Element_ID);
						no = o.update(String.format("C_AcctSchema_Element_ID='%s'", C_AcctSchema_Element_ID), m_trx.getTrxName());
						if (no != 1)
							log.log(Level.SEVERE, "Default Account in AcctSchamaElement NOT updated");
					}
				}			
			}

			//  Create GL Accounts			
			m_accountsOK = true;
			UpdatePO o = new UpdatePO();
			o.setTablename(X_C_AcctSchema_GL.Table_Name);
			o.setField(X_C_AcctSchema_GL.COLUMNNAME_C_AcctSchema_ID, m_as.getC_AcctSchema_ID());
			o.setField(X_C_AcctSchema_GL.COLUMNNAME_UseSuspenseBalancing, Constants.YES);
			o.setField(X_C_AcctSchema_GL.COLUMNNAME_SuspenseBalancing_Acct, getAcct("SUSPENSEBALANCING_Acct"));

			o.setField(X_C_AcctSchema_GL.COLUMNNAME_UseSuspenseError, Constants.YES);
			o.setField(X_C_AcctSchema_GL.COLUMNNAME_SuspenseError_Acct, getAcct("SUSPENSEERROR_Acct"));

			o.setField(X_C_AcctSchema_GL.COLUMNNAME_UseCurrencyBalancing, Constants.YES);
			o.setField(X_C_AcctSchema_GL.COLUMNNAME_CurrencyBalancingIncome_Acct, getAcct("CURRENCYBALANCINGINCOME_Acct"));

			o.setField(X_C_AcctSchema_GL.COLUMNNAME_CurrencyBalancingLoss_Acct, getAcct("CURRENCYBALANCINGLOSS_Acct"));
			o.setField(X_C_AcctSchema_GL.COLUMNNAME_RetainedEarning_Acct, getAcct("RETAINEDEARNING_Acct"));
			o.setField(X_C_AcctSchema_GL.COLUMNNAME_IncomeSummary_Acct, getAcct("INCOMESUMMARY_Acct"));
			o.setField(X_C_AcctSchema_GL.COLUMNNAME_IntercompanyDueTo_Acct, getAcct("INTERCOMPANYDUETO_Acct"));
			o.setField(X_C_AcctSchema_GL.COLUMNNAME_IntercompanyDueFrom_Acct, getAcct("INTERCOMPANYDUEFROM_Acct"));
			o.setField(X_C_AcctSchema_GL.COLUMNNAME_PPVOffset_Acct, getAcct("PPVOFFSET_Acct"));
			o.setField(X_C_AcctSchema_GL.COLUMNNAME_CommitmentOffset_Acct, getAcct("CommitmentOffset_Acct"));			
			if (m_accountsOK)				
				no = o.insert(m_trx.getTrxName());
			//no = DB.executeUpdate(sqlCmd.toString(), m_trx.getTrxName());
			else
				no = -1;
			if (no != 1)
			{
				throw new Exception("GL Accounts NOT inserted");
			}
			//			Create Std Accounts
			o = new UpdatePO();
			o.setTablename(X_C_AcctSchema_Default.Table_Name);
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID, m_as.getC_AcctSchema_ID());
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_W_Inventory_Acct, getAcct("W_INVENTORY_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_W_Differences_Acct, getAcct("W_DIFFERENCES_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_W_Revaluation_Acct, getAcct("W_REVALUATION_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_W_InvActualAdjust_Acct, getAcct("W_INVACTUALADJUST_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_P_Revenue_Acct, getAcct("P_REVENUE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_P_Expense_Acct, getAcct("P_EXPENSE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_P_CostAdjustment_Acct, getAcct("P_CostAdjustment_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_P_InventoryClearing_Acct, getAcct("P_InventoryClearing_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_P_Asset_Acct, getAcct("P_ASSET_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_P_COGS_Acct, getAcct("P_COGS_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_P_PurchasePriceVariance_Acct, getAcct("P_PURCHASEPRICEVARIANCE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_P_InvoicePriceVariance_Acct, getAcct("P_INVOICEPRICEVARIANCE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_P_TradeDiscountRec_Acct, getAcct("P_TRADEDISCOUNTREC_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_P_TradeDiscountGrant_Acct, getAcct("P_TRADEDISCOUNTGRANT_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_C_Receivable_Acct, getAcct("C_RECEIVABLE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_C_Receivable_Services_Acct, getAcct("C_RECEIVABLE_SERVICES_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_C_Prepayment_Acct, getAcct("C_PREPAYMENT_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_V_Liability_Acct, getAcct("V_LIABILITY_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_V_Liability_Services_Acct, getAcct("V_LIABILITY_SERVICES_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_V_Prepayment_Acct, getAcct("V_PREPAYMENT_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_PayDiscount_Exp_Acct, getAcct("PAYDISCOUNT_EXP_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_PayDiscount_Rev_Acct, getAcct("PAYDISCOUNT_REV_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_WriteOffGain_Acct, getAcct("WRITEOFFGAIN_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_WriteOffLoss_Acct, getAcct("WRITEOFFLOSS_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_UnrealizedGain_Acct, getAcct("UNREALIZEDGAIN_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_UnrealizedLoss_Acct, getAcct("UNREALIZEDLOSS_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_RealizedGain_Acct, getAcct("REALIZEDGAIN_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_RealizedLoss_Acct, getAcct("REALIZEDLOSS_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_Withholding_Acct, getAcct("WITHHOLDING_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_E_Prepayment_Acct, getAcct("E_PREPAYMENT_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_E_Expense_Acct, getAcct("E_EXPENSE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_PJ_Asset_Acct, getAcct("PJ_ASSET_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_PJ_WIP_Acct, getAcct("PJ_WIP_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_T_Expense_Acct, getAcct("T_EXPENSE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_T_Liability_Acct, getAcct("T_LIABILITY_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_T_Receivables_Acct, getAcct("T_RECEIVABLES_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_T_Due_Acct, getAcct("T_DUE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_T_Credit_Acct, getAcct("T_CREDIT_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_InTransit_Acct, getAcct("B_INTRANSIT_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_Asset_Acct, getAcct("B_ASSET_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_Expense_Acct, getAcct("B_EXPENSE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_InterestRev_Acct, getAcct("B_INTERESTREV_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_InterestExp_Acct, getAcct("B_INTERESTEXP_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_Unidentified_Acct, getAcct("B_UNIDENTIFIED_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_SettlementGain_Acct, getAcct("B_SETTLEMENTGAIN_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_SettlementLoss_Acct, getAcct("B_SETTLEMENTLOSS_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_RevaluationGain_Acct, getAcct("B_REVALUATIONGAIN_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_RevaluationLoss_Acct, getAcct("B_REVALUATIONLOSS_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_PaymentSelect_Acct, getAcct("B_PAYMENTSELECT_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_B_UnallocatedCash_Acct, getAcct("B_UNALLOCATEDCASH_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_Ch_Expense_Acct, getAcct("CH_EXPENSE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_Ch_Revenue_Acct, getAcct("CH_REVENUE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_UnEarnedRevenue_Acct, getAcct("UNEARNEDREVENUE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_NotInvoicedReceivables_Acct, getAcct("NOTINVOICEDRECEIVABLES_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_NotInvoicedRevenue_Acct, getAcct("NOTINVOICEDREVENUE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_NotInvoicedReceipts_Acct, getAcct("NOTINVOICEDRECEIPTS_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_CB_Asset_Acct, getAcct("CB_ASSET_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_CB_CashTransfer_Acct, getAcct("CB_CASHTRANSFER_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_CB_Differences_Acct, getAcct("CB_DIFFERENCES_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_CB_Expense_Acct, getAcct("CB_EXPENSE_Acct"));
			o.setField(X_C_AcctSchema_Default.COLUMNNAME_CB_Receipt_Acct, getAcct("CB_RECEIPT_Acct"));			
			//	Create Std Accounts
			if (m_accountsOK)
				no = o.insert(m_trx.getTrxName());
			else
				no = -1;
			if (no != 1)
			{
				throw new Exception("Default Accounts NOT inserted");
			}

			//  GL Categories
			createGLCategory("Standard",REF_GLCategoryType.Manual, true);
			int GL_None = createGLCategory("None", REF_GLCategoryType.Document, false);
			int GL_GL = createGLCategory("Manual", REF_GLCategoryType.Manual, false);
			int GL_ARI = createGLCategory("AR Invoice", REF_GLCategoryType.Document, false);
			int GL_ARR = createGLCategory("AR Receipt", REF_GLCategoryType.Document, false);
			int GL_MM = createGLCategory("Material Management", REF_GLCategoryType.Document, false);
			int GL_API = createGLCategory("AP Invoice", REF_GLCategoryType.Document, false);
			int GL_APP = createGLCategory("AP Payment", REF_GLCategoryType.Document, false);
			int GL_CASH = createGLCategory("Cash/Payments", REF_GLCategoryType.Document, false);
			int GL_BAT = createGLCategory("Bank Account Transfer", REF_GLCategoryType.Document, false);

			int ii = createDocType("Asiento Diario","Asiento Diario", REF_C_DocTypeDocBaseType.GLJournal, null, 0, 0, 1000, GL_GL);
			if (ii == 0)
			{
				throw new Exception("Document Type not created");
			}		

			ii = createDocType("Asignación", "Asignación", REF_C_DocTypeDocBaseType.PaymentAllocation, null, 0, 0, 490000, GL_CASH);
			ii = createDocType("Asunto del Proyecto","Asunto del Proyecto", REF_C_DocTypeDocBaseType.ProjectIssue, null, 0, 0, 640000, GL_None);
			ii = createDocType("Boleta CxC", "Boleta CxC", REF_C_DocTypeDocBaseType.ARInvoice, null, 0,0,150000, GL_ARI);
			ii = createDocType("Corresponder Factura","Corresponder Factura", REF_C_DocTypeDocBaseType.MatchInvoice, null, 0, 0, 390000, GL_API);
			ii = createDocType("Corresponder OC", "Corresponder OC", REF_C_DocTypeDocBaseType.MatchPO, null, 0, 0, 890000, GL_None);
			ii = createDocType("Cotización","Cotización", REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubType.Quotation, 0, 0, 10000, GL_None); // el original tiene quotation
			ii = createDocType("Devolución de Material (Cliente)","Devolución de Material (Cliente)", REF_C_DocTypeDocBaseType.MaterialReturnOfCustomer, null, 0,0,570000, GL_API);
			ii = createDocType("Devolución de Material (Proveedor)","Devolución de Material (Proveedor)", REF_C_DocTypeDocBaseType.MaterialReturnOfVendor, null, 0,0,570000, GL_MM);
			ii = createDocType("Diario de Efectivo","Diario de Efectivo", REF_C_DocTypeDocBaseType.CashJournal, null, 0, 0, 750000, GL_CASH);
			ii = createDocType("Entrega de Material","Entrega de Material", REF_C_DocTypeDocBaseType.MaterialDelivery, null, 0,0,500000,GL_MM);		
			ii = createDocType("Estado Bancario", "Estado Bancario", REF_C_DocTypeDocBaseType.BankStatement, null, 0, 0, 700000, GL_CASH);
			int DT_I = createDocType("Factura CxC","Factura CxC", REF_C_DocTypeDocBaseType.ARInvoice, null, 0, 0, 100000, GL_None);
			int DT_S = createDocType("Guia de Remisión (Cliente)", "Guia de Remisión (Cliente)", REF_C_DocTypeDocBaseType.MaterialDelivery, null, 0,0,500000, GL_MM);
			ii = createDocType("Inventario Físico","Inventario Físico", REF_C_DocTypeDocBaseType.MaterialPhysicalInventory, null, 0,0,620000, GL_MM);		
			ii = createDocType("Lote de Diario","Lote de Diario", REF_C_DocTypeDocBaseType.GLJournal, null, 0, 0, 100, GL_GL);
			ii = createDocType("Movimiento c/ Confirmación","Movimiento c/ Confirmación", REF_C_DocTypeDocBaseType.MaterialMovement, null, 0,0,610000, GL_MM);
			ii = createDocType("Movimiento Directo","Movimiento Directo", REF_C_DocTypeDocBaseType.MaterialMovement, null, 0,0,610000, GL_MM);
			int DT_IC = createDocType("Nota de Crédito CxC", "Nota de Crédito CxC", REF_C_DocTypeDocBaseType.ARCreditMemo, null, 0,0,170000, GL_ARI);
			ii = createDocType("Nota de Débito CxC","Nota de Débito CxC", REF_C_DocTypeDocBaseType.ARInvoice, null, 0,0,100000, GL_ARI);
			ii = createDocType("Orden de Almacén", "Orden de Almacén", REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubType.WarehouseOrder, 0, 0,70000, GL_None);
			ii = createDocType("Orden de Compra","Orden de Compra", REF_C_DocTypeDocBaseType.PurchaseOrder, null, 0, 0, 800000, GL_None);
			ii = createDocType("Orden de Crédito","Orden de Crédito", REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubType.OnCreditOrder, 0, 0, 60000, GL_None);
			ii = createDocType("Orden Devolución","Orden Devolución", REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubType.ReturnMaterial, 0, 0, 30000, GL_None);
			int DT = createDocType("Orden POS","Orden POS", REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubType.POSOrder, 0,0,80000, GL_None);
			ii = createDocType("Orden Prepagada","Orden Prepagada", REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubType.PrepayOrder, DT_S, DT_I, 30000, GL_None);
			ii = createDocType("Order de Venta","Order de Venta", REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubType.StandardOrder, 0,0,50000,GL_None);
			ii = createDocType("Producción","Producción",REF_C_DocTypeDocBaseType.MaterialProduction, null, 0,0,630000, GL_None);
			ii = createDocType("Propuesta","Propuesta", REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubType.Proposal, 0, 0, 20000, GL_None);
			ii = createDocType("Requisición de Material","Requisición de Material", REF_C_DocTypeDocBaseType.PurchaseRequisition, null, 0,0,900000,GL_None);
			ii = createDocType("Transferencia","Transferencia",REF_C_DocTypeDocBaseType.BankAccountTransfer, null, 0, 0, 760000, GL_BAT);

			ii = createDocType("Egreso","Egreso", REF_C_DocTypeDocBaseType.APPayment, null, 0, 0, 0, GL_APP);
			ii = createDocType("Ingreso","Ingreso", REF_C_DocTypeDocBaseType.ARReceipt, null, 0, 0, 0, GL_ARR);								
			ii = createDocType("Letra de Cambio (Poveedor)","Letra de Cambio (Proveedor)", REF_C_DocTypeDocBaseType.BillOfExchange, null, 0,0,0,GL_None);		
			ii = createDocType("Nota de Crédito CxP", "Nota de Crédito CxP", REF_C_DocTypeDocBaseType.APCreditMemo, null, 0,0,0, GL_API);
			ii = createDocType("Boleta CxP","Boleta CxP",REF_C_DocTypeDocBaseType.APInvoice, null, 0,0,0, GL_API);
			ii = createDocType("Factura CxP","Factura CxP", REF_C_DocTypeDocBaseType.APInvoice, null, 0,0,0, GL_API);
			ii = createDocType("Recibo Servicios CxP", "Recibo Servicios CxP", REF_C_DocTypeDocBaseType.APInvoice, null, 0,0,0, GL_API);
			ii = createDocType("Ticket CxP","Ticket CxP", REF_C_DocTypeDocBaseType.APInvoice, null, 0,0,0, GL_API);		
			ii = createDocType("Nota de Débito CxP","Nota de Débito CxP", REF_C_DocTypeDocBaseType.APInvoice, null, 0,0,0, GL_API);		
			ii = createDocType("Guía de Remisión (Proveedor)","Guía de Remisión (Proveedor)", REF_C_DocTypeDocBaseType.MaterialReceipt, null, 0,0,0, GL_MM);
			ii = createDocType("Recibo de Material","Recibo de Material",REF_C_DocTypeDocBaseType.MaterialReceipt,null,0,0,0,GL_MM);
			ii = createDocType("Recibo Honorarios CxP","Recibo Honorarios CxP", REF_C_DocTypeDocBaseType.PersonalFeeShip, null, 0,0,0, GL_None);
			ii = createDocType("Letra de Cambio (Cliente)","Letra de Cambio (Cliente)", REF_C_DocTypeDocBaseType.BillOfExchange, null, 0,0,0, GL_MM);
			//		//	Base DocumentTypes
			//		int ii = createDocType("GL Journal", Msg.getElement(m_ctx, "GL_Journal_ID"), 
			//			REF_C_DocTypeDocBaseType.GLJournal, null, 0, 0, 1000, GL_GL);
			//		if (ii == 0)
			//		{
			//			String err = "Document Type not created";
			//			m_info.append(err);
			//			m_trx.rollback();
			//			m_trx.close();
			//			return false;
			//		}
			//		createDocType("GL Journal Batch", Msg.getElement(m_ctx, "GL_JournalBatch_ID"), 
			//			REF_C_DocTypeDocBaseType.GLJournal, null, 0, 0, 100, GL_GL);
			//		//	REF_C_DocTypeDocBaseType.GLDocument
			//		//
			//		int DT_I = createDocType("AR Invoice", Msg.getElement(m_ctx, "C_Invoice_ID", true), 
			//			REF_C_DocTypeDocBaseType.ARInvoice, null, 0, 0, 100000, GL_ARI);
			//		int DT_II = createDocType("AR Invoice Indirect", Msg.getElement(m_ctx, "C_Invoice_ID", true), 
			//			REF_C_DocTypeDocBaseType.ARInvoice, null, 0, 0, 150000, GL_ARI);
			//		int DT_IC = createDocType("AR Credit Memo", Msg.getMsg(m_ctx, "CreditMemo"), 
			//			REF_C_DocTypeDocBaseType.ARCreditMemo, null, 0, 0, 170000, GL_ARI);
			//		//	REF_C_DocTypeDocBaseType.ARProFormaInvoice
			//		
			//		createDocType("AP Invoice", Msg.getElement(m_ctx, "C_Invoice_ID", false), 
			//			REF_C_DocTypeDocBaseType.APInvoice, null, 0, 0, 0, GL_API);
			//		createDocType("AP CreditMemo", Msg.getMsg(m_ctx, "CreditMemo"), 
			//			REF_C_DocTypeDocBaseType.APCreditMemo, null, 0, 0, 0, GL_API);
			//		createDocType("Match Invoice", Msg.getElement(m_ctx, "M_MatchInv_ID", false), 
			//			REF_C_DocTypeDocBaseType.MatchInvoice, null, 0, 0, 390000, GL_API);
			//		
			//		createDocType("AR Receipt", Msg.getElement(m_ctx, "C_Payment_ID", true), 
			//			REF_C_DocTypeDocBaseType.ARReceipt, null, 0, 0, 0, GL_ARR);
			//		createDocType("AP Payment", Msg.getElement(m_ctx, "C_Payment_ID", false), 
			//			REF_C_DocTypeDocBaseType.APPayment, null, 0, 0, 0, GL_APP);
			//		createDocType("Allocation", "Allocation", 
			//			REF_C_DocTypeDocBaseType.PaymentAllocation, null, 0, 0, 490000, GL_CASH);
			//
			//		int DT_S  = createDocType("MM Shipment", "Delivery Note", 
			//			REF_C_DocTypeDocBaseType.MaterialDelivery, null, 0, 0, 500000, GL_MM);
			//		int DT_SI = createDocType("MM Shipment Indirect", "Delivery Note", 
			//			REF_C_DocTypeDocBaseType.MaterialDelivery, null, 0, 0, 550000, GL_MM);
			//		
			//		createDocType("MM Receipt", "Vendor Delivery", 
			//			REF_C_DocTypeDocBaseType.MaterialReceipt, null, 0, 0, 0, GL_MM);
			//		
			//		//int DT_RM = createDocType("MM Returns", "Customer Returns", 
			//		//	REF_C_DocTypeDocBaseType.MaterialReceipt, null, 0, 0, 570000, GL_MM);
			//		int DT_RM = createDocType("Custom Returns", "Customer Returns", 
			//			REF_C_DocTypeDocBaseType.MaterialCustomerReturn, null, 0, 0, 570000, GL_MM);
			//		createDocType("Vendor Returns", "Vendor Returns", 
			//			REF_C_DocTypeDocBaseType.MaterialVendorReturn, null, 0, 0, 570000, GL_MM);		
			//		createDocType("Purchase Order", Msg.getElement(m_ctx, "C_Order_ID", false), 
			//			REF_C_DocTypeDocBaseType.PurchaseOrder, null, 0, 0, 800000, GL_None);
			//		createDocType("Match PO", Msg.getElement(m_ctx, "M_MatchPO_ID", false), 
			//			REF_C_DocTypeDocBaseType.MatchPO, null, 0, 0, 890000, GL_None);
			//		createDocType("Purchase Requisition", Msg.getElement(m_ctx, "M_Requisition_ID", false), 
			//			REF_C_DocTypeDocBaseType.PurchaseRequisition, null, 0, 0, 900000, GL_None);
			//
			//		createDocType("Bank Statement", Msg.getElement(m_ctx, "C_BankStatemet_ID", true), 
			//			REF_C_DocTypeDocBaseType.BankStatement, null, 0, 0, 700000, GL_CASH);
			//		createDocType("Cash Journal", Msg.getElement(m_ctx, "C_Cash_ID", true),
			//			REF_C_DocTypeDocBaseType.CashJournal, null, 0, 0, 750000, GL_CASH);
			//		createDocType("Bank Account Transfer", Msg.getElement(m_ctx, "C_Payment_ID", true),
			//			REF_C_DocTypeDocBaseType.BankAccountTransfer, null, 0, 0, 760000, GL_BAT);
			//		
			//		createDocType("Material Movement", Msg.getElement(m_ctx, "M_Movement_ID", false),
			//			REF_C_DocTypeDocBaseType.MaterialMovement, null, 0, 0, 610000, GL_MM);
			//		createDocType("Physical Inventory", Msg.getElement(m_ctx, "M_Inventory_ID", false), 
			//			REF_C_DocTypeDocBaseType.MaterialPhysicalInventory, null, 0, 0, 620000, GL_MM);
			//		createDocType("Material Production", Msg.getElement(m_ctx, "M_Production_ID", false), 
			//			REF_C_DocTypeDocBaseType.MaterialProduction, null, 0, 0, 630000, GL_MM);
			//		createDocType("Project Issue", Msg.getElement(m_ctx, "C_ProjectIssue_ID", false), 
			//			REF_C_DocTypeDocBaseType.ProjectIssue, null, 0, 0, 640000, GL_MM);
			//
			//		//  Order Entry
			//		createDocType("Binding offer", "Quotation", 
			//			REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubTypeSO.Quotation, 
			//			0, 0, 10000, GL_None);
			//		createDocType("Non binding offer", "Proposal", 
			//			REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubTypeSO.Proposal, 
			//			0, 0, 20000, GL_None);
			//		createDocType("Prepay Order", "Prepay Order", 
			//			REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubTypeSO.PrepayOrder, 
			//			DT_S, DT_I, 30000, GL_None);
			//		createDocType("Return Material", "Return Material Authorization", 
			//			REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubTypeSO.ReturnMaterial, 
			//			DT_RM, DT_IC, 30000, GL_None);
			//		createDocType("Standard Order", "Order Confirmation", 
			//			REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubTypeSO.StandardOrder, 
			//			DT_S, DT_I, 50000, GL_None);
			//		createDocType("Credit Order", "Order Confirmation", 
			//			REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubTypeSO.OnCreditOrder, 
			//			DT_SI, DT_I, 60000, GL_None);   //  RE
			//		createDocType("Warehouse Order", "Order Confirmation", 
			//			REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubTypeSO.WarehouseOrder, 
			//			DT_S, DT_I,	70000, GL_None);    //  LS
			//		int DT = createDocType("POS Order", "Order Confirmation", 
			//			REF_C_DocTypeDocBaseType.SalesOrder, REF_C_DocTypeSubTypeSO.POSOrder, 
			//			DT_SI, DT_II, 80000, GL_None);    // Bar

			//	POS As Default for window SO
			createPreference("C_DocTypeTarget_ID", String.valueOf(DT), 143);

			o = new UpdatePO();
			o.setTablename(X_AD_ClientInfo.Table_Name);
			o.setField(X_AD_ClientInfo.COLUMNNAME_C_AcctSchema1_ID, m_as.getC_AcctSchema_ID());
			o.setField(X_AD_ClientInfo.COLUMNNAME_C_Calendar_ID, m_calendar.getC_Calendar_ID());
			no = o.update(String.format("AD_Client_ID=%s",m_client.getAD_Client_ID()), m_trx.getTrxName());
			if (no != 1)
			{
				throw new Exception("ClientInfo not updated");
			}

			//	Validate Completeness
			DocumentTypeVerify.createDocumentTypes(Env.getCtx(), getAD_Client_ID(), null, m_trx.getTrxName());
			DocumentTypeVerify.createPeriodControls(Env.getCtx(), getAD_Client_ID(), null, m_trx.getTrxName());			
		} catch (Exception e) {
			String err = e.getMessage();
			log.log(Level.SEVERE, err);
			m_info.append(err);
			m_trx.rollback();
			m_trx.close();
			return false;			
		}
		//
		log.info("fini");
		return true;
	}   //  createAccounting

	/**
	 *  Get Account ID for key
	 *  @param key key
	 *  @return C_ValidCombination_ID
	 */
	private int getAcct (String key)
	{
		log.fine(key);
		//  Element
		int C_ElementValue_ID = m_nap.getC_ElementValue_ID(key.toUpperCase());
		if (C_ElementValue_ID == 0)
		{
			log.severe("Account not defined: " + key);
			m_accountsOK = false;
			return 0;
		}

		MAccount vc = MAccount.getDefault(m_as, true);	//	optional null
		vc.setAD_Org_ID(0);		//	will be overwritten
		vc.setAccount_ID(C_ElementValue_ID);
		if (!vc.save())
		{
			log.severe("Not Saved - Key=" + key + ", C_ElementValue_ID=" + C_ElementValue_ID);
			m_accountsOK = false;
			return 0;
		}
		int C_ValidCombination_ID = vc.getC_ValidCombination_ID();
		if (C_ValidCombination_ID == 0)
		{
			log.severe("No account - Key=" + key + ", C_ElementValue_ID=" + C_ElementValue_ID);
			m_accountsOK = false;
		}
		return C_ValidCombination_ID;
	}   //  getAcct

	/**
	 *  Create GL Category
	 *  @param Name name
	 *  @param CategoryType category type REF_GLCategoryType.*
	 *  @param isDefault is default value
	 *  @return GL_Category_ID
	 */
	private int createGLCategory (String Name, String CategoryType, boolean isDefault)
	{
		MGLCategory cat = new MGLCategory (Env.getCtx(), 0, m_trx.getTrxName());
		cat.setName(Name);
		cat.setCategoryType(CategoryType);
		cat.setIsDefault(isDefault);
		if (!cat.save())
		{
			log.log(Level.SEVERE, "GL Category NOT created - " + Name);
			return 0;
		}
		//
		return cat.getGL_Category_ID();
	}   //  createGLCategory

	/**
	 *  Create Document Types with Sequence
	 *  @param Name name
	 *  @param PrintName print name
	 *  @param DocBaseType document base type
	 *  @param DocSubType sales order sub type
	 *  @param C_DocTypeShipment_ID shipment doc
	 *  @param C_DocTypeInvoice_ID invoice doc
	 *  @param StartNo start doc no
	 *  @param GL_Category_ID gl category
	 *  @return C_DocType_ID doc type or 0 for error
	 */
	private int createDocType (String Name, String PrintName,
			String DocBaseType, String DocSubType,
			int C_DocTypeShipment_ID, int C_DocTypeInvoice_ID,
			int StartNo, int GL_Category_ID)
	{
		MSequence sequence = null;
		if (StartNo != 0)
		{
			sequence = new MSequence(Env.getCtx(), getAD_Client_ID(), Name, StartNo, m_trx.getTrxName());
			if (!sequence.save())
			{
				log.log(Level.SEVERE, "Sequence NOT created - " + Name);
				return 0;
			}
		}

		MDocType dt = new MDocType (Env.getCtx(), DocBaseType, Name, m_trx.getTrxName());
		if (PrintName != null && PrintName.length() > 0)
			dt.setPrintName(PrintName);	//	Defaults to Name
		if (DocSubType != null)
			dt.setDocSubType(DocSubType);
		if (C_DocTypeShipment_ID != 0)
			dt.setC_DocTypeShipment_ID(C_DocTypeShipment_ID);
		if (C_DocTypeInvoice_ID != 0)
			dt.setC_DocTypeInvoice_ID(C_DocTypeInvoice_ID);
		if (GL_Category_ID != 0)
			dt.setGL_Category_ID(GL_Category_ID);
		if (sequence == null)
			dt.setIsDocNoControlled(false);		
		else
		{
			dt.setIsDocNoControlled(true);
			dt.setDocNoSequence_ID(sequence.getAD_Sequence_ID());
		}
		dt.setIsSOTrx();
		if (!dt.save())
		{
			log.log(Level.SEVERE, "DocType NOT created - " + Name);
			return 0;
		}
		//
		return dt.getC_DocType_ID();
	}   //  createDocType


	/**************************************************************************
	 *  Create Default main entities.
	 *  - Dimensions & BPGroup, Prod Category)
	 *  - Location, Locator, Warehouse
	 *  - PriceList
	 *  - Cashbook, PaymentTerm
	 *  @param C_Country_ID country
	 *  @param City city
	 *  @param C_Region_ID region
	 *  @param C_Currency_ID currency
	 *  @return true if created
	 */
	public boolean createEntities(int C_Country_ID, int C_City_ID, int C_Region_ID, String address, int C_Currency_ID, MBPGroup bpgroup, MBPartner client, MBPartner others)
	{
		try {
			Savepoint savepoint = null;
			if (m_as == null)
			{
				throw new Exception("No AcctountingSChema");
			}
			else
			{
				savepoint = savepoint();							
			}
			log.info("C_Country_ID=" + C_Country_ID 
					+ ", City=" + C_City_ID + ", C_Region_ID=" + C_Region_ID);
			m_info.append("\n----\n");		
			//
			String defaultName = Msg.translate(m_lang, "Standard");
			int no = 0;
			client.set_TrxName(m_trx.getTrxName());			
			client.setAD_Client_ID(m_client.getAD_Client_ID());
			others.set_TrxName(m_trx.getTrxName());
			others.setAD_Client_ID(m_client.getAD_Client_ID());
			//	Create Marketing Channel/Campaign
			int C_Channel_ID = getNextID(getAD_Client_ID(), "C_Channel");
			UpdatePO o = new UpdatePO();
			o.setTablename(X_C_Channel.Table_Name);
			o.setField(X_C_Channel.COLUMNNAME_C_Channel_ID, C_Channel_ID);
			o.setField(X_C_Channel.COLUMNNAME_Name, defaultName);
			no = o.insert(m_trx.getTrxName());
			if (no != 1) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "Channel NOT inserted");				
			}
			savepoint = savepoint();
			int C_Campaign_ID = getNextID(getAD_Client_ID(), "C_Campaign");
			o = new UpdatePO();
			o.setTablename(X_C_Campaign.Table_Name);
			o.setField(X_C_Campaign.COLUMNNAME_C_Campaign_ID, C_Campaign_ID);
			o.setField(X_C_Campaign.COLUMNNAME_C_Channel_ID, C_Channel_ID);
			o.setField(X_C_Campaign.COLUMNNAME_Value, defaultName);
			o.setField(X_C_Campaign.COLUMNNAME_Name, defaultName);
			o.setField(X_C_Campaign.COLUMNNAME_Costs, 0);
			no = o.insert(m_trx.getTrxName());
			if (no == 1) {
				m_info.append(Msg.translate(m_lang, "C_Campaign_ID")).append("=").append(defaultName).append("\n");
			} else {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "Campaign NOT inserted");				
			}
			savepoint = savepoint();
			if (m_hasMCampaign)
			{
				//  Default
				o = new UpdatePO();
				o.setTablename(X_C_AcctSchema_Element.Table_Name);
				o.setField(X_C_AcctSchema_Element.COLUMNNAME_C_Campaign_ID, C_Campaign_ID);
				no = o.update(String.format("C_AcctSchema_ID=%s AND ElementType='MC'", m_as.getC_AcctSchema_ID()), m_trx.getTrxName());
				if (no != 1) {
					m_trx.rollback(savepoint);
					log.log(Level.SEVERE, "AcctSchema ELement Campaign NOT updated");					
				}
				savepoint = savepoint();
			}
			if (!m_trx.commit()) 
				m_trx.rollback(savepoint);				
			savepoint = savepoint();
			//	Create Sales Region
			int C_SalesRegion_ID = getNextID(getAD_Client_ID(), "C_SalesRegion");
			o = new UpdatePO();
			o.setTablename(X_C_SalesRegion.Table_Name);
			o.setClient(m_client.getAD_Client_ID());
			o.setField(X_C_SalesRegion.COLUMNNAME_C_SalesRegion_ID, C_SalesRegion_ID);
			o.setField(X_C_SalesRegion.COLUMNNAME_Value, defaultName);
			o.setField(X_C_SalesRegion.COLUMNNAME_Name, defaultName);
			o.setField(X_C_SalesRegion.COLUMNNAME_IsSummary, Constants.NO);
			no = o.insert(m_trx.getTrxName());
			if (no == 1) {
				m_info.append(Msg.translate(m_lang, "C_SalesRegion_ID")).append("=").append(defaultName).append("\n");				
			} else {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "SalesRegion NOT inserted");				
			}
			savepoint = savepoint();
			if (m_hasSRegion)
			{
				//  Default
				o = new UpdatePO();
				o.setTablename(X_C_AcctSchema_Element.Table_Name);
				o.setField(X_C_AcctSchema_Element.COLUMNNAME_C_SalesRegion_ID, C_SalesRegion_ID);
				no = o.update(String.format("C_AcctSchema_ID=%s AND ElementType='SR'", m_as.getC_AcctSchema_ID()), m_trx.getTrxName());
				if (no != 1) {
					m_trx.rollback(savepoint);
					log.log(Level.SEVERE, "AcctSchema ELement SalesRegion NOT updated");
				}
				savepoint = savepoint();				
			}

			if (!m_trx.commit())
				m_trx.rollback(savepoint);
			savepoint = savepoint();											

			/**
			 *  Business Partner
			 */
			//	Create BPartner
			client.setBPGroup(bpgroup);
			if (!client.save())
				m_trx.rollback(savepoint);
			else {
				m_info.append(Msg.translate(m_lang, "C_BPartner_ID")).append("=").append(client.getName()).append("\n");
			}
			savepoint = savepoint();											
			others.setBPGroup(bpgroup);
			if (!others.save())
				m_trx.rollback(savepoint);
			else {
				m_info.append(Msg.translate(m_lang, "C_BPartner_ID")).append("=").append(others.getName()).append("\n");
			}
			savepoint = savepoint();
			if (!m_trx.commit()) {				
				m_trx.rollback(savepoint);
			}		
			savepoint = savepoint();
			//  Location for Standard BP
			MLocation bpLoc = new MLocation(Env.getCtx(), C_Country_ID, C_Region_ID, C_City_ID, m_trx.getTrxName());
			if (!bpLoc.save())
				m_trx.rollback(savepoint);
			savepoint = savepoint();
			MBPartnerLocation bpl = new MBPartnerLocation(client);
			bpl.setC_Location_ID(bpLoc.getC_Location_ID());
			if (!bpl.save()) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "BP_Location (Standard) NOT inserted");
			}
			savepoint = savepoint();			
			//  Default
			o = new UpdatePO();
			o.setTablename(X_C_AcctSchema_Element.Table_Name);
			o.setField(X_C_AcctSchema_Element.COLUMNNAME_C_BPartner_ID, client.getC_BPartner_ID());
			no = o.update(String.format("C_AcctSchema_ID=%s AND ElementType='BP'", m_as.getC_AcctSchema_ID()), m_trx.getTrxName());
			if (no != 1) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "AcctSchema Element BPartner NOT updated");				
			}
			savepoint = savepoint();			
			createPreference("C_BPartner_ID", String.valueOf(client.getC_BPartner_ID()), 143);

			if (!m_trx.commit()) 			
				m_trx.rollback(savepoint);
			savepoint = savepoint();
			/**
			 *  Product
			 */
			//  Create Product Category
			MProductCategory pc = new MProductCategory(Env.getCtx(), 0, m_trx.getTrxName());
			pc.setValue(defaultName);
			pc.setName(defaultName);
			pc.setIsDefault(true);
			if (pc.save()) {
				m_info.append(Msg.translate(m_lang, "M_Product_Category_ID")).append("=").append(defaultName).append("\n");
			} else {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "Product Category NOT inserted");
			}
			savepoint = savepoint();
			//  UOM (EA)
			//int C_UOM_ID = 100;
			X_C_UOM uom = new Query(Env.getCtx(), X_C_UOM.Table_Name, "Name = 'Each'", m_trx.getTrxName()).first();
			if (uom == null)
			{
				uom = new X_C_UOM(Env.getCtx(), 0, m_trx.getTrxName());
				uom.setName("Each");
				uom.setUOMSymbol("Ea ");
				uom.setX12DE355("EA");
				uom.setStdPrecision(4);
				uom.setCostingPrecision(4);
				uom.setIdentifier("9dbc749c-3c13-50d6-9b68-6f402d2eb2ed");
				uom.save();
			}
			if (!m_trx.commit()) 			
				m_trx.rollback(savepoint);
			savepoint = savepoint();
			int AD_Org_ID = Env.getContextAsInt(Env.getCtx(), "#AD_Org_ID");
			String updateclient = "UPDATE %s SET AD_Client_ID = %s,AD_Org_ID = %s WHERE COALESCE(AD_CLIENT_ID,0) = 0";
			DB.executeUpdate(String.format(updateclient, X_C_Tax.Table_Name, client.getAD_Client_ID(),AD_Org_ID), m_trx.getTrxName());
			DB.executeUpdate(String.format(updateclient, X_C_TaxCategory.Table_Name, client.getAD_Client_ID(),AD_Org_ID), m_trx.getTrxName());
			DB.executeUpdate(String.format(updateclient, X_C_UOM.Table_Name, client.getAD_Client_ID(),AD_Org_ID), m_trx.getTrxName());
			DB.executeUpdate(String.format(updateclient, X_C_BP_Group.Table_Name, client.getAD_Client_ID(),AD_Org_ID), m_trx.getTrxName());
			DB.executeUpdate(String.format(updateclient, "C_UOM_TRL", client.getAD_Client_ID(),AD_Org_ID), m_trx.getTrxName());
			DB.executeUpdate(String.format(updateclient, X_M_Product_Category.Table_Name, client.getAD_Client_ID(), AD_Org_ID), m_trx.getTrxName());
			DB.executeUpdate(String.format(updateclient, X_I_Product.Table_Name, client.getAD_Client_ID(),AD_Org_ID), m_trx.getTrxName());
			DB.executeUpdate(String.format(updateclient, X_I_BPartner.Table_Name, client.getAD_Client_ID(),AD_Org_ID), m_trx.getTrxName());
			DB.executeUpdate(String.format(updateclient, X_I_PriceList.Table_Name,client.getAD_Client_ID(),AD_Org_ID), m_trx.getTrxName());			
			DB.executeUpdate(String.format(updateclient, X_I_Inventory.Table_Name,client.getAD_Client_ID(),AD_Org_ID), m_trx.getTrxName());
			if (!m_trx.commit()) 			
				m_trx.rollback(savepoint);
			savepoint = savepoint();

			//			MTaxCategory taxcategory = new Query(Env.getCtx(), MTaxCategory.Table_Name, "Name = ?", m_trx.getTrxName())
			//			.setParameters("Standard").first();
			//			if (taxcategory == null)
			//			{
			//				taxcategory = new MTaxCategory(Env.getCtx(), 0, m_trx.getTrxName());
			//				taxcategory.setName(defaultName);
			//				taxcategory.setIsDefault(true);
			//				taxcategory.save();
			//			}
			//
			//			//  Tax - Zero Rate
			//			MTax tax = new MTax (m_ctx, "Standard", Env.ZERO, taxcategory.getC_TaxCategory_ID(), m_trx.getTrxName());
			//			tax.setIsDefault(true);
			//			if (tax.save()) {
			//				savepoint = savepoint();
			//				m_info.append(Msg.translate(m_lang, "C_Tax_ID"))
			//				.append("=").append(tax.getName()).append("\n");
			//			} else {
			//				m_trx.rollback(savepoint);
			//				log.log(Level.SEVERE, "Tax NOT inserted");
			//			}
			//			if (!m_trx.commit())			
			//				m_trx.rollback(savepoint);
			//			savepoint = savepoint();
			MTaxCategory taxcategory = new Query(Env.getCtx(), MTaxCategory.Table_Name, "IsDefault = ?", null)
			.setParameters(Constants.YES).first();
			//	Create Product
			MProduct product = new MProduct (Env.getCtx(), 0, m_trx.getTrxName());
			product.setValue(defaultName);
			product.setName(defaultName);
			//product.setC_UOM_ID(C_UOM_ID);
			product.setC_UOM_ID(uom.getC_UOM_ID());
			product.setM_Product_Category_ID(pc.getM_Product_Category_ID());
			product.setC_TaxCategory_ID(taxcategory.getC_TaxCategory_ID());
			if (product.save()) {				
				m_info.append(Msg.translate(m_lang, "M_Product_ID")).append("=").append(defaultName).append("\n");
			} else {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "Product NOT inserted");
			}
			savepoint = savepoint();
			//  Default
			if (!m_trx.commit()) 						
				m_trx.rollback(savepoint);
			savepoint = savepoint();
			o = new UpdatePO();
			o.setTablename(X_C_AcctSchema_Element.Table_Name);
			o.setField(X_C_AcctSchema_Element.COLUMNNAME_M_Product_ID, product.getM_Product_ID());
			no = o.update(String.format("C_AcctSchema_ID=%s AND ElementType='PR'", m_as.getC_AcctSchema_ID()), m_trx.getTrxName());		
			if (no != 1) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "AcctSchema Element Product NOT updated");
			}
			savepoint = savepoint();
			if (!m_trx.commit())			
				m_trx.rollback(savepoint);
			savepoint = savepoint();
			/**
			 *  Location, Warehouse, Locator
			 */
			//  Location (Company)
			MLocation loc = new MLocation(Env.getCtx(), C_Country_ID, C_Region_ID, C_City_ID, m_trx.getTrxName());
			loc.setAddress1(address);
			loc.save();
			o = new UpdatePO();
			o.setTablename(X_AD_OrgInfo.Table_Name);
			o.setField(X_AD_OrgInfo.COLUMNNAME_C_Location_ID, loc.getC_Location_ID());
			o.setField(X_AD_OrgInfo.COLUMNNAME_C_BPartner_ID, client.getC_BPartner_ID());
			no = o.update(String.format("AD_Org_ID=%s", getAD_Org_ID()), m_trx.getTrxName());		
			if (no != 1) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "Location NOT inserted");
			}
			savepoint = savepoint();
			createPreference("C_Country_ID", String.valueOf(C_Country_ID), 0);

			if (!m_trx.commit())			
				m_trx.rollback(savepoint);
			savepoint = savepoint();			
			//  Default Warehouse
			MWarehouse wh = new MWarehouse(Env.getCtx(), 0, m_trx.getTrxName());
			wh.setValue(defaultName);
			wh.setName(defaultName);
			wh.setC_Location_ID(loc.getC_Location_ID());
			if (!wh.save()) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "Warehouse NOT inserted");
			}
			savepoint = savepoint();
			if (!m_trx.commit())			
				m_trx.rollback(savepoint);
			savepoint = savepoint();

			//   Locator
			MLocator locator = new MLocator(wh, defaultName);
			locator.setIsDefault(true);
			if (!locator.save()) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "Locator NOT inserted");
			}
			savepoint = savepoint();			
			if (!m_trx.commit())
				m_trx.rollback(savepoint);			
			savepoint = savepoint();
			// Update ClientInfo
			o = new UpdatePO();
			o.setTablename(X_AD_ClientInfo.Table_Name);
			o.setField(X_AD_ClientInfo.COLUMNNAME_C_BPartnerCashTrx_ID, others.getC_BPartner_ID());
			o.setField(X_AD_ClientInfo.COLUMNNAME_M_ProductFreight_ID, product.getM_Product_ID());		
			no = o.update(String.format("AD_Client_ID=%s", getAD_Client_ID()), m_trx.getTrxName());				
			if (no != 1)
			{
				throw new Exception("ClientInfo not updated");
			}
			if (!m_trx.commit())
				m_trx.rollback(savepoint);
			savepoint = savepoint();

			/**
			 *  Other
			 */
			//  PriceList
			MPriceList pl = new MPriceList(Env.getCtx(), 0, m_trx.getTrxName());
			pl.setName(defaultName);
			pl.setC_Currency_ID(C_Currency_ID);
			pl.setIsDefault(true);
			if (!pl.save()) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "PriceList NOT inserted");
			}
			savepoint = savepoint();			
			//  Price List
			MDiscountSchema ds = new MDiscountSchema(Env.getCtx(), 0, m_trx.getTrxName());
			ds.setName(defaultName);
			ds.setDiscountType(REF_M_DiscountType.Pricelist);
			if (!ds.save()) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "DiscountSchema NOT inserted");
			} 
			savepoint = savepoint();

			//  PriceList Version
			MPriceListVersion plv = new MPriceListVersion(pl);
			plv.setName();
			plv.setM_DiscountSchema_ID(ds.getM_DiscountSchema_ID());
			if (!plv.save()) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "PriceList_Version NOT inserted");
			}
			savepoint = savepoint();			
			//  ProductPrice
			MProductPrice pp = new MProductPrice(plv, product.getM_Product_ID(), 
					Env.ONE, Env.ONE, Env.ONE);
			if (!pp.save()) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "ProductPrice NOT inserted");
			} 
			savepoint = savepoint();		

			if (!m_trx.commit())
				m_trx.rollback(savepoint);			
			savepoint = savepoint();
			//	Create Sales Rep for Client-User
			MBPartner bpCU = new MBPartner (Env.getCtx(), 0, m_trx.getTrxName());
			bpCU.setValue(AD_User_U_Name);
			bpCU.setName(AD_User_U_Name);
			bpCU.setBPGroup(bpgroup);
			//bpCU.setC_BP_DocTypeI(REF_C_BP_DocTypeI.Other);
			bpCU.setIsEmployee(true);
			bpCU.setIsSalesRep(true);
			if (bpCU.save()) {				
				m_info.append(Msg.translate(m_lang, "SalesRep_ID")).append("=").append(AD_User_U_Name).append("\n");
			} else {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "SalesRep (User) NOT inserted");
			}
			savepoint = savepoint();
			//  Location for Client-User
			MLocation bpLocCU = new MLocation(Env.getCtx(), C_Country_ID, C_Region_ID, C_City_ID, m_trx.getTrxName());
			bpLocCU.save();
			MBPartnerLocation bplCU = new MBPartnerLocation(bpCU);
			bplCU.setC_Location_ID(bpLocCU.getC_Location_ID());
			if (!bplCU.save()) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "BP_Location (User) NOT inserted");				
			}
			savepoint = savepoint();
			//  Update User
			o = new UpdatePO();
			o.setTablename(X_AD_User.Table_Name);
			o.setField(X_AD_User.COLUMNNAME_C_BPartner_ID, bpCU.getC_BPartner_ID());			
			no = o.update(String.format("AD_User_ID=%s", AD_User_U_ID), m_trx.getTrxName());				
			if (no != 1) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "User of SalesRep (User) NOT updated");							
			}
			savepoint = savepoint();			
			if (!m_trx.commit())
				m_trx.rollback(savepoint);			
			savepoint = savepoint();
			//	Create Sales Rep for Client-Admin
			MBPartner bpCA = new MBPartner (Env.getCtx(), 0, m_trx.getTrxName());
			bpCA.setValue(AD_User_Name);
			bpCA.setName(AD_User_Name);
			bpCA.setBPGroup(bpgroup);
			//bpCA.setC_BP_DocTypeI(REF_C_BP_DocTypeI.Other);
			bpCA.setIsEmployee(true);
			bpCA.setIsSalesRep(true);
			if (bpCA.save()) {				
				m_info.append(Msg.translate(m_lang, "SalesRep_ID")).append("=").append(AD_User_Name).append("\n");
			} else {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "SalesRep (Admin) NOT inserted");
			}
			savepoint = savepoint();
			//  Location for Client-Admin
			MLocation bpLocCA = new MLocation(Env.getCtx(), C_Country_ID, C_Region_ID, C_City_ID, m_trx.getTrxName());
			bpLocCA.save();
			MBPartnerLocation bplCA = new MBPartnerLocation(bpCA);
			bplCA.setC_Location_ID(bpLocCA.getC_Location_ID());
			if (!bplCA.save()) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "BP_Location (Admin) NOT inserted");
			}
			savepoint = savepoint();			
			//  Update User
			o = new UpdatePO();
			o.setTablename(X_AD_User.Table_Name);
			o.setField(X_AD_User.COLUMNNAME_C_BPartner_ID, bpCA.getC_BPartner_ID());			
			no = o.update(String.format("AD_User_ID=%s", AD_User_U_ID), m_trx.getTrxName());						
			if (no != 1) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "User of SalesRep (Admin) NOT updated");
			}
			savepoint = savepoint();
			if (!m_trx.commit())
				m_trx.rollback(savepoint);			
			savepoint = savepoint();
			//		//  Payment Term
			//		int C_PaymentTerm_ID = getNextID(getAD_Client_ID(), "C_PaymentTerm");
			//		sqlCmd = new StringBuffer ("INSERT INTO C_PaymentTerm ");
			//		sqlCmd.append("(C_PaymentTerm_ID,").append(m_stdColumns).append(",");
			//		sqlCmd.append("Value,Name,NetDays,GraceDays,DiscountDays,Discount,DiscountDays2,Discount2,IsDefault) VALUES (");
			//		sqlCmd.append(C_PaymentTerm_ID).append(",").append(m_stdValues).append(",");
			//		sqlCmd.append("'Immediate','Immediate',0,0,0,0,0,0,'Y')");
			//		no = DB.executeUpdate(sqlCmd.toString(), m_trx.getTrxName());
			//		if (no != 1)
			//			log.log(Level.SEVERE, "PaymentTerm NOT inserted");

			MPaymentTerm pt = new MPaymentTerm(Env.getCtx(), 0, m_trx.getTrxName());
			pt.setValue("Immediate");
			pt.setName("Immediate");
			pt.setNetDays(0);
			pt.setGraceDays(0);
			pt.setDiscountDays(0);
			pt.setDiscount(Env.ZERO);
			pt.setDiscountDays2(0);
			pt.setDiscount2(Env.ZERO);
			pt.setIsDefault(true);
			pt.save();

			if (!m_trx.commit()) 
				m_trx.rollback(savepoint);
			savepoint = savepoint();
			// Project Cycle
			C_Cycle_ID = getNextID(getAD_Client_ID(), "C_Cycle");
			o = new UpdatePO();
			o.setTablename(X_C_Cycle.Table_Name);
			o.setField(X_C_Cycle.COLUMNNAME_C_Cycle_ID, C_Cycle_ID);
			o.setField(X_C_Cycle.COLUMNNAME_Name, defaultName);
			o.setField(X_C_Cycle.COLUMNNAME_C_Currency_ID, C_Currency_ID);
			no = o.insert(m_trx.getTrxName());					
			if (no != 1) {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "Cycle NOT inserted");			
			}
			savepoint = savepoint();

			if (!m_trx.commit())
				m_trx.rollback(savepoint);			
			savepoint = savepoint();
			/**
			 *  Organization level data	===========================================
			 */

			//	Create Default Project
			int C_Project_ID = getNextID(getAD_Client_ID(), "C_Project");
			o = new UpdatePO();
			o.setTablename(X_C_Project.Table_Name);
			o.setField(X_C_Project.COLUMNNAME_C_Project_ID, C_Project_ID);
			o.setField(X_C_Project.COLUMNNAME_Name, defaultName);
			o.setField(X_C_Project.COLUMNNAME_Value, defaultName);
			o.setField(X_C_Project.COLUMNNAME_C_Currency_ID, C_Currency_ID);
			no = o.insert(m_trx.getTrxName());							
			if (no == 1) {
				m_info.append(Msg.translate(m_lang, "C_Project_ID")).append("=").append(defaultName).append("\n");				
			} else {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "Project NOT inserted");				
			}
			savepoint = savepoint();
			//  Default Project
			if (m_hasProject)
			{
				o = new UpdatePO();
				o.setTablename(X_C_AcctSchema_Element.Table_Name);
				o.setField(X_C_AcctSchema_Element.COLUMNNAME_C_Project_ID, C_Project_ID);
				no = o.update(String.format("C_AcctSchema_ID=%s AND ElementType='PJ'", m_as.getC_AcctSchema_ID()), m_trx.getTrxName());					
				if (no != 1) {
					m_trx.rollback(savepoint);
					log.log(Level.SEVERE, "AcctSchema ELement Project NOT updated");
				}
				savepoint = savepoint();
			}

			if (!m_trx.commit())
				m_trx.rollback(savepoint);			
			savepoint = savepoint();

			//  CashBook
			MCashBook cb = new MCashBook(Env.getCtx(), 0, m_trx.getTrxName());
			cb.setName(defaultName);
			cb.setC_Currency_ID(C_Currency_ID);
			if (cb.save()) {				
				m_info.append(Msg.translate(m_lang, "C_CashBook_ID")).append("=").append(defaultName).append("\n");			
			} else {
				m_trx.rollback(savepoint);
				log.log(Level.SEVERE, "CashBook NOT inserted");
			}
			savepoint = savepoint();
			//
			if (!m_trx.commit())	
				m_trx.rollback(savepoint);			
			m_trx.close();
			importProducts(client);
			importBPartners(client);
			importPriceList(client);
			importInventory(client);
			log.info("finish");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			String err = e.getMessage();
			//log.severe ("No AcctountingSChema");
			log.severe(err);
			m_trx.rollback();
			m_trx.close();
			return false;
		}
	}   //  createEntities

	private void importPriceList(MBPartner client) {
		MProcess proc = new Query(Env.getCtx(), MProcess.Table_Name, "classname = ?", null)
		.setParameters("org.compiere.process.ImportPriceList").first();

		MPInstance instance = new MPInstance(Env.getCtx(), proc.getAD_Process_ID(), 0);
		if (instance.save()) {
			ProcessInfo pinfo = new ProcessInfo("ImportPriceList", proc.getAD_Process_ID());
			pinfo.setAD_PInstance_ID(instance.getAD_PInstance_ID());
			MPInstancePara ip = new MPInstancePara(instance, 10);
			ip.setParameter(Constants.COLUMNNAME_AD_Client_ID, (Integer) client.getAD_Client_ID());
			ip.save();
			ProcessCtl worker = new ProcessCtl(null, 0, pinfo, null);
			worker.run(); // complete task in unlockUI
			ProcessInfoUtil.setLogFromDB(pinfo);
			String info = pinfo.getSummary();
		}
	}

	private void importBPartners(MBPartner client) {
		MProcess proc = new Query(Env.getCtx(), MProcess.Table_Name, "classname = ?", null)
		.setParameters("org.compiere.process.ImportBPartner").first();

		MPInstance instance = new MPInstance(Env.getCtx(), proc.getAD_Process_ID(), 0);
		if (instance.save()) {
			ProcessInfo pinfo = new ProcessInfo("ImportBPartner", proc.getAD_Process_ID());
			pinfo.setAD_PInstance_ID(instance.getAD_PInstance_ID());
			MPInstancePara ip = new MPInstancePara(instance, 10);
			ip.setParameter(Constants.COLUMNNAME_AD_Client_ID, (Integer) client.getAD_Client_ID());
			ip.save();
			ProcessCtl worker = new ProcessCtl(null, 0, pinfo, null);
			worker.run();     //  complete tasks in unlockUI 
			ProcessInfoUtil.setLogFromDB(pinfo);
			String info = pinfo.getSummary();			
		}
	}

	private void importProducts(MBPartner client) {
		MProcess proc = new Query(Env.getCtx(), MProcess.Table_Name, "classname = ?", null)
		.setParameters("org.compiere.process.ImportProduct").first();

		MPInstance instance = new MPInstance(Env.getCtx(), proc.getAD_Process_ID(), 0);
		if (instance.save())
		{
			ProcessInfo pinfo = new ProcessInfo ("ImporProduct", proc.getAD_Process_ID());
			pinfo.setAD_PInstance_ID (instance.getAD_PInstance_ID());
			//pinfo.setRecord_ID(ids[i]);
			MPInstancePara ip = new MPInstancePara(instance, 10);
			ip.setParameter(Constants.COLUMNNAME_AD_Client_ID, (Integer) client.getAD_Client_ID());
			ip.save();
			ProcessCtl worker = new ProcessCtl(null, 0, pinfo, null);
			worker.run();     //  complete tasks in unlockUI / generateShipments_complete
			ProcessInfoUtil.setLogFromDB(pinfo);
			String info = pinfo.getSummary();
		}					
	}

	private void importInventory(MBPartner client) {
		MProcess proc = new Query(Env.getCtx(), MProcess.Table_Name, "classname = ?", null)
		.setParameters("org.compiere.process.ImportInventory").first();

		MPInstance instance = new MPInstance(Env.getCtx(), proc.getAD_Process_ID(), 0);
		if (instance.save()) {
			ProcessInfo pinfo = new ProcessInfo ("ImportInventory", proc.getAD_Process_ID());
			pinfo.setAD_PInstance_ID(instance.getAD_PInstance_ID());
			MPInstancePara ip = new MPInstancePara(instance, 10);
			ip.setParameter(Constants.COLUMNNAME_AD_Client_ID, (Integer) client.getAD_Client_ID());
			ip.save();
			ProcessCtl worker = new ProcessCtl(null, 0, pinfo, null);
			worker.run();
			ProcessInfoUtil.setLogFromDB(pinfo);
			String info = pinfo.getSummary();
		}
	}


	private Savepoint savepoint() {
		Savepoint savepoint = null;
		try {
			savepoint = m_trx.setSavepoint(null);
		} catch (Exception e) {
			m_trx.rollback();
			try {
				savepoint = m_trx.setSavepoint(null);
			} catch (SQLException e1) {
			}
		}
		return savepoint;
	}



	/**
	 *  Create Preference
	 *  @param Attribute attribute
	 *  @param Value value
	 *  @param AD_Window_ID window
	 */
	private void createPreference (String Attribute, String Value, int AD_Window_ID)
	{
		int AD_Preference_ID = getNextID(getAD_Client_ID(), "AD_Preference");
		UpdatePO o = new UpdatePO();
		o.setTablename(X_AD_Preference.Table_Name);
		o.setField(X_AD_Preference.COLUMNNAME_AD_Preference_ID, AD_Preference_ID);
		o.setField(X_AD_Preference.COLUMNNAME_Attribute, Attribute);
		o.setField(X_AD_Preference.COLUMNNAME_Value, Value);
		if (AD_Window_ID > 0)
			o.setField(X_AD_Preference.COLUMNNAME_AD_Window_ID, AD_Window_ID);
		int no = o.insert(m_trx.getTrxName());
		if (no != 1)
			log.log(Level.SEVERE, "Preference NOT inserted - " + Attribute);
	}   //  createPreference


	/**************************************************************************
	 * 	Get Next ID
	 * 	@param AD_Client_ID client
	 * 	@param TableName table name
	 * 	@return id
	 */
	private int getNextID (int AD_Client_ID, String TableName)
	{
		//	TODO: Exception 
		return DB.getNextID (AD_Client_ID, TableName, m_trx.getTrxName());
	}	//	getNextID

	/**
	 *  Get Client
	 *  @return AD_Client_ID
	 */
	public int getAD_Client_ID()
	{
		return m_client.getAD_Client_ID();
	}
	/**
	 * 	Get AD_Org_ID
	 *	@return AD_Org_ID
	 */
	public int getAD_Org_ID()
	{
		return m_org.getAD_Org_ID();
	}
	/**
	 * 	Get AD_User_ID
	 *	@return AD_User_ID
	 */
	public int getAD_User_ID()
	{
		return AD_User_ID;
	}
	/**
	 * 	Get Info
	 *	@return Info
	 */
	public String getInfo()
	{
		return m_info.toString();
	}



	public void createCertificate(String pwd) {
		String security = (String) Env.getMachine().getProperties().get(Constants.KEYSTORE);
		if (security == null || security.compareTo(Ini.getXendraFolder(Constants.KEYSTORE)) != 0) {
			security = Ini.getXendraFolder(Constants.KEYSTORE);
			HashMap props = Env.getMachine().getProperties();
			props.put(Constants.KEYSTORE, security);
			Env.getMachine().setProperties(props);
			Env.getMachine().save();        	
		}
		File secFolder = new File(security);
		if (!secFolder.exists())
			secFolder.mkdir();
		secFolder = new File(String.format("%s%s%s", secFolder, File.separator, Constants.KEYSTORE_NAME));
		try {
			//KeyStoreType keyStoreType = KeyStoreType.JKS;
			//KeyStore newKeyStore = KeyStoreUtil.create(keyStoreType);
		} catch (Exception e) {
			
		}
	}
}   //  MSetup
