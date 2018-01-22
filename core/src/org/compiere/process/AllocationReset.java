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

import java.math.BigDecimal;
import java.sql.*;
import java.util.logging.*;

import org.compiere.model.MAllocationHdr;
import org.compiere.model.MAllocationLine;
import org.compiere.model.MBPartner;
import org.compiere.model.MConversionRate;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_AllocationHdr;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Reset (delete) Allocations	
 *	
 *  @author Jorg Janke
 *  @version $Id: AllocationReset.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Allocation_Reset",
name="Reset Allocation",
description="Reset (delete) allocation of invoices to payments",
help="Delete Allocations for a business partner or business partner group, accounting date range or individual allocation. In contrast to \"Void\" in \"View Allocation\", the allocation is deleted (no trace), if the period is open.",
Identifier="43364be9-2101-4f35-fde2-a7c6ef73f909",				   
classname="org.compiere.process.AllocationReset",
updated="2015-06-20 10:10:12")						
public class AllocationReset extends SvrProcess
{
	/** BP Group				*/
	@XendraProcessParameter(Name="Business Partner Group",	
	ColumnName=X_C_BPartner.COLUMNNAME_C_BP_Group_ID,
	Description="Business Partner Group",
	Help="The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.",
	AD_Reference_ID=DisplayType.TableDir,
	SeqNo=10,
	ReferenceValueID="",	
	ValRuleID="",
	FieldLength=10,
	IsMandatory=false,
	IsRange=false,
	DefaultValue="",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="c9f6ad75-b15e-eab8-164c-ab7e22b71958")				
	private int			p_C_BP_Group_ID = 0;
	/** BPartner				*/
	@XendraProcessParameter(Name="Business Partner",	
	ColumnName=X_C_BPartner.COLUMNNAME_C_BPartner_ID,
	Description="Identifies a Business Partner",
	Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
	AD_Reference_ID=DisplayType.Search,
	SeqNo=20,
	ReferenceValueID="",	
	ValRuleID="",
	FieldLength=10,
	IsMandatory=false,
	IsRange=false,
	DefaultValue="",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="6a467935-03c2-d0f9-ba2b-5402620d6eb3")					
	private int			p_C_BPartner_ID = 0;
	/** Date Acct From			*/
	@XendraProcessParameter(Name="Account Date",	
	ColumnName="DateAcct",
	Description="Accounting Date",
	Help="The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.",
	AD_Reference_ID=DisplayType.Date,
	SeqNo=30,
	ReferenceValueID="",	
	ValRuleID="",
	FieldLength=7,
	IsMandatory=true,
	IsRange=true,
	DefaultValue="",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="20918b4c-48c2-f516-880c-36889732acd0")	
	private Timestamp	p_DateAcct_From = null;
	/** Date Acct To			*/
	private Timestamp	p_DateAcct_To = null;
	/** Allocation directly		*/
	@XendraProcessParameter(Name="Allocation",	
	ColumnName=X_C_AllocationHdr.COLUMNNAME_C_AllocationHdr_ID,
	Description="Payment allocation",
	Help="",
	AD_Reference_ID=DisplayType.Search,
	SeqNo=40,
	ReferenceValueID="",	
	ValRuleID="",
	FieldLength=10,
	IsMandatory=true,
	IsRange=false,
	DefaultValue="",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="d80226c1-c3bd-685b-bfc1-3e198af3fb72")	
	private int			p_C_AllocationHdr_ID = 0;
	/** Transaction				*/
	private Trx			m_trx = null;
	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			log.fine("prepare - " + para[i]);
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_BP_Group_ID"))
				p_C_BP_Group_ID = para[i].getParameterAsInt();
			else if (name.equals("C_BPartner_ID"))
				p_C_BPartner_ID = para[i].getParameterAsInt();
			else if (name.equals("C_AllocationHdr_ID"))
				p_C_AllocationHdr_ID = para[i].getParameterAsInt();
			else if (name.equals("DateAcct"))
			{
				p_DateAcct_From = (Timestamp)para[i].getParameter();
				p_DateAcct_To = (Timestamp)para[i].getParameter_To();
			}
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare
	
