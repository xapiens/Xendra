package org.xendra.printdocument;

import java.sql.Clob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MQuery;
import org.compiere.model.MRole;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_InvoiceLine;
import org.compiere.print.DataEngine;
import org.compiere.print.PrintData;
import org.compiere.print.PrintDataColumn;
import org.compiere.print.PrintDataElement;
import org.compiere.print.TableReference;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Language;
import org.compiere.util.Msg;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;

public class PrintWorkerPO {	
	/**	Logger							*/
	private static CLogger	log = CLogger.getCLogger (DataEngine.class);	
	/**	Default Language				*/
	private Language		m_language = Language.getLoginLanguage();	
	/**	Start Time						*/
	private long			m_startTime = System.currentTimeMillis();
	/** TrxName String					*/
	private String			m_trxName = null;
	/**	Synonym							*/
	private	String			m_synonym = "A";
	private PrintWorker m_pw;
	private int m_ID = 0;
	private String m_Name_ID = "";
	private HashMap<String, Integer> m_relations = null;
	//private PrintData pdlines;
	//private FormatMessage m_message;
	/** Key Indicator in Report			*/
	public static final String KEY = "*";

	public PrintWorkerPO (Language language, PrintWorker pw ,String trxName){
		if (language != null)
			m_language = language;
		m_trxName = trxName;		
		//m_message = pw;
		m_pw = pw;
	}	//	DataEngine

