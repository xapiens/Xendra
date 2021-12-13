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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.acct.Doc;
import org.compiere.model.MAcctProcessor;
import org.compiere.model.MAcctProcessorLog;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MClient;
import org.compiere.model.persistence.X_M_InOut;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.TimeUtil;
import org.compiere.util.Trx;
import org.xendra.utils.Rotdash;


/**
 *	Accounting Processor
 *	
 *  @author Jorg Janke
 *  Changes 29/08/2010 carana , Remove references to MCost
 *  
 *  @version $Id: AcctProcessor.java,v 1.2 2007/06/19 20:45:56 sergioaguayo Exp $
 */
public class AcctProcessor extends XendraServer
{
	/**
	 * 	Accounting Processor
	 *	@param model model 
	 */
	public AcctProcessor (MAcctProcessor model)
	{
		super (model, 30);	//	30 seconds delay
		m_model = model;
		m_client = MClient.get(model.getCtx(), model.getAD_Client_ID());
	}	//	AcctProcessor

	/**	The Concrete Model			*/
	private MAcctProcessor		m_model = null;
	/**	Last Summary				*/
	private StringBuffer 		m_summary = new StringBuffer();
	/** Client onfo					*/
	private MClient 			m_client = null;
	/**	Accounting Schemata			*/
	private MAcctSchema[] 		m_ass = null;
	float count = 0;
	float counttotal = 0;
	float percent = 0;
	int percentpoint = 0;
	/**
	 * 	Work
	 */
	protected void doWork ()
	{
		m_summary = new StringBuffer();
		//	Get Schemata
		if (m_model.getC_AcctSchema_ID() == 0)
			m_ass = MAcctSchema.getClientAcctSchema(getCtx(), m_model.getAD_Client_ID());
		else	//	only specific accounting schema
			m_ass = new MAcctSchema[] {new MAcctSchema (getCtx(), m_model.getC_AcctSchema_ID(), null)};
		//
		for (MAcctSchema ass:m_ass )
		{
			if (ass.getM_CostElement_ID() <= 0)
			{
				System.out.println("es necesario seleccionar un elemento de costeo para el esquema contable "+ass.getName());
				return;
			}
		}
		System.out.println(getName());
		Env.setContext(Env.getCtx(), "#AD_Client_ID", m_model.getAD_Client_ID());		
		postSession();		
		System.out.println("contabilizador finalizado");
		// TODO : Por nuevo costo - Carlos Verificar
		//MCost.create(m_client);
		//
		int no = m_model.deleteLog();
		m_summary.append("Logs deleted=").append(no);
		//
		MAcctProcessorLog pLog = new MAcctProcessorLog(m_model, m_summary.toString());
		pLog.setReference("#" + String.valueOf(p_runCount) 
				+ " - " + TimeUtil.formatElapsed(new Timestamp(p_startWork)));
		pLog.save();
	}	//	doWork

