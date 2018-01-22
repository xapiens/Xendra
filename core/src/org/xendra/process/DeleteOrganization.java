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

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;

import javax.sql.RowSet;

import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class DeleteOrganization extends SvrProcess {
	private int m_AD_Org_ID;
	private static DatabaseMetaData md = null;
	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Org_ID"))
				m_AD_Org_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {			
		
		String sql = "SELECT DISTINCT " +
						"a.TableName " +
					 "FROM " +
					 	"AD_TABLE a " +
	                 "WHERE " +
	                 	"a.isview = 'N' " +
	                 	"AND EXISTS (" +
	                 		"SELECT " +
	                 			"ad_column_id " +
			                "FROM " +
			                	"AD_COLUMN c " +
			                "WHERE " +
			                	"a.ad_table_id = c.ad_table_id " +
			                	"AND UPPER (c.columnname) = 'AD_ORG_ID' " +
		                ")  " +
	                 "UNION " +
	                 "SELECT DISTINCT " +
	                 	"t.TableName " +
	                 "FROM " +
	                 	"AD_COLUMN c," +
	                 	"AD_TABLE t " +
		             "WHERE " +
		             	"ad_reference_value_id = 129 " +
		             	"AND UPPER (columnname) <> 'AD_ORG_ID' " +
		             	"AND t.ad_table_id = c.ad_table_id " +
		             	"AND t.isview='N' ORDER BY Tablename DESC ";
		
		try {
			PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
			ResultSet rs = pstmt.executeQuery();

			int no = 0;
			while (rs.next()) {
				String tableName = rs.getString(1);				
				no=DB.getSQLValue(get_TrxName(), " select count(*) from pg_tables where tablename = '"+tableName.toLowerCase()+"'");
				if (no == 1)
				{
					String owner = DB.getSQLValueString(get_TrxName(),"SELECT pg_get_userbyid(c.relowner) FROM  pg_class c WHERE relname = '"+tableName.toLowerCase()+"'");
					if (owner == null || owner.compareTo("xendra") != 0)
					{
						continue;
					}
					String type = DB.getSQLValueString(get_TrxName(),"SELECT relkind FROM  pg_class c WHERE relname = '"+tableName.toLowerCase()+"'");
					if (type.compareTo("v") == 0)
					{
						continue;
					}
					String sqlcontrains = "SELECT c.relname, conname, " +
					//"CASE WHEN position('ON ' IN pg_get_constraintdef(r.oid, false)) = 0 THEN  replace(pg_get_constraintdef(r.oid, false),'DEFERRABLE INITIALLY DEFERRED','MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED') ELSE pg_get_constraintdef(r.oid, false) END as condef FROM  pg_constraint r, " +
					" pg_get_constraintdef(r.oid, false)  as condef FROM  pg_constraint r," +
					"pg_class c WHERE r.contype = 'f' and r.conrelid=c.oid AND relname = '"+tableName.toLowerCase()+"'";
					RowSet rset = DB.getRowSet(sqlcontrains);
					rset.beforeFirst();
					//int i = 0;
					while (rset.next())
					{
						sql = "ALTER TABLE "+tableName.toLowerCase()+" DROP CONSTRAINT "+rset.getString("conname");
						System.out.println(sql);
						no = DB.executeUpdate(sql, get_TrxName());
					}
					sql = "DELETE FROM " + tableName + " WHERE AD_Org_ID=?";
					System.out.println(sql);
					Object[] params = new Object[]{m_AD_Org_ID};
					no = DB.executeUpdate(sql,params,false, get_TrxName());
					commit();
					//if( no == 0)
					//{
						//System.out.println("tabla "+tableName+" borrada");
						rset.beforeFirst();
						//int i = 0;
						while (rset.next())
						{
							sql = "ALTER TABLE "+tableName.toLowerCase()+" ADD CONSTRAINT "+rset.getString("conname")+" "+rset.getString("condef");
							System.out.println(sql);
							no = DB.executeUpdate(sql, get_TrxName());
						}	
					//}
					rset.close();					
				}
				else
					System.out.println(tableName+" no encontrada");
			}
			
			rs.close();
			pstmt.close();
		}
		catch (SQLException e) {
			return "@Error@";
		}
		
		
		sql = "select " +
				"TableName " +
	          "from " +
	          	"AD_Table t," +
	          	"AD_Column c " +
              "where " +
              	"t.AD_Table_ID=c.AD_Table_ID " +
              	"AND t.TableName<>'AD_Role' " +
              	"AND c.ColumnName='AD_Role_ID' ";
		try {
			PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String tableName = rs.getString(1);
				if ( tableName.equals("k_type"))
					System.out.println("x");
				if ( tableName == "k_type")
					System.out.println("x");								
				sql = "DELETE FROM " + tableName + " WHERE AD_Role_ID NOT IN (SELECT AD_Role_ID from AD_Role)";
				//int no = DB.executeUpdate(sql, get_TrxName());
				PreparedStatement pstmt2 = DB.prepareStatement(sql, get_TrxName());
				//pstmt2.setInt(1, m_AD_Client_ID);
				//pstmt2 = DB.prepareStatement(sql , get_TrxName());	    
				try {
						int n = pstmt2.executeUpdate();				
					}
				catch (Exception e)	{
					log.log(Level.SEVERE,"SQLSatement", e);
				}
				pstmt2.close();
			}
			
			rs.close();
			pstmt.close();
		}
		catch (SQLException e) {
			return "@Error@";
		}

		return null;
	}

	public static void main(String[] args)
	{
		try 
		{
			org.compiere.Xendra.startupEnvironment(true);
			CLogMgt.setLevel(Level.FINE);
			DeleteOrganization rr = new DeleteOrganization();
			
			ProcessInfo pi = new ProcessInfo ("DeleteOrganization", 0 /* Process ID */, /* Table_ID*/ 0, 0 /* record_ID */);
			pi.setAD_User_ID (Env.getAD_User_ID(Env.getCtx()));
			pi.setAD_Client_ID (Env.getAD_Client_ID(Env.getCtx()));			
			Vector<ProcessInfoParameter> tabParams = new Vector<ProcessInfoParameter>();
			//
			ProcessInfoParameter pip;
			pip = new ProcessInfoParameter("AD_Org_ID", 1000076 , null, null, null);
			tabParams.add(pip);
			//			
			pi.setParameter(tabParams.toArray(new ProcessInfoParameter[]{}));			
			rr.startProcess(Env.getCtx(), pi, null);			
			//rr.doIt();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
	}	
	
}
