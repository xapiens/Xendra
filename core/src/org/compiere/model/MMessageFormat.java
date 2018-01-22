package org.compiere.model;

import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_AD_Ref_Table;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.mvel2.MVEL;
import org.mvel2.ParserContext;
import org.mvel2.ast.ASTNode;
import org.mvel2.integration.Interceptor;
import org.mvel2.integration.VariableResolverFactory;
import org.mvel2.templates.CompiledTemplate;
import org.mvel2.templates.TemplateCompiler;
import org.mvel2.templates.TemplateRuntime;
import static org.mvel2.MVEL.executeExpression;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xendra.exceptions.XendraException;
import org.xendra.messages.MessageClass;
import org.xendra.messages.MessageCondition;
import org.xendra.messages.MessageField;
import org.xendra.objectview.IRow;
import org.xendra.objectview.RowBase;


public class MMessageFormat extends X_AD_MessageFormat {

	HashMap hashdoc	= new HashMap();
	private static String identifier = "";

	List<String> areas = new ArrayList<String>();
	List<HashMap> hashvalue = new ArrayList<HashMap>();
	List<HashMap> hashname = new ArrayList<HashMap>();

	HashMap<String, MessageField> fields = new HashMap<String, MessageField>();
	HashMap<String, MessageCondition> conditions = new HashMap<String, MessageCondition>();
	HashMap<String, MessageClass> classes = new HashMap<String, MessageClass>();
	HashMap<String, String> values = new HashMap<String, String>();
	private Map<String, Object> m_params;	

	private static TransformerFactory tFactory = TransformerFactory.newInstance();

	public MMessageFormat(Properties ctx, int AD_MessageFormat_ID,
			String trxName) {
		super(ctx, AD_MessageFormat_ID, trxName);
	}

