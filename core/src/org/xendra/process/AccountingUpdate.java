package org.xendra.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;

import org.compiere.acct.Doc;
import org.compiere.model.MAcctProcessor;
import org.compiere.model.MAcctSchema;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_AcctProcessor;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.xendra.Constants;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Accounting Process 
 *	
 *  @author xapiens  
 *  
 */
@XendraProcess(value="AccountingUpdate",
name="AccountingUpdate", 				   
description="AccountingUpdate", 
help="AccountingUpdate",
Identifier="9d8fcdef-30fe-5eb0-b5fb-4a55df7a2076",
classname="org.xendra.process.AccountingUpdate",
updated="2019-11-28 13:49:12")
public class AccountingUpdate extends SvrProcess {

	float count = 0;
	float counttotal = 0;
	float percent = 0;
	int percentpoint = 0;
	private StringBuffer m_summary = new StringBuffer();
	@XendraProcessParameter(Name="Client",	
			ColumnName="AD_Client_ID",
			Description="Client/Tenant for this installation.",
			Help="A Client is a company or a legal entity. You cannot share data between Clients. Tenant is a synonym for Client.",
			AD_Reference_ID=DisplayType.TableDir,
			SeqNo=10,
			ReferenceValueID="",	
			ValRuleID="",
			FieldLength=1,
			IsMandatory=false,
			IsRange=false,
			DefaultValue="",
			DefaultValue2="",
			vFormat="",
			valueMin="",
			valueMax="",
			DisplayLogic="",
			ReadOnlyLogic="",
			Identifier="b65ca86d-c480-7985-f1e2-0b5e22f0a982")						
	private int	p_AD_Client_ID = -1;				

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;			
			else if (name.equals(Constants.COLUMNNAME_AD_Client_ID))
				p_AD_Client_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}		
	}

	@Override
	protected String doIt() throws Exception {
		List<MAcctProcessor> models = new Query(Env.getCtx(), X_C_AcctProcessor.Table_Name, "AD_Client_ID = ?", get_TrxName())
		.setParameters(p_AD_Client_ID)
		.list(); 
		for (MAcctProcessor acctprocess:models) {
			postSession(acctprocess);	
		}
		return m_summary.toString();
	}
	/**
	 * 	Post Session
	 * @param m_model 
	 */
	private void postSession(MAcctProcessor m_model)
	{	
		MAcctSchema[]	m_ass = null;
		if (m_model.getC_AcctSchema_ID() == 0)
			m_ass = MAcctSchema.getClientAcctSchema(Env.getCtx(), m_model.getAD_Client_ID());
		else	//	only specific accounting schema
			m_ass = new MAcctSchema[] {new MAcctSchema (Env.getCtx(), m_model.getC_AcctSchema_ID(), get_TrxName())};
		//
		for (MAcctSchema ass:m_ass )
		{
			if (ass.getM_CostElement_ID() <= 0)
			{
				System.out.println("es necesario seleccionar un elemento de costeo para el esquema contable "+ass.getName());
				return;
			}
		}		
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
			counttotal = DB.getSQLValue(get_TrxName(), deletecount.toString());
			if (counttotal > 0) {
				StringBuilder delete = new StringBuilder("DELETE FROM FACT_ACCT f ")
				.append(String.format(" where f.ad_client_id = %s ",m_model.getAD_Client_ID()))
				.append(String.format(" AND f.ad_table_id = %s",AD_Table_ID))
				.append(String.format(" AND record_id not in (select %s_id from %s where ad_client_id = %s)",TableName, TableName, m_model.getAD_Client_ID()));
				DB.executeUpdate(delete.toString(), get_TrxName());
			}
			//
			StringBuffer sqlcount = new StringBuffer ("SELECT count(*) FROM ").append(TableName)
					.append(" WHERE AD_Client_ID=?")
					.append(" AND Processed='Y' AND Posted!='Y' AND IsActive='Y'");
			//.append(" ORDER BY Created");			
			counttotal = DB.getSQLValue(get_TrxName(), sqlcount.toString(), m_model.getAD_Client_ID());
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
					pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
					pstmt.setInt(1, m_model.getAD_Client_ID());
					ResultSet rs = pstmt.executeQuery();
					//Trx m_trx = Trx.get(Trx.createTrxName("AcctProcess"), true);				
					while (rs.next())
					{
						count++;
						boolean ok = true;
						try
						{
							Doc doc = Doc.get (m_ass, AD_Table_ID, rs, get_TrxName());
							if (doc == null)
							{
								log.severe(getName() + ": No Doc for " + TableName);
								ok = false;
							}
							else
							{
								String error ="";
								reset(TableName, doc.get_ID());
								error = doc.post(true, true);   //  post no force/repost							
								if (error != null)
								{
									log.log(Level.SEVERE, error);
								}
								//								if (m_trx != null)
								//									m_trx.commit();
								//								Trx m_trx2 = Trx.get(m_trx.getTrxName(), false);
								//								if (m_trx2 != null)
								//									m_trx2.commit();
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
						percentpoint = Math.round(percent);
						if (percent == 100)
						{
							System.out.println(String.format("errors %s",countError));
							System.out.println("");
						}
					}
					//m_trx.close();
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
	}	//	postSession

	/**
	 * 	Reset Accounting Table and update count
	 *	@param TableName table
	 */
	private void reset (String TableName, int Record_ID)
	{
		String sql = "UPDATE " + TableName
				+ " SET Processing='N' WHERE "+TableName + "_ID =" + Record_ID;
		int unlocked = DB.executeUpdate(sql, get_TrxName());
		//
		sql = "UPDATE " + TableName
				+ " SET Posted='N' WHERE "+TableName + "_ID =" + Record_ID
				+ " AND (Posted NOT IN ('Y','N') OR Posted IS NULL) AND Processed='Y'";
		int invalid = DB.executeUpdate(sql, get_TrxName());
		//
		if (unlocked + invalid != 0)
			log.fine(TableName + " - Unlocked=" + unlocked + " - Invalid=" + invalid);
		//m_countReset += unlocked + invalid; 
	}	//	reset

}