	public PrintData getPrintDataInfo (Properties ctx, MQuery query, String tableName, List<String> fields)
	{
		MTable entity = MTable.get(Env.getCtx(), tableName);
		if (entity == null)
			return null;
		m_startTime = System.currentTimeMillis();
		log.info(entity.getTableName() + " - " + m_language.getAD_Language());
		log.fine("TableName=" + entity.getTableName() + ", Query=" + query);
		ArrayList<PrintDataColumn> columns = new ArrayList<PrintDataColumn>();

		//	Order Columns (identified by non zero/null SortNo)
		ArrayList<String> orderColumns = new ArrayList<String>();

		//	Direct SQL w/o Reference Info
		StringBuffer sqlSELECT = new StringBuffer("SELECT ");
		StringBuffer sqlFROM = new StringBuffer(" FROM ").append(entity.getTableName());
		ArrayList<String> groupByColumns = new ArrayList<String>();
		//
		//boolean IsGroupedBy = false;
		//
		String sql = "SELECT c.AD_Column_ID,c.ColumnName,"				//	1..2
				+ "c.AD_Reference_ID,c.AD_Reference_Value_ID,"				//	3..4
				+ "c.FieldLength,c.IsMandatory,c.IsKey,c.IsParent,"			//	5..8
				+ "c.ColumnSQL "		//	24, 25
				+ "FROM AD_Table t"
				+ " INNER JOIN AD_Column c ON (t.AD_Table_ID=c.AD_Table_ID) "
				+ "WHERE t.AD_Table_ID=?";					//	#1
		
		String sqlfields = "";
		if (fields != null)
		{
			String id = String.format("%s_ID",tableName);			
			for (String field:fields)
			{
				if (sqlfields.length() > 0)
					sqlfields += ",";
				sqlfields += String.format("'%s'", field);
			}
			if (!fields.contains(id))
			{
				if (sqlfields.length() > 0)
					sqlfields += ",";
				sqlfields += String.format("'%s'", id);				
			}
		}
		if (m_relations != null)
		{
			Iterator it = m_relations.entrySet().iterator();
			while (it.hasNext())
			{
				Map.Entry map = (Entry) it.next();
				String key = (String) map.getKey();
				if (!fields.contains(key))
				{
					if (sqlfields.length() > 0)
						sqlfields += ",";
					sqlfields += String.format("'%s'", key);					
				}
			}
		}
		if (sqlfields.length() > 0)
		{
			sql += String.format(" AND ColumnName in (%s)", sqlfields);
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql, m_trxName);			
			pstmt.setInt(1, entity.getAD_Table_ID());
			rs = pstmt.executeQuery();
			m_synonym = "A";		//	synonym
			while (rs.next())
			{
				//	get Values from record
				int AD_Column_ID = rs.getInt(X_AD_Column.COLUMNNAME_AD_Column_ID);
				String ColumnName = rs.getString(X_AD_Column.COLUMNNAME_ColumnName);
				if 	(m_relations!= null && m_relations.containsKey(ColumnName)) 
				{
					m_relations.put(ColumnName, 0);
				}
				String ColumnSQL = rs.getString(X_AD_Column.COLUMNNAME_ColumnSQL);
				if (ColumnSQL == null)
					ColumnSQL = "";
				int AD_Reference_ID = rs.getInt(X_AD_Column.COLUMNNAME_AD_Reference_ID);
				int AD_Reference_Value_ID = rs.getInt(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID);
				//  ColumnInfo
				int FieldLength = rs.getInt(X_AD_Column.COLUMNNAME_FieldLength);
				boolean IsMandatory = "Y".equals(rs.getString(X_AD_Column.COLUMNNAME_IsMandatory));
				boolean IsKey = "Y".equals(rs.getString(X_AD_Column.COLUMNNAME_IsKey));
				boolean IsParent = "Y".equals(rs.getString(X_AD_Column.COLUMNNAME_IsParent));
				boolean isPageBreak = false;
				String orderName = entity.getTableName() + "." + ColumnName;
				String lookupSQL = orderName;
				PrintDataColumn pdc = null;
				//  -- Key --
				if (IsKey)
				{
					//	=>	Table.Column,
					sqlSELECT.append(entity.getTableName()).append(".").append(ColumnName).append(",");
					groupByColumns.add(entity.getTableName()+"."+ColumnName);
					pdc = new PrintDataColumn(AD_Column_ID, ColumnName, AD_Reference_ID, FieldLength, KEY, isPageBreak);	//	KeyColumn
					m_Name_ID = ColumnName;
				}
				//	-- Parent, TableDir (and unqualified Search) --
				else if ( (IsParent && DisplayType.isLookup(AD_Reference_ID)) 
						|| AD_Reference_ID == DisplayType.TableDir
						|| (AD_Reference_ID == DisplayType.Search && AD_Reference_Value_ID == 0)
						)
				{
					//  Creates Embedded SQL in the form
					//  SELECT ColumnTable.Name FROM ColumnTable WHERE TableName.ColumnName=ColumnTable.ColumnName
					String eSql;

					if (ColumnSQL.length() > 0)
					{
						eSql = MLookupFactory.getLookup_TableDirEmbed(m_language, ColumnName, entity.getTableName(), "(" + ColumnSQL + ")");
						lookupSQL = ColumnSQL;
					}
					else
					{
						eSql = MLookupFactory.getLookup_TableDirEmbed(m_language, ColumnName, entity.getTableName());
					}
					if (eSql.length() > 0)
					{
						//	TableName
						String table = ColumnName;
						if (table.endsWith("_ID"))
							table = table.substring(0, table.length()-3);
						//  DisplayColumn
						String display = ColumnName;
						//	=> (..) AS AName, Table.ID,
						sqlSELECT.append("(").append(eSql).append(") AS ").append(m_synonym).append(display).append(",")
						.append(lookupSQL).append(" AS ").append(ColumnName).append(",");
						groupByColumns.add(lookupSQL);
						orderName = m_synonym + display;
						//
						pdc = new PrintDataColumn(AD_Column_ID, ColumnName, AD_Reference_ID, FieldLength, orderName, isPageBreak);
						synonymNext();
					}
				}

				//	-- Table --
				else if (AD_Reference_ID == DisplayType.Table
						|| (AD_Reference_ID == DisplayType.Search && AD_Reference_Value_ID != 0)
						)
				{
					if (ColumnSQL.length() > 0)
					{
						lookupSQL = ColumnSQL;
					}
					if (AD_Reference_Value_ID <= 0)
					{
						log.warning(ColumnName + " - AD_Reference_Value_ID not set");
						continue;
					}
					TableReference tr = getTableReference(AD_Reference_Value_ID);
					String display = tr.DisplayColumn;
					//	=> A.Name AS AName, Table.ID,
					if (tr.IsValueDisplayed)
						sqlSELECT.append(m_synonym).append(".Value||'-'||");
					sqlSELECT.append(m_synonym).append(".").append(display);
					sqlSELECT.append(" AS ").append(m_synonym).append(display).append(",")
					.append(lookupSQL).append(" AS ").append(ColumnName).append(",");
					groupByColumns.add(m_synonym+display);
					groupByColumns.add(lookupSQL);
					orderName = m_synonym + display;

					//	=> x JOIN table A ON (x.KeyColumn=A.Key)
					if (IsMandatory)
						sqlFROM.append(" INNER JOIN ");
					else
						sqlFROM.append(" LEFT OUTER JOIN ");
					sqlFROM.append(tr.TableName).append(" ").append(m_synonym).append(" ON (")
					.append(lookupSQL).append("=")
					.append(m_synonym).append(".").append(tr.KeyColumn).append(")");
					//
					pdc = new PrintDataColumn(AD_Column_ID, ColumnName, AD_Reference_ID, FieldLength, orderName, isPageBreak);
					synonymNext();
				}

				//	-- List or Button with ReferenceValue --
				else if (AD_Reference_ID == DisplayType.List 
						|| (AD_Reference_ID == DisplayType.Button && AD_Reference_Value_ID != 0))
				{
					if (ColumnSQL.length() > 0)
					{
						lookupSQL = ColumnSQL;
					}
					if (Env.isBaseLanguage(m_language, "AD_Ref_List"))
					{
						//	=> A.Name AS AName,
						sqlSELECT.append(m_synonym).append(".Name AS ").append(m_synonym).append("Name,");
						groupByColumns.add(m_synonym+".Name");
						orderName = m_synonym + "Name";
						//	=> x JOIN AD_Ref_List A ON (x.KeyColumn=A.Value AND A.AD_Reference_ID=123)
						if (IsMandatory)
							sqlFROM.append(" INNER JOIN ");
						else
							sqlFROM.append(" LEFT OUTER JOIN ");
						sqlFROM.append("AD_Ref_List ").append(m_synonym).append(" ON (")
						.append(lookupSQL).append("=").append(m_synonym).append(".Value")
						.append(" AND ").append(m_synonym).append(".AD_Reference_ID=").append(AD_Reference_Value_ID).append(")");
					}
					else
					{
						//	=> A.Name AS AName,
						sqlSELECT.append(m_synonym).append(".Name AS ").append(m_synonym).append("Name,");
						groupByColumns.add(m_synonym+".Name");
						orderName = m_synonym + "Name";

						//	LEFT OUTER JOIN AD_Ref_List XA ON (AD_Table.EntityType=XA.Value AND XA.AD_Reference_ID=245)
						//	LEFT OUTER JOIN AD_Ref_List_Trl A ON (XA.AD_Ref_List_ID=A.AD_Ref_List_ID AND A.AD_Language='de_DE')
						if (IsMandatory)
							sqlFROM.append(" INNER JOIN ");
						else
							sqlFROM.append(" LEFT OUTER JOIN ");
						sqlFROM.append(" AD_Ref_List X").append(m_synonym).append(" ON (")
						.append(lookupSQL).append("=X")
						.append(m_synonym).append(".Value AND X").append(m_synonym).append(".AD_Reference_ID=").append(AD_Reference_Value_ID)
						.append(")");
						if (IsMandatory)
							sqlFROM.append(" INNER JOIN ");
						else
							sqlFROM.append(" LEFT OUTER JOIN ");
						sqlFROM.append(" AD_Ref_List_Trl ").append(m_synonym).append(" ON (X")
						.append(m_synonym).append(".AD_Ref_List_ID=").append(m_synonym).append(".AD_Ref_List_ID")
						.append(" AND ").append(m_synonym).append(".AD_Language='").append(m_language.getAD_Language()).append("')");
					}
					// 	TableName.ColumnName,
					sqlSELECT.append(lookupSQL).append(" AS ").append(ColumnName).append(",");
					pdc = new PrintDataColumn(AD_Column_ID, ColumnName, AD_Reference_ID, FieldLength, orderName, isPageBreak);
					synonymNext();
				}

				//  -- Special Lookups --
				else if (AD_Reference_ID == DisplayType.Location
						|| AD_Reference_ID == DisplayType.Account
						|| AD_Reference_ID == DisplayType.Locator
						|| AD_Reference_ID == DisplayType.PAttribute
						)
				{
					if (ColumnSQL.length() > 0)
					{
						lookupSQL = ColumnSQL;
					}
					//	TableName, DisplayColumn
					String table = ""; 
					String key = ""; 
					String display = ""; 
					String synonym = null;
					//
					if (AD_Reference_ID == DisplayType.Location)
					{
						table = "C_Location";
						key = "C_Location_ID";
						display = "Address1||'.'";	//	in case City is empty
						synonym = "Address";
					}
					else if (AD_Reference_ID == DisplayType.Account)
					{
						table = "C_ValidCombination";
						key = "C_ValidCombination_ID";
						display = "Combination";
					}
					else if (AD_Reference_ID == DisplayType.Locator)
					{
						table = "M_Locator";
						key = "M_Locator_ID";
						display = "Value";
					}
					else if (AD_Reference_ID == DisplayType.PAttribute)
					{
						table = "M_AttributeSetInstance";
						key = "M_AttributeSetInstance_ID";
						display = "Description";
						if (CLogMgt.isLevelFine())
							display += "||'{'||" + m_synonym + ".M_AttributeSetInstance_ID||'}'";
						synonym = "Description";
					}
					if (synonym == null)
						synonym = display;

					//	=> A.Name AS AName, table.ID,
					sqlSELECT.append(m_synonym).append(".").append(display).append(" AS ")
					.append(m_synonym).append(synonym).append(",")
					.append(lookupSQL).append(" AS ").append(ColumnName).append(",");
					groupByColumns.add(m_synonym+"."+synonym);
					groupByColumns.add(lookupSQL);
					orderName = m_synonym + synonym;
					//	=> x JOIN table A ON (table.ID=A.Key)
					if (IsMandatory)
						sqlFROM.append(" INNER JOIN ");
					else
						sqlFROM.append(" LEFT OUTER JOIN ");
					sqlFROM.append(table).append(" ").append(m_synonym).append(" ON (")
					.append(lookupSQL).append("=")
					.append(m_synonym).append(".").append(key).append(")");
					//
					pdc = new PrintDataColumn(AD_Column_ID, ColumnName, AD_Reference_ID, FieldLength, orderName, isPageBreak);
					synonymNext();
				}

				//	-- Standard Column --
				else
				{
					//int index = FunctionColumn.indexOf('@');
					if (ColumnSQL != null && ColumnSQL.length() > 0)
					{
						//	=> ColumnSQL AS ColumnName
						sqlSELECT.append(ColumnSQL).append(" AS ").append(ColumnName).append(",");
						//if (!IsGroupFunction)
						//	groupByColumns.add(ColumnSQL);
						orderName = ColumnName;		//	no prefix for synonym
					}
					StringBuffer sb = new StringBuffer();
					sb.append(entity.getTableName()).append(".").append(ColumnName);
					sqlSELECT.append(sb).append(",");
					pdc = new PrintDataColumn(AD_Column_ID, ColumnName, 
							AD_Reference_ID, FieldLength, ColumnName, isPageBreak);
				}
				if (pdc == null)
					continue;
				columns.add(pdc);
			}	//	for all Fields in Tab
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "SQL=" + sql);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}

		if (columns.size() == 0)
		{
			log.log(Level.SEVERE, "No Colums -  start again");
			log.finest("No Colums - SQL=" + sql);
			return null;
		}

		boolean hasLevelNo = false;
		/**
		 *	Assemble final SQL - delete last SELECT ','
		 */
		StringBuffer finalSQL = new StringBuffer();
		finalSQL.append(sqlSELECT.substring(0, sqlSELECT.length()-1))
		.append(sqlFROM);

		//	User supplied Where Clause
		if (query != null && query.isActive ())
		{
			finalSQL.append (" WHERE ");
			if (!query.getTableName ().equals (entity.getTableName()))
				query.setTableName (entity.getTableName());
			finalSQL.append (query.getWhereClause (true));
		}
		//	Access Restriction
		MRole role = MRole.getDefault(ctx, false);
		if (role.getAD_Role_ID() == 0 && !Ini.isClient())
			;	//	System Access
		else
			finalSQL = new StringBuffer (role.addAccessSQL (finalSQL.toString (), 
					entity.getTableName(), MRole.SQL_FULLYQUALIFIED, MRole.SQL_RO));

		//	Add ORDER BY clause
		if (orderColumns != null)
		{
			for (int i = 0; i < orderColumns.size(); i++)
			{
				if (i == 0)
					finalSQL.append(" ORDER BY ");
				else
					finalSQL.append(",");
				String by = (String)orderColumns.get(i);
				if (by == null || by.length() == 0)
					by = String.valueOf(i+1);
				finalSQL.append(by);
			}
		}	//	order by


		//	Print Data
		PrintData pd = new PrintData (ctx, entity.getTableName());
		PrintDataColumn[] info = new PrintDataColumn [columns.size()];
		columns.toArray(info);		//	column order is is m_synonymc with SELECT column position
		pd.setColumnInfo(info);
		pd.setTableName(entity.getTableName());
		pd.setSQL(finalSQL.toString());
		pd.setHasLevelNo(hasLevelNo);
		
		log.finest (finalSQL.toString ());
		//log.finest ("Group=" + m_group);
		return pd;
	}	//	getPrintDataInfo	

	/**
	 *	Get TableName and ColumnName for Reference Tables.
	 *  @param AD_Reference_Value_ID reference value
	 *	@return 0=TableName, 1=KeyColumn, 2=DisplayColumn
	 */
	public static TableReference getTableReference (int AD_Reference_Value_ID)
	{
		if (AD_Reference_Value_ID <= 0)
			throw new IllegalArgumentException("AD_Reference_Value_ID <= 0");
		//
		TableReference tr = new TableReference();
		//
		String SQL = "SELECT t.TableName, ck.ColumnName AS KeyColumn,"	//	1..2
				+ " cd.ColumnName AS DisplayColumn, rt.IsValueDisplayed, cd.IsTranslated "
				+ "FROM AD_Ref_Table rt"
				+ " INNER JOIN AD_Table t ON (rt.AD_Table_ID = t.AD_Table_ID)"
				+ " INNER JOIN AD_Column ck ON (rt.AD_Key = ck.AD_Column_ID)"
				+ " INNER JOIN AD_Column cd ON (rt.AD_Display = cd.AD_Column_ID) "
				+ "WHERE rt.AD_Reference_ID=?"			//	1
				+ " AND rt.IsActive = 'Y' AND t.IsActive = 'Y'";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(SQL, null);
			pstmt.setInt (1, AD_Reference_Value_ID);
			rs = pstmt.executeQuery();
			if (rs.next())
			{
				tr.TableName = rs.getString(1);
				tr.KeyColumn = rs.getString(2);
				tr.DisplayColumn = rs.getString(3);
				tr.IsValueDisplayed = "Y".equals(rs.getString(4));
				tr.IsTranslated = "Y".equals(rs.getString(5));
			}
		}
		catch (SQLException ex)
		{
			log.log(Level.SEVERE, SQL, ex);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		return tr;
	}	//  getTableReference

	/**
	 *	Next Synonym.
	 * 	Creates next synonym A..Z AA..ZZ AAA..ZZZ
	 */
	private void synonymNext()
	{
		int length = m_synonym.length();
		char cc = m_synonym.charAt(0);
		if (cc == 'Z')
		{
			cc = 'A';
			length++;
		}
		else
			cc++;
		//
		m_synonym = String.valueOf(cc);
		if (length == 1)
			return;
		m_synonym += String.valueOf(cc);
		if (length == 2)
			return;
		m_synonym += String.valueOf(cc);
	}	//	synonymNext

	/**************************************************************************
	 * 	Load Data into PrintData
	 * 	@param pd print data with SQL and ColumnInfo set
	 *  @param format print format
	 */
	public void loadPrintData (PrintData pd)
	{
		int rowNo = 0;
		PrintDataColumn pdc = null;
		boolean hasLevelNo = pd.hasLevelNo();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			System.out.println(pd.getSQL());
			pstmt = DB.prepareStatement(pd.getSQL(), m_trxName);
			rs = pstmt.executeQuery();
			//	Row Loop
			while (rs.next())
			{
				int counter = 1;
				//	get columns
				for (int i = 0; i < pd.getColumnInfo().length; i++)
				{
					pdc = pd.getColumnInfo()[i];
					PrintDataElement pde = null;

					//	Key Column - No DisplayColumn
					if (pdc.getAlias().equals(KEY))
					{
						if (pdc.getColumnName().endsWith("_ID"))
						{
							m_ID = rs.getInt(counter++);
							if (!rs.wasNull())
							{
								KeyNamePair pp = new KeyNamePair(m_ID, KEY);	//	Key
								pde = new PrintDataElement(pdc.getColumnName(), pp, pdc.getDisplayType(),
										true, pdc.isPageBreak(), pdc.getFormatPattern());
							}
						}
						else
						{
							//	String id = rs.getString(pdc.getColumnIDName());
							String id = rs.getString(counter++);
							if (!rs.wasNull())
							{
								ValueNamePair pp = new ValueNamePair(id, KEY);	//	Key
								pde = new PrintDataElement(pdc.getColumnName(), pp, pdc.getDisplayType(),
										true, pdc.isPageBreak(), pdc.getFormatPattern());
							}
						}
					}
					//	Non-Key Column
					else
					{
						//	Display and Value Column
						if (pdc.hasAlias())
						{
							//	DisplayColumn first
							String display = rs.getString(counter++);
							if (pdc.getColumnName().endsWith("_ID"))
							{
								int id = rs.getInt(counter++);
								if (display != null && !rs.wasNull())
								{
									KeyNamePair pp = new KeyNamePair(id, display);
									pde = new PrintDataElement(pdc.getColumnName(), pp, pdc.getDisplayType(), pdc.getFormatPattern());
								}
							}
							else
							{
								String id = rs.getString(counter++);
								if (display != null && !rs.wasNull())
								{
									ValueNamePair pp = new ValueNamePair(id, display);
									pde = new PrintDataElement(pdc.getColumnName(), pp, pdc.getDisplayType(), pdc.getFormatPattern());
								}
							}
						}
						//	Display Value only
						else
						{
							//	Transformation for Booleans
							if (pdc.getDisplayType() == DisplayType.YesNo)
							{
								String s = rs.getString(counter++);
								if (!rs.wasNull())
								{
									boolean b = s.equals("Y");
									pde = new PrintDataElement(pdc.getColumnName(), new Boolean(b), pdc.getDisplayType(), pdc.getFormatPattern());
								}
							}
							else if (pdc.getDisplayType() == DisplayType.TextLong)
							{
								String value = "";
								if ("java.lang.String".equals(rs.getMetaData().getColumnClassName(counter)))
								{
									value = rs.getString(counter++);
								}
								else
								{
									Clob clob = rs.getClob(counter++);
									if (clob != null)
									{
										long length = clob.length();
										value = clob.getSubString(1, (int)length);
									}
								}
								pde = new PrintDataElement(pdc.getColumnName(), value, pdc.getDisplayType(), pdc.getFormatPattern());
							}
							// fix bug [ 1755592 ] Printing time in format
							else if (pdc.getDisplayType() == DisplayType.DateTime)
							{
								Timestamp datetime = rs.getTimestamp(counter++);
								pde = new PrintDataElement(pdc.getColumnName(), datetime, pdc.getDisplayType(), pdc.getFormatPattern());
							}
							else
							//	The general case
							{
								Object obj = rs.getObject(counter++);
								if (obj == null)
									obj = "";
								if (obj != null && obj instanceof String)
								{
									obj = ((String)obj).trim();
									//									if (((String)obj).length() == 0)
									//										obj = null;
								}
								if (obj != null)
								{
									pde = new PrintDataElement(pdc.getColumnName(), obj, pdc.getDisplayType(), pdc.getFormatPattern());
								}
							}
						}	//	Value only
					}	//	Non-Key Column
					if (pde != null)
					{
						pd.addNode(pde);												
					}
				}	//	for all columns				
				pd.addRow(false, pd.getLineLevelNo());
			}	//	for all rows
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, pdc + " - " + e.getMessage() + "\nSQL=" + pd.getSQL());
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		if (pd.getRowCount() == 0)
		{
			if (CLogMgt.isLevelFiner())
				log.warning("NO Rows - ms=" + (System.currentTimeMillis()-m_startTime) 
						+ " - " + pd.getSQL());
			else
				log.warning("NO Rows - ms=" + (System.currentTimeMillis()-m_startTime)); 
		}
		else
			log.info("Rows=" + pd.getRowCount()
					+ " - ms=" + (System.currentTimeMillis()-m_startTime));
	}	//	loadPrintData

