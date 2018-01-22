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
package org.xendra.process.update;

import org.compiere.model.MColumn;
import org.compiere.model.MTable;
import org.compiere.model.MView;
import org.compiere.model.MWindow;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Table;
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

public class viewstoxml extends SvrProcess {
	private int m_AD_Table_ID;
	private String mFileName;
	private MTable table = null;
	private static Timestamp now = new Timestamp(System.currentTimeMillis());
	private DocumentBuilder builder = null;

	private String path = "C:\\Users\\xapiens\\activedictionary\\";
	//private String path = "/home/xapiens/activedictionary/";
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
		builder = factory.newDocumentBuilder();		

		//int no = DB.executeUpdate("update xendra.ad_view set isactive = 'N';", null);
		//System.out.println("desactivando "+no+" vistas");

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
			pstmt = DB.prepareStatement (sql.toString(), get_TrxName());
			ResultSet rs = pstmt.executeQuery ();			
			Integer oid = 0;
			String name = null;
			String owner = null;
			String definition = null;
			String description = null;
			StringBuffer sb = new StringBuffer();			
			while (rs.next ())
			{
				name = "";
				owner = "";
				definition = "";
				description = "";

				Boolean IsChanged = false;
				name = Util.getvalue(rs, "viewname");
				oid = rs.getInt("oid");
				owner  = Util.getvalue (rs, "viewowner");
				definition = Util.getvalue (rs, "definition");
				description = Util.getvalue(rs, "description");
				
				System.out.println(name);
				String refFileName = path+"v_"+name+".xml";
				
				
				Timestamp currentSynchro = null;
				String Identifier = null;
				String extension = "";
				MView oview = null;
				
				List plist = new Vector();
				StringTokenizer tpok = new StringTokenizer(description, "@");				
				while (tpok.hasMoreTokens()) {
					String token = tpok.nextToken();
					plist.add(token);
				}				
				if (plist.size() > 0)
				{										
					for (int j = 0; j < plist.size(); j++) {
						String token = plist.get(j).toString();
						tpok = new StringTokenizer(token, "=");
						while (tpok.hasMoreTokens()) {
							String varname = tpok.nextToken();
							if (tpok.hasMoreTokens())
							{
								String varvalue = tpok.nextToken();
								if (varname.equals("updated"))
								{	
									currentSynchro = Timestamp.valueOf(varvalue);
									Calendar cal = Calendar.getInstance(); // locale-specific
									cal.setTime(currentSynchro);
									cal.set(Calendar.MILLISECOND, 0);
									currentSynchro = new Timestamp(cal.getTimeInMillis());
								}
								if (varname.equals("uuid"))
								{
									Identifier = varvalue.trim();
								}
								if (varname.equals("extension"))
								{
									extension = varvalue.trim();
								}
							}
						}
					}
				}
				if (Identifier == null || Identifier.length() == 0)
				{					
					throw new Exception(name+" no tiene definido el campo \"uuid\", es obligatoria su definición");
				}
				else if (currentSynchro == null)
				{
					throw new Exception(name+" no tiene definiddo el campo \"updated\", es obligatoria su definición");
				}
				if (Identifier != null && currentSynchro != null)
				{
					oview = MView.getbyIdentifier(Identifier);
					if (oview == null)
					{						
						oview = new MView(Env.getCtx(),0, null);												
						oview.setIdentifier(Identifier);
						oview.setDefinition(definition);
						oview.setSynchronized(currentSynchro);
						oview.setComments(description);
						//
						oview.setName(name);
						oview.setOwner(owner);
						oview.setExtension(extension);
						//oview.setIsReplicated(true);
						oview.save();
						IsChanged = true;
					}
					else
					{
						if (oview.getSynchronized() == null || oview.getSynchronized().compareTo(currentSynchro) < 0)
						{
							oview.setDefinition(definition);
							oview.setSynchronized(currentSynchro);
							oview.setComments(description);							
							oview.save();
							IsChanged = true;
						}
					}
				}					
				if (IsChanged)
				{
					// si la vista esta definida en el AD_Table tomar ese identificador
					System.out.println(name);
					Boolean isADTable = false;
					Document doc = builder.newDocument();
					Element elemView = doc.createElement("view");

					if (table!=null && table.getAD_Table_ID() > 0)
					{
						oview.setIdentifier(Identifier);
						isADTable = true;					
						Util.setattrToElem(elemView, table, X_AD_Table.COLUMNNAME_Name);
						Util.setattrToElem(elemView, table, X_AD_Table.COLUMNNAME_Description);
						Util.setattrToElem(elemView, table, X_AD_Table.COLUMNNAME_Help);
						Util.setattrToElem(elemView, table, X_AD_Table.COLUMNNAME_TableName);
						Util.setattrToElem(elemView, table, X_AD_Table.COLUMNNAME_AccessLevel);
						Util.setattrToElem(elemView, table, X_AD_Table.COLUMNNAME_EntityType);
						Util.setattrToElem(elemView, table, X_AD_Table.COLUMNNAME_IsView);
						String windowIdentifier = "";
						if (table.getAD_Window_ID() > 0)
						{						
							MWindow window = new MWindow(Env.getCtx(), table.getAD_Window_ID(), get_TrxName());
							if (window.getAD_Window_ID() == table.getAD_Window_ID())
								windowIdentifier = window.getIdentifier();													
						}
						elemView.setAttribute("window", windowIdentifier);
						elemView.setAttribute("table", Identifier);

						Util.setattrToElem(elemView, table, X_AD_Table.COLUMNNAME_IsSecurityEnabled);
						Util.setattrToElem(elemView, table, X_AD_Table.COLUMNNAME_IsDeleteable);
						Util.setattrToElem(elemView, table, X_AD_Table.COLUMNNAME_IsHighVolume);
						Util.setattrToElem(elemView, table, X_AD_Table.COLUMNNAME_IsChangeLog);
						for (MColumn c:table.getColumns(true))
						{
							c.setSynchronized(now);
							Element vc = doc.createElement("column");
							Element xelement = DBtoxml.buildelement(doc, c);						
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_Description);
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_Help);
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_Version);
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_EntityType);
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_ColumnName);
							DBtoxml.buildreference(path, vc, "AD_Reference_ID", c.getAD_Reference_ID());
							DBtoxml.buildreference(path, vc, "AD_Reference_Value_ID", c.getAD_Reference_Value_ID());
							vc.setAttribute("isactive", c.isActive() ? "Y":"N");
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_IsMandatory);
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_FieldLength);
							DBtoxml.buildvalidation(path, vc, "AD_Val_Rule",c.getAD_Val_Rule_ID());
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_IsUpdateable);
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_IsParent);
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_IsKey);
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_Callout);
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_DefaultValue);
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_Identifier);
							Util.setattrToElem(vc, c, X_AD_Column.COLUMNNAME_Synchronized);
							vc.appendChild(xelement);
							elemView.appendChild(vc);

						}
					}
					else
					{
						elemView.setAttribute(X_AD_View.COLUMNNAME_Name, name);
						elemView.setAttribute(X_AD_Table.COLUMNNAME_TableName, name);															
					}
					elemView.setAttribute(X_AD_View.COLUMNNAME_Identifier, Identifier);
					elemView.setAttribute("isadtable", isADTable ? "Y" : "N");
					elemView.setAttribute(X_AD_View.COLUMNNAME_Owner, owner);
					elemView.setAttribute(X_AD_View.COLUMNNAME_Comments, description);
					elemView.setAttribute(X_AD_View.COLUMNNAME_Extension, extension);
					Element root = doc.createElement("xml");
					doc.appendChild(root);				
					Element viewsource = doc.createElement("viewsource");
					CDATASection cdata = doc.createCDATASection(definition);
					viewsource.appendChild(cdata);
					elemView.appendChild(viewsource);
					root.appendChild(elemView);
					Util.setattrToElem(elemView, oview, X_AD_View.COLUMNNAME_Synchronized);
					writeXmlToFile(refFileName, doc);
				}
				sb = sb.append("public static final String VIEWNAME_").append(name).append(" = \"").append(Identifier).append("\";").append("\n");
			}
			createViewList(sb);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	private void createViewList(StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.view;\n\n");
		header = header.append("public class X_AD_ViewList { \n");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+"X_AD_ViewList.java");
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
		viewstoxml sp = new viewstoxml();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    

}
