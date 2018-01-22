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

import java.sql.*;

import org.compiere.model.MRole;

import java.util.logging.*;
import org.compiere.util.*;

import org.xendra.annotations.*;
/**
 *	Update Role Access
 *	
 *  @author Jorg Janke
 *  @version $Id: RoleAccessUpdate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="AD_Role_AccessUpdate",
name="Role Access Update",
description="Update the access rights of a role or roles of a client",
help="Update the access rights of a role or all roles of a client to windows, forms, processes and workflows. If run for System, all roles of all clients are updated. Note that a role is only updated if it is not marked as manual.",
Identifier="59d7b08b-d5a8-caac-be16-fb3ef543acb2",
classname="org.compiere.process.RoleAccessUpdate",
updated="2015-06-20 10:10:12")
public class RoleAccessUpdate extends SvrProcess
{
	/**	Update Role				*/
	@XendraProcessParameter(Name="Role",
			                ColumnName="AD_Role_ID",
			                Description="Responsibility Role",
			                Help="The Role determines security and access a user who has this Role will have in the System.",
			                AD_Reference_ID=DisplayType.TableDir,
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
			                Identifier="c5f27fff-a020-d3bb-a040-782cd6dff395")	
	private int	p_AD_Role_ID = 0;
	/**	Update Roles of Client	*/
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
			                Identifier="4c760b20-05f9-776f-913d-a052f14990f8")
	private int	p_AD_Client_ID = 0;
	
	
	/**
	 * 	Prepare
	 */
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Role_ID"))
				p_AD_Role_ID = para[i].getParameterAsInt();
			else if (name.equals("AD_Client_ID"))
				p_AD_Client_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 * 	Process
	 *	@return info
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		log.info("AD_Client_ID=" + p_AD_Client_ID + ", AD_Role_ID=" + p_AD_Role_ID);
		//
		if (p_AD_Role_ID != 0)
			updateRole (new MRole (getCtx(), p_AD_Role_ID, get_TrxName()));
		else
		{
			String sql = "SELECT * FROM AD_Role ";
			if (p_AD_Client_ID != 0)
				sql += "WHERE AD_Client_ID=? ";
			sql += "ORDER BY AD_Client_ID, Name";

			PreparedStatement pstmt = null;
			try
			{
				pstmt = DB.prepareStatement (sql, get_TrxName());
				if (p_AD_Client_ID != 0)
					pstmt.setInt (1, p_AD_Client_ID);
				ResultSet rs = pstmt.executeQuery ();
				while (rs.next ())
					updateRole (new MRole (getCtx(), rs, get_TrxName()));
				rs.close ();
				pstmt.close ();
				pstmt = null;
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, sql, e);
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
		}
		
		return "";
	}	//	doIt

	/**
	 * 	Update Role
	 *	@param role role
	 */
	private void updateRole (MRole role)
	{
		addLog(0, null, null, role.getName() + ": " 
			+ role.updateAccessRecords());
	}	//	updateRole
	
}	//	RoleAccessUpdate