//	public void load(PrintData printData) {
//		load(printData, true);
//	}

	public void load(PrintData printData, boolean header, List<String> fields) {
		int columnCount = printData.getColumnInfo().length;
		for (int c = 0; c < columnCount; c++)
		{				
			Object dataElement = null;
			Object obj = null;
			obj = printData.getNode(c);
			if (obj == null)
				;
			else if (obj instanceof PrintDataElement)
			{				
				PrintDataElement pde = (PrintDataElement)obj;
				if (fields.contains(pde.getColumnName()))
				{
					if (pde.isID() || pde.isYesNo())
					{
						if (pde.getValue() instanceof KeyNamePair)
						{
							KeyNamePair kp = (KeyNamePair) pde.getValue();
							if (header)
								m_pw.AddProperty(pde.getColumnName(), kp.getName());
							else
								m_pw.AddPropertyLine(pde.getColumnName(), kp.getName());
						}
						else if (pde.getValue() instanceof ValueNamePair)
						{							
							ValueNamePair vp = (ValueNamePair) pde.getValue();		
							if (header)
								m_pw.AddProperty(pde.getColumnName(), vp.getName());
							else
								m_pw.AddPropertyLine(pde.getColumnName(), vp.getName());
						}
					}
					else
					{
						if (header)
							m_pw.AddProperty(pde.getColumnName(), pde.getValueAsString());
						else
							m_pw.AddPropertyLine(pde.getColumnName(), pde.getValueAsString());
					}
				}
			}
		}	//	for all columns			
	}
	

	public void fill(Properties ctx, MQuery query, String tableName, List<String> fields) {
		PrintData pd = getPrintDataInfo (ctx, query, tableName, fields);
		loadPrintData(pd);
		pd.setRowIndex(0);
		load(pd, true, fields);
	}
	
