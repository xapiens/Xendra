package org.xendra.developer;

import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.columba.core.io.DiskIO;
import org.columba.core.xml.XMLCoreParser;
import org.compiere.Xendra;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_TreeNode;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Document;
import org.jdom.input.DOMBuilder;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class jasperreporttoxml extends XMLCoreParser {
	private String path = System.getProperty("user.home").concat("/model/");
	private HashMap menumap = new HashMap();
	private HashMap processmap = new HashMap();
	
	protected String doIt() throws Exception {		
		String where = "AD_Process_ID in (1000062, 1000065)";
		List<X_AD_Process> procs = new Query(Env.getCtx(), X_AD_Process.Table_Name, where, null).list();
		for (X_AD_Process proc:procs)
		{
			addProcess(proc);		
		}
		createPlugin();
		return null;
	}
	
	private void createPlugin() {
		StringBuffer header = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		StringBuffer sb = new StringBuffer();
		sb.append("<plugin>");
		sb.append("<menu>");
		for (Iterator it = menumap.entrySet().iterator(); it.hasNext();)
		{
			Map.Entry entry = (Map.Entry) it.next();
			String id = (String) entry.getKey();
			Vector props = (Vector) entry.getValue();
			String parentid = (String) props.get(0);
			X_AD_Menu menu = (X_AD_Menu) props.get(1);
			if (menu.getSynchronized() == null)
			{
				menu.setSynchronized(new Timestamp(System.currentTimeMillis()));
				menu.save();
			}
						
			sb.append("<menuitem ");
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_Menu.COLUMNNAME_Name,menu.getName()));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_Menu.COLUMNNAME_Description,menu.getDescription()));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_Menu.COLUMNNAME_IsSummary,menu.isSummary()));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_Menu.COLUMNNAME_IsSOTrx,menu.isSOTrx()));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_Menu.COLUMNNAME_IsReadOnly,menu.isReadOnly()));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_TreeNode.COLUMNNAME_Parent_ID,parentid));
			Util.append(sb, String.format("%s=\"%s\" ",X_AD_Menu.COLUMNNAME_Identifier,menu.getIdentifier()));
			Util.append(sb, String.format("%s=\"%s\"/>",X_AD_Menu.COLUMNNAME_Synchronized,menu.getSynchronized()));			
		}			
		sb.append("</menu>");		
		sb.append("</plugin>");	
		header.append(sb);
		
		try {
			SAXBuilder sb2=new SAXBuilder();
			Document doc=sb2.build(new StringReader(header.toString()));
	
			Format xx = Format.getPrettyFormat();
			XMLOutputter xmOut=new XMLOutputter(xx);
			String sfilename =  xmOut.outputString(doc);	

			PrintWriter out = new PrintWriter(path+"plugin.xml");
			out.println(sfilename);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void addProcess(X_AD_Process proc) {
		String jasperreportsrc = getJasperReport(proc);
		HashMap map = new HashMap();
		map.put(X_AD_Process.COLUMNNAME_AD_Process_ID, proc);
		map.put(X_AD_Process.COLUMNNAME_JasperReport, jasperreportsrc);
		List<X_AD_Process_Para> params = new Query(Env.getCtx(), X_AD_Process_Para.Table_Name, "AD_Process_ID = ?", null)
			.setParameters(proc.getAD_Process_ID()).list();
		map.put(X_AD_Process_Para.COLUMNNAME_AD_Process_Para_ID, params);
		String menu_id = addMenuProcess(proc);
		map.put(X_AD_Menu.COLUMNNAME_AD_Menu_ID, menu_id);
		//
		StringBuffer header = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		StringBuffer sb = new StringBuffer();		
		sb.append("<process ");
		Util.append(sb, String.format("%s=\"%s\" ",X_AD_Menu.COLUMNNAME_AD_Menu_ID, menu_id));
		Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process.COLUMNNAME_Value,proc.getName()));
		Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process.COLUMNNAME_Name,proc.getName()));
		Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_Description,proc.getDescription()));
		Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_Help,proc.getHelp()));
		Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_AccessLevel,proc.getAccessLevel()));
		Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Process.COLUMNNAME_EntityType,proc.getEntityType()));			
		Util.append(sb, String.format("\t%s=\"%s\" ",X_AD_Menu.COLUMNNAME_Identifier,proc.getIdentifier()));
		Util.append(sb, String.format("\t%s=\"%s\">\n\t",X_AD_Menu.COLUMNNAME_Synchronized,proc.getSynchronized()));
		sb.append(jasperreportsrc);
		if (params != null)
		{				
			for (X_AD_Process_Para param:params)
			{
				sb.append("<parameter ");
				Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Name, param.getName()));
				Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Description,param.getDescription()));
				Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_Help,param.getHelp()));					
				if (param.getAD_Reference_ID() >  0)
				{
					X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
					.setParameters(param.getAD_Reference_ID()).first();
					if (reference != null)
					{
						Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_AD_Reference_ID, reference.getIdentifier()));
					}
				}
				if (param.getAD_Reference_Value_ID() > 0)
				{
					X_AD_Reference reference = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "AD_Reference_ID = ?", null)
					.setParameters(param.getAD_Reference_Value_ID()).first();
					if (reference != null)
					{
						Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_AD_Reference_Value_ID, reference.getIdentifier()));
					}
				}
				if (param.getAD_Val_Rule_ID() > 0)
				{
					X_AD_Val_Rule valrule = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "AD_Val_Rule_ID = ?", null)
					.setParameters(param.getAD_Val_Rule_ID()).first();
					if (valrule != null)							
					{
						Util.append(sb, String.format("%s=\"%s\" ",X_AD_Process_Para.COLUMNNAME_AD_Val_Rule_ID, valrule.getIdentifier()));
					}
				}
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

			PrintWriter out = new PrintWriter(path+Util.cleanWhitespace(proc.getName())+".xml");
			out.println(sfilename);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private String getJasperReport(X_AD_Process process) {
		String filename = "";		
		if ( process.getJasperReport() != null)
		{				
			try {
				InputStream is = DiskIO.getResourceStream(process.getJasperReport());
				Document doc = retrieveDocument(is);				
				Format xx = Format.getRawFormat().setOmitDeclaration(true);
				XMLOutputter xmOut=new XMLOutputter(xx);
				filename =  xmOut.outputString(doc);		
	
			} catch (Exception e) {
				filename = "";
			}		

		}
		else
		{

		}	
		return filename;
	}

	private String addMenuProcess(X_AD_Process process) {
		String Menuid = "";
		X_AD_Menu menu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Process_ID = ?", null)
				.setParameters(process.getAD_Process_ID()).first();
		if (menu != null)
		{				
			Menuid = menu.getIdentifier();
			common.addMenu(menu, menumap);
		}
		return Menuid;
	}
	

	public static void main(String[] args) {
		Xendra.startup(true);
		jasperreporttoxml sp = new jasperreporttoxml();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
