package org.xendra.developer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.columba.core.xml.XMLCoreParser;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Role;
import org.compiere.model.persistence.X_AD_RoleType;
import org.compiere.model.persistence.X_AD_TreeNodeMM;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xendra.Constants;

public class common {
	private static HashMap menumap = new HashMap();
	public static HashMap getMenuMap()
	{
		return menumap;
	}
	public static String getJasperSource(File xmlfile) {
		String jasperreportsrc = "";	
		try {
			boolean hasid = false;
			boolean hassync = false;
			boolean hasfilename = false;
			boolean hasdescription = false;
			System.out.println(xmlfile.getAbsolutePath());
			BufferedInputStream is = new BufferedInputStream(new FileInputStream(xmlfile));
			Document doc = XMLCoreParser.retrieveDocument(is);
			Element dom = doc.getRootElement();
			Iterator iterator = dom.getChildren().listIterator();
			while (iterator.hasNext()) {
				Element extensionXmlElement = (Element) iterator.next();
				String type  = extensionXmlElement.getName();
				if (type == "property")
				{
					String paraname = extensionXmlElement.getAttributeValue("name");
					if (paraname.equals(X_AD_Process.COLUMNNAME_Identifier))					
					{
						hasid = true;
					}		
					else if (paraname.equals(X_AD_Process.COLUMNNAME_Synchronized))
					{
						hassync = true;
					}
					else if (paraname.equals(X_AD_Plugin.COLUMNNAME_FileName))
					{
						hasfilename = true;
					}
					else if (paraname.equals(X_AD_Process.COLUMNNAME_Description))
					{
						hasdescription = true;
					}
				}
			}			
			if (!hasid || !hassync || !hasfilename || !hasdescription) {
				if (!hasid)
				{
					Element identifier = new Element(Constants.Property, dom.getNamespace());
					identifier.setAttribute(Constants.XML_ATTRIBUTE_NAME, X_AD_Process.COLUMNNAME_Identifier);
					identifier.setAttribute(Constants.XML_ATTRIBUTE_VALUE, Util.getUUID());
					dom.addContent(0, identifier);
				}
				if (!hassync)
				{
					Timestamp tsync = new Timestamp(System.currentTimeMillis());
					Element sync = new Element(Constants.Property, dom.getNamespace());
					sync.setAttribute(Constants.XML_ATTRIBUTE_NAME, X_AD_Process.COLUMNNAME_Synchronized);
					sync.setAttribute(Constants.XML_ATTRIBUTE_VALUE, tsync.toString());				
					dom.addContent(0, sync);
				}
				if (!hasfilename)
				{
					Element name = new Element(Constants.Property, dom.getNamespace());				
					name.setAttribute(Constants.XML_ATTRIBUTE_NAME,X_AD_Plugin.COLUMNNAME_FileName);
					name.setAttribute(Constants.XML_ATTRIBUTE_VALUE, xmlfile.getName());
					dom.addContent(0, name);
				}
				if (!hasdescription)
				{
					Element name = new Element(Constants.Property, dom.getNamespace());				
					name.setAttribute(Constants.XML_ATTRIBUTE_NAME,X_AD_Process.COLUMNNAME_Description);
					name.setAttribute(Constants.XML_ATTRIBUTE_VALUE, xmlfile.getName());
					dom.addContent(0, name);					
				}
			}
			Format xx = Format.getRawFormat().setOmitDeclaration(true);
			XMLOutputter xmOut=new XMLOutputter(xx);
			jasperreportsrc =  xmOut.outputString(doc);
			if (!hasid || !hassync || !hasfilename || !hasdescription) 
			{
				PrintWriter out = new PrintWriter(xmlfile);
				out.println(jasperreportsrc);
				out.close();				
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return jasperreportsrc;
	}
	
//	private static String addMenuProcess(X_AD_Process process) {
//		String Menuid = "";
//		X_AD_Menu menu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Process_ID = ?", null)
//				.setParameters(process.getAD_Process_ID()).first();
//		if (menu != null)
//		{				
//			if (menu.getSynchronized() == null)
//			{
//				menu.setSynchronized(new Timestamp(System.currentTimeMillis()));
//				menu.save();
//			}			
//			if (menu.getIdentifier().length() == 0)
//			{
//				menu.setIdentifier(Util.getUUID());
//				menu.save();
//			}											
//			Menuid = menu.getIdentifier();
////			if (Menuid.length() == 0)
////			{
////				menu.setIdentifier(Util.getUUID());
////				if (menu.save())
////				{
////					Menuid = menu.getIdentifier();
////				}
////			}
//			common.addMenu(menu, menumap);
//		}
//		return Menuid;
//	}	
	public static void createProcess(File outdir, X_AD_Process proc, File xmlfile) {
		try {			
			if (proc.getSynchronized() == null)
			{
				proc.setSynchronized(new Timestamp(System.currentTimeMillis()));
				proc.save();
			}			
			if (proc.getIdentifier().length() == 0)
			{
				proc.setIdentifier(Util.getUUID());
				proc.save();
			}								
			HashMap properties = proc.getProperties();
			String roles = (String) properties.get(X_AD_RoleType.COLUMNNAME_BaseRole);
			if (roles == null)
				roles = "";
			List<X_AD_Process_Para> params = new Query(Env.getCtx(), X_AD_Process_Para.Table_Name, "AD_Process_ID = ?", null)
			.setParameters(proc.getAD_Process_ID()).list();
			//String menu_id = addMenuProcess(proc);
			StringBuffer header = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			StringBuffer sb = new StringBuffer();		
			sb.append("<process ");
			//Util.append(sb, String.format("%s=\"%s\" ",X_AD_Menu.COLUMNNAME_AD_Menu_ID, menu_id));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process.COLUMNNAME_Value,proc.getName()));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process.COLUMNNAME_Name,proc.getName()));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_RoleType.COLUMNNAME_BaseRole, roles));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_Description,proc.getDescription()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_Help,proc.getHelp()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_Classname,proc.getClassname()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_CategoryName,proc.getCategoryName()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_AccessLevel,proc.getAccessLevel()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_EntityType,proc.getEntityType()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_FileName, xmlfile.getName().replace(".in.xml", ".jrxml")));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Menu.COLUMNNAME_Identifier,proc.getIdentifier()));
			Util.append(sb, String.format("\t%s=\"%s\">\n\t",X_AD_Menu.COLUMNNAME_Synchronized,proc.getSynchronized()));
			if (params != null)
			{				
				for (X_AD_Process_Para param:params)
				{
					if (param.getSynchronized() == null)
					{
						param.setSynchronized(new Timestamp(System.currentTimeMillis()));
						param.save();
					}					
					if (param.getIdentifier().length() == 0)
					{
						param.setIdentifier(Util.getUUID());
						param.save();
					}													
					sb.append("<parameter ");
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Name, param.getName()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Description,param.getDescription()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Help,param.getHelp()));					
					String referenceid = "";
					X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
					.setParameters(param.getAD_Reference_ID()).first();
					if (reference != null)
					{
						referenceid = reference.getIdentifier();							
					}	
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_AD_Reference_ID, referenceid));
					String referencevalueid = "";
					X_AD_Reference referencevalue = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
					.setParameters(param.getAD_Reference_Value_ID()).first();
					if (referencevalue != null)
					{
						referencevalueid = referencevalue.getIdentifier();
					}
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_AD_Reference_Value_ID, referencevalueid));
					String valruleid = "";
					X_AD_Val_Rule valrule = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "AD_Val_Rule_ID = ?", null)
					.setParameters(param.getAD_Val_Rule_ID()).first();
					if (valrule != null)							
					{
						valruleid = valrule.getIdentifier();
					}
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_AD_Val_Rule_ID, valruleid));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_ColumnName, param.getColumnName()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_FieldLength, param.getFieldLength()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_IsMandatory, param.isMandatory()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_IsRange, param.isRange()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_DefaultValue, param.getDefaultValue()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_DefaultValue2, param.getDefaultValue2()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_VFormat, param.getVFormat()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_ValueMin, param.getValueMin()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_ValueMax, param.getValueMax()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_SeqNo,param.getSeqNo()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_EntityType,param.getEntityType()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_DisplayLogic,param.getDisplayLogic()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_ReadOnlyLogic,param.getReadOnlyLogic()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Identifier, param.getIdentifier()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Synchronized, param.getSynchronized()));
					sb.append("/>\n");
				}
				//Util.append(sb, String.format("<jasperreport filename=\"%s\"/>\n",xmlfile.getName().replace(".in.xml", ".jrxml")));
			}
			Util.append(sb, String.format("</process>\n"));
			header.append(sb);
			try {
				SAXBuilder sb2=new SAXBuilder();
				Document doc=sb2.build(new StringReader(header.toString()));
		
				Format xx = Format.getPrettyFormat();
				XMLOutputter xmOut=new XMLOutputter(xx);
				String sfilename =  xmOut.outputString(doc);	
				//String name = xmlfile.getName();
				//int pos = name.lastIndexOf(".");
				//if (pos > 0) {
				//	name = name.substring(0, pos);
				//}							
				//PrintWriter out = new PrintWriter(outdir.getAbsolutePath()+System.getProperty("file.separator")+name+".xml");
				//PrintWriter out = new PrintWriter(outdir.getAbsolutePath()+System.getProperty("file.separator")+Util.cleanWhitespace(proc.getName())+".xml");
				PrintWriter out = new PrintWriter(xmlfile);
				out.println(sfilename);
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}					
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}		
	}
	public static void addProcess(File outdir, X_AD_Process proc, File xmlfile) {
		try {			
			if (proc.getSynchronized() == null)
			{
				proc.setSynchronized(new Timestamp(System.currentTimeMillis()));
				proc.save();
			}			
			if (proc.getIdentifier().length() == 0)
			{
				proc.setIdentifier(Util.getUUID());
				proc.save();
			}								
			HashMap properties = proc.getProperties();
			String roles = (String) properties.get(X_AD_RoleType.COLUMNNAME_BaseRole);
			if (roles == null)
				roles = "";
			String jasperreportsrc = getJasperSource(xmlfile);			
			List<X_AD_Process_Para> params = new Query(Env.getCtx(), X_AD_Process_Para.Table_Name, "AD_Process_ID = ?", null)
			.setParameters(proc.getAD_Process_ID()).list();
			//String menu_id = addMenuProcess(proc);
			StringBuffer header = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			StringBuffer sb = new StringBuffer();		
			sb.append("<process ");
			//Util.append(sb, String.format("%s=\"%s\" ",X_AD_Menu.COLUMNNAME_AD_Menu_ID, menu_id));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process.COLUMNNAME_Value,proc.getName()));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process.COLUMNNAME_Name,proc.getName()));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_RoleType.COLUMNNAME_BaseRole, roles));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_Description,proc.getDescription()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_Help,proc.getHelp()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_Classname,proc.getClassname()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_CategoryName,proc.getCategoryName()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_AccessLevel,proc.getAccessLevel()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_EntityType,proc.getEntityType()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_FileName, xmlfile.getName()));
			Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Menu.COLUMNNAME_Identifier,proc.getIdentifier()));
			Util.append(sb, String.format("\t%s=\"%s\">\n\t",X_AD_Menu.COLUMNNAME_Synchronized,proc.getSynchronized()));
			sb.append(jasperreportsrc);
			if (params != null)
			{				
				for (X_AD_Process_Para param:params)
				{
					if (param.getSynchronized() == null)
					{
						param.setSynchronized(new Timestamp(System.currentTimeMillis()));
						param.save();
					}					
					if (param.getIdentifier().length() == 0)
					{
						param.setIdentifier(Util.getUUID());
						param.save();
					}													
					sb.append("<parameter ");
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Name, param.getName()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Description,param.getDescription()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Help,param.getHelp()));					
					String referenceid = "";
					X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
					.setParameters(param.getAD_Reference_ID()).first();
					if (reference != null)
					{
						referenceid = reference.getIdentifier();							
					}	
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_AD_Reference_ID, referenceid));
					String referencevalueid = "";
					X_AD_Reference referencevalue = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
					.setParameters(param.getAD_Reference_Value_ID()).first();
					if (referencevalue != null)
					{
						referencevalueid = referencevalue.getIdentifier();
					}
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_AD_Reference_Value_ID, referencevalueid));
					String valruleid = "";
					X_AD_Val_Rule valrule = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "AD_Val_Rule_ID = ?", null)
					.setParameters(param.getAD_Val_Rule_ID()).first();
					if (valrule != null)							
					{
						valruleid = valrule.getIdentifier();
					}
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_AD_Val_Rule_ID, valruleid));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_ColumnName, param.getColumnName()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_FieldLength, param.getFieldLength()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_IsMandatory, param.isMandatory()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_IsRange, param.isRange()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_DefaultValue, param.getDefaultValue()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_DefaultValue2, param.getDefaultValue2()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_VFormat, param.getVFormat()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_ValueMin, param.getValueMin()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_ValueMax, param.getValueMax()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_SeqNo,param.getSeqNo()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_EntityType,param.getEntityType()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_DisplayLogic,param.getDisplayLogic()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_ReadOnlyLogic,param.getReadOnlyLogic()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Identifier, param.getIdentifier()));
					Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Synchronized, param.getSynchronized()));
					sb.append("/>\n");
				}
			}
			Util.append(sb, String.format("</process>\n"));
			header.append(sb);
			try {
				SAXBuilder sb2=new SAXBuilder();
				Document doc=sb2.build(new StringReader(header.toString()));
		
				Format xx = Format.getPrettyFormat();
				XMLOutputter xmOut=new XMLOutputter(xx);
				String sfilename =  xmOut.outputString(doc);	
				String name = xmlfile.getName();
				int pos = name.lastIndexOf(".");
				if (pos > 0) {
					name = name.substring(0, pos);
				}							
				PrintWriter out = new PrintWriter(outdir.getAbsolutePath()+System.getProperty("file.separator")+name+".xml");
				//PrintWriter out = new PrintWriter(outdir.getAbsolutePath()+System.getProperty("file.separator")+Util.cleanWhitespace(proc.getName())+".xml");
				out.println(sfilename);
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}					
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	
	public static void addMenu(X_AD_Menu menu, HashMap menus) {
		String Menuid = menu.getIdentifier();		
		//List<String> newmenu = new ArrayList<String>(); 
		X_AD_TreeNodeMM node = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "Node_ID = ?", null)
			.setParameters(menu.getAD_Menu_ID()).first();
		int level = 9;
		while (node != null)
		{
			X_AD_Menu parentmenu = null;
			String parentid = "";
			int parent_id = node.getParent_ID();
			if (parent_id > 0)
			{
				parentmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
					.setParameters(parent_id).first();
				if (parentmenu != null)
				{
					if (parentmenu.getSynchronized() == null)
					{
						parentmenu.setSynchronized(new Timestamp(System.currentTimeMillis()));
						parentmenu.save();
					}
					if (parentmenu.getIdentifier().length() == 0)
					{
						parentmenu.setIdentifier(Util.getUUID());
						parentmenu.save();
					}					
					node = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "Node_ID = ?", null)
						.setParameters(parent_id).first();
					parentid = parentmenu.getIdentifier();
				}
				else
					node = null;						
			}
			else
				node = null;
			//
			if (!menus.containsKey(menu.getIdentifier()))
			{
				Vector vector = new Vector();
				vector.add(parentid);
				vector.add(menu);
				vector.add(level);
				menus.put(menu.getIdentifier(), vector);
				//newmenu.add(menu.getIdentifier());
			}
			if (parentmenu != null)
				menu = parentmenu;
			level--;
		}		
//		for (Object key : menus.keySet()) {
//			String id = (String) key;
//			if (newmenu.contains(id))
//			{
//				Vector vector = (Vector) menus.get(key);
//				//int oldlevel = (Integer) vector.lastElement();
//				//int newlevel = oldlevel - level;
//				//vector.set(2, newlevel);
//			}
//		}
	}
}
