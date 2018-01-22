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
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import org.compiere.acct.Fact.Balance;
import org.compiere.model.MColumn;
import org.compiere.model.MRefTable;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_AD_Ref_Table;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xendra.Constants;
import org.xendra.exceptions.XendraException;
import org.xendra.model.sql;

public class oldReplication {
	private static CLogger log = CLogger.getCLogger(ReplicationEngine.class);
	private int m_level = 0;
	/** used by replication */
	private List<Vector> references = new ArrayList<Vector>();
	private List<Vector> items = new ArrayList<Vector>();	

	public String decode(List<PO> records) throws Exception {
		String retval = "";
		for (PO record:records)
		{
			//Class<?> clazz = Class.forName("org.compiere.model.persistence.X_"+record.get_TableName());
			//ReplicationEngine replication = new ReplicationEngine();
			//String error = ReplicationEngine.getInstance().processtable(clazz, record, 0);
			String error = ReplicationEngine.getInstance().processtable(record, 0);
			if (error.length() == 0)
				retval += ReplicationEngine.getInstance().build();
			else
				System.out.println(String.format("ERROR : %s", error));
		}
		retval = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+"<stream>\n"+retval+"</stream>";
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
			} catch (JDOMException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}			
			//Document doc = ExtensionXMLParser.retrieveDocument(buf);			
			error = encode(doc);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return error;
	}
	
	private String encode(Document doc) throws Exception {
		String error = "";
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
							List<Element> columns = table.getChildren("column");					
							String tn = table.getAttribute("name").getValue();
							Attribute attr = table.getAttribute("level");
							int level = attr.getIntValue();
							if (level != i)
								continue;
							System.out.println(table.getAttribute("name"));
							String identifier = table.getAttribute( X_AD_Table.COLUMNNAME_Identifier).getValue();										
							PO poi = null;
							try {
								poi = new Query(Env.getCtx(), tn, "Identifier = ?", null).setParameters(identifier).first();
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
									// antes de crear la tabla , busquemos por los constraints de la misma.
									PreparedStatement pstmt = null;
									ResultSet rs = null;
									try
									{
										pstmt = DB.prepareStatement(sql.GETINDEXBYTABLE, null);
										pstmt.setString(1, tn.toLowerCase());
										rs = pstmt.executeQuery();
										String where = "";
										List<Object> parameters = new ArrayList<Object>();
										while (rs.next())
										{
											String column_names = rs.getString("column_names");
											String[] keys = column_names.split(",");															
											for (String key:keys)
											{
												for (Element column:columns)
												{
													String name = column.getAttributeValue("name");		
													String type  = column.getAttributeValue("type");
													Object value = column.getAttributeValue("value");
													String referenceid = column.getAttributeValue("referenceid");
													if (name.equalsIgnoreCase(key.trim()))
													{
														if (type.equals(X_AD_Table.COLUMNNAME_Identifier))
														{
															PO po = new Query(Env.getCtx(), name.substring(0, name.indexOf("_ID")), "identifier = ?", null)
															.setParameters((String)value).first();
															if (po != null)
															{
																value = po.get_ID();
															}
														}
														else if (type.equals(X_AD_Reference.COLUMNNAME_AD_Reference_ID))
														{
															X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "identifier = ?", null)
															.setParameters(referenceid).first();
															if (reference != null)
															{
																if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
																{
																	X_AD_Ref_Table reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID = ?", null)
																	.setParameters(reference.getAD_Reference_ID()).first();
																	if (reftable != null)
																	{
																		MTable adreftable = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
																		PO po = new Query(Env.getCtx(), adreftable.getTableName(), "identifier = ?", null)
																		.setParameters(value).first();
																		if (po != null)
																		{
																			value = po.get_ID();
																		}															
																	}
																}
																else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
																{

																}
															}
														}
														if (where.length() > 0)
															where += " AND ";
														where += key + " = ? ";
														parameters.add(value); 
													}
												}									 
											}
										}
										if (where != null && where.length() > 0)
										{
											poi = new Query(Env.getCtx(), tn, where, null).setParameters(parameters).first();
											if (poi != null)
											{
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
									for (Element column:columns) 
									{			
										String name = column.getAttribute("name").getValue();				
										System.out.println(name);
										String type  = column.getAttribute("type").getValue();
										Object value = null;
										if (column.getAttribute("value") != null)
										{
											value = column.getAttribute("value").getValue();										
										}
										String referenceid = column.getAttributeValue("referenceid");
										if (name.equalsIgnoreCase(tn.concat("_ID")))
										{
											// don't be considered, because we don't care the id local. 
											// this only happen when the Field type ID is not marked like ID in AD
											// do nothing
										}
										else if (type.equals(X_AD_Table.COLUMNNAME_Identifier))
										{
											String tableName = name.substring(0, name.indexOf("_ID"));								
											PO poref = (PO) new Query(Env.getCtx(), tableName, "identifier = ?", null)
											.setParameters(String.valueOf(value)).first();
											if (poref != null)
											{
												Integer IDref = poref.get_ID();
												po.set_ValueOfColumn(name, IDref);
											}
										}
										else if (type.equals("HashMap"))
										{
											HashMap newmap = new HashMap();
											Element hashmap = column.getChild("hashmap");
											List<Element> maps = hashmap.getChildren("map");
											for (Element map:maps)
											{
												String key = map.getAttributeValue("key");
												String content = map.getAttributeValue("value");
												newmap.put(key, content);												
											}							
											po.set_ValueOfColumn(name, newmap);
										}
										else if (type.equals(X_AD_Reference.COLUMNNAME_AD_Reference_ID))
										{
											X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "identifier = ?", null)
											.setParameters(referenceid).first();
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
															value = poref.get_ID();
															po.set_ValueOfColumn(name, Util.convertObject(DisplayType.Integer, value));
														}															
													}
												}
												else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
												{
													
												}
											}
										}
