package org.xendra.developer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.columba.core.xml.XMLCoreParser;
import org.compiere.Xendra;
import org.compiere.db.CConnection;
import org.compiere.model.MForm;
import org.compiere.model.MProcessPara;
import org.compiere.model.M_Element;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.print.MPrintFormat;
import org.compiere.print.MReportView;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.compiere.wf.MWorkflow;
import org.jdom.CDATA;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class GenerateProcess {
	private File dirinput;
	private File diroutput;
	private static CLogger	log = CLogger.getCLogger(GenerateProcess.class);
	private List<Element> elements = new ArrayList<Element>();
	public GenerateProcess(String host, String database, int port, String dirin, String dirout) {
		try {			
			log.warning(String.format("host %s", host));
			log.warning(String.format("port %s", port));
			log.warning(String.format("database %s", database));
			log.warning(String.format("dir input %s",dirin));
			log.warning(String.format("dir output %s",dirout));						
			
			//String attributes = String.format("CConnection[name={192.168.3.5-xendra-xendra},AppsHost=,AppsPort=1099,DBhost=%s,DBport=5432,DBname=%s,UID=xendra,PWD=xendra,POOLServer=50,POOLClient=20]","localhost","core");
			//CConnection s_cc = new CConnection (null);
			CConnection m_cc = CConnection.get();			
			setDatabase(m_cc, host, port, database);				
			//s_cc.setAttributes (attributes);
			//DB.setDBTarget(s_cc);			
			dirinput = new File(dirin);
			diroutput = new File(dirout);
			File[] xmlfiles = dirinput.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".in");
				}
			});
			for (File xmlfile:xmlfiles)
			{
				if (xmlfile.isFile())
				{
					System.out.println(xmlfile.getAbsolutePath());
					BufferedInputStream buf = new BufferedInputStream(new FileInputStream(xmlfile));
					parseFormat(xmlfile.getName().replace(".in", ".xml"), buf);					
				}

			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}			

	}
	
	private void setDatabase(CConnection m_cc, String host, int port, String database) {
		m_cc.setDbHost(host);
		m_cc.setDbPort(port);
		m_cc.setDbName(database);		
		log.warning(m_cc.toString());
		DB.closeTarget();
		DB.setDBTarget(m_cc);		
	}
	
	private void parseFormat(String filename, BufferedInputStream is) {
		try {			
			Document doc = XMLCoreParser.retrieveDocument(is);			
			Element parent = doc.getRootElement();
			Iterator iterator = parent.getChildren().listIterator();
			Element extensionXmlElement;
			while (iterator.hasNext()) {
				extensionXmlElement = (Element) iterator.next();
				String classname = extensionXmlElement.getAttributeValue(X_AD_Process.COLUMNNAME_Classname);
				X_AD_Process process = new Query(Env.getCtx(), X_AD_Process.Table_Name, "classname = ?", null)
					.setParameters(classname).first();
				if (process != null)
				{
					//Element xp = new Element("process");
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_Identifier);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_Value);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_Name);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_Description);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_Help);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_AccessLevel);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_EntityType);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_ProcedureName);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_IsReport);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_IsDirectPrint);
					if (process.getSynchronized() == null)
					{
						process.setSynchronized(new Timestamp(System.currentTimeMillis()));
						process.save();
					}
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_Synchronized);
					String reportviewId = "";
					if (process.getAD_ReportView_ID() > 0)
					{
						MReportView rview = MReportView.get(Env.getCtx(), process.getAD_ReportView_ID(), true);
						reportviewId = rview.getIdentifier();					
					}
					extensionXmlElement.setAttribute("reportview", reportviewId);	
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_Classname);
					String printformatId = "";
					if (process.getAD_PrintFormat_ID() > 0)
					{
						MPrintFormat pf = MPrintFormat.get(Env.getCtx(), process.getAD_PrintFormat_ID(), true);
						printformatId = pf.getIdentifier();
					}
					extensionXmlElement.setAttribute("printformat", printformatId);
					extensionXmlElement.setAttribute("workflowvalue", process.getWorkflowValue());
					String workflowid = "";
					if (process.getAD_Workflow_ID() > 0)
					{
						MWorkflow wf = MWorkflow.get(Env.getCtx(), process.getAD_Workflow_ID());
						workflowid = wf.getIdentifier();
					}
					extensionXmlElement.setAttribute("workflow", workflowid);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_IsBetaFunctionality);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_IsServerProcess);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_ShowHelp);
					Util.setattrToElem(extensionXmlElement, process, X_AD_Process.COLUMNNAME_JasperReport);
					String formid = "";
					if (process.getAD_Form_ID() > 0)
					{
						MForm form = new MForm(Env.getCtx(), process.getAD_Form_ID(), null);
						formid = form.getIdentifier();
					}
					extensionXmlElement.setAttribute("form", formid);
					String datasource = process.getDataSource();
					if (datasource == null)
						datasource = "";
					Element viewsource = new Element("datasource");
					CDATA cdata = new CDATA(datasource);
					viewsource.setContent(cdata);
					extensionXmlElement.addContent(viewsource);
					List<MProcessPara> params = new Query(Env.getCtx(), MProcessPara.Table_Name, "AD_Process_ID = ?", null)
						.setParameters(process.getAD_Process_ID()).list();
					for (MProcessPara pp:params)
					{
						Element xpp = new Element("parameter");
						String columnIdentifier = "";
						Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_Name);
						Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_Description);
						Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_Help);
						Util.setattrToElem(xpp, pp, X_AD_Process_Para.COLUMNNAME_SeqNo);
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
						extensionXmlElement.addContent(xpp);						
					}
				}
				else
				{
					elements.add(extensionXmlElement);
				}
			}			
			for (Element element:elements)
			{
				parent.removeContent(element);				
			}
			String newrule = new XMLOutputter(Format.getPrettyFormat()).outputString(doc);
			File newrrr = new File(diroutput, filename);
			PrintWriter out = new PrintWriter(newrrr.getAbsolutePath());
			out.println(newrule);
			out.close();
		}	
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Xendra.startup(true);
		String host;
		String database;
		String port = "5432";
		String dirin  = "/home/americas/workspace/Xendra/pos/src/org/xendra/process/";
		String dirout = "/home/americas/workspace/Xendra/pos/src/org/xendra/process/";
		host = args[0];
		database = args[1];
		port = args[2];
		dirin = args[3];		
		dirout = args[4];		
		new GenerateProcess(host, database, Integer.valueOf(port), dirin,dirout);
	}
}
