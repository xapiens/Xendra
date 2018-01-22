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
import java.text.SimpleDateFormat;
import java.util.logging.*;

import org.compiere.model.MAllocationHdr;
import org.compiere.model.MBOEStatement;
import org.compiere.model.MBankStatement;
import org.compiere.model.MCash;
import org.compiere.model.MInOut;
import org.compiere.model.MInventory;
import org.compiere.model.MInvoice;
import org.compiere.model.MJournal;
import org.compiere.model.MMatchInv;
import org.compiere.model.MMatchPO;
import org.compiere.model.MMovement;
import org.compiere.model.MOrder;
import org.compiere.model.MPayment;
import org.compiere.model.MProjectIssue;
import org.compiere.model.MRequisition;
import org.compiere.model.MRetentionStatement;
import org.compiere.model.persistence.X_C_Period;
import org.compiere.model.persistence.X_M_Production;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.report.*;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Accounting Fact Reset
 *	
 *  @author Jorg Janke
 *  @version $Id: FactAcctReset.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="Fact_Acct_Reset DELETE",
name="Reset Accounting",
description="Reset Accounting Entries ** Stop Accounting Server before starting **",
help="Delete accounting records of documents to be re-created by the next run of the accounting engine.  This is a dramatic step and you want to do this ONLY after changes of the accounting structure (e.g. different default accounts, etc.) and if fixing via manual Journal entries is not sensible.",
Identifier="497b573e-683a-2f8b-fc59-53ff611eaa37",
classname="org.compiere.process.FactAcctReset",
updated="2015-06-20 10:10:12")	
public class FactAcctReset extends SvrProcess
{
	/**	Client Parameter		*/
	@XendraProcessParameter(Name="Client",
			                ColumnName="AD_Client_ID",
			                Description="Client/Tenant for this installation.",
			                Help="A Client is a company or a legal entity. You cannot share data between Clients. Tenant is a synonym for Client.",
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
			                Identifier="73b9bc36-96fd-1f98-a5e7-02f6af3f4d7a")	
	private int		p_AD_Client_ID = 0;
	/** Table Parameter			*/
	@XendraProcessParameter(Name="Table",
			                ColumnName="AD_Table_ID",
			                Description="Database Table information",
			                Help="The Database Table provides the information of the table definition",
			                AD_Reference_ID=DisplayType.Table,
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
			                Identifier="dad8d072-faf3-0e4c-c5e2-0da17426615f")	
	private int		p_AD_Table_ID = 0;
	/** Doc Type */
@XendraProcessParameter(Name="C_DocType_ID",
                ColumnName="C_DocType_ID",
                Description="C_DocType_ID",
                Help="",
                AD_Reference_ID=DisplayType.TableDir,
                SeqNo=40,
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
                Identifier="a9c79f25-edf8-07a5-bb3f-7b189d783c1a")
	private int 	p_C_DocType_ID = 0;
	/**	Delete Parameter		*/
@XendraProcessParameter(Name="Delete existing Accounting Entries",
                ColumnName="DeletePosting",
                Description="The selected accounting entries will be deleted!  DANGEROUS !!!",
                Help="",
                AD_Reference_ID=DisplayType.YesNo,
                SeqNo=30,
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
                Identifier="2077d6c1-7030-6431-d191-a1dbe8822d2f")
	private boolean	p_DeletePosting = false;
	
