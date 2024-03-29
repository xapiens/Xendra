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
package org.compiere.impexp;

import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_AD_ImpFormat;
import org.compiere.model.persistence.X_I_BPartner;
import org.compiere.model.persistence.X_I_ElementValue;
import org.compiere.model.persistence.X_I_GLJournal;
import org.compiere.model.persistence.X_I_PriceList;
import org.compiere.model.persistence.X_I_Product;
import org.compiere.model.persistence.X_I_ReportLine;
import org.compiere.util.*;
import org.xendra.util.UpdatePO;

/**
 *	Import Format a Row
 *
 *  @author Jorg Janke
 *  @version $Id: ImpFormat.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public final class ImpFormat
{
	/**
	 *	Format
	 *  @param name name
	 *  @param AD_Table_ID table
	 *  @param formatType format type
	 */
	public ImpFormat (String name, int AD_Table_ID, String formatType)
	{
		setName(name);
		setTable(AD_Table_ID);
		setFormatType(formatType);
	}	//	ImpFormat
	
	/**	Logger			*/
	private static CLogger	log = CLogger.getCLogger(ImpFormat.class);

	private String 		m_name;
	private String 		m_formatType;

	/**	The Table to be imported		*/
	private int 		m_AD_Table_ID;
	private String		m_tableName;
	private String		m_tablePK;
	private String 		m_tableUnique1;
	private String 		m_tableUnique2;
	private String 		m_tableUniqueParent;
	private String 		m_tableUniqueChild;
	//
	private String 		m_BPartner;
	private ArrayList<ImpFormatRow>	m_rows	= new ArrayList<ImpFormatRow>();

	/**
	 *	Set Name
	 *  @param newName new name
	 */
	public void setName(String newName)
	{
		if (newName == null || newName.length() == 0)
			throw new IllegalArgumentException("Name must be at least 1 char");
		else
			m_name = newName;
	}

	/**
	 *  Get Name
	 *  @return name
	 */
	public String getName()
	{
		return m_name;
	}   //  getName

	/**
	 *	Import Table
	 *  @param AD_Table_ID table
	 */
	public void setTable (int AD_Table_ID)
	{
		m_AD_Table_ID = AD_Table_ID;
		m_tableName = null;
		m_tablePK = null;
		String sql = "SELECT t.TableName,c.ColumnName "
			+ "FROM AD_Table t INNER JOIN AD_Column c ON (t.AD_Table_ID=c.AD_Table_ID AND c.IsKey='Y') "
			+ "WHERE t.AD_Table_ID=?";
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, AD_Table_ID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				m_tableName = rs.getString(1);
				m_tablePK = rs.getString(2);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "ImpFormat.setTable", e);
		}
		if (m_tableName == null || m_tablePK == null)
			log.log(Level.SEVERE, "Data not found for AD_Table_ID=" + AD_Table_ID);

		//	Set Additional Table Info
		m_tableUnique1 = "";
		m_tableUnique2 = "";
		m_tableUniqueParent = "";
		m_tableUniqueChild = "";

