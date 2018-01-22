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
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import org.compiere.util.*;
import org.xendra.objectview.RowBase;

/**
 *	Child Lookup Model (not Cached)
 *	
 *  @author xapiens
 *  @version $Id: MPAttributeLookup.java 2443 2011-02-17 04:06:05Z xapiens $
 */
public class ChildLookup extends Lookup
	implements Serializable
{

	/**
	 * 	Constructor
	 * 	@param ctx context
	 *	@param WindowNo window no
	 */
	public ChildLookup(Properties ctx, int WindowNo, int Column_ID)
	{
		super(DisplayType.TableDir, WindowNo);
		m_ctx = ctx;
		MColumn column = MColumn.get(Env.getCtx(), Column_ID);
		ColumnName = column.getColumnName();
		
	}	//	MPAttribute

	/**	Properties					*/
	private Properties 			m_ctx;
	/**	Statement					*/
	private PreparedStatement	m_pstmt = null;
	/**	No Instance Value			*/
	private static KeyNamePair	NO_INSTANCE = new KeyNamePair (0,"");
	/** */
	private String ColumnName  = "";
	private RowBase row;
	/**
 	 *	Get Display for Value (not cached)
	 *  @param value Location_ID
	 *  @return String Value
	 */
	public String getDisplay (Object value)
	{
		if (value == null)
			return "";
		NamePair pp = get (value);
		if (pp == null)
			return "<" + value.toString() + ">";
		return pp.getName();
	}	//	getDisplay

	/**
	 *  The Lookup contains the key (not cached)
	 *  @param key Location_ID
	 *  @return true if key known
	 */
	public boolean containsKey (Object key)
	{
		return get(key) != null;
	}   //  containsKey

	public NamePair get (Object value, RowBase Analyze)
	{
		
		return null;
	}
	/**
	 *	Get Object of Key Value
	 *  @param value value
	 *  @return Object or null
	 */
	public NamePair get (Object value)
	{
		if (value == null)
			return null;
		int M_ID = 0;
		if (value instanceof Integer)
			M_ID = ((Integer)value).intValue();
		else
		{
			try
			{
				M_ID = Integer.parseInt(value.toString());
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, "Value=" + value, e);
			}
		}
		if (M_ID == 0)
			return NO_INSTANCE;

		String Description = null;
		RowBase child = (RowBase) row.getFirstChild();
		if (child != null)
			Description = child.getName();
		if (Description == null)
			return null;
		return new KeyNamePair (M_ID, Description);
	}	//	get

	/**
	 * 	Dispose
	 *	@see org.compiere.model.Lookup#dispose()
	 */
	public void dispose()
	{
		try
		{
			if (m_pstmt != null)
				m_pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "dispose", e);
		}
		log.fine("");
		super.dispose();
	}	//	dispose

	/**
	 *	Return data as sorted Array - not implemented
	 *  @param mandatory mandatory
	 *  @param onlyValidated only validated
	 *  @param onlyActive only active
	 * 	@param temporary force load for temporary display
	 *  @return null
	 */
	public ArrayList<Object> getData (boolean mandatory, boolean onlyValidated, boolean onlyActive, boolean temporary)
	{
		log.log(Level.SEVERE, "Not implemented");
		return null;
	}   //  getArray

	/**
	 *	Get underlying fully qualified Table.Column Name.
	 *	Used for VLookup.actionButton (Zoom)
	 *  @return column name
	 */
	public String getColumnName()
	{
		return ColumnName;
	}	//	getColumnName

	public void setRowBase(RowBase rowview) {
		row = rowview;
	}

}	//	ListCalcLookup
