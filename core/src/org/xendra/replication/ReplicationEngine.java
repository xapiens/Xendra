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
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;

import org.compiere.model.MClient;
import org.compiere.model.MColumn;
import org.compiere.model.MRefTable;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Element;
import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_AD_Ref_Table;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.model.reference.REF_AD_TableAccessLevels;
import org.compiere.model.reference.REF_ReplicationType;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xendra.Constants;
import org.xendra.exceptions.XendraException;
import org.xendra.model.sql;

/* 
 * 
 *  @author xapiens
 *  
 * */
public class ReplicationEngine {
	private static final Object VERSION = "0.2";
	private static CLogger log = CLogger.getCLogger(ReplicationEngine.class);
	private static ReplicationEngine m_replicationengine;
	private int m_level = 0;
	private X_AD_Client m_client;
	/** used by replication */
	//private List<Reference> references = new ArrayList<Reference>();
	private List<X_AD_Reference> references = new ArrayList<X_AD_Reference>();
	private List<Record> records = new ArrayList<Record>();

	public ReplicationEngine(X_AD_Client client) {
		m_client = client;
	}

	public String decode(List<PO> records) throws Exception {
		String retval = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
		ReplicationEngine replication = new ReplicationEngine(m_client);
		try {
			for (PO record:records)
			{
				//Class<?> clazz = Class.forName("org.compiere.model.persistence.X_"+record.get_TableName());			
				//String error = replication.processtable(clazz, record, 0);
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
			System.out.println(e.getMessage());
		}		
		//retval = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+"<stream>\n"+retval+"</stream>";
		//retval = +retval;
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
		try {			
			Element node = doc.getRootElement();
			if (node.getName().equals("stream"))
			{
				List<Element> records = node.getChildren("record");
				for (Element record:records)
				{
					if (record.getAttribute("level") != null)
					{
						Integer maxlevel = record.getAttribute("level").getIntValue();
						List<Element> tables = record.getChildren("table");
						for (int i=maxlevel; i > 0; i--)
						{
							for (Element table:tables)
							{
								//List<Element> columns = table.getChildren("column");								
								String tn = table.getAttribute("name").getValue();
								Attribute attr = table.getAttribute("level");
								int level = attr.getIntValue();
								if (level != i)
									continue;
								Attribute attraccesslevel = table.getAttribute(Constants.XML_ATTRIBUTE_ACCESSLEVEL);
								//int accesslevel = 0;
								//if (attraccesslevel != null)
								//	accesslevel = attraccesslevel.getIntValue();
								// como no se definio un nivel , utilizamos el definido en el AD
								//if (accesslevel == 0)
								//{
								X_AD_Table adtable = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
								.setParameters(tn).first();
								//if (adtable != null)									
								//	accesslevel = Integer.valueOf(adtable.getAccessLevel());									
								//}
								//								//								
								System.out.println(table.getAttribute("name"));
								List<Element> rows = table.getChildren("row");
								for (Element row:rows)
								{
									String identifier = row.getAttribute( X_AD_Table.COLUMNNAME_Identifier).getValue();
									PO poi = null;
									try {
										poi = new Query(Env.getCtx(), tn, "Identifier = ?", null).setParameters(identifier).first();
										//										if (poi == null)
										//										{
										//											if (accesslevel != PO.ACCESSLEVEL_SYSTEM)									
										//												poi = new Query(Env.getCtx(), tn, "Identifier = ? AND AD_Client_ID = ?", null)
										//											.setParameters(identifier, m_client.getAD_Client_ID()).first();
										//										}
										if (poi != null)
										{
											//										if (poi.getAD_Client_ID() != client.getAD_Client_ID())
											//										{	
											//											if (poi.get_KeyColumns().length == 1)
											//											{
											//												String sql = String.format("UPDATE %s set AD_Client_ID = %s where %s_ID = %d", poi.get_TableName(), client.getAD_Client_ID(), poi.get_TableName(), poi.get_ID());
											//												DB.executeUpdateEx(sql, null);
											//											}
											//										}
										}
									}
									catch (Exception e)
									{	
										error = e.getCause().getMessage();
										i = 0;
										break;				
									}									

									if (poi == null || i == 1)
									{
										if (poi == null) // search for table by index/constrains only in case is null 
										{
											HashMap<Integer, Integer> possibleproduct = new HashMap<Integer, Integer>();
											// antes de crear la tabla , busquemos por los constraints de la misma.
											PreparedStatement pstmt = null;
											ResultSet rs = null;
											try
											{
												pstmt = DB.prepareStatement(sql.GETINDEXBYTABLE, null);
												pstmt.setString(1, tn.toLowerCase());
												rs = pstmt.executeQuery();
												while (rs.next())
												{
													String where = "";
													List<Object> parameters = new ArrayList<Object>();
													List<String> paranames = new ArrayList<String>();
													
													String column_names = rs.getString("column_names");
													String[] keys = column_names.split(",");															
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
																	if (col.getAD_Reference_ID() == DisplayType.Search)
																	{
																		System.out.println("X");
																	}
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
																else
																{
																	parameters.add(value);
																	paranames.add(key);
																}
															}															
														}
														else
														{
															System.out.println("que hacer cuando no exista un elemento correspondiente al campo?");
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
														//poi
														//if (poi != null)
														if (matchs == 1)
														{
															PO ref = new Query(Env.getCtx(), tn, where, null).setParameters(parameters).first();
															//poi.set_ValueOfColumn(X_AD_Table.COLUMNNAME_Identifier, identifier);
															if (ref != null)
															{
																int count = 0;																
																if (possibleproduct.containsKey(ref.get_ID()))															
																	count = possibleproduct.get(ref.get_ID());															
																count++;
																possibleproduct.put(ref.get_ID(), count);
															}
															//poi.set_ValueOfColumn(X_AD_Table.COLUMNNAME_Identifier, identifier);
															//poi.save();
														}
													}																				
												}
												if (possibleproduct.size() == 1)
												{
													Iterator keys = possibleproduct.keySet().iterator();
													while (keys.hasNext()) 
													{
														Integer key = (Integer)keys.next();
														poi = new Query(Env.getCtx(), tn, String.format("%s_ID = ?",tn), null).setParameters(key).first();
														poi.set_ValueOfColumn(X_AD_Table.COLUMNNAME_Identifier, identifier);
														poi.save();																											
													}
//													poi = new Query(Env.getCtx(), tn, where, null).setParameters(parameters).first();
//													poi.set_ValueOfColumn(X_AD_Table.COLUMNNAME_Identifier, identifier);
//													poi.save();													
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
										//if (i == 1)
										{
											Class<?> clazz = Class.forName("org.compiere.model.persistence.X_"+tn);
											PO po = null;
											if (poi == null)
											{
												Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});							
												po = (PO)constructor.newInstance(new Object[] {Env.getCtx(), 0, null});
											}
											else
											{
												po = poi;
											}
											//												if (accesslevel == PO.ACCESSLEVEL_SYSTEM)
											//												{
											//													po.setForceValueOfColumn(Constants.COLUMNNAME_AD_Client_ID, 0);											
											//												}											
											//												else 
											//												{
											//													po.setForceValueOfColumn(Constants.COLUMNNAME_AD_Client_ID, m_client.getAD_Client_ID());
											//												}
											//for (Element column:rows)																								
											List list = row.getAttributes();
											for (int k=0; k<list.size(); k++) {
												Attribute a = (Attribute) list.get(k);
												MColumn column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "ColumnName = ?", null)
												.setParameters(a.getName()).first();
												if (column != null)
												{
													String value= a.getValue();
													System.out.println(value);																											
													if (column.getColumnName().equals(Constants.COLUMNNAME_AD_Client_ID))
														po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, value));
													else if  (column.getColumnName().equals(Constants.COLUMNNAME_AD_Org_ID))
														po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, value));
													else if (column.getAD_Reference_ID() == DisplayType.TableDir || column.getAD_Reference_ID() == DisplayType.Search)
													{
														String tableName = column.getColumnName().substring(0, column.getColumnName().indexOf("_ID"));								
														PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", null)
														.setParameters(String.valueOf(value)).first();
														if (poref != null)
														{
															Integer IDref = poref.get_ID();
															po.set_ValueOfColumn(column.getColumnName(), IDref);
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
															PO poref = (PO) new Query(Env.getCtx(), xtable.getTableName(), "identifier = ?", null)
															.setParameters(String.valueOf(value)).first();
															if (poref != null)
															{
																Integer IDref = poref.get_ID();
																po.set_ValueOfColumn(column.getColumnName(), IDref);
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
																	PO poref = new Query(Env.getCtx(), adreftable.getTableName(), "identifier = ?", null)
																	.setParameters(value).first();
																	if (poref != null)
																	{																			
																		po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, poref.get_ID()));
																	}															
																}
															}
															else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
															{//
																po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.String, value));
															}
														}															
													}	
													else
													{
														po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(column.getAD_Reference_ID(), value));
													}
													//po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(column.getAD_Reference_ID(), value));														
													//po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(column.getAD_Reference_ID(), value));														
												}
												//attributes.put(a.getName(), a.getValue());
											}
											if (!po.save())
											{								
												error += "no se pudo grabar "+po.get_TableName();										
											}												
											//												List<MColumn> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ?", null)
											//													.setParameters(adtable.getAD_Table_ID()).list();
											//												for (MColumn column:columns)
											//												{							
											//													
											//													//String name = column.getAttribute(column.getColumnName().toLowerCase()).getValue();
											//													Attribute colattr = row.getAttribute(column.getColumnName());
											//													if (colattr != null)
											//													{
											//														String value= colattr.getValue();
											//														System.out.println(value);		
											////														if (column.getColumnName().equals(Constants.COLUMNNAME_AD_Client_ID))
											////															po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, value));
											////														else if  (column.getColumnName().equals(Constants.COLUMNNAME_AD_Org_ID))
											////															po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, value));
											////														else if (column.getAD_Reference_ID() == DisplayType.TableDir)
											////														{
											////															System.out.println("X");
											////														}
											////														else if (column.getAD_Reference_ID() == DisplayType.Table)
											////														{
											////															System.out.println("X");
											////														}
											////														else if (column.getAD_Reference_Value_ID() > 0)
											////														{
											////															X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
											////															.setParameters(column.getAD_Reference_Value_ID()).first();
											////															if (reference != null)
											////															{
											////																if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
											////																{
											////																	X_AD_Ref_Table reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID = ?", null)
											////																	.setParameters(reference.getAD_Reference_ID()).first();
											////																	if (reftable != null)
											////																	{
											////																		MTable adreftable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
											////																		PO poref = new Query(Env.getCtx(), adreftable.getTableName(), "identifier = ?", null)
											////																		.setParameters(value).first();
											////																		if (poref != null)
											////																		{																			
											////																			po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(DisplayType.Integer, poref.get_ID()));
											////																		}															
											////																	}
											////																}
											////																else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
											////																{//
											////														
											////																}
											////															}															
											////														}														
											////														po.set_ValueOfColumn(column.getColumnName(), Util.convertObject(column.getAD_Reference_ID(), value));
											//													}
											//													//String type  = column.getAttribute("type").getValue();
											//													//Object value = null;
											//													//if (column.getAttribute("value") != null)
											//													//{
											//													//	value = column.getAttribute("value").getValue();										
											//													//}
											//													//String referenceid = column.getAttributeValue("referenceid");
											//													//if (name.equalsIgnoreCase(tn.concat("_ID")))
											//													//{
											//														// don't be considered, because we don't care the id local. 
											//														// this only happen when the Field type ID is not marked like ID in AD
											//														// do nothing
											//													//}
											//													//else if (type.equals(X_AD_Table.COLUMNNAME_Identifier))
											//													//{
											//													//	String tableName = name.substring(0, name.indexOf("_ID"));								
											//													//	PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", null)
											//													//	.setParameters(String.valueOf(value)).first();
											//													//	if (poref != null)
											//													//	{
											//													//		Integer IDref = poref.get_ID();
											//													//		po.set_ValueOfColumn(name, IDref);
											//													//	}
											//													//}
											//													//else if (type.equals("HashMap"))
											//													//{
											//													//	HashMap newmap = new HashMap();
											//													//	Element hashmap = column.getChild("hashmap");
											//													//	List<Element> maps = hashmap.getChildren("map");
											//													//	for (Element map:maps)
											//													//	{
											//													//		String key = map.getAttributeValue("key");
											//													//		String content = map.getAttributeValue("value");
											//													//		newmap.put(key, content);												
											//													//	}							
											//													//	po.set_ValueOfColumn(name, newmap);
											//													//}
											//													//else if (type.equals(X_AD_Reference.COLUMNNAME_AD_Reference_ID))
											//													//{
											//													//	X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "identifier = ?", null)
											//													//	.setParameters(referenceid).first();
											//													//	if (reference != null)
											//													//	{
											//													//		if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
											//													//		{
											//													//			X_AD_Ref_Table reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID = ?", null)
											//													//			.setParameters(reference.getAD_Reference_ID()).first();
											//													//			if (reftable != null)
											//													//			{
											//													//				MTable adreftable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
											//													//				PO poref = new Query(Env.getCtx(), adreftable.getTableName(), "identifier = ?", null)
											//													//				.setParameters(value).first();
											//													//				if (poref != null)
											//													//				{
											//													//					value = poref.get_ID();
											//													//					po.set_ValueOfColumn(name, Util.convertObject("Integer", value));
											//													//				}															
											//													//			}
											//													//		}
											//													//		else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
											//													//		{//
											//
											//													//		}
											//													//	}
											//													//}
											//													//else
											//													//{								
											//													//	po.set_ValueOfColumn(name, Util.convertObject(type, value));
											//													//}
											//												}												
										}										
										//}
									}
								}
							}
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
		return error;
	}


	public void clear() throws Exception {
		references = new ArrayList<X_AD_Reference>();
		records = new ArrayList<Record>();
	}

	public String processtable(PO po, int level) throws Exception {
		System.out.println(String.format("replication version %s", VERSION));
		String error = "";
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
		for ( Record register:records)
		{
			if (register.getIdentifier().equals(Identifier))
			{
				record = register;
				break;
			}
		}				
		if (record == null)
		{
			record = new Record();
			record.setName(po.get_TableName());
			record.setLevel(level);
			record.setAccesslevel(0);
			record.setIdentifier(Identifier);
			record.setRecord(po.get_ID());
			records.add(record);
		}
		Constructor<?> constructor = po.getClass().getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
		//Constructor<?> constructor2 = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
		String[] KeyColumn = po.get_KeyColumns();			
		if ( KeyColumn.length > 0 )
		{
			String ColumnKeyName =  KeyColumn[0];
			//Field[] fields = clazz.getDeclaredFields();
			//
			//Field[] fields = po.getClass().getDeclaredFields();
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
					MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);					
					Object ii = po.get_Value(columnName);
					if (columnName.endsWith("_ID"))
					{						
						if (ii != null && ii instanceof Integer) 
						{								
							if ((Integer) ii == 0)
								System.out.println("X");
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
									if (reference.getName().equals("AD_User"))
									{
										System.out.println("X");
									}
									//for (Reference refer:references)

									//}
									//									if (IdentifierRef.length() == 0)
									//									{
									//										IdentifierRef = reference.getIdentifier();
									//										
									//										//HashMap prop = new HashMap();
									//
									//										//Hashtable rf = new Hashtable();
									//										//rf.put(X_AD_Reference.COLUMNNAME_Name, 				reference.get_ValueAsString(X_AD_Reference.COLUMNNAME_Name));
									//										//prop.put(X_AD_Table.COLUMNNAME_Name, reference.getIdentifier());
									//										//rf.put(X_AD_Reference.COLUMNNAME_Description, 		reference.get_ValueAsString(X_AD_Reference.COLUMNNAME_Description));
									//										//rf.put(X_AD_Reference.COLUMNNAME_Help, 				reference.get_ValueAsString(X_AD_Reference.COLUMNNAME_Help));
									//										//rf.put(X_AD_Reference.COLUMNNAME_ValidationType,	reference.get_ValueAsString(X_AD_Reference.COLUMNNAME_ValidationType));
									//										//rf.put(X_AD_Reference.COLUMNNAME_IsOrderByValue, 	reference.get_ValueAsString(X_AD_Reference.COLUMNNAME_IsOrderByValue));
									//										//rf.put(X_AD_Table.COLUMNNAME_Identifier,			reference.get_ValueAsString(X_AD_Table.COLUMNNAME_Identifier));
									//										
									//										//prop.put("Definition",rf);
									//										
									//										Reference ref = new Reference();
									//										
									//										
									//
									if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
									{
										MRefTable reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID=?", null)
										.setParameters(reference.getAD_Reference_ID())
										.first();
										if (reftable != null)
										{
											MTable table = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());							
											//												//if (table.isReplicated())
											//												//{
											//													boolean goahead = true;				
											//													String identifier = "";
											for (Record r:records)
												//													{
												if (r.getName().equals(table.getTableName()))
												{
													if (r.getRecord() == (Integer) ii)
													{
														//goahead = false;
														//IdentifierRef = (String) itemtable.get(4);
														IdentifierValue = r.getIdentifier();
														break;																
													}
												}

											if (IdentifierValue == null)
											{
												//													//Class<?> subclazz = Class.forName("org.compiere.model.persistence.X_"+table.getTableName());
												//													//constructor = subclazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
												constructor = Class.forName(String.format("org.compiere.model.persistence.X_%s",table.getTableName()))
														.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});													
												PO pox = (PO)constructor.newInstance(new Object[] {Env.getCtx(), ii, po.get_TrxName()});
												if (pox.get_ID() > 0)
												{																												 
													//														if (goahead)
													//														{
													//															//error = processtable(subclazz, pox, level);
													error = processtable(pox, level);
													if (error.length() > 0)
														return error;
													IdentifierValue = (String) pox.get_Value(X_AD_Table.COLUMNNAME_Identifier);
													//														}
													//													}
												}
												//													PreparedStatement pstmt = null;
												//													ResultSet rs = null;
												//													try
												//													{
												//														pstmt = DB.prepareStatement(sql.VALIDATIONTYPE_TableIdentifierValidation, null);
												//														pstmt.setInt(1, reference.getAD_Reference_ID());
												//														rs = pstmt.executeQuery();
												//														if (rs.next())
												//														{	
												//															HashMap map = new HashMap();
												//															map.put(X_AD_Ref_Table.COLUMNNAME_AD_Key,Util.getvalue(rs, "kcolumnname"));
												//															map.put(X_AD_Ref_Table.COLUMNNAME_AD_Display,Util.getvalue(rs,"dcolumnName"));															
												//															map.put(X_AD_Ref_Table.COLUMNNAME_AD_Table_ID,Util.getvalue(rs, "tablename"));															
												//															map.put(X_AD_Ref_Table.COLUMNNAME_WhereClause,Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_WhereClause));															
												//															map.put(X_AD_Ref_Table.COLUMNNAME_OrderByClause,Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_OrderByClause));															
												//															map.put(X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed,Util.getvalue(rs,X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed));															
												//															map.put(X_AD_Ref_Table.COLUMNNAME_EntityType,Util.getvalue(rs,X_AD_Ref_Table.COLUMNNAME_EntityType));															
												//															map.put(X_AD_Ref_Table.COLUMNNAME_Identifier,Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_Identifier));															
												//															map.put(X_AD_Ref_Table.COLUMNNAME_Synchronized,rs.getTimestamp(X_AD_Ref_Table.COLUMNNAME_Synchronized));															
												//															prop.put("Properties", map);
												//														}
												//													}
												//													catch (Exception e)
												//													{
												//														e.printStackTrace();
												//													}
												//													finally
												//													{
												//														DB.close(rs, pstmt);
												//														rs = null; pstmt = null;
												//													}
												//												for (X_AD_Reference refer:references)
												//												{
												//													//HashMap prop = (HashMap) refer.get(0);
												//													//Hashtable props = (Hashtable) prop.get("Definition");
												//													//String name = (String) props.get(X_AD_Table.COLUMNNAME_Identifier);
												//													//String name = refer.getIdentifier();
												//													if (refer.getIdentifier().compareTo(reference.getIdentifier()) == 0)
												//													{
												//														//IdentifierRef = name;
												//														//break;
												//														continue;
												//													}
												//												}	
												boolean found = false;
												for (X_AD_Reference refer:references)
												{
													if (refer.getIdentifier().compareTo(reference.getIdentifier()) == 0)
													{
														found = true;
														break;
													}
												}
												if (!found)
													//if (!references.contains(reference))
													references.add(reference);
												//											}										
												//
											}
										}
										else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
										{										
											List<X_AD_Ref_List> reflists = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "AD_Reference_ID = ?", null)
											.setParameters(reference.getAD_Reference_ID()).list();
											//
											//											HashMap map = new HashMap();
											//
											for (X_AD_Ref_List rflist:reflists)
											{
												//												Vector content = new Vector();
												//												content.add(rflist.getName());
												//												content.add(rflist.getIdentifier());
												//												content.add(rflist.getSynchronized());
												//												map.put(rflist.getValue(), content);
												if (rflist.getAD_Ref_List_ID() == (Integer) ii)
												{
													IdentifierValue = rflist.getValue();
												}
											}
											//											prop.put("Properties", map);
										}
										//										if (prop.get("Properties") != null)
										//										{
										//											Vector props = new Vector();
										//											props.add(prop);
										//											references.add(props);
										//										}
									}
									Column c = new Column();
									c.setName(columnName);
									//c.setType(X_AD_Reference.COLUMNNAME_Identifier);
									c.setAD_Reference_ID(column.getAD_Reference_ID());
									//c.setType(X_AD_Reference.COLUMNNAME_AD_Reference_ID);
									c.setValue(IdentifierValue);

									c.setReferenceid(IdentifierRef);
									record.addColumn(c);
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
								for (Record r:records)
								{
									if (r.getName().equals(tableName))
									{
										if (r.getRecord() == (Integer) ii)
										{
											IdentifierRef = r.getIdentifier();
											goahead = false;
											break;
										}
									}
								}
								if (goahead)
								{																
									//Class<?> subclazz = Class.forName("org.compiere.model.persistence.X_"+table.getTableName());
									constructor = Class.forName("org.compiere.model.persistence.X_"+table.getTableName())
											.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
									//constructor = subclazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
									//PO pox = (PO)constructor.newInstance(new Object[] {Env.getCtx(), ii, po.get_TrxName()});
									PO pox = new Query(Env.getCtx(), table.getTableName(), String.format("%s_ID = ?", table.getTableName()), null)
										.setParameters(ii).first();
									//if (pox.get_ID() > 0)
									if (pox != null)
									{
										IdentifierRef = (String) pox.get_Value(X_AD_Table.COLUMNNAME_Identifier); 
										if (table.getTableName().startsWith("AD_"))
											goahead = false;
										if (table.getTableName().equals(X_C_DocType.Table_Name))
											goahead = false;						
										if (goahead)
										{
											//error = processtable(subclazz, pox, level);
											error = processtable(pox, level);
											if (error.length() > 0)
												return error;
										}
									}
									if ((int)ii > 0 && pox.get_ID() == 0)
									{
										error = "instance table.getTableName() record "+ii+" not found";
										return error;
									}										
								}
								if (Identifier == null)
									Identifier = "";
								Column c = new Column();
								c.setName(columnName);
								//c.setType(X_AD_Reference.COLUMNNAME_Identifier);
								c.setAD_Reference_ID(column.getAD_Reference_ID());
								//c.setType(X_AD_Reference.COLUMNNAME_AD_Reference_ID);
								c.setValue(IdentifierRef);
								c.setReferenceid("");
								record.addColumn(c);								
							}
						}
					}
					else if (ii != null) // un value plano
					{
						Column c = new Column();
						c.setName(columnName);
						//c.setType(ii.getClass().getSimpleName());
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
			//c.setType(ii.getClass().getSimpleName());
			c.setAD_Reference_ID(DisplayType.YesNo);
			c.setValue(ii);
			c.setReferenceid("");
			record.addColumn(c);				
		}
		return error;
	}
	/* 
	 * generate the dom from the arrays created by @processtable()
	 * 
	 * */
	public String build()
	{
		org.jdom.Element stream = new org.jdom.Element("stream");
		org.jdom.Element record = new org.jdom.Element("record");
		org.jdom.Document doc = new org.jdom.Document(stream);			
		stream.addContent(record);
		//doc.setRootElement(stream);					
		record.setAttribute(new org.jdom.Attribute("level", String.valueOf(m_level)));
		//for (Vector reference:references)
		for (X_AD_Reference reference:references)
		{

			//HashMap hreference = (HashMap) reference.get(0);
			//Hashtable Definition = (Hashtable) hreference.get("Definition");
			//HashMap Properties = (HashMap) hreference.get("Properties");

			org.jdom.Element ref = new org.jdom.Element("reference");
			//Enumeration<Object> en = Definition.keys();
			//while (en.hasMoreElements())
			//{
			//	String key = en.nextElement().toString();				
			//	ref.setAttribute(new org.jdom.Attribute(key, Definition.get(key).toString()));			
			//}
			ref.setAttribute(X_AD_Reference.COLUMNNAME_Name,  reference.getName());
			ref.setAttribute(X_AD_Reference.COLUMNNAME_Description, reference.getDescription());
			ref.setAttribute(X_AD_Reference.COLUMNNAME_Help, reference.getHelp());
			ref.setAttribute(X_AD_Reference.COLUMNNAME_ValidationType, reference.getValidationType());
			ref.setAttribute(X_AD_Reference.COLUMNNAME_IsOrderByValue, String.valueOf(reference.isOrderByValue()));
			ref.setAttribute(X_AD_Reference.COLUMNNAME_Identifier, reference.getIdentifier());
			//0org.jdom.Element props = new org.jdom.Element("Properties");			
			//Iterator p = Properties.keySet().iterator();
			//while (p.hasNext())
			//{
			//	String key = p.next().toString();
			//	Object value  = Properties.get(key);
			//	if  (value == null)
			//		value = "";
			//	props.setAttribute(new org.jdom.Attribute(key, value.toString()));				
			//}			
			//ref.addContent(props);
			if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
			{
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try
				{				
					pstmt = DB.prepareStatement(sql.VALIDATIONTYPE_TableIdentifierValidation, null);
					pstmt.setInt(1, reference.getAD_Reference_ID());
					rs = pstmt.executeQuery();
					if (rs.next())
					{	
						//HashMap map = new HashMap();
						//						map.put(X_AD_Ref_Table.COLUMNNAME_AD_Key,Util.getvalue(rs, "kcolumnname"));
						//						map.put(X_AD_Ref_Table.COLUMNNAME_AD_Display,Util.getvalue(rs,"dcolumnName"));															
						//						map.put(X_AD_Ref_Table.COLUMNNAME_AD_Table_ID,Util.getvalue(rs, "tablename"));															
						//						map.put(X_AD_Ref_Table.COLUMNNAME_WhereClause,Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_WhereClause));															
						//						map.put(X_AD_Ref_Table.COLUMNNAME_OrderByClause,Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_OrderByClause));															
						//						map.put(X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed,Util.getvalue(rs,X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed));															
						//						map.put(X_AD_Ref_Table.COLUMNNAME_EntityType,Util.getvalue(rs,X_AD_Ref_Table.COLUMNNAME_EntityType));															
						//						map.put(X_AD_Ref_Table.COLUMNNAME_Identifier,Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_Identifier));															
						//						map.put(X_AD_Ref_Table.COLUMNNAME_Synchronized,rs.getTimestamp(X_AD_Ref_Table.COLUMNNAME_Synchronized));
						org.jdom.Element props = new org.jdom.Element("Properties");						
						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_AD_Key, Util.getvalue(rs, "kcolumnname"));												
						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_AD_Display, Util.getvalue(rs, "dcolumnName"));
						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_AD_Table_ID, Util.getvalue(rs, "tablename"));
						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_WhereClause, Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_WhereClause));
						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_OrderByClause, Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_OrderByClause));
						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed, Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed));
						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_EntityType, Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_EntityType));
						props.setAttribute(X_AD_Ref_Table.COLUMNNAME_Identifier, Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_Identifier));
						Timestamp value = rs.getTimestamp(X_AD_Ref_Table.COLUMNNAME_Synchronized);
						if (value != null)
							props.setAttribute(X_AD_Ref_Table.COLUMNNAME_Synchronized,value.toString());
						//prop.put("Properties", map);
						ref.addContent(props);
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				finally
				{
					DB.close(rs, pstmt);
				}
			}
			else
			{
				List<X_AD_Ref_List> reflists = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "AD_Reference_ID = ?", null)
				.setParameters(reference.getAD_Reference_ID()).list();
				//
				//											HashMap map = new HashMap();
				//				
				for (X_AD_Ref_List rflist:reflists)
				{
					org.jdom.Element props = new org.jdom.Element("Properties");
					//												Vector content = new Vector();
					//												content.add(rflist.getName());
					//												content.add(rflist.getIdentifier());
					//												content.add(rflist.getSynchronized());
					//												map.put(rflist.getValue(), content);
					props.setAttribute(rflist.COLUMNNAME_Name, rflist.getName());
					props.setAttribute(rflist.COLUMNNAME_Identifier, rflist.getIdentifier());
					Timestamp time = rflist.getSynchronized();
					if (time != null)
						props.setAttribute(rflist.COLUMNNAME_Synchronized, time.toString());
					ref.addContent(props);
				}				
			}
			doc.getRootElement().addContent(ref);			
		}
		Format xx = Format.getPrettyFormat();
		xx.setOmitDeclaration(true);
		XMLOutputter xmOut=new XMLOutputter(xx);
		System.out.println(xmOut.outputString(doc));				
		for (int level = m_level; level >= 0; level--)
		{	
			List<Element> tables = new ArrayList<Element>();			
			String idtable = null;
			for (Record r:records)
			{
				org.jdom.Element table = null;
				int vlevel = r.getLevel();
				if (vlevel == level)
				{
					for (Element element:tables)
					{
						if (element.getAttributeValue("name").equals(r.getName()))
						{
							table = element;
						}
					}
					if (table == null)
					{
						table = new org.jdom.Element("table");
						table.setAttribute(new org.jdom.Attribute("name", r.getName()));
						table.setAttribute(new org.jdom.Attribute("accesslevel", String.valueOf(r.getAccesslevel())));
						table.setAttribute(new org.jdom.Attribute("level", String.valueOf(r.getLevel())));
						idtable = r.getIdentifier();
						record.addContent(table);
						tables.add(table);
					}
					if (idtable == null)
						idtable = "";
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
							//							System.out.println("X");
							//							Format xxxX = Format.getPrettyFormat();
							//							xxxX.setOmitDeclaration(true);
							//							XMLOutputter xmOutc=new XMLOutputter(xxxX);
							//							System.out.println(xmOutc.outputString(doc));									
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
								String key = (String)keys.next();
								String content = (String) ((HashMap)value).get(key);
								org.jdom.Element map = new org.jdom.Element("map");
								map.setAttribute(new org.jdom.Attribute("key", key));
								map.setAttribute(new org.jdom.Attribute("value", content));
								hashmap.addContent(map);
							}																	
							//row.addContent(hashmap);										
						}
						else
						{
							row.setAttribute(name, String.valueOf(value));
						}
						//						String name  = c.getName(); 
						//						String type  = c.getType();
						//						Object value = c.getValue();
						//						String ref	 = c.getReferenceid();
						//						if (ref == null)
						//							ref = "";
						//						org.jdom.Element column = new org.jdom.Element("column");
						//						column.setAttribute(new org.jdom.Attribute("name", name));		
						//						column.setAttribute(new org.jdom.Attribute("type", type));
						//						if (type.equals("HashMap"))
						//						{
						//							org.jdom.Element hashmap = new org.jdom.Element("hashmap");
						//							Iterator keys = ((HashMap)value).keySet().iterator();
						//							while (keys.hasNext())
						//							{
						//								String key = (String)keys.next();
						//								String content = (String) ((HashMap)value).get(key);
						//								org.jdom.Element map = new org.jdom.Element("map");
						//								map.setAttribute(new org.jdom.Attribute("key", key));
						//								map.setAttribute(new org.jdom.Attribute("value", content));
						//								hashmap.addContent(map);
						//							}																	
						//							column.addContent(hashmap);
						//						}																
						//						else
						//						{
						//							column.setAttribute(new org.jdom.Attribute("value", String.valueOf(value)));
						//						}
						//						column.setAttribute(new org.jdom.Attribute("referenceid", ref));						
					}
					table.addContent(row);
				}
			}
		}
		///
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
			log.log(Level.SEVERE, "can't connect to database");
			return;
		}
		//		//
		String filecostelement = "/home/americas/model/m_storageelement.xml";
		//		List<PO> poslines = new Query(Env.getCtx(), X_M_CostElement.Table_Name, "", null).list();
		//		try {
		//			Util.writeToFile(ReplicationEngine.getInstance().decode(poslines), filecostelement);
		//		}		
		//		catch (Exception e)
		//		{
		//			e.printStackTrace();
		//		}

		//  ahora procesamos el stream
		File file = new File(filecostelement);
		try {
			ReplicationEngine.getInstance().encode(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