//		if (m_AD_Table_ID == 311)			//	I_061_SyncItem
//		{
//			m_tableUnique1 = "H_UPC";					//	UPC = unique
//			m_tableUnique2 = "Value";
//			m_tableUniqueChild = "H_Commodity1";		//	Vendor No may not be unique !
//			m_tableUniqueParent = "H_PartnrID";			//			Makes it unique
//		}
		if (m_AD_Table_ID == X_I_Product.Table_ID)		//	I_Product
		{			
			m_tableUnique1 = "Value";
			//m_tableUnique2 = "UPC";						//	UPC = unique
			m_tableUniqueChild = "VendorProductNo";		//	Vendor No may not be unique !
			m_tableUniqueParent = "BPartner_Value";		//			Makes it unique
		}
		else if (m_AD_Table_ID == X_I_BPartner.Table_ID)		//	I_BPartner
		{
			m_tableUnique1 = "Value";				//	the key
		}
		else if (m_AD_Table_ID == X_I_ElementValue.Table_ID)		//	I_ElementValue
		{
			m_tableUniqueParent = "ElementName";			//	the parent key
			m_tableUniqueChild = "Value";					//	the key
		}
		else if (m_AD_Table_ID == X_I_ReportLine.Table_ID)		//	I_ReportLine
		{
			m_tableUniqueParent = "ReportLineSetName";		//	the parent key
			m_tableUniqueChild = "Name";					//	the key
		}
		else if(m_AD_Table_ID == X_I_PriceList.Table_ID)
		{
			m_tableUnique1 = "Value";
		}
	}   //  setTable

	/**
	 *  Get Import Table Name
	 *  @return AD_Table_ID
	 */
	public int getAD_Table_ID()
	{
		return m_AD_Table_ID;
	}   //  getAD_Table_ID

	/** Format Type - Fixed Length F		*/
	public static final String	FORMATTYPE_FIXED = "F";
	/** Format Type - Comma Separated C		*/
	public static final String	FORMATTYPE_COMMA = "C";
	/** Format Type - Tab Separated T		*/
	public static final String	FORMATTYPE_TAB = "T";
	/** Format Type - XML X		*/
	public static final String	FORMATTYPE_XML = "X";

	/**
	 *  Set Format Type
	 *  @param newFormatType - F/C/T/X
	 */
	public void setFormatType(String newFormatType)
	{
		if (newFormatType.equals(FORMATTYPE_FIXED) || newFormatType.equals(FORMATTYPE_COMMA)
			|| newFormatType.equals(FORMATTYPE_TAB) || newFormatType.equals(FORMATTYPE_XML))
			m_formatType = newFormatType;
		else
			throw new IllegalArgumentException("FormatType must be F/C/T/X");
	}   //  setFormatType

	/**
	 *  Set Format Type
	 *  @return format type  - F/C/T/X
	 */
	public String getFormatType()
	{
		return m_formatType;
	}   //  getFormatType

	/**
	 *  Set Business Partner
	 *  @param newBPartner (value)
	 */
	public void setBPartner(String newBPartner)
	{
		m_BPartner = newBPartner;
	}   //  setBPartner

	/**
	 *  Get Business Partner
	 *  @return BPartner (value)
	 */
	public String getBPartner()
	{
		return m_BPartner;
	}   //  getVPartner

	/*************************************************************************
	 *	Add Format Row
	 *  @param row row
	 */
	public void addRow (ImpFormatRow row)
	{
		m_rows.add (row);
	}	//	addRow

	/**
	 *	Get Row
	 *  @param index index
	 *  @return Import Format Row
	 */
	public ImpFormatRow getRow (int index)
	{
		if (index >=0 && index < m_rows.size())
			return (ImpFormatRow)m_rows.get(index);
		return null;
	}	//	getRow

	/**
	 *	Get Row Count
	 *  @return row count
	 */
	public int getRowCount()
	{
		return m_rows.size();
	}	//	getRowCount

	/*************************************************************************
	 *	Factory load
	 *  @param name name
	 *  @return Import Format
	 */
	//public static ImpFormat load (String name)
	public static ImpFormat load (X_AD_ImpFormat format)
	{
		log.config(format.getName());
		ImpFormat retValue = null;
//		String sql = "SELECT * FROM AD_ImpFormat WHERE Name=?";
//		int ID = 0;
//		try
//		{
//			PreparedStatement pstmt = DB.prepareStatement(sql, null);
//			pstmt.setString (1, name);
//			ResultSet rs = pstmt.executeQuery();
//			if (rs.next())
//			{
//				retValue = new ImpFormat (name, rs.getInt("AD_Table_ID"), rs.getString("FormatType"));
		retValue = new ImpFormat(format.getName(), format.getAD_Table_ID(), format.getFormatType());
		int ID = format.getAD_ImpFormat_ID();
//				ID = rs.getInt ("AD_ImpFormat_ID");
//			}
//			rs.close();
//			pstmt.close();
//		}
//		catch (SQLException e)
//		{
//			log.log(Level.SEVERE, sql, e);
//			return null;
//		}
		loadRows (retValue, ID);
		return retValue;
	}	//	getFormat

	/**
	 *	Load Format Rows with ID
	 *  @param format format
	 *  @param ID id
	 */
	private static void loadRows (ImpFormat format, int ID)
	{
		String sql = "SELECT f.SeqNo,c.ColumnName,f.StartNo,f.EndNo,f.DataType,c.FieldLength,"		//	1..6
			+ "f.DataFormat,f.DecimalPoint,f.DivideBy100,f.ConstantValue,f.Callout "				//	7..11
			+ "FROM AD_ImpFormat_Row f,AD_Column c "
			+ "WHERE f.AD_ImpFormat_ID=? AND f.AD_Column_ID=c.AD_Column_ID AND f.IsActive='Y'"
			+ "ORDER BY f.SeqNo";
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt (1, ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				ImpFormatRow row = new ImpFormatRow (rs.getInt(1),
					rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6));
				//
				row.setFormatInfo(rs.getString(7), rs.getString(8),
					rs.getString(9).equals("Y"),
					rs.getString(10), rs.getString(11));
				//
				format.addRow (row);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
		}
	}	//	loadLines

	/*************************************************************************
	 *	Parse Line returns ArrayList of values
	 *
	 *  @param line line
	 *  @param withLabel true if with label
	 *  @param trace create trace info
	 * 	@param ignoreEmpty - ignore empty fields
	 *  @return Array of values
	 */
	//public String[] parseLine (String line, boolean withLabel, boolean trace, boolean ignoreEmpty)
	public Field[] parseLine (String line, boolean withLabel, boolean trace, boolean ignoreEmpty)
	{
		if (trace)
			log.config("" + line);

		ArrayList<Field> list = new ArrayList<Field>();
		//	for all columns
		for (int i = 0; i < m_rows.size(); i++)
		{
			ImpFormatRow row = (ImpFormatRow)m_rows.get(i);
			Field entry = new Field();
			//	Label-Start
			if (withLabel)
			{
				entry.setName(row.getColumnName());
				entry.settype(row.getDataType());
			}

			//	Get Data
			String info = null;
			if (row.isConstant())
				info = "Constant";
			else if (m_formatType.equals(FORMATTYPE_FIXED))
			{
				//	check length
				if (row.getStartNo() > 0 && row.getEndNo() <= line.length())
					info = line.substring(row.getStartNo()-1, row.getEndNo());
			}
			else
			{
				info = parseFlexFormat (line, m_formatType, row.getStartNo());
			}

			if (info == null)
				info = "";

			//	Interpret Data
			if (row.parse(info).length() != 0)
			{
				entry.setValue(row.parse(info));
				//entry.append(row.parse(info));

				//	Label-End
//				if (withLabel)
//				{
//					if (row.isString())
//						entry.append("'");
//					else if (row.isDate())
//						entry.append("','YYYY-MM-DD HH24:MI:SS')");		//	JDBC Timestamp format w/o miliseconds
//				}
	
				if (!ignoreEmpty || (ignoreEmpty && info.length() != 0))
					//list.add(entry.toString());
					list.add(entry);
				//
			}
			else if (!ignoreEmpty)
			{
				entry.setValue("");
				list.add(entry);
			}
			if (trace)
				log.fine(info + "=>" + entry.toString() + " (Length=" + info.length() + ")");			
		}	//	for all columns

		Field[] retValue = new Field[list.size()];
		int pos = 0;
		Iterator it = list.iterator(); 
		while (it.hasNext()) {
			Field f = (Field) it.next();
			retValue[pos] = f;
			pos ++;
		}
		return retValue;
	}	//	parseLine

	/**
	 *  Parse flexible line format.
	 *  A bit inefficient as it always starts from the start
	 *
	 *  @param line the line to be parsed
	 *  @param formatType Comma or Tab
	 *  @param fieldNo number of field to be returned
	 *  @return field in lime or ""
	@throws IllegalArgumentException if format unknows
	 *   */
	private String parseFlexFormat (String line, String formatType, int fieldNo)
	{
		final char QUOTE = '"';
		//  check input
		char delimiter = ' ';
		if (formatType.equals(FORMATTYPE_COMMA))
			delimiter = ',';
		else if (formatType.equals(FORMATTYPE_TAB))
			delimiter = '\t';
		else
			throw new IllegalArgumentException ("ImpFormat.parseFlexFormat - unknown format: " + formatType);
		if (line == null || line.length() == 0 || fieldNo < 0)
			return "";

		//  We need to read line sequentially as the fields may be delimited
		//  with quotes (") when fields contain the delimiter
		//  Example:    "Artikel,bez","Artikel,""nr""",DEM,EUR
		//  needs to result in - Artikel,bez - Artikel,"nr" - DEM - EUR
		int pos = 0;
		int length = line.length();
		for (int field = 1; field <= fieldNo && pos < length; field++)
		{
			StringBuffer content = new StringBuffer();
			//  two delimiter directly after each other
			if (line.charAt(pos) == delimiter)
			{
				pos++;
				continue;
			}
			//  Handle quotes
			if (line.charAt(pos) == QUOTE)
			{
				pos++;  //  move over beginning quote
				while (pos < length)
				{
					//  double quote
					if (line.charAt(pos) == QUOTE && pos+1 < length && line.charAt(pos+1) == QUOTE)
					{
						content.append(line.charAt(pos++));
						pos++;
					}
					//  end quote
					else if (line.charAt(pos) == QUOTE)
					{
						pos++;
						break;
					}
					//  normal character
					else
						content.append(line.charAt(pos++));
				}
				//  we should be at end of line or a delimiter
				if (pos < length && line.charAt(pos) != delimiter)
					log.info("Did not find delimiter at pos " + pos + " " + line);
				pos++;  //  move over delimiter
			}
			else // plain copy
			{
				while (pos < length && line.charAt(pos) != delimiter)
					content.append(line.charAt(pos++));
				pos++;  //  move over delimiter
			}
			if (field == fieldNo)
				return content.toString();
		}

		//  nothing found
		return "";
	}   //  parseFlexFormat

	/*************************************************************************
	 *	Insert/Update Database.
	 *  @param ctx context
	 *  @param line line
	 *  @param trxName transaction
	 *	@return true if inserted/updated
	 */
	public boolean updateDB (Properties ctx, String line, String trxName)
	{		
		if (line == null || line.trim().length() == 0)
		{
			log.finest("No Line");
			return false;
		}
		//String[] nodes = parseLine (line, true, false, true);	//	with label, no trace, ignore empty
		//String[] nodes = parseLine (line, true, false, false);	//	with label, no trace, no ignore empty
		Field[] nodes = parseLine (line, true, false, false);	//	with label, no trace, no ignore empty
		if (nodes.length == 0)
		{
			log.finest("Nothing parsed from: " + line);
			return false;
		}
	//	log.config( "ImpFormat.updateDB - listSize=" + nodes.length);

		//  Standard Fields
		int AD_Client_ID = Env.getAD_Client_ID(ctx);
		int AD_Org_ID = Env.getAD_Org_ID(ctx);
		if (getAD_Table_ID() == X_I_GLJournal.Table_ID)
			AD_Org_ID = 0;
		int UpdatedBy = Env.getAD_User_ID(ctx);


		//	Check if the record is already there ------------------------------
		StringBuffer sql = new StringBuffer ("SELECT COUNT(*), MAX(")
			.append(m_tablePK).append(") FROM ").append(m_tableName)
			.append(" WHERE AD_Client_ID=").append(AD_Client_ID).append(" AND (");
		//
		String where1 = null;
		String where2 = null;
		String whereParentChild = null;
		for (int i = 0; i < nodes.length; i++)
		{
			if (nodes[i].getValue().length() == 0) {
				;
			}
			//if (nodes[i].endsWith("=''") || nodes[i].endsWith("=0"))
			//{
			//	;
			//}
			//else if (nodes[i].startsWith(m_tableUnique1 + "="))
				//where1 = nodes[i];
//			else if (nodes[i].startsWith(m_tableUnique2 + "="))
//				where2 = nodes[i];
//			else if (nodes[i].startsWith(m_tableUniqueParent + "=") || nodes[i].startsWith(m_tableUniqueChild + "="))
//			{
//				if (whereParentChild == null)
//					whereParentChild = nodes[i];
//				else
//					whereParentChild += " AND " + nodes[i];
//			}
			else if (nodes[i].getName().equals(m_tableUnique1))
				where1 = nodes[i].getFieldValue();
			else if (nodes[i].getName().equals(m_tableUnique2))
				where2 = nodes[i].getFieldValue();
			else if (nodes[i].getName().equals(m_tableUniqueParent) || nodes[i].getName().equals(m_tableUniqueChild))
			{
				if (whereParentChild == null)
					whereParentChild = nodes[i].getFieldValue();
				else
					whereParentChild += " AND " + nodes[i].getFieldValue();
			}
		}
		StringBuffer find = new StringBuffer();
		if (where1 != null)
			find.append(where1);
		if (where2 != null)
		{
			if (find.length() > 0)
				find.append(" OR ");
			find.append(where2);
		}
		if (whereParentChild != null && whereParentChild.indexOf(" AND ") != -1)	//	need to have both criteria
		{
			if (find.length() > 0)
				find.append(" OR (").append(whereParentChild).append(")");	//	may have only one
			else
				find.append(whereParentChild);
		}
		sql.append(find).append(")");
		int count = 0;
		int ID = 0;
		try
		{
			if (find.length() > 0)
			{
				PreparedStatement pstmt = DB.prepareStatement(sql.toString(), trxName);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next())
				{
					count = rs.getInt(1);
					if (count == 1)
						ID = rs.getInt(2);
				}
				rs.close();
				pstmt.close();
			}
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
			return false;
		}


		//	Insert Basic Record -----------------------------------------------
		if (ID == 0)
		{
			ID = DB.getNextID(ctx, m_tableName, null);		//	get ID
			UpdatePO o = new UpdatePO();
			o.setClient(Env.getAD_Client_ID(Env.getCtx()));
			o.setTablename(m_tableName);
			o.setField(m_tablePK, ID);
			int no = o.insert(trxName);
//			sql = new StringBuffer("INSERT INTO ")
//				.append(m_tableName).append("(").append(m_tablePK).append(",")
//				.append("AD_Client_ID,AD_Org_ID,Created,CreatedBy,Updated,UpdatedBy,IsActive")	//	StdFields
//				.append(") VALUES (").append(ID).append(",")
//				.append(AD_Client_ID).append(",").append(AD_Org_ID)
//				.append(",CURRENT_TIMESTAMP,").append(UpdatedBy).append(",CURRENT_TIMESTAMP,").append(UpdatedBy).append(",'Y'")
//				.append(")");
//			//
//			int no = DB.executeUpdate(sql.toString(), trxName);
			if (no != 1)
			{
				log.log(Level.SEVERE, "Insert records=" + no + "; SQL=" + sql.toString());
				return false;
			}
			log.finer("New ID=" + ID + " " + find);
		}
		else
			log.finer("Old ID=" + ID + " " + find);

		//	Update Info -------------------------------------------------------
		UpdatePO o = new UpdatePO();
		o.setTablename(m_tableName);
		for (int i = 0; i < nodes.length; i++)
			o.setField(nodes[i].getName(), nodes[i].getValue());
		int no = o.update(String.format("%s=%s",m_tablePK,ID), trxName);
//		sql = new StringBuffer ("UPDATE ")
//			.append(m_tableName).append(" SET ");
//		for (int i = 0; i < nodes.length; i++)
//			sql.append(nodes[i]).append(",");		//	column=value
//		sql.append("IsActive='Y',Processed='N',I_IsImported='N',Updated=CURRENT_TIMESTAMP,UpdatedBy=").append(UpdatedBy);
//		sql.append(" WHERE ").append(m_tablePK).append("=").append(ID);
//		//  Update Cmd
//		no = DB.executeUpdate(sql.toString(), trxName);
		if (no != 1)
		{
			log.log(Level.SEVERE, m_tablePK + "=" + ID + " - rows updated=" + no);
			return false;
		}
		return true;
	}	//	updateDB

}	//	ImpFormat
