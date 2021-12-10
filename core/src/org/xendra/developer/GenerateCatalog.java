package org.xendra.developer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.logging.Level;

import org.columba.api.plugin.PluginMetadata;
import org.columba.core.plugin.ExtensionXMLParser;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Util;

public class GenerateCatalog {
	
	private static CLogger	log	= CLogger.getCLogger (GenerateCatalog.class);	
	public static void main (String[] args)
	{
		//org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.WARNING);		
		log.warning("Generate Catalog   $Revision: 1.0 $");
		log.warning("----------------------------------");
		String directory = System.getProperty("user.home").concat("/model/");
		if (args.length > 0)
			directory = args[0];
		if (directory == null || directory.length() == 0)
		{
			System.err.println("No Directory");
			System.exit(1);
		}
		log.warning("Directory: " + directory);
		//	second parameter
		String fileplugin = "";
		if (args.length > 1)
			fileplugin = args[1]; 
		if (fileplugin == null || fileplugin.length() == 0) 
		{
			System.err.println("No plugin file");
			System.exit(1);
		}
		log.warning("file plugin:   " + fileplugin);
		new GenerateCatalog(directory, fileplugin);		
	}

	public GenerateCatalog(String directory, String pluginfile) {
		
		StringBuffer sb = createCatalog(pluginfile);
		if (directory.equals(".")) 
			directory = "";
		writeToFile (sb, directory + "catalog.xml");		
	}
	
	private static StringBuffer createCatalog(String pluginfile) {
		File xmlFile = new File(pluginfile);
		if (!xmlFile.exists()) {
			log.warning(String.format("catalog: %s not exists", xmlFile));
		} else {
			log.warning(String.format("catalog: %s exists", xmlFile));
		}
		BufferedInputStream buf;
		try {
			buf = new BufferedInputStream(new FileInputStream(xmlFile));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			// cancel
			return null;
		}
		//addExtensionHandlers(buf);
		ExtensionXMLParser extension = new ExtensionXMLParser();
		HashMap map = extension.parsePlugin(pluginfile, buf);
		PluginMetadata plugin = (PluginMetadata) map.get("metadata");
		StringBuffer start = new StringBuffer ();
		Util.append(start, "<plugin");
		Util.append(start, String.format(" id=\"%s\" ", plugin.getId()));
		Util.append(start, String.format(" name=\"%s\" ", plugin.getName()));
		Util.append(start, String.format(" description=\"%s\" ", plugin.getDescription()));
		Util.append(start, String.format(" category=\"%s\" ", plugin.getCategory()));
		Util.append(start, String.format(" synchronized=\"%s\" ", plugin.getSynchronized()));
		Util.append(start, String.format(" tag=\"%s\" ", plugin.getTags()));
		Util.append(start, ">");
		return start;
	}

	/**************************************************************************
	 * 	Write to file
	 * 	@param sb string buffer
	 * 	@param fileName file name
	 */
	private void writeToFile (StringBuffer sb, String fileName)
	{
		try
		{
			File out = new File (fileName);
			// FileWriter fw = new FileWriter (out);
			// http://sourceforge.net/tracker/index.php?func=detail&aid=1629947&group_id=176962&atid=879332
			boolean ignore = false;
			Writer fw = new OutputStreamWriter(new FileOutputStream(out, false), "UTF-8");
			for (int i = 0; i < sb.length(); i++)
			{
				char c = sb.charAt(i);
				//	after
				if (c == ';' || c == '}')
				{
					if (sb.substring(i+1).startsWith(";"))
					{
						ignore = true;
						continue;
					}
					//					else if (c == ';' && sb.substring(i+1).startsWith("@"))
					//					{
					//						ignore = true;
					//						//continue;
					//					}					
					fw.write (c);
					if (sb.substring(i+1).startsWith("//"))
					{
						fw.write('\t');							
					}
					if (!ignore)
						fw.write(Env.NL);					
					else
						ignore = false;
					//else
					//	ignore = false;
					//if (!ignore)
					//	fw.write(Env.NL);
					//else
					//	ignore = false;
				}
				//	before & after
				else if (c == '{')
				{
					fw.write(Env.NL);
					fw.write (c);
					fw.write(Env.NL);
				}
				else
					fw.write (c);
			}
			fw.flush ();
			fw.close ();
			float size = out.length();
			size /= 1024;
			log.warning(out.getAbsolutePath() + " - " + size + " kB");
		}
		catch (Exception ex)
		{
			log.log(Level.SEVERE, fileName, ex);
		}
	}	//	writeToFile
	
}
