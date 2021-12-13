package org.xendra.report;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

import org.columba.core.xml.XMLCoreParser;
import org.compiere.Xendra;
import org.compiere.model.MProcessPara;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Element;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Access;
import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Role;
import org.compiere.model.persistence.X_AD_RoleType;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.model.reference.REF_AD_TableAccessLevels;
import org.compiere.model.reference.REF_BaseRoleType;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xendra.Constants;
import org.xendra.rules.RuleXMLParser;

public class ReportXMLParser extends XMLCoreParser {
	private X_AD_Plugin m_plugin;
	private X_AD_Process proc;
	private Document menuitem;
	private HashMap properties;
	private String FileName = "";
	private String roles = "";
	private boolean force;
	public ReportXMLParser(X_AD_Plugin plugin, Document menuitem) {
		m_plugin = plugin;
		this.menuitem = menuitem;
		//m_menu = menu;
		//m_menutrl = menutrl;
	}
	public void parserFormat(InputStream is) {		
		try {			
			HashMap parameters = new HashMap();
			Document doc = retrieveDocument(is);
			Element parent = doc.getRootElement();
			properties = new HashMap();
			//
			String reporttype  = parent.getName();			
			//if (menuid != null)			
			if (reporttype.equals("process") )
			{
				//String menuid = parent.getAttributeValue(X_AD_Menu.COLUMNNAME_AD_Menu_ID);
				//properties.put(X_AD_Menu.COLUMNNAME_AD_Menu_ID, menuid);
				roles= parent.getAttributeValue(X_AD_RoleType.COLUMNNAME_BaseRole);
				if (roles == null) {
					roles = REF_BaseRoleType.All;
				}
				String Name = parent.getAttributeValue(X_AD_Process.COLUMNNAME_Name);
				FileName = parent.getAttributeValue(X_AD_Process.COLUMNNAME_FileName);
				if (FileName == null)
					FileName = "";
				if (FileName.length() > 0) {
					if (FileName.contains(".")) {
						FileName = FileName.substring(0,FileName.indexOf("."));
					}
				}
				String Value = parent.getAttributeValue(X_AD_Process.COLUMNNAME_Value);
				String Description = parent.getAttributeValue(X_AD_Process.COLUMNNAME_Description);
				String Help = parent.getAttributeValue(X_AD_Process.COLUMNNAME_Help);
				String AccessLevel = parent.getAttributeValue(X_AD_Process.COLUMNNAME_AccessLevel);
				String EntityType = parent.getAttributeValue(X_AD_Process.COLUMNNAME_EntityType);
				//
				String identifier = parent.getAttributeValue(X_AD_Process.COLUMNNAME_Identifier);
				String sync = parent.getAttributeValue(X_AD_Process.COLUMNNAME_Synchronized);
				Timestamp procsync = Timestamp.valueOf(sync);
				proc = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
				.setParameters(identifier).first();
				if (proc == null)
				{
					proc = new X_AD_Process(Env.getCtx(), 0, null);							
					proc.setName(Name);
					proc.setAD_Plugin_ID(m_plugin.getAD_Plugin_ID());
					proc.setIdentifier(identifier);
					proc.setValue(Value);
					proc.setDescription(Description);
					proc.setHelp(Help);
					proc.setAccessLevel(AccessLevel);
					proc.setEntityType(EntityType);
					proc.setID(m_plugin.getID());
					proc.setIsReport(true);
					proc.setJasperReport(String.format("%s.jasper",FileName));
					proc.setProperties(properties);
					if (!proc.save()) {
						System.out.println("X");
					}
				}			
				proc.setAD_Plugin_ID(m_plugin.getAD_Plugin_ID());
				if (proc.getSynchronized() == null || proc.getSynchronized().compareTo(procsync) != 0 || force)
				{
					proc.setFileName(parent.getAttributeValue(X_AD_Process.COLUMNNAME_FileName));
					proc.setClassname(parent.getAttributeValue(X_AD_Process.COLUMNNAME_Classname));
					proc.setCategoryName(parent.getAttributeValue(X_AD_Process.COLUMNNAME_CategoryName));
					Iterator iterator = parent.getChildren().listIterator();
					Element extensionXmlElement;
					while (iterator.hasNext()) {
						extensionXmlElement = (Element) iterator.next();
						String type  = extensionXmlElement.getName();
						if (type == "jasperReport")
						{				
							Format format = Format.getPrettyFormat().setOmitDeclaration(false);
							XMLOutputter xmOut=new XMLOutputter(format);
							String sfilename =  xmOut.outputString(extensionXmlElement);	
							proc.setContent(sfilename);
							Iterator jiter = extensionXmlElement.getChildren().listIterator();
							Element jasperXmlElement;
							while (jiter.hasNext()) {
								jasperXmlElement = (Element) jiter.next();
								String jtype  = jasperXmlElement.getName();
								if (jtype == "parameter")
								{
									String paraname = jasperXmlElement.getAttributeValue("name");
									String classname = jasperXmlElement.getAttributeValue("class");
									Iterator iter = jasperXmlElement.getChildren().listIterator();
									while (iter.hasNext()) {
										Element jhj = (Element) iter.next();
										String type2 = jhj.getName();
										if (type2 == "defaultValueExpression")
										{
											String textdv = jhj.getText();
										}
									}
									parameters.put(paraname, classname);
								}	
								else if (jtype == "queryString")
								{
									String query = jasperXmlElement.getText();
									proc.setDataSource(query);							
								}			
								else if (jtype == "field")
								{
									String name2 = jasperXmlElement.getAttributeValue("name");
									String class2 = jasperXmlElement.getAttributeValue("class");
								}						
							}					
						}
						else if (type == "parameter")
						{
							String paraname = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_Name);
							String paracolumnname = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_ColumnName);
							String paraidentifier = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_Identifier);
							String paraseqno = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_SeqNo);
							String timestamp = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_Synchronized);
							String referenceid = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_AD_Reference_ID);
							int FieldLength = Integer.valueOf(extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_FieldLength));
							if (referenceid == null)
								referenceid = "";						
							Timestamp parasync = null;
							if (timestamp == null)
								parasync = new Timestamp(System.currentTimeMillis());
							else
							{
								try {
									parasync = Timestamp.valueOf(timestamp);
								}
								catch (Exception e)
								{
									e.printStackTrace();
								}
							}

							X_AD_Process_Para para = new Query(Env.getCtx(),X_AD_Process_Para.Table_Name,"Identifier = ?", null)
							.setParameters(paraidentifier).first();
							if (para == null)						
							{
								para = new Query(Env.getCtx(),X_AD_Process_Para.Table_Name, "AD_Process_ID = ? AND ColumnName = ?", null)
								.setParameters(proc.getAD_Process_ID(), paracolumnname).first();
								if (para != null)
								{
									para.setIdentifier(paraidentifier);
									para.save();
								}
							}
							if (para == null)
							{
								para = new X_AD_Process_Para(Env.getCtx(), 0 , null);
								para.setIdentifier(paraidentifier);
								para.setName(paraname);
								para.setAD_Process_ID(proc.getAD_Process_ID());
								para.setSeqNo(Integer.valueOf(paraseqno));
								if (referenceid.length() > 0)
								{
									X_AD_Reference ref = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "Identifier = ?", null)
									.setParameters(referenceid).first();
									para.setAD_Reference_ID(ref.getAD_Reference_ID());
								}
								X_AD_Element e = new Query(Env.getCtx(), X_AD_Element.Table_Name, "Columnname = ?", null)
									.setParameters(paracolumnname).first();
								if (e != null) {
									para.setAD_Element_ID(e.getAD_Element_ID());
								}
								para.setColumnName(paracolumnname);
								para.setFieldLength(FieldLength);
								if (!para.save()) {
									para.save();
								}
							}
							if (para.getSynchronized() == null || para.getSynchronized().compareTo(parasync) != 0 || force)
							{

								String paradescrip = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_Description);
								String parahelp = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_Help);							
								String referencevalueid = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_AD_Reference_Value_ID);
								if (referencevalueid == null)
									referencevalueid = "";
								String valruleid = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_AD_Val_Rule_ID);						
								if (valruleid == null)
									valruleid = "";

								String isMandatory = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_IsMandatory);
								String isRange = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_IsRange);
								String defaultvalue = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_DefaultValue);
								String defaultvalue2 = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_DefaultValue2);
								String vformat = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_VFormat);
								String valuemin = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_ValueMin);
								String valuemax = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_ValueMax);
								String entitytype = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_EntityType);
								String displayLogic = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_DisplayLogic);
								String readonlyLogic = extensionXmlElement.getAttributeValue(X_AD_Process_Para.COLUMNNAME_ReadOnlyLogic);														 													
								para.setDescription(paradescrip);
								para.setHelp(parahelp);							
								if (referencevalueid.length() > 0)
								{
									X_AD_Reference ref = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "Identifier = ?", null)
									.setParameters(referencevalueid).first();
									para.setAD_Reference_Value_ID(ref.getAD_Reference_ID());
								}
								if (valruleid.length() > 0)
								{
									X_AD_Val_Rule val = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "Identifier = ?", null)
									.setParameters(valruleid).first();
									para.setAD_Val_Rule_ID(val.getAD_Val_Rule_ID());
								}
								para.setIsMandatory(isMandatory.equals("true"));
								para.setIsRange(isRange.equals("true"));
								para.setDefaultValue(defaultvalue);
								para.setDefaultValue2(defaultvalue2);
								para.setVFormat(vformat);
								para.setValueMin(valuemin);
								para.setValueMax(valuemax);
								para.setEntityType(entitytype);
								para.setDisplayLogic(displayLogic);
								para.setReadOnlyLogic(readonlyLogic);

								para.setAD_Process_ID(proc.getAD_Process_ID());
								para.setIdentifier(paraidentifier);
								para.setSynchronized(parasync);
								para.save();								 
							}	
						}
					}
					proc.setSynchronized(procsync);
					//if (proc.save()) {
						//addMenu(proc);
					//}
				}
				if (proc.save()) {
					List<X_AD_Role> listroles = new ArrayList<X_AD_Role>();
					StringTokenizer st = new StringTokenizer(roles,",");
					while (st.hasMoreTokens()) {
						String baserole = st.nextToken();
						List<X_AD_RoleType> roletypes = new Query(Env.getCtx(), X_AD_RoleType.Table_Name, "BaseRole  = ?", null)
						.setParameters(baserole).list();
						for (X_AD_RoleType roletype:roletypes) {
							X_AD_Role role = new Query(Env.getCtx(), X_AD_Role.Table_Name, "AD_Role_ID = ?", null)
								.setParameters(roletype.getAD_Role_ID()).first();
							if (!listroles.contains(role)) {
								listroles.add(role);
							}
						}						
					}
					for (X_AD_Role role:listroles) {
						X_AD_Process_Access procaccess = new Query(Env.getCtx(), X_AD_Process_Access.Table_Name, "AD_Role_ID = ? AND AD_Process_ID = ?", null)
							.setParameters(role.getAD_Role_ID(), proc.getAD_Process_ID()).first();
						if (procaccess == null) {
							procaccess = new X_AD_Process_Access(Env.getCtx(), 0, null);
							procaccess.setAD_Process_ID(proc.getAD_Process_ID());
							procaccess.setAD_Role_ID(role.getAD_Role_ID());
							procaccess.save();
						}
					}
				}
			}
			else if (reporttype.equals("jasperReport") )
			{
				String identifier = "";
				String filename = "";
				Timestamp sync = null;				
				String Description = "";
				Iterator iterator = parent.getChildren().listIterator();
				Element extensionXmlElement;
				while (iterator.hasNext()) {
					extensionXmlElement = (Element) iterator.next();
					String type  = extensionXmlElement.getName();
					if (type == "property")
					{
						String paraname = extensionXmlElement.getAttributeValue("name");
						if (paraname.equals(X_AD_Process.COLUMNNAME_FileName))
						{
							filename = extensionXmlElement.getAttributeValue("value");
						}
						else if (paraname.equals(X_AD_Process.COLUMNNAME_Identifier))					
							identifier = extensionXmlElement.getAttributeValue("value");
						else if (paraname.equals(X_AD_Process.COLUMNNAME_Description))
							Description = extensionXmlElement.getAttributeValue("value");
						else if (paraname.equals(X_AD_Process.COLUMNNAME_Synchronized))
						{
							String stringsync = extensionXmlElement.getAttributeValue("value");
							if (stringsync.length() > 0)
							{
								try {
									sync = Timestamp.valueOf(stringsync);
								}
								catch (Exception e)
								{
									sync = new Timestamp(System.currentTimeMillis());
								}
							}
						}
					}				
				}	
				if (identifier.length() > 0)
				{
					X_AD_Process proc = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
					.setParameters(identifier).first();
					if (proc == null)
					{
						proc = new X_AD_Process(Env.getCtx(), 0, null);
						proc.setIdentifier(identifier);						
					}
					Format format = Format.getPrettyFormat().setOmitDeclaration(false);
					XMLOutputter xmOut=new XMLOutputter(format);
					String sfilename =  xmOut.outputString(parent);
					proc.setName(filename);
					proc.setAccessLevel(REF_AD_TableAccessLevels.SystemPlusClient);
					proc.setContent(sfilename);
					proc.setFileName(filename);
					proc.setJasperReport(filename);
					proc.setDescription(Description);
					proc.setSynchronized(sync);
					proc.setID(m_plugin.getID());
					proc.setIsReport(true);
					if (proc.save()) {
						//addMenu(proc);					
					}
					Iterator jiter = parent.getChildren().listIterator();
					Element jasperXmlElement;
					int seqno = 0;
					while (jiter.hasNext()) {
						jasperXmlElement = (Element) jiter.next();
						String jtype  = jasperXmlElement.getName();
						if (jtype == "queryString")
						{
							String query = jasperXmlElement.getText();
							proc.setDataSource(query);							
						}			
						else if (jtype == "field")
						{
							//							String name2 = jasperXmlElement.getAttributeValue("name");
							//							System.out.println(name2);
							//							String class2 = jasperXmlElement.getAttributeValue("class");
							//							System.out.println(class2);
						}		
						else if (jtype == "parameter")
						{							
							String name = jasperXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
							String classname = jasperXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_CLASS);
							String defaultvalue = jasperXmlElement.getAttributeValue("defaultValueExpression");
							X_AD_Element element = new Query(Env.getCtx(), X_AD_Element.Table_Name, "lower(ColumnName)=?", null)
							.setParameters(name.toLowerCase()).first();
							if (element == null)
							{
								element = new X_AD_Element(Env.getCtx(), 0, null);
								element.setName(name);
								element.setPrintName(name);
								element.setColumnName(name);
								element.setDescription(name);
								element.setHelp(name);
								element.save();
							}							
							MProcessPara mpp = new Query(Env.getCtx(), X_AD_Process_Para.Table_Name, "AD_Process_ID = ? AND name = ?", null)
							.setParameters(proc.getAD_Process_ID(), name).first();
							if (mpp == null)
							{
								mpp = new MProcessPara(Env.getCtx(),0, null);
								mpp.setAD_Process_ID(proc.getAD_Process_ID());
								mpp.setName(name);								
							}
							mpp.setAD_Element_ID(element.getAD_Element_ID());
							mpp.setName(element.getName());
							mpp.setColumnName(element.getColumnName());
							mpp.setDescription(element.getDescription());
							mpp.setHelp(element.getHelp());
							mpp.setSeqNo(seqno);
							seqno ++;
							if (classname.equals("java.lang.String"))
							{
								mpp.setAD_Reference_ID(DisplayType.String);
								mpp.setFieldLength(60);
							}
							else if (classname.equals("java.sql.Timestamp"))
							{
								mpp.setAD_Reference_ID(DisplayType.Date);
								mpp.setFieldLength(7);
							}
							else if (classname.equals("java.math.BigDecimal"))
							{
								mpp.setAD_Reference_ID(DisplayType.Amount);
								mpp.setFieldLength(22);
							}
							else if (classname.equals("java.util.Date"))
							{
								mpp.setAD_Reference_ID(DisplayType.Date);
								mpp.setFieldLength(7);
							}
							else if (classname.equals("java.lang.Integer"))
							{
								mpp.setAD_Reference_ID(DisplayType.Integer);
								mpp.setFieldLength(10);
							}
							else if (classname.equals("java.lang.Double"))
							{
								mpp.setAD_Reference_ID(DisplayType.Number);
								mpp.setFieldLength(22);
							}
							mpp.save();							
						}
					}																												
				}
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		updateMenu(menuitem.getRootElement());		
		//X_AD_Menu menu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "Anchor = ?", null)
		//.setParameters("REPORTS").first();
		//if (menu != null) {
		//	test(menu);
		//}
	}	
	public void updateMenu(Element node) {
		String report = node.getAttributeValue("Report");
		if (report == null) {
			report = "";
		}		
		if (report.equals(FileName)) {			
			node.setAttribute(X_AD_Process.COLUMNNAME_AD_Process_ID, String.valueOf(proc.getAD_Process_ID()));
			node.setAttribute(X_AD_RoleType.COLUMNNAME_BaseRole, roles);
		}
		List childrens = node.getChildren();
	    for (int i = 0; i < childrens.size(); i++) {
	        Element currentNode = (Element) childrens.get(i);
	        updateMenu(currentNode);
	    }
	}	
