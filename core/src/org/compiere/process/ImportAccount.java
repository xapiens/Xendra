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

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MElementValue;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_TreeNode;
import org.compiere.model.persistence.X_C_AcctSchema_Element;
import org.compiere.model.persistence.X_C_ValidCombination;
import org.compiere.model.persistence.X_Fact_Acct;
import org.compiere.model.persistence.X_I_ElementValue;
import org.compiere.util.*;

import org.xendra.Constants;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
import org.xendra.util.UpdatePO;

/**
 *	Import Accounts from I_ElementValue
 *
 * 	@author 	Jorg Janke
 * 	@version 	$Id: ImportAccount.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="Import_Account",
name="Import Accounts",
description="Import Natural Accounts",
help="Import accounts and their hierarchies and optional update the default accounts. Updating the Default Accounts changes the natural account segment of the used account, e.g. account 01-240 becomes 01-300).  If you create a new combination, the old account (e.g. 01-240) will remain, otherwise replaced. If you select this, make sure that you not multiple default accounts using one natural account and HAVE A BACKUP !!<p>The Parameters are default values for null import record values, they do not overwrite any data.",
Identifier="08880a86-5796-a110-2c7a-3a4647d197f2",
classname="org.compiere.process.ImportAccount",
updated="2015-06-20 10:10:12")
public class ImportAccount extends SvrProcess
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
			                Identifier="830ab40b-f306-4ae5-2fd5-c8d55abd4062")	
	private int				m_AD_Client_ID = 0;
	/** Default Element					*/
@XendraProcessParameter(Name="Element",
                ColumnName="C_Element_ID",
                Description="Accounting Element",
                Help="The Account Element uniquely identifies an Account Type.  These are commonly known as a Chart of Accounts.",
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
                Identifier="77a0bcf4-4006-e694-bae7-622548687f67")
	private int				m_C_Element_ID = 0;
	/**	Update Default Accounts			*/
    @XendraProcessParameter(Name="Update Default Accounts",
                ColumnName="UpdateDefaultAccounts",
                Description="Update Default Accounts",
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
                Identifier="0936b730-131b-c77a-d669-2f1f9eacbf7c")
	private boolean			m_updateDefaultAccounts = false;
	/** Create New Combination			*/
