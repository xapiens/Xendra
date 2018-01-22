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

import org.compiere.model.persistence.X_C_AcctSchema_Element;
import org.compiere.model.reference.REF_C_AcctSchemaElementType;
import org.compiere.util.*;

/**
 *  Account Schema Element Object
 *
 *  @author 	Jorg Janke
 *  @version 	$Id: MAcctSchemaElement.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public final class MAcctSchemaElement extends X_C_AcctSchema_Element
{
	/**
	 *  Factory: Return ArrayList of Account Schema Elements
	 * 	@param as Accounting Schema
	 *  @return ArrayList with Elements
	 */
	public static MAcctSchemaElement[] getAcctSchemaElements (MAcctSchema as)
	{
		Integer key = new Integer (as.getC_AcctSchema_ID());
		MAcctSchemaElement[] retValue = (MAcctSchemaElement[]) s_cache.get (key);
		if (retValue != null)
			return retValue;

		s_log.fine("C_AcctSchema_ID=" + as.getC_AcctSchema_ID());
		ArrayList<MAcctSchemaElement> list = new ArrayList<MAcctSchemaElement>();
		//
		String sql = "SELECT * FROM C_AcctSchema_Element "
			+ "WHERE C_AcctSchema_ID=? AND IsActive='Y' ORDER BY SeqNo";

		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, as.get_TrxName());
			pstmt.setInt(1, as.getC_AcctSchema_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				MAcctSchemaElement ase = new MAcctSchemaElement(as.getCtx(), rs, as.get_TrxName());
				s_log.fine(" - " + ase);
				if (ase.isMandatory() && ase.getDefaultValue() == 0)
					s_log.log(Level.SEVERE, "No default value for " + ase.getName());
				list.add(ase);
				//
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		
		retValue = new MAcctSchemaElement[list.size()];
		list.toArray(retValue);
		s_cache.put (key, retValue);
		return retValue;
	}   //  getAcctSchemaElements

	/**
	 * 	Get Accounting Elements Of Product
	 *	@param ctx context
	 *	@param M_Product_ID product
	 *	@param trxName trx
	 *	@return array of accounting elements
	 */
	public static MAcctSchemaElement[] getOfProduct (Properties ctx, int M_Product_ID, String trxName)
	{
		String sql = "SELECT * FROM C_AcctSchema_Element WHERE M_Product_ID=?";
		ArrayList<MAcctSchemaElement> list = new ArrayList<MAcctSchemaElement>();
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setInt (1, M_Product_ID);
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				list.add (new MAcctSchemaElement (ctx, rs, trxName));
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e); 
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
		//
		MAcctSchemaElement[] retValue = new MAcctSchemaElement[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getOfProduct

	/**
	 *  Get Column Name of ELEMENTTYPE 
	 * 	@param elementType ELEMENTTYPE 
	 *  @return column name
	 */
	public static String getColumnName(String elementType)
	{
		if (elementType.equals(REF_C_AcctSchemaElementType.Organization))
			return "AD_Org_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.Account))
			return "Account_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.BPartner))
			return "C_BPartner_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.Product))
			return "M_Product_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.Activity))
			return "C_Activity_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.LocationFrom))
			return "C_LocFrom_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.LocationTo))
			return "C_LocTo_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.Campaign))
			return "C_Campaign_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.OrgTrx))
			return "AD_OrgTrx_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.Project))
			return "C_Project_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.SalesRegion))
			return "C_SalesRegion_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserList1))
			return "User1_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserList2))
			return "User2_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserElement1))
			return "UserElement1_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserElement2))
			return "UserElement2_ID";
		//
		return "";
	}   //  getColumnName

	/**
	 *  Get Value Query for ELEMENTTYPE Type
	 * 	@param elementType ELEMENTTYPE type
	 *  @return query "SELECT Value,Name FROM Table WHERE ID="
	 */
	public static String getValueQuery (String elementType)
	{
		if (elementType.equals(REF_C_AcctSchemaElementType.Organization))
			return "SELECT Value,Name FROM AD_Org WHERE AD_Org_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.Account))
			return "SELECT Value,Name FROM C_ElementValue WHERE C_ElementValue_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.SubAccount))
			return "SELECT Value,Name FROM C_SubAccount WHERE C_SubAccount_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.BPartner))
			return "SELECT Value,Name FROM C_BPartner WHERE C_BPartner_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.Product))
			return "SELECT Value,Name FROM M_Product WHERE M_Product_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.Activity))
			return "SELECT Value,Name FROM C_Activity WHERE C_Activity_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.LocationFrom))
			return "SELECT City,Address1 FROM C_Location WHERE C_Location_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.LocationTo))
			return "SELECT City,Address1 FROM C_Location WHERE C_Location_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.Campaign))
			return "SELECT Value,Name FROM C_Campaign WHERE C_Campaign_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.OrgTrx))
			return "SELECT Value,Name FROM AD_Org WHERE AD_Org_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.Project))
			return "SELECT Value,Name FROM C_Project WHERE C_Project_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.SalesRegion))
			return "SELECT Value,Name FROM C_SalesRegion WHERE C_SalesRegion_ID";
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserList1))
			return "SELECT Value,Name FROM C_ElementValue WHERE C_ElementValue_ID=";
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserList2))
			return "SELECT Value,Name FROM C_ElementValue WHERE C_ElementValue_ID=";
		//
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserElement1))
			return null;
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserElement2))
			return null;
		//
		return "";
	}   //  getColumnName

	/**	Logger						*/
	private static CLogger		s_log = CLogger.getCLogger (MAcctSchemaElement.class);

	/**	Cache						*/
	private static CCache<Integer,MAcctSchemaElement[]> s_cache = new CCache<Integer,MAcctSchemaElement[]>("C_AcctSchema_Element", 10);
	
	
	/*************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_AcctSchema_Element_ID id
	 *	@param trxName transaction
	 */
	public MAcctSchemaElement (Properties ctx, int C_AcctSchema_Element_ID, String trxName)
	{
		super (ctx, C_AcctSchema_Element_ID, trxName);
		if (C_AcctSchema_Element_ID == 0)
		{
		//	setC_AcctSchema_Element_ID (0);
		//	setC_AcctSchema_ID (0);
		//	setC_Element_ID (0);
		//	setElementType (null);
			setIsBalanced (false);
			setIsMandatory (false);
		//	setName (null);
		//	setOrg_ID (0);
		//	setSeqNo (0);
		}
	}	//	MAcctSchemaElement

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */	
	public MAcctSchemaElement (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MAcctSchemaElement

	/**
	 * 	Parent Constructor
	 *	@param as accounting schema
	 */
	public MAcctSchemaElement (MAcctSchema as)
	{
		this (as.getCtx(), 0, as.get_TrxName());
		setClientOrg(as);
		setC_AcctSchema_ID (as.getC_AcctSchema_ID());
		
		//	setC_Element_ID (0);
		//	setElementType (null);
		//	setName (null);
		//	setSeqNo (0);
		
	}	//	MAcctSchemaElement

	/** User Element Column Name		*/
	private String		m_ColumnName = null;
	
	/**
	 * 	Set Organization Type
	 *	@param SeqNo sequence
	 *	@param Name name 
	 *	@param Org_ID id
	 */
	public void setTypeOrg (int SeqNo, String Name, int Org_ID)
	{
		setElementType (REF_C_AcctSchemaElementType.Organization);
		setSeqNo(SeqNo);
		setName (Name);
		setOrg_ID(Org_ID);
	}	//	setTypeOrg

	/**
	 * 	Set Type Account
	 *	@param SeqNo squence
	 *	@param Name name
	 *	@param C_Element_ID element
	 *	@param C_ElementValue_ID element value
	 */
	public void setTypeAccount (int SeqNo, String Name, int C_Element_ID, int C_ElementValue_ID)
	{
		setElementType (REF_C_AcctSchemaElementType.Account);
		setSeqNo(SeqNo);
		setName (Name);
		setC_Element_ID (C_Element_ID);
		setC_ElementValue_ID(C_ElementValue_ID);
	}	//	setTypeAccount

	/**
	 * 	Set Type BPartner
	 *	@param SeqNo sequence
	 *	@param Name name
	 *	@param C_BPartner_ID id
	 */
	public void setTypeBPartner (int SeqNo, String Name, int C_BPartner_ID)
	{
		setElementType (REF_C_AcctSchemaElementType.BPartner);
		setSeqNo(SeqNo);
		setName (Name);
		setC_BPartner_ID(C_BPartner_ID);
	}	//	setTypeBPartner

	/**
	 * 	Set Type Product
	 *	@param SeqNo sequence
	 *	@param Name name
	 *	@param M_Product_ID id
	 */
	public void setTypeProduct (int SeqNo, String Name, int M_Product_ID)
	{
		setElementType (REF_C_AcctSchemaElementType.Product);
		setSeqNo(SeqNo);
		setName (Name);
		setM_Product_ID(M_Product_ID);
	}	//	setTypeProduct
	
	/**
	 * 	Set Type Project
	 *	@param SeqNo sequence
	 *	@param Name name
	 *	@param C_Project_ID id
	 */
	public void setTypeProject (int SeqNo, String Name, int C_Project_ID)
	{
		setElementType (REF_C_AcctSchemaElementType.Project);
		setSeqNo(SeqNo);
		setName (Name);
		setC_Project_ID(C_Project_ID);
	}	//	setTypeProject

	/**
	 *  Is Element Type
	 *  @param elementType type
	 *	@return ELEMENTTYPE type
	 */
	public boolean isElementType (String elementType)
	{
		if (elementType == null)
			return false;
		return elementType.equals(getElementType());
	}   //  isElementType

	/**
	 * 	Get Default element value
	 *	@return default
	 */
	public int getDefaultValue()
	{
		String elementType = getElementType();
		int defaultValue = 0;
		if (elementType.equals(REF_C_AcctSchemaElementType.Organization))
			defaultValue = getOrg_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.Account))
			defaultValue = getC_ElementValue_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.BPartner))
			defaultValue = getC_BPartner_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.Product))
			defaultValue = getM_Product_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.Activity))
			defaultValue = getC_Activity_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.LocationFrom))
			defaultValue = getC_Location_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.LocationTo))
			defaultValue = getC_Location_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.Campaign))
			defaultValue = getC_Campaign_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.OrgTrx))
			defaultValue = getOrg_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.Project))
			defaultValue = getC_Project_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.SalesRegion))
			defaultValue = getC_SalesRegion_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserList1))
			defaultValue = getC_ElementValue_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserList2))
			defaultValue = getC_ElementValue_ID();
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserElement1))
			defaultValue = 0;
		else if (elementType.equals(REF_C_AcctSchemaElementType.UserElement2))
			defaultValue = 0;
		return defaultValue;
	}	//	getDefault


	/**
	 *  Get Acct Fact ColumnName
	 *  @return column name
	 */
	public String getColumnName()
	{
		String et = getElementType();
		return getColumnName(et);
	}	//	getColumnName

	/**
	 *  Get Display ColumnName
	 *  @return column name
	 */
	public String getDisplayColumnName()
	{
		String et = getElementType();
		if (REF_C_AcctSchemaElementType.UserElement1.equals(et) || REF_C_AcctSchemaElementType.UserElement2.equals(et))
		{
			if (m_ColumnName == null)
				m_ColumnName = MColumn.getColumnName(getCtx(), getAD_Column_ID());
			return m_ColumnName;
		}
		return getColumnName(et);
	}	//	getDisplayColumnName

	
	/**
	 *  String representation
	 *  @return info
	 */
	public String toString()
	{
		return "AcctSchemaElement[" + get_ID() 
			+ "-" + getName() 
			+ "(" + getElementType() + ")=" + getDefaultValue()  
			+ ",Pos=" + getSeqNo() + "]";
	}   //  toString

	
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true if it can be saved
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		if (getAD_Org_ID() != 0)
			setAD_Org_ID(0);
		String et = getElementType();
		if (isMandatory() &&
			(REF_C_AcctSchemaElementType.UserList1.equals(et) || REF_C_AcctSchemaElementType.UserList2.equals(et)
			|| REF_C_AcctSchemaElementType.UserElement1.equals(et) || REF_C_AcctSchemaElementType.UserElement2.equals(et)))
			setIsMandatory(false);
		else if (isMandatory())
		{
			String errorField = null;
			if (REF_C_AcctSchemaElementType.Account.equals(et) && getC_ElementValue_ID() == 0)
				errorField = "C_ElementValue_ID";
			else if (REF_C_AcctSchemaElementType.Activity.equals(et) && getC_Activity_ID() == 0)
				errorField = "C_Activity_ID";
			else if (REF_C_AcctSchemaElementType.BPartner.equals(et) && getC_BPartner_ID() == 0)
				errorField = "C_BPartner_ID";
			else if (REF_C_AcctSchemaElementType.Campaign.equals(et) && getC_Campaign_ID() == 0)
				errorField = "C_Campaign_ID";
			else if (REF_C_AcctSchemaElementType.LocationFrom.equals(et) && getC_Location_ID() == 0)
				errorField = "C_Location_ID";
			else if (REF_C_AcctSchemaElementType.LocationTo.equals(et) && getC_Location_ID() == 0)
				errorField = "C_Location_ID";
			else if (REF_C_AcctSchemaElementType.Organization.equals(et) && getOrg_ID() == 0)
				errorField = "Org_ID";
			else if (REF_C_AcctSchemaElementType.OrgTrx.equals(et) && getOrg_ID() == 0)
				errorField = "Org_ID";
			else if (REF_C_AcctSchemaElementType.Product.equals(et) && getM_Product_ID() == 0)
				errorField = "M_Product_ID";
			else if (REF_C_AcctSchemaElementType.Project.equals(et) && getC_Project_ID() == 0)
				errorField = "C_Project_ID";
			else if (REF_C_AcctSchemaElementType.SalesRegion.equals(et) && getC_SalesRegion_ID() == 0)
				errorField = "C_SalesRegion_ID";
			if (errorField != null)
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@IsMandatory@: @" + errorField + "@"));
				return false;
			}
		}
		//
		if (getAD_Column_ID() == 0
			&& (REF_C_AcctSchemaElementType.UserElement1.equals(et) || REF_C_AcctSchemaElementType.UserElement2.equals(et)))
		{
			log.saveError("Error", Msg.parseTranslation(getCtx(), "@IsMandatory@: @AD_Column_ID@"));
			return false;
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
		//	Default Value
		if (isMandatory() && is_ValueChanged("IsMandatory"))
		{
			if (REF_C_AcctSchemaElementType.Activity.equals(getElementType()))
				updateData ("C_Activity_ID", getC_Activity_ID());
			else if (REF_C_AcctSchemaElementType.BPartner.equals(getElementType()))
				updateData ("C_BPartner_ID", getC_BPartner_ID());
			else if (REF_C_AcctSchemaElementType.Product.equals(getElementType()))
				updateData ("M_Product_ID", getM_Product_ID());
			else if (REF_C_AcctSchemaElementType.Project.equals(getElementType()))
				updateData ("C_Project_ID", getC_Project_ID());
		}
		//	Resequence
		if (newRecord || is_ValueChanged("SeqNo"))
			MAccount.updateValueDescription(getCtx(), 
				"AD_Client_ID=" + getAD_Client_ID(), get_TrxName());
		//	Clear Cache
		s_cache.clear();
		return success;
	}	//	afterSave
	
	/**
	 * 	Update ValidCombination and Fact with mandatory value
	 *	@param element element
	 *	@param id new default
	 */
	private void updateData (String element, int id)
	{
		MAccount.updateValueDescription(getCtx(), 
			element + "=" + id, get_TrxName());
		//
		String sql = "UPDATE C_ValidCombination SET " + element + "=" + id
			+ " WHERE " + element + " IS NULL AND AD_Client_ID=" + getAD_Client_ID();
		int noC = DB.executeUpdate(sql, get_TrxName());
		//
		sql = "UPDATE Fact_Acct SET " + element + "=" + id
			+ " WHERE " + element + " IS NULL AND C_AcctSchema_ID=" + getC_AcctSchema_ID();
		int noF = DB.executeUpdate(sql, get_TrxName());
		//
		log.fine("ValidCombination=" + noC + ", Fact=" + noF);
	}	//	updateData
	
	
	
	/**
	 * 	After Delete
	 *	@param success success
	 *	@return success
	 */
	protected boolean afterDelete (boolean success)
	{
		//	Update Account Info
		MAccount.updateValueDescription(getCtx(), 
			"AD_Client_ID=" + getAD_Client_ID(), get_TrxName());
		//
		s_cache.clear();
		return success;
	}	//	afterDelete
	
}   //  AcctSchemaElement
