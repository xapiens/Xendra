package org.compiere.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import org.columba.core.xml.XMLCoreParser;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Org;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_Locator;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.filter.ElementFilter;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xendra.objectview.IRow;
import org.xendra.objectview.RowBase;
import org.xendra.util.POUtil;


public class MMessageFormat extends X_AD_MessageFormat {
	public final static String FIELD = "FIELD";
	public final static String AREA = "AREA";
	HashMap hashdoc	= new HashMap();
	// areas contains the area and a HashMap of Properties Name and SimpleProperty 
	//  areas
	//	 area 1
	//		SimpleProperty 1
	//		SimpleProperty 2
	//		SimpleProperty 3 
	//	 area 2
	//		SimpleProperty 1
	//		SimpleProperty 2
	//		SimpleProperty 3
	//
	HashMap<String, HashMap<String, SimpleProperty>> areas = new HashMap<String, HashMap<String, SimpleProperty>>();
	//HashMap<String, HashMap> data = new HashMap<String, HashMap>();
	HashMap<String, Integer> sequences = new HashMap<String, Integer>();	
	private List<String> error = new ArrayList<String>();
	private Document document;	
	private Document finaldoc;
	private Element finalroot;
	private String m_message;

	// Analyze
	private HashMap<String, Integer> poareas = new HashMap<String, Integer>();
	private HashMap<Integer, X_AD_Table>  tables = new HashMap<Integer, X_AD_Table>();
	private HashMap<Integer, List<PO>> childs = new HashMap<Integer, List<PO>>();
	private HashMap<Integer, List<String>> childscolumns = new HashMap<Integer, List<String>>();
	private HashMap<Integer, Integer> childsindex = new HashMap<Integer, Integer>();

	public MMessageFormat(Properties ctx, int AD_MessageFormat_ID, String trxName) {
		super(ctx, AD_MessageFormat_ID, trxName);			
	}

