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
import org.compiere.model.MForm;
import org.compiere.model.MProcess;
import org.compiere.model.MProcessPara;
import org.compiere.model.MTable;
import org.compiere.model.MWindow;
import org.compiere.model.M_Element;
import org.compiere.model.PO;
import org.compiere.model.persistence.X_AD_PrintFormat;
import org.compiere.model.persistence.X_AD_PrintFormatItem;
import org.compiere.model.persistence.X_AD_WF_Node;
import org.compiere.model.persistence.X_AD_Workflow;
import org.compiere.print.MPrintFormat;
import org.compiere.print.MPrintFormatItem;
import org.compiere.print.MReportView;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.compiere.wf.MWFNode;
import org.compiere.wf.MWorkflow;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import java.io.File;
import java.io.StringReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

public class workflowtoxml extends SvrProcess {
	private int m_AD_Table_ID;
	private String mFileName;
	private MTable table = null;
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
		StringBuffer sql = new StringBuffer("SELECT * from AD_Workflow where isactive = 'Y'");
		PreparedStatement pstmt = null;
		PreparedStatement pstmtcol = null;		
		ResultSet rs = null;
		ResultSet rscol = null;
		String Synchronized = Util.getcurrenttime();
		StringBuffer sb = new StringBuffer();
		try
		{
			pstmt = DB.prepareStatement (sql.toString(), get_TrxName());
			rs = pstmt.executeQuery ();
			while (rs.next ())
			{												
				MWorkflow pf = MWorkflow.get(Env.getCtx(), rs.getInt("AD_Workflow_ID"));

				Document doc = builder.newDocument();
				
				DocumentBuilder builder = factory.newDocumentBuilder();
				
				Element xpf = doc.createElement("wokflow");
				String id = String.valueOf(pf.getAD_Workflow_ID());
				String name = pf.getName();
				String identifier = pf.getIdentifier();
				
				String refFileName = path+"wf_"+id+".xml";
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_Identifier);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_Name);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_Description);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_Help);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_AccessLevel);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_AD_WF_Node_ID);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_EntityType);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_DurationUnit);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_Author);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_Version);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_ValidFrom);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_ValidTo);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_Priority);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_DurationLimit);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_Duration);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_Cost);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_WorkingTime);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_WaitingTime);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_AD_WF_Responsible_ID);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_PublishStatus);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_AD_WorkflowProcessor_ID);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_Value);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_IsDefault);
				String tableid = "";
				if (pf.getAD_Table_ID() > 0)
				{
					MTable table = MTable.get(Env.getCtx(),pf.getAD_Table_ID());
					tableid = table.getIdentifier();
				}				
				xpf.setAttribute("table", tableid);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_ValidateWorkflow);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_WorkflowType);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_DocValueLogic);
				Util.setattrToElem(xpf, pf, X_AD_Workflow.COLUMNNAME_IsValid);
//				
				String SQL = "SELECT * FROM AD_WF_Node WHERE AD_Workflow_ID = ?";

				pstmtcol = DB.prepareStatement(SQL, get_TrxName());
				pstmtcol.setInt(1, pf.getAD_Workflow_ID());
				rscol = pstmtcol.executeQuery();
				while (rscol.next())
				{
					MWFNode pfi = MWFNode.get(Env.getCtx(), rscol.getInt("AD_WF_Node_ID"));
					Element xpfi = doc.createElement("node");
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_Name);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_Description);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_Help);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_Name);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_IsCentrallyMaintained);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_Action);
					String idwindow = "";
					if (pfi.getAD_Window_ID() > 0)
					{
						MWindow window = new MWindow(Env.getCtx(), pfi.getAD_Window_ID(), null);
						idwindow = window.getIdentifier();
					}
					xpfi.setAttribute("window", idwindow);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_AD_Task_ID);
					String idprocess = "";
					if (pfi.getAD_Process_ID() > 0)
					{
						MProcess process = MProcess.get(Env.getCtx(), pfi.getAD_Process_ID());
						idprocess = process.getIdentifier();
					}
					xpfi.setAttribute("process", idprocess);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_AD_Form_ID);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_EntityType);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_XPosition);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_YPosition);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_AD_WF_Block_ID);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_SubflowExecution);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_StartMode);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_FinishMode);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_DurationLimit);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_Priority);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_Duration);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_Cost);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_WorkingTime);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_WaitingTime);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_AD_WF_Responsible_ID);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_AD_Image_ID);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_JoinElement);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_SplitElement);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_WaitTime);
					String idColumn = "";
					if (pfi.getAD_Column_ID() > 0)
					{
						MColumn column = MColumn.get(Env.getCtx(), pfi.getAD_Column_ID());
						idColumn = column.getIdentifier();
					}
					xpfi.setAttribute("column", idColumn);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_AttributeName);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_AttributeValue);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_DocAction);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_Value);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_DynPriorityUnit);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_DynPriorityChange);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_EMailRecipient);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_EMail);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_R_MailText_ID);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_ValidTo);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_IsMilestone);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_IsSubcontracting);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_UnitsCycles);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_MovingTime);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_Overlap_Units);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_C_BPartner_ID);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_QueuingTime);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_S_Resource_ID);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_SetupTime);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_ValidFrom);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_Yield);
					Util.setattrToElem(xpfi, pfi, X_AD_WF_Node.COLUMNNAME_DurationLimit);					
					xpf.appendChild(xpfi);
				}
				DB.close(rscol, pstmtcol);
				doc.appendChild(xpf);				
				sb = sb.append("public static final String WORKFLOWNAME_").append(id).append(" = \"").append(identifier).append("\";").append("\n");
				writeXmlToFile(refFileName, doc);				
			}
			createWorkflowList(sb);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("X");
		}
		finally
		{
			DB.close(rs, pstmt);			
		}		
		return null;
	}


	private void createWorkflowList(StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.workflow;\n\n");
		header = header.append("public class X_AD_WorkflowList { \n");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+"X_AD_WorkflowList.java");
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
		workflowtoxml sp = new workflowtoxml();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    
}