@XendraProcessParameter(Name="Create New Combination",
                ColumnName="CreateNewCombination",
                Description="Create New Account Combination",
                Help="",
                AD_Reference_ID=DisplayType.YesNo,
                SeqNo=40,
                ReferenceValueID="",
                ValRuleID="",
                FieldLength=0,
                IsMandatory=false,
                IsRange=false,
                DefaultValue="Y",
                DefaultValue2="",
                vFormat="",
                valueMin="",
                valueMax="",
                DisplayLogic="",
                ReadOnlyLogic="",
                Identifier="81ad29e4-139b-acf8-eff9-8299e29e3452")
	private boolean			m_createNewCombination = true;

	/**	Delete old Imported				*/
    @XendraProcessParameter(Name="Delete old imported records",
                ColumnName="DeleteOldImported",
                Description="Before processing delete old imported records in the import table",
                Help="",
                AD_Reference_ID=DisplayType.YesNo,
                SeqNo=50,
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
                Identifier="034bc8ac-b829-d00b-c2cc-ba13248ce31c")
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
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Client_ID"))
				m_AD_Client_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("C_Element_ID"))
				m_C_Element_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("UpdateDefaultAccounts"))
				m_updateDefaultAccounts = "Y".equals(para[i].getParameter());
			else if (name.equals("CreateNewCombination"))
				m_createNewCombination = "Y".equals(para[i].getParameter());
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
		UpdatePO o = new UpdatePO();
		int no = 0;
		String clientCheck = " AND AD_Client_ID=" + m_AD_Client_ID;

		//	****	Prepare	****

		//	Delete Old Imported
		if (m_deleteOldImported)
		{
			o.setTablename(X_I_ElementValue.Table_Name);
			o.setClient(m_AD_Client_ID);
			no = o.delete("I_IsImported='Y'", get_TrxName());
			System.out.println("Delete Old Impored =" + no);
		}
		
		//	Set Client, Org, IsActive, Created/Updated
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setFieldExpr(Constants.COLUMNNAME_AD_Org_ID, "COALESCE (AD_Org_ID, 0)");		
		o.setFieldExpr(Constants.COLUMNNAME_IsActive, "COALESCE (IsActive, 'Y')");
		o.setFieldExpr(Constants.COLUMNNAME_Created, "COALESCE (Created, CURRENT_TIMESTAMP)");
		o.setFieldExpr(Constants.COLUMNNAME_CreatedBy, "COALESCE (CreatedBy, 0)");
		o.setFieldExpr(Constants.COLUMNNAME_Updated, "COALESCE (Created, CURRENT_TIMESTAMP)");
		o.setFieldExpr(Constants.COLUMNNAME_UpdatedBy, "COALESCE (UpdatedBy, 0)");
		o.setField(X_I_ElementValue.COLUMNNAME_I_ErrorMsg, "");
		o.setField(X_I_ElementValue.COLUMNNAME_I_IsImported, Constants.NO);
		no = o.update("I_IsImported<>'Y' OR I_IsImported IS NULL", get_TrxName());
		System.out.println("Reset=" + no);

		//	****	Prepare	****

		//	Set Element
		if (m_C_Element_ID != 0)
		{
			o = new UpdatePO();
			o.setTablename(X_I_ElementValue.Table_Name);
			o.setClient(m_AD_Client_ID);
			o.setFieldExpr(X_I_ElementValue.COLUMNNAME_ElementName, String.format("(SELECT Name FROM C_Element WHERE C_Element_ID=%s)",m_C_Element_ID));			
			no = o.update("ElementName IS NULL AND C_Element_ID IS NULL", get_TrxName());
			System.out.println("Set Element Default=" + no);
		}
		//
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");
		o.setFieldExpr(X_I_ElementValue.COLUMNNAME_C_Element_ID, "(SELECT C_Element_ID FROM C_Element e WHERE i.ElementName=e.Name AND i.AD_Client_ID=e.AD_Client_ID)");
		no = o.update("C_Element_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		System.out.println("Set Element=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_ElementValue.COLUMNNAME_I_IsImported, "E");
		o.setField(X_I_ElementValue.COLUMNNAME_I_ErrorMsg, "ERR=Invalid Element");
		no = o.update("C_Element_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		log.config("Invalid Element=" + no);

		//	Set Column
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");
		o.setFieldExpr(X_I_ElementValue.COLUMNNAME_AD_Column_ID, "(SELECT AD_Column_ID FROM AD_Column c WHERE UPPER(i.Default_Account)=UPPER(c.ColumnName) AND c.AD_Table_ID IN (315,266) AND AD_Reference_ID=25)");
		no = o.update("Default_Account IS NOT NULL AND AD_Column_ID IS NULL AND I_IsImported<>'Y'", get_TrxName());
		System.out.println("Set Column=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_ElementValue.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_ElementValue.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Invalid Column, '");
		no = o.update("AD_Column_ID IS NULL AND Default_Account IS NOT NULL AND UPPER(Default_Account)<>'DEFAULT_ACCT'	AND	LENGTH(TRIM(DEFAULT_ACCOUNT))>0 AND I_IsImported<>'Y'", get_TrxName());		 
		log.config("Invalid Column=" + no);

		//	Set Post* Defaults (ignore errors)
		String[] yColumns = new String[] {"PostActual", "PostBudget", "PostStatistical", "PostEncumbrance"};
		for (int i = 0; i < yColumns.length; i++)
		{
			o = new UpdatePO();
			o.setTablename(X_I_ElementValue.Table_Name);
			o.setClient(m_AD_Client_ID);
			o.setField(yColumns[i], Constants.YES);
			no = o.update(String.format("%s IS NULL OR %s NOT IN ('Y','N') AND I_IsImported<>'Y'", yColumns[i],yColumns[i]),get_TrxName());
			System.out.println("Set " + yColumns[i] + " Default=" + no);
		}
		//	Summary
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_ElementValue.COLUMNNAME_IsSummary, Constants.NO);
		no = o.update("IsSummary IS NULL OR IsSummary NOT IN ('Y','N') AND I_IsImported<>'Y'", get_TrxName());
		System.out.println("Set IsSummary Default=" + no);

		//	Doc Controlled
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setFieldExpr(X_I_ElementValue.COLUMNNAME_IsDocControlled, "CASE WHEN AD_Column_ID IS NOT NULL THEN 'Y' ELSE 'N' END");
		no = o.update(" IsDocControlled IS NULL OR IsDocControlled NOT IN ('Y','N') AND I_IsImported='N'", get_TrxName());
		System.out.println("Set IsDocumentControlled Default=" + no);

		//	Check Account Type A (E) L M O R
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_ElementValue.COLUMNNAME_AccountType, "E");
		no = o.update("AccountType IS NULL AND I_IsImported<>'Y'", get_TrxName());
		System.out.println("Set AccountType Default=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_ElementValue.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_ElementValue.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Invalid AccountType,'");
		no = o.update("AccountType NOT IN ('A','E','L','M','O','R') AND I_IsImported<>'Y'", get_TrxName());		
		log.config("Invalid AccountType=" + no);

		//	Check Account Sign (N) C B
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_ElementValue.COLUMNNAME_AccountSign, Constants.NO);
		no = o.update("AccountSign IS NULL AND I_IsImported<>'Y'", get_TrxName());
		System.out.println("Set AccountSign Default=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_ElementValue.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_ElementValue.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=Invalid AccountSign, '");
		no = o.update("AccountSign NOT IN ('N','C','D') AND I_IsImported<>'Y'", get_TrxName());
		log.config("Invalid AccountSign=" + no);

		//	No Value
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_ElementValue.COLUMNNAME_I_IsImported, "E");
		o.setFieldExpr(X_I_ElementValue.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'ERR=No Key, '");
		no = o.update("(Value IS NULL OR Value='') AND I_IsImported<>'Y'", get_TrxName());
		log.config("Invalid Key=" + no);

		//	****	Update ElementValue from existing
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setAlias("i");
		String fieldexpr = "(SELECT C_ElementValue_ID FROM C_ElementValue ev INNER JOIN C_Element e ON (ev.C_Element_ID=e.C_Element_ID) WHERE i.C_Element_ID=e.C_Element_ID AND i.AD_Client_ID=e.AD_Client_ID  AND i.Value=ev.Value) "; 
		o.setFieldExpr(X_I_ElementValue.COLUMNNAME_C_ElementValue_ID, fieldexpr); 
		no = o.update("C_ElementValue_ID IS NULL AND I_IsImported='N'", get_TrxName());
		System.out.println("Found ElementValue=" + no);

		commit();

		//	-------------------------------------------------------------------
		int noInsert = 0;
		int noUpdate = 0;
		
		//		Go through Records
		List<X_I_ElementValue> impEValues = new Query(Env.getCtx(), X_I_ElementValue.Table_Name, 
					String.format("I_IsImported='N' AND AD_Client_ID = %s",m_AD_Client_ID), get_TrxName()).list();
		for (X_I_ElementValue impEV:impEValues) {
			int C_ElementValue_ID = impEV.getC_ElementValue_ID();
			int I_ElementValue_ID = impEV.getI_ElementValue_ID();
			if (C_ElementValue_ID == 0)		//	New
			{
				MElementValue oimpEV = new Query(Env.getCtx(), MElementValue.Table_Name,"value=?",get_TrxName())
					.setParameters(impEV.getValue()).first();
				if (oimpEV != null)
				{
					System.out.println("X");
					C_ElementValue_ID = oimpEV.getC_ElementValue_ID();
				}
			}
			//	****	Create/Update ElementValue
			if (C_ElementValue_ID == 0)		//	New
			{
				MElementValue ev = new MElementValue(impEV);
				if (ev.save())
				{
					noInsert++;
					impEV.setC_ElementValue_ID(ev.getC_ElementValue_ID());
					impEV.setI_IsImported(true);
					impEV.save();
				}
				else
				{
					o = new UpdatePO();
					o.setTablename(X_I_ElementValue.Table_Name);
					o.setClient(m_AD_Client_ID);
					o.setField(X_I_ElementValue.COLUMNNAME_I_IsImported, "E");
					o.setFieldExpr(X_I_ElementValue.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Insert ElementValue '");
					o.update(String.format("I_ElementValue_ID=%s", I_ElementValue_ID), get_TrxName());
				}
			}
			else							//	Update existing
			{
				MElementValue ev = new MElementValue (getCtx(), C_ElementValue_ID, null);
				if (ev.get_ID() != C_ElementValue_ID)
				{
					
				}
				ev.set(impEV);
				if (ev.save())
				{
					noUpdate++;
					impEV.setI_IsImported(true);
					impEV.save();
				}
				else
				{
					o = new UpdatePO();
					o.setTablename(X_I_ElementValue.Table_Name);
					o.setClient(m_AD_Client_ID);
					o.setField(X_I_ElementValue.COLUMNNAME_I_IsImported, "E");
					o.setFieldExpr(X_I_ElementValue.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Update ElementValue'");
					o.update(String.format("I_ElementValue_ID=%s", I_ElementValue_ID), get_TrxName());
				}
			}			
		}
//		//	Go through Records
//		sql = new StringBuffer ("SELECT * "
//			+ "FROM I_ElementValue "
//			+ "WHERE I_IsImported='N'").append(clientCheck)
//			.append(" ORDER BY I_ElementValue_ID");
//		try
//		{
//			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next())
//			{
//				X_I_ElementValue impEV = new X_I_ElementValue(getCtx(), rs, get_TrxName());
//				int C_ElementValue_ID = impEV.getC_ElementValue_ID();
//				int I_ElementValue_ID = impEV.getI_ElementValue_ID();
//				if (C_ElementValue_ID == 0)		//	New
//				{
//					MElementValue oimpEV = new Query(Env.getCtx(), MElementValue.Table_Name,"value=?",get_TrxName())
//						.setParameters(impEV.getValue()).first();
//					if (oimpEV != null)
//					{
//						System.out.println("X");
//					}
//				}
//				//	****	Create/Update ElementValue
//				if (C_ElementValue_ID == 0)		//	New
//				{
//					MElementValue ev = new MElementValue(impEV);
//					if (ev.save())
//					{
//						noInsert++;
//						impEV.setC_ElementValue_ID(ev.getC_ElementValue_ID());
//						impEV.setI_IsImported(true);
//						impEV.save();
//					}
//					else
//					{
//						o = new UpdatePO();
//						o.setTablename(X_I_ElementValue.Table_Name);
//						o.setClient(m_AD_Client_ID);
//						o.setField(X_I_ElementValue.COLUMNNAME_I_IsImported, "E");
//						o.setFieldExpr(X_I_ElementValue.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Insert ElementValue '");
//						o.update(String.format("I_ElementValue_ID=%s", I_ElementValue_ID), get_TrxName());
//					}
//				}
//				else							//	Update existing
//				{
//					MElementValue ev = new MElementValue (getCtx(), C_ElementValue_ID, null);
//					if (ev.get_ID() != C_ElementValue_ID)
//					{
//						
//					}
//					ev.set(impEV);
//					if (ev.save())
//					{
//						noUpdate++;
//						impEV.setI_IsImported(true);
//						impEV.save();
//					}
//					else
//					{
//						o = new UpdatePO();
//						o.setTablename(X_I_ElementValue.Table_Name);
//						o.setClient(m_AD_Client_ID);
//						o.setField(X_I_ElementValue.COLUMNNAME_I_IsImported, "E");
//						o.setField(X_I_ElementValue.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Update ElementValue'");
//						o.update(String.format("I_ElementValue_ID=%s", I_ElementValue_ID), get_TrxName());
//					}
//				}
//			}	//	for all I_Product
//			rs.close();
//			pstmt.close();
//		}
//		catch (SQLException e)
//		{
//			throw new Exception ("create", e);
//		}

		//	Set Error to indicator to not imported
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_ElementValue.COLUMNNAME_I_IsImported, "N");
		o.setFieldExpr(Constants.COLUMNNAME_Updated, "now()");
		no = o.update("I_IsImported<>'Y'", get_TrxName());		
		addLog (0, null, new BigDecimal (no), "@Errors@");
		addLog (0, null, new BigDecimal (noInsert), "@C_ElementValue_ID@: @Inserted@");
		addLog (0, null, new BigDecimal (noUpdate), "@C_ElementValue_ID@: @Updated@");

		commit();

		//	*****	Set Parent
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		fieldexpr = "(SELECT C_ElementValue_ID FROM C_ElementValue ev WHERE i.C_Element_ID=ev.C_Element_ID AND i.ParentValue=ev.Value AND i.AD_Client_ID=ev.AD_Client_ID)";
		o.setFieldExpr(X_I_ElementValue.COLUMNNAME_ParentElementValue_ID, fieldexpr);
		no = o.update("ParentElementValue_ID IS NULL AND I_IsImported='Y'", get_TrxName());
		System.out.println("Found Parent ElementValue=" + no);
		//
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setAlias("i");
		o.setClient(m_AD_Client_ID);
		o.setFieldExpr(X_I_ElementValue.COLUMNNAME_I_ErrorMsg, "I_ErrorMsg||'Info=ParentNotFound, '");
		no = o.update("ParentElementValue_ID IS NULL AND ParentValue IS NOT NULL AND I_IsImported='Y'", get_TrxName());		
		log.config("Not Found Patent ElementValue=" + no);
		//
		sql = new StringBuffer ("SELECT i.ParentElementValue_ID, i.I_ElementValue_ID,"
			+ " e.AD_Tree_ID, i.C_ElementValue_ID, i.Value||'-'||i.Name AS Info "
			+ "FROM I_ElementValue i"
			+ " INNER JOIN C_Element e ON (i.C_Element_ID=e.C_Element_ID) "
			+ "WHERE i.C_ElementValue_ID IS NOT NULL AND e.AD_Tree_ID IS NOT NULL"
			+ " AND i.ParentElementValue_ID IS NOT NULL"
			+ " AND i.I_IsImported='Y' AND i.AD_Client_ID=").append(m_AD_Client_ID);
		int noParentUpdate = 0;
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				o = new UpdatePO();
				o.setTablename(X_AD_TreeNode.Table_Name);
				o.setClient(m_AD_Client_ID);
				o.setField(X_AD_TreeNode.COLUMNNAME_Parent_ID, rs.getInt(1));
				o.setField(X_AD_TreeNode.COLUMNNAME_SeqNo, rs.getInt(2));
				String where = String.format("AD_Tree_ID=%s AND Node_ID=%s", rs.getInt(3), rs.getInt(4));
				no = o.update(where, get_TrxName());
				noParentUpdate += no;
				if (no == 0)
					log.info("Parent not found for " + rs.getString(5));
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "(ParentUpdateLoop) " + sql.toString(), e);
		}
		addLog (0, null, new BigDecimal (noParentUpdate), "@ParentElementValue_ID@: @Updated@");

		//	Reset Processing Flag
		o = new UpdatePO();
		o.setTablename(X_I_ElementValue.Table_Name);
		o.setClient(m_AD_Client_ID);
		o.setField(X_I_ElementValue.COLUMNNAME_Processing, "-");		
		String updatecondition = "I_IsImported='Y' AND Processed='Y' AND Processing='Y' AND C_ElementValue_ID IS NOT NULL";
		if (m_updateDefaultAccounts)
			updatecondition += " AND AD_Column_ID IS NULL";
		no = o.update(updatecondition, get_TrxName());
		System.out.println("Reset Processing Flag=" + no);

		if (m_updateDefaultAccounts)
			updateDefaults(clientCheck);

		//	Update Description
		sql = new StringBuffer("SELECT * FROM C_ValidCombination vc "
			+ "WHERE EXISTS (SELECT * FROM I_ElementValue i "
				+ "WHERE vc.Account_ID=i.C_ElementValue_ID)");
		

		return "";
	}	//	doIt

	
	/**************************************************************************
	 * 	Update Default Accounts
	 * 	@param clientCheck client where cluase
	 */
	private void updateDefaults (String clientCheck)
	{
		log.config("CreateNewCombination=" + m_createNewCombination);

		//	****	Update Defaults
		StringBuffer sql = new StringBuffer ("SELECT C_AcctSchema_ID FROM C_AcctSchema_Element "
			+ "WHERE C_Element_ID=?").append(clientCheck);
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			pstmt.setInt(1, m_C_Element_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				updateDefaultAccounts (rs.getInt(1));
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}

		//	Default Account		DEFAULT_ACCT
		UpdatePO o = new UpdatePO();
		o.setTablename(X_C_AcctSchema_Element.Table_Name);
		o.setAlias("e");
		o.setClient(m_AD_Client_ID);	
		StringBuilder fieldexpr = new StringBuilder("(SELECT C_ElementValue_ID FROM I_ElementValue i")
		.append(" WHERE e.C_Element_ID=i.C_Element_ID AND i.C_ElementValue_ID IS NOT NULL")
		.append( " AND UPPER(i.Default_Account)='DEFAULT_ACCT') ");
		StringBuilder whereexpr = new StringBuilder("EXISTS (SELECT * FROM I_ElementValue i")
			.append(" WHERE e.C_Element_ID=i.C_Element_ID AND i.C_ElementValue_ID IS NOT NULL")
			.append(" AND UPPER(i.Default_Account)='DEFAULT_ACCT' ")
			.append("	AND i.I_IsImported='Y')");
		o.setField(X_C_AcctSchema_Element.COLUMNNAME_C_ElementValue_ID,fieldexpr.toString());		
		int no = o.update(whereexpr.toString(), get_TrxName());
		addLog (0, null, new BigDecimal (no), "@C_AcctSchema_Element_ID@: @Updated@");
	}	//	updateDefaults

	/**
	 * 	Update Default Accounts.
	 *	_Default.xxxx = C_ValidCombination_ID  =>  Account_ID=C_ElementValue_ID
	 * 	@param C_AcctSchema_ID Accounting Schema
	 */
	private void updateDefaultAccounts (int C_AcctSchema_ID)
	{
		log.config("C_AcctSchema_ID=" + C_AcctSchema_ID);

		MAcctSchema as = new MAcctSchema (getCtx(), C_AcctSchema_ID, null);
		if (as.getAcctSchemaElement("AC").getC_Element_ID() != m_C_Element_ID)
		{
			log.log(Level.SEVERE, "C_Element_ID=" + m_C_Element_ID + " not in AcctSchema=" + as);
			return;
		}

		int[] counts = new int[] {0, 0, 0};

		String sql = "SELECT i.C_ElementValue_ID, t.TableName, c.ColumnName, i.I_ElementValue_ID "
			+ "FROM I_ElementValue i"
			+ " INNER JOIN AD_Column c ON (i.AD_Column_ID=c.AD_Column_ID)"
			+ " INNER JOIN AD_Table t ON (c.AD_Table_ID=t.AD_Table_ID) "
			+ "WHERE i.I_IsImported='Y' AND i.Processed='Y' AND Processing='Y'"
			+ " AND i.C_ElementValue_ID IS NOT NULL AND C_Element_ID=?";
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, m_C_Element_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				int C_ElementValue_ID = rs.getInt(1);
				String TableName = rs.getString(2);
				String ColumnName = rs.getString(3);
				int I_ElementValue_ID = rs.getInt(4);
				//	Update it
				int u = updateDefaultAccount(TableName, ColumnName, C_AcctSchema_ID, C_ElementValue_ID);
				counts[u]++;
				if (u != UPDATE_ERROR)
				{
					UpdatePO o = new UpdatePO();
					o.setTablename(X_I_ElementValue.Table_Name);					
					o.setClient(m_AD_Client_ID);
					o.setField(X_I_ElementValue.COLUMNNAME_Processing, Constants.NO);
					int no = o.update(String.format("I_ElementValue_ID=%s", I_ElementValue_ID), get_TrxName());
					if (no != 1)
						log.log(Level.SEVERE, "Updated=" + no);
				}
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "", e);
		}
		addLog (0, null, new BigDecimal (counts[UPDATE_ERROR]), as.toString() + ": @Errors@");
		addLog (0, null, new BigDecimal (counts[UPDATE_YES]), as.toString() + ": @Updated@");
		addLog (0, null, new BigDecimal (counts[UPDATE_SAME]), as.toString() + ": OK");

	}	//	createDefaultAccounts


	private static final int	UPDATE_ERROR = 0;
	private static final int	UPDATE_YES = 1;
	private static final int	UPDATE_SAME = 2;

	/**
	 * 	Update Default Account.
	 *  This is the sql to delete unused accounts - with the import still in the table(!):
		DELETE FROM C_ElementValue e
		WHERE NOT EXISTS (SELECT * FROM Fact_Acct f WHERE f.Account_ID=e.C_ElementValue_ID)
		 AND NOT EXISTS (SELECT * FROM C_ValidCombination vc WHERE vc.Account_ID=e.C_ElementValue_ID)
		 AND NOT EXISTS (SELECT * FROM I_ElementValue i WHERE i.C_ElementValue_ID=e.C_ElementValue_ID);
	 * 	@param TableName Table Name
	 * 	@param ColumnName Column Name
	 * 	@param C_AcctSchema_ID Account Schema
	 * 	@param C_ElementValue_ID new Account
	 * 	@return UPDATE_* status
	 */
	private int updateDefaultAccount (String TableName, String ColumnName, int C_AcctSchema_ID, int C_ElementValue_ID)
	{
		System.out.println(TableName + "." + ColumnName + " - " + C_ElementValue_ID);
		int retValue = UPDATE_ERROR;
		StringBuffer sql = new StringBuffer ("SELECT x.")
			.append(ColumnName).append(",Account_ID FROM ")
			.append(TableName).append(" x INNER JOIN C_ValidCombination vc ON (x.")
			.append(ColumnName).append("=vc.C_ValidCombination_ID) ")
			.append("WHERE x.C_AcctSchema_ID=").append(C_AcctSchema_ID);
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				int C_ValidCombination_ID = rs.getInt(1);
				int Account_ID = rs.getInt(2);
				//	The current account value is the same
				if (Account_ID == C_ElementValue_ID)
				{
					retValue = UPDATE_SAME;
					System.out.println("Account_ID same as new value");
				}
				//	We need to update the Account Value
				else
				{
					if (m_createNewCombination)
					{
						MAccount acct = MAccount.get(getCtx(), C_ValidCombination_ID);
						acct.setAccount_ID(C_ElementValue_ID);
						if (acct.save())
						{
							int newC_ValidCombination_ID = acct.getC_ValidCombination_ID();
							if (C_ValidCombination_ID != newC_ValidCombination_ID)
							{
								UpdatePO o = new UpdatePO();
								o.setTablename(TableName);					
								o.setField(ColumnName, newC_ValidCombination_ID);
								int no = o.update(String.format("C_AcctSchema_ID=%s", C_AcctSchema_ID), get_TrxName());								
								System.out.println("ImportAccount.updateDefaultAccount - #" + no + " - "
									+ TableName + "." + ColumnName + " - " + C_ElementValue_ID
									+ " -- " + C_ValidCombination_ID + " -> " + newC_ValidCombination_ID);
								if (no == 1)
									retValue = UPDATE_YES;
							}
						}
						else
							log.log(Level.SEVERE, "Account not saved - " + acct);
					}
					else	//	Replace Combination
					{
						//	Only Acct Combination directly
						UpdatePO o = new UpdatePO();
						o.setTablename(X_C_ValidCombination.Table_Name);
						o.setField(X_C_ValidCombination.COLUMNNAME_Account_ID, C_ElementValue_ID);
						int no = o.update(String.format("C_ValidCombination_ID = ?", C_ValidCombination_ID), get_TrxName());
						System.out.println("ImportAccount.updateDefaultAccount - Replace #" + no + " - "
								+ "C_ValidCombination_ID=" + C_ValidCombination_ID + ", New Account_ID=" + C_ElementValue_ID);
						if (no == 1)
						{
							retValue = UPDATE_YES;
							//	Where Acct was used
							o = new UpdatePO();
							o.setTablename(X_C_ValidCombination.Table_Name);
							o.setField(X_C_ValidCombination.COLUMNNAME_Account_ID, C_ElementValue_ID);
							no = o.update(String.format("Account_ID=%s", Account_ID), get_TrxName());
							System.out.println("ImportAccount.updateDefaultAccount - Replace VC #" + no + " - "
									+ "Account_ID=" + Account_ID + ", New Account_ID=" + C_ElementValue_ID);
							o = new UpdatePO();
							o.setTablename(X_Fact_Acct.Table_Name);
							o.setField(X_Fact_Acct.COLUMNNAME_Account_ID, C_ElementValue_ID);
							o.update(String.format("Account_ID=%s",Account_ID), get_TrxName());
							System.out.println("ImportAccount.updateDefaultAccount - Replace Fact #" + no + " - "
									+ "Account_ID=" + Account_ID + ", New Account_ID=" + C_ElementValue_ID);
						}
					}	//	replace combination
				}	//	need to update
			}	//	for all default accounts
			else
				log.log(Level.SEVERE, "Account not found " + sql);
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		return retValue;
	}	//	updateDefaultAccount
}	//	ImportAccount