//	public boolean startlines(Properties ctx, MQuery query, String tableName, List<String> fields)
//	{
//		if (pdlines == null)
//		{
//			pdlines = getPrintDataInfo (ctx, query, tableName, fields);
//			loadPrintData(pdlines);
//		}
//		else
//		{
//			loadline(pdlines);
//		}
//	}

	
	public int fillline(Properties ctx, MQuery query, String tableName, List<String> fields) {		
		//PrintData pd = getPrintDataInfo (ctx, query, tableName, fields);
		//loadPrintData(pd);
		//loadline(pd);
		PrintData pd = getPrintDataInfo (ctx, query, tableName, fields);				
		loadPrintData(pd);
		pd.setRowIndex(0);
		load(pd, false, fields);
		//return nextline();
		return 0;
	}

//	private void loadline(PrintData printData) {
//		load(printData, false);
//	}

//	// tomado de LayoutEngine.java
//	// private PrintElement layoutTable (MPrintFormat format, PrintData printData,int xOffset)
//	private void load(PrintData printData, boolean header) {
//		int rows = printData.getRowCount();
//		int columnCount = printData.getColumnInfo().length;
//		for (int row = 0; row < rows; row++)
//		{
//			printData.setRowIndex(row);
//			for (int c = 0; c < columnCount; c++)
//			{				
//				Object dataElement = null;
//				Object obj = null;
//				obj = printData.getNode(c);
//				if (obj == null)
//					;
//				else if (obj instanceof PrintDataElement)
//				{
//					PrintDataElement pde = (PrintDataElement)obj;
//					if (pde.isID() || pde.isYesNo())
//					{
//						if (pde.getValue() instanceof KeyNamePair)
//						{
//							KeyNamePair kp = (KeyNamePair) pde.getValue();
//							if (header)
//								m_pw.AddProperty(pde.getColumnName(), kp.getName());
//							else
//								m_pw.AddPropertyLine(pde.getColumnName(), kp.getName());
//						}
//						else if (pde.getValue() instanceof ValueNamePair)
//						{							
//							ValueNamePair vp = (ValueNamePair) pde.getValue();		
//							if (header)
//								m_pw.AddProperty(pde.getColumnName(), vp.getName());
//							else
//								m_pw.AddPropertyLine(pde.getColumnName(), vp.getName());
//						}
//					}
//					else
//					{
//						if (header)
//							m_pw.AddProperty(pde.getColumnName(), pde.getValueAsString());
//						else
//							m_pw.AddPropertyLine(pde.getColumnName(), pde.getValueAsString());
//					}
//				}
//			}	//	for all columns			
//		}	
//	}
	
	private Object getProperty(String group, String id) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getName_ID() 
	{
		return m_Name_ID;
	}
	public int get_ID() {
		return m_ID;		
	}

	public void addrelations(List<String> tables) {
		m_relations = new HashMap<String, Integer>();		
		if (tables == null)
			return;
		for (String tablerel:tables)
		{			
			String id = String.format("%s_ID",tablerel);
			m_relations.put(id, -1);
		}		
	}
	
	
	public KeyNamePair getrelation(PrintData pd, String relation)
	{
		String relationid = String.format("%s_ID",relation);
		KeyNamePair kp = null;
		int index = pd.getIndex(relationid);		
		if (index >= 0)
		{
			PrintDataElement pde = (PrintDataElement) pd.getNode(index);
			kp = new KeyNamePair(Integer.valueOf(pde.getValueAsString()),relationid);			
			System.out.println(pde);
		}
		else
		{
			kp = new KeyNamePair(get_ID(), getName_ID());
		}
		return kp;
	}
	
	public static void main(String[] args) {
		org.compiere.Xendra.startupEnvironment(false);
		PrintWorker pw = new PrintWorker();
		//FormatMessage s = new FormatMessage(Constants.SALESMESSAGE);		
		MQuery query = new MQuery();
		query.addRestriction("C_Invoice_ID", MQuery.EQUAL, 2142593);		
		PrintWorkerPO pow = new PrintWorkerPO(Language.getLanguage("es_PE"),pw, null);
		pow.fill(Env.getCtx(), query, X_C_Invoice.Table_Name, null);		
		List<X_C_InvoiceLine> lines = new Query(Env.getCtx(), X_C_InvoiceLine.Table_Name, "C_Invoice_ID = ?", null)
			.setParameters(2142593).list();
		int i = 0;
		for (X_C_InvoiceLine line:lines)
		{
			String lineno = String.format("Line%d", i);
			query = new MQuery();
			query.addRestriction("C_InvoiceLine_ID", MQuery.EQUAL, line.getC_InvoiceLine_ID());		
			pow.fillline(Env.getCtx(), query, X_C_InvoiceLine.Table_Name, null);
			i++;
		}
		//
		MInvoice invoice = MInvoice.get(Env.getCtx(), 2142593);
		MDocType dt = MDocType.get(Env.getCtx(), invoice.getC_DocType_ID());
		
		X_A_MachinePrinter mp = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_MachinePrinter_ID = ?", null)
		.setParameters(dt.getA_MachinePrinter_ID()).first();		
		
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(mp.getA_Machine_ID()).first();
		if (machine != null)
		{				
			pw.setPrinterDocumentFormat_ID(296);
			pw.setJobName((String) pow.getProperty(Constants.HEADER, X_C_Invoice.COLUMNNAME_DocumentNo));
			pw.setPrintServer(machine);
			String error = pw.Print(PrintWorker.ReceiveJob);
			if (error.length() == 0) {
				
			}			
			//pw.setAttribute(s, Constants.HEADER, Constants.COLUMNNAME_Created);
		}		
	}

	public void fill(PrintData pd, List<String> fields, boolean header) {
		for (String field:fields)
		{
			PrintDataElement pde = (PrintDataElement) pd.getNode(field);
			if (pde.isID() || pde.isYesNo())
			{
				if (pde.getValue() instanceof KeyNamePair)
				{
					KeyNamePair kp = (KeyNamePair) pde.getValue();
					if (header)
						m_pw.AddProperty(pde.getColumnName(), kp.getName());
					else
						m_pw.AddPropertyLine(pde.getColumnName(), kp.getName());
				}
				else if (pde.getValue() instanceof ValueNamePair)
				{							
					ValueNamePair vp = (ValueNamePair) pde.getValue();		
					if (header)
						m_pw.AddProperty(pde.getColumnName(), vp.getName());
					else
						m_pw.AddPropertyLine(pde.getColumnName(), vp.getName());
				}
			}
			else
			{
				if (header)
					m_pw.AddProperty(pde.getColumnName(), pde.getValueAsString());
				else
					m_pw.AddPropertyLine(pde.getColumnName(), pde.getValueAsString());
			}			
		}
		
	}
}
