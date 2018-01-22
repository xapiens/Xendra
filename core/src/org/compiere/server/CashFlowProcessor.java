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
package org.compiere.server;

import java.sql.*;
import java.util.Date;
import java.util.logging.*;

import org.compiere.acct.*;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MCashFlow;
import org.compiere.model.MCashFlowProcessor;
import org.compiere.model.MCashFlowProcessorLog;
import org.compiere.model.MCashLine;
import org.compiere.model.MClient;
import org.compiere.model.MPayment;
import org.compiere.report.MReportTree;
import org.compiere.util.*;

import org.xendra.utils.Forecast;
import org.xendra.utils.Transaction;


/**
 *	Cash Flow Processor
 *	
 *  @author Jorg Janke
 *  @version $Id: AcctProcessor.java,v 1.2 2007/06/19 20:45:56 sergioaguayo Exp $
 */
public class CashFlowProcessor extends XendraServer
{
	/**
	 * 	Cash Flow Processor
	 *	@param model model 
	 */
	public CashFlowProcessor (MCashFlowProcessor model)
	{
		super (model, 30);	//	30 seconds delay
		m_model = model;
		m_client = MClient.get(model.getCtx(), model.getAD_Client_ID());
	}	//	AcctProcessor

	/**	The Concrete Model			*/
	private MCashFlowProcessor		m_model = null;
	/**	Last Summary				*/
	private StringBuffer 		m_summary = new StringBuffer();
	/** Client onfo					*/
	private MClient 			m_client = null;
	/**	Accounting Schemata			*/
	private MAcctSchema[] 		m_ass = null;
	//private MAcctSchema 		m_ass = null;
	/**
	 * 	Work
	 */
	protected void doWork ()
	{
		m_summary = new StringBuffer();
		
		if (m_model.getC_AcctSchema_ID() == 0)
			m_ass = MAcctSchema.getClientAcctSchema(getCtx(), m_model.getAD_Client_ID());
		else	//	only specific accounting schema
			m_ass = new MAcctSchema[] {new MAcctSchema (getCtx(), m_model.getC_AcctSchema_ID(), null)};
			//m_ass = new MAcctSchema (getCtx(), m_model.getC_AcctSchema_ID(), null);
		
		postSession();
//		MCost.create(m_client);
		//
		int no = m_model.deleteLog();
		m_summary.append("Logs deleted=").append(no);
		//
		MCashFlowProcessorLog pLog = new MCashFlowProcessorLog(m_model, m_summary.toString());
		pLog.setReference("#" + String.valueOf(p_runCount) 
			+ " - " + TimeUtil.formatElapsed(new Timestamp(p_startWork)));
		pLog.save();
	}	//	doWork

