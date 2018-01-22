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

import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.PropertyResourceBundle;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.JobName;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;

import org.compiere.model.MAttachment;
import org.compiere.model.MAttachmentEntry;
import org.compiere.model.MProcess;
import org.compiere.model.PrintInfo;
import org.compiere.model.persistence.X_AD_PInstance_Para;
import org.compiere.print.MPrintFormat;
import org.compiere.print.PrintUtil;
import org.compiere.print.ReportCtl;
import org.compiere.process.ClientProcess;
import org.compiere.process.ProcessCall;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.report.JReportManager.FileFilter;
import org.compiere.report.JReportManager.ReportData;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Language;
import org.compiere.util.Trx;
import org.compiere.util.Util;
import org.compiere.util.DigestOfFile;
import org.xendra.exceptions.DBException;
import org.xendra.exceptions.XendraException;

/**
 * @author rlemeill Originally coming from an application note from
 *         compiere.co.uk --- Modifications: Allow Jasper Reports to be able to
 *         be run on VPN profile (i.e: no direct connection to DB). Implemented
 *         ClientProcess for it to run on client.
 * @author Ashley Ramdass
 * @author victor.perez@e-evolution.com
 * @see FR 1906632
 *      http://sourceforge.net/tracker/?func=detail&atid=879335&aid=1906632&group_id=176962
 *      
 * @author Teo Sarca, www.arhipac.ro <li>FR [ 2581145 ] Jasper: Provide
 *         parameters info
 * @author Cristina Ghita, www.arhipac.ro <li>BF [ 2778472 ] Subreport bug
 */
public class ReportStarter implements ProcessCall, ClientProcess {
	/** Logger */
	private static CLogger log = CLogger.getCLogger(ReportStarter.class);

	private ProcessInfo processInfo;
	private MAttachment attachment;
	private JReportManager reportManager = new JReportManager();
	private static JasperPrint jasperPrint;

