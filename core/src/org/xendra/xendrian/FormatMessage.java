package org.xendra.xendrian;

import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

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
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xendra.db.Querys;
import org.xendra.exceptions.XendraException;

public class FormatMessage implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7337491049301453537L;
	String identifier = "";
	public FormatMessage(String identifier)
	{
		this.identifier = identifier;
	}
	HashMap hashdoc	= new HashMap();
	List<HashMap> hashvalue = new ArrayList<HashMap>();
	List<HashMap> hashname = new ArrayList<HashMap>();
	
	private static TransformerFactory tFactory = TransformerFactory.newInstance();
	
	public void AddProperty(String element, String id, Object value) {
		AddProperty(element, id, value, "");
	}	
	public void AddProperty(String groupid, String id, Object value, String name) {
		boolean createMapvalue = true;
		boolean createMapName = true;
		for (HashMap map : hashvalue) {
			//if (map.get(Constants.SALESMESSAGE).equals(element)) {
			if (map.get(identifier).equals(groupid)) {
				createMapvalue = false;
				if (map.containsKey(id))
					System.out.println("overwrite" + id);
				map.put(id, value);
			}
		}
		if (createMapvalue) {
			HashMap map = new HashMap();
			//map.put(Constants.SALESMESSAGE, element);
			map.put(identifier, groupid);
			map.put(id, value);
			hashvalue.add(map);
		}
		if (name.length() > 0) {
			for (HashMap map : hashname) {
				//if (map.get(Constants.SALESMESSAGE).equals(element)) {
				if (map.get(identifier).equals(groupid)) {
					createMapName = false;
					if (map.containsKey(id))
						System.out.println("overwrite" + id);
					map.put(id, name);
				}
			}
			if (createMapName) {
				HashMap map = new HashMap();
				//map.put(Constants.SALESMESSAGE, element);
				map.put(identifier, groupid);
				map.put(id, name);
				hashname.add(map);
			}
		}
	}
	
	public void AddDocumentPart(String docpart, String TableName) {
		//boolean exists = false;
		if (hashdoc.containsKey(docpart)) 			
			System.out.println("overwrite" + docpart);
		hashdoc.put(docpart, TableName);		
//		for (HashMap part:hashdoc)
//		{
//			if (part.equals(docpart))
//			{
//				exists = true;
//				break;
//			}
//		}
//		if (!exists)
//		{
//			hashdoc.add(docpart);
//		}
	}

	public String getMessage() {
		String msg = "";
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			Element doc = document.createElement("doc");
			document.appendChild(doc);
			//document = s.buildMessage(document);			
			//for (String groupid:hashdoc)
			for ( Iterator itdoc = (Iterator) hashdoc.keySet().iterator(); itdoc.hasNext(); )
			{				
				String keydoc = (String) itdoc.next();
				Element group = document.createElement(keydoc);
				for (HashMap map : hashvalue) {
					if (map.get(identifier).equals(keydoc)) {
						int elements = 0;
						for ( Iterator it = (Iterator) map.keySet().iterator(); it.hasNext(); )
						{						
							String key = (String) it.next();  
							if (key.equals(identifier))
								continue;												
							if (setAttribute(group, keydoc, key))
								elements++;
							else
								System.out.println("error en"+key);
						}
						doc.setAttribute(keydoc, (String) hashdoc.get(keydoc));
					}					
				}
				doc.appendChild(group);
			}		
			DOMSource source = new DOMSource(document);		
			StringWriter writer = new StringWriter();		
			StreamResult result = new StreamResult(writer);
			writer = new StringWriter();
			result = new StreamResult(writer);
			Transformer transformer = tFactory.newTransformer();
			transformer.setOutputProperty(
					javax.xml.transform.OutputKeys.INDENT, "yes");
			transformer.transform(source, result);
			StringBuffer txtxml = writer.getBuffer();
			msg = txtxml.toString();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return msg;
	}
	
