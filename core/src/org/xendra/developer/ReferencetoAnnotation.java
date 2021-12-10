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
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_AD_Ref_Table;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.reference.REF_AD_ReferenceValidationTypes;
import org.compiere.process.ProcessInfo;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.w3c.dom.Document;
import org.xendra.process.CostUpdate;


import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import java.util.logging.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class ReferencetoAnnotation extends SvrProcess {
	private static CLogger	log	= CLogger.getCLogger (GenerateModelView.class);
	private static Timestamp now = new Timestamp(System.currentTimeMillis());
	private String path = System.getProperty("user.home").concat("/model/");
	private int Reference_Value_ID = 0;
	protected void prepare ()
	
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID))
				Reference_Value_ID = para[i].getParameterAsInt();
			
		}
	}
	private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	
	protected String doIt () throws Exception 
	{	
		String query = "";
		List<X_AD_Reference> references = null;
		if (Reference_Value_ID > 0)
		{
			query = "AD_Reference_ID = ? AND IsActive = 'Y'";
			references = new Query(Env.getCtx(), X_AD_Reference.Table_Name, query , null)
			.setParameters(Reference_Value_ID)
			.list();		
		}
		else
		{
			query = " IsActive = 'Y'";
			references = new Query(Env.getCtx(), X_AD_Reference.Table_Name, query , null)
			.list();					
		}
		for (X_AD_Reference reference:references)
		{
			String funcname = "";
			if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.DataType))
			{
				funcname = DisplayType.getDescription(reference.getAD_Reference_ID());
			}
			else 
			{				
//				MColumn column = new Query(Env.getCtx(), MColumn.Table_Name, "AD_Reference_Value_ID = ?", null)
//					.setParameters(reference.getAD_Reference_ID())
//					.first();
//				if (column != null)
//				{					
//					funcname = Util.getStringclean(column.getColumnName());
//				}
				funcname = Util.getStringclean(reference.getName());
			}			
			if (funcname.length() == 0)
				funcname = "REF_"+reference.getAD_Reference_ID();
			else
				funcname = "REF_"+funcname;
			StringBuffer sb = new StringBuffer();
			if (reference.getIdentifier() == null)
			{
				reference.setIdentifier(Util.getUUID());
				reference.save();
			}
			reference.setSynchronized(new Timestamp(System.currentTimeMillis()));
			reference.save();
			if (reference.getClassname().length() == 0)
			{
				reference.setClassname(funcname);
				reference.save();
			}
			if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.ListValidation))
			{
				List<X_AD_Ref_List> reflists = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "AD_Reference_ID = ?", null)
					.setParameters(reference.getAD_Reference_ID()).list();
				for (X_AD_Ref_List list:reflists)
				{
					if (list.getIdentifier() == null)
					{
						list.setIdentifier(Util.getUUID());
						list.save();
					}					
					String nameClean = Util.getStringclean(list.getName());
					sb.append("\t@XendraRefItem(")
					.append(String.format("%s=\"%s\",\n",X_AD_Ref_List.COLUMNNAME_Name,list.getName()))
					.append(String.format("\t\t%s=\"%s\",\n",X_AD_Ref_List.COLUMNNAME_Value,list.getValue()))					
					.append(String.format("\t\t%s=\"%s\",\n",X_AD_Ref_List.COLUMNNAME_Description,list.getDescription()))
					.append(String.format("\t\t%s=\"%s\")\n",X_AD_Ref_List.COLUMNNAME_Identifier,list.getIdentifier()));
					//.append(String.format("\t\t%s=\"%s\")\n",Env.RefID,reference.getIdentifier()));					
					sb.append("\t/** ").append(list.getName()).append(" = ").append(list.getValue()).append(" */\n");
					sb.append("\tpublic static final String ").append(nameClean)					
						.append(" = \"").append(list.getValue()).append("\";");				
				}
			}
			else if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.TableValidation))
			{
				X_AD_Ref_Table reftable = new Query(Env.getCtx(), X_AD_Ref_Table.Table_Name, "AD_Reference_ID = ?", null)
					.setParameters(reference.getAD_Reference_ID()).first();
				if (reftable != null)
				{
					if (reftable.getIdentifier() == null)
					{
						reftable.setIdentifier(Util.getUUID());
						reftable.save();
					}
					MTable table = MTable.get(Env.getCtx(), reftable.getAD_Table_ID());
					if (table.getIdentifier() == null)
					{
						table.setIdentifier(Util.getUUID());
						table.save();
					}
					MColumn key = new MColumn(Env.getCtx(), reftable.getAD_Key(), null);
					if (key.getIdentifier() == null)
					{
						key.setIdentifier(Util.getUUID());
						key.save();
					}
					MColumn display = new MColumn(Env.getCtx(), reftable.getAD_Display(), null);
					if (display.getIdentifier() == null)
					{
						display.setIdentifier(Util.getUUID());
						display.save();
					}
					sb.append("\t@XendraRefTable(")					
					.append(String.format("%s=\"%s\",\n","TableRef",table.getTableName()))
					.append(String.format("\t\t%s=\"%s\",\n","KeyRef",key.getColumnName()))
					.append(String.format("\t\t%s=\"%s\",\n","DisplayRef",display.getColumnName()))
					.append(String.format("\t\t%s=%s,\n",X_AD_Ref_Table.COLUMNNAME_IsValueDisplayed, reftable.isValueDisplayed()))
					.append(String.format("\t\t%s=\"%s\",\n",X_AD_Ref_Table.COLUMNNAME_WhereClause, reftable.getWhereClause()))
					.append(String.format("\t\t%s=\"%s\",\n",X_AD_Ref_Table.COLUMNNAME_OrderByClause, reftable.getOrderByClause()))
					.append(String.format("\t\t%s=\"%s\")\n",X_AD_Ref_Table.COLUMNNAME_Identifier, reftable.getIdentifier()));
					//.append(String.format("\t\t%s=\"%s\")\n",Env.RefID, reference.getIdentifier()));
				}
				
			}			
			//sb = sb.append("\tpublic static final String REF_").append(reference.getAD_Reference_ID())
			//sb = sb.append("\tpublic static final String ").append(funcname)
			int datatypeid = 0;
			if (reference.getValidationType().equals(REF_AD_ReferenceValidationTypes.DataType))
			{
				datatypeid = reference.getAD_Reference_ID();
			}
			sb.append("\t@XendraRef(")
			.append(String.format("%s=\"%s\",\n",X_AD_Reference.COLUMNNAME_Name,reference.getName()))
			//.append(String.format("\t\t%s=\"%s\",\n",X_AD_Process.COLUMNNAME_Classname,funcname))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Reference.COLUMNNAME_AD_Reference_ID,datatypeid)) 
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Reference.COLUMNNAME_ValidationType,reference.getValidationType()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Reference.COLUMNNAME_Description,reference.getDescription()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Reference.COLUMNNAME_Help,reference.getHelp()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Reference.COLUMNNAME_VFormat,reference.getVFormat()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Reference.COLUMNNAME_EntityType,reference.getEntityType()))
			.append(String.format("\t\t%s=%s,\n",	 X_AD_Reference.COLUMNNAME_IsOrderByValue,reference.isOrderByValue()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Reference.COLUMNNAME_Synchronized,reference.getSynchronized()))
			.append(String.format("\t\t%s=\"%s\",\n",X_AD_Reference.COLUMNNAME_Extension,reference.getExtension()))
			.append(String.format("\t\t%s=\"%s\")\n",X_AD_Reference.COLUMNNAME_Identifier,reference.getIdentifier()));			
			sb = sb.append("\tpublic static final String ").append(reference.COLUMNNAME_Identifier)
						.append(" = \"").append(reference.getIdentifier()).append("\";").append("\n");
			createFunctionList(funcname, sb);
		}
		return null;
	}
	private void createFunctionList(String funcname, StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.reference;\n\n");
		header = header.append("import org.xendra.annotations.*;");
		header = header.append("import org.compiere.model.Reference;\n");
		header = header.append("public class ").append(funcname).append(" implements Reference { ");
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
	public static void main(String[] args) {
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);
		log.info("ReferenceAnnotation   $Revision: 1.0 $");
		log.info("----------------------------------");		
		//	first parameter
		String directory = System.getProperty("user.home").concat("/model/");
		if (args.length > 0)
			directory = args[0];
		if (directory == null || directory.length() == 0)
		{
			System.err.println("No Directory");
			System.exit(1);
		}
		//	second parameter
		Integer reference = 0;
		if (args.length > 1)
			reference = Integer.valueOf(args[1]); 
		if (reference == null || reference == 0)
		{
			System.err.println("No reference");
			System.exit(1);
		}
		ReferencetoAnnotation sp = new ReferencetoAnnotation();		
		try {
			ProcessInfo pi = new ProcessInfo ("ReferenceAnnotation", 0 /* Process ID */, /* Table_ID*/ 0, 0 /* record_ID */);
			pi.setAD_User_ID (Env.getAD_User_ID(Env.getCtx()));
			pi.setAD_Client_ID (Env.getAD_Client_ID(Env.getCtx()));			
			Vector<ProcessInfoParameter> tabParams = new Vector<ProcessInfoParameter>();
			//
			ProcessInfoParameter pip;			
			pip = new ProcessInfoParameter(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID, reference , null, null, null);
			tabParams.add(pip);		
			pi.setParameter(tabParams.toArray(new ProcessInfoParameter[]{}));
			sp.startProcess(Env.getCtx(), pi, null);					
			
			//sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}	
}