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

import java.math.*;
import java.util.logging.*;

import org.compiere.model.MBPartner;
import org.compiere.util.DisplayType;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	UnLink Business Partner from Organization 
 *	
 *  @author Jorg Janke
 *  @version $Id: BPartnerOrgUnLink.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_BPartner Org UnLink",
name="UnLink Business Partner Org",
description="UnLink Business Partner from an Organization",
help="UnLink a Business Partner Linked to an Organization (for explicit inter-org documents)",
Identifier="84738ccd-6266-d1f8-8ea8-1fcf072f3d4b",
classname="org.compiere.process.BPartnerOrgUnLink",
updated="2015-06-20 10:10:12")	
public class BPartnerOrgUnLink extends SvrProcess
{
	/** Business Partner		*/
	@XendraProcessParameter(Name="Business Partner ",
	                        ColumnName="C_BPartner_ID",
			                Description="Identifies a Business Partner",
			                Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
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
			                Identifier="ba9fe52c-f40d-b927-7986-ce67a56fe96a")	
	private int			p_C_BPartner_ID;
	
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
			else if (name.equals("C_BPartner_ID"))
				p_C_BPartner_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message (text with variables)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		log.info("doIt - C_BPartner_ID=" + p_C_BPartner_ID); 
		if (p_C_BPartner_ID == 0)
			throw new IllegalArgumentException ("No Business Partner ID");
		MBPartner bp = new MBPartner (getCtx(), p_C_BPartner_ID, get_TrxName());
		if (bp.get_ID() == 0)
			throw new IllegalArgumentException ("Business Partner not found - C_BPartner_ID=" + p_C_BPartner_ID);
		//
		if (bp.getAD_OrgBP_ID_Int() == 0)
			throw new IllegalArgumentException ("Business Partner not linked to an Organization");
		bp.setAD_OrgBP_ID(null);
		if (!bp.save())
			throw new IllegalArgumentException ("Business Partner not changed");
		
		return "OK";
	}	//	doIt
	
}	//	BPartnerOrgUnLink
