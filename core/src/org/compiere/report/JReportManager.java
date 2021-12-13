/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *                      *
 *****************************************************************************/
package org.compiere.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.logging.Level;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

import org.compiere.Xendra;
import org.compiere.db.CConnection;
import org.compiere.db.DB_PostgreSQL;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Util;
import org.compiere.util.Language;
import org.compiere.util.DigestOfFile;

/**
 * 
 * Originally base code by rlemeill
 * Originally coming from an application note from compiere.co.uk
 * ---
 * Modifications: Separate from ReportStarter to share with yperlink reports-
 * Allow Jasper to handle hyperlinks to simulate drilldown reports
 * 	.
 * @author Ashley Ramdass
 * @author victor.perez@e-evolution.com
 * @see FR 1906632 http://sourceforge.net/tracker/?func=detail&atid=879335&aid=1906632&group_id=176962
 * @author Teo Sarca, www.arhipac.ro
 * 			<li>FR [ 2581145 ] Jasper: Provide parameters info
 * @author Cristina Ghita, www.arhipac.ro
 * 			<li>BF [ 2778472 ] Subreport bug
 * @author Carlos Arana R.
 */
public class JReportManager 
{
	/** Logger */
	private static CLogger log = CLogger.getCLogger(JReportManager.class);
	protected static File REPORT_HOME = null;

	private static JRViewerProvider viewerProvider = new SwingJRViewerProvider();


	static {
		String reportPath = System.getProperty("org.compiere.report.path");
		if (reportPath == null) {
			REPORT_HOME = new File(Ini.getXendraHome() + File.separator + "reports");
		} else {
			REPORT_HOME = new File(reportPath);
		}
	}




	/**
	 * Search for additional subreports deployed to a webcontext if
	 * the parent report is located there
	 * @author deathmeat
	 * @param reportName The original report name
	 * @param reportPath The full path to the parent report
	 * @param fileExtension The file extension of the parent report
	 * @return An Array of File objects referencing to the downloaded subreports
	 */
	protected File[] getHttpSubreports(String reportName, String reportPath, String fileExtension)
	{
		ArrayList<File> subreports = new ArrayList<File>();
		String remoteDir = reportPath.substring(0, reportPath.lastIndexOf("/"));

		// Currently check hardcoded for max. 10 subreports
		for(int i=1; i<10; i++)
		{
			// Check if subreport number i exists
			File subreport = Util.httpDownloadedReport(remoteDir + "/" + reportName + i + fileExtension);
			if(subreport == null) // Subreport doesn't exist, abort further approaches
				break;

			subreports.add(subreport);
		}

		File[] subreportsTemp = new File[0];
		subreportsTemp = subreports.toArray(subreportsTemp);
		return subreportsTemp;
	}


	/**
	 * Returns the Server Connection if direct connection is not available
	 * (VPN, WAN, Terminal) and thus query has to be run on server only else return
	 * a direct connection to DB.
	 *
	 * Notes: Need to refactor and integrate in DB if confirmed to be working as
	 * expected.
	 *
	 * @author Ashley Ramdass
	 * @return Connection DB Connection
	 */
	protected Connection getConnection()
	{
		return DB.getConnectionRW(true);
	}





	/**
	 * Get .property resource file from resources
	 * @param jasperName
	 * @param currLang
	 * @return File
	 */
	protected File getResourcesForResourceFile(String jasperName, Language currLang) {
		File resFile = null;
		try {
			resFile = getFileAsResource(jasperName+currLang.getLocale().getLanguage()+".properties");
		} catch (Exception e) {
			// ignore exception - file couldn't exist
		}
		return resFile;
	}



