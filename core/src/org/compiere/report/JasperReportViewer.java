/*
 * Class JRViewer.
 */
package org.compiere.report;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.PropertyResourceBundle;
import java.util.logging.Level;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JRPrintHyperlink;
import net.sf.jasperreports.engine.JRPrintHyperlinkParameter;
import net.sf.jasperreports.engine.JRPrintHyperlinkParameters;
import net.sf.jasperreports.engine.JRQuery;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.view.JRViewer;

import org.compiere.apps.ADialog;
import org.compiere.apps.EMailDialog;
import org.compiere.model.MUser;
import org.compiere.report.JReportManager.JasperData;
import org.compiere.report.JReportManager.ReportData;
import org.compiere.report.core.RModel;
import org.compiere.report.core.RModelExcelExporter;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Language;
import org.compiere.util.Msg;
import org.compiere.util.Util;

public class JasperReportViewer extends JRViewer implements HyperlinkListener {

	private static final long serialVersionUID = -7988455595896562947L;

	/** Logger */
	private static CLogger log = CLogger.getCLogger(JasperReportViewer.class);

	private JasperPrint jasperPrint;
	private JComboBox comboBox;
	private JReportManager reportManager = null;

	public JasperReportViewer(final JasperViewer jasperViewer,
			final JasperPrint jasperPrint) throws JRException {
		super(jasperPrint);
		this.jasperPrint = jasperPrint;

		tlbToolBar.add(new JSeparator(SwingConstants.VERTICAL));
		JButton btnSendByEmail = new JButton();
		btnSendByEmail.setToolTipText(Msg.getMsg(Env.getCtx(), "SendMail"));
		btnSendByEmail.setText(Msg.getMsg(Env.getCtx(), "SendMail"));
		btnSendByEmail.setPreferredSize(new java.awt.Dimension(85, 23));
		btnSendByEmail.setMaximumSize(new java.awt.Dimension(85, 23));
		btnSendByEmail.setMinimumSize(new java.awt.Dimension(85, 23));
		btnSendByEmail.addActionListener(new SendByEmailListener(jasperViewer,
				this));
		tlbToolBar.add(btnSendByEmail);
		tlbToolBar.add(new JSeparator(SwingConstants.VERTICAL));

		JButton btnExport = new JButton();
		btnExport.setToolTipText(Msg.getMsg(Env.getCtx(), "Export"));
		btnExport.setText(Msg.getMsg(Env.getCtx(), "Export"));
		btnExport.setPreferredSize(new java.awt.Dimension(85, 23));
		btnExport.setMaximumSize(new java.awt.Dimension(85, 23));
		btnExport.setMinimumSize(new java.awt.Dimension(85, 23));
		btnExport.addActionListener(new ExportListener(this));
		tlbToolBar.add(btnExport);

		comboBox = new JComboBox(new String[] { "PDF", "HTML", "XLS" });
		comboBox.setPreferredSize(new java.awt.Dimension(80, 23));
		comboBox.setMaximumSize(new java.awt.Dimension(80, 23));
		comboBox.setMinimumSize(new java.awt.Dimension(80, 23));
		tlbToolBar.add(comboBox);

		// Set default viewer zoom level
		btnFitPage.setSelected(true);
		setZooms();
	}

	public JasperPrint getJasperPrint() {
		return jasperPrint;
	}

	public String getFormat() {
		return (String) comboBox.getSelectedItem();
	}

	/**
	 *
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void gotoHyperlink(JRPrintHyperlink hyperlink) {
		switch (hyperlink.getHyperlinkTypeValue()) {
		case REFERENCE: {
			JRPrintHyperlinkParameters params = null;
			List<JRPrintHyperlinkParameter> lparams = null;
			try {
				/*
				 * JOptionPane.showMessageDialog(null, "Hyperlink: " +
				 * hyperlink.getHyperlinkReference());
				 */

				params = hyperlink.getHyperlinkParameters();
				if (params != null) {
					lparams = params.getParameters();
				}

