package org.compiere.model;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.util.*;

public class MQAttributeLookup extends Lookup
implements Serializable
{
	
	public MQAttributeLookup(Properties ctx, int WindowNo)
	{
		super(DisplayType.TableDir, WindowNo);
		m_ctx = ctx;
	}	//	MQAttribute

	/**	Properties					*/
	private Properties 			m_ctx;
	/**	Statement					*/
	private PreparedStatement	m_pstmt = null;
	/**	No Instance Value			*/
	private static KeyNamePair	NO_INSTANCE = new KeyNamePair (0,"");

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

	/**
	 *	Get Object of Key Value
	 *  @param value value
	 *  @return Object or null
	 */
	public NamePair get (Object value)
	{
		if (value == null)
			return null;
		int Q_AttributeSetInstance_ID = 0;
		if (value instanceof Integer)
			Q_AttributeSetInstance_ID = ((Integer)value).intValue();
		else
		{
			try
			{
				Q_AttributeSetInstance_ID = Integer.parseInt(value.toString());
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, "Value=" + value, e);
			}
		}
		if (Q_AttributeSetInstance_ID == 0)
			return NO_INSTANCE;
		//
		//	Statement
		if (m_pstmt == null)
			m_pstmt = DB.prepareStatement("SELECT Description "
				+ "FROM QAttributeSetInstance "
				+ "WHERE QAttributeSetInstance_ID=?", null);
		//
		String Description = null;
		try
		{
			m_pstmt.setInt(1, Q_AttributeSetInstance_ID);
			ResultSet rs = m_pstmt.executeQuery();
			if (rs.next())
			{
				Description = rs.getString(1);			//	Description
				if (Description == null || Description.length() == 0)
				{
					if (CLogMgt.isLevelFine())
						Description = "{" + Q_AttributeSetInstance_ID + "}";
					else
						Description = "";
				}
			}
			rs.close();
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "get", e);
		}
		if (Description == null)
			return null;
		return new KeyNamePair (Q_AttributeSetInstance_ID, Description);
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
		return "QAttributeSetInstance_ID";
	}	//	getColumnName

}
