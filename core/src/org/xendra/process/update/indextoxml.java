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

import org.compiere.model.MTable;
import org.compiere.model.MIndex;
import org.compiere.model.persistence.X_AD_Index;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
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

public class indextoxml extends SvrProcess {
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

		PreparedStatement pstmt = null;		
		StringBuilder sql = new StringBuilder(" SELECT ")	
								.append(" t.relname as table_name, ")
								.append(" i.relname as index_name, ")
								.append(" indisunique as isunique,")
								.append(" array_to_string(array_agg(a.attname), ', ') as column_names, ")
								.append(" d.description as comments ")
								.append(" FROM ")
								.append(" pg_class t")
								.append(" JOIN pg_catalog.pg_namespace n ON n.oid = t.relnamespace,")
								.append(" pg_class i")
								.append(" LEFT JOIN pg_description As d ON (d.objoid = i.oid AND d.objsubid = 0), ")
								.append(" pg_index ix,")
								.append(" pg_attribute a")
								.append(" WHERE ")
								.append("	t.oid = ix.indrelid")
								.append("	and i.oid = ix.indexrelid")
								.append("	and a.attrelid = t.oid")
								.append("	and a.attnum = ANY(ix.indkey)")
								.append("	and t.relkind = 'r' ")
								//.append("	--and t.relname like 'test%'")
								//.append("	--AND indisunique != 't'")
								.append("	AND indisprimary != 't'")          
								.append("	AND n.nspname = 'xendra'")
								.append("	group by ")
								.append("	t.relname,")
								.append("	i.relname,")
								.append("   indisunique,")
								.append("   d.description")
								.append("	order by")
								.append("	t.relname,")
								.append("	i.relname;");			
		try
		{
			pstmt = DB.prepareStatement (sql.toString(), get_TrxName());
			ResultSet rs = pstmt.executeQuery ();			
			String table_name = null;
			String index_name = null;
			String Column_Names = null;
			String comments = null;
			Boolean IsUnique = false;
			StringBuffer sb = new StringBuffer();			
			while (rs.next ())
			{
				table_name = "";
				index_name = "";
				Column_Names = "";
				comments = "";
				IsUnique = false;

				Boolean IsChanged = false;
				table_name = Util.getvalue(rs, "table_name");
				index_name = Util.getvalue(rs, "index_name");
				IsUnique   = rs.getBoolean("isunique");
				Column_Names  = Util.getvalue (rs, "column_names");
				comments = Util.getvalue (rs, "comments");				
				
				System.out.println(index_name);
				String refFileName = path+"i_"+index_name+".xml";
								
				Timestamp currentSynchro = null;
				String Identifier = null;
				
				MIndex oindex = null;
				
				List plist = new Vector();
				StringTokenizer tpok = new StringTokenizer(comments, "@");				
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
							}
						}
					}
				}
				if (Identifier == null || Identifier.length() == 0)
				{					
					throw new Exception(index_name+" no tiene definido el campo \"uuid\", es obligatoria su definición");
				}
				else if (currentSynchro == null)
				{
					throw new Exception(index_name+" no tiene definiddo el campo \"updated\", es obligatoria su definición");
				}
				if (Identifier != null && currentSynchro != null)
				{
					MTable table = MTable.getbyTableName(table_name, null);
					
					oindex = MIndex.getbyIdentifier(Identifier);
					if (oindex == null)
					{						
						oindex = new MIndex(Env.getCtx(),0, null);												
						oindex.setIdentifier(Identifier);
						oindex.setIsUnique(IsUnique);
						oindex.setSynchronized(currentSynchro);
						oindex.setComments(comments);						
						oindex.setColumn_Names(Column_Names);
						oindex.setName(index_name);	
						oindex.setIsUnique(IsUnique);
						oindex.setTableIdentifier(table.getIdentifier());
						oindex.save();
						IsChanged = true;
					}
					else
					{
						if (oindex.getSynchronized() == null || oindex.getSynchronized().compareTo(currentSynchro) < 0)
						{							
							oindex.setSynchronized(currentSynchro);
							oindex.setIsUnique(IsUnique);
							oindex.setComments(comments);	
							oindex.setColumn_Names(Column_Names);
							oindex.save();
							IsChanged = true;
						}
					}
				}					
				if (IsChanged)
				{
					// si la vista esta definida en el AD_Table tomar ese identificador
					System.out.println(index_name);					
					Document doc = builder.newDocument();
					Element elemView = doc.createElement("index");
					Element root = doc.createElement("xml");
					doc.appendChild(root);				
					root.appendChild(elemView);
					Util.setattrToElem(elemView, oindex, X_AD_Index.COLUMNNAME_Name);
					Util.setattrToElem(elemView, oindex, X_AD_Index.COLUMNNAME_Identifier);					
					Util.setattrToElem(elemView, oindex, X_AD_Index.COLUMNNAME_Column_Names);
					Util.setattrToElem(elemView, oindex, X_AD_Index.COLUMNNAME_IsUnique);
					Util.setattrToElem(elemView, oindex, X_AD_Index.COLUMNNAME_TableIdentifier);
					Util.setattrToElem(elemView, oindex, X_AD_Index.COLUMNNAME_Synchronized);
					Util.setattrToElem(elemView, oindex, X_AD_Index.COLUMNNAME_Comments);
					writeXmlToFile(refFileName, doc);
				}
				sb = sb.append("public static final String INDEXNAME_").append(index_name).append(" = \"").append(Identifier).append("\";").append("\n");
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
		StringBuffer header = new StringBuffer("package org.compiere.model.index;\n\n");
		header = header.append("public class X_AD_IndexList { \n");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+"X_AD_IndexList.java");
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
		indextoxml sp = new indextoxml();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    

}
