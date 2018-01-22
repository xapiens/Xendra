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

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Element;
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

public class ElementtoAnnotation extends SvrProcess {	
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
		List<X_AD_Element> elements = new Query(Env.getCtx(), X_AD_Element.Table_Name, "IsActive = 'Y'", null)
			.list();		
		for (X_AD_Element element:elements)
		{
			X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Element_ID = ?" , null)
				.setParameters(element.getAD_Element_ID())
				.first();
			if (column == null)
				continue;
			if (column.isKey())
				continue;
			String funcname = element.getColumnName();
			if (funcname.length() == 0)
				funcname = "ELE_"+element.getAD_Element_ID();
			else
				funcname = "ELE_"+funcname;
			StringBuffer sb = new StringBuffer();
			if (element.getIdentifier().length() == 0)
			{
				element.setIdentifier(Util.getUUID());
				element.save();
			}
			if (element.getSynchronized() == null)
			{
				element.setSynchronized(new Timestamp(System.currentTimeMillis()));
				element.save();
			}
			sb.append("\t@XendraElement(")
			.append(String.format("%s=%s,\n", X_AD_Element.COLUMNNAME_AD_Element_ID, element.getAD_Element_ID()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Element.COLUMNNAME_ColumnName,element.getColumnName()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Element.COLUMNNAME_EntityType,element.getEntityType()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Element.COLUMNNAME_Name,element.getName()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Element.COLUMNNAME_PrintName,element.getPrintName()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Element.COLUMNNAME_Description,element.getDescription()))					
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Element.COLUMNNAME_Help,element.getHelp()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Element.COLUMNNAME_PO_Name,element.getPO_Name()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Element.COLUMNNAME_PO_PrintName,element.getPO_PrintName()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Element.COLUMNNAME_PO_Description,element.getPO_Description()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Element.COLUMNNAME_PO_Help,element.getPO_Help()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Element.COLUMNNAME_Identifier,element.getIdentifier()))
			.append(String.format("\t\t%s=\"%s\")\n",X_AD_Element.COLUMNNAME_Synchronized,element.getSynchronized()));					
			sb = sb.append("\tpublic static final String ").append(element.COLUMNNAME_Identifier)
						.append(" = \"").append(element.getIdentifier()).append("\";").append("\n");
			sbcontainer = sbcontainer.append("\tpublic static final String ").append(funcname).append(String.format("=\"%s\"",element.getIdentifier())).append(";");
			createFunction(funcname, sb);
		}
		createFunctionContainer(sbcontainer);
		return null;
	}
	private void createFunctionContainer(StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.element;\n\n");
		header = header.append("public class ElementList ").append("{");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+"ElementList.java");
	}
	private void createFunction(String funcname, StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.element;\n\n");
		header = header.append("import org.xendra.annotations.*;");
		//header = header.append("import org.compiere.model.Elementary;\n");
		header = header.append("public class ").append(funcname).append(" { ");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+funcname+".java");
		//writeToFile(header, path+funcname+".java");
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
		ElementtoAnnotation sp = new ElementtoAnnotation();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    
}