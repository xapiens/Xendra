/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2012 Francisco Morosini, Inc. All Rights Reserve             *
 * This program is free software; you can redistribute it and/or modify it    *
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

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogMgt;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.w3c.dom.Document;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.*;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class valruletoAnnotation extends SvrProcess {	
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
		}
	}	
	
	protected String doIt () throws Exception 
	{		
		StringBuffer sbcontainer = new StringBuffer();
		List<X_AD_Val_Rule> valrules = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "IsActive = 'Y'", null)
			.list();		
		for (X_AD_Val_Rule valrule:valrules)
		{			
			String funcname = valrule.getName();
			if (funcname.length() == 0)
				funcname = "VAL_"+valrule.getAD_Val_Rule_ID();
			else
				funcname = "VAL_"+Util.getStringclean(funcname);
			StringBuffer sb = new StringBuffer();
			if (valrule.getIdentifier() == null)
			{
				valrule.setIdentifier(Util.getUUID());
				valrule.save();
			}
			if (valrule.getSynchronized() == null)
			{
				valrule.setSynchronized(new Timestamp(System.currentTimeMillis()));
				valrule.save();
			}
			sb.append("\t@XendraValRule(")
			.append(String.format("%s=\"%s\",\n",X_AD_Val_Rule.COLUMNNAME_Name,valrule.getName()))
			.append(String.format("\t\t%s=%s,\n",X_AD_Val_Rule.COLUMNNAME_AD_Val_Rule_ID,valrule.getAD_Val_Rule_ID()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Val_Rule.COLUMNNAME_Description,valrule.getDescription()))								
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Val_Rule.COLUMNNAME_Type,valrule.getType()))
			//.append(String.format("\t\t%s=\"%s\",\n",X_AD_Val_Rule.COLUMNNAME_Code,element.getCode()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Val_Rule.COLUMNNAME_EntityType,valrule.getEntityType()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Val_Rule.COLUMNNAME_Identifier,valrule.getIdentifier()))
			.append(String.format("\t\t%s=\"%s\")\n",X_AD_Val_Rule.COLUMNNAME_Synchronized,valrule.getSynchronized()));			
			sb = sb.append("\tpublic static final String ").append(valrule.COLUMNNAME_Identifier)
						.append(" = \"").append(valrule.getIdentifier()).append("\";").append("\n");
			sb = sb.append("\tpublic static final String getCode() { ");
			sb = sb.append("\tStringBuilder sb = new StringBuilder(); ");
			String[] tokens = valrule.getCode().split("\n");
			for (String token:tokens)
			{
				sb = sb.append("\tsb.append(\"").append(token).append("\");");
			}
			sb.append("\treturn sb.toString();}");	
			sbcontainer = sbcontainer.append("\tpublic static final String ").append(funcname).append(String.format("=\"%s\"",valrule.getIdentifier())).append(";");
			createFunctionList(funcname, sb);
		}
		createFunctionContainer(sbcontainer);
		return null;
	}
	private void createFunctionContainer(StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.valrule;\n\n");
		header = header.append("public class ValRuleList ").append("{");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+"ValRuleList.java");
	}
	private void createFunctionList(String funcname, StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.valrule;\n\n");
		header = header.append("import org.xendra.annotations.*;");
		header = header.append("import org.compiere.model.ValRule;\n");
		header = header.append("public class ").append(funcname).append(" implements ValRule { ");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+funcname+".java");
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
		valruletoAnnotation sp = new valruletoAnnotation();
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
	
}