/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * Copyright (C) 2007-2016 dravios All Rights Reserved.                       *
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
package org.xendra.replication;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

import org.compiere.model.MClient;
import org.compiere.model.MColumn;
import org.compiere.model.MRefTable;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_AD_Ref_Table;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.model.reference.REF_AD_TableAccessLevels;
import org.compiere.model.reference.REF_ReplicationType;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.util.Util;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xendra.Constants;
import org.xendra.db.Querys;
import org.xendra.exceptions.XendraException;

/* 
 *  @author xapiens
 * 
 *  version 0.2 functional slow without optimization
 *  version 0.3 added optimization of tables dependencies, stored in ad_table 
 * */
public class ReplicationEngine  {
	private static final Object VERSION = "0.3";
	protected CLogger log = CLogger.getCLogger(ReplicationEngine.class);
	private static ReplicationEngine m_replicationengine;
	private int m_level = 0;
	private String tablename = "";
	private X_AD_Client m_client;
	private HashMap<String, List<String>> reactives = new HashMap<String, List<String>>();
	private HashMap<String, HashMap<String, Record>> records2 = new HashMap<String, HashMap<String, Record>>();
	private HashMap<String, List<String>> Tables = new HashMap<String, List<String>>();
	private HashMap<Integer, List> optimized = new HashMap<Integer, List>();
	List<String> tablesprocessed = new ArrayList<String>();
	public ReplicationEngine() {

	}

	public ReplicationEngine(X_AD_Client client) {
		m_client = client;
	}

	private X_AD_Client getClient() {
		return m_client;
	}

	public String decode(List<PO> records) throws Exception {
		String retval = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
		ReplicationEngine replication = new ReplicationEngine(m_client);
		try {
			for (PO record:records)
			{
				String error = replication.processtable(record, 0);
				if (error.length() == 0)
					continue;
				else
					throw new Exception (error);
			}
			retval += replication.build();
		}
		catch (Exception e)
		{			
			e.printStackTrace();
			log.severe(e.getMessage());
		}		
		return retval;
	}