	/**
	 * Search for additional subreports deployed as resources
	 * @param reportName The original report name
	 * @param reportPath The full path to the parent report
	 * @param fileExtension The file extension of the parent report
	 * @return An Array of File objects referencing to the downloaded subreports
	 */
	protected File[] getResourceSubreports(String reportName, String reportPath, String fileExtension)
	{
		ArrayList<File> subreports = new ArrayList<File>();
		String remoteDir = reportPath.substring(0, reportPath.lastIndexOf("/"));

		// Currently check hardcoded for max. 10 subreports
		for(int i=1; i<10; i++)
		{
			// Check if subreport number i exists
			File subreport = null;
			try {
				subreport = getFileAsResource(remoteDir + "/" + reportName + i + fileExtension);
			} catch (Exception e) {
				// just ignore it
			}
			if(subreport == null) // Subreport doesn't exist, abort further approaches
				break;

			subreports.add(subreport);
		}

		File[] subreportsTemp = new File[subreports.size()];
		subreportsTemp = subreports.toArray(subreportsTemp);
		return subreportsTemp;
	}

	/**
	 * @author alinv
	 * @param reportPath
	 * @param reportType
	 * @return the abstract file corresponding to typed report
	 */
	protected File getReportFile(String reportPath, String reportType) {

		if (reportType != null)
		{
			int cpos = reportPath.lastIndexOf('.');
			reportPath = reportPath.substring(0, cpos) + "_" + reportType + reportPath.substring(cpos, reportPath.length());
		}

		return getReportFile(reportPath);
	}

	/**
	 * @author alinv
	 * @param reportPath
	 * @return the abstract file corresponding to report
	 */
	protected File getReportFile(String reportPath)
	{
		File reportFile = null;

		// Reports deployment on web server Thanks to Alin Vaida
		if (reportPath.startsWith("http://") || reportPath.startsWith("https://")) {
			reportFile = Util.httpDownloadedReport(reportPath);
		} else if (reportPath.startsWith("/")) {
			reportFile = new File(reportPath);
		} else if (reportPath.startsWith("file:/")) {
			try {
				reportFile = new File(new URI(reportPath));
			} catch (URISyntaxException e) {
				log.warning(e.getLocalizedMessage());
				reportFile = null;
			}
		} else if (reportPath.startsWith("resource:")) {
			try {
				reportFile = getFileAsResource(reportPath);
			} catch (Exception e) {
				log.warning(e.getLocalizedMessage());
				reportFile = null;
			}
		} else {
			reportFile = new File(REPORT_HOME, reportPath);
		}

		// Set org.compiere.report.path because it is used in reports which refer to subreports
		if (reportFile != null)
		{
			System.setProperty("org.compiere.report.path", reportFile.getParentFile().getAbsolutePath());
		}
		return reportFile;
	}

	/**
	 * @param reportPath
	 * @return
	 * @throws Exception
	 */
	private File getFileAsResource(String reportPath) throws Exception {
		File reportFile;
		String name = reportPath.substring("resource:".length()).trim();
		String localName = name.replace('/', '_');
		log.info("reportPath = " + reportPath);
		log.info("getting resource from = " + getClass().getClassLoader().getResource(name));
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(name);
		String localFile = System.getProperty("java.io.tmpdir") + System.getProperty("file.separator") + localName;
		log.info("localFile = " + localFile);
		reportFile = new File(localFile);

		OutputStream out = null;
		out = new FileOutputStream(reportFile);
		if (out != null){
			byte buf[]=new byte[1024];
			int len;
			while((len=inputStream.read(buf))>0)
				out.write(buf,0,len);
			out.close();
			inputStream.close();
		}

		return reportFile;
	}