//										else
//										{								
//											po.set_ValueOfColumn(name, Util.convertObject(type, value));
//										}
									}												
									if (!po.save())
									{								
										error += "no se pudo grabar "+po.get_TableName();										
									}
								}
							}
						}
					}						
				}
			}			
		}
		return error;
	}

	public String processtable(Class<?> clazz, PO po, int level) throws Exception {
		String error = "";
		level ++;		
		if ( level > m_level )
			m_level = level;
		//
		String Identifier = "";
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
			error = po.get_TableName()+" identifier empty ";
			return error;			
		}
		Vector vector = new Vector();
		vector.add(X_AD_Table.COLUMNNAME_TableName);
		vector.add(po.get_TableName());
		System.out.println(po.get_TableName());
		vector.add(level);					
		vector.add(X_AD_Table.COLUMNNAME_AD_Table_ID);		
		vector.add(Identifier);			
		vector.add(po.get_ID());
		items.add(vector);			
		Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
		String[] KeyColumn = po.get_KeyColumns();			
		if ( KeyColumn.length > 0 )
		{
			String ColumnKeyName =  KeyColumn[0];
			Field[] fields = clazz.getDeclaredFields();
			for (int i = 0; i < fields.length; i++)
			{
				String field = fields[i].getName();
				if (field.startsWith("COLUMNNAME_"))
				{
					String columnName = field.substring("COLUMNNAME_".length());
					Object ii = po.get_Value(columnName);
					if (columnName.endsWith("_ID"))
					{						
						if (ii != null && ii instanceof Integer) 
						{								
							if ((Integer) ii == 0)
								continue;							
							int AD_Column_ID = MColumn.getColumn_ID(po.get_TableName(), columnName, po.get_TrxName());
							MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);
							if (column.getAD_Reference_ID() == DisplayType.ID)
							{
								continue;
							}
							if (column.getAD_Reference_Value_ID() > 0 )
							{								
								String IdentifierRef = "";
								String IdentifierValue = "";								
								X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID=?", po.get_TrxName())
									.setParameters(column.getAD_Reference_Value_ID())
									.first();
								if (reference != null)
								{

									for (Vector refer:references)
									{
										HashMap prop = (HashMap) refer.get(0);
										Hashtable props = (Hashtable) prop.get("Definition");
										String name = (String) props.get(X_AD_Table.COLUMNNAME_Identifier); 
										if (name.equals(reference.getIdentifier()))
										{
											IdentifierRef = name;
											break;
										}
									}
									if (IdentifierRef.length() == 0)
									{
										IdentifierRef = reference.getIdentifier();
										
										HashMap prop = new HashMap();

										Hashtable rf = new Hashtable();
										//rf.put(X_AD_Reference.COLUMNNAME_Name, 				reference.get_ValueAsString(X_AD_Reference.COLUMNNAME_Name));
										prop.put(X_AD_Table.COLUMNNAME_Name, reference.getIdentifier());
										rf.put(X_AD_Reference.COLUMNNAME_Description, 		reference.get_ValueAsString(X_AD_Reference.COLUMNNAME_Description));
										rf.put(X_AD_Reference.COLUMNNAME_Help, 				reference.get_ValueAsString(X_AD_Reference.COLUMNNAME_Help));
										rf.put(X_AD_Reference.COLUMNNAME_ValidationType,	reference.get_ValueAsString(X_AD_Reference.COLUMNNAME_ValidationType));
										rf.put(X_AD_Reference.COLUMNNAME_IsOrderByValue, 	reference.get_ValueAsString(X_AD_Reference.COLUMNNAME_IsOrderByValue));
										rf.put(X_AD_Table.COLUMNNAME_Identifier,			reference.get_ValueAsString(X_AD_Table.COLUMNNAME_Identifier));
										
										prop.put("Definition",rf);

										if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
										{

											MRefTable reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID=?", null)
											.setParameters(reference.getAD_Reference_ID())
											.first();
											if (reftable != null)
											{
												MTable table = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());							
												//if (table.isReplicated())
												//{
													boolean goahead = true;				
													String identifier = "";
													for (Vector itemtable:items)
													{
														if (((String) itemtable.get(3)).equals(X_AD_Table.COLUMNNAME_AD_Table_ID))
														{
															String tablename = (String) itemtable.get(1);
															if (tablename.equals(table.getTableName()))
															{
																Integer id = (Integer) itemtable.get(5);
																if (id.equals(ii))
																{
																	goahead = false;
																	//IdentifierRef = (String) itemtable.get(4);
																	IdentifierValue = (String) itemtable.get(4);
																	break;
																}
															}
														}
													}											
													Class<?> subclazz = Class.forName("org.compiere.model.persistence.X_"+table.getTableName());
													constructor = subclazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
													PO pox = (PO)constructor.newInstance(new Object[] {Env.getCtx(), ii, po.get_TrxName()});
													if (pox.get_ID() > 0)
													{																												 
														if (goahead)
														{
															IdentifierValue = (String) pox.get_Value(X_AD_Table.COLUMNNAME_Identifier);
															error = processtable(subclazz, pox, level);
															if (error.length() > 0)
																return error;
														}
													}													
													PreparedStatement pstmt = null;
													ResultSet rs = null;
													try
													{
														pstmt = DB.prepareStatement(sql.VALIDATIONTYPE_TableIdentifierValidation, null);
														pstmt.setInt(1, reference.getAD_Reference_ID());
														rs = pstmt.executeQuery();
														if (rs.next())
														{	
															HashMap map = new HashMap();
															map.put(X_AD_Ref_Table.COLUMNNAME_AD_Key,Util.getvalue(rs, "kcolumnname"));
															map.put(X_AD_Ref_Table.COLUMNNAME_AD_Display,Util.getvalue(rs,"dcolumnName"));															
															map.put(X_AD_Ref_Table.COLUMNNAME_AD_Table_ID,Util.getvalue(rs, "tablename"));															
															map.put(X_AD_Ref_Table.COLUMNNAME_WhereClause,Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_WhereClause));															
															map.put(X_AD_Ref_Table.COLUMNNAME_OrderByClause,Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_OrderByClause));															
															map.put(X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed,Util.getvalue(rs,X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed));															
															map.put(X_AD_Ref_Table.COLUMNNAME_EntityType,Util.getvalue(rs,X_AD_Ref_Table.COLUMNNAME_EntityType));															
															map.put(X_AD_Ref_Table.COLUMNNAME_Identifier,Util.getvalue(rs, X_AD_Ref_Table.COLUMNNAME_Identifier));															
															map.put(X_AD_Ref_Table.COLUMNNAME_Synchronized,rs.getTimestamp(X_AD_Ref_Table.COLUMNNAME_Synchronized));															
															prop.put("Properties", map);

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
												//}
											}										

										}
										else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
										{										
											List<X_AD_Ref_List> reflists = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "AD_Reference_ID = ?", null)
											.setParameters(reference.getAD_Reference_ID()).list();

											HashMap map = new HashMap();

											for (X_AD_Ref_List rflist:reflists)
											{
												Vector content = new Vector();
												content.add(rflist.getName());
												content.add(rflist.getIdentifier());
												content.add(rflist.getSynchronized());
												map.put(rflist.getValue(), content);
												if (rflist.getAD_Ref_List_ID() == (Integer) ii)
												{
													IdentifierValue = rflist.getValue();
												}
											}
											//prop.put(X_AD_Reference.COLUMNNAME_ValidationType, X_AD_Reference.VALIDATIONTYPE_ListValidation);
											prop.put("Properties", map);
										}

										if (prop.get("Properties") != null)
										{
											Vector props = new Vector();
											props.add(prop);
											references.add(props);
										}
									}
									//if (Identifier == null)
									//	Identifier = "";									
									vector = new Vector();
									vector.add(columnName);												
									vector.add(IdentifierValue);
									vector.add(level);
									vector.add(X_AD_Column.COLUMNNAME_AD_Column_ID);
									vector.add(po.get_TableName());
									vector.add(X_AD_Reference.COLUMNNAME_AD_Reference_ID);
									vector.add(IdentifierRef); // identifier
									items.add(vector);																
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
									for (Vector itemtable:items)
									{
										if (((String) itemtable.get(3)).equals(X_AD_Table.COLUMNNAME_AD_Table_ID))
										{
											String tablename = (String) itemtable.get(1);
											if (tablename.equals(tableName))
											{
												Integer id = (Integer) itemtable.get(5);
												if (id.equals(ii))
												{
													goahead = false;
													IdentifierRef = (String) itemtable.get(4);
													break;
												}
											}
										}
									}								
									if (goahead)
									{																
										Class<?> subclazz = Class.forName("org.compiere.model.persistence.X_"+table.getTableName());								
										constructor = subclazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
										PO pox = (PO)constructor.newInstance(new Object[] {Env.getCtx(), ii, po.get_TrxName()});
										if (pox.get_ID() > 0)
										{
											IdentifierRef = (String) pox.get_Value(X_AD_Table.COLUMNNAME_Identifier); 
											if (table.getTableName().startsWith("AD_"))
												goahead = false;
											if (table.getTableName().equals(X_C_DocType.Table_Name))
												goahead = false;						
											if (goahead)
											{
												error = processtable(subclazz, pox, level);
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
								//}
								if (Identifier == null)
									Identifier = "";
								vector = new Vector();
								vector.add(columnName);												
								vector.add(IdentifierRef); // identifier
								vector.add(level);
								vector.add(X_AD_Column.COLUMNNAME_AD_Column_ID);
								vector.add(po.get_TableName());
								vector.add(X_AD_Table.COLUMNNAME_Identifier);
								vector.add(""); // no reference
								items.add(vector);															
							}
						}
					}
					else if (ii != null) // un value plano
					{
						vector = new Vector();
						vector.add(columnName);												
						vector.add(ii);
						vector.add(level);
						vector.add(X_AD_Column.COLUMNNAME_AD_Column_ID);
						vector.add(po.get_TableName());
						vector.add(ii.getClass().getSimpleName());
						vector.add(""); // no reference
						items.add(vector);
					}
				}
			}
			// add isactive
			vector = new Vector();
			vector.add(Constants.COLUMNNAME_IsActive);		
			Object ii = po.get_Value(Constants.COLUMNNAME_IsActive);
			vector.add(ii);
			vector.add(level);
			vector.add(X_AD_Column.COLUMNNAME_AD_Column_ID);
			vector.add(po.get_TableName());
			vector.add(ii.getClass().getSimpleName());
			vector.add(""); // no reference
			items.add(vector);			
		}
		return error;
	}
	
	public String build()
	{
		org.jdom.Element record = new org.jdom.Element("record");
		org.jdom.Document doc = new org.jdom.Document(record);			
		
		doc.setRootElement(record);					
		record.setAttribute(new org.jdom.Attribute("level", String.valueOf(m_level)));
		for (Vector reference:references)
		{
			HashMap hreference = (HashMap) reference.get(0);
			Hashtable Definition = (Hashtable) hreference.get("Definition");
			HashMap Properties = (HashMap) hreference.get("Properties");
			
			org.jdom.Element ref = new org.jdom.Element("reference");
			
			Enumeration<Object> en = Definition.keys();
			while (en.hasMoreElements())
			{
				String key = en.nextElement().toString();				
				ref.setAttribute(new org.jdom.Attribute(key, Definition.get(key).toString()));			
			}
			
			org.jdom.Element props = new org.jdom.Element("Properties");			
			Iterator p = Properties.keySet().iterator();
			while (p.hasNext())
			{
				String key = p.next().toString();
				Object value  = Properties.get(key);
				if  (value == null)
					value = "";
				props.setAttribute(new org.jdom.Attribute(key, value.toString()));				
			}			
			ref.addContent(props);
			doc.getRootElement().addContent(ref);
			
		}
		for (int level = m_level; level >= 0; level--)
		{							
			org.jdom.Element table = null;
			for (Vector itemtable:items)
			{
				int vlevel = (int) itemtable.get(2);														
				if (vlevel == level)				
				{
					if (((String) itemtable.get(3)).equals(X_AD_Table.COLUMNNAME_AD_Table_ID))
					{							
						String tablename = (String) itemtable.get(1);
						table = new org.jdom.Element("table");
						table.setAttribute(new org.jdom.Attribute("name", (String) itemtable.get(1)));
						table.setAttribute(new org.jdom.Attribute("level", String.valueOf(level)));					
						String idtable = (String) itemtable.get(4);
						if (idtable == null)
							idtable = "";
						table.setAttribute(new org.jdom.Attribute(X_AD_Table.COLUMNNAME_Identifier, idtable));
						doc.getRootElement().addContent(table);
						for (Vector item:items)
						{
							int clevel = (int) item.get(2);
							if (clevel == level)
							{
								if (((String) item.get(3)).equals(X_AD_Column.COLUMNNAME_AD_Column_ID) && tablename.equals((String) item.get(4)))
								{
									String name  = (String) item.get(0);
									String type  = (String) item.get(5);
									Object value = item.get(1);
									String ref	 = (String) item.get(6);
									if (ref == null)
										ref = "";
									org.jdom.Element column = new org.jdom.Element("column");
									column.setAttribute(new org.jdom.Attribute("name", name));		
									column.setAttribute(new org.jdom.Attribute("type", type));
									if (type.equals("HashMap"))
									{
										org.jdom.Element hashmap = new org.jdom.Element("hashmap");
										Iterator keys = ((HashMap)value).keySet().iterator();
										while (keys.hasNext())
										{
											String key = (String)keys.next();
											String content = (String) ((HashMap)value).get(key);
											System.out.println("X");
											org.jdom.Element map = new org.jdom.Element("map");
											map.setAttribute(new org.jdom.Attribute("key", key));
											map.setAttribute(new org.jdom.Attribute("value", content));
											hashmap.addContent(map);
										}																	
										column.addContent(hashmap);
									}																
									else
									{
										column.setAttribute(new org.jdom.Attribute("value", String.valueOf(value)));
									}
									column.setAttribute(new org.jdom.Attribute("referenceid", ref));
									table.addContent(column);
								}									
							}
						}
					}
				}							
			}
		}
		///
		Format xx = Format.getPrettyFormat();
		xx.setOmitDeclaration(true);
		XMLOutputter xmOut=new XMLOutputter(xx);
		return xmOut.outputString(doc);		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
//		if (!org.compiere.Xendra.startup(false))
//		{					
//			log.log(Level.SEVERE, "can't connect to database");
//			return;
//		}
//		//
//		List<PO> poslines = new Query(Env.getCtx(), X_C_StorePOSLine.Table_Name, "", null).list();
//		Replication replication = new Replication();
//		try {
//			Util.writeToFile(replication.decode(poslines), "/home/americas/model/c_storeposline.xml");
//		}		
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//		//  ahora procesamos el stream
////		File file = new File("/home/americas/model/storeposlines.xml");
////		try {
////			Replication replication = new Replication();
////			replication.encode(file);
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
	}
}