	public String encode (File xmlFile) throws Exception {
		String error = "";
		BufferedInputStream buf;
		try {
			buf = new BufferedInputStream(new FileInputStream(xmlFile));
			SAXBuilder builder = new SAXBuilder();
			builder.setIgnoringElementContentWhitespace(true);
			Document doc = null;
			try {
				doc = builder.build(buf);
			} catch (Exception e) {
				error = e.getMessage();
			}
			if (doc != null)
				error = encode(doc);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return error;
	}
	public String encode(Document doc) throws Exception {
		String error = "";
		Trx localTrx = Trx.get(Trx.createTrxName("ENC"), true);		
		String trxName = localTrx.getTrxName();		
		try {
			Element node = doc.getRootElement();
			if (node.getName().equals("stream")) {
				List<Element> records = node.getChildren("record");
				for (Element record:records) {
					Attribute tablenameattr = record.getAttribute("name");
					if (tablenameattr == null) {							
						throw new Exception("Streaming version obsolete");
					}
					String tablename = tablenameattr.getValue();
					error = getSequence(tablename, record);
					if (error.length() > 0) {
						throw new Exception(error);
					}
					Iterator it = optimized.keySet().iterator();
					Integer maxlevel = 0;
					while (it.hasNext()) {
						Integer level = (Integer) it.next();
						if (level > maxlevel)
							maxlevel = level;													
					}
					List<Element> etables = record.getChildren("table");
					for (int i=maxlevel; i > 0; i--) {
						List<String> tables = optimized.get(i);
						error = encodescantables(tablename, i, tables, etables, localTrx);
						if (error.length() > 0) {
							throw new Exception(error);
						}						
					}
					//tryouts--;
					//}
					if (!localTrx.commit()) {
						error = DB.getLastError();
						localTrx.rollback();
					}
				}
			}
		} catch (Exception e) {
			error = e.getMessage();
			e.printStackTrace();
			localTrx.rollback();
		} finally {			
			localTrx.close();
		}
		return error;
	}

	private String encodescantables(String tablename, int i, List<String> tables, List<Element> etables, Trx localTrx) {
		String error = "";
		try {
			for (String table:tables) {
				for (Element etable:etables) {								
					if (etable.getAttributeValue("name").equals(table)) {		
						error = process2(etable, i, localTrx.getTrxName());
						if (error.length() > 0) {
							if (error.contains("MANDATORY")) {
								String field = error.substring("MANDATORY".length()).trim();											
								X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
								.setParameters(table).first();
								X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND ColumnName = ?", null)
								.setParameters(t.getAD_Table_ID(), field).first();
								String tableName = "";
								if (column.getAD_Reference_ID() == DisplayType.Location) {
									tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));
								}
								else if (column.getAD_Reference_ID() == DisplayType.Search && column.getAD_Reference_Value_ID() == 0) {														
									tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));
								}
								else if (column.getAD_Reference_ID() == DisplayType.TableDir || 
										column.getAD_Reference_ID() == DisplayType.Locator ||
										column.getAD_Reference_ID() == DisplayType.Location) {
									tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));								
								}
								else if (column.getAD_Reference_ID() == DisplayType.Table)
								{
									MRefTable reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID=?", null)
									.setParameters(column.getAD_Reference_Value_ID())
									.first();
									if (reftable != null)
									{
										MTable xtable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
										tableName = xtable.getTableName();
									}
								}
								else if (column.getAD_Reference_Value_ID() > 0)
								{
									X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
									.setParameters(column.getAD_Reference_Value_ID()).first();
									if (reference != null)
									{
										if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
										{
											X_AD_Ref_Table reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID = ?", null)
											.setParameters(reference.getAD_Reference_ID()).first();
											if (reftable != null)
											{
												MTable adreftable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
												tableName = adreftable.getTableName();
											}
										}
									}															
								}
								UpdateTuning(tableName, i+1);
								save(tablename);					
								throw new Exception(error);
							} else if (error.contains("duplicate key value violates unique constraint")) {
								// search and destroy
								//private void searchanddestroy(String tn, X_AD_Table adtable, Element row, String identifier) {											
							}
						} else {

						}

					}
				}
			}
		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	}

	private void UpdateTuning(String tableName, int level) {
		Iterator levelsoptimized = optimized.keySet().iterator();
		while (levelsoptimized.hasNext()) {
			Integer lvl = (Integer) levelsoptimized.next();
			List<String> tables = optimized.get(lvl);
			if (tables.contains(tableName)) { 
				tables.remove(tableName);
				optimized.put(lvl, tables);
				break;
			}
		}
		List<String> tables = new ArrayList<String>();
		if (optimized.containsKey(level))
			tables = optimized.get(level);
		tables.add(tableName);
		optimized.put(level, tables);
	}			

	public String encode2(Document doc) throws Exception {
		String error = "";
		List<String> tablesprocessed = new ArrayList<String>();
		Trx localTrx = Trx.get(Trx.createTrxName("ENC"), true);
		try {						
			HashMap<Integer, List> levels = new HashMap<Integer, List>();
			Element node = doc.getRootElement();
			if (node.getName().equals("stream"))
			{
				List<Element> records = node.getChildren("record");
				for (Element record:records)
				{
					Integer maxlevel = record.getAttribute("level").getIntValue();
					String tablename = record.getAttribute("name").getValue();
					error = getSequence(tablename, record);
					if (error.length() > 0) {
						throw new Exception(error);
					}					
					if (record.getAttribute("level") != null)
					{
						Savepoint savepoint = localTrx.setSavepoint(null);
						for (int i=maxlevel; i > 0; i--) {
							List<Element> clevel = levels.get(i);
							if (clevel == null) 
								continue;
							Iterator it2 = clevel.iterator();
							while (it2.hasNext()) {
								Element table = (Element) it2.next();
								System.out.println(String.format("level %s %s", i, table.getAttributeValue("name")));
								if (tablesprocessed.contains(table.getAttributeValue("name"))) {
									error = process2(table, i, localTrx.getTrxName());
									if (error.length() == 0) {
										if (reactives.containsKey(table.getAttributeValue("name"))) {
											List<String> rtables= reactives.get(table.getAttributeValue("name"));
											for (String rtable:rtables) {
												for (int j=i; j > 0; j--) {
													List<Element> cl = levels.get(j);
													Iterator it3 = cl.iterator();
													while (it3.hasNext()) {
														Element ct = (Element) it3.next();
														if (ct.getAttributeValue("name").equals(rtable)) {
															error = process2(ct, i, localTrx.getTrxName());
															if (error.length() == 0) {
																if (j <= i) {
																}
																tablesprocessed.remove(ct.getAttributeValue("name"));
															}														
														}
													}
												}
											}
										}
										tablesprocessed.remove(table.getAttributeValue("name"));
										//it2.remove();
									} else {
										if (error.contains("ERROR")) {
											i = 0;
											break;
										}
										else {
											int plevel = i - 1;
											if (optimized.containsKey(i)) {
												List<String> tablenames = optimized.get(i);
												if (tablenames == null)
													tablenames = new ArrayList<String>();												
												tablenames.remove(table.getAttributeValue("name"));
												optimized.put(i, tablenames);
											}
											List<String> tablenames = new ArrayList<String>();
											if (optimized.containsKey(plevel)) {
												tablenames = optimized.get(plevel);
											}										
											tablenames.add(table.getAttributeValue("name"));
											optimized.put(plevel, tablenames);
											ArrayList<Element> prevlevel = new ArrayList<Element>();
											if (levels.containsKey(plevel)) {
												prevlevel = (ArrayList<Element>) levels.get(plevel);
											}			
											prevlevel.add(table);																						
											levels.put(plevel, prevlevel);
										}
									}
								}
							}
							if (tablesprocessed.size() > 0 && i -1 == 0) {
								i = maxlevel;
							}
						}
						if (tablesprocessed.size() > 0) {
							localTrx.rollback();							
						} else {
							if (!localTrx.commit())
								localTrx.rollback(savepoint);							
						}
					}
				}			
			}
		}
		catch (Exception e)
		{
			error = e.getMessage();
			e.printStackTrace();
		}
		finally {
			localTrx.close();
		}
		return error;
	}


	private String getSequence(String tablename, Element record) {
		String error = "";
		optimized = getStored(record);
		if (optimized.size() == 0) {
			optimized = Fill(record);
			if (optimized.size() > 0) {
				error = Tuning(record);
				if (error.length() == 0)
					save(tablename);				
			}
		} 
		return error;
	}

	private void save(String tablename) {
		X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "Tablename = ?" , null)
		.setParameters(tablename)
		.first();
		HashMap props = t.getProperties();
		Iterator itlevels = optimized.keySet().iterator();
		String tlevel = "";
		while (itlevels.hasNext()) {
			Integer l = (Integer) itlevels.next();
			if (tlevel.length() > 0) {
				tlevel += ",";
			}
			tlevel += String.valueOf(l);
			List<String> tables = optimized.get(l);
			String tline = "";
			for (String table:tables) {
				if (tline.length() > 0)
					tline+=',';
				tline += table;
			}
			props.put(String.valueOf(l), tline);
		}
		props.put("replication", tlevel);
		t.setProperties(props);
		t.save();
	}

	private String Tuning(Element record) {
		String error = "";
		Trx localTrx = Trx.get(Trx.createTrxName("TUN"), true);
		try {
			HashMap<Integer, HashMap<String, Element>> tuninglist = new HashMap<Integer, HashMap<String, Element>>();
			List<Element> etables = record.getChildren("table");
			Integer maxlevel = 0;
			Iterator it = optimized.keySet().iterator();
			while (it.hasNext()) {
				Integer lvl = (Integer) it.next();
				List<String> tblinlvls = optimized.get(lvl);
				HashMap tableelement = new HashMap<String, Element>();
				for (String tbl:tblinlvls) {
					Element tblelem = null; // record.getChildren()
					for (Element etable:etables) {
						if (etable.getAttributeValue("name").equals(tbl)) {
							tblelem = etable;
							break;
						}
					}
					if (tuninglist.containsKey(lvl))
						tableelement = tuninglist.get(lvl);
					tableelement.put(tbl, tblelem);									
				}
				tuninglist.put(lvl, tableelement);
				if (lvl > maxlevel) {
					maxlevel = lvl;
				}
			}			
			for (int i=maxlevel; i > 0; i--) {
				HashMap<String, Element> tbllvls = tuninglist.get(i);
				Iterator itx = tbllvls.keySet().iterator();
				while (itx.hasNext()) {
					String tablename = (String) itx.next();
					Element table = tbllvls.get(tablename);
					// the optimizer use an table not used in the stream, then continue
					if (table == null) {
						continue;
					}
					System.out.println(String.format("level %s %s", i, tablename));
					String ierror = validate(table, i, localTrx.getTrxName());
					if (ierror.length() == 0) {
						if (reactives.containsKey(tablename)) {
							triggerreactives(maxlevel,tablename,tuninglist, localTrx.getTrxName());
						}						
					} else {
						if (ierror.contains("ERROR")) {
							i = 0;
							break;
						}
					}
				}
			} 
			localTrx.rollback();						
			int tryouts = 1;
			while (tryouts > 0) {
				for (int i=maxlevel; i > 0; i--) {
					List<String> tables = optimized.get(i);
					error = scantables(i, tables, etables, localTrx);
					if (error.length() > 0) {
						if (error.contains("ERROR")) {
							throw new Exception(error);
						} else {
							tryouts++;
						}
						localTrx.rollback();
						it = optimized.keySet().iterator();
						while (it.hasNext()) {
							Integer lvl = (Integer) it.next();
							if (lvl > maxlevel) {
								maxlevel = lvl;
							}
						}	
						i = 0;
					}
				}
				tryouts--;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			localTrx.rollback();
			localTrx.close();
		}			
		return error;
	}

	private String scantables(int i, List<String> tables, List<Element> etables, Trx localTrx) {
		String error = "";
		for (String table:tables) {
			for (Element etable:etables) {								
				if (etable.getAttributeValue("name").equals(table)) {
					error = validate(etable, i, localTrx.getTrxName());
					if (error.length() > 0) {
						if (error.contains("MANDATORY")) {
							//tryouts ++;
							String field = error.substring(error.indexOf("MANDATORY")+"MANDATORY".length()).trim();																					
							X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
							.setParameters(table).first();
							X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND ColumnName = ?", null)
							.setParameters(t.getAD_Table_ID(), field).first();
							String tableName = "";
							if (column.getAD_Reference_ID() == DisplayType.Location) {
								tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));
							}
							else if (column.getAD_Reference_ID() == DisplayType.Search && column.getAD_Reference_Value_ID() == 0) {														
								tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));
							}
							else if (column.getAD_Reference_ID() == DisplayType.TableDir || 
									column.getAD_Reference_ID() == DisplayType.Locator ||
									column.getAD_Reference_ID() == DisplayType.Location) {
								tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));								
							}
							else if (column.getAD_Reference_ID() == DisplayType.Table)
							{
								MRefTable reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID=?", null)
								.setParameters(column.getAD_Reference_Value_ID())
								.first();
								if (reftable != null)
								{
									MTable xtable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
									tableName = xtable.getTableName();
								}
							}
							else if (column.getAD_Reference_Value_ID() > 0)
							{
								X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
								.setParameters(column.getAD_Reference_Value_ID()).first();
								if (reference != null)
								{
									if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
									{
										X_AD_Ref_Table reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID = ?", null)
										.setParameters(reference.getAD_Reference_ID()).first();
										if (reftable != null)
										{
											MTable adreftable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
											tableName = adreftable.getTableName();
										}
									}
								}															
							}
							int newlevel = i+1;
							UpdateTuning(tableName, newlevel);							
						}
						return error;
					} else {

					}
				}
			}
		}		
		return error;
	}

	private void triggerreactives(int maxlevel,  String tablename, HashMap<Integer, HashMap<String, Element>> tuninglist, String trxName) {
		List<String> rtables= reactives.get(tablename);
		for (String rtable:rtables) {
			for (int j=1; j < maxlevel	; j++) {
				HashMap<String, Element> cl = tuninglist.get(j);
				if (cl.containsKey(rtable))  {
					Element ct = cl.get(rtable);
					String error = validate(ct, j, trxName);
					if (error.length() == 0) {
						int plevel = 0;
						{
							Iterator itprev = optimized.keySet().iterator();						
							Boolean goahead = true;
							// finding the level of the parent table to add one level
							while (itprev.hasNext() && goahead) {
								plevel = (Integer) itprev.next();
								List<String> otables = optimized.get(plevel);
								if (otables.contains(tablename)) {
									goahead = false;
									break;
								}
							}	
						}
						if (plevel > 0) {
							Iterator itprev = optimized.keySet().iterator();
							while (itprev.hasNext()) {
								plevel = (Integer) itprev.next();
								List<String> otables = optimized.get(plevel);
								if (otables.contains(rtable)) {
									otables.remove(rtable);
									optimized.put(plevel, otables);
									break;
								}
							}
							int newlevel = plevel + 1;
							List<String> tvls = new ArrayList<String>();
							if (optimized.containsKey(newlevel))
								tvls = optimized.get(newlevel);																						
							tvls.add(rtable);
							optimized.put(newlevel, tvls);
							if (reactives.containsKey(rtable)) 
								triggerreactives(maxlevel, rtable, tuninglist, trxName);
						}
					}
				}
			}
		}		
	}

	private HashMap<Integer, List> Fill(Element record) {
		HashMap<Integer, List> optimized = new HashMap<Integer, List>();
		try {			
			Integer maxlevel = record.getAttribute("level").getIntValue();
			List<Element> tables = record.getChildren("table");
			Iterator it = tables.iterator();
			while (it.hasNext()) {
				Element table = (Element) it.next();
				Attribute attr = table.getAttribute("level");
				int level = attr.getIntValue();
				ArrayList<String> tablenames = null;
				if (optimized.containsKey(level)) {
					tablenames = (ArrayList<String>) optimized.get(level);
				} else {
					tablenames = new ArrayList<String>();
				}
				tablenames.add(table.getAttributeValue("name"));
				tablesprocessed.add(table.getAttributeValue("name"));
				optimized.put(level, tablenames);
			}	
		} catch (Exception e) {
			e.printStackTrace();			
		}
		return optimized;
	}

	private HashMap<Integer, List> getStored(Element record) {		
		HashMap<Integer, List> optimized = new HashMap<Integer, List>();
		String name = record.getAttribute("name").getValue();
		X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
		.setParameters(name).first();
		HashMap props = table.getProperties();
		if (props.containsKey("replication")) {
			String sequence = (String) props.get("replication");
			StringTokenizer st = new StringTokenizer(sequence, ",", false);
			List<String> levelsx = new ArrayList<String>();
			while (st.hasMoreTokens()) {
				levelsx.add(st.nextToken());
			}
			if (levelsx.size() > 0) {
				Iterator xx = levelsx.iterator();
				while (xx.hasNext()) {
					String lvl = (String) xx.next();
					String tableswewe = (String) props.get(lvl);
					//tablesprocessed.add(tableswewe);
					StringTokenizer stww = new StringTokenizer(tableswewe, ",", false);
					List<String> tablesx = new ArrayList<String>();
					while (stww.hasMoreTokens()) {
						tablesx.add(stww.nextToken());
					}									
					optimized.put(Integer.valueOf(lvl), tablesx);									
				}
			}			
		}	
		return optimized;
	}

	private String validate(Element table, int i, String trxName) {
		String error = "";
		Attribute attr = table.getAttribute("level");
		String tn = table.getAttribute("name").getValue();
		Attribute attraccesslevel = table.getAttribute(Constants.XML_ATTRIBUTE_ACCESSLEVEL);
		X_AD_Table adtable = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
		.setParameters(tn).first();								
		List<Element> rows = table.getChildren("row");
		for (Element row:rows)
		{
			String identifier = row.getAttribute( X_AD_Table.COLUMNNAME_Identifier).getValue();
			PO poi = null;
			List<String> POrecords = new ArrayList<String>();
			try {										
				if (Tables.containsKey(tn)) {
					POrecords = Tables.get(tn);
				}
				if (!POrecords.contains(identifier)) {											
					poi = new Query(Env.getCtx(), tn, "Identifier = ?", trxName).setParameters(identifier).first();
					if (poi != null)
					{
						POrecords.add(identifier);
						Tables.put(tn, POrecords);
					}
				}
			}
			catch (Exception e)
			{	
				error = e.getCause().getMessage();
				break;				
			}									
			if (!POrecords.contains(identifier) || i == 1)
			{
				if (poi == null) // search for table by index/constrains only in case is null 
				{
					HashMap<PO, Integer> possibleproduct = new HashMap<PO, Integer>();
					// antes de crear la tabla , busquemos por los constraints de la misma.
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					try
					{
						pstmt = DB.prepareStatement(Querys.GETUNIQUEINDEXBYTABLE, null);
						pstmt.setString(1, tn.toLowerCase());
						rs = pstmt.executeQuery();
						while (rs.next())
						{
							String where = "";
							List<Object> parameters = new ArrayList<Object>();
							List<String> paranames = new ArrayList<String>();

							String column_names = rs.getString("column_names");
							String[] keys = column_names.split(",");
							if (keys.length == 1) // if the index is a sequence don't do it, only for primary keys components of two 
								continue;							
							for (String key:keys)
							{
								key = key.trim();
								X_AD_Column col = new Query(Env.getCtx(), X_AD_Column.Table_Name, "lower(ColumnName) = ? AND AD_Table_ID = ?", null)
								.setParameters(key, adtable.getAD_Table_ID()).first();
								if (col != null)
								{
									String value = row.getAttributeValue(col.getColumnName());
									if (value != null)
									{
										if (col.getAD_Reference_ID() == DisplayType.TableDir ||
												col.getAD_Reference_ID() == DisplayType.Location ||
												col.getAD_Reference_ID() == DisplayType.Search ||
												col.getAD_Reference_ID() == DisplayType.Locator)
										{
											String tableName = col.getColumnName().substring(0, col.getColumnName().indexOf("_ID"));								
											PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", null)
											.setParameters(String.valueOf(value)).first();
											if (poref != null)
											{
												Integer IDref = poref.get_ID();
												parameters.add(IDref);			
												paranames.add(key);
											}																						
										}
										else if (col.getAD_Reference_ID() == DisplayType.PAttribute) 
										{
											if (value.equals("BLANK")) {
												HashMap<String,Object> vars = new HashMap<String, Object>();
												int AD_Org_ID = Integer.valueOf(row.getAttributeValue(Constants.COLUMNNAME_AD_Org_ID));											
												vars.put(Constants.COLUMNNAME_AD_Org_ID, AD_Org_ID);
												List<Object> params = new ArrayList<Object>();
												String asiwhere = "GuaranteeDate isnull AND serno isnull AND lot isnull";
												Iterator it = vars.keySet().iterator();
												while (it.hasNext()) {
													String asikey = (String) it.next();
													if (asiwhere.length() > 0) {
														asiwhere += " AND ";
													}
													asiwhere += String.format("%s=? ", asikey);
													params.add(vars.get(asikey));
												}
												String exists = " AND NOT EXISTS (SELECT 1 FROM M_STORAGE s "; 
												exists += " where s.m_attributesetinstance_id = m_attributesetinstance.m_attributesetinstance_id) ";											
												asiwhere += exists;											
												X_M_AttributeSetInstance masi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, asiwhere, null)
												.setParameters(params).first();						
												if (masi == null) {
													masi = new X_M_AttributeSetInstance(Env.getCtx(), 0, null);
													it = vars.keySet().iterator();
													while (it.hasNext()) {
														String asikey = (String) it.next();													
														masi.set_CustomColumn(asikey, vars.get(asikey));													
													}
													masi.save();																				
												}
												if (masi != null) {											
													parameters.add(masi.getM_AttributeSetInstance_ID());
													paranames.add(key);
												}
											}
											else if (value.equals("NOBLANK")) {
												HashMap<String,Object> vars = new HashMap<String, Object>();
												String gd = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate);
												if (gd != null && gd.length() > 0) {
													try {
														Timestamp ts = Timestamp.valueOf(gd);
														vars.put(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate, ts);
													} catch (Exception e) {

													}													
												}
												String lt = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_Lot);
												if (lt != null && lt.length() > 0) {
													vars.put(X_M_AttributeSetInstance.COLUMNNAME_Lot, lt);
												}
												String sn = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_SerNo);
												if (sn != null && sn.length() > 0) {
													vars.put(X_M_AttributeSetInstance.COLUMNNAME_SerNo, sn);
												}
												if (vars.size() > 0) {
													Iterator it = vars.keySet().iterator();
													List<Object> params = new ArrayList<Object>();
													String whereasi = "";
													while (it.hasNext()) {
														if (whereasi.length() > 0)
															whereasi += " AND ";														
														String keyasi = (String) it.next();
														whereasi += keyasi + " = ?";
														params.add(vars.get(keyasi));
													}
													String exists = " AND NOT EXISTS (SELECT 1 FROM M_STORAGE s "; 
													exists += " where s.m_attributesetinstance_id = m_attributesetinstance.m_attributesetinstance_id) ";											
													whereasi += exists;																							
													X_M_AttributeSetInstance asipo = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, whereasi, null)
													.setParameters(params).first();
													if (asipo != null) {
														parameters.add(asipo.getM_AttributeSetInstance_ID());
														paranames.add(key);
													}
												}
											}
										}											
										//parameters.add(Integer.valueOf(value));
										else if (col.getAD_Reference_ID() == DisplayType.Integer)
										{
											parameters.add(Integer.valueOf(value));
											paranames.add(key);
										}
										else
										{
											parameters.add(value);
											paranames.add(key);
										}
									}									
								}
								else
								{		
									// when index use an expression like  (m_inout_id, (COALESCE(iscosted, 'N'::character varying))
									log.warning("que hacer cuando no exista un elemento correspondiente al campo?");
								}
							}
							if (paranames.size() > 0)
							{
								for (String param:paranames)
								{
									if (where.length() > 0)
										where += " AND ";
									where += param + " = ? ";
								}
							}
							if (where != null && where.length() > 0)
							{
								int matchs = new Query(Env.getCtx(), tn, where, null).setParameters(parameters).count();
								if (matchs == 1)
								{
									PO ref = new Query(Env.getCtx(), tn, where, null).setParameters(parameters).first();
									if (ref != null)
									{
										int count = 0;																
										if (possibleproduct.containsKey(ref.get_ID()))															
											count = possibleproduct.get(ref.get_ID());															
										count++;
										possibleproduct.put(ref, count);
									}
								}
							}											
						}
						if (possibleproduct.size() == 1)
						{
							Iterator keys = possibleproduct.keySet().iterator();							
							while (keys.hasNext()) 
							{
								poi = (PO) keys.next();
								poi.set_ValueOfColumn(X_AD_Table.COLUMNNAME_Identifier, identifier);
								poi.save();								
							}
						}
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
					finally
					{
						DB.close(rs, pstmt);
						rs = null; pstmt = null;
					}
				}
				if (poi == null || i == 1)
				{
					Class<?> clazz = null;
					PO po = null;
					try {
						clazz = Class.forName("org.compiere.model.persistence.X_"+tn);						
						if (poi == null)
						{
							Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});							
							po = (PO)constructor.newInstance(new Object[] {Env.getCtx(), 0, trxName});
						}
						else
						{
							po = poi;
						}
						List list = row.getAttributes();
						for (int k=0; k<list.size(); k++) {
							Attribute a = (Attribute) list.get(k);
							MColumn column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND ColumnName = ?", null)
							.setParameters(po.get_Table_ID(), a.getName()).first();
							if (column != null)
							{
								Boolean isMandatory = column.isMandatory();
								if (column.getAD_Reference_ID() ==DisplayType.Button && isMandatory) { 
									column.setIsMandatory(false);
									column.save();
								}
								String value= a.getValue();
								if (column.getAD_Reference_ID() == DisplayType.Location) {
									String tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));
									PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", trxName)
									.setParameters(String.valueOf(value)).first();
									if (poref != null)
									{
										Integer IDref = poref.get_ID();
										po.set_ValueOfColumn(column.getColumnName(), IDref);
									} else if (isMandatory) {
										addReactive(tableName, tn);
									}																

								}
								else if (column.getAD_Reference_ID() == DisplayType.Search && column.getAD_Reference_Value_ID() == 0) {														
									String tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));
									PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", trxName)
									.setParameters(String.valueOf(value)).first();
									if (poref != null)
									{
										Integer IDref = poref.get_ID();
										po.set_ValueOfColumn(column.getColumnName(), IDref);
									} else if (isMandatory) {
										addReactive(tableName, tn);
									}																																				
								}
								else if (column.getAD_Reference_ID() == DisplayType.PAttribute) {
									if (po.is_new()) {
										if (value.equals("BLANK")) {										
											HashMap<String,Object> vars = new HashMap<String, Object>();
											int AD_Org_ID = Integer.valueOf(row.getAttributeValue(Constants.COLUMNNAME_AD_Org_ID));											
											vars.put(Constants.COLUMNNAME_AD_Org_ID, AD_Org_ID);
											List<Object> params = new ArrayList<Object>();
											String where = "GuaranteeDate isnull AND serno isnull AND lot isnull";
											Iterator it = vars.keySet().iterator();
											while (it.hasNext()) {
												String key = (String) it.next();
												if (where.length() > 0) {
													where += " AND ";
												}
												where += String.format("%s=? ", key);
												params.add(vars.get(key));
											}									
											String exists = " AND NOT EXISTS (SELECT 1 FROM M_STORAGE s "; 
											exists += " where s.m_attributesetinstance_id = m_attributesetinstance.m_attributesetinstance_id) ";											
											where += exists;																						
											X_M_AttributeSetInstance masi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, where, null)
											.setParameters(params).first();						
											if (masi == null) {
												masi = new X_M_AttributeSetInstance(Env.getCtx(), 0, null);
												it = vars.keySet().iterator();
												while (it.hasNext()) {
													String key = (String) it.next();													
													masi.set_CustomColumn(key, vars.get(key));													
												}
												masi.save();																				
											}
											if (masi != null) {
												po.setForceValueOfColumn(column.getColumnName(), masi.getM_AttributeSetInstance_ID());
											}											
										} else {
											HashMap<String,Object> vars = new HashMap<String, Object>();
											String gd = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate);
											if (gd != null && gd.length() > 0) {
												try {
													Timestamp ts = Timestamp.valueOf(gd);
													vars.put(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate, ts);
												} catch (Exception e) {

												}																								
											}										
											String lt = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_Lot);
											if (lt != null && lt.length() > 0) {
												vars.put(X_M_AttributeSetInstance.COLUMNNAME_Lot, lt);
											}
											String sn = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_SerNo);
											if (sn != null && sn.length() > 0) {
												vars.put(X_M_AttributeSetInstance.COLUMNNAME_SerNo, sn);
											}
											if (vars.size() > 0) {
												int AD_Org_ID = Integer.valueOf(row.getAttributeValue(Constants.COLUMNNAME_AD_Org_ID));											
												vars.put(Constants.COLUMNNAME_AD_Org_ID, AD_Org_ID);																					
												Iterator it = vars.keySet().iterator();
												List<Object> params = new ArrayList<Object>();
												String where = "";
												while (it.hasNext()) {
													String key = (String) it.next();
													if (where.length() > 0) {
														where += " AND ";
													}
													where += String.format("%s=? ", key);
													params.add(vars.get(key));
												}
												String exists = " AND NOT EXISTS (SELECT 1 FROM M_STORAGE s "; 
												exists += " where s.m_attributesetinstance_id = m_attributesetinstance.m_attributesetinstance_id) ";																						
												where += exists;																					
												X_M_AttributeSetInstance masi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, where, null)
												.setParameters(params).first();
												if (masi == null) {
													masi = new X_M_AttributeSetInstance(Env.getCtx(), 0, null);
													it = vars.keySet().iterator();
													while (it.hasNext()) {
														String key = (String) it.next();													
														masi.set_CustomColumn(key, vars.get(key));													
													}
													masi.save();
												}
												if (masi != null) {
													po.setForceValueOfColumn(column.getColumnName(), masi.getM_AttributeSetInstance_ID());
												}
											}
										}
									} else if (value.equals("NOBLANK")) {
										// because is not new, search for the asi for update the content of asi noblank coming
										int asiid = po.get_ValueAsInt(column.getColumnName());
										X_M_AttributeSetInstance masi = null;
										if (asiid > 0) {
											masi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, 
													"M_AttributeSetInstance_ID = ?", null).setParameters(asiid).first();											
										} else {
											masi = new X_M_AttributeSetInstance(Env.getCtx(), 0, null);
										}
										if (masi != null) {
											HashMap<String,Object> vars = new HashMap<String, Object>();
											String gd = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate);
											if (gd != null && gd.length() > 0) {
												try {
													Timestamp ts = Timestamp.valueOf(gd);
													vars.put(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate, ts);
												} catch (Exception e) {

												}																								
											}										
											String lt = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_Lot);
											if (lt != null && lt.length() > 0) {
												vars.put(X_M_AttributeSetInstance.COLUMNNAME_Lot, lt);
											}
											String sn = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_SerNo);
											if (sn != null && sn.length() > 0) {
												vars.put(X_M_AttributeSetInstance.COLUMNNAME_SerNo, sn);
											}
											if (vars.size() > 0) {
												Iterator it = vars.keySet().iterator();												
												while (it.hasNext()) {
													String key = (String) it.next();													
													masi.set_CustomColumn(key, vars.get(key));													
												}
												if (masi.save()) {
													po.setForceValueOfColumn(column.getColumnName(), masi.getM_AttributeSetInstance_ID());
												}												
											}											
										}
									}
								}								
								else if (column.getColumnName().equals(Constants.COLUMNNAME_AD_Client_ID)) {
									if (adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.SystemPlusClient) || 
											adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.SystemOnly)) {
										po.setForceValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, value));	
									} else if (adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.ClientOnly) || 
											adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.Organization) ||
											adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.ClientPlusOrganization) ||
											adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.All)) {
										if (getClient() != null) {
											po.setForceValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, getClient().getAD_Client_ID()));
										} else {
											po.setForceValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, value));
										}
									}																			
									//if (getClient() != null) {
									//	po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, getClient().getAD_Client_ID()));
									//} else {										
									//	po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, value));
									//}									
								}
								else if  (column.getColumnName().equals(Constants.COLUMNNAME_AD_Org_ID))
									po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, value));
								else if (column.getAD_Reference_ID() == DisplayType.TableDir || 
										column.getAD_Reference_ID() == DisplayType.Locator ||
										column.getAD_Reference_ID() == DisplayType.Location) {
									String tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));								
									PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", trxName)
									.setParameters(String.valueOf(value)).first();
									if (poref != null)
									{
										Integer IDref = poref.get_ID();
										po.set_ValueOfColumn(column.getColumnName(), IDref);
									} else if (isMandatory) {
										addReactive(tableName, tn);
									}							 															
								}
								else if (column.getAD_Reference_ID() == DisplayType.Table)
								{
									MRefTable reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID=?", null)
									.setParameters(column.getAD_Reference_Value_ID())
									.first();
									if (reftable != null)
									{
										MTable xtable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
										PO poref = (PO) new Query(Env.getCtx(), xtable.getTableName(), "identifier = ?", trxName)
										.setParameters(String.valueOf(value)).first();
										if (poref != null)
										{
											Integer IDref = poref.get_ID();
											po.set_ValueOfColumn(column.getColumnName(), IDref);
										} else if (isMandatory) {
											addReactive(xtable.getTableName(), tn);
										}																																					
									}
								}
								else if (column.getAD_Reference_Value_ID() > 0)
								{
									X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
									.setParameters(column.getAD_Reference_Value_ID()).first();
									if (reference != null)
									{
										if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
										{
											X_AD_Ref_Table reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID = ?", null)
											.setParameters(reference.getAD_Reference_ID()).first();
											if (reftable != null)
											{
												MTable adreftable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
												PO poref = new Query(Env.getCtx(), adreftable.getTableName(), "identifier = ?", trxName)
												.setParameters(value).first();
												if (poref != null)
												{																			
													po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, poref.get_ID()));
												}															
											}
										}
										else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
										{
											po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.String, value));
										}
									}															
								}	
								else
								{
									po.set_ValueOfColumnReturningBoolean(column.getColumnName(), Util.convertObject(column.getAD_Reference_ID(), value));
								}							
								if (column.isMandatory() && po.get_Value(column.getColumnName()) == null) {									
									throw new Exception(String.format("%s MANDATORY %s", po.get_TableName(), column.getColumnName()));
								} 
							}
						}
						if (po != null && !po.save())
						{						
							String err = po.getLastError();
							if (err.contains("duplicate key value violates unique constraint")) {

							} else
								throw new Exception(String.format("%s %s", po.get_TableName(), err));							
						}
					} catch (Exception ex) {
						error = ex.getMessage();
						ex.printStackTrace();
						break;
					}					
				}										
			}
		}
		return error;
	}

	private String process2(Element table,int i, String trxName) {
		String error = "";
		Attribute attr = table.getAttribute("level");
		String tn = table.getAttribute("name").getValue();
		Attribute attraccesslevel = table.getAttribute(Constants.XML_ATTRIBUTE_ACCESSLEVEL);
		X_AD_Table adtable = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
		.setParameters(tn).first();								
		List<Element> rows = table.getChildren("row");
		for (Element row:rows)
		{
			String identifier = row.getAttribute( X_AD_Table.COLUMNNAME_Identifier).getValue();
			PO poi = null;
			List<String> POrecords = new ArrayList<String>();
			try {										
				if (Tables.containsKey(tn)) {
					POrecords = Tables.get(tn);
				}
				if (!POrecords.contains(identifier)) {											
					poi = new Query(Env.getCtx(), tn, "Identifier = ?", trxName).setParameters(identifier).first();
					if (poi != null)
					{
						//if (i > 1) {
						POrecords.add(identifier);
						Tables.put(tn, POrecords);
						//}
					}
				} 
				//else {					
				//}
			}
			catch (Exception e)
			{	
				error = e.getCause().getMessage();
				break;				
			}									
			if (!POrecords.contains(identifier) || i == 1)
			{
				if (poi == null && POrecords.contains(identifier) && i == 1) {
					poi = new Query(Env.getCtx(), tn, "Identifier = ?", trxName).setParameters(identifier).first();
				} 
				else if (poi == null && !POrecords.contains(identifier) && i == 1) {					
					// search for table by index/constrains only in case is null
					HashMap<PO, Integer> possibleproduct = new HashMap<PO, Integer>();
					// antes de crear la tabla , busquemos por los constraints de la misma.
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					try
					{
						pstmt = DB.prepareStatement(Querys.GETUNIQUEINDEXBYTABLE, null);
						pstmt.setString(1, tn.toLowerCase());
						rs = pstmt.executeQuery();
						while (rs.next())
						{
							String where = "";
							List<Object> parameters = new ArrayList<Object>();
							List<String> paranames = new ArrayList<String>();

							String column_names = rs.getString("column_names");
							String[] keys = column_names.split(",");		
							if (keys.length == 1) // if the index is a sequence don't do it, only for primary keys components of two 
								continue;
							for (String key:keys)
							{
								key = key.trim();
								X_AD_Column col = new Query(Env.getCtx(), X_AD_Column.Table_Name, "lower(ColumnName) = ? AND AD_Table_ID = ?", null)
								.setParameters(key, adtable.getAD_Table_ID()).first();
								if (col != null)
								{
									String value = row.getAttributeValue(col.getColumnName());
									if (col.getAD_Reference_ID() == DisplayType.TableDir ||
											col.getAD_Reference_ID() == DisplayType.Location ||
											col.getAD_Reference_ID() == DisplayType.Search ||
											col.getAD_Reference_ID() == DisplayType.Locator)
									{
										String tableName = col.getColumnName().substring(0, col.getColumnName().indexOf("_ID"));								
										PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", null)
										.setParameters(String.valueOf(value)).first();
										if (poref != null)
										{
											Integer IDref = poref.get_ID();
											parameters.add(IDref);			
											paranames.add(key);
										}																						
									}
									//parameters.add(Integer.valueOf(value));
									else if (col.getAD_Reference_ID() == DisplayType.Integer)
									{
										parameters.add(Integer.valueOf(value));
										paranames.add(key);
									}
									else if (col.getAD_Reference_ID() == DisplayType.PAttribute) 
									{
										if (value == null) {
											value = "BLANK";
										}
										if (value.equals("BLANK")) {
											HashMap<String,Object> vars = new HashMap<String, Object>();
											int AD_Org_ID = Integer.valueOf(row.getAttributeValue(Constants.COLUMNNAME_AD_Org_ID));											
											vars.put(Constants.COLUMNNAME_AD_Org_ID, AD_Org_ID);
											List<Object> params = new ArrayList<Object>();
											String asiwhere = "GuaranteeDate isnull AND serno isnull AND lot isnull";
											Iterator it = vars.keySet().iterator();
											while (it.hasNext()) {
												String asikey = (String) it.next();
												if (asiwhere.length() > 0) {
													asiwhere += " AND ";
												}
												asiwhere += String.format("%s=? ", asikey);
												params.add(vars.get(asikey));
											}
											String exists = " AND NOT EXISTS (SELECT 1 FROM M_STORAGE s "; 
											exists += " where s.m_attributesetinstance_id = m_attributesetinstance.m_attributesetinstance_id) ";											
											asiwhere += exists;											
											X_M_AttributeSetInstance masi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, asiwhere, trxName)
											.setParameters(params).first();						
											if (masi == null) {
												masi = new X_M_AttributeSetInstance(Env.getCtx(), 0, null);
												it = vars.keySet().iterator();
												while (it.hasNext()) {
													String asikey = (String) it.next();													
													masi.set_CustomColumn(asikey, vars.get(asikey));													
												}
												masi.save();																				
											}
											if (masi != null) {
												parameters.add(masi.getM_AttributeSetInstance_ID());
												paranames.add(key);
											}
										}
										else if (value.equals("NOBLANK")) {
											HashMap<String,Object> vars = new HashMap<String, Object>();
											String gd = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate);
											if (gd != null && gd.length() > 0) {
												try {
													Timestamp ts = Timestamp.valueOf(gd);
													vars.put(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate, ts);
												} catch (Exception e) {

												}													
											}
											String lt = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_Lot);
											if (lt != null && lt.length() > 0) {
												vars.put(X_M_AttributeSetInstance.COLUMNNAME_Lot, lt);
											}
											String sn = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_SerNo);
											if (sn != null && sn.length() > 0) {
												vars.put(X_M_AttributeSetInstance.COLUMNNAME_SerNo, sn);
											}
											if (vars.size() > 0) {
												Iterator it = vars.keySet().iterator();
												List<Object> params = new ArrayList<Object>();
												String whereasi = "";
												while (it.hasNext()) {
													if (whereasi.length() > 0)
														whereasi += " AND ";														
													String keyasi = (String) it.next();
													whereasi += keyasi + " = ?";
													params.add(vars.get(keyasi));
												}
												String exists = " AND NOT EXISTS (SELECT 1 FROM M_STORAGE s "; 
												exists += " where s.m_attributesetinstance_id = m_attributesetinstance.m_attributesetinstance_id) ";											
												whereasi += exists;																							
												X_M_AttributeSetInstance asipo = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, whereasi, trxName)
												.setParameters(params).first();
												if (asipo != null) {
													parameters.add(asipo.getM_AttributeSetInstance_ID());
													paranames.add(key);
												}
											}
										}
									}
									else
									{
										parameters.add(value);
										paranames.add(key);
									}
								}
								else
								{		
									// when index use an expression like  (m_inout_id, (COALESCE(iscosted, 'N'::character varying))
									log.warning("que hacer cuando no exista un elemento correspondiente al campo?");
								}
							}
							if (paranames.size() > 0)
							{
								int AD_Org_ID = Integer.valueOf(row.getAttributeValue(Constants.COLUMNNAME_AD_Org_ID));
								parameters.add(AD_Org_ID);
								paranames.add(Constants.COLUMNNAME_AD_Org_ID);

								for (String param:paranames)
								{
									if (where.length() > 0)
										where += " AND ";
									where += param + " = ? ";
								}
							}
							if (where != null && where.length() > 0)
							{
								int matchs = new Query(Env.getCtx(), tn, where, null).setParameters(parameters).count();
								if (matchs == 1)
								{
									PO ref = new Query(Env.getCtx(), tn, where, null).setParameters(parameters).first();
									if (ref != null)
									{
										if (!POrecords.contains(ref.get_Value(X_AD_Table.COLUMNNAME_Identifier))) {
											int count = 0;																
											if (possibleproduct.containsKey(ref.get_ID()))															
												count = possibleproduct.get(ref.get_ID());															
											count++;
											possibleproduct.put(ref, count);
										}
									}
								}
							}																				
						}
						if (possibleproduct.size() == 1)
						{
							Iterator keys = possibleproduct.keySet().iterator();							
							while (keys.hasNext()) 
							{
								poi = (PO) keys.next();
								poi.set_ValueOfColumn(X_AD_Table.COLUMNNAME_Identifier, identifier);
								poi.save();								
							}
						}
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
					finally
					{
						DB.close(rs, pstmt);
						rs = null; pstmt = null;
					}
				}
				if (poi == null || i == 1)
				{
					Boolean haveprimarykey = false;
					String pkey = "";
					String pkeyname = "";
					Class<?> clazz = null;
					PO po = null;
					try {
						clazz = Class.forName("org.compiere.model.persistence.X_"+tn);						
						if (poi == null)
						{
							Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});							
							po = (PO)constructor.newInstance(new Object[] {Env.getCtx(), 0, trxName});
						}
						else
						{
							po = poi;
						}
						List list = row.getAttributes();
						for (int k=0; k<list.size(); k++) {
							Attribute a = (Attribute) list.get(k);
							MColumn column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND ColumnName = ?", null)
							.setParameters(po.get_Table_ID(), a.getName()).first();							
							if (column != null)
							{
								Boolean isMandatory = column.isMandatory();
								if (column.getAD_Reference_ID() ==DisplayType.Button && isMandatory) { 
									column.setIsMandatory(false);
									column.save();
								}
								String value= a.getValue();
								if (column.getAD_Reference_ID() == DisplayType.Location) {
									String tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));
									PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", trxName)
									.setParameters(String.valueOf(value)).first();
									if (poref != null)
									{
										Integer IDref = poref.get_ID();
										po.setForceValueOfColumn(column.getColumnName(), IDref);
									}																

								}
								else if (column.getAD_Reference_ID() == DisplayType.ID) {
									haveprimarykey = true;
									pkey = value;
									pkeyname = column.getColumnName();
								}
								else if (column.getAD_Reference_ID() == DisplayType.Search && column.getAD_Reference_Value_ID() == 0) {														
									String tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));
									PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", trxName)
									.setParameters(String.valueOf(value)).first();
									if (poref != null)
									{
										Integer IDref = poref.get_ID();
										po.setForceValueOfColumn(column.getColumnName(), IDref);
									}																																			
								}
								else if (column.getAD_Reference_ID() == DisplayType.PAttribute) {
									if (po.is_new()) {
										if (value.equals("BLANK")) {										
											HashMap<String,Object> vars = new HashMap<String, Object>();
											int AD_Org_ID = Integer.valueOf(row.getAttributeValue(Constants.COLUMNNAME_AD_Org_ID));											
											vars.put(Constants.COLUMNNAME_AD_Org_ID, AD_Org_ID);
											List<Object> params = new ArrayList<Object>();
											String where = "GuaranteeDate isnull AND serno isnull AND lot isnull";
											Iterator it = vars.keySet().iterator();
											while (it.hasNext()) {
												String key = (String) it.next();
												if (where.length() > 0) {
													where += " AND ";
												}
												where += String.format("%s=? ", key);
												params.add(vars.get(key));
											}									
											String exists = " AND NOT EXISTS (SELECT 1 FROM M_STORAGE s "; 
											exists += " where s.m_attributesetinstance_id = m_attributesetinstance.m_attributesetinstance_id) ";											
											where += exists;																						
											X_M_AttributeSetInstance masi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, where, trxName)
											.setParameters(params).first();						
											if (masi == null) {
												masi = new X_M_AttributeSetInstance(Env.getCtx(), 0, null);
												it = vars.keySet().iterator();
												while (it.hasNext()) {
													String key = (String) it.next();													
													masi.set_CustomColumn(key, vars.get(key));													
												}
												masi.save();																				
											}
											if (masi != null) {
												po.setForceValueOfColumn(column.getColumnName(), masi.getM_AttributeSetInstance_ID());
											}											
										} else {
											HashMap<String,Object> vars = new HashMap<String, Object>();
											String gd = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate);
											if (gd != null && gd.length() > 0) {
												try {
													Timestamp ts = Timestamp.valueOf(gd);
													vars.put(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate, ts);
												} catch (Exception e) {

												}																								
											}										
											String lt = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_Lot);
											if (lt != null && lt.length() > 0) {
												vars.put(X_M_AttributeSetInstance.COLUMNNAME_Lot, lt);
											}
											String sn = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_SerNo);
											if (sn != null && sn.length() > 0) {
												vars.put(X_M_AttributeSetInstance.COLUMNNAME_SerNo, sn);
											}
											if (vars.size() > 0) {
												int AD_Org_ID = Integer.valueOf(row.getAttributeValue(Constants.COLUMNNAME_AD_Org_ID));											
												vars.put(Constants.COLUMNNAME_AD_Org_ID, AD_Org_ID);																					
												Iterator it = vars.keySet().iterator();
												List<Object> params = new ArrayList<Object>();
												String where = "";
												while (it.hasNext()) {
													String key = (String) it.next();
													if (where.length() > 0) {
														where += " AND ";
													}
													where += String.format("%s=? ", key);
													params.add(vars.get(key));
												}
												String exists = " AND NOT EXISTS (SELECT 1 FROM M_STORAGE s "; 
												exists += " where s.m_attributesetinstance_id = m_attributesetinstance.m_attributesetinstance_id) ";																						
												where += exists;																					
												X_M_AttributeSetInstance masi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, where, trxName)
												.setParameters(params).first();
												if (masi == null) {
													masi = new X_M_AttributeSetInstance(Env.getCtx(), 0, null);
													it = vars.keySet().iterator();
													while (it.hasNext()) {
														String key = (String) it.next();													
														masi.set_CustomColumn(key, vars.get(key));													
													}
													masi.save();
												}
												if (masi != null) {
													po.setForceValueOfColumn(column.getColumnName(), masi.getM_AttributeSetInstance_ID());
												}
											}
										}
									} else if (value.equals("NOBLANK")) {
										// because is not new, search for the asi for update the content of asi noblank coming
										int asiid = po.get_ValueAsInt(column.getColumnName());
										X_M_AttributeSetInstance masi = null;
										if (asiid > 0) {
											masi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, 
													"M_AttributeSetInstance_ID = ?", null).setParameters(asiid).first();											
										} else {
											masi = new X_M_AttributeSetInstance(Env.getCtx(), 0, null);
										}
										if (masi != null) {
											HashMap<String,Object> vars = new HashMap<String, Object>();
											String gd = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate);
											if (gd != null && gd.length() > 0) {
												try {
													Timestamp ts = Timestamp.valueOf(gd);
													vars.put(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate, ts);
												} catch (Exception e) {

												}																								
											}										
											String lt = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_Lot);
											if (lt != null && lt.length() > 0) {
												vars.put(X_M_AttributeSetInstance.COLUMNNAME_Lot, lt);
											}
											String sn = row.getAttributeValue(X_M_AttributeSetInstance.COLUMNNAME_SerNo);
											if (sn != null && sn.length() > 0) {
												vars.put(X_M_AttributeSetInstance.COLUMNNAME_SerNo, sn);
											}
											if (vars.size() > 0) {
												Iterator it = vars.keySet().iterator();												
												while (it.hasNext()) {
													String key = (String) it.next();													
													masi.set_CustomColumn(key, vars.get(key));													
												}
												if (masi.save()) {
													po.setForceValueOfColumn(column.getColumnName(), masi.getM_AttributeSetInstance_ID());
												}												
											}											
										}
									} 
								}
								else if (column.getColumnName().equals(Constants.COLUMNNAME_AD_Client_ID)) {									
									if (adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.SystemOnly)) {
										po.setForceValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, value));	
									} else if (adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.SystemPlusClient) ||
											adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.ClientOnly) || 
											adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.Organization) ||
											adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.ClientPlusOrganization) ||
											adtable.getAccessLevel().equals(REF_AD_TableAccessLevels.All)) {
										if (getClient() != null) {
											po.setForceValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, getClient().getAD_Client_ID()));
										} else {
											po.setForceValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, value));
										}
									}										
								}
								else if  (column.getColumnName().equals(Constants.COLUMNNAME_AD_Org_ID))
									po.setForceValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, value));
								else if (column.getAD_Reference_ID() == DisplayType.TableDir || 
										column.getAD_Reference_ID() == DisplayType.Locator ||
										column.getAD_Reference_ID() == DisplayType.Location) {
									String tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));								
									PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", trxName)
									.setParameters(String.valueOf(value)).first();
									if (poref != null)
									{
										Integer IDref = poref.get_ID();
										po.setForceValueOfColumn(column.getColumnName(), IDref);
									} 						 															
								}
								else if (column.getAD_Reference_ID() == DisplayType.Table)
								{
									MRefTable reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID=?", null)
									.setParameters(column.getAD_Reference_Value_ID())
									.first();
									if (reftable != null)
									{
										MTable xtable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
										MColumn columnkey = MColumn.get(Env.getCtx(), reftable.getAD_Key());
										String tablequery = "";
										if (columnkey.isKey()) {
											tablequery = "identifier = ?";
										} else {
											tablequery = String.format("%s = ?", columnkey.getColumnName());
										}
										PO poref = (PO) new Query(Env.getCtx(), xtable.getTableName(), tablequery, trxName)
										.setParameters(String.valueOf(value)).first();
										if (poref != null) {
											if (columnkey.isKey()) {
												Integer IDref = poref.get_ID();
												po.setForceValueOfColumn(column.getColumnName(), IDref);												
											} else {											
												po.setForceValueOfColumn(column.getColumnName(), value);
											}
										}
									}
								}
								else if (column.getAD_Reference_Value_ID() > 0)
								{
									X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
									.setParameters(column.getAD_Reference_Value_ID()).first();
									if (reference != null)
									{
										if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
										{
											X_AD_Ref_Table reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID = ?", null)
											.setParameters(reference.getAD_Reference_ID()).first();
											if (reftable != null)
											{
												MTable adreftable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
												PO poref = new Query(Env.getCtx(), adreftable.getTableName(), "identifier = ?", trxName)
												.setParameters(value).first();
												if (poref != null)
												{																			
													po.setForceValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, poref.get_ID()));
												}															
											}
										}
										else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
										{
											po.setForceValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.String, value));
										}
									}															
								}	
								else if  (column.getColumnName().equals(Constants.XML_ATTRIBUTE_IDENTIFIER)) {									
									if (!po.get_ValueAsString("Identifier").equals(value)) {
										System.out.println("X");
									}
									po.setForceValueOfColumn(column.getColumnName(), Util.convertObject(column.getAD_Reference_ID(), value));
								}
								else
								{									
									po.setForceValueOfColumn(column.getColumnName(), Util.convertObject(column.getAD_Reference_ID(), value));
								}							
								if (column.isMandatory() && po.get_Value(column.getColumnName()) == null) {									
									throw new Exception(String.format("MANDATORY %s", column.getColumnName()));
								} else if (po.get_Value(column.getColumnName()) == null && value.length() > 0 && column.getAD_Reference_ID() != DisplayType.Button) {
									log.warning(String.format("VALUE WITHOUT REFERENCE %s", column.getColumnName()));
								}
							}
						}						
						List children = row.getChildren();
						for (int k=0; k<children.size(); k++) {
							Element e = (Element) children.get(k);
							MColumn c = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND ColumnName = ?", null)
							.setParameters(po.get_Table_ID(), e.getName()).first();							
							if (c != null) {
								if (c.getAD_Reference_ID() == DisplayType.Text)
								{	
									po.setForceValueOfColumn(c.getColumnName(), e.getText());
								}
								else if (c.getAD_Reference_ID() == DisplayType.HStore)
								{
									HashMap Properties = new HashMap();
									List hashmaplist = e.getChildren();
									for (Iterator ithashmaplist = hashmaplist.iterator(); ithashmaplist.hasNext();) {
										Element hashmap = (Element) ithashmaplist.next();
										List maplist = hashmap.getChildren();
										for (Iterator itmaplist = maplist.iterator(); itmaplist.hasNext();) {
											Element mapitem = (Element) itmaplist.next();
											String key = mapitem.getAttribute("key").getValue();
											String value = mapitem.getAttributeValue("value");
											Properties.put(key, value);
										}
									}	
									po.setForceValueOfColumn(c.getColumnName(), Properties);
								}														
							}							
						}
						if (po != null && !po.save())
						{							
							// no se pudo grabar, pero tampoco es un nuevo registro
							// borremos y reintentemos, creandolo de nuevo  
							// esto pasa cuando el where de busqueda utiliza llave primaria compuesta y uno 
							// los keys primarios no coincide entre el envio de la replica con el local
							// esto puede deberse a un cambio manual en la db asi que es mejor borrar el registro
							// para que se vuelva a crear con la data enviada desde el servidor
							if (!po.is_new() && po.getLastError().length() == 0 && po.get_KeyColumns().length>1) {
								// 
								int no = DB.executeUpdate(String.format("DELETE FROM %s WHERE identifier = '%s'", po.get_TableName(), identifier), null);
								if (no == 1) {
									throw new Exception(String.format("%s %s", po.get_TableName(), "err"));
								}
							} else {
								String err = po.getLastError();
								throw new Exception(String.format("%s %s", po.get_TableName(), err));
							}
						} else if (po != null) {
							//							if (po.get_TableName().equals(X_M_Storage.Table_Name)) {
							//								System.out.println(String.format("M_Product_ID = %s M_Locator_ID = %s M_AttributeSetInstance_ID = %s",po.get_Value(X_M_Storage.COLUMNNAME_M_Product_ID),po.get_Value(X_M_Storage.COLUMNNAME_M_Locator_ID),po.get_Value(X_M_Storage.COLUMNNAME_M_AttributeSetInstance_ID)));								
							//							}
							if (haveprimarykey) {
								DB.executeUpdate(String.format("UPDATE %s set %s_ID = %s WHERE identifier = '%s'", po.get_TableName(), po.get_TableName(), pkey, po.get_Value(X_AD_Table.COLUMNNAME_Identifier)), po.get_TrxName());																
							} 							
						}
					} catch (Exception ex) {
						error = ex.getMessage();
						ex.printStackTrace();
						break;
					}					
				}										
			}
		}
		return error;
	}

	private void addReactive(String prevtableName, String tableName) {
		List<String> tables = new ArrayList<String>();
		if (reactives.containsKey(prevtableName)) {
			tables = reactives.get(prevtableName);
		}
		if (!tables.contains(tableName)) {
			tables.add(tableName);
			reactives.put(prevtableName, tables);
		}
	}

	public void clear() throws Exception {
		records2.clear();
	}

	public String processtable(PO po, int level) throws Exception {		
		String error = "";
		if (level == 0)
			tablename = po.get_TableName();
		level ++;		
		if ( level > m_level )
			m_level = level;
		//
		String Identifier = "";
		if (po.getReplicationType().equals(REF_ReplicationType.None))
		{
			return error;
		}
		int Identifier_ID = MColumn.getColumn_ID(po.get_TableName(),  X_AD_Table.COLUMNNAME_Identifier, po.get_TrxName());
		if (Identifier_ID == 0)
		{			
			error = po.get_TableName()+" no tiene columna identifier";
			return error;
		}
		else
		{
			Identifier = (String) po.get_Value( X_AD_Table.COLUMNNAME_Identifier);			
		}
		if (Identifier == null || Identifier.length() == 0)
		{
			error = String.format("Table %s with ID = %s field Identifier is empty", po.get_TableName(), po.get_ID());			
			return error;			
		}
		Record record = null;
		if (!records2.containsKey(po.get_TableName())) {
			records2.put(po.get_TableName(), new HashMap<String, Record>());
		}
		HashMap<String, Record> records = records2.get(po.get_TableName());

		if (!records.containsKey(Identifier)) {
			record = new Record();
			record.setName(po.get_TableName());
			record.setLevel(level);
			record.setAccesslevel(0);
			record.setIdentifier(Identifier);
			record.setRecord(po.get_ID());
			records.put(Identifier, record);
			records2.put(po.get_TableName(), records);
		}
		record = records.get(Identifier);
		Constructor<?> constructor = po.getClass().getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
		String[] KeyColumn = po.get_KeyColumns();			
		if ( KeyColumn.length > 0 )
		{
			String ColumnKeyName =  KeyColumn[0];
			Field[] fields = null; 
			if (po.getClass().getSimpleName().startsWith("X_"))
			{
				fields = po.getClass().getDeclaredFields();
			}
			else
			{
				fields = po.getClass().getSuperclass().getDeclaredFields();
			}			
			// Client
			Column cl = new Column();
			cl.setName(Constants.COLUMNNAME_AD_Client_ID);
			cl.setAD_Reference_ID(DisplayType.TableDir);
			cl.setValue(po.getAD_Client_ID());
			record.addColumn(cl);
			// Org
			Column or = new Column();
			or.setName(Constants.COLUMNNAME_AD_Org_ID);
			or.setAD_Reference_ID(DisplayType.TableDir);
			or.setValue(po.getAD_Org_ID());
			record.addColumn(or);														
			//
			for (int i = 0; i < fields.length; i++)
			{
				String field = fields[i].getName();
				if (field.startsWith("COLUMNNAME_"))
				{
					String columnName = field.substring("COLUMNNAME_".length());
					int AD_Column_ID = MColumn.getColumn_ID(po.get_TableName(), columnName, po.get_TrxName());									
					Object ii = po.get_Value(columnName);
					if (ii == null)
						continue;
					MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);
					if (columnName.endsWith("_ID"))
					{							
						if (ii instanceof Integer) 
						{								
							//	continue;							
							if (column.getAD_Reference_ID() == DisplayType.ID)
							{
								continue;
							}
							if (column.getAD_Reference_Value_ID() > 0 )
							{								
								String IdentifierRef = "";
								String IdentifierValue = null;								
								X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID=?", po.get_TrxName())
								.setParameters(column.getAD_Reference_Value_ID())
								.first();
								if (reference != null)
								{
									if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
									{
										MRefTable reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID=?", null)
										.setParameters(reference.getAD_Reference_ID())
										.first();
										if (reftable != null)
										{
											MTable table = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());																		
											Iterator it = records.keySet().iterator();
											while (it.hasNext()) {
												String key = (String) it.next();
												Record r = records.get(key);
												if (r.getName().equals(table.getTableName()))
												{
													if (r.getRecord() == (Integer) ii)
													{
														IdentifierValue = r.getIdentifier();
														break;																
													}
												}												
											}
											if (IdentifierValue == null)
											{
												constructor = Class.forName(String.format("org.compiere.model.persistence.X_%s",table.getTableName()))
														.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});													
												PO pox = (PO)constructor.newInstance(new Object[] {Env.getCtx(), ii, po.get_TrxName()});
												if (pox.get_ID() > 0)
												{																												 
													error = processtable(pox, level);
													if (error.length() > 0)
														return error;
													IdentifierValue = (String) pox.get_Value(X_AD_Table.COLUMNNAME_Identifier);
												}
											}
										}
										else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
										{										
											List<X_AD_Ref_List> reflists = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "AD_Reference_ID = ?", null)
											.setParameters(reference.getAD_Reference_ID()).list();
											for (X_AD_Ref_List rflist:reflists)
											{
												if (rflist.getAD_Ref_List_ID() == (Integer) ii)
												{
													IdentifierValue = rflist.getValue();
												}
											}
										}
									}
									Column c = new Column();
									c.setName(columnName);
									c.setAD_Reference_ID(column.getAD_Reference_ID());
									c.setValue(IdentifierValue);
									c.setReferenceid(IdentifierRef);
									record.addColumn(c);
								}
							}
							else if (column.getAD_Reference_ID() == DisplayType.PAttribute) {								
								X_M_AttributeSetInstance mas = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, "M_AttributeSetInstance_ID = ?", null)
								.setParameters(ii).first();
								if (mas == null) {
									Column c = new Column();
									c.setName(X_M_AttributeSetInstance.COLUMNNAME_M_AttributeSetInstance_ID);
									c.setAD_Reference_ID(DisplayType.String);
									c.setValue("BLANK");
									c.setReferenceid("");
									record.addColumn(c);
								} else {
									boolean noblank = false;
									if (mas.getGuaranteeDate() != null) {
										Column c = new Column();
										c.setName(X_M_AttributeSetInstance.COLUMNNAME_GuaranteeDate);
										c.setAD_Reference_ID(DisplayType.Date);
										c.setValue(mas.getGuaranteeDate());
										c.setReferenceid("");
										record.addColumn(c);
										noblank = true;
									}
									if (mas.getLot() != null && mas.getLot().length() > 0) {
										Column c = new Column();
										c.setName(X_M_AttributeSetInstance.COLUMNNAME_Lot);
										c.setAD_Reference_ID(DisplayType.String);
										c.setValue(mas.getLot());
										c.setReferenceid("");
										record.addColumn(c);
										noblank = true;
									}
									if (mas.getSerNo() != null && mas.getSerNo().length() > 0) {
										Column c = new Column();
										c.setName(X_M_AttributeSetInstance.COLUMNNAME_SerNo);
										c.setAD_Reference_ID(DisplayType.String);
										c.setValue(mas.getSerNo());
										c.setReferenceid("");
										record.addColumn(c);
										noblank = true;
									} 
									if (noblank) {
										Column c = new Column();
										c.setName(X_M_AttributeSetInstance.COLUMNNAME_M_AttributeSetInstance_ID);
										c.setAD_Reference_ID(DisplayType.String);
										c.setValue("NOBLANK");
										c.setReferenceid("");
										record.addColumn(c);																																																			
									} else {
										Column c = new Column();
										c.setName(X_M_AttributeSetInstance.COLUMNNAME_M_AttributeSetInstance_ID);
										c.setAD_Reference_ID(DisplayType.String);
										c.setValue("BLANK");
										c.setReferenceid("");
										record.addColumn(c);										
									}
								}
							}
							else if (column.getAD_Reference_ID() == DisplayType.TableDir || 
									column.getAD_Reference_ID() == DisplayType.Location ||
									column.getAD_Reference_ID() == DisplayType.Search ||
									column.getAD_Reference_ID() == DisplayType.Locator )
							{
								String IdentifierRef = "";
								String tableName = columnName.substring(0, columnName.indexOf("_ID"));
								MTable table = MTable.get(Env.getCtx(), tableName);
								if (table == null)
									throw new XendraException (" table "+tableName+ " no encontrado llamado por "+po.toString());
								boolean goahead = true;

								String identifier = "";
								if (records2.containsKey(tableName)) {
									HashMap<String, Record> innerrecords = records2.get(tableName);
									Iterator it = innerrecords.keySet().iterator();
									while (it.hasNext()) {
										String key = (String) it.next();
										Record r = innerrecords.get(key);
										if (r.getRecord() == (Integer) ii) {
											IdentifierRef = r.getIdentifier();
											goahead = false;
											break;
										}
									}
								}
								if (goahead)
								{																
									constructor = Class.forName("org.compiere.model.persistence.X_"+table.getTableName())
											.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
									PO pox = new Query(Env.getCtx(), table.getTableName(), String.format("%s_ID = ?", table.getTableName()), null)
									.setParameters(ii).first();
									if (pox != null)
									{
										IdentifierRef = (String) pox.get_Value(X_AD_Table.COLUMNNAME_Identifier); 
										if (table.getTableName().startsWith("AD_"))
											goahead = false;
										if (table.getTableName().equals(X_C_DocType.Table_Name))
											goahead = false;						
										if (goahead)
										{
											error = processtable(pox, level);
											if (error.length() > 0)
												return error;
										}
										if ((int)ii > 0 && pox.get_ID() == 0)
										{
											error = "instance table.getTableName() record "+ii+" not found";
											return error;
										}
									}
								}
								if (Identifier == null)
									Identifier = "";
								Column c = new Column();
								c.setName(columnName);
								c.setAD_Reference_ID(column.getAD_Reference_ID());
								c.setValue(IdentifierRef);
								c.setReferenceid("");
								record.addColumn(c);								
							}
						}
					}
					else 
					{						
						Column c = new Column();
						c.setName(columnName);
						c.setAD_Reference_ID(column.getAD_Reference_ID());
						c.setValue(ii);
						c.setReferenceid("");
						record.addColumn(c);							
					}
				}
			}
			Object ii = po.get_Value(Constants.COLUMNNAME_IsActive);
			Column c = new Column();
			c.setName(Constants.COLUMNNAME_IsActive);
			c.setAD_Reference_ID(DisplayType.YesNo);
			c.setValue(ii);
			c.setReferenceid("");
			record.addColumn(c);				
		}
		return error;
	}

	public String build() {		
		List<String> tablesprocessed = new ArrayList<String>();
		org.jdom.Element stream = new org.jdom.Element("stream");
		org.jdom.Element record = new org.jdom.Element("record");
		org.jdom.Document doc = new org.jdom.Document(stream);			
		stream.addContent(record);
		record.setAttribute(new org.jdom.Attribute("level", String.valueOf(m_level)));
		record.setAttribute(new org.jdom.Attribute("name", tablename));
		//for (int level = m_level; level >= 0; level--)
		for (int level =1; level <= m_level; level++)
		{
			Iterator it2 = records2.keySet().iterator();
			while (it2.hasNext())
			{
				String key2 = (String) it2.next();
				HashMap<String, Record> records = records2.get(key2);
				Iterator it = records.keySet().iterator();
				Boolean goahead = false;
				int accesslevel = 0;
				String idtable  = "";
				//int level = 0;
				while (it.hasNext()) {
					String key = (String) it.next();
					Record r = records.get(key);
					idtable = r.getIdentifier();
					//org.jdom.Element table = null;
					int vlevel = r.getLevel();
					if (vlevel == level) {
						accesslevel = r.getAccesslevel();
						//level = r.getLevel();
						if (!tablesprocessed.contains(key2))
							goahead = true;
						break;
					}					
				}
				if (goahead) {					
					tablesprocessed.add(key2);
					org.jdom.Element table = new org.jdom.Element("table");
					table.setAttribute(new org.jdom.Attribute("name", key2));
					table.setAttribute(new org.jdom.Attribute("accesslevel", String.valueOf(accesslevel)));
					table.setAttribute(new org.jdom.Attribute("level", String.valueOf(level)));
					table.setAttribute(new org.jdom.Attribute(X_AD_Table.COLUMNNAME_Identifier, idtable));
					//idtable = r.getIdentifier();
					record.addContent(table);
					it = records.keySet().iterator();
					while (it.hasNext()) {
						String key = (String) it.next();
						Record r = records.get(key);
						org.jdom.Element row = new org.jdom.Element("row");
						List<Column> columns = r.getColumns();
						for (Column c:columns)
						{
							String name  = c.getName(); 
							Object value = c.getValue();
							if (c.getAD_Reference_ID() == DisplayType.Text)
							{
								Element typetext = new org.jdom.Element(name);							
								CDATA cdata = new CDATA(String.valueOf(value));
								typetext.addContent(cdata);
								row.addContent(typetext);
							}
							else if (c.getAD_Reference_ID() == DisplayType.HStore)
							{
								Element typehstore = new org.jdom.Element(name);							
								org.jdom.Element hashmap = new org.jdom.Element("hashmap");
								typehstore.addContent(hashmap);
								row.addContent(typehstore);
								Iterator keys = ((HashMap)value).keySet().iterator();
								while (keys.hasNext())
								{
									String hkey = (String)keys.next();
									String content = (String) ((HashMap)value).get(hkey);
									org.jdom.Element map = new org.jdom.Element("map");
									map.setAttribute(new org.jdom.Attribute("key", hkey));
									if (content == null) {
										content = "";
									}
									map.setAttribute(new org.jdom.Attribute("value", content));
									hashmap.addContent(map);
								}																	
							}
							else
							{
								row.setAttribute(name, String.valueOf(value));
							}
						}
						table.addContent(row);						
					}
				}

			}			
		}
		Format xxx = Format.getPrettyFormat();
		xxx.setOmitDeclaration(true);
		XMLOutputter xmOutc=new XMLOutputter(xxx);
		return xmOutc.outputString(doc);		
	}

	/* 
	 * generate the dom from the arrays created by @processtable()
	 * 
	 * */
	public String build2()
	{
		org.jdom.Element stream = new org.jdom.Element("stream");
		org.jdom.Element record = new org.jdom.Element("record");
		org.jdom.Document doc = new org.jdom.Document(stream);			
		stream.addContent(record);
		record.setAttribute(new org.jdom.Attribute("level", String.valueOf(m_level)));
		//		for (X_AD_Reference reference:references)
		//		{
		//
		//			org.jdom.Element ref = new org.jdom.Element("reference");
		//			ref.setAttribute(X_AD_Reference.COLUMNNAME_Name,  reference.getName());
		//			ref.setAttribute(X_AD_Reference.COLUMNNAME_Description, reference.getDescription());
		//			ref.setAttribute(X_AD_Reference.COLUMNNAME_Help, reference.getHelp());
		//			ref.setAttribute(X_AD_Reference.COLUMNNAME_ValidationType, reference.getValidationType());
		//			ref.setAttribute(X_AD_Reference.COLUMNNAME_IsOrderByValue, String.valueOf(reference.isOrderByValue()));
		//			ref.setAttribute(X_AD_Reference.COLUMNNAME_Identifier, reference.getIdentifier());
		//			if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
		//			{
		//				PreparedStatement pstmt = null;
		//				ResultSet rs = null;
		//				try
		//				{				
		//					pstmt = DB.prepareStatement(sql.VALIDATIONTYPE_TableIdentifierValidation, null);
		//					pstmt.setInt(1, reference.getAD_Reference_ID());
		//					rs = pstmt.executeQuery();
		//					if (rs.next())
		//					{	
		//						org.jdom.Element props = new org.jdom.Element("Properties");						
		//						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_AD_Key, Util.getvalue(rs, "kcolumnname"));												
		//						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_AD_Display, Util.getvalue(rs, "dcolumnName"));
		//						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_AD_Table_ID, Util.getvalue(rs, "tablename"));
		//						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_WhereClause, Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_WhereClause));
		//						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_OrderByClause, Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_OrderByClause));
		//						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed, Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed));
		//						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_EntityType, Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_EntityType));
		//						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_Identifier, Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_Identifier));
		//						Timestamp value = rs.getTimestamp(X_AD_Ref_Table.COLUMNNAME_Synchronized);
		//						if (value != null)
		//							props.setAttribute(X_AD_Ref_Table.COLUMNNAME_Synchronized,value.toString());
		//						ref.addContent(props);
		//					}
		//				}
		//				catch (Exception e)
		//				{
		//					e.printStackTrace();
		//				}
		//				finally
		//				{
		//					DB.close(rs, pstmt);
		//				}
		//			}
		//			else
		//			{
		//				List<X_AD_Ref_List> reflists = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "AD_Reference_ID = ?", null)
		//				.setParameters(reference.getAD_Reference_ID()).list();
		//				for (X_AD_Ref_List rflist:reflists)
		//				{
		//					org.jdom.Element props = new org.jdom.Element("Properties");
		//					props.setAttribute(rflist.COLUMNNAME_Name, rflist.getName());
		//					props.setAttribute(rflist.COLUMNNAME_Identifier, rflist.getIdentifier());
		//					Timestamp time = rflist.getSynchronized();
		//					if (time != null)
		//						props.setAttribute(rflist.COLUMNNAME_Synchronized, time.toString());
		//					ref.addContent(props);
		//				}				
		//			}
		//			doc.getRootElement().addContent(ref);			
		//		}
		Format xx = Format.getPrettyFormat();
		xx.setOmitDeclaration(true);
		XMLOutputter xmOut=new XMLOutputter(xx);		
		log.fine(xmOut.outputString(doc));
		for (int level = m_level; level >= 0; level--)
		{	
			//List<Element> tables = new ArrayList<Element>();
			HashMap<String, Element> tables2 = new HashMap<String, Element>();
			String idtable = null;
			//for (Record r:records)
			Iterator it2 = records2.keySet().iterator();
			while (it2.hasNext())
			{
				String key2 = (String) it2.next();
				HashMap<String, Record> records = records2.get(key2);
				Iterator it = records.keySet().iterator();
				while (it.hasNext()) {
					String key = (String) it.next();
					Record r = records.get(key);
					org.jdom.Element table = null;
					int vlevel = r.getLevel();
					if (vlevel == level)
					{
						//for (Element element:tables)
						//{
						//	if (element.getAttributeValue("name").equals(r.getName()))
						//	{
						//		table = element;
						//	}
						//}
						//if (table == null)
						//{
						table = new org.jdom.Element("table");
						table.setAttribute(new org.jdom.Attribute("name", r.getName()));
						table.setAttribute(new org.jdom.Attribute("accesslevel", String.valueOf(r.getAccesslevel())));
						table.setAttribute(new org.jdom.Attribute("level", String.valueOf(r.getLevel())));
						idtable = r.getIdentifier();
						record.addContent(table);
						//tables.add(table);
						//}
						//if (idtable == null)
						//	idtable = "";
						table.setAttribute(new org.jdom.Attribute(X_AD_Table.COLUMNNAME_Identifier, idtable));
						//doc.getRootElement().addContent(table);					
						org.jdom.Element row = new org.jdom.Element("row");
						List<Column> columns = r.getColumns();
						for (Column c:columns)
						{
							String name  = c.getName(); 
							Object value = c.getValue();
							if (c.getAD_Reference_ID() == DisplayType.Text)
							{
								Element typetext = new org.jdom.Element(name);							
								CDATA cdata = new CDATA(String.valueOf(value));
								typetext.addContent(cdata);
								row.addContent(typetext);
							}
							else if (c.getAD_Reference_ID() == DisplayType.HStore)
							{
								Element typehstore = new org.jdom.Element(name);							
								org.jdom.Element hashmap = new org.jdom.Element("hashmap");
								typehstore.addContent(hashmap);
								row.addContent(typehstore);
								Iterator keys = ((HashMap)value).keySet().iterator();
								while (keys.hasNext())
								{
									String hkey = (String)keys.next();
									String content = (String) ((HashMap)value).get(hkey);
									org.jdom.Element map = new org.jdom.Element("map");
									map.setAttribute(new org.jdom.Attribute("key", hkey));
									map.setAttribute(new org.jdom.Attribute("value", content));
									hashmap.addContent(map);
								}																	
							}
							else
							{
								row.setAttribute(name, String.valueOf(value));
							}
						}
						table.addContent(row);
					}
				}
			}
		}
		Format xxx = Format.getPrettyFormat();
		xxx.setOmitDeclaration(true);
		XMLOutputter xmOutc=new XMLOutputter(xxx);
		return xmOutc.outputString(doc);		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		if (!org.compiere.Xendra.startup(false))
		{					
			return;
		}
		String filecostelement = "/home/americas/model/m_storageelement.xml";
		File file = new File(filecostelement);
		try {
			ReplicationEngine.getInstance().encode(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ReplicationEngine getInstance() {
		if (m_replicationengine == null)	
		{
			MClient client = MClient.get(Env.getCtx());
			m_replicationengine = new ReplicationEngine(client);
		}
		return m_replicationengine;
	}
}