				if (processHyperLinkReference(hyperlink.getHyperlinkReference(),
						lparams) == false) {
					JOptionPane.showMessageDialog(this, "Error ejecutando hyperlink ver log...");
					
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			} finally {
				params = null;
				lparams.clear();
				lparams = null;
			}
			break;
		}
		case LOCAL_ANCHOR:
		case LOCAL_PAGE: {
			break;
		}
		case REMOTE_ANCHOR:
		case REMOTE_PAGE: {
			JOptionPane
					.showMessageDialog(this,
							"Implement your own JRHyperlinkListener to manage this type of event.");
			break;
		}
		case NONE:
		default: {
			break;
		}
		}
	}

	public void hyperlinkUpdate(HyperlinkEvent e) {
		// TODO Auto-generated method stub

	}

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
	public boolean processHyperLinkReference(String report,
			List<JRPrintHyperlinkParameter> lparams) {

		JasperData data = null;
		File reportFile = null;
		ReportData reportData = null;
		Language currLang = null;
		HashMap<String, Object> params = null;

		try {
			// Create the report manager for the hyperlinked report.
			if (reportManager == null) {
				reportManager = new JReportManager();
			}

			reportData = reportManager.getReportDataInstance(report, false, null);
			if (reportData == null) {
				return false;
			}

			String reportPath = reportData.getReportFilePath();
			if (Util.isEmpty(reportPath, true)) {
				return false;
			}

			String fileExtension = "";
			params = new HashMap<String, Object>();

			// addProcessParameters(AD_PInstance_ID, params, trxName);
			// addProcessInfoParameters(params, pi.getParameter());

			reportFile = reportManager.getReportFile(reportPath,
					(String) params.get("ReportType"));
			if (reportFile == null || reportFile.exists() == false) {
				log
						.severe("No report file found for given type, falling back to "
								+ reportPath);
				reportFile = reportManager.getReportFile(reportPath);
			}

			if (reportFile == null || reportFile.exists() == false) {
				StringBuffer tmp = new StringBuffer(
						"No se pudo encontrar reporte en la ruta:")
						.append("\n").append(reportPath);
				// tmp = "No se pudo encontrar reporte en la ruta: \n" +
				// reportPath;
				log.severe(tmp.toString());
				// reportResult(AD_PInstance_ID, tmp, trxName);
				return false;
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

			// Add reportDir to class path
			ClassLoader scl = ClassLoader.getSystemClassLoader();
			try {
				java.net.URLClassLoader ucl = new java.net.URLClassLoader(
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
					JasperData subData = reportManager
							.processReport(subreports[i]);
					if (subData.getJasperReport() != null) {
						params.put(subData.getJasperName(), subData
								.getJasperFile().getAbsolutePath());
					}
				}

				currLang = Env.getLanguage(Env.getCtx());

				params.put("CURRENT_LANG", currLang.getAD_Language());
				params.put(JRParameter.REPORT_LOCALE, currLang.getLocale());

				// Resources
				File resFile = null;
				if (reportPath.startsWith("resource:")) {
					resFile = reportManager.getResourcesForResourceFile(
							jasperName, currLang);
					// TODO: Implement file:/ for resources
				} else {
					resFile = new File(jasperName + "_"
							+ currLang.getLocale().getLanguage()
							+ ".properties");
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

				// Add external parameters that came form the main repor
				if (lparams != null) {
					for (JRPrintHyperlinkParameter param : lparams) {
						params.put(param.getName(), param.getValue());

						System.out.println(param.getName());
						System.out.println(param.getValue());
					}
				}

				Connection conn = null;
				try {
					conn = reportManager.getConnection();
					jasperPrint = JasperFillManager.fillReport(jasperReport,
							params, conn);
					{
						log.info("ReportStarter.startProcess run report -"
								+ jasperPrint.getName());
						JRViewerProvider viewerLauncher = JReportManager
								.getReportViewerProvider();
						// viewerLauncher.attachProcessData(ctx, pi);
						viewerLauncher.openViewer(jasperPrint, "TEST" + " - "
								+ reportPath);
					}
				} catch (JRException e) {
					log
							.severe("ReportStarter.startProcess: Can not run report - "
									+ e.getMessage());
				} finally {
					if (conn != null)
						try {
							conn.close();
						} catch (SQLException e) {
						}
				}
			}
		} finally {
			data = null;
			reportFile = null;
			reportData = null;
			currLang = null;
			params.clear();
			params = null;
		}
		// reportResult( AD_PInstance_ID, null, trxName);
		return true;
	}
	
	public JasperDesign parseJrXmlFile(String filePath) throws JRException {
	    return JRXmlLoader.load(new File(filePath));
	}

}


class ExportListener implements ActionListener {
	private JasperReportViewer viewer;

	public ExportListener(JasperReportViewer viewer) {
		this.viewer = viewer;
	}

	public void actionPerformed(ActionEvent event) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setSelectedFile(new File(viewer.getJasperPrint().getName()
				+ "." + viewer.getFormat().toLowerCase()));
		if (fileChooser.showSaveDialog(viewer) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {
				if (viewer.getFormat().equals("PDF")) {
					JasperExportManager.exportReportToPdfFile(viewer
							.getJasperPrint(), file.getAbsolutePath());
				} else if (viewer.getFormat().equals("HTML")) {
					JasperExportManager.exportReportToHtmlFile(viewer
							.getJasperPrint(), file.getAbsolutePath());
				} else if (viewer.getFormat().equals("XML")) {
	            		try {
	            			//RModelExcelExporter exporter = new RModelExcelExporter((RModel)model);
	            			//exporter.export(null, null);
	            		}
	            		catch (Exception e) {
	            			ADialog.error(0, null, "Error", e.getLocalizedMessage());
	            			if (CLogMgt.isLevelFinest()) e.printStackTrace();
	            		}                       
				} else if (viewer.getFormat().equals("XLS")) {
					JRXlsExporter exporter = new net.sf.jasperreports.engine.export.JRXlsExporter();
					
					//JExcelApiExporter exporter = new JExcelApiExporter();
					exporter.setParameter(JRXlsExporterParameter.IS_DETECT_CELL_TYPE, true);
					exporter.setParameter(JRXlsExporterParameter.IS_COLLAPSE_ROW_SPAN, true);
					exporter.setParameter(JRXlsExporterParameter.IS_FONT_SIZE_FIX_ENABLED, false);
					//exporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_COLUMNS, true);
					//exporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, true);
					exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND, false); 
					exporter.setParameter(JRXlsExporterParameter.IS_IGNORE_GRAPHICS, true);
					
					exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME,
							file.getAbsolutePath());
					exporter.setParameter(JRExporterParameter.JASPER_PRINT,
							viewer.getJasperPrint());
					exporter.exportReport();
				}
			} catch (JRException e) {
				e.printStackTrace();
			}
		}
	}
}

class SendByEmailListener implements ActionListener {
	/** Logger */
	private static CLogger log = CLogger.getCLogger(SendByEmailListener.class);

	private JasperViewer jasperViewer;
	private JasperReportViewer viewer;

	public SendByEmailListener(JasperViewer jasperViewer,
			JasperReportViewer viewer) {
		this.jasperViewer = jasperViewer;
		this.viewer = viewer;
	}

	public void actionPerformed(ActionEvent event) {
		String to = "";
		MUser from = MUser.get(Env.getCtx(), Env.getAD_User_ID(Env.getCtx()));
		String subject = viewer.getJasperPrint().getName();
		String message = "";
		File attachment = null;

		try {
			attachment = File.createTempFile("mail", ".pdf");
			JasperExportManager.exportReportToPdfFile(viewer.getJasperPrint(),
					attachment.getAbsolutePath());
		} catch (Exception e) {
			log.log(Level.SEVERE, "", e);
		}

		EMailDialog emd = new EMailDialog(jasperViewer, Msg.getMsg(
				Env.getCtx(), "SendMail"), from, to, subject, message,
				attachment);
	}
}
