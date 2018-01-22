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

import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.util.*;

/**
 *	Business Partner Info Model for Query
 *	
 *  @author Jorg Janke
 *  @version $Id: MBPartnerInfo.java 3654 2011-11-04 01:49:49Z xapiens $
 */
public class MBPartnerInfo extends X_C_BPartner
{
	/**
	 * 	Find BPartners
	 *	@param ctx context
	 *	@param Value Business Partner Value
	 *	@param Name Business Partner Name
	 *	@param Contact Contact/User Name
	 *	@param EMail Contact/User EMail
	 *	@param Phone phone
	 *	@param City city
	 *	@return array if of info
	 */
	public static MBPartnerInfo[] find (Properties ctx, 
		String Value, String Name, String Contact, String EMail, String Phone, String City)
	{
		StringBuffer sql = new StringBuffer ("SELECT * FROM RV_BPartner WHERE IsActive='Y'");
		StringBuffer sb = new StringBuffer();
		Value = getFindParameter (Value);
		if (Value != null)
			sb.append("UPPER(Value) LIKE ?");
		Name = getFindParameter (Name);
		if (Name != null)
		{
			if (sb.length() > 0)
				sb.append(" OR ");
			sb.append("UPPER(Name) LIKE ?");
		}
		Contact = getFindParameter (Contact);
		if (Contact != null)
		{
			if (sb.length() > 0)
				sb.append(" OR ");
			sb.append("UPPER(ContactName) LIKE ?");
		}
		EMail = getFindParameter (EMail);
		if (EMail != null)
		{
			if (sb.length() > 0)
				sb.append(" OR ");
			sb.append("UPPER(EMail) LIKE ?");
		}
		Phone = getFindParameter (Phone);
		if (Phone != null)
		{
			if (sb.length() > 0)
				sb.append(" OR ");
			sb.append("UPPER(Phone) LIKE ?");
		}
		City = getFindParameter (City);
		if (City != null)
		{
			if (sb.length() > 0)
				sb.append(" OR ");
			sb.append("UPPER(City) LIKE ?");
		}
		if (sb.length() > 0)
			sql.append(" AND (").append(sb).append(")");
		sql.append(" ORDER BY Value");
		//
		String finalSQL = MRole.getDefault().addAccessSQL(sql.toString(), 
			"RV_BPartner", MRole.SQL_NOTQUALIFIED, MRole.SQL_RO);
		ArrayList<MBPartnerInfo> list = new ArrayList<MBPartnerInfo>();
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(finalSQL, null);
			int index = 1;
			if (Value != null)
				pstmt.setString(index++, Value);
			if (Name != null)
				pstmt.setString(index++, Name);
			if (Contact != null)
				pstmt.setString(index++, Contact);
			if (EMail != null)
				pstmt.setString(index++, EMail);
			if (Phone != null)
				pstmt.setString(index++, Phone);
			if (City != null)
				pstmt.setString(index++, City);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new MBPartnerInfo (ctx, rs, null));
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, "find - " + finalSQL, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		//	Return
		MBPartnerInfo[] retValue = new MBPartnerInfo[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	find
	
	//cchaucca:ini
	public static Object[] findAll (int Org_ID,String OnlyCustomer)
		{
			String sql = "SELECT c_bpartner_id, referenceno, value, name, ad_user_id, contactname, c_bpartner_location_id, city,  address1 FROM RV_BPartner " +
					"WHERE IsActive='Y' AND ad_org_id=? and IsCustomer=?";
			ArrayList<Object> list = new ArrayList<Object>();
			PreparedStatement pstmt = null;
			try
			{
				pstmt = DB.prepareStatement(sql);
				pstmt.setInt(1,Org_ID);
				pstmt.setString(2,OnlyCustomer);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next())
					list.add(new Object[]{rs.getObject("c_bpartner_id"),
							rs.getObject("referenceno"),
							rs.getObject("value"),
							rs.getObject("name"),
							rs.getObject("ad_user_id"),
							rs.getObject("contactname"),
							rs.getObject("c_bpartner_location_id"),
							rs.getObject("city"),
							rs.getObject("address1")});
				rs.close();
				pstmt.close();
				pstmt = null;
			}
			catch (Exception e)
			{
				//s_log.log(Level.SEVERE, "find - " + sql, e);
				e.printStackTrace();
			}
			try
			{
				if (pstmt != null)
					pstmt.close();
				pstmt = null;
			}
			catch (Exception e)
			{
				pstmt = null;
				e.printStackTrace();
			}
			return list.toArray();
		}	//	find
	public static Object[][] findAllColums ()
	{
		Object[][] Columns={
			{Msg.translate(Env.getCtx(), "C_BPartner_ID"),"0"},	//0
			{Msg.translate(Env.getCtx(), "TaxID"),"70"},			//1
			{Msg.translate(Env.getCtx(), "Value"),"0"},		//2
				{Msg.translate(Env.getCtx(), "Name"),"180"},		//3
			{Msg.translate(Env.getCtx(), "AD_User_ID"),"0"},		//4
				{Msg.translate(Env.getCtx(), "ContactName"),"90"},			//5	
				{Msg.translate(Env.getCtx(), "C_BPartner_Location_ID"),"0"},	//6
			{Msg.translate(Env.getCtx(), "City"),"70"},	//7
			{Msg.translate(Env.getCtx(), "Address1"),"110"}//8
			};
		return Columns;
	}	//	find
	
	public static MBPartnerInfo get(Properties ctx,int C_BPartner_ID,int AD_Client_ID)
	{
		MBPartnerInfo bpinfo=null;
		
		String sql = "SELECT * FROM RV_BPartner WHERE IsActive='Y' AND C_BPartner_ID=? AND AD_Client_ID=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql);
			pstmt.setInt(1,C_BPartner_ID);
			pstmt.setInt(2,AD_Client_ID);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				bpinfo=new MBPartnerInfo (ctx, rs, null);
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		try{
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		//	Return
		return bpinfo;
	}	//	find

	//cchaucca:fin
	
	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MBPartnerInfo.class);
	
	/**************************************************************************
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MBPartnerInfo (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MBPartnerInfo

}	//	MBPartnerInfo
