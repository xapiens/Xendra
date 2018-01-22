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
import org.compiere.model.persistence.X_AD_ReportView;
import org.compiere.model.persistence.X_AD_ReportView_Col;
import org.compiere.print.MReportView;
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

public class reportviewstoxml extends SvrProcess {
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
	private Timestamp now = new Timestamp(System.currentTimeMillis());

	protected String doIt () throws Exception 
	{
		builder = factory.newDocumentBuilder();		
		StringBuffer sql = new StringBuffer(" SELECT * from AD_ReportView where isactive = 'Y' AND AD_Table_ID > 0");
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
				X_AD_ReportView tablerv = new X_AD_ReportView(Env.getCtx(), rs, get_TrxName());								

				Document doc = builder.newDocument();
				Element reportview = doc.createElement("reportview");
				String id = String.valueOf(tablerv.getAD_ReportView_ID());
				String name = tablerv.getName();
				String identifier = tablerv.getIdentifier();
				
				String refFileName = path+"rv_"+id+".xml";
				
				//reportview.setAttribute("identifier", identifier);
				Util.setattrToElem(reportview, tablerv, X_AD_ReportView.COLUMNNAME_Identifier);
				//reportview.setAttribute("name", name);
				Util.setattrToElem(reportview, tablerv, X_AD_ReportView.COLUMNNAME_Name);
				//reportview.setAttribute("description", tablerv.getDescription());
				Util.setattrToElem(reportview, tablerv, X_AD_ReportView.COLUMNNAME_Description);
				
				Integer AD_Table_ID = tablerv.getAD_Table_ID();
				MTable table = MTable.get(Env.getCtx(), AD_Table_ID);
				reportview.setAttribute("table", table.getIdentifier());
				//Util.setattr(reportview, tablerv, X_AD_ReportView.COLUMNNAME_AD_Table_ID);
				//reportview.setAttribute("whereclause", tablerv.getWhereClause());
				Util.setattrToElem(reportview, tablerv, X_AD_ReportView.COLUMNNAME_WhereClause);
				//reportview.setAttribute("orderbyclause", tablerv.getOrderByClause());
				Util.setattrToElem(reportview, tablerv, X_AD_ReportView.COLUMNNAME_OrderByClause);
				//reportview.setAttribute("entitytype", tablerv.getEntityType());
				Util.setattrToElem(reportview, tablerv, X_AD_ReportView.COLUMNNAME_EntityType);
				//reportview.setAttribute("synchronized", Synchronized);
				if (tablerv.getSynchronized() == null)
				{
					tablerv.setSynchronized(now);
					tablerv.save();
				}
				Util.setattrToElem(reportview, tablerv, X_AD_ReportView.COLUMNNAME_Synchronized);
				String SQL = "SELECT * FROM AD_ReportView_Col WHERE AD_Reportview_ID = ?";

				pstmtcol = DB.prepareStatement(SQL, get_TrxName());
				pstmtcol.setInt(1, tablerv.getAD_ReportView_ID());
				rscol = pstmtcol.executeQuery();
				while (rscol.next())
				{
					X_AD_ReportView_Col rvc = new X_AD_ReportView_Col(Env.getCtx(),rscol, get_TrxName());
					Element xrvc = doc.createElement("column");
					String columnIdentifier = "";
					if (rvc.getAD_Column_ID() > 0)
					{
						MColumn column = MColumn.get(Env.getCtx(), rvc.getAD_Column_ID());
						columnIdentifier = column.getIdentifier();							
					}
					//xrvc.setAttribute("column", columnIdentifier);
					Util.setattrToElem(xrvc, rvc, X_AD_ReportView_Col.COLUMNNAME_AD_Column_ID);
					//xrvc.setAttribute("identifier", rvc.getIdentifier());
					Util.setattrToElem(xrvc, rvc, X_AD_ReportView_Col.COLUMNNAME_Identifier);
					//xrvc.setAttribute("functioncolumn", rvc.getFunctionColumn());
					Util.setattrToElem(xrvc, rvc, X_AD_ReportView_Col.COLUMNNAME_FunctionColumn);
					//xrvc.setAttribute("isgroupfunction", rvc.isGroupFunction() ? "Y": "N");
					Util.setattrToElem(xrvc, rvc, X_AD_ReportView_Col.COLUMNNAME_IsGroupFunction);
					reportview.appendChild(xrvc);
				}
				DB.close(rscol, pstmtcol);
				doc.appendChild(reportview);
				sb = sb.append("public static final String REPORTVIEWNAME_").append(id).append(" = \"").append(identifier).append("\";").append("\n");
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
		StringBuffer header = new StringBuffer("package org.compiere.model.reportview;\n\n");
		header = header.append("public class X_AD_ReportViewList { \n");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+"X_AD_ReportViewList.java");
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
		reportviewstoxml sp = new reportviewstoxml();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    

}