	/**
	 * @author rlemeill
	 * @param reportFile
	 * @return
	 */
	protected JasperData processReport( File reportFile) {
		log.info( "reportFile.getAbsolutePath() = "+reportFile.getAbsolutePath());
		JasperReport jasperReport = null;

		String jasperName = reportFile.getName();
		int pos = jasperName.indexOf('.');
		if (pos!=-1) jasperName = jasperName.substring(0, pos);
		File reportDir = reportFile.getParentFile();

		//test if the compiled report exists
		File jasperFile = new File( reportDir.getAbsolutePath(), jasperName+".jasper");
		if (jasperFile.exists()) { // test time
			if (reportFile.lastModified() == jasperFile.lastModified()) {
				log.info(" no need to compile use "+jasperFile.getAbsolutePath());
				try {
					jasperReport = (JasperReport)JRLoader.loadObject(jasperFile.getAbsolutePath());
				} catch (JRException e) {
					jasperReport = null;
					log.severe("Can not load report - "+ e.getMessage());
				}
			} else {
				jasperReport = compileReport( reportFile, jasperFile);
			}
		} else { // create new jasper file
			jasperReport = compileReport( reportFile, jasperFile);
		}

		return new JasperData( jasperReport, reportDir, jasperName, jasperFile);
	}



	/**
	 * @author rlemeill
	 * Correct the class path if loaded from java web start
	 */
	private void JWScorrectClassPath()
	{
		URL jasperreportsAbsoluteURL = Thread.currentThread().getContextClassLoader().getResource("net/sf/jasperreports/engine");
		String jasperreportsAbsolutePath = "";

		if(jasperreportsAbsoluteURL.toString().startsWith("jar:http:") || jasperreportsAbsoluteURL.toString().startsWith("jar:https:"))
		{
			// Jasper classes are deployed to a webserver (Java Webstart)
			jasperreportsAbsolutePath = jasperreportsAbsoluteURL.toString().split("!")[0].split("jar:")[1];

			// Download the required jasper libraries if they are not already existing
			File reqLib = new File(System.getProperty("java.io.tmpdir"), "CompiereJasperReqs.jar");
			if(!reqLib.exists() && !(reqLib.length() > 0))
			{
				try{
					URL reqLibURL = new URL(jasperreportsAbsolutePath);
					InputStream in = reqLibURL.openStream();

					FileOutputStream fout = new FileOutputStream(reqLib);

					byte buf[] = new byte[1024];
					int s = 0;

					while((s = in.read(buf, 0, 1024)) > 0)
						fout.write(buf, 0, s);

					in.close();
					fout.flush();
					fout.close();
				} catch (FileNotFoundException e) {
					log.warning("Required library not found "+ e.getMessage());
					reqLib.delete();
					reqLib = null;
				} catch (IOException e) {
					log.severe("I/O error downloading required library from server "+ e.getMessage());
					reqLib.delete();
					reqLib = null;
				}
			}

			jasperreportsAbsolutePath = reqLib.getAbsolutePath();
		}
		else
		{
			// Jasper classes are locally available (Local client)
			jasperreportsAbsolutePath = jasperreportsAbsoluteURL.toString().split("!")[0].split("file:")[1];
		}

		if(jasperreportsAbsolutePath != null && !jasperreportsAbsolutePath.trim().equals(""))
		{
			// Check whether the current CLASSPATH already contains our
			// jasper libraries and dependencies or not.
			if(System.getProperty("java.class.path").indexOf(jasperreportsAbsolutePath) < 0)
			{
				System.setProperty("java.class.path",
						System.getProperty("java.class.path") +
						System.getProperty("path.separator") +
						jasperreportsAbsolutePath);
				log.info("Classpath has been corrected to " + System.getProperty("java.class.path"));
			}
		}
	}

	/**
	 * @author rlemeill
	 * @param reportFile
	 * @param jasperFile
	 * @return compiled JasperReport
	 */
	private JasperReport compileReport( File reportFile, File jasperFile)
	{
		JWScorrectClassPath();
		JasperReport compiledJasperReport = null;
		try {
			JasperCompileManager.compileReportToFile ( reportFile.getAbsolutePath(), jasperFile.getAbsolutePath() );
			jasperFile.setLastModified( reportFile.lastModified()); //Synchronize Dates
			compiledJasperReport =  (JasperReport)JRLoader.loadObject(jasperFile);
		} catch (JRException e) {
			log.log(Level.SEVERE, "Error", e);
		}
		return compiledJasperReport;
	}