	/**
	 * 	Process
	 *	@return message
	 *	@throws Exception
	 */
	protected String doIt() throws Exception
	{
		log.info ("C_BP_Group_ID=" + p_C_BP_Group_ID + ", C_BPartner_ID=" + p_C_BPartner_ID
			+ ", DateAcct= " + p_DateAcct_From + " - " + p_DateAcct_To
			+ ", C_AllocationHdr_ID=" + p_C_AllocationHdr_ID);

		m_trx = Trx.get(Trx.createTrxName("AllocReset"), true);
		int count = 0;

		if (p_C_AllocationHdr_ID != 0)
		{
			MAllocationHdr hdr = new MAllocationHdr(getCtx(), p_C_AllocationHdr_ID, m_trx.getTrxName());
			if (delete(hdr))
				count++;
			m_trx.close();
			return "@Deleted@ #" + count;
		}
		
		//	Selection
		StringBuffer sql = new StringBuffer("SELECT * FROM C_AllocationHdr ah "
			+ "WHERE EXISTS (SELECT * FROM C_AllocationLine al "
				+ "WHERE ah.C_AllocationHdr_ID=al.C_AllocationHdr_ID");
		if (p_C_BPartner_ID != 0)
			sql.append(" AND al.C_BPartner_ID=?");
		else if (p_C_BP_Group_ID != 0)
			sql.append(" AND EXISTS (SELECT * FROM C_BPartner bp "
					+ "WHERE bp.C_BPartner_ID=al.C_BPartner_ID AND bp.C_BP_Group_ID=?)");
		else
			sql.append(" AND AD_Client_ID=?");
		if (p_DateAcct_From != null)
			sql.append(" AND TRIM(ah.DateAcct) >= ?");
		if (p_DateAcct_To != null)
			sql.append(" AND TRIM(ah.DateAcct) <= ?");
		//	Do not delete Cash Trx
		sql.append(" AND al.C_CashLine_ID IS NULL)");
		//	Open Period
		sql.append(" AND EXISTS (SELECT * FROM C_Period p"
			+ " INNER JOIN C_PeriodControl pc ON (p.C_Period_ID=pc.C_Period_ID AND pc.DocBaseType='CMA') "
			+ "WHERE ah.DateAcct BETWEEN p.StartDate AND p.EndDate)");
		//
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql.toString(), m_trx.getTrxName());
			int index = 1;
			if (p_C_BPartner_ID != 0)
				pstmt.setInt(index++, p_C_BPartner_ID);
			else if (p_C_BP_Group_ID != 0)
				pstmt.setInt(index++, p_C_BP_Group_ID);
			else
				pstmt.setInt(index++, Env.getAD_Client_ID(getCtx()));
			if (p_DateAcct_From != null)
				pstmt.setTimestamp(index++, p_DateAcct_From);
			if (p_DateAcct_To != null)
				pstmt.setTimestamp(index++, p_DateAcct_To);
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				MAllocationHdr hdr = new MAllocationHdr(getCtx(), rs, m_trx.getTrxName());				
				if (delete(hdr))
					count++;
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
			m_trx.rollback();
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
		m_trx.close();
		return "@Deleted@ #" + count;
	}	//	doIt

	
	private boolean delete(MAllocationHdr hdr)
	{
	//	m_trx.start();
		boolean success = false;
		
		MAllocationLine[] lines = hdr.getLines(false);
		for (int i = 0; i < lines.length; i++)
		{
			MAllocationLine line = lines[i];
			
			//	Update BP Statistics
			MBPartner bp = new MBPartner (getCtx(), line.getC_BPartner_ID(), get_TrxName());
			//	Update total revenue and balance / credit limit (reversed on AllocationLine.processIt)			
			BigDecimal invAmt = MConversionRate.convertBase(getCtx(), 0, line.getAmount(),	//	CM adjusted 
					hdr.getC_Currency_ID(), hdr.getDateAcct(), 0, hdr.getAD_Client_ID(), hdr.getAD_Org_ID());
			if (invAmt != null)
			{
				BigDecimal newBalance = bp.getTotalOpenBalance(false);
				if (newBalance == null)
					newBalance = Env.ZERO;				
//				if (invoice.isSOTrx())
//				{
//					newBalance = newBalance.subtract(invAmt);
//					log.fine("GrandTotal=" + invoice.getGrandTotal(true) + "(" + invAmt 
//						+ ") Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);				
//				}	//	SO
//				else
//				{
					newBalance = newBalance.add(invAmt);
					//

					BigDecimal newLifeAmt = bp.getActualLifeTimeValue();
					if (newLifeAmt == null)
						newLifeAmt = invAmt;
					else
						newLifeAmt = newLifeAmt.add(invAmt);
					BigDecimal newCreditAmt = bp.getSO_CreditUsed();
					if (newCreditAmt == null)
						newCreditAmt = invAmt;
					else
						newCreditAmt = newCreditAmt.add(invAmt);
					//
					log.fine("GrandTotal=" + line.getAmount() + "(" + invAmt 
						+ ") BP Life=" + bp.getActualLifeTimeValue() + "->" + newLifeAmt
						+ ", Credit=" + bp.getSO_CreditUsed() + "->" + newCreditAmt
						+ ", Balance=" + bp.getTotalOpenBalance(false) + " -> " + newBalance);
					bp.setActualLifeTimeValue(newLifeAmt);
					bp.setSO_CreditUsed(newCreditAmt);				
//				}
				bp.setTotalOpenBalance(newBalance);
				bp.setSOCreditStatus();
				bp.save(m_trx.getTrxName());
			}			
			//DocLine_Allocation docLine = new DocLine_Allocation(line, this);
			
			//	Get Payment Conversion Rate
			//if (line.getC_Payment_ID() != 0)
			//{
			//	MPayment payment = new MPayment (getCtx(), line.getC_Payment_ID(), getTrxName());
			//	int C_ConversionType_ID = payment.getC_ConversionType_ID();
			//	docLine.setC_ConversionType_ID(C_ConversionType_ID);
			//}
			//
			//log.fine(docLine.toString());
			//list.add (docLine);
		}
		
		if (hdr.delete(true, m_trx.getTrxName()))
		{
			log.fine(hdr.toString());
			success = true;
		}
		if (success)
			success = m_trx.commit();
		else
			m_trx.rollback();
		return success;
	}	//	delete
	
	
	/**
	 * 	Set BPartner (may not be required
	 */
	private void setBPartner()
	{
		/**
		UPDATE C_AllocationLine al
		SET C_BPartner_ID=(SELECT C_BPartner_ID FROM C_Payment p WHERE al.C_Payment_ID=p.C_Payment_ID)
		WHERE C_BPartner_ID IS NULL AND C_Payment_ID IS NOT NULL;
		UPDATE C_AllocationLine al
		SET C_BPartner_ID=(SELECT C_BPartner_ID FROM C_Invoice i WHERE al.C_Invoice_ID=i.C_Invoice_ID)
		WHERE C_BPartner_ID IS NULL AND C_Invoice_ID IS NOT NULL;
		UPDATE C_AllocationLine al
		SET C_BPartner_ID=(SELECT C_BPartner_ID FROM C_Order o WHERE al.C_Order_ID=o.C_Order_ID)
		WHERE C_BPartner_ID IS NULL AND C_Order_ID IS NOT NULL;
		COMMIT
		**/
	}	//	setBPartner

}	//	AllocationReset