	private int		m_countReset = 0;
	private int		m_countDelete = 0;
	@XendraProcessParameter(Name="DateAcct",
			                ColumnName="DateAcct",
			                Description="DateAcct",
			                Help="",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=50,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=true,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="292797f7-57a5-ac15-f006-556e4c75ca0e")	
	private Timestamp p_DateAcct_From = null;
	private Timestamp p_DateAcct_To = null;
	private Object docBaseType;
	
	
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
			else if (name.equals("AD_Client_ID"))
				p_AD_Client_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("AD_Table_ID"))
				p_AD_Table_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("DeletePosting"))
				p_DeletePosting = "Y".equals(para[i].getParameter());
			else if (name.equals("DateAcct")) {
				p_DateAcct_From = (Timestamp)para[i].getParameter();
				p_DateAcct_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("C_DocType_ID"))
				p_C_DocType_ID = ((BigDecimal)para[i].getParameter()).intValue();			
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
		String error = null;
		log.info("AD_Client_ID=" + p_AD_Client_ID 
			+ ", AD_Table_ID=" + p_AD_Table_ID + ", DeletePosting=" + p_DeletePosting);
		//	List of Tables with Accounting Consequences
		String sql = "SELECT AD_Table_ID, TableName "
			+ "FROM AD_Table t "
			+ "WHERE t.IsView='N'";
		if (p_AD_Table_ID > 0)
			sql += " AND t.AD_Table_ID=" + p_AD_Table_ID;
		sql += " AND EXISTS (SELECT * FROM AD_Column c "
				+ "WHERE t.AD_Table_ID=c.AD_Table_ID AND c.ColumnName='Posted' AND c.IsActive='Y')";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				int AD_Table_ID = rs.getInt(1);
				String TableName = rs.getString(2);
				error = reset(TableName, AD_Table_ID ,p_DeletePosting);
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
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
		//	Balances
		if (p_DeletePosting)
			FinBalance.updateBalanceClient(getCtx(), p_AD_Client_ID);		//	delete
		//
		if (error == null)
			error = "@Updated@ = " + m_countReset + ", @Deleted@ = " + m_countDelete;
		return error;
	}	//	doIt

	/**
	 * 	Delete Accounting Table where period status is open and update count.
	 * 	@param TableName table name
	 *	@param AD_Table_ID table
	 */
	private String reset (String TableName, int AD_Table_ID, Boolean deleting)
	{
		String error = null;
		try {
			m_countReset = 0;
			int deleted = 0;
			//
			String docType = "";
			docBaseType = null;
			String DateRange = "";		
			if (AD_Table_ID == MInvoice.Table_ID)
				docBaseType = "IN ('" + REF_C_DocTypeDocBaseType.APInvoice 
				+ "','" + REF_C_DocTypeDocBaseType.APCreditMemo
				+ "','" + REF_C_DocTypeDocBaseType.ARInvoice
				+ "','" + REF_C_DocTypeDocBaseType.ARCreditMemo
				+ "','" + REF_C_DocTypeDocBaseType.ARProFormaInvoice + "')";
			else if (AD_Table_ID == MInOut.Table_ID)
				docBaseType = "IN ('" + REF_C_DocTypeDocBaseType.MaterialDelivery
				+ "','" + REF_C_DocTypeDocBaseType.MaterialReceipt + "')";
			else if (AD_Table_ID == MPayment.Table_ID)
				docBaseType = "IN ('" + REF_C_DocTypeDocBaseType.APPayment
				+ "','" + REF_C_DocTypeDocBaseType.ARReceipt
				+ "','" + REF_C_DocTypeDocBaseType.BankAccountTransfer + "')";
			else if (AD_Table_ID == MOrder.Table_ID)
				docBaseType = "IN ('" + REF_C_DocTypeDocBaseType.SalesOrder
				+ "','" + REF_C_DocTypeDocBaseType.PurchaseOrder + "')";
			else if (AD_Table_ID == MProjectIssue.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.ProjectIssue + "'";
			else if (AD_Table_ID == MBankStatement.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.BankStatement + "'";
			else if (AD_Table_ID == MCash.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.CashJournal + "'";
			else if (AD_Table_ID == MAllocationHdr.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.PaymentAllocation + "'";
			else if (AD_Table_ID == MJournal.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.GLJournal + "'";
			//	else if (AD_Table_ID == M.Table_ID)
			//		docBaseType = "= '" + REF_C_DocTypeDocBaseType.GLDocument + "'";
			else if (AD_Table_ID == MMovement.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.MaterialMovement + "'";
			else if (AD_Table_ID == MRequisition.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.PurchaseRequisition + "'";
			else if (AD_Table_ID == MInventory.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.MaterialPhysicalInventory + "'";
			else if (AD_Table_ID == X_M_Production.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.MaterialProduction + "'";
			else if (AD_Table_ID == MMatchInv.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.MatchInvoice + "'";
			else if (AD_Table_ID == MMatchPO.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.MatchPO + "'";
			else if (AD_Table_ID == MBOEStatement.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.BillOfExchange + "'";
			else if (AD_Table_ID == MRetentionStatement.Table_ID)
				docBaseType = "= '" + REF_C_DocTypeDocBaseType.Retention + "'";
			//
			if (docBaseType == null)
				throw new Exception (TableName + ": Unknown DocBaseType");
			else
				docBaseType = " AND pc.DocBaseType " + docBaseType;

			if (p_DateAcct_From != null && p_DateAcct_To != null)
			{
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				DateRange = " AND fact.dateacct BETWEEN '" +format.format(p_DateAcct_From) + "' AND '" + format.format(p_DateAcct_To) +"'"; 
			}

			if (DateRange.length() > 0)
			{
				String sql = "SELECT DISTINCT p.name FROM C_PeriodControl pc INNER JOIN Fact_Acct fact ON (fact.C_Period_ID=pc.C_Period_ID) ";
				sql += " JOIN c_period p ON pc.c_period_id = p.c_period_id ";
				sql += " WHERE pc.PeriodStatus != 'O' ";
				sql += docBaseType;
				sql += " AND fact.AD_Table_ID="+AD_Table_ID;
				sql += DateRange;

				PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
				ResultSet rs = pstmt.executeQuery();
				String openPeriods = "";
				while (rs.next())
				{
					if (openPeriods.length() > 0)
						openPeriods += ",";
					openPeriods += rs.getString(X_C_Period.COLUMNNAME_Name);
				}	
				if (openPeriods.length() > 0)
					throw new Exception ("Periodos cerrados " + openPeriods);
			}

			if (p_C_DocType_ID > 0 )
			{
				docType = " AND  doc.C_DocType_ID = " + p_C_DocType_ID;
			}
			//	Doc
			String sql1 = "UPDATE " + TableName + " doc"
			+ " SET Posted='N', Processing='N' "
			+ "WHERE AD_Client_ID=" + p_AD_Client_ID
			+ " AND (Posted<>'N' OR Posted IS NULL OR Processing<>'N' OR Processing IS NULL)"
			+ " AND EXISTS (SELECT * FROM C_PeriodControl pc"
			+ " INNER JOIN Fact_Acct fact ON (fact.C_Period_ID=pc.C_Period_ID) "
			+ "WHERE pc.PeriodStatus = 'O'" + docBaseType
			+ " AND fact.AD_Table_ID=" + AD_Table_ID
			+ DateRange
			+ " AND fact.Record_ID=doc." + TableName + "_ID)"
			+ docType;
			int reset = DB.executeUpdate(sql1, get_TrxName());

			if (p_C_DocType_ID > 0 )
			{
				docType = " AND  fact.C_DocType_ID = " + p_C_DocType_ID;
			}

			//	Fact
			String sql2 = "DELETE FROM Fact_Acct fact "
				+ "WHERE AD_Client_ID=" + p_AD_Client_ID
				+ " AND AD_Table_ID=" + AD_Table_ID
				+ " AND EXISTS (SELECT * FROM C_PeriodControl pc "
				+ "WHERE pc.PeriodStatus = 'O'" + docBaseType
				+ DateRange
				+ " AND fact.C_Period_ID=pc.C_Period_ID)"
				+ docType;

			if (deleting)
			{		
				deleted = DB.executeUpdate(sql2, get_TrxName());
			}
			//
			log.info(TableName + "(" + AD_Table_ID + ") - Reset=" + reset + " - Deleted=" + deleted);
			if (error == null)
			error = TableName + " - Reset=" + reset + " - Deleted=" + deleted;
			addLog(error);
			if (reset == 0)
				log.finest(sql1);
			if (deleted == 0)
				log.finest(sql2);
			//
			m_countReset += reset;
			m_countDelete += deleted;
		}
		catch (Exception e)
		{
			error = e.getMessage();
			e.printStackTrace();
		}
		return error;
	}	//	reset

}	//	FactAcctReset
