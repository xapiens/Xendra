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

import java.math.*;
import java.sql.*;
import java.util.logging.*;

import org.compiere.db.XendraDatabase;
import org.compiere.model.MColumn;
import org.compiere.model.MTable;
import org.compiere.model.MTableAnalyze;
import org.compiere.model.M_Element;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.process.TableCreateColumns;
import org.compiere.util.*;


/**
 *	Analyze and fix tables.
 *	
 *  @author xapiens
 *  @version $Id: TableAnalyzeProcess.java 1109 2009-12-24 13:41:29Z xapiens $
 */
public class TableAnalyzeProcess extends SvrProcess
{
	
	private int m_C_TableAnalyze_ID;

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
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		m_C_TableAnalyze_ID = getRecord_ID();

	}	//	prepare

	/**
	 * 	Generate Invoices
	 *	@return info
	 *	@throws Exception
	 */
	private static final String Column = "column";
	private static final String	Function = "function";
	private static final String DoesNotExist = "does not exist";
	private static final String p_EntityType = "D";
	protected String doIt () throws Exception
	{
		Connection conn = DB.getConnectionRO();
		XendraDatabase db = DB.getDatabase();
		DatabaseMetaData md = conn.getMetaData();
		String catalog = db.getCatalog();
		String schema = db.getSchema();
		
		Boolean fixsucessful = false;
		MTableAnalyze analyze = new MTableAnalyze(Env.getCtx(), m_C_TableAnalyze_ID, null);
		String problem = analyze.getProblem();
		if (problem.indexOf("\n") > 0)
			problem = problem.substring(0,problem.indexOf("\n"));
		int function = problem.indexOf(Function);
		int column = problem.indexOf(Column);
		int doesnotexist = problem.indexOf(DoesNotExist);
		int p_AD_Table_ID = analyze.getAD_Table_ID();
		if (column >= 0 && doesnotexist >= 0 )
		{
			String columnname = problem;
			columnname = columnname.replace(Column,"");
			columnname = columnname.replace(DoesNotExist,"");
			columnname = columnname.trim().toUpperCase();
			columnname = columnname.replace(analyze.getAlias().toUpperCase()+".", "");
			if (columnname.endsWith("_ID"))
			{
				String sql = " ALTER TABLE "+analyze.getTableName()+" ADD "+columnname+" NUMBER(10);";
				int no = DB.executeUpdate(sql, false, null);
				if (no == 0)
				{
					//TableCreateColumns
					MTable table = new MTable (getCtx(), p_AD_Table_ID, get_TrxName());
					if (table == null || table.get_ID() == 0)
						throw new XendraSystemError("@NotFound@ @AD_Table_ID@ " + p_AD_Table_ID);
					log.info(table.getTableName() + ", EntityType=" + p_EntityType);
					String tableName = table.getTableName().toLowerCase();
					// end globalqss 2005-10-24
					ResultSet rs = md.getColumns(catalog, schema, tableName, null);
					addTableColumn(rs, table);
					fixsucessful = true;
				}
			}
		}
		if (function >= 0 && doesnotexist >= 0 ) // asumimos que una funcion no existe
		{
			
		}
		if (fixsucessful)
		{
			analyze.setFixed(true);
			analyze.setProcessed(true);
		}
		Timestamp today = TimeUtil.getDay(System.currentTimeMillis());
		analyze.setProcessingDate(today);
		analyze.save();

		return "";
	}	//	doIt
	
	
	/**
	 * 	Add Table Column
	 *	@param rs result set with meta data
	 *	@param table table
	 *	@throws Exception
	 */
	private void addTableColumn (ResultSet rs, MTable table) throws Exception
	{
		String tableName = table.getTableName().toLowerCase();
		// end globalqss 2005-10-24
		while (rs.next ())
		{
			String tn = rs.getString ("TABLE_NAME");
			if (!tableName.equalsIgnoreCase (tn))
				continue;
			String columnName = rs.getString ("COLUMN_NAME");
			MColumn column = table.getColumn (columnName);
			if (column != null)
				continue;
			int dataType = rs.getInt ("DATA_TYPE");
			String typeName = rs.getString ("TYPE_NAME");
			String nullable = rs.getString ("IS_NULLABLE");
			int size = rs.getInt ("COLUMN_SIZE");
			int digits = rs.getInt ("DECIMAL_DIGITS");
			//
			log.config (columnName + " - DataType=" + dataType + " " + typeName
				+ ", Nullable=" + nullable + ", Size=" + size + ", Digits="
				+ digits);
			//
			column = new MColumn (table);
			column.set_TrxName(get_TrxName()); // teo_sarca: bug [ 1640908 ] 
			column.setEntityType (p_EntityType);
			//
			M_Element element = M_Element.get (getCtx (), columnName, get_TrxName());
			if (element == null)
			{
				element = new M_Element (getCtx (), columnName, p_EntityType,
					get_TrxName ());
				//contribution from teo_sarca, bug [ 1637912 ]
				//create column and element using the same case as the table, 
				//and the name & description from table
				if (columnName.equalsIgnoreCase (table.getTableName() + "_ID")) {
					element.setColumnName(table.getTableName() + "_ID");
					element.setName(table.getName());
					element.setPrintName(table.getName());
				}
				element.save ();
			}
			column.setColumnName (element.getColumnName ());
			column.setName (element.getName ());
			column.setDescription (element.getDescription ());
			column.setHelp (element.getHelp ());
			column.setAD_Element_ID (element.getAD_Element_ID ());
			//
			column.setIsMandatory ("NO".equals (nullable));
			// Key
			if (columnName.equalsIgnoreCase (tableName + "_ID"))
			{
				column.setIsKey (true);
				column.setAD_Reference_ID (DisplayType.ID);
				column.setIsUpdateable(false);
			}
			// Account
			// bug [ 1637912 ] 
			else if (columnName.toUpperCase ().endsWith("_ACCT")
				&& size == 10)
				column.setAD_Reference_ID (DisplayType.Account);
			// Account
			else if (columnName.equalsIgnoreCase ("C_Location_ID"))
				column.setAD_Reference_ID (DisplayType.Location);
			// Product Attribute
			else if (columnName.equalsIgnoreCase ("M_AttributeSetInstance_ID"))
				column.setAD_Reference_ID (DisplayType.PAttribute);
			// SalesRep_ID (=User)
			else if (columnName.equalsIgnoreCase ("SalesRep_ID"))
			{
				column.setAD_Reference_ID (DisplayType.Table);
				column.setAD_Reference_Value_ID (190);
			}
			// ID
			else if (columnName.toUpperCase().endsWith ("_ID"))
				column.setAD_Reference_ID (DisplayType.TableDir);
			// Date
			else if (dataType == Types.DATE || dataType == Types.TIME
				|| dataType == Types.TIMESTAMP
				// || columnName.toUpperCase().indexOf("DATE") != -1
				|| columnName.equalsIgnoreCase ("Created")
				|| columnName.equalsIgnoreCase ("Updated"))
				column.setAD_Reference_ID (DisplayType.DateTime);
			// CreatedBy/UpdatedBy (=User)
			else if (columnName.equalsIgnoreCase ("CreatedBy")
				|| columnName.equalsIgnoreCase ("UpdatedBy"))
			{
				column.setAD_Reference_ID (DisplayType.Table);
				column.setAD_Reference_Value_ID (110);
				column.setIsUpdateable(false);
			}
			//	Entity Type
			else if (columnName.equalsIgnoreCase ("EntityType"))
			{
				column.setAD_Reference_ID (DisplayType.Table);
				column.setAD_Reference_Value_ID (389);
			}
			// CLOB
			else if (dataType == Types.CLOB)
				column.setAD_Reference_ID (DisplayType.TextLong);
			// BLOB
			else if (dataType == Types.BLOB)
				column.setAD_Reference_ID (DisplayType.Binary);
			// Amount
			else if (columnName.toUpperCase ().indexOf ("AMT") != -1)
				column.setAD_Reference_ID (DisplayType.Amount);
			// Qty
			else if (columnName.toUpperCase ().indexOf ("QTY") != -1)
				column.setAD_Reference_ID (DisplayType.Quantity);
			// Boolean
			else if (size == 1
				&& (columnName.toUpperCase ().startsWith ("IS") || dataType == Types.CHAR))
				column.setAD_Reference_ID (DisplayType.YesNo);
			// List
			else if (size < 4 && dataType == Types.CHAR)
				column.setAD_Reference_ID (DisplayType.List);
			// Name, DocumentNo
			else if (columnName.equalsIgnoreCase ("Name")
				|| columnName.equals ("DocumentNo"))
			{
				column.setAD_Reference_ID (DisplayType.String);
				column.setIsIdentifier (true);
				column.setSeqNo (1);
			}
			// String, Text
			else if (dataType == Types.CHAR || dataType == Types.VARCHAR
				|| typeName.startsWith ("NVAR")
				|| typeName.startsWith ("NCHAR"))
			{
				if (typeName.startsWith("N"))	//	MultiByte	
					size /= 2;
				if (size > 255)
					column.setAD_Reference_ID (DisplayType.Text);
				else
					column.setAD_Reference_ID (DisplayType.String);
			}
			// Number
			else if (dataType == Types.INTEGER || dataType == Types.SMALLINT
				|| dataType == Types.DECIMAL || dataType == Types.NUMERIC)
			{
				if (size == 10)
					column.setAD_Reference_ID (DisplayType.Integer);
				else
					column.setAD_Reference_ID (DisplayType.Number);
			}
			//	??
			else
				column.setAD_Reference_ID (DisplayType.String);
			
			column.setFieldLength (size);
			if (column.isUpdateable()
				&& (table.isView()
					|| columnName.equalsIgnoreCase("AD_Client_ID") 
					|| columnName.equalsIgnoreCase("AD_Org_ID")
					|| columnName.toUpperCase().startsWith("CREATED") 
					|| columnName.toUpperCase().equals("UPDATED") ))
				column.setIsUpdateable(false);

			//	Done
			if (column.save ())
			{
				addLog (0, null, null, table.getTableName() + "." + column.getColumnName());
			}
		}	//	while columns
		
	}	//	addTableColumn

	
}	//	TableAnalyzeProcess