	/**
	 * 	Post Session
	 */
	private void postSession()
	{
		// work to do
		Forecast forecast = new Forecast();
		
		for (int i = 0; i < documentsTableID.length; i++)
		{
			int AD_Table_ID = documentsTableID[i];
			String TableName = documentsTableName[i];
			//	Post only special documents
			if (m_model.getAD_Table_ID() != 0 
				&& m_model.getAD_Table_ID() != AD_Table_ID)
				continue;
			//  SELECT * FROM table
			StringBuffer sql = new StringBuffer ("");			
			if ( AD_Table_ID == MCashLine.Table_ID )
					sql.append("SELECT cl.*,c.posted FROM ").append(TableName)
					.append(" cl INNER JOIN c_cash c ON (cl.c_cash_id = c.c_cash_id)")
					.append(" WHERE cl.AD_Client_ID=? AND c.posted='Y' AND cl.cashed='N' AND cl.C_CashFlow_Group_Id > 0");
			//SELECT cl.*,c.posted FROM  c_cashline cl INNER JOIN c_cash c ON (cl.c_cash_id = c.c_cash_id) WHERE c.posted = 'Y' and cl.cashed='N';			
			else if ( AD_Table_ID == MPayment.Table_ID )				
				sql.append("SELECT * FROM ").append(TableName)
				.append(" WHERE AD_Client_ID=?")
				.append(" AND Cashed='N' AND posted='Y' AND C_CashFlow_Group_Id > 0")
				.append(" ORDER BY Created");
			else if ( AD_Table_ID == MCashFlow.Table_ID )
			{				
				sql.append("SELECT * FROM ").append(TableName)
				.append(" WHERE AD_Client_ID=?")
				.append(" AND isrecurring='Y' AND Processed='N'")
				.append(" ORDER BY Created");
				
				MCashFlow cashflow = new MCashFlow(getCtx(),0, null);
				if (cashflow.NeedDeletions(m_model.getAD_Client_ID() ))
				{									
					cashflow.Deletion( m_model.getAD_Client_ID() );									
				}												
			}
			int count = 0;
			int countError = 0;			
			//boolean NeedDeletions = false;
			boolean AddTransaction  = false;			
			//boolean ProcTransaction = false;
			
			PreparedStatement pstmt = null;			
			try
			{
				pstmt = DB.prepareStatement(sql.toString(), null);
				pstmt.setInt(1, m_model.getAD_Client_ID());
				ResultSet rs = pstmt.executeQuery();		
				
//
				
				//cashflow.setClientOrg(m_model.getAD_Client_ID(),m_model.getAD_Org_ID());
				//cashflow.
				//cashflow.setAD_Client_ID(m_model.getAD_Client_ID());
				MCashFlow cashflow = new MCashFlow(getCtx(),0, null);
				while (!isInterrupted() && rs.next())
				{
					count++;
					boolean ok = true;
					try
					{
						//MCashFlow.get(AD_Table_ID, rs);
						//MCashFlow cashflow = new MCashFlow(getCtx(),0, null);
						if ( AD_Table_ID == MPayment.Table_ID )
						{
							MPayment payment = new MPayment (getCtx(), rs.getInt("C_Payment_ID") , null );
							if (payment.getC_Payment_ID() > 0)
								cashflow.setPayment(m_ass, payment);
							//MPayment payment = new MPayment (getCtx(), C_Payment_ID, get_TrxName());
							
						}
						if ( AD_Table_ID == MCashLine.Table_ID )
						{
							MCashLine cashline = new MCashLine( getCtx(), rs.getInt("C_CashLine_ID"), null);
							cashflow.setCashLine(m_ass, cashline);
						}
						if ( AD_Table_ID == MCashFlow.Table_ID )
						{
//							if (!ProcTransaction)
//							{								
//								ProcTransaction = true;
//							}							
							MCashFlow cash = new MCashFlow(getCtx(),rs.getInt("C_Cashflow_ID"), null);
							if (cashflow.CreateTransactions(cash, forecast))
							{
								AddTransaction = true;
							}
						}
					}
					catch (Exception e)
					{
						log.log(Level.SEVERE, getName() + ": " + TableName, e);
						ok = false;
					}
					if (!ok)
						countError++;
				}
				if ( AddTransaction )
				{
			        Timestamp begin = null;
			        Timestamp end = null;
			        
			        StringBuffer sqlRange = new StringBuffer ("");
			        
			        sqlRange.append("SELECT * ")
						.append("FROM C_Period ")
						.append("WHERE C_Year_ID IN ")
						.append("(SELECT p.C_Year_ID ")
						.append("FROM AD_ClientInfo c")
						.append(" INNER JOIN C_Year y ON (c.C_Calendar_ID=y.C_Calendar_ID)")
						.append(" INNER JOIN C_Period p ON (y.C_Year_ID=p.C_Year_ID) ")
						.append("WHERE c.AD_Client_ID=?")
						.append("	AND ? BETWEEN StartDate AND EndDate)")
						.append(" AND IsActive='Y' AND PeriodType='S' ")
						.append("ORDER BY StartDate");
					try
					{
						//PreparedStatement pstmt = DB.prepareStatement(sqlRange.toString(), null);
						pstmt = DB.prepareStatement(sqlRange.toString(), null);
						pstmt.setInt (1, m_model.getAD_Client_ID());
						pstmt.setTimestamp (2, new Timestamp(p_startWork));
						//ResultSet 
						rs = pstmt.executeQuery();
						int nElement = 1;
						while (rs.next())	//	first only
						{
							if (nElement == 1)
								begin = (Timestamp) rs.getTimestamp("startdate");    	
							else
								end = (Timestamp) rs.getTimestamp("enddate");	
							nElement++;
						}    		
						rs.close();
						pstmt.close();
					}
					catch (SQLException e)
					{
						//s_log.log(Level.SEVERE, sql, e);
					}    		
					
					for (int j = 0; j < forecast.ts.length; j++) {						
			            Transaction[] transactions = new Transaction[0];
			                        
			            transactions =
			            	forecast.ts[j].generateTransactions(
			            		(Date)begin,
			                    (Date)end);
			            
			            if ( transactions != null)
			            {
				            for (int k = 0; k < transactions.length; k++) {
				            	MCashFlow cash = new MCashFlow(getCtx(),0, null);				            	
				            	cash.setAD_Org_ID(transactions[k].getAD_Org_ID());
				            	cash.setClient(transactions[k].getAD_Client_ID());
				            	cash.setRecord_ID(transactions[k].getRecord_ID());
				            	Timestamp ts = new Timestamp(transactions[k].getDate().getTime());
				            	cash.setDateTrx(ts);
				            	cash.setC_Cashflow_Group_ID(transactions[k].getC_Cashflow_Group_ID());
				            	cash.setC_Currency_ID(transactions[k].getC_Currency_ID());
				            	cash.setAmount(transactions[k].getAmount());					            	
				            	cash.setSign(transactions[k].getSign());
				            	cash.setDescription(transactions[k].getDescription());
				            	cash.setAD_Table_ID(MCashFlow.Table_ID);
				            	cash.save();							            					                				           
				            }
						}
			        }
				}
				rs.close();
				pstmt.close();
				pstmt = null;				
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, sql.toString(), e);
			}
			if (pstmt != null)
			{
				try
				{
					pstmt.close();
				}
				catch (Exception e)
				{
				}
			}
			//
			if (count > 0)
			{
				m_summary.append(TableName).append("=").append(count);
				if (countError > 0)
					m_summary.append("(Errors=").append(countError).append(")");
				m_summary.append(" - ");
				log.finer(getName() + ": " + m_summary.toString());
			}
			else
				log.finer(getName() + ": " + TableName + " - no work");			
			//try
			//{
			//	pstmt = DB.prepareStatement(sql.toString(), null);
			//}	
		}
	}	//	postSession
	
	/**
	 * 	Get Server Info
	 *	@return info
	 */
	public String getServerInfo()
	{
		return "#" + p_runCount + " - Last=" + m_summary.toString();
	}	//	getServerInfo

	public static int[]  documentsTableID = new int[] {
		MPayment.Table_ID,			//  C_Payment
		MCashLine.Table_ID,    //  C_CashLine
		MCashFlow.Table_ID
	};
	
	/** Table Names of documents          */
	public static String[]  documentsTableName = new String[] {
		MPayment.Table_Name,		//  C_Payment
		MCashLine.Table_Name,	//  C_CashLine
		MCashFlow.Table_Name
	};
	
}	//	CashFlowProcessor