//	private void test(X_AD_Menu menu) {
//		X_AD_TreeNodeMM mm = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?",null)
//		.setParameters(menu.getAD_Menu_ID()).first(); // anchor
//		if (mm != null) { // reports in 
//			level(mm,menuitem.getRootElement());
//		}		
//	}
//	private void level(X_AD_TreeNodeMM mm, Element e) {
//		X_AD_Menu item = null;
//		List<X_AD_TreeNodeMM> mms = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "parent_id = ?", null)
//		.setParameters(mm.getNode_ID()).list();		
//		for (X_AD_TreeNodeMM node:mms) {
//			X_AD_Menu childmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
//			.setParameters(node.getNode_ID()).first();				
//			//Iterator jiter = list.listIterator();
//			//Element jasperXmlElement;			
//			//int seqno = 0;
//			//while (jiter.hasNext()) {
//			//	Element e = (Element) jiter.next();
//			//	System.out.println("X");
//			if (e.getAttributeValue("Name").equals(childmenu.getName())) {
//				item = childmenu;
//				break;
//			}
//			//}				
//			//List list = menuitem.getRootElement().getChildren();
//		}
//		if (item == null) {
//			item = new X_AD_Menu(Env.getCtx(), 0, null);
//			item.setName(e.getAttributeValue("Name"));
//			String report = e.getAttributeValue("Report");
//			if (report == null) {
//				report = "";
//				item.setIsSummary(true);
//			} 
//			if (report.length() > 0) {
//				
//			}
//			
//		}
//	}
	//	private void generatemenu2(String menuid)
	//	{
	//		if (menuid == null)
	//			return;
	//		int level = 99;
	//		HashMap map = new HashMap<Integer, ExtensionMenuItem>();
	//		
	//		//List<Vector> sd = new ArrayList<Vector>();
	//		while (menuid.length()  > 0)
	//		{
	//			boolean found = false;
	//			for (Iterator it = m_menu.iterator(); it.hasNext();)
	//			{				
	//				ExtensionMenuItem pmenuitem = (ExtensionMenuItem) it.next();
	//				if (menuid.equals(pmenuitem.getIdentifier()))
	//				{
	//					//Vector d = new Vector();
	//					//d.add(level);
	//					//d.add(menuid);
	//					//sd.add(d);
	//					found = true;
	//					map.put(level, pmenuitem);
	//					level--;
	//					menuid = pmenuitem.getParent_ID();
	//				}
	//			}
	//			if (!found) {
	//				menuid = "";
	//			}
	//		}
	//		level++;
	//		for (int i=level; i<=99; i++)
	//		{
	//			ExtensionMenuItem pmenuitem = (ExtensionMenuItem) map.get(i);
	//			X_AD_Menu dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "identifier = ?", null)
	//			.setParameters(pmenuitem.getIdentifier()).first();
	//			boolean isnewmm = false;
	//			X_AD_TreeNodeMM mm = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?",null)
	//			.setParameters(dbmenu.getAD_Menu_ID()).first();
	//			if (mm == null)
	//			{																				
	//				if (MTree_Base.addNode(Env.getCtx(), REF_AD_TreeTypeType.Menu, dbmenu.getAD_Menu_ID(), null))
	//				{
	//					mm = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?",null)
	//					.setParameters(dbmenu.getAD_Menu_ID()).first();
	//					isnewmm = true;
	//				}
	//			}
	//			if (i > level)
	//			{
	//				ExtensionMenuItem parentitem = (ExtensionMenuItem) map.get(i-1);
	//				X_AD_Menu parentmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "identifier = ?", null)
	//				.setParameters(parentitem.getIdentifier()).first();
	//				mm.setParent_ID(parentmenu.getAD_Menu_ID());
	//			}
	//			if (isnewmm)
	//			{
	//				int no = 0;
	//				int count = DB.getSQLValue(null, "SELECT count(*) from AD_TreeNodeMM where parent_id = ? and exists(select 1 from ad_menu where ad_menu_id = node_id)", mm.getParent_ID());
	//				if (count > 0)
	//				{
	//					no = DB.getSQLValue(null, "SELECT MAX(seqno) from AD_TreeNodeMM where parent_id = ? and exists(select 1 from ad_menu where ad_menu_id = node_id)", mm.getParent_ID());
	//					no++;
	//				}											
	//				mm.setSeqNo(no);
	//			}
	//			mm.save();											
	//		}
	////				X_AD_Menu dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "identifier = ?", null)
	////				.setParameters(pmenuitem.getIdentifier()).first();
	//	}
	//	private String generatemenu(String menuid, X_AD_Process proc)
	//	{
	//		String parentid = "";
	//		for (Iterator it = m_menu.iterator(); it.hasNext();)
	//		{				
	//			ExtensionMenuItem pmenuitem = (ExtensionMenuItem) it.next();
	//			if (menuid.equals(pmenuitem.getIdentifier()))
	//			{
	//				Timestamp menusync = pmenuitem.getSynchronized();
	//				parentid = pmenuitem.getParent_ID();
	//				X_AD_Menu dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "identifier = ?", null)
	//				.setParameters(pmenuitem.getIdentifier()).first();
	//				if (dbmenu == null)
	//				{
	//					dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
	//					.setParameters(pmenuitem.getAD_Menu_ID()).first();
	//					if (dbmenu != null)
	//					{
	//						if (dbmenu.getName().toLowerCase().equals(pmenuitem.getName().toLowerCase()))
	//						{
	//							dbmenu.setIdentifier(pmenuitem.getIdentifier());
	//							dbmenu.save();
	//						}
	//						else
	//							dbmenu = null;
	//					}
	//				}
	//				if (dbmenu == null)
	//				{
	//					dbmenu = new X_AD_Menu(Env.getCtx(), 0 , null);
	//					dbmenu.setIdentifier(pmenuitem.getIdentifier());						
	//				}
	//				if (dbmenu.getSynchronized() == null || menusync.compareTo(dbmenu.getSynchronized()) != 0)
	//				{
	//					dbmenu.setName(pmenuitem.getName());
	//					dbmenu.setDescription(pmenuitem.getDescription());
	//					dbmenu.setIsSummary(pmenuitem.getIsSummary());
	//					dbmenu.setIsSOTrx(pmenuitem.getIsSOTrx());
	//					dbmenu.setIsReadOnly(pmenuitem.getIsReadOnly());			
	//					if (pmenuitem.getAction().length() > 0)
	//						dbmenu.setAction(pmenuitem.getAction());					
	//					//if (menuid.equals(pmenuitem.getIdentifier()))
	//					//{
	//					dbmenu.setAD_Process_ID(proc.getAD_Process_ID());
	//					//}
	//					dbmenu.setEntityType(pmenuitem.getEntityType());															
	//					dbmenu.setSynchronized(menusync);
	//					dbmenu.save();
	//				}		
	//				break;
	//			}
	//		}	
	//		return parentid;
	//	}
	//private void addMenu(X_AD_Process proc) {
	//	String menuid = (String) properties.get(X_AD_Menu.COLUMNNAME_AD_Menu_ID);
	//	if (menuid == null)
	//		menuid = "";
	//	while (menuid.length() > 0)
	//	{
	//		menuid = generatemenu(menuid, proc);
	//	}
	//	menuid = (String) properties.get(X_AD_Menu.COLUMNNAME_AD_Menu_ID);
	//	generatemenu2(menuid);
	//		for (Iterator it = m_menu.iterator(); it.hasNext();)
	//		{				
	//			ExtensionMenuItem pmenuitem = (ExtensionMenuItem) it.next();
	//			Timestamp menusync = pmenuitem.getSynchronized();
	//			dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "identifier = ?", null)
	//			.setParameters(pmenuitem.getIdentifier()).first();
	//			if (dbmenu == null)
	//			{
	//				dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
	//				.setParameters(pmenuitem.getAD_Menu_ID()).first();
	//			}
	//			if (dbmenu == null)
	//			{
	//				dbmenu = new X_AD_Menu(Env.getCtx(), 0 , null);
	//				dbmenu.setIdentifier(pmenuitem.getIdentifier());						
	//			}
	//			if (dbmenu.getSynchronized() == null || menusync.compareTo(dbmenu.getSynchronized()) != 0)
	//			{
	//				dbmenu.setName(pmenuitem.getName());
	//				dbmenu.setDescription(pmenuitem.getDescription());
	//				dbmenu.setIsSummary(pmenuitem.getIsSummary());
	//				dbmenu.setIsSOTrx(pmenuitem.getIsSOTrx());
	//				dbmenu.setIsReadOnly(pmenuitem.getIsReadOnly());			
	//				if (pmenuitem.getAction().length() > 0)
	//					dbmenu.setAction(pmenuitem.getAction());					
	//				if (pmenuitem.getAD_Form_ID().length() > 0)
	//				{
	//					X_AD_Form dbform = new Query(Env.getCtx(), X_AD_Form.Table_Name, "Identifier = ?", null)
	//					.setParameters(pmenuitem.getAD_Form_ID()).first();
	//					if (dbform != null)
	//					{
	//						dbmenu.setAD_Form_ID(dbform.getAD_Form_ID());		
	//					}
	//				}	
	//				else if (pmenuitem.getAD_Process_ID().length() > 0)
	//				{
	//					X_AD_Process dbprocess = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
	//					.setParameters(pmenuitem.getAD_Process_ID()).first();
	//					if (dbprocess != null)
	//					{
	//						dbmenu.setAD_Process_ID(dbprocess.getAD_Process_ID());
	//					}
	//				}
	//				dbmenu.setEntityType(pmenuitem.getEntityType());															
	//				dbmenu.setSynchronized(menusync);
	//				dbmenu.save();
	//			}
	//		}		
	//}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Xendra.startup(true);
		String xendrahome = Ini.getXendraHome();
		File pluginrules = new File(xendrahome, "reports/jasperreport");
		if (pluginrules != null && pluginrules.exists())
		{
			for (final File rule : pluginrules.listFiles()) {
				if (rule.isFile()) {
					BufferedInputStream buf;
					try {
						buf = new BufferedInputStream(new FileInputStream(rule));
						new ReportXMLParser(null,null).parserFormat(buf);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				}									
			}
		}			
	}

	public Object setMenu(Vector menu) {
		return null;
	}
	public Object setMenuTrl(Vector menutrl) {
		return null;
	}
	public ReportXMLParser setForce(boolean force) {
		this.force = force; 
		return this;
	}
}
