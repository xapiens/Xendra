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
import org.compiere.model.MField;
import org.compiere.model.MFunction;
import org.compiere.model.MProcess;
import org.compiere.model.MTab;
import org.compiere.model.MTable;
import org.compiere.model.MWindow;
import org.compiere.model.M_Element;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_FieldGroup;
import org.compiere.model.persistence.X_AD_Function;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.DigestOfFile;
import org.compiere.util.Evaluator;
import org.compiere.util.Util;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import groovyjarjarantlr.Utils;

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
import java.util.List;
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

public class Datatypetoxml extends SvrProcess {
	private DocumentBuilder builder = null;
	private static Timestamp now = new Timestamp(System.currentTimeMillis());
	//private String path = "/home/katniss/activedictionary/";
	private String path = System.getProperty("user.home").concat("/model/");
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
		}

	}
	private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	
	protected String doIt () throws Exception 
	{
		builder = factory.newDocumentBuilder();		
		
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer(" SELECT * from ad_reference where validationtype = 'D' order by ad_reference_id"); 
		try
		{
			pstmt = DB.prepareStatement (sql.toString(), get_TrxName());
			ResultSet rs = pstmt.executeQuery ();
			String id = "";
			String dataname = "";
			String description = "";
			String help = "";
			String entitytype = "";						
			String Identifier = "";
			String validationtype = "";
			String Synchronized = getcurrenttime();
			StringBuffer sb = new StringBuffer();
			while (rs.next ())
			{				
				Document doc = builder.newDocument();
				Element root = doc.createElement("xml");
				doc.appendChild(root);
				Element datatype = doc.createElement("datatype");
				
				X_AD_Reference ref = new X_AD_Reference(Env.getCtx(), rs, null);
				id = getvalue(rs, "ad_reference_id");
				datatype.setAttribute("id", id);
				Util.setattrToElem(datatype, ref, X_AD_Reference.COLUMNNAME_Name);
				Util.setattrToElem(datatype, ref, X_AD_Reference.COLUMNNAME_Description);
				Util.setattrToElem(datatype, ref, X_AD_Reference.COLUMNNAME_Help);
				Util.setattrToElem(datatype, ref, X_AD_Reference.COLUMNNAME_EntityType);
				Util.setattrToElem(datatype, ref, X_AD_Reference.COLUMNNAME_ValidationType);
				Util.setattrToElem(datatype, ref, X_AD_Reference.COLUMNNAME_Identifier);
				Util.setattrToElem(datatype, ref, X_AD_Reference.COLUMNNAME_Extension);
				Identifier = ref.getIdentifier();
				if (ref.getSynchronized() == null)
				{
					ref.setSynchronized(now);
					ref.save();
				}				
				Util.setattrToElem(datatype, ref, X_AD_Reference.COLUMNNAME_Synchronized);
				sb = sb.append("\tpublic static final String DATATYPE_").append(id).append(" = \"").append(Identifier).append("\";").append("\n");
				String refFileName = path+"dt_"+id+".xml";
				root.appendChild(datatype);
				writeXmlToFile(refFileName, doc);				
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
		StringBuffer header = new StringBuffer("package org.compiere.model.datatype;\n\n");
		header = header.append("public class X_AD_DataType { \n");
		header = header.append(sb);
		header = header.append("}");
		writeToFile(header, path+"X_AD_DataType.java");
	}
	private String getcurrenttime()
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String currenttime = df.format(System.currentTimeMillis());
		return currenttime;
	}
		
	private String getvalue(ResultSet rs, String namecolumn) {
		String value = null;
		try {
			value = rs.getString(namecolumn);
		if (value == null)
			value = "";		
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return value;
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
		Datatypetoxml sp = new Datatypetoxml();
		try {
			sp.doIt();
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