/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                       *
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
 *
 * Copyright (C) 2005 Robert KLEIN. robeklein@gmail.com * 
 * Contributor(s): ______________________________________.
 *****************************************************************************/
package org.compiere.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;

import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Convert AD to XML
 *	
 *  @author Robert Klein
 *  @version $Id: CopyRole.java 5583 2015-08-05 14:11:58Z xapiens $
 *  
 */
@XendraProcess(value="CopyRole",
name="CopyRole",
description="Copy Role",
help="",
Identifier="16b20efc-c643-90b7-945d-4220142b2be2",
classname="org.compiere.process.CopyRole",
updated="2015-06-20 10:10:12")	
public class CopyRole extends SvrProcess
{
	@XendraProcessParameter(Name="Role",
			                ColumnName="AD_Role_ID",
			                Description="Responsibility Role",
			                Help="The Role determines security and access a user who has this Role will have in the System.",
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
			                Identifier="1d48dfdf-8e92-6e9a-d6a7-88dc52f0447b")	
	private int m_AD_Role_ID_From = 0;
	private int m_AD_Role_ID_To = 0;
	@XendraProcessParameter(Name="Client",
                ColumnName="AD_Client_ID",
                Description="Client/Tenant for this installation.",
                Help="A Client is a company or a legal entity. You cannot share data between Clients. Tenant is a synonym for Client.",
                AD_Reference_ID=DisplayType.TableDir,
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
                Identifier="e7fc498b-c4d4-4eb0-7d20-508eb983cc4a")
	private int m_AD_Client_ID = 0;	
	@XendraProcessParameter(Name="Organization",
                ColumnName="AD_Org_ID",
                Description="Organizational entity within client",
                Help="An organization is a unit of your client or legal entity - examples are store, department. You can share data between organizations.",
                AD_Reference_ID=DisplayType.TableDir,
                SeqNo=30,
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
                Identifier="86289cdf-7f76-a9f3-9ca2-a5f6af2dacc2")
	private int m_AD_Org_ID = 0;
	StringBuffer sqlB = null;
	private Object[] m_newValues = null;
	
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
			else if (name.equals("AD_Role_ID") && i == 0)
				m_AD_Role_ID_From = para[i].getParameterAsInt();
			else if (name.equals("AD_Role_ID")&& i == 1)
				m_AD_Role_ID_To = para[i].getParameterAsInt();
			else if (name.equals("AD_Client_ID"))
				m_AD_Client_ID = para[i].getParameterAsInt();
			else if (name.equals("AD_Org_ID"))
				m_AD_Org_ID = para[i].getParameterAsInt();
		}		
	}	//	prepare
	
	/**
	 * 	Start the transformation to XML
	 *	@return info
	 *	@throws Exception
	 */
	protected String doIt() throws java.lang.Exception
	{			
		//Process AD_Window_Access Values
		String sql = "SELECT * FROM AD_Window_Access WHERE AD_Role_ID= " + m_AD_Role_ID_From;
		PreparedStatement pstmt = null;
		pstmt = DB.prepareStatement (sql, get_TrxName());
		try {			
			ResultSet rs = pstmt.executeQuery();		
			while (rs.next())
			{							
					
					sqlB = new StringBuffer ("SELECT count(*) FROM AD_Window_Access "
								+ "WHERE AD_Role_ID=? and AD_Window_ID=?"
								+ "and AD_Client_ID = " + m_AD_Client_ID 
								+ "and AD_Org_ID= " + m_AD_Org_ID);
					
					int count = DB.getSQLValue(null,sqlB.toString(),m_AD_Role_ID_To,rs.getInt("AD_Window_ID"));
					
					if (count>0){						
						sqlB = new StringBuffer ("UPDATE AD_Window_Access "
								+ "SET isActive = '" + rs.getString("isActive")
								+ "', isReadWrite = '" + rs.getString("isReadWrite")
								+ "' WHERE AD_Client_ID = " + m_AD_Client_ID
								+ " and AD_Org_ID = " + m_AD_Org_ID 
								+ " and AD_Role_ID = " + m_AD_Role_ID_To
								+ " and AD_Window_ID = " + rs.getInt("AD_Window_ID") );
						
						int no = DB.executeUpdate (sqlB.toString(), get_TrxName());
					}
					else{
						
			    		sqlB = new StringBuffer ("Insert INTO AD_Window_Access" 
								+   "(AD_Client_ID, AD_Org_ID, CreatedBy, UpdatedBy, " 
								+   "AD_Role_ID, AD_Window_ID, isActive, isReadWrite) "
								+	"VALUES(" 
								+	" "+ m_AD_Client_ID
								+	", "+ m_AD_Org_ID
			    				+	", "+ Env.getAD_User_ID(Env.getCtx())
			    				+	", "+ Env.getAD_User_ID(Env.getCtx())
								+	", " + m_AD_Role_ID_To
								+	", " + rs.getInt("AD_Window_ID")
								+	", '" + rs.getString("isActive")
								+	"', '" + rs.getString("isReadWrite")+"')");

						int no = DB.executeUpdate (sqlB.toString(), get_TrxName());
					}
			}
			rs.close();
			pstmt.close();
			pstmt = null;			
		}	
		
			catch (Exception e)	{
				log.log(Level.SEVERE,"CreateRoles-Window Access", e);
			}
		
		//Process AD_Process_Access Values
		sql = "SELECT * FROM AD_Process_Access WHERE AD_Role_ID= " + m_AD_Role_ID_From;
		pstmt = null;
		pstmt = DB.prepareStatement (sql, get_TrxName());
		try {			
			ResultSet rs = pstmt.executeQuery();		
			while (rs.next())
			{	
			
			sqlB = new StringBuffer ("SELECT count(*) FROM AD_Process_Access "
						+ "WHERE AD_Role_ID=? AND AD_Process_ID=?"
						+ "AND AD_Client_ID = " + m_AD_Client_ID 
						+ "and AD_Org_ID= " + m_AD_Org_ID);
			int count = DB.getSQLValue(null,sqlB.toString(),m_AD_Role_ID_To,rs.getInt("AD_Process_ID"));
			
			if (count>0){						
				sqlB = new StringBuffer ("UPDATE AD_Process_Access "
						+ "SET isActive = '" + rs.getString("isActive")
						+ "', isReadWrite = '" + rs.getString("isReadWrite")
						+ "' WHERE AD_Client_ID = " + m_AD_Client_ID
						+ " and AD_Org_ID = " + m_AD_Org_ID 
						+ " and AD_Role_ID = " + m_AD_Role_ID_To
						+ " and AD_Process_ID = " + rs.getInt("AD_Process_ID") );
				
				int no = DB.executeUpdate (sqlB.toString(), get_TrxName());
			}
			else{
				
	    		sqlB = new StringBuffer ("Insert INTO AD_Process_Access" 
						+   "(AD_Client_ID, AD_Org_ID, CreatedBy, UpdatedBy, " 
						+   "AD_Role_ID, AD_Process_ID, isActive, isReadWrite) "
						+	"VALUES(" 
						+	" "+ m_AD_Client_ID
						+	", "+ m_AD_Org_ID
	    				+	", "+ Env.getAD_User_ID(Env.getCtx())
	    				+	", "+ Env.getAD_User_ID(Env.getCtx())
						+	", " + m_AD_Role_ID_To
						+	", " + rs.getInt("AD_Process_ID")
						+	", '" + rs.getString("isActive")
						+	"', '" + rs.getString("isReadWrite")+"')");

				int no = DB.executeUpdate (sqlB.toString(), get_TrxName());
			}

				
			}
			rs.close();
			pstmt.close();
			pstmt = null;			
		}	
		
			catch (Exception e)	{
				log.log(Level.SEVERE,"CreateRoles-AD_Process", e);
			}
			
//				Process AD_Form_Access Values
			sql = "SELECT * FROM AD_Form_Access WHERE AD_Role_ID= " + m_AD_Role_ID_From;
			pstmt = null;
			pstmt = DB.prepareStatement (sql, get_TrxName());
			try {			
				ResultSet rs = pstmt.executeQuery();		
				while (rs.next())
				{
					sqlB = new StringBuffer ("SELECT count(*) FROM AD_Form_Access "
							+ "WHERE AD_Role_ID=? AND AD_Form_ID=?"
							+ "AND AD_Client_ID = " + m_AD_Client_ID 
							+ "and AD_Org_ID= " + m_AD_Org_ID);
				int count = DB.getSQLValue(null,sqlB.toString(),m_AD_Role_ID_To,rs.getInt("AD_Form_ID"));
				
				if (count>0){						
					sqlB = new StringBuffer ("UPDATE AD_Form_Access "
							+ "SET isActive = '" + rs.getString("isActive")
							+ "', isReadWrite = '" + rs.getString("isReadWrite")
							+ "' WHERE AD_Client_ID = " + m_AD_Client_ID
							+ " and AD_Org_ID = " + m_AD_Org_ID 
							+ " and AD_Role_ID = " + m_AD_Role_ID_To
							+ " and AD_Form_ID = " + rs.getInt("AD_Form_ID") );
					
					int no = DB.executeUpdate (sqlB.toString(), get_TrxName());
				}
				else{
					
		    		sqlB = new StringBuffer ("Insert INTO AD_Form_Access" 
							+   "(AD_Client_ID, AD_Org_ID, CreatedBy, UpdatedBy, " 
							+   "AD_Role_ID, AD_Form_ID, isActive, isReadWrite) "
							+	"VALUES(" 
							+	" "+ m_AD_Client_ID
							+	", "+ m_AD_Org_ID
		    				+	", "+ Env.getAD_User_ID(Env.getCtx())
		    				+	", "+ Env.getAD_User_ID(Env.getCtx())
							+	", " + m_AD_Role_ID_To
							+	", " + rs.getInt("AD_Form_ID")
							+	", '" + rs.getString("isActive")
							+	"', '" + rs.getString("isReadWrite")+"')");

					int no = DB.executeUpdate (sqlB.toString(), get_TrxName());
				}
						
				}
				rs.close();
				pstmt.close();
				pstmt = null;			
			}	
			
				catch (Exception e)	{
					log.log(Level.SEVERE,"CreateRoles-Form Access", e);
				}
			
//					Process AD_Workflow_Access Values
				sql = "SELECT * FROM AD_Workflow_Access WHERE AD_Role_ID= " + m_AD_Role_ID_From;
				pstmt = null;
				pstmt = DB.prepareStatement (sql, get_TrxName());
				try {			
					ResultSet rs = pstmt.executeQuery();		
					while (rs.next())
					{
					sqlB = new StringBuffer ("SELECT count(*) FROM AD_Workflow_Access "
								+ "WHERE AD_Role_ID=? AND AD_Workflow_ID=?"
								+ "AND AD_Client_ID = " + m_AD_Client_ID 
								+ "and AD_Org_ID= " + m_AD_Org_ID);
					int count = DB.getSQLValue(null,sqlB.toString(),m_AD_Role_ID_To,rs.getInt("AD_Workflow_ID"));
					
					if (count>0){						
						sqlB = new StringBuffer ("UPDATE AD_Workflow_Access "
								+ "SET isActive = '" + rs.getString("isActive")
								+ "', isReadWrite = '" + rs.getString("isReadWrite")
								+ "' WHERE AD_Client_ID = " + m_AD_Client_ID
								+ " and AD_Org_ID = " + m_AD_Org_ID 
								+ " and AD_Role_ID = " + m_AD_Role_ID_To
								+ " and AD_Workflow_ID = " + rs.getInt("AD_Workflow_ID") );
						
						int no = DB.executeUpdate (sqlB.toString(), get_TrxName());
					}
					else{
						
			    		sqlB = new StringBuffer ("Insert INTO AD_Workflow_Access" 
								+   "(AD_Client_ID, AD_Org_ID, CreatedBy, UpdatedBy, " 
								+   "AD_Role_ID, AD_Workflow_ID, isActive, isReadWrite) "
								+	"VALUES(" 
								+	" "+ m_AD_Client_ID
								+	", "+ m_AD_Org_ID
			    				+	", "+ Env.getAD_User_ID(Env.getCtx())
			    				+	", "+ Env.getAD_User_ID(Env.getCtx())
								+	", " + m_AD_Role_ID_To
								+	", " + rs.getInt("AD_Workflow_ID")
								+	", '" + rs.getString("isActive")
								+	"', '" + rs.getString("isReadWrite")+"')");

						int no = DB.executeUpdate (sqlB.toString(), get_TrxName());
					}						
					}
					rs.close();
					pstmt.close();
					pstmt = null;			
				}	
				
					catch (Exception e)	{
						log.log(Level.SEVERE,"CreateRoles-Workflow", e);
					}
			
//						Process AD_Task_Access Values
					sql = "SELECT * FROM AD_Task_Access WHERE AD_Role_ID= " + m_AD_Role_ID_From;
					pstmt = null;
					pstmt = DB.prepareStatement (sql, get_TrxName());
					try {			
						ResultSet rs = pstmt.executeQuery();		
						while (rs.next())
						{
						sqlB = new StringBuffer ("SELECT count(*) FROM AD_Task_Access "
									+ "WHERE AD_Role_ID=? AND AD_Task_ID=?"
									+ "AND AD_Client_ID = " + m_AD_Client_ID 
									+ "and AD_Org_ID= " + m_AD_Org_ID);
						int count = DB.getSQLValue(null,sqlB.toString(),m_AD_Role_ID_To,rs.getInt("AD_Task_ID"));
						
						if (count>0){						
							sqlB = new StringBuffer ("UPDATE AD_Task_Access "
									+ "SET isActive = '" + rs.getString("isActive")
									+ "', isReadWrite = '" + rs.getString("isReadWrite")
									+ "' WHERE AD_Client_ID = " + m_AD_Client_ID
									+ " and AD_Org_ID = " + m_AD_Org_ID 
									+ " and AD_Role_ID = " + m_AD_Role_ID_To
									+ " and AD_Task_ID = " + rs.getInt("AD_Task_ID") );
							
							int no = DB.executeUpdate (sqlB.toString(), get_TrxName());
						}
						else{
							
				    		sqlB = new StringBuffer ("Insert INTO AD_Task_Access" 
									+   "(AD_Client_ID, AD_Org_ID, CreatedBy, UpdatedBy, " 
									+   "AD_Role_ID, AD_Task_ID, isActive, isReadWrite) "
									+	"VALUES(" 
									+	" "+ m_AD_Client_ID
									+	", "+ m_AD_Org_ID
				    				+	", "+ Env.getAD_User_ID(Env.getCtx())
				    				+	", "+ Env.getAD_User_ID(Env.getCtx())
									+	", " + m_AD_Role_ID_To
									+	", " + rs.getInt("AD_Task_ID")
									+	", '" + rs.getString("isActive")
									+	"', '" + rs.getString("isReadWrite")+"')");

							int no = DB.executeUpdate (sqlB.toString(), get_TrxName());
						}						
							
						}
						rs.close();
						pstmt.close();
						pstmt = null;			
					}	
					
						catch (Exception e)	{
							log.log(Level.SEVERE,"CreateRoles-Task", e);
						}
				finally
				{
					try
					{
						if (pstmt != null)
							pstmt.close ();
					}
					catch (Exception e)
					{}
					pstmt = null;
				}		return "";
	}	//	doIt
			}	//	CopyRole
