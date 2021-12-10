/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software. you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY  without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.xendra.developer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.io.StringReader;
import java.sql.Timestamp;
import java.util.Iterator;
import org.columba.core.xml.XMLCoreParser;
import org.compiere.Xendra;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.util.CLogger;
import org.compiere.util.Util;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xendra.Constants;
import org.xendra.utils.Rotdash;

public class GenerateReport {
	private File dirinput;
	private File diroutput;
	private static CLogger	log = CLogger.getCLogger(GenerateReport.class);
	public GenerateReport(String dirin, String dirout) {
		new GenerateReport(dirin, dirout, null);
	}
	public GenerateReport(String dirin, String dirout, String plugin) {
		try {
			log.warning(String.format("dir input %s",dirin));
			log.warning(String.format("dir output %s",dirout));
			log.warning(String.format("plugin template %s", plugin));
			dirinput = new File(dirin);
			if (!dirinput.exists())
			{
				System.out.println(String.format("the dir %s input is invalid",dirinput.getAbsolutePath()));
				return;				
			}		
			diroutput = new File(dirout);
			if (!diroutput.exists())
				diroutput.mkdirs();
			// added report to output dir
			Rotdash.getInstance().setMessage("searching reports");
			File[] xmlfiles = dirinput.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".in.xml");
				}
			});						
			int countprocess = 0;
			for (File xmlfile:xmlfiles)
			{
				if (xmlfile.isFile())
				{
					System.out.println(String.format("parsing %s", xmlfile.getAbsolutePath()));
					BufferedInputStream buf = new BufferedInputStream(new FileInputStream(xmlfile));
					parseFormat(xmlfile.getName().replace(".in.xml", ".xml"), buf);
					countprocess++;
				}
			}			
			Rotdash.getInstance().setMessage(String.format("%s reports with process", countprocess));
			Rotdash.getInstance().setMessage("create plugin");
			createPlugin(plugin);
			Rotdash.getInstance().end();
			//DB.setDBTarget(m_cc);			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private void createPlugin(String plugininfile) {
		String pluginfile = "";
		if (plugininfile == null) {
			plugininfile = diroutput.getAbsolutePath()+System.getProperty("file.separator")+"plugin.in.xml";
		}
		if (plugininfile != null) {
			pluginfile = plugininfile.replace(".in.xml", ".xml");
		}
		File fplugininfile = new File(plugininfile);
		if (!fplugininfile.exists()) {
			StringBuffer header = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			StringBuffer sb = new StringBuffer();
			sb.append("<plugin ");
			Util.append(sb, String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_NAME,"@name@"));
			Util.append(sb, String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_DESCRIPTION,"@description@"));
			Util.append(sb, String.format("%s=\"%s\" ",Constants.ID,"@id@"));
			Util.append(sb, String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_VERSION,"1.0"));
			Util.append(sb, String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_CATEGORY,"@category@"));
			Util.append(sb, String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_SYNCHRONIZED,"@timestamp@"));
			Util.append(sb, String.format("%s=\"%s\">",Constants.XML_ATTRIBUTE_ENABLED,"true"));			
			sb.append("</plugin>");	
			header.append(sb);
			try {
				SAXBuilder sb2=new SAXBuilder();
				Document doc=sb2.build(new StringReader(header.toString()));
				Format xx = Format.getPrettyFormat();
				XMLOutputter xmOut=new XMLOutputter(xx);
				String sfilename =  xmOut.outputString(doc);	
				log.warning (String.format("create plugin.in %s",fplugininfile));
				//PrintWriter out = new PrintWriter(diroutput.getAbsolutePath()+System.getProperty("file.separator")+"plugin.xml");
				PrintWriter out = new PrintWriter(fplugininfile);
				out.println(sfilename);
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}

		try {
			BufferedInputStream isinplugin = new BufferedInputStream(new FileInputStream(fplugininfile));
			Document doc = XMLCoreParser.retrieveDocument(isinplugin);
			try {
				File menuxml = new File(dirinput, "menu.xml"); 
				if (menuxml.exists()) {
					BufferedInputStream is = new BufferedInputStream(new FileInputStream(menuxml));
					Document menudoc = XMLCoreParser.retrieveDocument(is);
					Element menu = menudoc.getRootElement();
					menu.detach();							
					doc.getRootElement().addContent(menu);					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Format xx = Format.getPrettyFormat();
			XMLOutputter xmOut=new XMLOutputter(xx);
			String sfilename =  xmOut.outputString(doc);	
			log.warning (String.format("create/modify plugin %s",pluginfile));
			PrintWriter out = new PrintWriter(pluginfile);
			out.println(sfilename);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void parseFormat(String filename, BufferedInputStream is) {
		try {
			Document doc = XMLCoreParser.retrieveDocument(is);
			Element parent = doc.getRootElement();			
			String jasperfilename = parent.getAttributeValue("FileName");
			String datafile = common.getJasperSource(new File(dirinput, jasperfilename));
			SAXBuilder sb2=new SAXBuilder();
			Document doc2=sb2.build(new StringReader(datafile));
			Element x = doc2.getRootElement();
			x.detach();
			Element jp = x;			
			parent.addContent(jp);
			String newreport = new XMLOutputter(Format.getPrettyFormat()).outputString(doc);			
			File dirreport = new File(diroutput.getAbsolutePath()+System.getProperty("file.separator")+"report");
			if (!dirreport.exists())
				dirreport.mkdirs();
			File newrrr = new File(dirreport, filename);
			if (newrrr.exists()) {
				newrrr.delete();
			}
			System.out.println(String.format("output %s",newrrr.getAbsolutePath()));
			PrintWriter out = new PrintWriter(newrrr.getAbsolutePath());
			out.println(newreport);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addReport(File outputdir, File xmlfile) {
		String jasperreportsrc = common.getJasperSource(xmlfile);		
		try {
			String identifier = "";
			Timestamp sync = null;
			SAXBuilder sb2=new SAXBuilder();
			Document doc=sb2.build(new StringReader(jasperreportsrc));			
			Element dom = doc.getRootElement();

			Iterator iterator = dom.getChildren().listIterator();
			Element extensionXmlElement;
			while (iterator.hasNext()) {
				extensionXmlElement = (Element) iterator.next();
				String type  = extensionXmlElement.getName();
				if (type == "property")
				{
					String paraname = extensionXmlElement.getAttributeValue("name");
					if (paraname.equals(X_AD_Process.COLUMNNAME_Identifier))					
						identifier = extensionXmlElement.getAttributeValue("value");											
					else if (paraname.equals(X_AD_Process.COLUMNNAME_Synchronized))
					{
						String stringsync = extensionXmlElement.getAttributeValue("value");
						if (stringsync.length() > 0)
						{
							try {
								sync = Timestamp.valueOf(stringsync);
							}
							catch (Exception e)
							{
								sync = null;
							}
						}
					}
				}				
			}	
			if (identifier.length() > 0)
			{
				Format xx = Format.getPrettyFormat();
				XMLOutputter xmOut=new XMLOutputter(xx);
				String sfilename =  xmOut.outputString(doc);	
				String name = xmlfile.getName();
				int pos = name.lastIndexOf(".");
				if (pos > 0) {
					name = name.substring(0, pos);
				}			
				PrintWriter out = new PrintWriter(outputdir.getAbsolutePath()+System.getProperty("file.separator")+name+".xml");
				out.println(sfilename);
				out.close();
			}
			else
			{
				System.out.println(String.format("the %s file don't contain the property Identifier, define in the xml", xmlfile.getAbsoluteFile()));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		Xendra.startup(true);
		String dirin;
		String dirout;
		String plugin;
		if (args.length == 0)
		{
			// si se tuvo harcodeado el http usar este sql para quitar la referencia web sin perder el nombre del jasper
			// update ad_process set jasperreport = substring(jasperreport from '.*/([^/]+)') where jasperreport like 'http://%'
			//host = "localhost";
			//database = "mabycorp";
			dirin  = "/home/americas/workspace/Xendra/reports/src/org/xendra/report/material";
			dirout = "/home/americas/workspace/Xendra/reports/distrib";
			plugin = "/home/americas/workspace/Xendra/reports/src/org/xendra/report/material/plugin/plugin.xml";
			new GenerateReport(dirin, dirout, plugin);
		}
		else
		{
			dirin = args[0];
			dirout = args[1];
			plugin = args[2];
			new GenerateReport(dirin, dirout, plugin);
		}
	}
}