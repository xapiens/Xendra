/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2012 Francisco Morosini, Inc. All Rights Reserve             *
 * This program is free software;											  *
 you can redistribute it and/or modify it    								  *
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
package org.xendra.developer;

import org.compiere.model.MColumn;
import org.compiere.model.MFunction;
import org.compiere.model.MTable;
import org.compiere.model.MView;
import org.compiere.model.MWindow;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Function;
import org.compiere.model.persistence.X_AD_Package;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.model.persistence.X_AD_View;
import org.compiere.model.persistence.X_AD_Window;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class viewstoAnnotation extends SvrProcess {
	private int m_AD_Table_ID;
	private String mFileName;
	private MTable table = null;
	private static Timestamp now = new Timestamp(System.currentTimeMillis());		
	private String path = System.getProperty("user.home").concat("/model/");
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Table_ID"))
				m_AD_Table_ID = para[i].getParameterAsInt();			
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}
	private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	protected String doIt () throws Exception 
	{
		GenerateModelView mv = new GenerateModelView();
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder(" SELECT COALESCE(adv.line,0),")
		.append("pc.oid,")
		.append("pv.viewname,")
		.append("pv.viewowner,")
		.append("pv.definition,")
		.append("d.description")
		.append(" FROM pg_views pv ")											
		.append(" JOIN pg_class pc ON pv.viewname = pc.relname ")											
		.append(" LEFT JOIN pg_description As d ON (d.objoid = pc.oid AND d.objsubid = 0)")
		.append(" LEFT OUTER JOIN xendra.ad_view adv on pv.viewname = adv.name ")
		.append(" WHERE pv.schemaname = 'xendra'  ORDER BY 1 ");
		try
		{
			StringBuffer sbcontainer = new StringBuffer();
			pstmt = DB.prepareStatement (sql.toString(), get_TrxName());
			ResultSet rs = pstmt.executeQuery ();			
			Integer oid = 0;
			String name = null;
			String funcname = null;
			String owner = null;
			String definition = null;
			String description = null;
			StringBuffer sb = null;			
			while (rs.next ())
			{
				sb = new StringBuffer();
				name = "";
				owner = "";
				definition = "";
				description = "";
				//Boolean IsChanged = false;
				name = Util.getvalue(rs, "viewname");
				funcname = "VIEW_"+Util.getStringclean(name);
				oid = rs.getInt("oid");
				owner  = Util.getvalue (rs, "viewowner");
				definition = Util.getvalue (rs, "definition");
				description = Util.getvalue(rs, "description");
				Timestamp currentSynchro = null;
				String Identifier = null;
				//String extension = "";
				MView oview = null;
				Hashtable props = Util.getProperties(description);
				System.out.println(props);
				Iterator keys = props.keySet().iterator();
				if (props.size() == 0)
				{
					props.put(X_AD_Function.COLUMNNAME_Identifier, Util.getUUID());
					props.put(X_AD_Function.COLUMNNAME_Synchronized, new Timestamp(System.currentTimeMillis()));
					Identifier = (String) props.get(X_AD_Function.COLUMNNAME_Identifier);
					description = String.format("@%s=%s\n", X_AD_Function.COLUMNNAME_Identifier,  props.get(X_AD_Function.COLUMNNAME_Identifier));
					description += String.format("@%s=%s\n",X_AD_Function.COLUMNNAME_Synchronized, props.get(X_AD_Function.COLUMNNAME_Synchronized));
					StringBuilder sqlc  = new StringBuilder("COMMENT ON VIEW xendra.")
					.append(name).append(" IS '").append(description).append("'");
					int no = DB.executeUpdate(sqlc.toString(), null);
				}				
				Identifier = (String) props.get(MFunction.COLUMNNAME_Identifier);
				if (Identifier == null || Identifier.length() == 0)
					Identifier = Util.getUUID();

				oview = MView.getbyIdentifier(Identifier);
				if (oview == null)
				{						
					oview = new MView(Env.getCtx(),0, null);												
					oview.setIdentifier(Identifier);
				}
				oview.setName(name);
				oview.setOwner(owner);
				oview.setDefinition(definition);
				keys = props.keySet().iterator();
				description = "";
				String comment = "";
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					description += String.format("@%s=%s\n", key, value);
					if (oview.get_ColumnIndex(key) >= 0)
					{
						if (key.equals(X_AD_Function.COLUMNNAME_Synchronized))
							oview.setSynchronized((Timestamp) value);
						else	
							oview.set_ValueOfColumn(key, value);
					}
				}
				oview.setComments(description);													
				oview.save();

				MTable table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "lower(name) = lower(?)", null).setParameters(name).first();
				if (table != null)
				{
					if (!table.isView())
					{
						table.setIsView(true);
						table.save();
					}				
					if (table.getSynchronized() == null)
					{
						table.setSynchronized(oview.getSynchronized());
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
				.append(String.format("%s=\"%s\",\n",X_AD_View.COLUMNNAME_Identifier,oview.getIdentifier()))
				.append(String.format("%s=\"%s\",\n",X_AD_View.COLUMNNAME_Synchronized,oview.getSynchronized()))
				//.append(String.format("%s=\"%s\",\n",X_AD_View.COLUMNNAME_Comments,oview.getComments()))					
				.append(String.format("%s=\"%s\",\n",X_AD_View.COLUMNNAME_Name,oview.getName()))
				.append(String.format("%s=\"%s\",\n",X_AD_View.COLUMNNAME_Owner,oview.getOwner()))
				.append(String.format("%s=\"%s\")\n",X_AD_View.COLUMNNAME_Extension,oview.getExtension()));
				sb = sb.append("\tpublic static final String ").append(oview.COLUMNNAME_Identifier)
						.append(" = \"").append(oview.getIdentifier()).append("\";").append("\n");
				sb = sb.append("\tpublic static final String getComments() { ");
				sb = sb.append("\tStrBuilder sb = new StrBuilder(); ");
				String[] tokens = oview.getComments().split("\n");
				for (String token:tokens)
				{
					sb = sb.append("\tsb.appendln(\"").append(token).append("\");");
				}
				sb.append("\treturn sb.toString();}");

				sb = sb.append("\tpublic static final String getDefinition() { ");
				sb = sb.append("\tStrBuilder sb = new StrBuilder(); ");
				tokens = oview.getDefinition().split("\n");					
				for (String token:tokens)
				{
					token = token.replaceAll(";", ";;");
					token = token.replaceAll("\"", "\\\\\"");
					sb = sb.append("\tsb.appendln(\"").append(token).append("\");");
				}
				sb.append("\treturn sb.toString();}");
				sbcontainer = sbcontainer.append("\tpublic static final String ").append(funcname).append(String.format("=\"%s\"",oview.getIdentifier())).append(";");
				createView(funcname, sb);					
				//				}				
			}
			createViewList(sbcontainer);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	private void createView(String funcname, StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.view;\n\n");
		header = header.append("import org.xendra.annotations.*;");
		header = header.append("import org.apache.commons.lang.text.StrBuilder;");
		header = header.append("import org.compiere.model.View;\n");		
		header = header.append("public class ").append(funcname).append(" { ");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+funcname+".java");
	}

	private void createViewList(StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.view;\n\n");
		header = header.append("public class ViewList { \n");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+"ViewList.java");
	}

	public static void writeXmlToFile(String pFilename, Document pDocument) {
		try {
			Source source = new DOMSource(pDocument);
			File file = new File(pFilename);
			Result result = new StreamResult(file);
			// usa serializer.jar 
			Transformer xformer = TransformerFactory.newInstance().newTransformer();
			xformer.setOutputProperty(OutputKeys.INDENT, "yes"); // add newlines
			xformer.transform(source, result);
		}
		catch (TransformerException e) {
			e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
		}
	}
	public static void main(String[] args)
	{
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);
		viewstoAnnotation sp = new viewstoAnnotation();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    

}
