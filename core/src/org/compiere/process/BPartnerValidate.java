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
import java.sql.*;
import java.util.logging.*;

import org.compiere.model.MBPartner;
import org.compiere.model.MInvoice;
import org.compiere.model.MPayment;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Validate Business Partner
 *	
 *  @author Jorg Janke
 *  @version $Id: BPartnerValidate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_BPartner Validate",
name="Validate Business Partner",
description="Check data consistency of Business Partner",
help="Check the payments and invoices of a business partner and checks the balances.",
Identifier="75a3130a-dfc3-fecd-466a-fe66eb90a12c",
classname="org.compiere.process.BPartnerValidate",
updated="2015-06-20 10:10:12")	
public class BPartnerValidate extends SvrProcess
{
	/**	BPartner ID			*/
	@XendraProcessParameter(Name="Business Partner ",
			                ColumnName="C_BPartner_ID",
			                Description="Identifies a Business Partner",
			                Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="8ff957a5-86b5-9497-1c18-5a7d6f1ae032")	
	int p_C_BPartner_ID = 0;
	/** BPartner Group		*/
	@XendraProcessParameter(Name="Business Partner Group",
	                        ColumnName="C_BP_Group_ID",
			                Description="Business Partner Group",
			                Help="The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="-1",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="36f9c51f-e45d-4665-7c94-6828c5a45b4e")	
	int p_C_BP_Group_ID = 0;	

	/**
	 *	Prepare
	 */
	protected void prepare ()
	{
		p_C_BPartner_ID = getRecord_ID();
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_BPartner_ID"))
				p_C_BPartner_ID = para[i].getParameterAsInt();
			else if (name.equals("C_BP_Group_ID"))
				p_C_BP_Group_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 * 	Process
	 *	@return info
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		log.info("C_BPartner_ID=" + p_C_BPartner_ID + ", C_BP_Group_ID=" + p_C_BP_Group_ID); 
		if (p_C_BPartner_ID == 0 && p_C_BP_Group_ID == 0)
			throw new XendraUserError ("No Business Partner/Group selected");
		
		if (p_C_BP_Group_ID == 0)
		{
			MBPartner bp = new MBPartner (getCtx(), p_C_BPartner_ID, get_TrxName());
			if (bp.get_ID() == 0)
				throw new XendraUserError ("Business Partner not found - C_BPartner_ID=" + p_C_BPartner_ID);
			checkBP (bp);
		}
		else
		{
			String sql = "SELECT * FROM C_BPartner WHERE C_BP_Group_ID=? AND IsActive='Y'";
			PreparedStatement pstmt = null;
			try
			{
				pstmt = DB.prepareStatement (sql, get_TrxName());
				pstmt.setInt (1, p_C_BP_Group_ID);
				ResultSet rs = pstmt.executeQuery ();
				while (rs.next ())
				{
					MBPartner bp = new MBPartner (getCtx(), rs, get_TrxName());
					checkBP (bp);
				}
				rs.close ();
				pstmt.close ();
				pstmt = null;
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, sql, e);
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
		}
		//
		return "OK";
	}	//	doIt

	/**
	 * 	Check BP
	 *	@param bp bp
	 */
	private void checkBP (MBPartner bp)
	{
		addLog(0, null, null, bp.getName() + ":");
		//	See also VMerge.postMerge
		checkPayments(bp);
		checkInvoices(bp);
		//	
		bp.setTotalOpenBalance();
		bp.setActualLifeTimeValue();
		bp.save();
		//
	//	if (bp.getSO_CreditUsed().signum() != 0)
		addLog(0, null, bp.getSO_CreditUsed(), Msg.getElement(getCtx(), "SO_CreditUsed"));
		addLog(0, null, bp.getTotalOpenBalance(), Msg.getElement(getCtx(), "TotalOpenBalance"));
		addLog(0, null, bp.getActualLifeTimeValue(), Msg.getElement(getCtx(), "ActualLifeTimeValue"));
		//
		commit();
	}	//	checkBP
	
	
	/**
	 * 	Check Payments
	 *	@param bp business partner
	 */
	private void checkPayments (MBPartner bp)
	{
		//	See also VMerge.postMerge
		int changed = 0;
		MPayment[] payments = MPayment.getOfBPartner(getCtx(), bp.getC_BPartner_ID(), get_TrxName());
		for (int i = 0; i < payments.length; i++) 
		{
			MPayment payment = payments[i];
			if (payment.testAllocation())
			{
				payment.save();
				changed++;
			}
		}
		if (changed != 0)
			addLog(0, null, new BigDecimal(payments.length), 
				Msg.getElement(getCtx(), "C_Payment_ID") + " - #" + changed);
	}	//	checkPayments

	/**
	 * 	Check Invoices
	 *	@param bp business partner
	 */
	private void checkInvoices (MBPartner bp)
	{
		//	See also VMerge.postMerge
		int changed = 0;
		MInvoice[] invoices = MInvoice.getOfBPartner(getCtx(), bp.getC_BPartner_ID(), get_TrxName());
		for (int i = 0; i < invoices.length; i++) 
		{
			MInvoice invoice = invoices[i];
			if (invoice.testAllocation())
			{
				invoice.save();
				changed++;
			}
		}
		if (changed != 0)
			addLog(0, null, new BigDecimal(invoices.length), 
				Msg.getElement(getCtx(), "C_Invoice_ID") + " - #" + changed);
	}	//	checkInvoices
	
}	//	BPartnerValidate
