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

import org.compiere.model.MForm;
import org.compiere.model.MProcess;
import org.compiere.model.MProcessPara;
import org.compiere.model.MTable;
import org.compiere.model.M_Element;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.print.MPrintFormat;
import org.compiere.print.MReportView;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.compiere.wf.MWorkflow;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
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

public class processtoxml extends SvrProcess {
	private int m_AD_Table_ID;
	private String mFileName;
	private MTable table = null;
	private DocumentBuilder builder = null;
	private static Timestamp now = new Timestamp(System.currentTimeMillis());
	//private String path = "C:\\Users\\xapiens\\activedictionary\\";
	private String path = "/home/xapiens/activedictionary/";
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
		StringBuffer sql = new StringBuffer(" SELECT ")
			.append("w.name as workflow_name, r.name as reportviewname,p.* from AD_Process p ")
			.append(" LEFT OUTER JOIN ad_reportview r on p.ad_reportview_id = r.ad_reportview_id  ")
			.append("LEFT OUTER JOIN ad_workflow w on p.ad_workflow_id = w.ad_workflow_id WHERE p.isactive = 'Y'");
		PreparedStatement pstmt = null;
		PreparedStatement pstmtcol = null;		
		ResultSet rs = null;
		ResultSet rscol = null;
		StringBuffer sb = new StringBuffer();
		try
		{
			pstmt = DB.prepareStatement (sql.toString(), get_TrxName());
			rs = pstmt.executeQuery ();
			while (rs.next ())
			{												
				MProcess p = MProcess.get(Env.getCtx(), rs.getInt("AD_Process_ID"));
				Document doc = builder.newDocument();
				Element xp = doc.createElement("process");
				String id = String.valueOf(p.getAD_Process_ID());
				String name = p.getName();
				String classname = p.getClassname();
				if (classname == null)
					classname = "";
				String workflowname = rs.getString("workflow_name");
				if (workflowname == null)
					workflowname = "";
				String reportviewname = rs.getString("reportviewname");
				if (reportviewname == null)
					reportviewname = "";
				String jaspername = rs.getString("jasperreport");
				if (jaspername == null)
					jaspername = "";
				String identifier = p.getIdentifier();
				if (identifier == null)
				{
					identifier = Util.getUUID();
					p.setIdentifier(identifier);
					p.save();
				}
				String value = p.getValue();
				String refFileName = path+"p_"+id+".xml";
				
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_Identifier);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_Value);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_Name);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_Description);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_Help);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_AccessLevel);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_EntityType);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_ProcedureName);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_IsReport);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_IsDirectPrint);
				if (p.getSynchronized() == null)
				{
					p.setSynchronized(now);
					p.save();
				}
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_Synchronized);
				String reportviewId = "";
				if (p.getAD_ReportView_ID() > 0)
				{
					MReportView rview = MReportView.get(Env.getCtx(), p.getAD_ReportView_ID(), true);
					reportviewId = rview.getIdentifier();					
				}
				xp.setAttribute("reportview", reportviewId);	
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_Classname);
				String printformatId = "";
				if (p.getAD_PrintFormat_ID() > 0)
				{
					MPrintFormat pf = MPrintFormat.get(Env.getCtx(), p.getAD_PrintFormat_ID(), true);
					printformatId = pf.getIdentifier();
				}
				xp.setAttribute("printformat", printformatId);
				xp.setAttribute("workflowvalue", p.getWorkflowValue());
				String workflowid = "";
				if (p.getAD_Workflow_ID() > 0)
				{
					MWorkflow wf = MWorkflow.get(Env.getCtx(), p.getAD_Workflow_ID());
					workflowid = wf.getIdentifier();
				}
				xp.setAttribute("workflow", workflowid);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_IsBetaFunctionality);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_IsServerProcess);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_ShowHelp);
				Util.setattrToElem(xp, p, X_AD_Process.COLUMNNAME_JasperReport);
				String formid = "";
				if (p.getAD_Form_ID() > 0)
				{
					MForm form = new MForm(Env.getCtx(), p.getAD_Form_ID(), null);
					formid = form.getIdentifier();
				}
				xp.setAttribute("form", formid);
				String datasource = p.getDataSource();
				if (datasource == null)
					datasource = "";
				Element viewsource = doc.createElement("datasource");
				CDATASection cdata = doc.createCDATASection(datasource);
				viewsource.appendChild(cdata);
				xp.appendChild(viewsource);
				
				String SQL = "SELECT * FROM AD_Process_Para WHERE AD_Process_ID = ?";

				pstmtcol = DB.prepareStatement(SQL, get_TrxName());
				pstmtcol.setInt(1, p.getAD_Process_ID());
				rscol = pstmtcol.executeQuery();
				while (rscol.next())
				{
					MProcessPara pp = new MProcessPara(Env.getCtx(), rscol, null);
					Element xpp = doc.createElement("parameter");
					String columnIdentifier = "";
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_Name);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_Description);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_Help);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_SeqNo);
					DBtoxml.buildreference(path, xpp, "AD_Reference_ID", pp.getAD_Reference_ID());
					DBtoxml.buildreference(path, xpp, "AD_Reference_Value_ID", pp.getAD_Reference_Value_ID());
					DBtoxml.buildvalidation(path, xpp, "AD_Val_Rule",pp.getAD_Val_Rule_ID());
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_ColumnName);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_IsCentrallyMaintained);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_FieldLength);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_IsMandatory);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_IsRange);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_DefaultValue);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_DefaultValue2);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_VFormat);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_ValueMin);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_ValueMax);
					String IdElement = "";
					if (pp.getAD_Element_ID() >  0)
					{
						M_Element elem = new M_Element(Env.getCtx(), pp.getAD_Element_ID(), null);
						IdElement = elem.getIdentifier();
					}
					xpp.setAttribute("element", IdElement);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_EntityType);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_DisplayLogic);
					Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_ReadOnlyLogic);
					xp.appendChild(xpp);
				}
				DB.close(rscol, pstmtcol);
				doc.appendChild(xp);
				sb = sb.append("\tpublic static final String PROCESSNAME_").append(id).append("_ID             = \"").append(identifier).append("\";"); // .append("\n");
				sb = sb.append("\tpublic static final String PROCESSNAME_").append(id).append("_value          = \"").append(value).append("\";"); // .append("\n");
				sb = sb.append("\tpublic static final String PROCESSNAME_").append(id).append("_classname      = \"").append(classname).append("\";");//.append("\n");
				sb = sb.append("\tpublic static final String PROCESSNAME_").append(id).append("_workflowname   = \"").append(workflowname).append("\";"); // .append("\n");
				sb = sb.append("\tpublic static final String PROCESSNAME_").append(id).append("_reportviewname = \"").append(reportviewname).append("\";"); //.append("\n");
				sb = sb.append("\tpublic static final String PROCESSNAME_").append(id).append("_jaspername     = \"").append(jaspername).append("\";").append("\n");
				
				writeXmlToFile(refFileName, doc);				
			}
			createReportViewList(sb);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DB.close(rs, pstmt);			
		}		
		return null;
	}

	private void createReportViewList(StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.process;\n\n");
		header = header.append("public class X_AD_ProcessList { \n");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+"X_AD_ProcessList.java");
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
			//			String MD5Hash = DigestOfFile.GetLocalMD5Hash(file);
			//			pFilename = pFilename.concat(".MD5");
			//			FileWriter fileMD5 = new FileWriter(pFilename);
			//			BufferedWriter out = new BufferedWriter(fileMD5);
			//			out.write(MD5Hash);
			//			out.close();
		}
		catch (TransformerException e) {
			e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
		}
		//} catch (IOException e) {
		//	e.printStackTrace();
		//}                               
	}
	public static void main(String[] args)
	{
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);
		processtoxml sp = new processtoxml();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    
}