	/**
	 * 	Post Session
	 */
	private void postSession()
	{
		Rotdash rotdash = Rotdash.getInstance();
		for (int i = 0; i < Doc.documentsTableID.length; i++)
		{
			int AD_Table_ID = Doc.documentsTableID[i];
			String TableName = Doc.documentsTableName[i];
			//	Post only special documents
			if (m_model.getAD_Table_ID() != 0 
					&& m_model.getAD_Table_ID() != AD_Table_ID)
				continue;
			// added the deleting account registers with no reference in the original table
			// in case found someone
			StringBuilder deletecount = new StringBuilder("SELECT COUNT(*) from fact_acct f ")
			.append(String.format(" WHERE f.ad_client_id = %s", m_model.getAD_Client_ID()))
			.append(String.format(" AND f.ad_table_id = %s",AD_Table_ID))
			.append(String.format(" AND record_id not in (select %s_id from %s where ad_client_id = %s)",TableName,TableName, m_model.getAD_Client_ID()));
			counttotal = DB.getSQLValue(null, deletecount.toString());
			if (counttotal > 0) {
				StringBuilder delete = new StringBuilder("DELETE FROM FACT_ACCT f ")
		        .append(String.format(" where f.ad_client_id = %s ",m_model.getAD_Client_ID()))
		        .append(String.format(" AND f.ad_table_id = %s",AD_Table_ID))
		        .append(String.format(" AND record_id not in (select %s_id from %s where ad_client_id = %s)",TableName, TableName, m_model.getAD_Client_ID()));
				DB.executeUpdate(delete.toString(), null);
			}
			//
			StringBuffer sqlcount = new StringBuffer ("SELECT count(*) FROM ").append(TableName)
					.append(" WHERE AD_Client_ID=?")
					.append(" AND Processed='Y' AND Posted!='Y' AND IsActive='Y'");
			//.append(" ORDER BY Created");			
			counttotal = DB.getSQLValue(null, sqlcount.toString(), m_model.getAD_Client_ID());
			if (counttotal > 0)	{
				//  SELECT * FROM table
				StringBuffer sql = new StringBuffer ("SELECT * FROM ").append(TableName)
						.append(" WHERE AD_Client_ID=?")
						.append(" AND Processed='Y' AND Posted!='Y' AND IsActive='Y'")
						.append(" ORDER BY Created");
				//
				int count = 0;
				int countError = 0;
				PreparedStatement pstmt = null;
				try
				{
					pstmt = DB.prepareStatement(sql.toString(), null);
					pstmt.setInt(1, m_model.getAD_Client_ID());
					ResultSet rs = pstmt.executeQuery();
					Trx m_trx = Trx.get(Trx.createTrxName("AcctProcess"), true);				
					while (!isInterrupted() && rs.next())
					{
						count++;
						boolean ok = true;
						try
						{
							Doc doc = Doc.get (m_ass, AD_Table_ID, rs, m_trx.getTrxName());
							if (doc == null)
							{
								log.severe(getName() + ": No Doc for " + TableName);
								ok = false;
							}
							else
							{
								//log.log(Level.INFO, "Posting document " + doc.get_ID() + " of table " + doc.get_TableName());
								String error ="";
								reset(TableName, doc.get_ID(), m_trx.getTrxName());
								error = doc.post(true, true);   //  post no force/repost							
								if (error != null)
								{
									log.log(Level.SEVERE, error);
									//m_trx = Trx.get(m_trx.getTrxName(), false);
									//m_trx.commit();
								}
								//else
								//{
								//	log.log(Level.INFO, "Error is null :)");
								//m_trx.commit();
								//}
								if (m_trx != null)
									m_trx.commit();
								Trx m_trx2 = Trx.get(m_trx.getTrxName(), false);
								if (m_trx2 != null)
									m_trx2.commit();
								ok = error == null;
								if (!ok)
									countError++;							
							}
						}
						catch (Exception e)
						{
							e.printStackTrace();
							log.log(Level.SEVERE, getName() + ": " + TableName, e);
							ok = false;
						}
						percent = ( count / counttotal ) * 100;
						if (Math.round(percent) != percentpoint)
							rotdash.setPercent(Math.round(percent));	
						percentpoint = Math.round(percent);
						if (percent == 100)
						{
							System.out.println(String.format("errors %s",countError));
							System.out.println("");
						}
					}
					m_trx.close();
					rs.close();
				}
				catch (Exception e)
				{
					log.log(Level.SEVERE, sql.toString(), e);
				}
				finally {
					DB.close(pstmt);
				}			
				m_summary.append(TableName).append("=").append(count);
				if (countError > 0)
					m_summary.append("(Errors=").append(countError).append(")");
				m_summary.append(" - ");
				log.finer(getName() + ": " + m_summary.toString());
			}
			else
				log.finer(getName() + ": " + TableName + " - no work");
		}
		rotdash.stop();
	}	//	postSession

	/**
	 * 	Reset Accounting Table and update count
	 *	@param TableName table
	 */
	private void reset (String TableName, int Record_ID, String trxName)
	{
		String sql = "UPDATE " + TableName
				+ " SET Processing='N' WHERE "+TableName + "_ID =" + Record_ID;
		int unlocked = DB.executeUpdate(sql, trxName);
		//
		sql = "UPDATE " + TableName
				+ " SET Posted='N' WHERE "+TableName + "_ID =" + Record_ID
				+ " AND (Posted NOT IN ('Y','N') OR Posted IS NULL) AND Processed='Y'";
		int invalid = DB.executeUpdate(sql, trxName);
		//
		if (unlocked + invalid != 0)
			log.fine(TableName + " - Unlocked=" + unlocked + " - Invalid=" + invalid);
		//m_countReset += unlocked + invalid; 
	}	//	reset

