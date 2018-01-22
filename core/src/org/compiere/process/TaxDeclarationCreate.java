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

import java.sql.*;
import java.util.logging.*;

import org.compiere.model.MFactAcct;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceTax;
import org.compiere.model.MTaxDeclaration;
import org.compiere.model.MTaxDeclarationAcct;
import org.compiere.model.MTaxDeclarationLine;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 * 	Create Tax Declaration
 *	
 *  @author Jorg Janke
 *  @version $Id: TaxDeclarationCreate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_TaxDeclaration Create",
name="Create Tax Declaration",
description="Create Tax Declaration from Documents",
help="",
Identifier="5601235c-95d4-53c3-5bd1-26c22612b8e5",
classname="org.compiere.process.TaxDeclarationCreate",
updated="2015-06-20 10:10:12")	
public class TaxDeclarationCreate extends SvrProcess
{
	/**	Tax Declaration			*/
	private int 				p_C_TaxDeclaration_ID = 0;
	/** Delete Old Lines		*/
	@XendraProcessParameter(Name="Delete old/existing records",
			                ColumnName="DeleteOld",
			                Description="Otherwise records will be added",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="N",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="de4cc317-b4af-fe2e-b925-10f8d4004653")			                
	private boolean				p_DeleteOld = true;
	
	/**	Tax Declaration			*/
	private MTaxDeclaration 	m_td = null;
	/** TDLines					*/
	private int					m_noLines = 0;
	/** TDAccts					*/
	private int					m_noAccts = 0;
	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("DeleteOld"))
				p_DeleteOld = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_C_TaxDeclaration_ID = getRecord_ID();
	}	//	prepare

	
	/**
	 * 	Process
	 *	@return info
	 *	@throws Exception
	 */
	protected String doIt () throws Exception
	{
		log.info("C_TaxDeclaration_ID=" + p_C_TaxDeclaration_ID);
		m_td = new MTaxDeclaration (getCtx(), p_C_TaxDeclaration_ID, get_TrxName());
		if (m_td.get_ID() == 0)
			throw new XendraSystemError("@NotDound@ @C_TaxDeclaration_ID@ = " + p_C_TaxDeclaration_ID);
		
		if (p_DeleteOld)
		{
			//	Delete old
			String sql = "DELETE FROM C_TaxDeclarationLine WHERE C_TaxDeclaration_ID=?";
			int no = DB.executeUpdate(sql, p_C_TaxDeclaration_ID, false, get_TrxName());
			if (no != 0)
				log.config("Delete Line #" + no);
			sql = "DELETE FROM C_TaxDeclarationAcct WHERE C_TaxDeclaration_ID=?";
			no = DB.executeUpdate(sql, p_C_TaxDeclaration_ID, false, get_TrxName());
			if (no != 0)
				log.config("Delete Acct #" + no);
		}

		//	Get Invoices
		String sql = "SELECT * FROM C_Invoice i "
			+ "WHERE TRUNC(i.DateInvoiced) >= ? AND TRUNC(i.DateInvoiced) <= ? "
			+ " AND Processed='Y'"
			+ " AND NOT EXISTS (SELECT * FROM C_TaxDeclarationLine tdl "
				+ "WHERE i.C_Invoice_ID=tdl.C_Invoice_ID)";
		PreparedStatement pstmt = null;
		int noInvoices = 0;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setTimestamp(1, m_td.getDateFrom());
			pstmt.setTimestamp(2, m_td.getDateTo());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				create (new MInvoice (getCtx(), rs, null));	//	no lock
				noInvoices++;
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log (Level.SEVERE, sql, e);
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
		
		return "@C_Invoice_ID@ #" + noInvoices 
			+ " (" + m_noLines + ", " + m_noAccts + ")";
	}	//	doIt
	
	/**
	 * 	Create Data
	 *	@param invoice invoice
	 */
	private void create (MInvoice invoice)
	{
		/**	Lines					**
		MInvoiceLine[] lines = invoice.getLines();
		for (int i = 0; i < lines.length; i++)
		{
			MInvoiceLine line = lines[i];
			if (line.isDescription())
				continue;
			//
			MTaxDeclarationLine tdl = new MTaxDeclarationLine (m_td, invoice, line);
			tdl.setLine((m_noLines+1) * 10);
			if (tdl.save())
				m_noLines++;
		}
		/** **/

		/** Invoice Tax				**/
		MInvoiceTax[] taxes = invoice.getTaxes(false);
		for (int i = 0; i < taxes.length; i++)
		{
			MInvoiceTax tLine = taxes[i];
			//
			MTaxDeclarationLine tdl = new MTaxDeclarationLine (m_td, invoice, tLine);
			tdl.setLine((m_noLines+1) * 10);
			if (tdl.save())
				m_noLines++;
		}
		/** **/

		/**	Acct					**/
		String sql = "SELECT * FROM Fact_Acct WHERE AD_Table_ID=? AND Record_ID=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setInt (1, MInvoice.Table_ID);
			pstmt.setInt (2, invoice.getC_Invoice_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				MFactAcct fact = new MFactAcct(getCtx(), rs, null);	//	no lock
				MTaxDeclarationAcct tda = new MTaxDeclarationAcct (m_td, fact);
				tda.setLine((m_noAccts+1) * 10);
				if (tda.save())
					m_noAccts++;
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log (Level.SEVERE, sql, e);
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
		/** **/
	}	//	invoice
	
}	//	TaxDeclarationCreate
