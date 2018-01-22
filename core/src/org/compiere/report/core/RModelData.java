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
package org.compiere.report.core;

import java.math.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

import org.compiere.model.MRole;

import java.util.logging.*;
import org.compiere.util.*;


/**
 *  Report Model Data - ValueObject.
 *  - Build SQL from RColumn info and Retrieve Data
 *  - owned by RModel
 *
 *  @author Jorg Janke
 *  @version  $Id: RModelData.java 4948 2013-07-17 21:55:43Z xapiens $
 */
class RModelData
{
	/**
	 *  Constructor. Use query method to populate data
	 *  @param TableName
	 */
	public RModelData (String TableName)
	{
		m_TableName = TableName;
	}   //  RModelData

	/** The Rows                        */
	public ArrayList<ArrayList<Object>> 	rows = new ArrayList<ArrayList<Object>>();
	/** The temporary Rows              */
	private ArrayList<ArrayList<Object>>	m_rows = new ArrayList<ArrayList<Object>>();

	/** The Row MetaData                */
	public ArrayList<Object>	rowsMeta = new ArrayList<Object>();
	/** The Column Definitions          */
	public ArrayList<RColumn>	cols = new ArrayList<RColumn>();


	/** Table Name                      */
	private String          m_TableName;

	/** Functions (Integer - String)    */
	public HashMap<Integer,String>	functions = new HashMap<Integer,String>();
	/** Groups (Integer)                */
	public ArrayList<Integer>		groups = new ArrayList<Integer>();

	/** Array with row numbers that are groups  */
	private ArrayList<Integer>		m_groupRows = new ArrayList<Integer>();
	private ArrayList<Boolean>  	m_groupRowsIndicator = null;

	/** Constant 1                      */
	private static final BigDecimal     ONE = new BigDecimal(1.0);

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(RModelData.class);
	