	/**
	 * Start the process. Called then pressing the Process button in R_Request.
	 * It should only return false, if the function could not be performed as
	 * this causes the process to abort.
	 * 
	 * @author rlemeill
	 * @param ctx
	 *            context
	 * @param pi
	 *            standard process info
	 * @param trx
	 * @return true if success
	 */
	public boolean startProcess(Properties ctx, ProcessInfo pi, Trx trx) {
		processInfo = pi;
		String Name = pi.getTitle();
		int AD_PInstance_ID = pi.getAD_PInstance_ID();
		int Record_ID = pi.getRecord_ID();

		log.info("Name=" + Name + "  AD_PInstance_ID=" + AD_PInstance_ID
				+ " Record_ID=" + Record_ID);
		String trxName = null;
		if (trx != null) {
			trxName = trx.getTrxName();
		}
		ReportData reportData = getReportData(pi, trxName);
		if (reportData == null) {
			// reportResult(AD_PInstance_ID, "Can not find report data",
			// trxName);
			String tmp = "no se pudo encontrar datos del reporte";
			processInfo.setError(true);
			processInfo.setSummary(tmp);
			return false;
		}

		String reportPath = reportData.getReportFilePath();
		if (Util.isEmpty(reportPath, true)) {
			// reportResult(AD_PInstance_ID, "Can not find report", trxName);
			String tmp = "Reporte no encontrado";
			processInfo.setError(true);
			processInfo.setSummary(tmp);
			return false;
		}

		org.compiere.report.JReportManager.JasperData data = null;
		File reportFile = null;
		String fileExtension = "";
		HashMap<String, Object> params = new HashMap<String, Object>();

		addProcessParameters(AD_PInstance_ID, params, trxName);
		addProcessInfoParameters(params, pi.getParameter());

		reportFile = reportManager.getReportFile(reportPath, (String) params.get("ReportType"));
		if (reportFile == null || reportFile.exists() == false) {
			log.severe("No report file found for given type, falling back to "
					+ reportPath);
			reportFile = getReportFile(reportPath);
		}

		if (reportFile == null || reportFile.exists() == false) {
			StringBuffer tmp = new StringBuffer(
					"No se pudo encontrar reporte en la ruta:").append("\n")
					.append(reportPath);
			// tmp = "No se pudo encontrar reporte en la ruta: \n" + reportPath;
			log.severe(tmp.toString());
			// reportResult(AD_PInstance_ID, tmp, trxName);
			processInfo.setError(true);
			processInfo.setSummary(tmp.toString());
		}

		if (reportFile != null) {
			data = reportManager.processReport(reportFile);
			fileExtension = reportFile.getName().substring(
					reportFile.getName().lastIndexOf("."),
					reportFile.getName().length());
		} else {
			return false;
		}

		JasperReport jasperReport = data.getJasperReport();
		String jasperName = data.getJasperName();
		String name = jasperReport.getName();
		File reportDir = data.getReportDir();
		java.net.URLClassLoader ucl = null;
		// Add reportDir to class path
		ClassLoader scl = ClassLoader.getSystemClassLoader();
		try {
			ucl = new java.net.URLClassLoader(
					new java.net.URL[] { reportDir.toURI().toURL() }, scl);
			net.sf.jasperreports.engine.util.JRResourcesUtil
					.setThreadClassLoader(ucl);
		} catch (MalformedURLException me) {
			log.warning("Could not add report directory to classpath: "
					+ me.getMessage());
		}

		if (jasperReport != null) {
			File[] subreports;

			// Subreports
			if (reportPath.startsWith("http://")
					|| reportPath.startsWith("https://")) {
				// Locate and download subreports from remote webcontext
				subreports = reportManager.getHttpSubreports(jasperName
						+ "Subreport", reportPath, fileExtension);
			} else if (reportPath.startsWith("attachment:")) {
				subreports = getAttachmentSubreports(reportPath);
			} else if (reportPath.startsWith("resource:")) {
				subreports = reportManager.getResourceSubreports(name
						+ "Subreport", reportPath, fileExtension);
			}
			// TODO: Implement file:/ lookup for subreports
			else {
				// Locate subreports from local/remote filesystem
				subreports = reportDir.listFiles(reportManager
						.getFileFilterInstance(jasperName + "Subreport",
								reportDir, fileExtension));
			}

			for (int i = 0; i < subreports.length; i++) {
				org.compiere.report.JReportManager.JasperData subData = reportManager
						.processReport(subreports[i]);
				if (subData.getJasperReport() != null) {
					params.put(subData.getJasperName(), subData.getJasperFile()
							.getAbsolutePath());
				}
			}

			if (Record_ID > 0)
				params.put("RECORD_ID", new Integer(Record_ID));

			// contribution from Ricardo (ralexsander)
			// in iReports you can 'SELECT' AD_Client_ID, AD_Org_ID and
			// AD_User_ID using only AD_PINSTANCE_ID
			params.put("AD_PINSTANCE_ID", new Integer(AD_PInstance_ID));

			Language currLang = Env.getLanguage(Env.getCtx());
			String printerName = null;
			MPrintFormat printFormat = null;
			PrintInfo printInfo = null;
			ProcessInfoParameter[] pip = pi.getParameter();
			// Get print format and print info parameters
			if (pip != null) {
				for (int i = 0; i < pip.length; i++) {
					if (ReportCtl.PARAM_PRINT_FORMAT.equalsIgnoreCase(pip[i]
							.getParameterName())) {
						printFormat = (MPrintFormat) pip[i].getParameter();
					}
					if (ReportCtl.PARAM_PRINT_INFO.equalsIgnoreCase(pip[i]
							.getParameterName())) {
						printInfo = (PrintInfo) pip[i].getParameter();
					}
					if (ReportCtl.PARAM_PRINTER_NAME.equalsIgnoreCase(pip[i]
							.getParameterName())) {
						printerName = (String) pip[i].getParameter();
					}
				}
			}
			if (printFormat != null) {
				if (printInfo != null) {
					// Set the language of the print format if we're printing a
					// document
					if (printInfo.isDocument()) {
						currLang = printFormat.getLanguage();
					}
				}
				// Set printer name unless already set.
				if (printerName == null) {
					printerName = printFormat.getPrinterName();
				}
			}

			params.put("CURRENT_LANG", currLang.getAD_Language());
			params.put(JRParameter.REPORT_LOCALE, currLang.getLocale());

			// Resources
			File resFile = null;
			if (reportPath.startsWith("attachment:") && attachment != null) {
				resFile = getAttachmentResourceFile(jasperName, currLang);
			} else if (reportPath.startsWith("resource:")) {
				resFile = reportManager.getResourcesForResourceFile(jasperName,
						currLang);
				// TODO: Implement file:/ for resources
			} else {
				resFile = new File(jasperName + "_"
						+ currLang.getLocale().getLanguage() + ".properties");
				if (!resFile.exists()) {
					resFile = null;
				}
				if (resFile == null) {
					resFile = new File(jasperName + ".properties");
					if (!resFile.exists()) {
						resFile = null;
					}
				}
			}
			if (resFile != null) {
				try {
					PropertyResourceBundle res = new PropertyResourceBundle(
							new FileInputStream(resFile));
					params.put("RESOURCE", res);
				} catch (IOException e) {
					;
				}
			}

			Connection conn = null;
			try {
				conn = reportManager.getConnection();
				jasperPrint = JasperFillManager.fillReport(jasperReport,params, conn);
				if (reportData.isDirectPrint()) {
					log.info("ReportStarter.startProcess print report -"
							+ jasperPrint.getName());
					// RF 1906632
					if (!processInfo.isBatch()) {

						// Get printer job
						PrinterJob printerJob = org.compiere.print.CPrinter
								.getPrinterJob(printerName);
						// Set print request attributes

						// Paper Attributes:
						PrintRequestAttributeSet prats = new HashPrintRequestAttributeSet();

						// add: copies, job-name, priority
						if (printInfo.isDocumentCopy()
								|| printInfo.getCopies() < 1)
							prats.add(new Copies(1));
						else
							prats.add(new Copies(printInfo.getCopies()));
						Locale locale = Language.getLoginLanguage().getLocale();
						prats.add(new JobName(printFormat.getName() + "_" + pi.getRecord_ID(), locale));
						prats.add(PrintUtil
								.getJobPriority(jasperPrint.getPages().size(),
										printInfo.getCopies(), true));

						// Create print service exporter
						JRPrintServiceExporter exporter = new JRPrintServiceExporter();
						;
						// Set parameters
						exporter.setParameter(JRExporterParameter.JASPER_PRINT,	jasperPrint);
						exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE,printerJob.getPrintService());
						exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, printerJob.getPrintService().getAttributes());
						exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET, prats);
						exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
						exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG,Boolean.FALSE);
						// Print report / document
						exporter.exportReport();

					} else {
						// You can use JasperPrint to create PDF
						// Used For the PH
						try {
							File PDF = File.createTempFile("mail", ".pdf");
							JasperExportManager.exportReportToPdfFile(jasperPrint, PDF.getAbsolutePath());
							processInfo.setPDFReport(PDF);
						} catch (IOException e) {
							log.severe("ReportStarter.startProcess: Can not make PDF File - " + e.getMessage());
						}
					}

