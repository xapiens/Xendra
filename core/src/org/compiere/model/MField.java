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

import org.compiere.model.persistence.X_AD_Field;
import org.compiere.util.CPreparedStatement;
import org.compiere.util.DB;
import org.compiere.util.Env;

/**
 *	Field Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MField.java 4886 2013-05-10 21:02:43Z xapiens $
 */
public class MField extends X_AD_Field
{

	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_Field_ID id
	 *	@param trxName transaction
	 */
	public MField (Properties ctx, int AD_Field_ID, String trxName)
	{
		super (ctx, AD_Field_ID, trxName);
		if (AD_Field_ID == 0)
		{
		//	setAD_Tab_ID (0);	//	parent
		//	setAD_Column_ID (0);
		//	setName (null);
			setEntityType (ENTITYTYPE_UserMaintained);	// U
			setIsCentrallyMaintained (true);	// Y
			setIsDisplayed (true);	// Y
			setIsEncrypted (false);
			setIsFieldOnly (false);
			setIsHeading (false);
			setIsReadOnly (false);
			setIsSameLine (false);
		//	setObscureType(OBSCURETYPE_ObscureDigitsButLast4);
		}	
	}	//	MField

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MField (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MField

	/**
	 * 	Parent Constructor
	 *	@param parent parent
	 */
	public MField (MTab parent)
	{
		this (parent.getCtx(), 0, parent.get_TrxName());
		setClientOrg(parent);
		setAD_Tab_ID(parent.getAD_Tab_ID());
	}	//	MField
	
	/**
	 * 	Copy Constructor
	 *	@param parent parent
	 *	@param from copy from
	 */
	public MField (MTab parent, MField from)
	{
		this (parent.getCtx(), 0, parent.get_TrxName());
		copyValues(from, this);
		setClientOrg(parent);
		setAD_Tab_ID(parent.getAD_Tab_ID());
		setEntityType(parent.getEntityType());
	}	//	M_Field
	
	/**
	 * 	Set Column Values
	 *	@param column column
	 */
	public void setColumn (MColumn column)
	{
		setAD_Column_ID (column.getAD_Column_ID());
		setName (column.getName());
		setDescription(column.getDescription());
		setHelp(column.getHelp());
		setDisplayLength(column.getFieldLength());
		setEntityType(column.getEntityType());
	}	//	setColumn
	
	/**
	 * 	beforeSave
	 *	@see org.compiere.model.PO#beforeSave(boolean)
	 *	@param newRecord
	 *	@return
	 */
	@Override
	protected boolean beforeSave(boolean newRecord)
	{
		//	Sync Terminology
		if ((newRecord || is_ValueChanged("AD_Column_ID")) 
			&& isCentrallyMaintained())
		{
			M_Element element = M_Element.getOfColumn(getCtx(), getAD_Column_ID());
			if (element == null)
			{
				System.out.println("X17");
			}
			setName (element.getName ());
			setDescription (element.getDescription ());
			setHelp (element.getHelp());
		}

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
		if (((newRecord || is_ValueChanged("AD_Column_ID")))
			&& isCentrallyMaintained()) {
			M_Element element = M_Element.getOfColumn(getCtx(), getAD_Column_ID());
			String sql = "DELETE FROM AD_Field_Trl WHERE AD_Field_ID=?";
			int no = DB.executeUpdate(sql, get_ID(), get_TrxName());

			sql = "INSERT INTO " +
					"AD_Field_Trl " +
					"(" +
						"AD_Field_ID," +
						"AD_Language," +
						"AD_Client_ID," +
						"AD_Org_ID," +
						"IsActive," +
						"Name," +
						"Description," +
						"Help," +
						"IsTranslated," +
						"CreatedBy," +
						"UpdatedBy" +
			        ")" +
			        "SELECT " +
						"?," +
						"AD_Language," +
						"?," +
						"?," +
						"IsActive," +
						"Name," +
						"Description," +
						"Help," +
						"IsTranslated," +
						"?," +
						"? " +
				    "FROM " +
						"AD_Element_Trl " +
				    "WHERE " +
						"AD_Element_ID=? " +
						"AND IsActive='Y' ";
			try {
				CPreparedStatement pstmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, get_TrxName());
				pstmt.setInt(1, get_ID());
				pstmt.setInt(2, getAD_Client_ID());
				pstmt.setInt(3, getAD_Org_ID());
				pstmt.setInt(4, getCreatedBy());
				pstmt.setInt(5, getUpdatedBy());
				pstmt.setInt(6, element.getAD_Element_ID());
				no = pstmt.executeUpdate();				
			}
			catch (SQLException e) {
				return false;
			}

		}
		return success;
	}

	public static MField getbyIdentifier(String identifier) {
		MField retValue = null;
		String SQL = "SELECT * FROM AD_Field WHERE Identifier = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(SQL, null);
			pstmt.setString(1, identifier);
			rs = pstmt.executeQuery();
			if (rs.next())
				retValue = new MField(Env.getCtx(),rs, null);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DB.close(rs, pstmt);
		}
		return retValue;
	}

	public static MField getbyName(MTab tab, String fieldname) {
		MField retValue = null;
		for (MField field : tab.getFields(true, null))
		{
			if (field.getName().equals(fieldname))
			{
				retValue = field;
				break;
			}
		}
		return retValue;
	}

	public static MField getbyColumn(MTab tab, MColumn column) {
		MField retValue = null;
		for (MField field : tab.getFields(true, null))
		{
			if (field.getAD_Column_ID() == column.getAD_Column_ID())
			{
				retValue = field;
				break;
			}
		}
		return retValue;
	}
}	//	MField