//	public Document buildMessage(Document document) {							
//		for (String groupid:hashdoc)
//		{
//			Element group = document.createElement(groupid);
//			for (HashMap map : hashvalue) {
//				if (map.get(identifier).equals(groupid)) {
//					try {
//						for ( Iterator it = (Iterator) map.keySet().iterator(); it.hasNext(); )
//						{						
//							String key = (String) it.next();  
//							if (key.equals(identifier))
//								continue;							
//							setAttribute(group, groupid, key);
//						}
//					}
//					catch (Exception e)
//					{
//						e.printStackTrace();
//					}								
//				}
//			}
//			document.appendChild(group);
//		}
//		return document;
//	}




	public Boolean setAttribute(Element element, String group, String id) {
		return Util.setattr(element, id, getProperty(group, id));		
		//element.setAttribute(id, getProperty(group, id));
	}

	public Object getProperty(String element, String id, boolean getName) {
		Object value = null;
		if (getName) {
			for (HashMap map : hashname) {
				//if (map.get(Constants.SALESMESSAGE).equals(element)) {
				if (map.get(identifier).equals(element)) {
					if (map.containsKey(id)) {
						value = map.get(id);
						break;
					}
				}
			}
		}
		//if (value.length() == 0)
		if (value == null)
			value = getProperty(element, id);
		return value;
	}

	public Object getProperty(String element, String id) {
		Object value = null;
		for (HashMap map : hashvalue) {
			//if (map.get(Constants.SALESMESSAGE).equals(element)) {
			if (map.get(identifier).equals(element)) {
				if (map.containsKey(id)) {					
					value = map.get(id);
					break;
				}
			}
		}
		return value;
	}
	
	public void addProperties(String groupid, PO po) {
		try {
			AddDocumentPart(groupid, po.get_TableName());
			Vector vector = new Vector();
			Class<?> clazz = Class.forName("org.compiere.model.persistence.X_"+po.get_TableName());
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
									X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID=?", po.get_TrxName())
										.setParameters(column.getAD_Reference_Value_ID())
										.first();
									if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
									{

										MRefTable reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID=?", null)
										.setParameters(reference.getAD_Reference_ID())
										.first();
										if (reftable != null)
										{
											MTable table = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());							
											Class<?> subclazz = Class.forName("org.compiere.model.persistence.X_"+table.getTableName());
											constructor = subclazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
											PO pox = (PO)constructor.newInstance(new Object[] {Env.getCtx(), ii, po.get_TrxName()});
											if (pox.get_ID() > 0)
											{																												 
												ii = (String) pox.get_Value(X_AD_Table.COLUMNNAME_Identifier);
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
												ii = rflist.getValue();
											}
										}
									}									
								}
								else if (column.getAD_Reference_ID() == DisplayType.TableDir || 
										column.getAD_Reference_ID() == DisplayType.Location ||
										column.getAD_Reference_ID() == DisplayType.Search ||
										column.getAD_Reference_ID() == DisplayType.Locator )								 
								{
									String tableName = columnName.substring(0, columnName.indexOf("_ID"));
									MTable table = MTable.get(Env.getCtx(), tableName);
									if (table == null)
										throw new XendraException (" table "+tableName+ " no encontrado llamado por "+po.toString());
									Class<?> subclazz = Class.forName("org.compiere.model.persistence.X_"+table.getTableName());								
									constructor = subclazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
									PO pox = (PO)constructor.newInstance(new Object[] {Env.getCtx(), ii, po.get_TrxName()});
									if (pox.get_ID() > 0)
									{
										ii = (String) pox.get_Value(X_AD_Table.COLUMNNAME_Identifier); 												
									}									
								}
								AddProperty(groupid, columnName, ii);
							}							
						}
						if (ii != null) 
						{
							AddProperty(groupid, columnName, ii);
						}						
					}
				}
			}	
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		}
	}
}