	protected ReportData getReportDataInstance(String reportFilePath, boolean directPrint, HashMap properties) {
		return new ReportData(reportFilePath, directPrint, properties);
	}

	protected FileFilter getFileFilterInstance(String reportStart, File directory, String extension) {
		return new FileFilter(reportStart, directory, extension);
	}

	/**
	 * Set jasper report viewer provider.
	 * @param provider
	 */
	public static void setReportViewerProvider(JRViewerProvider provider) {
		if (provider == null)
			throw new IllegalArgumentException("Cannot set report viewer provider to null");
		viewerProvider = provider;
	}

	/**
	 * Get the current jasper report viewer provider
	 * @return JRViewerProvider
	 */
	public static JRViewerProvider getReportViewerProvider() {
		return viewerProvider;
	}

	protected class ReportData {
		private String reportFilePath;
		private boolean directPrint;
		private HashMap Properties;
		private DB_PostgreSQL	p_db = new DB_PostgreSQL();
		public ReportData(String reportFilePath, boolean directPrint, HashMap properties) {
			X_A_Machine web = Env.getServerWeb(Env.getMachine());
			if (web != null)
			{
				if (properties == null)
					properties = new HashMap();
				this.Properties = properties;
				HashMap props = Env.getServerProperties(web.getA_Machine_ID(), REF_ServerType.WebServer); 
				int port = 0;
				if (props.containsKey("port")) {
					port = Integer.valueOf(props.get("port").toString());
				}        		
				if (reportFilePath == null)
					reportFilePath = "";
				if (!reportFilePath.startsWith("http")) 
					reportFilePath  = String.format("http://%s:%s/reports/%s",web.getName(),port,reportFilePath);
				//if (reportFilePath.contains("http://localhost"))
				//	reportFilePath = reportFilePath.replace("http://localhost", server);
				this.reportFilePath = reportFilePath;
				this.directPrint = directPrint;
			}
		}

		public String getReportFilePath() {
			return reportFilePath;
		}

		public boolean isDirectPrint() {
			return directPrint;
		}

		public Connection getConnection() {
			Connection conn = null;
			if (Properties.containsKey("url")) {
				String url = (String) Properties.get("url");
				try {					
					CConnection cc = CConnection.get(null);
					conn = p_db.getDriverConnection(url, cc.getDbUid(), cc.getDbPwd());
				} catch (SQLException e) {
					e.printStackTrace();
				}			
			}
			return conn;
		}
	}

	protected class JasperData  implements Serializable
	{
		/**
		 *
		 */
		private static final long serialVersionUID = 4375195020654531202L;
		private JasperReport jasperReport;
		private File reportDir;
		private String jasperName;
		private File jasperFile;

		public JasperData(JasperReport jasperReport, File reportDir, String jasperName, File jasperFile) {
			this.jasperReport = jasperReport;
			this.reportDir = reportDir;
			this.jasperName = jasperName;
			this.jasperFile = jasperFile;
		}

		public JasperReport getJasperReport() {
			return jasperReport;
		}

		public File getReportDir() {
			return reportDir;
		}

		public String getJasperName() {
			return jasperName;
		}

		public File getJasperFile() {
			return jasperFile;
		}
	}

	protected class FileFilter implements FilenameFilter {
		private String reportStart;
		private File directory;
		private String extension;

		public FileFilter(String reportStart, File directory, String extension) {
			this.reportStart = reportStart;
			this.directory = directory;
			this.extension = extension;
		}

		public boolean accept(File file, String name) {
			if (file.equals( directory)) {
				if (name.startsWith( reportStart)) {
					int pos = name.lastIndexOf( extension);
					if ( (pos!=-1) && (pos==(name.length()-extension.length()))) return true;
				}
			}
			return false;
		}
	}

}