	public MMessageFormat(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	public List<String> getError() {
		return error;
	}

	public void setField(String groupid, String columnName, String ii) {
		AddProperty(groupid, columnName, ii);
	}
	public HashMap<String, Integer> searched = new HashMap<String, Integer>();
	
	public List<String> searchvalueline(String name) {		
		List<String> value = new ArrayList<String>();
		org.jdom.Element root = getFinalRoot();
		Iterator<?> itsections = root.getDescendants();
		while (itsections.hasNext()) {
			org.jdom.Element section = (org.jdom.Element) itsections.next();
			List list = section.getAttributes();
			for (int i = 0; i < list.size(); i++) {
				org.jdom.Attribute attr = (org.jdom.Attribute) list.get(i);
				if (attr.getName().equals(name)) {
					Integer sequence = 0;
					if (searched.containsKey(name)) {
						sequence = searched.get(name); 
					}					
					String sequencevalue = section.getAttributeValue("sequence");
					Integer searchvalue = Integer.valueOf(sequencevalue);
					if (sequence.equals(searchvalue)) {
						value.add(attr.getValue());
						sequence++;
						searched.put(name, sequence);
						break;
					}					
				}				
			}
		}		
		return value;		
	}
	public String searchvalue(String name) {
		Boolean found = false;
		String value = "";
		org.jdom.Element root = getFinalRoot();
		Iterator<?> itsections = root.getDescendants();
		while (itsections.hasNext() && !found) {
			org.jdom.Element section = (org.jdom.Element) itsections.next();
			List list = section.getAttributes();
			for (int i = 0; i < list.size(); i++) {
				org.jdom.Attribute attr = (org.jdom.Attribute) list.get(i);
				if (attr.getName().equals(name)) {
					value = attr.getValue();
					break;
				}				
			}
		}		
		return value;
	}

	public List<Element> get(Object... params) {
		String groupid="";
		List<Element> props = new ArrayList<Element>();
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
				}
				if ( para instanceof String) {					
					String command = (String) para;
					groupid = command;
				}					 		
			}		
			if (groupid.length() > 0) {
				//
				org.jdom.Element root = getFinalRoot();
				Iterator<?> filter = root.getDescendants(new ElementFilter(groupid));
				//ElementFilter filter = new org.jdom.filter.ElementFilter();						
				while (filter.hasNext()) {
					org.jdom.Element parent = (org.jdom.Element) filter.next();
					props.add(parent);
					//parent.addContent(e);
				}				
				//
				///HashMap p = areas.get(groupid);
				
			}			
			//for(Object para:params) {
			//	if (para.equals("allfields")) {
			//		if (groupid.length() == 0)
			//			throw new Exception(String.format("allfields invoked but area %s not found", params[0]));
			//	}
			//}					
		} catch (Exception e) {
			error.add(e.getMessage());
		}
		//String msg = "";
		//return msg;
		return props;
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
	public Integer getCounts(String area) {
		Integer val = 0;
		if (sequences.containsKey(area)) {
			val = sequences.get(area);
		}
		return val;
	}
	public void ValidateSection(String... a) throws Exception {
		List<String> sareas = new ArrayList<String>();
		for(String area:a) {
			sareas.add(area);
		}
		String area = sareas.get(sareas.size()-1);
		HashMap<String, SimpleProperty> sectionproperties = null;
		List<String> mandatoryfields = new ArrayList<String>();
		if (areas.containsKey(area)) {
			sectionproperties = areas.get(area);
			//List<org.jdom.Element> sections = new LinkedList<org.jdom.Element>();
			//Iterator<?> it = document.getDescendants(new ElementFilter("section"));			
			//while (it.hasNext()) {
			//	sections.add((org.jdom.Element) it.next());
			//}
			Iterator<?> it = document.getDescendants(new ElementFilter("section"));
			while (it.hasNext()) {
				Element section = (org.jdom.Element) it.next();
			//for (org.jdom.Element section:sections) {
				if (section.getAttributeValue("name").equals(area)) {										
					List list = section.getChildren();
					for (int i = 0; i < list.size(); i++) {
						org.jdom.Element field = (org.jdom.Element) list.get(i);
						if (!field.getName().equals("field"))
							continue;
						String name = field.getAttributeValue("name");
						boolean mandatory = field.getAttributeValue("mandatory").equals("true");
						if (sectionproperties.containsKey(name) && !mandatory) {
							//SimpleProperty p = (SimpleProperty) properties.get(name);
							SimpleProperty p = sectionproperties.get(name);
							mandatory = p.getMandatory();
						}									
						if (mandatory) {
							if (!sectionproperties.containsKey(name)) {
								mandatoryfields.add(name);	
							}
							else if (name.endsWith("_ID")) {
								//SimpleProperty p = (SimpleProperty) properties.get(name);
								SimpleProperty p = sectionproperties.get(name);
								if (p.getValue() == null || p.getValue().length() == 0) {
									mandatoryfields.add(name);
								}
							}
						}
					}
					if (mandatoryfields.size() > 0) {
						String error = "";
						for (String field:mandatoryfields) {
							if (error.length() > 0)
								error = error + ",";
							error = error + field;
						}
						throw new Exception(String.format("campos obligatorios:\n \"%s\" en area \"%s\"", error, area));
					}
					//				
					String error  = "";
					for (String mandatoryfield:mandatoryfields) {
						if (error.length() > 0)
							error = error  + ",";
						error += mandatoryfield;
					}
					if (error.length() > 0) {
						throw new Exception(error);
					}
					// todo ok. entonces pasamos el contenido a lo que sera el doc final
					//properties = areas.get(area);
					if (!sequences.containsKey(area)) {
						sequences.put(area, 0);
					} else {
						sequences.put(area, sequences.get(area)+1);
					}
					Integer seq = sequences.get(area);
					// create the DOM Element of section with value 
					org.jdom.Element e = new org.jdom.Element(area);
					e.setAttribute("sequence",String.valueOf(seq));
					Iterator iter = sectionproperties.keySet().iterator();
					while (iter.hasNext()) {
						String key = (String) iter.next();
						SimpleProperty var = (SimpleProperty) sectionproperties.get(key);
						if (var.getValue() != null)							
							e.setAttribute(key, var.getValue());
						else 
							System.out.println(String.format("%s is null", key));
					}			
					if (sareas.size() > 1) {
						org.jdom.Element root = getFinalRoot();
						Iterator<?> filter = root.getDescendants(new ElementFilter(sareas.get(0)));
						//ElementFilter filter = new org.jdom.filter.ElementFilter();						
						if (filter.hasNext()) {
							org.jdom.Element parent = (org.jdom.Element) filter.next();
							parent.addContent(e);
						}
					} else {
						org.jdom.Element root = getFinalRoot();
						root.addContent(e);
					}	
					break;
				}				
			}		
		}
	}

	public org.jdom.Element getFinalRoot() {
		if (finaldoc == null)
			finaldoc = new org.jdom.Document();
		if (finalroot == null)  {
			finalroot = new org.jdom.Element("message");
			finaldoc.addContent(finalroot);
		}
		return finalroot;
	}	
	public Document getDocument() {
		if (document == null) {
			InputStream s = new ByteArrayInputStream(getFormat().getBytes(StandardCharsets.UTF_8));
			try {
				document = XMLCoreParser.retrieveDocument(s);			
			} catch (Exception e) {
				e.printStackTrace();
			}						
		}
		return document;
	}
	public void startMessage() {
		areas = new HashMap<String, HashMap<String, SimpleProperty>>();
		sequences = new HashMap<String, Integer>();
		//data = new HashMap<String, HashMap>();
		finaldoc = null;
		finalroot = null;		
	}
	public void ValidateMessage() {
		getFinalRoot().setAttribute(X_AD_MessageFormat.COLUMNNAME_Identifier, this.getIdentifier());
		XMLOutputter xmOut = new XMLOutputter(Format.getPrettyFormat()); 
		m_message = xmOut.outputString(finaldoc);
	}	
	public String getValidMessage() {
		return m_message;
	}
	public String getProperty(String area, String key) {
		String value = "";
		if (areas.containsKey(area)) {
			HashMap properties = (HashMap) areas.get(area);
			SimpleProperty var = (SimpleProperty) properties.get(key);
			if (var != null)
				value = var.getValue();
		}
		return value;
	}
	public Object getProperty(String area, String key, boolean getname2) {
		String value = "";
		if (areas.containsKey(area)) {
			HashMap properties = (HashMap) areas.get(area);
			SimpleProperty var = (SimpleProperty) properties.get(key);
			if (var != null)				
				value = var.getValue();
		}
		return value;
	}

	public void AddProperty(String area, String id, String value) {
		AddProperty(area, id, value, "", false);
	}
	public void AddProperty(String area, String id, String value, Boolean condition) {
		AddProperty(area, id, value, "", condition);
	}
	public void AddProperty(String area, String id, String value, String name) {
		AddProperty(area, id, value, name, false);
	}
	public void AddProperty(String area, String id, String value, String name, Boolean condition) {
		HashMap properties = null;
		if (!areas.containsKey(area)) {
			properties = new HashMap();
			areas.put(area, properties);
		}
		properties = areas.get(area);
		SimpleProperty p = new SimpleProperty();
		p.setValue(value);
		p.setName(name);
		p.setMandatory(condition);
		properties.put(id, p);
		areas.put(area, properties);
	}

	public String getMessage() {
		return null;
	}
	public Integer getSectionCount(String section) {
		return null;
	}