	/**
	 *  Dispose
	 */
	public void dispose()
	{
		rows.clear();
		m_rows.clear();
		rowsMeta.clear();
		cols.clear();
	}   //  dispose

//	public void query (Properties ctx, String whereClause, String orderClause)
//	{
//		query ( ctx, whereClause, orderClause, false );
//	}
	/**************************************************************************
	 *  Query
	 *  @param ctx
	 *  @param  whereClause the SQL where clause (w/o the WHERE)
	 *  @param  orderClause
	 */
	public void query (Properties ctx, String whereClause, String SummarywhereClause, String orderClause, boolean summarized)
	{
		RColumn rc = null;
		StringBuffer sql = new StringBuffer();
		if (summarized && whereClause != null && whereClause.length() > 0)
		{
			sql.append(" WITH Fact_Acct as ( "); 
			sql.append(" SELECT ");
			sql.append("AD_Client_ID,");
			sql.append("AD_Org_ID,");
			sql.append("C_AcctSchema_ID,");
			sql.append("null::character as Fact_ID,");
			sql.append("null::numeric as Fact_Acct_ID,");
			sql.append("Account_ID,AmtAcctDr,AmtAcctCr,");
			sql.append("AmtSourceDr,AmtSourceCr,");
			sql.append("C_Currency_ID,");
			sql.append("C_DocType_ID,");
			sql.append("0 as Ref_Acct_ID,");
			sql.append("Serial,"); 
			sql.append("InvoiceDocumentNo,"); 
			sql.append("0 as M_Product_ID,"); 
			sql.append("C_BPartner_ID,");
			sql.append("0 as C_Campaign_ID,");
			sql.append("0 as C_SalesRegion_ID,");
			sql.append("dtacct[1] as DateAcct,");
			sql.append("dttrx[1] as DateTrx,");
			sql.append("0 as C_Period_ID,");
			sql.append("0 as C_Project_ID,0 as AD_Table_ID, 0 as Record_ID,");
			sql.append("null::character as Description,");
			sql.append("'A'::character as PostingType,");
			sql.append("0 as C_UOM_ID,");
			sql.append("0 as Qty");
			sql.append(" FROM ");
			sql.append("(SELECT zz.AD_Client_ID,");
			sql.append("zz.AD_Org_ID,");
			sql.append("array_agg(zz.dateacct) as dtacct,");
			sql.append("array_agg(zz.datetrx) as dttrx,");		
			sql.append("zz.Account_ID,");
			sql.append("zz.C_Currency_ID,");
			sql.append("zz.C_AcctSchema_ID,");
			sql.append("zz.C_DocType_ID,");
			sql.append(" CASE WHEN sum(AmtAcctDr)-sum(AmtAcctCr) > 0 then sum(AmtAcctDr)-sum(AmtAcctCr) else 0 END as AmtAcctDr,");
			sql.append(" CASE WHEN sum(AmtAcctDr)-sum(AmtAcctCr) < 0 then ABS(sum(AmtAcctDr)-sum(AmtAcctCr)) else 0 END as AmtAcctCr,");
			sql.append(" sum(AmtSourceDr) as AmtSourceDr,");
			sql.append(" sum(AmtSourceCr) as AmtSourceCr,");
			sql.append(" zz.Serial,"); 
			sql.append(" zz.InvoiceDocumentNo,"); 
			sql.append(" zz.C_BPartner_ID");
			sql.append(" FROM Fact_Acct zz "); 
			sql.append(" where ");
			sql.append(whereClause);
			if (SummarywhereClause.length() > 0)
			{
				sql.append(" AND ");			
				sql.append(SummarywhereClause);
			}
			sql.append(" group by zz.AD_Client_ID, zz.AD_Org_ID,C_AcctSchema_ID,zz.C_DocType_ID, zz.Account_ID, zz.C_Currency_ID, zz.serial, zz.InvoiceDocumentNo, C_BPartner_ID");
			sql.append(" HAVING sum(AmtAcctDr)-sum(AmtAcctCr) != 0");
			sql.append(" order by InvoiceDocumentNo"); 
			sql.append(") as factgroup	) ");
		}
		//  Create SQL
		sql.append("SELECT ");
		int size = cols.size();
		for (int i = 0; i < size; i++)
		{
			rc = (RColumn)cols.get(i);
			if (i > 0)
				sql.append(",");
			sql.append(rc.getColSQL());
		}
		sql.append(" FROM ").append(m_TableName).append(" ").append(RModel.TABLE_ALIAS);
		if (whereClause != null && whereClause.length() > 0)
			sql.append(" WHERE ").append(whereClause);
		String finalSQL = MRole.getDefault(ctx, false).addAccessSQL(
			sql.toString(), RModel.TABLE_ALIAS, MRole.SQL_FULLYQUALIFIED, MRole.SQL_RO);
		if (orderClause != null && orderClause.length() > 0)
			finalSQL += " ORDER BY " + orderClause;
		log.fine(finalSQL);

		//  FillData
		int index = 0;      //  rowset index
		m_rows.clear();
		try
		{
			Statement stmt = DB.createStatement();
			ResultSet rs = stmt.executeQuery(finalSQL);
			while (rs.next())
			{
				ArrayList<Object> row = new ArrayList<Object>(size);
				index = 1;
				//  Columns
				for (int i = 0; i < size; i++)
				{
					rc = (RColumn)cols.get(i);
					//  Get ID
					if (rc.isIDcol())
						row.add(new KeyNamePair (rs.getInt(index++), rs.getString(index++)));
					//  Null check
					else if (rs.getObject(index) == null)
					{
						index++;
						row.add(null);
					}
					else if (rc.getColClass() == String.class)
						row.add(rs.getString(index++));
					else if (rc.getColClass() == BigDecimal.class)
						row.add(rs.getBigDecimal(index++));
					else if (rc.getColClass() == Double.class)
						row.add(new Double(rs.getDouble(index++)));
					else if (rc.getColClass() == Integer.class)
						row.add(new Integer(rs.getInt(index++)));
					else if (rc.getColClass() == Timestamp.class)
						row.add(rs.getTimestamp(index++));
					else if (rc.getColClass() == Boolean.class)
						row.add(new Boolean("Y".equals(rs.getString(index++))));
					else    //  should not happen
					{
						row.add(rs.getString(index++));
					}
				}
				m_rows.add(row);
			}
			rs.close();
			stmt.close();
		}
		catch (SQLException e)
		{
			if (index == 0)
				log.log(Level.SEVERE, finalSQL, e);
			else
				log.log(Level.SEVERE, "Index=" + index + "," + rc, e);
			e.printStackTrace();
		}
		//process(summarized);
		process();
	}   //  query