	//	/**
	//	 * 	Delete Accounting Table where period status is open and update count.
	//	 * 	@param TableName table name
	//	 *	@param AD_Table_ID table
	//	 */
	//	private void delete (String TableName, int AD_Table_ID)
	//	{
	//		reset(TableName);
	//		m_countReset = 0;
	//		//
	//		String docBaseType = null;
	//		if (AD_Table_ID == MInvoice.Table_ID)
	//			docBaseType = "IN ('" + REF_C_DocTypeDocBaseType.APInvoice 
	//				+ "','" + REF_C_DocTypeDocBaseType.APCreditMemo
	//				+ "','" + REF_C_DocTypeDocBaseType.ARInvoice
	//				+ "','" + REF_C_DocTypeDocBaseType.ARCreditMemo
	//				+ "','" + REF_C_DocTypeDocBaseType.ARProFormaInvoice + "')";
	//		else if (AD_Table_ID == MInOut.Table_ID)
	//			docBaseType = "IN ('" + REF_C_DocTypeDocBaseType.MaterialDelivery
	//				+ "','" + REF_C_DocTypeDocBaseType.MaterialReceipt + "')";
	//		else if (AD_Table_ID == MPayment.Table_ID)
	//			docBaseType = "IN ('" + REF_C_DocTypeDocBaseType.APPayment
	//				+ "','" + REF_C_DocTypeDocBaseType.ARReceipt
	//				+ "','" + REF_C_DocTypeDocBaseType.BankAccountTransfer + "')";
	//		else if (AD_Table_ID == MOrder.Table_ID)
	//			docBaseType = "IN ('" + REF_C_DocTypeDocBaseType.SalesOrder
	//				+ "','" + REF_C_DocTypeDocBaseType.PurchaseOrder + "')";
	//		else if (AD_Table_ID == MProjectIssue.Table_ID)
	//			docBaseType = "= '" + REF_C_DocTypeDocBaseType.ProjectIssue + "'";
	//		else if (AD_Table_ID == MBankStatement.Table_ID)
	//			docBaseType = "= '" + REF_C_DocTypeDocBaseType.BankStatement + "'";
	//		else if (AD_Table_ID == MCash.Table_ID)
	//			docBaseType = "= '" + REF_C_DocTypeDocBaseType.CashJournal + "'";
	//		else if (AD_Table_ID == MAllocationHdr.Table_ID)
	//			docBaseType = "= '" + REF_C_DocTypeDocBaseType.PaymentAllocation + "'";
	//		else if (AD_Table_ID == MJournal.Table_ID)
	//			docBaseType = "= '" + REF_C_DocTypeDocBaseType.GLJournal + "'";
	//	//	else if (AD_Table_ID == M.Table_ID)
	//	//		docBaseType = "= '" + REF_C_DocTypeDocBaseType.GLDocument + "'";
	//		else if (AD_Table_ID == MMovement.Table_ID)
	//			docBaseType = "= '" + REF_C_DocTypeDocBaseType.MaterialMovement + "'";
	//		else if (AD_Table_ID == MRequisition.Table_ID)
	//			docBaseType = "= '" + REF_C_DocTypeDocBaseType.PurchaseRequisition + "'";
	//		else if (AD_Table_ID == MInventory.Table_ID)
	//			docBaseType = "= '" + REF_C_DocTypeDocBaseType.MaterialPhysicalInventory + "'";
	//		else if (AD_Table_ID == X_M_Production.Table_ID)
	//			docBaseType = "= '" + REF_C_DocTypeDocBaseType.MaterialProduction + "'";
	//		else if (AD_Table_ID == MMatchInv.Table_ID)
	//			docBaseType = "= '" + REF_C_DocTypeDocBaseType.MatchInvoice + "'";
	//		else if (AD_Table_ID == MMatchPO.Table_ID)
	//			docBaseType = "= '" + REF_C_DocTypeDocBaseType.MatchPO + "'";
	//		//
	//		if (docBaseType == null)
	//		{
	//			String s = TableName + ": Unknown DocBaseType";
	//			log.severe(s);
	//			addLog(s);
	//			docBaseType = "";
	//			return;
	//		}
	//		else
	//			docBaseType = " AND pc.DocBaseType " + docBaseType;
	//		
	//		//	Doc
	//		String sql1 = "UPDATE " + TableName + " doc"
	//			+ " SET Posted='N', Processing='N' "
	//			+ "WHERE AD_Client_ID=" + p_AD_Client_ID
	//			+ " AND (Posted<>'N' OR Posted IS NULL OR Processing<>'N' OR Processing IS NULL)"
	//			+ " AND EXISTS (SELECT * FROM C_PeriodControl pc"
	//				+ " INNER JOIN Fact_Acct fact ON (fact.C_Period_ID=pc.C_Period_ID) "
	//				+ "WHERE pc.PeriodStatus = 'O'" + docBaseType
	//				+ " AND fact.AD_Table_ID=" + AD_Table_ID
	//				+ " AND fact.Record_ID=doc." + TableName + "_ID)";
	//		int reset = DB.executeUpdate(sql1, get_TrxName()); 
	//		//	Fact
	//		String sql2 = "DELETE FROM Fact_Acct fact "
	//			+ "WHERE AD_Client_ID=" + p_AD_Client_ID
	//			+ " AND AD_Table_ID=" + AD_Table_ID
	//			+ " AND EXISTS (SELECT * FROM C_PeriodControl pc "
	//				+ "WHERE pc.PeriodStatus = 'O'" + docBaseType
	//				+ " AND fact.C_Period_ID=pc.C_Period_ID)";
	//		int deleted = DB.executeUpdate(sql2, get_TrxName());
	//		//
	//		log.info(TableName + "(" + AD_Table_ID + ") - Reset=" + reset + " - Deleted=" + deleted);
	//		String s = TableName + " - Reset=" + reset + " - Deleted=" + deleted;
	//		addLog(s);
	//		if (reset == 0)
	//			log.finest(sql1);
	//		if (deleted == 0)
	//			log.finest(sql2);
	//		//
	//		m_countReset += reset;
	//		m_countDelete += deleted;
	//	}	//	delete

	/**
	 * 	Get Server Info
	 *	@return info
	 */
	public String getServerInfo()
	{
		return "#" + p_runCount + " - Last=" + m_summary.toString();
	}	//	getServerInfo

}	//	AcctProcessor
