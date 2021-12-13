package org.xendra.messages;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.compiere.model.MClient;
import org.compiere.model.MColumn;
import org.compiere.model.MInvoice;
import org.compiere.model.MMovement;
import org.compiere.model.MMovementLine;
import org.compiere.model.MOrg;
import org.compiere.model.MRefTable;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_AD_Ref_Table;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.mvel2.ParserContext;
import org.mvel2.templates.CompiledTemplate;
import org.mvel2.templates.TemplateCompiler;
import org.mvel2.templates.TemplateRuntime;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xendra.Constants;
import org.xendra.exceptions.XendraException;
import org.xendra.xendrian.FormatMessage;

public class MessageFactory {

	HashMap hashdoc	= new HashMap();
	private String identifier = "";
	List<HashMap> hashvalue = new ArrayList<HashMap>();
	List<HashMap> hashname = new ArrayList<HashMap>();
	private MessageFactory instance;
	private static TransformerFactory tFactory = TransformerFactory.newInstance();

	public MessageFactory getInstance() {
		if (instance == null) {
			instance = new MessageFactory();
		}
		return instance;
	}
	/**
	 * @param args
	 */
	public String get(String name) {
		return "value";
	}
	public void setField(String groupid, String columnName, Integer ii) {
		AddProperty(groupid, columnName, ii);		
	}
	
	public void setField(String groupid, String columnName, Object ii) {
		AddProperty(groupid, columnName, ii);
	}
	
	public static void main(String[] args) {
		try {
			org.compiere.Xendra.startupEnvironment(false);
			MessageFactory mvel = new MessageFactory();
			MMovement m = new Query(Env.getCtx(), MMovement.Table_Name, "IsActive = 'Y' ", null)
			.first();
			mvel.sendMessage(m, "/queue/movement");
			//setHeader(m);
			List<MMovementLine> lines = new Query(Env.getCtx(), MMovementLine.Table_Name, "M_Movement_ID = ?", null)
			.setParameters(m.getM_Movement_ID()).list();			
			Map<String, Object> valueMap = new HashMap<String, Object>();
			FormatMessage s = new FormatMessage(Constants.TRANSFERMESSAGE);
			valueMap.put("header", m);
			valueMap.put("lines", lines);
			valueMap.put("doc", mvel);
			X_AD_MessageFormat message = null;
			String sOut = readTemplate(message, valueMap);		
			System.out.println(sOut);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void sendMessage(PO po, String string) {
		
		
	}
	public void setIdentifier(String id) {
		identifier = id;
	}
	
	public String getOpen(Object... params) {
		String result = get(params);
		result = result.replace("/>", ">");
		return result;
	}

	public String getClose(String tag) {		
		String result = String.format("</%s>", tag);
		return result;
	}
	
	public String getAD_Client_ID() {
		int AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());
		MClient c = MClient.get(Env.getCtx(), AD_Client_ID);
		return c.getValue();
	}

	public String getAD_Org_ID() {
		int AD_Org_ID = Env.getAD_Org_ID(Env.getCtx());
		MOrg o = MOrg.get(Env.getCtx(), AD_Org_ID);
		return o.getValue();
	}
	
	public String get(Object... params) {
		String groupid="";
		//Integer seq = 0;
		PO po = null;
		try {
			// PO 
			for(Object para:params) {
				if (para instanceof PO) {
					po = (PO) para;
				//} else if ( para instanceof Integer ) {
				//	seq = (Integer) para;
				} else if ( para instanceof String) {					
					String command = (String) para;
					if (!command.equals("allfields"))
						groupid = command;
					//else if (command.equals("Line"))
					//	groupid = command;
				}					 		
			}		
			if (po == null) {
				throw new Exception("Business Object not specified");
			}
			//if (seq > 0) {
			//	groupid = String.format("%s%s", groupid, seq);
			//}
			for(Object para:params) {
				if (para.equals("allfields")) {
					setAllFields(groupid, po);
				}
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getMessage(groupid);
	}
	public void setAllFields(String groupid, PO po) throws Exception {
		Class<?> clazz = Class.forName("org.compiere.model.persistence.X_"+po.get_TableName());
		Field[] fields = clazz.getDeclaredFields();	
		for (Field field:fields) {					
			if (field.getName().startsWith("COLUMNNAME_"))
			{
				String columnName = field.getName().substring("COLUMNNAME_".length());
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
									Constructor<?> constructor = subclazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
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
							Constructor<?> constructor = subclazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
							PO pox = (PO)constructor.newInstance(new Object[] {Env.getCtx(), ii, po.get_TrxName()});
							if (pox.get_ID() > 0)
							{
								ii = (String) pox.get_Value(X_AD_Table.COLUMNNAME_Identifier); 												
							}									
						}
						AddProperty(groupid, columnName, ii);
						//header = header + String.format("%s=%s", columnName, ii);
					}							
				}
				else if (ii != null) 
				{
					AddProperty(groupid, columnName, ii);
					//header = header + String.format("%s=%s", columnName, ii);
				}						
			}
		}
	}

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

	public String getMessage(String keydoc) {
		String msg = "";
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			//Element doc = document.createElement("doc");
			//document.appendChild(doc);
			//for ( Iterator itdoc = (Iterator) hashdoc.keySet().iterator(); itdoc.hasNext(); )
			//{				
			//String keydoc = (String) itdoc.next();
			Element group = document.createElement(keydoc);
			document.appendChild(group);
			for (HashMap map : hashvalue) {
				//if (map.get(identifier).equals(keydoc)) {
				if (map.get(identifier).equals(keydoc)) {
					int elements = 0;
					for ( Iterator it = (Iterator) map.keySet().iterator(); it.hasNext(); )
					{						
						String key = (String) it.next();  
						if (key.equals(identifier))
							continue;
						if (key.equals(keydoc))
							continue;												
						if (setAttribute(group, keydoc, key))
							elements++;
						else
							System.out.println("error en"+key);
					}
					//doc.setAttribute(keydoc, (String) hashdoc.get(keydoc));
					//group.setAttribute(keydoc, (String) hashdoc.get(keydoc));
				}					
			}
			//doc.appendChild(group);
			//group.appendChild(group);
			//}		
			DOMSource source = new DOMSource(document);		
			StringWriter writer = new StringWriter();		
			StreamResult result = new StreamResult(writer);
			writer = new StringWriter();
			result = new StreamResult(writer);
			Transformer transformer = tFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			//transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");		
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

//	public static String readTemplate(X_AD_MessageFormat fileName) throws IOException {
//		
//
//		InputStream tStream = MVEL2.class.getResourceAsStream(fileName);
//		Scanner tScanner = new Scanner(tStream);
//		String template = tScanner.useDelimiter("\\Z").next();
//		tScanner.close();
//		tStream.close();
//
//		return template;
//	}

	public static String readTemplate(X_AD_MessageFormat format, Map<String, Object> params) throws IOException {
		// Read the template file
		//String template = readTemplate(fileName);
		String template = format.getFormat();

		ParserContext context = new ParserContext();
		context.setDebugSymbols( true );
		context.addImport("System",System.class);

		// Render the template
		CompiledTemplate t = TemplateCompiler.compileTemplate(template);		
		// Execute the template with parameters, as needed
		if (params.isEmpty()) {
			template = (String) TemplateRuntime.execute(t);
		}
		else {
			template = (String) TemplateRuntime.execute(t, params);
		}
		return template;
	}
}
