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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.logging.*;

import org.compiere.Xendra;
import org.compiere.model.persistence.X_GL_BookPeriod;
import org.compiere.util.*;

/**
 *	GL Book Period
 *	
 *  @author xapiens
 *  @version $Id: MGLCategory.java 508 2007-11-24 23:06:53Z xapiens $
 */
public class MGLBookPeriod  extends X_GL_BookPeriod
{
	public MGLBookPeriod(Properties ctx, int GL_BookPeriod_ID, String trxName) {
		super(ctx, GL_BookPeriod_ID, trxName);
		if (GL_BookPeriod_ID == 0)
		{
			//
		}
	}

	public MGLBookPeriod(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	/**
	 * 	Get MPeriod
	 *	@param ctx context
	 * @param aDClientID 
	 *	@param Timestamp DateAcct
	 *	@return MPeriod
	 */
	public static MPeriod getPeriod (Properties ctx, Timestamp DateAcct, int AD_Org_ID, int AD_Client_ID)
	{
		//MPeriod period = MPeriod.get (getAD_Client_ID() , DateAcct , null);
		MPeriod period = MPeriod.get (ctx, DateAcct , AD_Org_ID, AD_Client_ID);
		return period;
	}	//	get


	/**	Logger						*/
	private static CLogger s_log = CLogger.getCLogger (MGLBookPeriod.class);
//	/**	Cache						*/
//	private static CCache<Integer, MGLCategory> s_cache 
//		= new CCache<Integer, MGLCategory> ("GL_Category", 5);
	

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
//	public MGLBookPeriod (Properties ctx, ResultSet rs, String trxName)
//	{
//		super(ctx, rs, trxName);
//	}	//	MGLBookPeriod
	public static void main (String[] args)
	{
		System.out.println("X");
		//Xendra.startup(true);			
		org.compiere.Xendra.startup (true);
		MGLBookPeriod mbp = new MGLBookPeriod(Env.getCtx(),0,null); 
		//mbp.getPeriod(Env.getCtx(), new Timestamp(System.currentTimeMillis()));
		int AD_Org_ID = 0;
		int AD_Client_ID = 0;
		int AD_Table_ID = 335;
		int C_DocType_ID = 1001100;
		String issotrx = null;
		for (int i = 0 ; i < 100; i++)
		{
			String xx = mbp.getID(AD_Org_ID, AD_Client_ID, AD_Table_ID, C_DocType_ID, issotrx, new Timestamp(System.currentTimeMillis()));
			System.out.println(xx);
		}
	}
	
	public static String getID(int AD_Org_ID, int AD_Client_ID, int table_ID, int docType_ID, String issotrx, Timestamp dateacct) {
		int GL_Book_ID = 0;
		String orgValue = "ORGVALUE";
		StringBuffer sb  = new StringBuffer();
		sb.append("( glb.AD_Org_ID =  0");
		if (AD_Org_ID != 0)
		{
			sb.append(" OR glb.AD_Org_ID =").append(AD_Org_ID);
			MOrg org = MOrg.get(Env.getCtx(), AD_Org_ID);
			if (org != null)
				orgValue = org.getTaxID();
			if (orgValue.length() == 0)
				orgValue="NSDTaxIDOrg";			 
		}
		sb.append(") AND ");						
		sb.append(" glb.AD_Client_ID =").append(AD_Client_ID);		
		if (table_ID != 0)					
		{
			if ( sb.length() > 0 )
				sb.append(" AND ");			
			sb.append(" glb.AD_Table_ID =").append(table_ID);
		}
		if (docType_ID != 0)
		{
			if ( sb.length() > 0 )
				sb.append(" AND ");
			sb.append(" glb.C_DocType_ID =").append(docType_ID);
		}
		if (issotrx.length() > 0 )
		{
			if ( sb.length() > 0 )
				sb.append(" AND ");			
			sb.append(" glb.issotrx ='").append(issotrx).append("'");
		}
		StringBuffer sql = new StringBuffer("SELECT count(*) FROM "+getconditional(sb));			
		int count = DB.getSQLValue(null ,sql.toString());
		String sequence = "NSD";
		//if (count==1 || count == 0)
		if (count==1)
		{
			Trx m_trx = null;
			String trxName = null;
			try {
				m_trx = Trx.get(Trx.createTrxName("GLBookPeriod"), true);
				trxName = m_trx.getTrxName();
				//sql = new StringBuffer("SELECT gl_book_id  FROM gl_bookline glb WHERE ").append(sb);
				sql = new StringBuffer("SELECT glb.gl_book_id from "+getconditional(sb));
				//PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);				
				GL_Book_ID = DB.getSQLValue(trxName ,sql.toString());
				if ( GL_Book_ID > 0 )
				{					
					MGLBook book = new MGLBook(Env.getCtx(), GL_Book_ID, trxName);					
					MPeriod period = getPeriod(Env.getCtx(), dateacct, AD_Org_ID , AD_Client_ID);
					if ( period != null )
					{
						sql = new StringBuffer("SELECT COUNT(*) FROM gl_bookperiod glbp WHERE ")
						.append("glbp.C_Period_ID =").append(period.getC_Period_ID())
						.append(" AND ")
						.append("glbp.GL_Book_ID = ").append(GL_Book_ID)
						.append(" AND ")
						.append("glbp.AD_Client_ID = ").append(AD_Client_ID);
						//.append(" AND ")
						//.append("glbp.AD_Org_ID = ").append(AD_Org_ID);						
						count = DB.getSQLValue(trxName,sql.toString());
						MYear year = new MYear(Env.getCtx(), period.getC_Year_ID(),trxName);
						MGLBookPeriod mgbp = null;
						if  (count == 0)
						{
							mgbp = new MGLBookPeriod(Env.getCtx(), 0, trxName);
							//mgbp.setAD_Org_ID(AD_Org_ID);
							mgbp.setAD_Client_ID(AD_Client_ID);
							mgbp.setC_Period_ID(period.getC_Period_ID());
							mgbp.setGL_Book_ID(GL_Book_ID);
							mgbp.setCurrentNext(0);
						}
						else
						{
							mgbp = new MGLBookPeriod(Env.getCtx(), getBookPeriodID(period.getC_Period_ID(), GL_Book_ID), trxName);
						}
						int nextid = mgbp.getNextID();
						if (!mgbp.save())
							throw new Exception ("no se pudo grabar GL Book Period");							
						sequence = String.format("%s-%s-%02d-%s-%05d", book.getValue() == null ? "":book.getValue().trim(),
						year.getFiscalYear().substring(2),
						period.getPeriodNo(),
						orgValue,
						nextid);
					}
				}
			}
			catch (Exception e)
			{
				if (m_trx != null)
				{
					m_trx.rollback();
					m_trx.close();
				}
			}
			finally {
				if (m_trx != null)
				{
					m_trx.commit();
					m_trx.close();
				}
			}
		}
		return sequence;
	}

	private static String getconditional(StringBuffer sb) {
		StringBuilder from = new StringBuilder(" gl_bookline glb join gl_book g on glb.gl_book_id = g.gl_book_id  WHERE ");
		from.append(sb);		
		from.append(" and g.booktype = 'S'");		
		return from.toString();
	}

	private int getNextID() {
		int next  = getCurrentNext();		
		next++;
		setCurrentNext(next);
		save();
		return next;
	}

	private static int getBookPeriodID(int period_ID, int book_ID) {		
		int GL_BookPeriod_ID = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT gl_bookperiod_id FROM gl_bookperiod glbp WHERE glbp.C_Period_ID = ")
				.append(period_ID)
				.append(" AND glbp.GL_Book_ID = ")
				.append(book_ID);
		GL_BookPeriod_ID = DB.getSQLValue(null,sql.toString());
		return GL_BookPeriod_ID;
	}

}	//	MGLBookPeriod
