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
 *****************************************************************************/
package org.compiere.model;

import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_AD_WF_Node;
import org.compiere.model.persistence.X_AD_Window;
import org.compiere.model.reference.REF_AD_WindowTypes;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;

/**
 *	Window Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MWindow.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class MWindow extends X_AD_Window
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6783399136841920556L;
	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MWindow.class);
	
	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_Window_ID
	 *	@param trxName transaction
	 */
	public MWindow (Properties ctx, int AD_Window_ID, String trxName)
	{
		super (ctx, AD_Window_ID, trxName);
		if (AD_Window_ID == 0)
		{
			setWindowType (REF_AD_WindowTypes.Maintain);	// M
			setEntityType (ENTITYTYPE_UserMaintained);	// U
			setIsBetaFunctionality (false);
			setIsDefault (false);
			setIsSOTrx (true);	// Y
		}	}	//	M_Window

	/**
	 * 	Koad Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MWindow (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	M_Window
	
	/**
	 * 	Set Window Size
	 *	@param size size
	 */
	public void setWindowSize (Dimension size)
	{
		if (size != null)
		{
			setWinWidth(size.width);
			setWinHeight(size.height);
		}
	}	//	setWindowSize
	
	/**	The Lines						*/
	private MTab[]		m_tabs	= null;

	/**
	 * 	Get Fields
	 *	@param reload reload data
	 *	@return array of lines
	 *	@param trxName transaction
	 */
	public MTab[] getTabs (boolean reload, String trxName)
	{
		if (m_tabs != null && !reload)
			return m_tabs;
		String sql = "SELECT * FROM AD_Tab WHERE AD_Window_ID=? ORDER BY SeqNo";
		ArrayList<MTab> list = new ArrayList<MTab>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setInt (1, getAD_Window_ID());
			rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MTab (getCtx(), rs, trxName));
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		//
		m_tabs = new MTab[list.size ()];
		list.toArray (m_tabs);
		return m_tabs;
	}	//	getFields

	
	/**
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (newRecord)	//	Add to all automatic roles
		{
			MRole[] roles = MRole.getOf(getCtx(), "IsManual='N'");
			for (int i = 0; i < roles.length; i++)
			{
				MWindowAccess wa = new MWindowAccess(this, roles[i].getAD_Role_ID());
				wa.save();
			}
		}
		//	Menu/Workflow
		else if (is_ValueChanged("IsActive") || is_ValueChanged("Name") 
			|| is_ValueChanged("Description") || is_ValueChanged("Help"))
		{
			MMenu[] menues = MMenu.get(getCtx(), "AD_Window_ID=" + getAD_Window_ID(), get_TrxName());
			for (int i = 0; i < menues.length; i++)
			{
				menues[i].setName(getName());
				menues[i].setDescription(getDescription());
				menues[i].setIsActive(isActive());
				menues[i].save();
			}
			//
			X_AD_WF_Node[] nodes = getWFNodes(getCtx(), "AD_Window_ID=" + getAD_Window_ID(), get_TrxName());
			for (int i = 0; i < nodes.length; i++)
			{
				boolean changed = false;
				if (nodes[i].isActive() != isActive())
				{
					nodes[i].setIsActive(isActive());
					changed = true;
				}
				if (nodes[i].isCentrallyMaintained())
				{
					nodes[i].setName(getName());
					nodes[i].setDescription(getDescription());
					nodes[i].setHelp(getHelp());
					changed = true;
				}
				if (changed)
					nodes[i].save();
			}
		}
		return success;
	}	//	afterSave

	
	/**
	 * Get workflow nodes with where clause.
	 * Is here as MWFNode is in base
	 * @param ctx context
	 * @param whereClause where clause w/o the actual WHERE
	 * @param trxName transaction
	 * @return nodes
	 */
	public static X_AD_WF_Node[] getWFNodes (Properties ctx, String whereClause, String trxName)
	{
		String sql = "SELECT * FROM AD_WF_Node";
		if (whereClause != null && whereClause.length() > 0)
			sql += " WHERE " + whereClause;
		ArrayList<X_AD_WF_Node> list = new ArrayList<X_AD_WF_Node>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new X_AD_WF_Node (ctx, rs, trxName));
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		finally {
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		X_AD_WF_Node[] retValue = new X_AD_WF_Node[list.size()];
		list.toArray (retValue);
		return retValue;
	}	//	getWFNode
	
	//vpj-cd begin e-evolution
	/**
	 * 	get Window ID
	 *	@param String windowName
	 *	@return int retValue
	 */
	public static int getWindow_ID(String windowName) {
		int retValue = 0;
		String SQL = "SELECT AD_Window_ID FROM AD_Window WHERE Name = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(SQL, null);
			pstmt.setString(1, windowName);
			rs = pstmt.executeQuery();
			if (rs.next())
				retValue = rs.getInt(1);
		}
		catch (SQLException e)
		{
			s_log.log(Level.SEVERE, SQL, e);
			retValue = -1;
		}
		finally
		{
			DB.close(rs, pstmt);
		}
		return retValue;
	}
	//end vpj-cd e-evolution

	public static MWindow getbyIdentifier(String identifier, String trxName) {
		String where = "Identifier = ?";
		MWindow retValue = new Query(Env.getCtx(), X_AD_Window.Table_Name, where, trxName)
						.setParameters(identifier)
						.first();
		return retValue;
	}

	public static MWindow getbyName(String name, String trxName) {
		String where = "lower(Name) = ?";		
		MWindow retValue = new Query(Env.getCtx(), X_AD_Window.Table_Name, where, trxName)
							.setParameters(name.toLowerCase())
							.first();
		return retValue;
	}

	public static MWindow getbyTable(String name, String trxName) {
		MWindow window = null;
		String where = "Identifier='"+name+"'";
		MTable retValue = new Query(Env.getCtx(), MTable.Table_Name, where, trxName)
						.first();
		if (retValue == null)
			return null;
		if (retValue.get_ID() != 0)
		{
			where = "AD_Table_ID="+retValue.getAD_Table_ID();
			MTab tab = new Query(Env.getCtx(), MTab.Table_Name, where, trxName).first();
			if (tab == null)
				return null;
			if (tab.getAD_Tab_ID() != 0)
			{
				window = new MWindow (Env.getCtx(), tab.getAD_Window_ID(), trxName);
			}
		}
		return window;
	}
	
}	//	M_Window