	public MMessageFormat(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	private String extract(String fieldvalue, String starttoken) {		
		int start = fieldvalue.indexOf(starttoken);
		String value = "";
		StringTokenizer st = new StringTokenizer(fieldvalue.substring(start), "=");
		while (st.hasMoreTokens()) {
			st.nextElement();
			if (!st.hasMoreTokens())
				value = "";
			else
				value = st.nextToken();							
		}
		return value;		
	}

	private String extract(String fieldvalue, String starttoken, String endtoken) {
		int start = fieldvalue.indexOf(starttoken);
		int end = fieldvalue.indexOf(endtoken);
		String value = "";
		StringTokenizer st = new StringTokenizer(fieldvalue.substring(start, end), "=");
		while (st.hasMoreTokens()) {
			st.nextElement();
			if (!st.hasMoreTokens())
				value = "";
			else
				value = st.nextToken();							
		}
		return value;
	}	

	public String build() {
		String error = "";
		try {
			HashMap prop = getProperties();
			Iterator it = prop.keySet().iterator();
			while (it.hasNext()) {
				final String keyname = (String) it.next();
				if (keyname.startsWith("CONDITION")) {
					String fieldname = keyname.substring("CONDITION".length()+1);
					String fieldvalue = (String) prop.get(keyname);
					MessageCondition condition = new MessageCondition();
					condition.setName(fieldname);
					condition.setCondition(fieldvalue);
					conditions.put(fieldname, condition);
				}
				else if (keyname.startsWith("CLASS")) {
					String classname = keyname.substring("CLASS".length()+1);
					String classvalue = (String) prop.get(keyname);
					String varname = "";
					String clazzname = "";
					String methodname = "";
					if (classvalue != null) {
						if (classvalue.indexOf("varname") >= 0) {
							String start = "varname=";
							String end = ", clazzname=";
							varname = extract(classvalue, start, end );
							classvalue = classvalue.substring(classvalue.indexOf(end)+1);														
						}
						if (classvalue.indexOf("clazzname=") >= 0) {
							String start = "clazzname=";
							String end = ", methodname=";
							clazzname = extract(classvalue, start, end );
							classvalue = classvalue.substring(classvalue.indexOf(end)+1);							
						}
						if (classvalue.indexOf("methodname=") >= 0) {
							String start = "methodname=";
							methodname = extract(classvalue, start);													
						}
						MessageClass messageclass = new MessageClass();						
						messageclass.setName(varname);
						messageclass.setClazzname(clazzname);
						messageclass.setMethodname(methodname);
						classes.put(classname, messageclass);						
					}
				}
				else if (keyname.startsWith("FIELD")) {
					String fieldvalue = (String) prop.get(keyname);
					String fieldname = keyname.substring("FIELD".length()+1);
					String area = "";
					String value = "";
					String printname = "";
					String condition = "";
					if (fieldvalue != null) {
						if (fieldvalue.indexOf("area=") >= 0) {						
							String start = "area=";
							String end = ", value=";
							area = extract(fieldvalue, start, end );
							fieldvalue = fieldvalue.substring(fieldvalue.indexOf(end)+1);
						}
						if (fieldvalue.indexOf("value=") >= 0) {
							String start = "value=";
							String end = ", printname=";
							value = extract(fieldvalue, start, end);
							fieldvalue = fieldvalue.substring(fieldvalue.indexOf(end)+1);
						}
						if (fieldvalue.indexOf("printname=") >= 0) {
							String start = "printname=";
							String end = ", condition=";
							printname = extract(fieldvalue, start, end);
							fieldvalue = fieldvalue.substring(fieldvalue.indexOf(end)+1);
						}
						if (fieldvalue.indexOf("condition=") >= 0) {
							String start = "condition=";
							condition = extract(fieldvalue, start);						
						}
						MessageField field = new MessageField();
						if (!areas.contains(area))
							areas.add(area);
						field.setArea(area);
						field.setValue(value);
						field.setPrintname(printname);
						field.setCondition(condition);
						field.setName(fieldname);
						fields.put(fieldname, field);
					}
				}			
			}
		} catch (Exception e) {			
			error = e.getMessage();
		}	
		return error;
	}

	public String readTemplate(Map<String, Object> params) {
		Iterator itclasses = classes.keySet().iterator();
		while (itclasses.hasNext()) {
			String key = (String) itclasses.next();
			MessageClass cls = (MessageClass) classes.get(key);
			String name = cls.getName();
			String clazzname = cls.getClazzname();
			String methodname = cls.getMethodname();
			Object ref = null;
			if (cls.getClazzname().equals(this.getClass().getName())) 
				ref = this;
			else {
				try {
					Class<?> clazz = Class.forName(cls.getClazzname());
					ref = clazz;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (methodname.length() > 0) {
				Method method = null;
				try {			
					method = ref.getClass().getMethod(methodname, null);
					ref = method;
				} catch (NoSuchMethodException nsme) {
					
				}				
			}
			params.put(name, ref);
		}		
//		if (!params.containsKey("doc")) {
//			params.put("doc", this);
//		}
//		if (!params.containsKey("Env")) {
//			params.put("Env", Env.class);
//		}
//		if (!params.containsKey("MBPartner")) {
//			params.put("MBPartner", MBPartner.class);
//		}
//		if (!params.containsKey("Util")) {
//			params.put("Util", Util.class);
//		}		
		String template = getFormat();

		m_params = params;

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

	/**
	 * @param args
	 */
	public String get(String name) {
		return "value";
	}

	public void setField(String groupid, String columnName, Object ii) {
		AddProperty(groupid, columnName, ii);
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

	public String getClientValue() {
		int AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());
		MClient c = MClient.get(Env.getCtx(), AD_Client_ID);
		return c.getValue();
	}

	public String getOrgValue() {
		int AD_Org_ID = Env.getAD_Org_ID(Env.getCtx());
		MOrg o = MOrg.get(Env.getCtx(), AD_Org_ID);
		return o.getValue();
	}

	public String get(Object... params) {
		String groupid="";
		IRow row = null;
		//Integer seq = 0;		
		PO po = null;
		try {
			// PO 
			for(Object para:params) {
				if (para instanceof PO) 
					po = (PO) para;
				if (para instanceof RowBase) {
					row = (RowBase) para;
					m_params.put("row", row);					
				}
				//} else if ( para instanceof Integer ) {
				//	seq = (Integer) para;
				//} else 
				if ( para instanceof String) {					
					String command = (String) para;
					if (areas.contains(command))
						groupid = command;
				}					 		
			}		
//			for(Object para:params) {
//				if (para.equals("allfields") && po != null) {
//					setAllFields(po, groupid);
//				}
//				if (para.equals("allfields") && row != null) {
//					setAllFields(row, groupid);
//				}				
//			}
			for(Object para:params) {
				if (para.equals("allfields")) {
					setAllFields(groupid);
				}
			}					
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return getMessage(groupid);
	}

//	public void setAllFields(IRow row, String groupid) throws Exception {
//		Field[] fields = row.getClass().getDeclaredFields();;
//		for (Field field:fields) {
//			if (Modifier.isPublic(field.getModifiers())) {
//				Object value = field.get(row);
//				if (value != null) {
//					AddProperty(groupid, field.getName(), value);
//				}				
//			}
//		}
//	}
	
//	public void setAllFields(PO po, String groupid) throws Exception {
//		Iterator it = fields.keySet().iterator();
//		while (it.hasNext()) {
//			String key = (String) it.next();
//			MessageField field = (MessageField) fields.get(key);
//			if (field.getArea().equals(groupid)) {
//				if (evaluateCondition(field)) {
//					Object value = getValue(po, field);
//					if (value != null) {
//						AddProperty(groupid, field.getName(), value);
//					}
//				}
//			}
//		}
//	}	

	public void setAllFields(String groupid) throws Exception {
		Iterator it = fields.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			MessageField field = (MessageField) fields.get(key);
			if (field.getArea().equals(groupid)) {
				if (evaluateCondition(field)) {
					Object value = getValue(field);
					if (value != null) {
						AddProperty(groupid, field.getName(), value);
					}
				}
			}
		}
	}	
	
	Interceptor myInterceptor = new Interceptor() {
		public int doBefore(ASTNode node, VariableResolverFactory factory) {
			System.out.println("before!");
			return 0;
		}

		@Override
		public int doAfter(Object exitStackValue, ASTNode node,
				VariableResolverFactory factory) {
			System.out.println("after!");
			return 0;
		}
	};

//	private Object getValue(PO po, MessageField field) {
//		if (po != null) {
//			m_params.put(field.getArea(), po);
//		}
//		ParserContext context = new ParserContext();
//		Map<String, Interceptor> myInterceptors = new HashMap<String, Interceptor>();		
//		myInterceptors.put("Foo", myInterceptor);
//		context.setInterceptors(myInterceptors);
//		// Compile the expression
//		//String exp = "String.valueOf(header.getC_Contact_ID())";
//		System.out.println(field.getValue());
//		if (field.getValue().equals("row.getQtyBonus().toString()"))
//			System.out.println("X");
//		Serializable ex = MVEL.compileExpression(field.getValue(), context);
//		//Serializable ex = MVEL.compileExpression(exp, context);
//		Object result = null;
//		try {
//			result = executeExpression(ex, m_params);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}

	private Object getValue(MessageField field) {
		//if (po != null) {
		//	m_params.put(field.getArea(), po);
		//}
		ParserContext context = new ParserContext();
		Map<String, Interceptor> myInterceptors = new HashMap<String, Interceptor>();		
		myInterceptors.put("Foo", myInterceptor);
		context.setInterceptors(myInterceptors);
		// Compile the expression
		//String exp = "String.valueOf(header.getC_Contact_ID())";
		System.out.println(field.getValue());
		if (field.getValue().equals("row.getQtyBonus().toString()"))
			System.out.println("X");
		Serializable ex = MVEL.compileExpression(field.getValue(), context);
		//Serializable ex = MVEL.compileExpression(exp, context);
		Object result = null;
		try {
			result = executeExpression(ex, m_params);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String getid(String tableName, Integer uid) {
		String id = "";
		PO po = new Query(Env.getCtx(), tableName, String.format("%s_ID = ?", tableName), null).setParameters(uid).first();
		if (po != null) {
			if (po.get_ColumnIndex(X_AD_Client.COLUMNNAME_Value) > 0) {
				id = (String) po.get_Value(X_AD_Client.COLUMNNAME_Value);
				if (id == null)
					id = "NSD";
			}
			else if (po.get_ColumnIndex(X_AD_Client.COLUMNNAME_Identifier) > 0) {
				id = (String) po.get_Value(X_AD_Client.COLUMNNAME_Identifier);				
				if (id == null)
					id = "NSD";
			}			
		}
		return id;
	}	

	public String getname(String tableName, int uid) {
		String name = "";
		PO po = new Query(Env.getCtx(), tableName, String.format("%s_ID = ?", tableName), null).setParameters(uid).first();
		if (po != null) {
			if (po.get_ColumnIndex(X_AD_Client.COLUMNNAME_Name) > 0) {
				name = (String) po.get_Value(X_AD_Client.COLUMNNAME_Name);
			}			
		}
		return name;
	}

	private boolean evaluateCondition(MessageField field) {
		String condition = field.getCondition();
		return true;
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
	public void setValue(String name, String value) {		
		values.put(name, value);
	}
	public String getValue(String name) {
		String value = values.get(name);
		if (value == null)
			value = "";
		return value;
	}
}
