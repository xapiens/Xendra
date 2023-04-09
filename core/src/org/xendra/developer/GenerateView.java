package org.xendra.developer;

import java.io.File;
import java.sql.Timestamp;
import org.compiere.model.MTable;
import org.compiere.model.MView;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Function;
import org.compiere.model.persistence.X_AD_Package;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_View;
import org.compiere.model.persistence.X_AD_Window;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Element;
import java.util.logging.Level;

public class GenerateView {
	private String path;
	private static CLogger	log	= CLogger.getCLogger (GenerateProcedure.class);
	public GenerateView(String filepath) {
		path = filepath;
	}
	public static void main(Object[] args) {
		String path = (String) args[0];
		Element e = (Element) args[1];
		CLogMgt.setLevel(Level.WARNING);
		log.warning("Generate View   $Revision: 0.1 $");
		log.warning("----------------------------------");
		log.warning("Directory: " + path);
		MView view = new MView(Env.getCtx(), 0, null);
		view.setName(e.getAttributeValue(X_AD_View.COLUMNNAME_Name));
		view.setComments(e.getAttributeValue(X_AD_View.COLUMNNAME_Comments));
		view.setOwner(e.getAttributeValue(X_AD_View.COLUMNNAME_Owner));
		view.setDefinition(e.getAttributeValue(X_AD_View.COLUMNNAME_Definition));
		view.setIdentifier(e.getAttributeValue(X_AD_View.COLUMNNAME_Identifier));
		String sync = e.getAttributeValue(X_AD_Function.COLUMNNAME_Synchronized);
		Timestamp tsync = Timestamp.valueOf(sync);
		view.setSynchronized(tsync);
		GenerateView gp = new GenerateView(path);
		int count = gp.createView(view);		
		log.warning("Generated = " + count);
	}
	private int createView(MView view) {
		String name = view.getName();
		String funcname = "VIEW_"+Util.getStringclean(name);
		StringBuffer sbcontainer = new StringBuffer();
		StringBuffer sb = new StringBuffer();
		GenerateModelView mv = new GenerateModelView();
		MTable table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "lower(name) = lower(?)", null).setParameters(view.getName()).first();
		if (table != null)
		{
			if (!table.isView())
			{
				table.setIsView(true);
				table.save();
			}				
			if (table.getSynchronized() == null)
			{
				table.setSynchronized(view.getSynchronized());
				table.save();
			}
			String windowid="";
			if (table.getAD_Window_ID() > 0)						
			{
				X_AD_Window window = new Query(Env.getCtx(), X_AD_Window.Table_Name, "AD_Window_ID = ?", null).setParameters(table.getAD_Window_ID()).first();
				if (window != null)
					windowid = window.getIdentifier();						
			}
			String pkgid = "";
			String pluginid = "";
			X_AD_Package pkg = new Query(Env.getCtx(),X_AD_Package.Table_Name, "AD_Package_ID = ?", null)
				.setParameters(table.getAD_Package_ID()).first();
			if (pkg != null) {
				pkgid = pkg.getIdentifier();
			}
			X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?", null)
				.setParameters(table.getAD_Plugin_ID()).first();
			if (plugin != null) {
				pluginid = plugin.getIdentifier();
			}								
			Util.append(sb, "\n@XendraTable(");
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_Name,table.getName()));				
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_AD_Package_ID,pkgid));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_AD_Plugin_ID,pluginid));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_Description,table.getDescription()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_Help,table.getHelp()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_TableName,table.getTableName()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_AccessLevel,table.getAccessLevel()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_AD_Window_ID, windowid));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_AD_Val_Rule_ID,""));
			Util.append(sb, String.format("%s=%s,",X_AD_Column.COLUMNNAME_IsKey,0));
			Util.append(sb, String.format("%s=%s,",X_AD_Table.COLUMNNAME_LoadSeq,table.getLoadSeq()));
			Util.append(sb, String.format("%s=%s,",X_AD_Table.COLUMNNAME_IsSecurityEnabled,table.isSecurityEnabled()));
			Util.append(sb, String.format("%s=%s,",X_AD_Table.COLUMNNAME_IsDeleteable,table.isDeleteable()));
			Util.append(sb, String.format("%s=%s,",X_AD_Table.COLUMNNAME_IsHighVolume,table.isHighVolume()));
			Util.append(sb, String.format("%s=%s,",X_AD_Table.COLUMNNAME_IsChangeLog,table.isChangeLog()));
			Util.append(sb, String.format("%s=%s,",X_AD_Table.COLUMNNAME_IsView,table.isView()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_PO_Window_ID,""));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_ID,table.getID()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Table.COLUMNNAME_Identifier,table.getIdentifier()));
			Util.append(sb, String.format("%s=\"%s\")\n",X_AD_Table.COLUMNNAME_Synchronized,table.getSynchronized()));
			sb.append( "/** TableName=").append(table.getTableName()).append(" */\n"
					+ "public static final String Table_Name=\"").append(table.getTableName()).append("\";\n");					
			StringBuffer mandatory = new StringBuffer();
			sb.append(mv.createColumns(table.getAD_Table_ID(), mandatory));					
		}
		sb.append("\t@XendraView(")
		.append(String.format("%s=\"%s\",\n",X_AD_View.COLUMNNAME_Identifier,view.getIdentifier()))
		.append(String.format("%s=\"%s\",\n",X_AD_View.COLUMNNAME_Synchronized,view.getSynchronized()))
		.append(String.format("%s=\"%s\",\n",X_AD_View.COLUMNNAME_Name,view.getName()))
		.append(String.format("%s=\"%s\",\n",X_AD_View.COLUMNNAME_Owner,view.getOwner()))
		.append(String.format("%s=\"%s\")\n",X_AD_View.COLUMNNAME_Extension,view.getExtension()));
		sb = sb.append("\tpublic static final String ").append(view.COLUMNNAME_Identifier)
				.append(" = \"").append(view.getIdentifier()).append("\";").append("\n");
		sb = sb.append("\tpublic static final String getComments() { ");
		sb = sb.append("\tStrBuilder sb = new StrBuilder(); ");
		String[] tokens = view.getComments().split("\n");
		for (String token:tokens)
		{
			sb = sb.append("\tsb.appendln(\"").append(token).append("\");");
		}
		sb.append("\treturn sb.toString();}");

		sb = sb.append("\tpublic static final String getDefinition() { ");
		sb = sb.append("\tStrBuilder sb = new StrBuilder(); ");
		tokens = view.getDefinition().split("\n");					
		for (String token:tokens)
		{
			token = token.replaceAll(";", ";;");
			token = token.replaceAll("\"", "\\\\\"");
			sb = sb.append("\tsb.appendln(\"").append(token).append("\");");
		}
		sb.append("\treturn sb.toString();}");
		sbcontainer = sbcontainer.append("\tpublic static final String ").append(funcname).append(String.format("=\"%s\"",view.getIdentifier())).append(";");
		createViewFile(funcname, sb);
		File f = new File(path+funcname+".java");
		int count = 0;
		if (f.exists()) {
			count = 1;
		}
		return count;
	}
	private void createViewFile(String funcname, StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.view;\n\n");
		header = header.append("import org.xendra.annotations.*;");
		header = header.append("import org.apache.commons.lang.text.StrBuilder;");
		header = header.append("import org.compiere.model.View;\n");		
		header = header.append("public class ").append(funcname).append(" { ");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+funcname+".java");
	}
}
