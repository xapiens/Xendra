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

import org.compiere.model.MFunction;
import org.compiere.model.MTable;
import org.compiere.model.persistence.X_AD_Function;
import org.compiere.process.ProcessInfo;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.*;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class storeprocedurestoxml extends SvrProcess {
	private String mFileName;
	private DocumentBuilder builder = null;
	private Boolean includeOperators = false;
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
			else if (name.equals("IncludeOperators"))
				includeOperators = para[i].getParameter().equals("Y");			
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}
	private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	public static String getSQLAlloperators()
	{
		StringBuffer sql = new StringBuffer("SELECT op.oprname,op.oprcode as operproc,")
		.append("lt.typname as lefttype,") 
		.append("rt.typname as righttype,")
		.append("co.oprname as compop,  ")
		.append("pg_get_userbyid(op.oprowner) as owner,")
		.append("obj_description(op.oid) as description")	
		.append(" FROM pg_operator op ")
		.append("LEFT OUTER JOIN pg_type lt ON lt.oid=op.oprleft ")
		.append("LEFT OUTER JOIN pg_type rt ON rt.oid=op.oprright ")
		.append("LEFT OUTER JOIN pg_operator co ON co.oid=op.oprcom ")
		.append("WHERE pg_get_userbyid(op.oprowner) = 'xendra' ")
		.append(" ORDER BY op.oprname  ");
		return sql.toString();
	}

	public static String getSQLAllStoreProcedures(String filtername, String arguments)
	{
		StringBuffer sql = new StringBuffer(" SELECT p.proname as functionname,") 
		.append(" CASE WHEN p.proretset THEN 'setof ' ELSE '' END || ")
		.append("  pg_catalog.format_type(p.prorettype, NULL) as output,")
		.append("  CASE WHEN proallargtypes IS NOT NULL THEN")
		.append("    pg_catalog.array_to_string(ARRAY(")
		.append("      SELECT")
		.append("        CASE")
		.append("          WHEN p.proargmodes[s.i] = 'i' THEN ''")
		.append("          WHEN p.proargmodes[s.i] = 'o' THEN 'OUT '")
		.append("          WHEN p.proargmodes[s.i] = 'b' THEN 'INOUT '")
		.append("        END ||")
		.append("        CASE")
		.append("         WHEN COALESCE(p.proargnames[s.i], '') = '' THEN ''")
		.append("          ELSE p.proargnames[s.i] || ' ' ")
		.append("        END ||")
		.append("        pg_catalog.format_type(p.proallargtypes[s.i], NULL)")
		.append("      FROM")
		.append("        pg_catalog.generate_series(1,")
		.append(" pg_catalog.array_upper(p.proallargtypes, 1)) AS s(i)")
		.append("    ), ', ')")
		.append("  ELSE")
		.append("    pg_catalog.array_to_string(ARRAY(")
		.append("      SELECT")
		.append("        CASE")
		.append("          WHEN COALESCE(p.proargnames[s.i+1], '') = '' THEN ''")
		.append("          ELSE p.proargnames[s.i+1] || ' '")
		.append("          END ||")
		.append("        pg_catalog.format_type(p.proargtypes[s.i], NULL)")
		.append("      FROM")
		.append("        pg_catalog.generate_series(0,")
		.append("pg_catalog.array_upper(p.proargtypes, 1)) AS s(i)")
		.append("    ), ', ')")
		.append("  END AS arguments,")
		.append("  r.rolname as owner,")
		.append("  l.lanname as language,")
		.append("  prosrc as sourcecode,")
		.append("  pg_catalog.obj_description(p.oid, 'pg_proc') as comments")
		.append("  FROM pg_catalog.pg_proc p")
		.append("     LEFT JOIN pg_catalog.pg_namespace n ON n.oid = p.pronamespace")
		.append("     LEFT JOIN pg_catalog.pg_language l ON l.oid = p.prolang")
		.append("     JOIN pg_catalog.pg_roles r ON r.oid = p.proowner")
		.append("  WHERE p.prorettype <> 'pg_catalog.cstring'::pg_catalog.regtype")
		.append("      AND (p.proargtypes[0] IS NULL")
		.append("      OR   p.proargtypes[0] <> 'pg_catalog.cstring'::pg_catalog.regtype)")
		.append("      AND NOT p.proisagg");
		if (filtername.length() > 0)
			sql.append(" AND  p.proname = '"+filtername+"'");
		if (arguments.length() > 0)
		{
			sql.append(" AND CASE WHEN proallargtypes IS NOT NULL THEN")
			.append("    pg_catalog.array_to_string(ARRAY(")
			.append("      SELECT")
			.append("        CASE")
			.append("          WHEN p.proargmodes[s.i] = 'i' THEN ''")
			.append("          WHEN p.proargmodes[s.i] = 'o' THEN 'OUT '")
			.append("          WHEN p.proargmodes[s.i] = 'b' THEN 'INOUT '")
			.append("        END ||")
			.append("        CASE")
			.append("         WHEN COALESCE(p.proargnames[s.i], '') = '' THEN ''")
			.append("          ELSE p.proargnames[s.i] || ' ' ")
			.append("        END ||")
			.append("        pg_catalog.format_type(p.proallargtypes[s.i], NULL)")
			.append("      FROM")
			.append("        pg_catalog.generate_series(1,")
			.append(" pg_catalog.array_upper(p.proallargtypes, 1)) AS s(i)")
			.append("    ), ', ')")
			.append("  ELSE")
			.append("    pg_catalog.array_to_string(ARRAY(")
			.append("      SELECT")
			.append("        CASE")
			.append("          WHEN COALESCE(p.proargnames[s.i+1], '') = '' THEN ''")
			.append("          ELSE p.proargnames[s.i+1] || ' '")
			.append("          END ||")
			.append("        pg_catalog.format_type(p.proargtypes[s.i], NULL)")
			.append("      FROM")
			.append("        pg_catalog.generate_series(0,")
			.append("pg_catalog.array_upper(p.proargtypes, 1)) AS s(i)")
			.append("    ), ', ')")
			.append("  END = '"+arguments+"'");
			//.append(" AND arguments = '"+arguments+"'");
		}
		sql.append(" AND nspname = 'xendra' and l.lanname != 'c' ");
		sql.append(" ORDER BY 1, 2, 3, 4 ;		");	
		return sql.toString();
	}

	protected String doIt () throws Exception 
	{
		PreparedStatement pstmt = null;
		builder = factory.newDocumentBuilder();

		if (includeOperators)
		{
			// primero exportamos los operadores							
			try
			{
				String refFileName = path+"operators.xml";
				String Synchronized = getcurrenttime();
				pstmt = DB.prepareStatement(getSQLAlloperators(), get_TrxName());
				ResultSet rs = pstmt.executeQuery();
				Document doc = builder.newDocument();
				Element root = doc.createElement("xml");
				doc.appendChild(root);
				while (rs.next ())
				{
					Element operator = doc.createElement("operator");				
					operator.setAttribute("oprname" ,  	rs.getString("oprname"));
					operator.setAttribute("operproc" ,  rs.getString("operproc"));
					operator.setAttribute("lefttype",  	rs.getString("lefttype"));
					operator.setAttribute("righttype", 	rs.getString("righttype"));
					operator.setAttribute("compop",    	rs.getString("compop"));
					operator.setAttribute("owner", 		rs.getString("owner"));
					operator.setAttribute("description",rs.getString("description"));
					operator.setAttribute(X_AD_Function.COLUMNNAME_Synchronized, Synchronized);
					root.appendChild(operator);											
				}
				writeXmlToFile(refFileName, doc);
				pstmt.close();
				rs.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		// obtenemos todos los store procedures de la DB.				
		try
		{
			pstmt = DB.prepareStatement (getSQLAllStoreProcedures("",""), get_TrxName());
			ResultSet rs = pstmt.executeQuery ();
			String functionname = "";
			String previousfunctionname = "";
			String output = "";
			String arguments = "";
			String owner = "";
			String language = "";
			String sourcecode = "";
			String comments = "";
			//String Identifier = "";
			// desactive all functions, only valid functions can be activated
			//int no = DB.executeUpdate("update xendra.ad_function set isactive = 'N';", null);
			//System.out.println("desactivando "+no+" funciones");											
			//String Synchronized = getcurrenttime();
			StringBuffer sb = new StringBuffer();
			//int sequence = 0;
			while (rs.next ())
			{				
				Boolean IsChanged = false;

				String extension = "";
				
				functionname = Util.getvalue(rs, "functionname");
				//				if (previousfunctionname.equals(functionname))
				//					sequence ++;
				//				else
				//					sequence = 0;

				previousfunctionname = functionname;				

				output = Util.getvalue(rs, "output");
				arguments = Util.getvalue(rs, "arguments");
				owner = Util.getvalue(rs, "owner");
				language = Util.getvalue(rs, "language");
				sourcecode = Util.getvalue(rs, "sourcecode");				
				comments = Util.getvalue(rs, "comments");

				// parseamos
				Timestamp currentSynchro = null;
				String Identifier = null;
				String fsIdentifier = null;

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
									if (Identifier != null)
										fsIdentifier = Identifier.substring(0, Identifier.indexOf("-"));
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
					throw new Exception(functionname+" no tiene definido el campo \"uuid\", es obligatoria su definición");
				}
				else if (currentSynchro == null)
				{
					throw new Exception(functionname+" no tiene definiddo el campo \"updated\", es obligatoria su definición");
				}
				//if (Identifier != null && currentSynchro != null)
				//{
				MFunction ofunction = MFunction.getbyIdentifier(Identifier);
				//}
				//MFunction ofunction = MFunction.get(functionname, arguments);
				if (ofunction == null)
				{
					ofunction = new MFunction(Env.getCtx(), 0, null);
					ofunction.setIdentifier(Identifier);
					ofunction.setName(functionname);
					ofunction.setArguments(arguments);					
					ofunction.setCode(sourcecode);
					ofunction.setOutput(output);
					ofunction.setOwner(owner);
					ofunction.setLanguage(language);
					ofunction.setComments(comments);
					ofunction.setSynchronized(currentSynchro);
					ofunction.setExtension(extension);
					ofunction.save();
					IsChanged = true;
				}
				else
				{
					if (ofunction.getSynchronized() == null || ofunction.getSynchronized().compareTo(currentSynchro) < 0)
					{
						ofunction.setCode(sourcecode);
						ofunction.setArguments(arguments);
						ofunction.setOutput(output);
						ofunction.setOwner(owner);
						ofunction.setSynchronized(currentSynchro);
						ofunction.setExtension(extension);
						ofunction.setComments(comments);
						ofunction.save();
						IsChanged = true;
					}
				}

				if (IsChanged)
				{
					String refFileName = path+"f_"+functionname+"_"+fsIdentifier+".xml";
					Document doc = builder.newDocument();
					Element root = doc.createElement("xml");
					doc.appendChild(root);
					Element function = doc.createElement("function");				
					Util.setattrToElem(function, ofunction, X_AD_Function.COLUMNNAME_Name);
					Util.setattrToElem(function, ofunction, X_AD_Function.COLUMNNAME_Comments);
					Util.setattrToElem(function, ofunction, X_AD_Function.COLUMNNAME_Output);
					Util.setattrToElem(function, ofunction, X_AD_Function.COLUMNNAME_Owner);
					Util.setattrToElem(function, ofunction, X_AD_Function.COLUMNNAME_Language);
					Util.setattrToElem(function, ofunction, X_AD_Function.COLUMNNAME_Identifier);
					Util.setattrToElem(function, ofunction, X_AD_Function.COLUMNNAME_Synchronized);
					Util.setattrToElem(function, ofunction, X_AD_Function.COLUMNNAME_Arguments);
					Util.setattrToElem(function, ofunction, X_AD_Function.COLUMNNAME_Extension);
					//ofunction.setIsActive(true);
					//ofunction.save();
					CDATASection cdata = doc.createCDATASection(sourcecode);
					function.appendChild(cdata);
					root.appendChild(function);
					writeXmlToFile(refFileName, doc);				

				}

				sb = sb.append("public static final String FUNCTIONNAME_").append(functionname+"_"+fsIdentifier).append(" = \"").append(Identifier).append("\";").append("\n");

			}
			createFunctionList(sb);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	private void createFunctionList(StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.function;\n\n");
		header = header.append("public class X_AD_FunctionList { \n");
		header = header.append(sb);
		header = header.append("}");
		writeToFile(header, path+"X_AD_FunctionList.java");
	}
	private String getcurrenttime()
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String currenttime = df.format(System.currentTimeMillis());
		return currenttime;
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
		storeprocedurestoxml sp = new storeprocedurestoxml();		
		try {
			Vector<ProcessInfoParameter> Params = new Vector<ProcessInfoParameter>();
			ProcessInfoParameter pip;
			pip = new ProcessInfoParameter("IncludeOperators", "N", null, null, null);
			Params.add(pip);
			ProcessInfo pi = new ProcessInfo ("", 0);
			pi.setParameter(Params.toArray(new ProcessInfoParameter[]{}));
			sp.startProcess(Env.getCtx(), pi, null);
			//sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    
	/**************************************************************************
	 * 	Write to file
	 * 	@param sb string buffer
	 * 	@param fileName file name
	 */
	private void writeToFile (StringBuffer sb, String fileName)
	{
		try
		{
			File out = new File (fileName);
			// FileWriter fw = new FileWriter (out);
			// http://sourceforge.net/tracker/index.php?func=detail&aid=1629947&group_id=176962&atid=879332
			Writer fw = new OutputStreamWriter(new FileOutputStream(out, false), "UTF-8");
			for (int i = 0; i < sb.length(); i++)
			{
				char c = sb.charAt(i);
				//	after
				if (c == ';' || c == '}')
				{
					fw.write (c);
					if (sb.substring(i+1).startsWith("//"))
						fw.write('\t');
					else
						fw.write(Env.NL);
				}
				//	before & after
				else if (c == '{')
				{
					fw.write(Env.NL);
					fw.write (c);
					fw.write(Env.NL);
				}
				else
					fw.write (c);
			}
			fw.flush ();
			fw.close ();
			float size = out.length();
			size /= 1024;
			log.info(out.getAbsolutePath() + " - " + size + " kB");
		}
		catch (Exception ex)
		{
			log.log(Level.SEVERE, fileName, ex);
		}
	}	//	writeToFile	
}
