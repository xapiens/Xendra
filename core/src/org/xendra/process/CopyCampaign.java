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
package org.xendra.process;

import java.util.logging.*;

import org.compiere.model.MCampaign;
import org.compiere.model.MCampaignBonus;
import org.compiere.model.MCampaignDiscount;
import org.compiere.model.MProductBonus;
import org.compiere.model.persistence.X_C_CampaignDiscount;
import org.compiere.model.persistence.X_M_ProductBonus;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;

import org.xendra.annotations.*;

/**
 *	Copy Campaign
 *	
 *  @author xapiens
 *  @version $Id: 
 */
@XendraProcess(value="CopyCampaign",
name="CopyCampaign",
description="CopyCampaign",
help="",
Identifier="0970ba02-d845-110d-3452-aa7409db4474",
classname="org.xendra.process.CopyCampaign",
updated="2015-06-20 10:10:12")	
public class CopyCampaign extends SvrProcess
{
	@XendraProcessParameter(Name="CopyC_CampaignBonus",
			                ColumnName="CopyC_CampaignBonus",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="Y",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="3d61f52f-f3ae-ae6e-c4dd-5a96cde19eba")	
	private Boolean 		p_CopyC_CampaignBonus = false;
	@XendraProcessParameter(Name="CopyCampaignDiscount",
			                ColumnName="CopyCampaignDiscount",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="Y",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="b2d0ad53-5568-5687-a271-3d909860a28e")	
	private Boolean			p_CopyCampaignDiscount = false;
	@XendraProcessParameter(Name="Name",
			                ColumnName="Name",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=20,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="ca45100a-6472-70a0-2791-ae1d5535f18d")	
	private String			p_Name = "";
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
			else if (name.equals("CopyC_CampaignBonus"))
				p_CopyC_CampaignBonus = para[i].getParameter().equals("Y");
			else if (name.equals("CopyCampaignDiscount"))
				p_CopyCampaignDiscount = para[i].getParameter().equals("Y");
			else if (name.equals("Name"))
				p_Name = (String) para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message (clear text)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		int To_C_Campaign_ID = getRecord_ID();
		MCampaign campaign = new MCampaign(Env.getCtx(), To_C_Campaign_ID, get_TrxName());
		MCampaign campaignTo = new MCampaign(Env.getCtx(), 0, get_TrxName());
		MCampaign.copyValues(campaign, campaignTo);
		if (p_Name.length() == 0)
			p_Name = "Copia de " + campaign.getName();		
		campaignTo.setValue(p_Name);
		campaignTo.setName(p_Name);
		campaignTo.setStartDate(null);
		campaignTo.setEndDate(null);
		if (campaignTo.save())
		{			
			if (p_CopyC_CampaignBonus)
			{
				MCampaignBonus[] listbonus = MCampaignBonus.getByCampaign(campaign, get_TrxName());
				if (listbonus.length > 0)
				{
					for (MCampaignBonus bonus:listbonus)
					{
						MCampaignBonus bonusTo = new MCampaignBonus(Env.getCtx(), 0, get_TrxName());
						MCampaignBonus.copyValues(bonus, bonusTo);
						bonusTo.setC_Campaign_ID(campaignTo.getC_Campaign_ID());
						if (bonusTo.save())
						{							
							//
							X_M_ProductBonus[] listproductbonus = MProductBonus.getByCampaignBonus(bonus, get_TrxName());
							if (listproductbonus.length  > 0)
							{
								for (X_M_ProductBonus productbonus:listproductbonus)
								{
									X_M_ProductBonus productBonusTo = new X_M_ProductBonus(Env.getCtx(), 0, get_TrxName());
									X_M_ProductBonus.copyValues(productbonus, productBonusTo);
									productBonusTo.setC_CampaignBonus_ID(bonusTo.getC_CampaignBonus_ID());									
									if (productBonusTo.save())
									{
										
									}
								}
							}							
						}
					}
				}			
			}
			if (p_CopyCampaignDiscount)
			{
				X_C_CampaignDiscount[] listcampaigndiscount = MCampaignDiscount.getbyCampaign(campaign, get_TrxName());
				if (listcampaigndiscount.length > 0)
				{
					for (X_C_CampaignDiscount campaigndiscount:listcampaigndiscount)
					{
						X_C_CampaignDiscount campaigndiscountTo = new X_C_CampaignDiscount(Env.getCtx(), 0 , get_TrxName());
						X_C_CampaignDiscount.copyValues(campaigndiscount, campaigndiscountTo);
						campaigndiscountTo.setC_Campaign_ID(campaignTo.getC_Campaign_ID());						
						if (campaigndiscountTo.save())
						{
						}
					}
				}
			}
		}
		return null;
		//return dt.getName() + ": " + newOrder.getDocumentNo();
	}	//	doIt
}	//	CopyOrder