					// You can use JasperPrint to create PDF
					// JasperExportManager.exportReportToPdfFile(jasperPrint,
					// "BasicReport.pdf");
				} else {
					log.info("ReportStarter.startProcess run report -"
							+ jasperPrint.getName());
					JRViewerProvider viewerLauncher = JReportManager
							.getReportViewerProvider();
					viewerLauncher.openViewer(jasperPrint, pi.getTitle()+reportPath);
				}
			} catch (JRException e) {
				log.severe("ReportStarter.startProcess: Can not run report - "
						+ e.getMessage());
			} finally {
				if (conn != null)
					try {
						conn.close();
					} catch (SQLException e) {
					}
			}
		}

		// reportResult( AD_PInstance_ID, null, trxName);
		return true;
	}

	/**
	 * Get .property resource file from process attachment
	 * 
	 * @param jasperName
	 * @param currLang
	 * @return File
	 */
	private File getAttachmentResourceFile(String jasperName, Language currLang) {
		File resFile = null;
		MAttachmentEntry[] entries = attachment.getEntries();
		// try baseName + "_" + language
		for (int i = 0; i < entries.length; i++) {
			if (entries[i].getName().equals(
					jasperName + currLang.getLocale().getLanguage()
							+ ".properties")) {
				resFile = getAttachmentEntryFile(entries[i]);
				break;
			}
		}
		if (resFile == null) {
			// try baseName only
			for (int i = 0; i < entries.length; i++) {
				if (entries[i].getName().equals(jasperName + ".properties")) {
					resFile = getAttachmentEntryFile(entries[i]);
					break;
				}
			}
		}
		return resFile;
	}

	/**
	 * Get subreports from attachment. Assume all other jasper attachment is
	 * subreport.
	 * 
	 * @param reportPath
	 * @return File[]
	 */
	private File[] getAttachmentSubreports(String reportPath) {
		String name = reportPath.substring("attachment:".length()).trim();
		ArrayList<File> subreports = new ArrayList<File>();
		MAttachmentEntry[] entries = attachment.getEntries();
		for (int i = 0; i < entries.length; i++) {
			if (!entries[i].getName().equals(name)
					&& (entries[i].getName().toLowerCase().endsWith(".jrxml") || entries[i]
							.getName().toLowerCase().endsWith(".jasper"))) {
				File reportFile = getAttachmentEntryFile(entries[i]);
				if (reportFile != null)
					subreports.add(reportFile);
			}
		}
		File[] subreportsTemp = new File[0];
		subreportsTemp = subreports.toArray(subreportsTemp);
		return subreportsTemp;
	}

	/**
	 * @author alinv
	 * @param reportPath
	 * @return the abstract file corresponding to report
	 */
	protected File getReportFile(String reportPath) {
		File reportFile = null;
		if (reportPath.startsWith("attachment:")) {
			// report file from process attachment
			reportFile = downloadAttachment(reportPath);
		} else
			reportFile = reportManager.getReportFile(reportPath);
		return reportFile;
	}

	/**
	 * Download db attachment
	 * 
	 * @param reportPath
	 *            must of syntax attachment:filename
	 * @return File
	 */
	private File downloadAttachment(String reportPath) {
		File reportFile = null;
		String name = reportPath.substring("attachment:".length()).trim();
		MProcess process = new MProcess(Env.getCtx(), processInfo
				.getAD_Process_ID(), processInfo.getTransactionName());
		attachment = process.getAttachment();
		if (attachment != null) {
			MAttachmentEntry[] entries = attachment.getEntries();
			MAttachmentEntry entry = null;
			for (int i = 0; i < entries.length; i++) {
				if (entries[i].getName().equals(name)) {
					entry = entries[i];
					break;
				}
			}
			if (entry != null) {
				reportFile = getAttachmentEntryFile(entry);
			}
		}
		return reportFile;
	}

	/**
	 * Download db attachment to local file
	 * 
	 * @param entry
	 * @return File
	 */
	private File getAttachmentEntryFile(MAttachmentEntry entry) {
		String localFile = System.getProperty("java.io.tmpdir")
				+ System.getProperty("file.separator") + entry.getName();
		String downloadedLocalFile = System.getProperty("java.io.tmpdir")
				+ System.getProperty("file.separator") + "TMP"
				+ entry.getName();
		File reportFile = new File(localFile);
		if (reportFile.exists()) {
			String localMD5hash = DigestOfFile.GetLocalMD5Hash(reportFile);
			String entryMD5hash = DigestOfFile.getMD5Hash(entry.getData());
			if (localMD5hash.equals(entryMD5hash)) {
				log.info(" no need to download: local report is up-to-date");
			} else {
				log
						.info(" report on server is different that local one, download and replace");
				File downloadedFile = new File(downloadedLocalFile);
				entry.getFile(downloadedFile);
				if (!reportFile.delete()) {
					throw new XendraException("Cannot delete temporary file "
							+ reportFile.toString());
				}
				if (!downloadedFile.renameTo(reportFile)) {
					throw new XendraException("Cannot rename temporary file "
							+ downloadedFile.toString() + " to "
							+ reportFile.toString());
				}
			}
		} else {
			entry.getFile(reportFile);
		}
		return reportFile;
	}

	/**
	 * Load Process Parameters into given params map
	 * 
	 * @param AD_PInstance_ID
	 * @param params
	 * @param trxName
	 */
	private static void addProcessParameters(int AD_PInstance_ID,
			Map<String, Object> params, String trxName) {
		final String sql = "SELECT " + " "
				+ X_AD_PInstance_Para.COLUMNNAME_ParameterName + ","
				+ X_AD_PInstance_Para.COLUMNNAME_P_String + ","
				+ X_AD_PInstance_Para.COLUMNNAME_P_String_To + ","
				+ X_AD_PInstance_Para.COLUMNNAME_P_Number + ","
				+ X_AD_PInstance_Para.COLUMNNAME_P_Number_To + ","
				+ X_AD_PInstance_Para.COLUMNNAME_P_Date + ","
				+ X_AD_PInstance_Para.COLUMNNAME_P_Date_To + ","
				+ X_AD_PInstance_Para.COLUMNNAME_Info + ","
				+ X_AD_PInstance_Para.COLUMNNAME_Info_To + " FROM "
				+ X_AD_PInstance_Para.Table_Name + " WHERE "
				+ X_AD_PInstance_Para.COLUMNNAME_AD_PInstance_ID + "=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY, trxName);
			pstmt.setInt(1, AD_PInstance_ID);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				String pStr = rs.getString(2);
				String pStrTo = rs.getString(3);
				BigDecimal pNum = rs.getBigDecimal(4);
				BigDecimal pNumTo = rs.getBigDecimal(5);

				Timestamp pDate = rs.getTimestamp(6);
				Timestamp pDateTo = rs.getTimestamp(7);
				if (pStr != null) {
					if (pStrTo != null) {
						params.put(name + "1", pStr);
						params.put(name + "2", pStrTo);
					} else {
						params.put(name, pStr);
					}
				} else if (pDate != null) {
					if (pDateTo != null) {
						params.put(name + "1", pDate);
						params.put(name + "2", pDateTo);
					} else {
						params.put(name, pDate);
					}
				} else if (pNum != null) {
					if (pNumTo != null) {
						params.put(name + "1", pNum);
						params.put(name + "2", pNumTo);
					} else {
						params.put(name, pNum);
					}
				}
				//
				// Add parameter info - teo_sarca FR [ 2581145 ]
				String info = rs.getString(8);
				String infoTo = rs.getString(9);
				params.put(name + "_Info1", (info != null ? info : ""));
				params.put(name + "_Info2", (infoTo != null ? infoTo : ""));
			}
		} catch (SQLException e) {
			// log.severe("Execption; sql = "+sql+"; e.getMessage() = "
			// +e.getMessage());
			throw new DBException(e, sql);
		} finally {
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
	}

	private void addProcessInfoParameters(Map<String, Object> params,
			ProcessInfoParameter[] para) {
		if (para != null) {
			for (int i = 0; i < para.length; i++) {
				if (para[i].getParameter_To() == null) {
					params.put(para[i].getParameterName(), para[i]
							.getParameter());
				} else {
					params.put(para[i].getParameterName() + "1", para[i]
							.getParameter());
					params.put(para[i].getParameterName() + "2", para[i]
							.getParameter_To());
				}
			}
		}
	}

	/**
	 * @author rlemeill
	 * @param ProcessInfo
	 * @return ReportData or null if no data found
	 */
	public ReportData getReportData(ProcessInfo pi, String trxName) {
		log.info("");
		String sql = "SELECT pr.JasperReport, pr.IsDirectPrint "
				+ "FROM AD_Process pr, AD_PInstance pi "
				+ "WHERE pr.AD_Process_ID = pi.AD_Process_ID "
				+ " AND pi.AD_PInstance_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY, trxName);
			pstmt.setInt(1, pi.getAD_PInstance_ID());
			rs = pstmt.executeQuery();
			String path = null;
			boolean directPrint = false;
			boolean isPrintPreview = pi.isPrintPreview();
			if (rs.next()) {
				path = rs.getString(1);

				if ("Y".equalsIgnoreCase(rs.getString(2))
						&& !Ini.isPropertyBool(Ini.P_PRINTPREVIEW)
						&& !isPrintPreview)
					directPrint = true;
			} else {
				log.severe("data not found; sql = " + sql);
				return null;
			}

			return reportManager.getReportDataInstance(path, directPrint);
		} catch (SQLException e) {
			throw new DBException(e, sql);
			// log.severe("sql = "+sql+"; e.getMessage() = "+ e.getMessage());
			// return null;
		} finally {
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
	}

}