	/**
	 *  Process Data
	 *  Copy data in m_rows to rows and perform functions
	 */
	//private void process(boolean summarized)
	private void process()
	{
		log.fine("Start Rows=" + m_rows.size());

		//  Row level Funcions
		//  would come here

		//  Group by Values
		int gSize = groups.size();
		int[] groupBys = new int[gSize];
		Object[] groupBysValue = new Object[gSize];
		Object INITVALUE = new Object();
		for (int i = 0; i < gSize; i++)
		{
			groupBys[i] = ((Integer)groups.get(i)).intValue();
			groupBysValue[i] = INITVALUE;
			log.fine("GroupBy level=" + i + " col=" + groupBys[i]);
		}
		//  Add additional row to force group change
		if (gSize > 0)
		{
			ArrayList<Object> newRow = new ArrayList<Object>();
			for (int c = 0; c < cols.size(); c++)
				newRow.add("");
			m_rows.add(newRow);
		}

		//  Function Values - Function - GroupValue
		int fSize = functions.size();
		int[] funcCols = new int[fSize];
		String[] funcFuns = new String[fSize];
		int index = 0;
		Iterator it = functions.keySet().iterator();
		while (it.hasNext())
		{
			Object key = it.next();
			funcCols[index] = ((Integer)key).intValue();
			funcFuns[index] = functions.get(key).toString();
			log.fine("Function " + funcFuns[index] + " col=" + funcCols[index]);
			index++;
		}
		BigDecimal[][] funcVals = new BigDecimal [fSize][gSize+1];
		int totalIndex = gSize;  //  place for overall total
		log.fine("FunctionValues = [ " + fSize + " * " + (gSize+1) + " ]");
		for (int f = 0; f < fSize; f++)
			for (int g = 0; g < gSize+1; g++)
				funcVals[f][g] = Env.ZERO;

		rows.clear();
		//  Copy m_rows into rows
		for (int r = 0; r < m_rows.size(); r++)
		{
			ArrayList<Object> row = m_rows.get(r);
			//  do we have a group break
			boolean[] haveBreak = new boolean[groupBys.length];
			for (int level = 0; level < groupBys.length; level ++)
			{
				int idx = groupBys[level];
				if (groupBysValue[level] == INITVALUE)
					haveBreak[level] = false;			
				else if (!groupBysValue[level].equals(row.get(idx)))
					haveBreak[level] = true;
				else
					haveBreak[level] = false;
				//  previous level had a break
				if (level > 0 && haveBreak[level-1])
					haveBreak[level] = true;
			}
			//  create group levels - reverse order
			for (int level = groupBys.length-1; level >= 0; level--)
			{
				int idx = groupBys[level];
				if (groupBysValue[level] == INITVALUE)
					groupBysValue[level] = row.get(idx);
				else if (haveBreak[level])
				{
				//	log.fine( "GroupBy Change level=" + level + " col=" + idx + " - " + groupBysValue[level]);
					//  create new row
					ArrayList<Object> newRow = new ArrayList<Object>();
					for (int c = 0; c < cols.size(); c++)
					{
						if (c == idx)   //  the group column
						{
							if (groupBysValue[c] == null || groupBysValue[c].toString().length() == 0)
								newRow.add("=");
							else
								newRow.add(groupBysValue[c]);
						}
						else
						{
							boolean found = false;
							for (int fc = 0; fc < funcCols.length; fc++)
							{
								if (c == funcCols[fc])
								{
								//	newRow.add("fc= " + fc + " gl=" + level + " " + funcFuns[fc]);
									newRow.add(funcVals[fc][level]);
									funcVals[fc][level] = Env.ZERO;
									found = true;
								}
							}
							if (!found)
							{
								//if (summarized)
								//{
								//	Object sumobj = row.get(c);
								//	newRow.add(sumobj);
								//}
								//else
									newRow.add(null);
							}
						}
					}   //  for all columns
					//
					m_groupRows.add(new Integer(rows.size())); //  group row indicator
					rows.add(newRow);
					groupBysValue[level] = row.get(idx);
				}
			}   //  for all groups

			//	functions
			for (int fc = 0; fc < funcCols.length; fc++)
			{
				int col = funcCols[fc];
				//  convert value to big decimal
				Object value = row.get(col);
				BigDecimal bd = Env.ZERO;
				if (value == null)
					;
				else if (value instanceof BigDecimal)
					bd = (BigDecimal)value;
				else
				{
					try {
						bd = new BigDecimal(value.toString());
					} catch (Exception e) { }
				}

				for (int level = 0; level < gSize+1; level++)
				{
					if (funcFuns[fc].equals(RModel.FUNCTION_SUM))
						funcVals[fc][level] = funcVals[fc][level].add(bd);
					else if (funcFuns[fc].equals(RModel.FUNCTION_COUNT))
						funcVals[fc][level] = funcVals[fc][level].add(ONE);
				}   //  for all group levels
			}   //  for all functions

//			if (!summarized)
				rows.add(row);
		}   //  for all m_rows

		//  total row
		if (functions.size() > 0)
		{
			ArrayList<Object> newRow = new ArrayList<Object>();
			for (int c = 0; c < cols.size(); c++)
			{
				boolean found = false;
				for (int fc = 0; fc < funcCols.length; fc++)
				{
					if (c == funcCols[fc])
					{
						newRow.add(funcVals[fc][totalIndex]);
						found = true;
					}
				}
				if (!found)
					newRow.add(null);
			}   //  for all columns
			//  remove empty row added earlier to force group change
			//if (!summarized)
			//{
				if (gSize > 0)
					rows.remove(rows.size()-1);
			//}
			m_groupRows.add(new Integer(rows.size())); //  group row indicator
			rows.add(newRow);
		}
		log.fine("End Rows=" + rows.size());
		m_rows.clear();
	}   //  process

	
	/**************************************************************************
	 *  Is Row a Group Row
	 *  @param row row index
	 *  @return true, if group row
	 */
	public boolean isGroupRow (int row)
	{
		//  build boolean Array
		if (m_groupRowsIndicator == null)
		{
			m_groupRowsIndicator = new ArrayList<Boolean>(rows.size());
			for (int r = 0; r < rows.size(); r++)
				m_groupRowsIndicator.add(new Boolean(m_groupRows.contains(new Integer(r))));
		}
		if (row < 0 || row >= m_groupRowsIndicator.size())
			return false;
		return ((Boolean)m_groupRowsIndicator.get(row)).booleanValue();
	}   // isGroupRow

	/**
	 *  Move Row
	 *  @param from index
	 *  @param to index
	 *  @throws IllegalArgumentException if row index is invalid
	 */
	public void moveRow (int from, int to)
	{
		if (from < 0 || to >= rows.size())
			throw new IllegalArgumentException("Row from invalid");
		if (to < 0 || to >= rows.size())
			throw new IllegalArgumentException("Row to invalid");
		//  Move Data
		ArrayList<Object> temp = rows.get(from);
		rows.remove(from);
		rows.add(to, temp);
		//  Move Description indicator >>> m_groupRows is not in sync after row move !!
		if (m_groupRowsIndicator != null)
		{
			Boolean tempB = m_groupRowsIndicator.get(from);
			m_groupRowsIndicator.remove(from);
			m_groupRowsIndicator.add(to, tempB);
		}
	}   //  moveRow

}   //  RModelData
