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
package org.compiere.report;

import java.sql.*;
import java.util.*;

import org.compiere.model.persistence.X_PA_ReportSource;
import org.compiere.model.reference.REF_C_AcctSchemaElementType;



/**
 *	Report Line Source Model
 *
 *  @author Jorg Janke
 *  @version $Id: MReportSource.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class MReportSource extends X_PA_ReportSource
{
	/**
	 * 	Constructor
	 * 	@param ctx context
	 * 	@param PA_ReportSource_ID id
	 * 	@param trxName transaction
	 */
	public MReportSource (Properties ctx, int PA_ReportSource_ID, String trxName)
	{
		super (ctx, PA_ReportSource_ID, trxName);
		if (PA_ReportSource_ID == 0)
		{
		}
	}	//	MReportSource

	/**
	 * 	Constructor
	 * 	@param ctx context
	 * 	@param rs ResultSet to load from
	 * 	@param trxName transaction
	 */
	public MReportSource (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MReportSource


	/**
	 * 	Get SQL where clause
	 * 	@param PA_Hierarchy_ID hierarchy 
	 * 	@return where clause
	 */
	public String getWhereClause(int PA_Hierarchy_ID)
	{
		String et = getElementType();
		//	ID for Tree Leaf Value
		int ID = 0;
		//
		if (REF_C_AcctSchemaElementType.Account.equals(et))
			ID = getC_ElementValue_ID ();
		else if (REF_C_AcctSchemaElementType.Activity.equals(et))
			ID = getC_Activity_ID ();
		else if (REF_C_AcctSchemaElementType.BPartner.equals(et))
			ID = getC_BPartner_ID ();
		else if (REF_C_AcctSchemaElementType.Campaign.equals(et))
			ID = getC_Campaign_ID ();
		else if (REF_C_AcctSchemaElementType.LocationFrom.equals(et))
			ID = getC_Location_ID ();
		else if (REF_C_AcctSchemaElementType.LocationTo.equals(et))
			ID = getC_Location_ID ();
		else if (REF_C_AcctSchemaElementType.Organization.equals(et))
			ID = getOrg_ID ();
		else if (REF_C_AcctSchemaElementType.Product.equals(et))
			ID = getM_Product_ID ();
		else if (REF_C_AcctSchemaElementType.Project.equals(et))
			ID = getC_Project_ID ();
		else if (REF_C_AcctSchemaElementType.SalesRegion.equals(et))
			ID = getC_SalesRegion_ID ();
		else if (REF_C_AcctSchemaElementType.OrgTrx.equals(et))
			ID = getOrg_ID ();	//	(re)uses Org_ID
		else if (REF_C_AcctSchemaElementType.UserList1.equals(et))
			ID = getC_ElementValue_ID ();
		else if (REF_C_AcctSchemaElementType.UserList2.equals(et))
			ID = getC_ElementValue_ID ();
//		else if (REF_C_AcctSchemaElementType.UserElement1.equals(et))
//			ID = getUserElement1_ID ();
//		else if (REF_C_AcctSchemaElementType.UserElement2.equals(et))
//			ID = getUserElement2_ID ();
		//
		return MReportTree.getWhereClause (getCtx(), PA_Hierarchy_ID, et, ID);
	}	//	getWhereClause


	/**
	 * 	String Representation
	 * 	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MReportSource[")
			.append(get_ID()).append(" - ").append(getDescription())
			.append(" - ").append(getElementType());
		sb.append ("]");
		return sb.toString ();
	}	//	toString


	/**************************************************************************
	 * 	Copy Constructor
	 * 	@param ctx context
	 * 	@param AD_Client_ID parent
	 * 	@param AD_Org_ID parent
	 * 	@param PA_ReportLine_ID parent
	 * 	@param source copy source
	 * 	@param trxName transaction
	 * 	@return Report Source
	 */
	public static MReportSource copy (Properties ctx, int AD_Client_ID, int AD_Org_ID, 
		int PA_ReportLine_ID, MReportSource source, String trxName)
	{
		MReportSource retValue = new MReportSource (ctx, 0, trxName);
		MReportSource.copyValues(source, retValue, AD_Client_ID, AD_Org_ID);
		retValue.setPA_ReportLine_ID(PA_ReportLine_ID);
		return retValue;
	}	//	copy

}	//	MReportSource
