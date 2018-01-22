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

import org.compiere.model.MUser;

import java.util.logging.*;
import org.compiere.util.*;

import org.xendra.annotations.*;
/**
 *	Reset Password
 *	
 *  @author Jorg Janke
 *  @version $Id: UserPassword.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="AD_User_Password",
name="Reset Password",
description="Reset Passwords for User",
help="You can change User Passwords and EMail settings.  You do not need to know/enter the password, if you are an Administrator.",
Identifier="e01b1038-916a-5d57-6e83-272270132a0a",
classname="org.compiere.process.UserPassword",
updated="2015-06-20 10:10:12")
public class UserPassword extends SvrProcess
{
	@XendraProcessParameter(Name="User/Contact",
			                ColumnName="AD_User_ID",
			                Description="User within the system - Internal or Business Partner Contact",
			                Help="The User identifies a unique user in the system. This could be an internal user or a business partner contact",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=10,
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
			                Identifier="0a0059d3-3596-e2ea-779d-d83d2a7ada44")	
	private int			p_AD_User_ID = -1;
	@XendraProcessParameter(Name="Old Password",
			                ColumnName="OldPassword",
			                Description="Old Password is required if you are not a System Administrator",
			                Help="",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=30,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="5591ca22-2331-f61b-a1e0-c27548ac5a81")	
	private String 		p_OldPassword = null;
	@XendraProcessParameter(Name="New Password",
			                ColumnName="NewPassword",
			                Description="Enter the new password - not changed if empty",
			                Help="",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=30,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="f1bded54-e315-5a0d-335a-4d0bd7650b6b")	
	private String 		p_NewPassword = null;
	@XendraProcessParameter(Name="New EMail Address",
			                ColumnName="NewEMail",
			                Description="Enter new EMail Address - not changed if empty",
			                Help="",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=40,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=30,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="71ae6d52-b921-a511-ca4d-ebdc945780a0")	
	private String		p_NewEMail = null;
	@XendraProcessParameter(Name="New EMail User ID",
			                ColumnName="NewEMailUser",
			                Description="Enter new User ID of your internal EMail System - not changed if empty",
			                Help="",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=50,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=30,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="92a40c9e-9ce8-3567-d8b0-e96f9ec5b141")	
	private String		p_NewEMailUser = null;
	@XendraProcessParameter(Name="New EMail User PW",
			                ColumnName="NewEMailUserPW",
			                Description="Enter new User Password of your internal EMail System - not changed if empty",
			                Help="",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=60,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=30,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="9da93759-f702-8fe0-ee63-fd97d08c6874")	
	private String		p_NewEMailUserPW = null;

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
			else if (name.equals("AD_User_ID"))
				p_AD_User_ID = para[i].getParameterAsInt();
			else if (name.equals("OldPassword"))
				p_OldPassword = (String)para[i].getParameter();
			else if (name.equals("NewPassword"))
				p_NewPassword = (String)para[i].getParameter();
			else if (name.equals("NewEMail"))
				p_NewEMail = (String)para[i].getParameter();
			else if (name.equals("NewEMailUser"))
				p_NewEMailUser = (String)para[i].getParameter();
			else if (name.equals("NewEMailUserPW"))
				p_NewEMailUserPW = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message 
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		log.info ("AD_User_ID=" + p_AD_User_ID + " from " + getAD_User_ID());
		
		MUser user = MUser.get(getCtx(), p_AD_User_ID);
		MUser operator = MUser.get(getCtx(), getAD_User_ID());
		log.fine("User=" + user + ", Operator=" + operator);
		
		
		
		//	Do we need a password ?
		if (Util.isEmpty(p_OldPassword))		//	Password required
		{
			if (p_AD_User_ID == 0			//	change of System
				|| p_AD_User_ID == 100		//	change of SuperUser
				|| !operator.isAdministrator())
				throw new IllegalArgumentException("@OldPasswordMandatory@");
		}

		//	is entered Password correct ?
		else if (!p_OldPassword.equals(user.getPassword()))
			throw new IllegalArgumentException("@OldPasswordNoMatch@");
		
		//	Change Super User
		if (p_AD_User_ID == 0)
		{
			String sql = "UPDATE AD_User SET Updated=CURRENT_TIMESTAMP, UpdatedBy=" + getAD_User_ID();
			if (!Util.isEmpty(p_NewPassword))
				sql += ", Password=" + DB.TO_STRING(p_NewPassword);
			if (!Util.isEmpty(p_NewEMail))
				sql += ", Email=" + DB.TO_STRING(p_NewEMail);
			if (!Util.isEmpty(p_NewEMailUser))
				sql += ", EmailUser=" + DB.TO_STRING(p_NewEMailUser);
			if (!Util.isEmpty(p_NewEMailUserPW))
				sql += ", EmailUserPW=" + DB.TO_STRING(p_NewEMailUserPW);
			sql += " WHERE AD_User_ID=0";
			if (DB.executeUpdate(sql, get_TrxName()) == 1)
				return "OK";
			else 
				return "@Error@";
		}
		else
		{
			if (!Util.isEmpty(p_NewPassword))
				user.setPassword(p_NewPassword);
			if (!Util.isEmpty(p_NewEMail))
				user.setEMail(p_NewEMail);
			if (!Util.isEmpty(p_NewEMailUser))
				user.setEMailUser(p_NewEMailUser);
			if (!Util.isEmpty(p_NewEMailUserPW))
				user.setEMailUserPW(p_NewEMailUserPW);
			//
			if (user.save())
				return "OK";
			else 
				return "@Error@";
		}
	}	//	doIt

}	//	UserPassword

