package org.xendra.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import org.compiere.model.persistence.X_M_Inventory;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.xendra.Constants;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

@XendraProcess(value="DeleteClient",
name="Delete Client",
description="Delete Client",
help="Delete Client	",
Identifier="050af86e-6fa2-9b52-8913-319a2f83aa81",
classname="org.xendra.process.DeleteClient",
updated="2015-06-20 10:10:12")
public class DeleteClient extends SvrProcess {
	@XendraProcessParameter(Name="Client",
			                ColumnName="AD_Client_ID",
			                Description="Client/Tenant for this installation.",
			                Help="A Client is a company or a legal entity. You cannot share data between Clients. Tenant is a synonym for Client.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=10,
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
			                Identifier="8d8afdc5-1f10-61f3-c40c-73522c5fa19b")
	private int m_AD_Client_ID;
	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Client_ID"))
				m_AD_Client_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	protected String doIt() throws Exception {
		String sql = "SELECT " +
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
			                	"AND UPPER (c.columnname) = 'AD_CLIENT_ID' " +
		                ") " +
	                 "UNION " +
	                 "SELECT " +
	                 	"t.TableName " +
	                 "FROM " +
	                 	"AD_COLUMN c," +
	                 	"AD_TABLE t " +
		             "WHERE " +
		             	"ad_reference_value_id = 129 " +
		             	"AND UPPER (columnname) <> 'AD_CLIENT_ID' " +
		             	"AND t.ad_table_id = c.ad_table_id " +
		             	"AND t.isview='N' ";
		
		try {
			PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String tableName = rs.getString(1);
				
				sql = "DELETE FROM " + tableName + " WHERE AD_Client_ID=?";
				PreparedStatement pstmt2 = DB.prepareStatement(sql, get_TrxName());
				//int no = DB.executeUpdate(sql, m_AD_Client_ID, get_TrxName());
				pstmt2.setInt(1, m_AD_Client_ID);
				//pstmt2 = DB.prepareStatement(sql , get_TrxName());	    
				try {
						int n = pstmt2.executeUpdate();								
					}
				catch (Exception e)	{
					log.log(Level.SEVERE,"SQLSatement", e);					
				}									
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
			}
			
			rs.close();
			pstmt.close();
		}
		catch (SQLException e) {
			return "@Error@";
		}

		return null;
	}

}
