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

import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.reference.REF_AD_MenuAction;
import org.compiere.model.reference.REF_AD_TreeTypeType;
import org.compiere.util.*;

/**
 *	Menu Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MMenu.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class MMenu extends X_AD_Menu
{

	/**
	 * 	Get menues with where clause
	 *	@param ctx context
	 *	@param whereClause where clause w/o the actual WHERE
	 *	@return MMenu
	 */
	public static MMenu[] get (Properties ctx, String whereClause)
	{
		return get(ctx, whereClause, null);
	}	//	get
	
	/**
	 * Get menues with where clause
	 * @param ctx context
	 * @param whereClause where clause w/o the actual WHERE
	 * @param trxName transaction
	 * @return MMenu
	 */
	public static MMenu[] get (Properties ctx, String whereClause, String trxName)
	{
		String sql = "SELECT * FROM AD_Menu";
		if (whereClause != null && whereClause.length() > 0)
			sql += " WHERE " + whereClause;
		ArrayList<MMenu> list = new ArrayList<MMenu>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MMenu (ctx, rs, trxName));
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		finally {
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		MMenu[] retValue = new MMenu[list.size()];
		list.toArray (retValue);
		return retValue;
	}	//	get
	
	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MMenu.class);
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_Menu_ID id
	 *	@param trxName transaction
	 */
	public MMenu (Properties ctx, int AD_Menu_ID, String trxName)
	{
		super (ctx, AD_Menu_ID, trxName);
		if (AD_Menu_ID == 0)
		{
			setEntityType (ENTITYTYPE_UserMaintained);	// U
			setIsReadOnly (false);	// N
			setIsSOTrx (false);
			setIsSummary (false);
		//	setName (null);
		}
	}	//	MMenu

	/**
	 * 	Load Contrusctor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MMenu (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MMenu

	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		//	Reset info
		if (isSummary() && getAction() != null)
			setAction(null);
		String action = getAction();
		if (action == null)
			action = "";
		//	Clean up references
		if (getAD_Window_ID() != 0 && !action.equals(REF_AD_MenuAction.Window))
			setAD_Window_ID(0);
		if (getAD_Form_ID() != 0 && !action.equals(REF_AD_MenuAction.Form))
			setAD_Form_ID(0);
		if (getAD_Workflow_ID() != 0 && !action.equals(REF_AD_MenuAction.WorkFlow))
			setAD_Workflow_ID(0);
		if (getAD_Workbench_ID() != 0 && !action.equals(REF_AD_MenuAction.Workbench))
			setAD_Workbench_ID(0);
		if (getAD_Task_ID() != 0 && !action.equals(REF_AD_MenuAction.Task))
			setAD_Task_ID(0);
		if (getAD_Process_ID() != 0 
			&& !(action.equals(REF_AD_MenuAction.Process) || action.equals(REF_AD_MenuAction.Report)))
			setAD_Process_ID(0);
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
		if (newRecord)
			insert_Tree(REF_AD_TreeTypeType.Menu);
		return success;
	}	//	afterSave

	/**
	 * 	After Delete
	 *	@param success
	 *	@return deleted
	 */
	protected boolean afterDelete (boolean success)
	{
		if (success)
			delete_Tree(REF_AD_TreeTypeType.Menu);
		return success;
	}	//	afterDelete

	public static MMenu getbyIdentifier(Properties ctx,String identifier) {
		String whereClause = "Identifier = '"+identifier+"'";
		MMenu m = new Query(ctx, MMenu.Table_Name, whereClause, null)		
		.firstOnly();
		return m;
	}
	
}	//	MMenu
