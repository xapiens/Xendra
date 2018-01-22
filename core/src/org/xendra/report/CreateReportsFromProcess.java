package org.xendra.report;

import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;

import net.sf.jasperreports.engine.JasperCompileManager;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Util;
import org.xendra.Constants;
import org.xendra.utils.Rotdash;

public class CreateReportsFromProcess {
	
	private static CLogger 		log = CLogger.getCLogger(CreateReportsFromProcess.class);
	private File dirreports;
	
	public CreateReportsFromProcess() {
		HashMap props = Env.getMachine().getProperties();
		String locationreports = (String) props.get(Constants.REPORTS);
		dirreports = new File(locationreports);
		if (!dirreports.exists()) {
			locationreports = Ini.getXendraFolder(Constants.REPORTS);
			dirreports = new File(locationreports);
			if (dirreports.exists() || dirreports.mkdirs()) {				
				props.put(Constants.REPORTS, locationreports);
				Env.getMachine().setProperties(props);
				Env.getMachine().save();				
			}			
		}		
		if (dirreports == null || !dirreports.exists())
		{
			return;
		}
		HashMap files = new HashMap();
		if (dirreports != null && dirreports.exists())
		{
			File[] reports = dirreports.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".jasper");
				}
			});			
			for (final File report : reports) {
				if (report.isFile()) {
					Timestamp lastmodified = new Timestamp(report.lastModified());
					Vector vector = new Vector();
					vector.add(report.getAbsoluteFile());
					vector.add(lastmodified);
					files.put(report.getName(), vector);
				}									
			}
		}		
		Rotdash rotdash = Rotdash.getInstance();
		//List<X_AD_Process> processes = new Query(Env.getCtx(), X_AD_Process.Table_Name, "CONTENT NOTNULL AND FILENAME NOTNULL AND isreport = 'Y'", null).list();
		List<X_AD_Process> processes = new Query(Env.getCtx(), X_AD_Process.Table_Name, "CONTENT NOTNULL AND FILENAME NOTNULL AND isactive = 'Y'", null).list();
		for (X_AD_Process process:processes)
		{			
			String jaspername = Util.getFileName(process.getFileName());
			jaspername = jaspername.replace("jrxml","jasper");			
			if (files.containsKey(process.getFileName()))
			{
				Vector vector = (Vector) files.get(process.getFileName());
				Timestamp lastupdated = (Timestamp) vector.lastElement();
				if (lastupdated.equals(process.getSynchronized()))
					continue;
			}
			File destFileName = new File(dirreports, jaspername);
			String filecontent = process.getContent();
			File sourceFileName = new File(dirreports, process.getFileName());
			try {
				PrintWriter out = new PrintWriter(sourceFileName.getAbsoluteFile());
				out.println(filecontent);
				out.close();
				sourceFileName.setLastModified(process.getSynchronized().getTime());				
				log.log(Level.WARNING, String.format("compile %s",sourceFileName.getAbsolutePath()));				
				JasperCompileManager.compileReportToFile(sourceFileName.getAbsolutePath(), destFileName.getAbsolutePath());
				if (destFileName.exists())
				{
					String newjaspername = Util.getFileName(destFileName.getAbsolutePath());
					process.setJasperReport(newjaspername);
					process.save();
				}				
			}					
			catch (Exception e)
			{
				process.setStackTrace(e.getMessage());
				process.setIsActive(false);
				process.save();
				e.printStackTrace();
			}
		}
		rotdash.stop();
	}

	public File getdir() {
		return dirreports;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
