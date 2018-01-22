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
import org.compiere.model.M_Element;
import org.compiere.model.PO;
import org.compiere.model.persistence.X_AD_PrintFormat;
import org.compiere.model.persistence.X_AD_PrintFormatItem;
import org.compiere.print.MPrintFormat;
import org.compiere.print.MPrintFormatItem;
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

public class printformattoxml extends SvrProcess {
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
		StringBuffer sql = new StringBuffer(" SELECT * from AD_PrintFormat where isactive = 'Y'");
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
				MPrintFormat pf = MPrintFormat.get(Env.getCtx(), rs.getInt("AD_PrintFormat_ID"), true);
				Document doc = builder.newDocument();
				DocumentBuilder builder = factory.newDocumentBuilder();

				Element xpf = doc.createElement("printformat");
				String id = String.valueOf(pf.getAD_PrintFormat_ID());
				String name = pf.getName();
				String identifier = pf.getIdentifier();
				
				String refFileName = path+"pf_"+id+".xml";
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_Identifier);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_Name);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_Description);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_IsTableBased);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_IsForm);
				String tableid = "";
				if (pf.getAD_Table_ID() > 0)
				{
					MTable table = MTable.get(Env.getCtx(),pf.getAD_Table_ID());
					tableid = table.getIdentifier();
				}
				xpf.setAttribute("table", tableid);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_AD_PrintPaper_ID);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_AD_PrintColor_ID);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_AD_PrintFont_ID);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_IsStandardHeaderFooter);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_HeaderMargin);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_FooterMargin);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_CreateCopy);
				String reportviewid = "";
				if (pf.getAD_ReportView_ID() > 0)
				{
					MReportView rv = MReportView.get(Env.getCtx(), pf.getAD_ReportView_ID(), true);
					reportviewid = rv.getIdentifier();
				}
				xpf.setAttribute("reportview", reportviewid);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_AD_PrintTableFormat_ID);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_PrinterName);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_IsDefault);
				Util.setattrToElem(xpf, pf, X_AD_PrintFormat.COLUMNNAME_JasperProcess_ID);
//				
				String SQL = "SELECT * FROM AD_PrintFormatItem WHERE AD_PrintFormat_ID = ?";

				pstmtcol = DB.prepareStatement(SQL, get_TrxName());
				pstmtcol.setInt(1, pf.getAD_PrintFormat_ID());
				rscol = pstmtcol.executeQuery();
				while (rscol.next())
				{
					MPrintFormatItem pfi = new MPrintFormatItem(Env.getCtx(), rscol.getInt("AD_PrintFormatItem_ID"), null);
					Element xpfi = doc.createElement("item");
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_Name);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_PrintName);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsPrinted);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_PrintAreaType);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_SeqNo);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_PrintFormatType);
					String columnId = "";
					if (pfi.getAD_Column_ID()> 0)
					{
						MColumn column = MColumn.get(Env.getCtx(), pfi.getAD_Column_ID());
						columnId = column.getIdentifier();
					}
					xpf.setAttribute("column", columnId);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_AD_PrintFormatChild_ID);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsRelativePosition);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsNextLine);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_XSpace);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_YSpace);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_XPosition);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_YPosition);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_MaxWidth);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsHeightOneLine);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_MaxHeight);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_FieldAlignmentType);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_LineAlignmentType);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_AD_PrintColor_ID);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_AD_PrintFont_ID);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsOrderBy);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_SortNo);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsGroupBy);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsPageBreak);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsSummarized);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_ImageIsAttached);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_ImageURL);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsAveraged);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsCounted);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsSetNLPosition);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsSuppressNull);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_BelowColumn);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_AD_PrintGraph_ID);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsFixedWidth);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsNextPage);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_PrintNameSuffix);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsMinCalc);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsRunningTotal);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_RunningTotalLines);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsVarianceCalc);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsDeviationCalc);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsFilledRectangle);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_LineWidth);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_ArcDiameter);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_ShapeType);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsCentrallyMaintained);
					Util.setattrToElem(xpfi, pfi, X_AD_PrintFormatItem.COLUMNNAME_IsImageField);					
					xpf.appendChild(xpfi);
				}
				DB.close(rscol, pstmtcol);
				doc.appendChild(xpf);
				
				sb = sb.append("public static final String PRINTFORMATNAME_").append(id).append(" = \"").append(identifier).append("\";").append("\n");
				writeXmlToFile(refFileName, doc);				
			}
			createReportViewList(sb);
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

	private void createReportViewList(StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.printformat;\n\n");
		header = header.append("public class X_AD_PrintFormatList { \n");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+"X_AD_PrintFormatList.java");
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
		printformattoxml sp = new printformattoxml();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    
}