//	public String getData(String key, String property) {
//		return getData(key, property, false);
//	}
//	public String getData(String key, String property, boolean getname) {
//		String val = "";
//		if (data.containsKey(key)) {
//			HashMap properties = data.get(key);
//			if (properties.containsKey(property)) {
//				simpleproperty p = (simpleproperty) properties.get(property);
//				if (getname) {
//					val = p.getName();
//				} else {
//					val = p.getValue();
//				}
//			}
//		}
//		return val;
//	}

	public String Analyze(Object po) {
		String error = "";
		Document doc = getDocument();				
		List list = doc.getContent();
		Element message = (Element) doc.getContent(0);
		if (message != null) {
			Iterator it = list.iterator();
			while (it.hasNext()) {
				Element el = (Element) it.next();
				if (el.getName().equals("message")) {
					error = parseMessage((PO) po, el);
				}
			}
		}				
		return error;
	}

	private String parseMessage(PO po, Element element) {
		String error = "";
		Iterator itc = element.getChildren().iterator();
		while (itc.hasNext()) {
			Element e = (Element) itc.next();			
			if (e.getName().equals("section")) {					
				String area = e.getAttributeValue("name");
				parseMessage(po,  e);				
				if (poareas.containsKey(area)) {
					int index = childsindex.get(poareas.get(area));
					List<PO> pochilds = childs.get(poareas.get(area));
					if (pochilds.size() > 1) {
						try {
							ValidateSection(area);
						} catch (Exception ex) {
							error = ex.getMessage();
						}												
						while (index + 1 < pochilds.size()) {
							parseMessage(po,  e);
							index = childsindex.get(poareas.get(area));
							try {
								ValidateSection(area);
							} catch (Exception ex) {
								error = ex.getMessage();
							}						
						}						
					} else {
						try {
							ValidateSection(area);
						} catch (Exception ex) {
							error = ex.getMessage();
						}																	
					}
				} else {
					try {
						ValidateSection(area);
					} catch (Exception ex) {
						error = ex.getMessage();
					}																
				}
			} else if (e.getName().equals("field")) {
				String columnid = e.getAttributeValue("columnid");
				String area = e.getAttributeValue("area");
				if (columnid.length() > 0) {
					X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?" , null)
					.setParameters(columnid).first();
					if (column != null) {
						processfield(po, area, column);
					}
				}
			}
		}
		return error;
	}

	private void processfield(PO po, String area, X_AD_Column column) {
		if (column.getAD_Table_ID() == po.get_Table_ID()) {
			fieldsetvalue(po, area, column);
		} else {
			X_AD_Table t;
			if (!tables.containsKey(column.getAD_Table_ID())) {
				if (!poareas.containsKey(area)) {
					poareas.put(area, column.getAD_Table_ID());
				}
				t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
				.setParameters(column.getAD_Table_ID()).first();
				if (t != null) {
					tables.put(column.getAD_Table_ID(), t);
				}				
			} else {
				t = tables.get(column.getAD_Table_ID());
			}
			if (!childs.containsKey(t.getAD_Table_ID())) {
				if (t.getTableName().equals(X_AD_Client.Table_Name)) {
					MClient c = MClient.get(Env.getCtx(), po.getAD_Client_ID());
					List<PO> pos = new ArrayList<PO>();
					pos.add(c);
					childs.put(t.getAD_Table_ID(), pos);
					childsindex.put(t.getAD_Table_ID(), 0);					
				} else if (t.getTableName().equals(X_AD_Org.Table_Name)) {
					MOrg o = MOrg.get(Env.getCtx(), po.getAD_Org_ID());
					List<PO> pos = new ArrayList<PO>();
					pos.add(o);					
					childs.put(t.getAD_Table_ID(), pos);
					childsindex.put(t.getAD_Table_ID(), 0);
				} else {
					List<PO> pochild = new Query(Env.getCtx(), t.getTableName(), String.format("%s_ID = ?", po.get_TableName()), null)
					.setParameters(po.get_ID()).setOrderBy(String.format("%s_ID", t.getTableName())).list();
					if (pochild != null) {
						childs.put(t.getAD_Table_ID(), pochild);
						childsindex.put(t.getAD_Table_ID(), 0);
					}
				}
			}
			if (childs.containsKey(t.getAD_Table_ID())) {
				int index = childsindex.get(t.getAD_Table_ID());
				List<PO> pochilds = childs.get(t.getAD_Table_ID());				
				List<String> columns = new ArrayList<String>();
				if (childscolumns.containsKey(t.getAD_Table_ID())) {
					columns = childscolumns.get(t.getAD_Table_ID()); 
				} else {
					childscolumns.put(t.getAD_Table_ID(), columns);
				}
				if (columns.contains(column.getColumnName())) {
					index++;
					childsindex.put(t.getAD_Table_ID(), index);
					columns = new ArrayList<String>();
					childscolumns.put(t.getAD_Table_ID(), columns);					
				} 
				columns.add(column.getColumnName());
				PO child = pochilds.get(index);
				fieldsetvalue(child, area, column);
			}
		}				
	}

	private void fieldsetvalue(PO po, String area, X_AD_Column column) {
		if (column.getAD_Reference_ID() == DisplayType.TableDir || 
				column.getAD_Reference_ID() == DisplayType.Search || 
				column.getAD_Reference_ID() == DisplayType.PAttribute ||
				column.getAD_Reference_ID() == DisplayType.Locator) {
			int index = column.getColumnName().lastIndexOf("_ID");
			if (index > 0) {
				X_AD_Table t = null; 
				if (column.getAD_Reference_ID() == DisplayType.PAttribute) {
					t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
					.setParameters(X_M_AttributeSetInstance.Table_Name).first();
				} else if (column.getAD_Reference_ID() == DisplayType.Locator) {
					t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
					.setParameters(X_M_Locator.Table_Name).first();					
				} else {
					String tablename = column.getColumnName().substring(0, index);
					t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
					.setParameters(tablename).first();
				}
				if (t != null) {
					String id = POUtil.getid(t.getTableName(), po.get_ValueAsInt(column.getColumnName()));
					AddProperty(area,column.getColumnName(), id);
				}
			}											
		} else if (column.getAD_Reference_ID() == DisplayType.List) {
			String var = po.get_ValueAsString(column.getColumnName());
			AddProperty(area,column.getColumnName(), var);
		} else if (column.getAD_Reference_ID() == DisplayType.YesNo) {
			Boolean yesno = po.get_ValueAsBoolean(column.getColumnName());
			AddProperty(area,column.getColumnName(), yesno ? "Y" : "N");
		} else if (column.getAD_Reference_ID() == DisplayType.Amount) {			
			String var = po.get_ValueAsString(column.getColumnName());
			if (var.length() > 0) {				
				AddProperty(area,column.getColumnName(), var);
			}
		} else if (column.getAD_Reference_ID() == DisplayType.Quantity) {
			String var = po.get_ValueAsString(column.getColumnName());
			if (var.length() > 0) {
				AddProperty(area,column.getColumnName(), var);
			}
		} else if (column.getAD_Reference_ID() == DisplayType.CostPrice) { 
			String var = po.get_ValueAsString(column.getColumnName());
			if (var.length() > 0) {
				AddProperty(area,column.getColumnName(), var);
			}
		} else if (column.getAD_Reference_ID() == DisplayType.Date) {
			String var = po.get_ValueAsString(column.getColumnName());
			if (var.length() > 0) {				
				AddProperty(area,column.getColumnName(), var);
			}
		} else if (column.getAD_Reference_ID() == DisplayType.DateTime) {
			String date = po.get_ValueAsString(column.getColumnName());
			if (date.length() > 0) {				
				AddProperty(area,column.getColumnName(), date);
			}
		} else if (column.getAD_Reference_ID() == DisplayType.String) {
			String var = po.get_ValueAsString(column.getColumnName());
			if (var.length() > 0) {				
				AddProperty(area,column.getColumnName(), var);
			}			
		} else if (column.getAD_Reference_ID() == DisplayType.Integer) {
			String var = po.get_ValueAsString(column.getColumnName());
			if (var.length() > 0) {
				AddProperty(area,column.getColumnName(), var);
			}			
			//} else if (column.getAD_Reference_ID() == DisplayType.Locator) {
			//	System.out.println("X");
		} else if (column.getAD_Reference_ID() == DisplayType.Number) {
			String var = po.get_ValueAsString(column.getColumnName());
			if (var.length() > 0) {
				AddProperty(area,column.getColumnName(), var);
			}
		} else if (column.getAD_Reference_ID() == DisplayType.Quantity) {
			String var = po.get_ValueAsString(column.getColumnName());
			if (var.length() > 0) {
				AddProperty(area,column.getColumnName(), var);
			}
			//} else if (column.getAD_Reference_ID() == DisplayType.PAttribute) {
			//	System.out.println("X");
		} else if (column.getAD_Reference_ID() == DisplayType.ID) {
			String var = po.get_ValueAsString(X_AD_Table.COLUMNNAME_Identifier);
			if (var.length() > 0) {				
				AddProperty(area,column.getColumnName(), var);
			}
		}
	}
	/*
	 *  This procedure reset the position for search element use by PrintDocument Object 
	 */
	public void initialize() {
		searched = new HashMap<String, Integer>();		
	}
}





