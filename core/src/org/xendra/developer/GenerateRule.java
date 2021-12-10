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
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;

import org.columba.core.xml.XMLCoreParser;
import org.jdom.CDATA;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xendra.Constants;

public class GenerateRule {
	private File dirinput;
	private File diroutput;
	public GenerateRule(String dirin, String dirout) {
		try {			
			dirinput = new File(dirin);
			diroutput = new File(dirout);
			File groups = new File(dirinput, "groups.xml");
			File[] xmlfiles = dirinput.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".in.xml");
				}
			});
			if (groups.exists()) {
				File newrrr = new File(diroutput, "groups.xml");
				Files.copy(groups.toPath(), newrrr.toPath(), StandardCopyOption.REPLACE_EXISTING);								
			}
			for (File xmlfile:xmlfiles)
			{
				if (xmlfile.isFile())
				{
					System.out.println(xmlfile.getAbsolutePath());
					BufferedInputStream buf = new BufferedInputStream(new FileInputStream(xmlfile));
					parseFormat(xmlfile.getName().replace(".in.xml", ".xml"), buf);					
				}

			}
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
		String dirin = "/home/americas/workspace/Xendra/standard/src/org/xendra/drools";
		String dirout = "/home/americas/workspace/Xendra/standard/src/org/xendra/standard/rules";
		if (args.length > 0)	
			dirin = args[0];		
		if (args.length > 1)
			dirout = args[1];
			new GenerateRule(dirin,dirout);
	}

	private void parseFormat(String filename, BufferedInputStream is) {
		try {			
			Document doc = XMLCoreParser.retrieveDocument(is);
			Element parent = doc.getRootElement();
			Iterator iterator = parent.getChildren().listIterator();
			Element extensionXmlElement;
			while (iterator.hasNext()) {
				extensionXmlElement = (Element) iterator.next();
				String id = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
				String type  = extensionXmlElement.getName();
				if (type == "rule")
				{
					String file  = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_FILE);
					File rule = new File(dirinput, file);
					System.out.println(rule.getCanonicalPath());
					BufferedInputStream buf = new BufferedInputStream(new FileInputStream(rule));
					byte[] contents = new byte[1024];
					int bytesRead = 0;
					String strFileContents = "";
					while ( (bytesRead = buf.read(contents)) != -1) {
						strFileContents += new String(contents, 0, bytesRead);
					}																			
					CDATA datafile = new CDATA(strFileContents);
					extensionXmlElement.addContent(datafile);
				}				
			}			
			String newrule = new XMLOutputter(Format.getPrettyFormat()).outputString(doc);
			File newrrr = new File(diroutput, filename);
			if (newrrr.exists()) {
				newrrr.delete();
			}
			System.out.println(String.format("output %s",newrrr.getAbsolutePath()));
			PrintWriter out = new PrintWriter(newrrr.getAbsolutePath());
			out.println(newrule);
			out.close();
		}	
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
