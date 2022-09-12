package org.xendra.process;

import java.io.File;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.adempiere.util.ProcessUtil;
import org.compiere.model.MInvoice;
import org.compiere.model.MPInstance;
import org.compiere.model.MProcess;
import org.compiere.model.MQuery;
import org.compiere.model.PrintInfo;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.print.MPrintFormat;
import org.compiere.print.ReportEngine;
import org.compiere.process.ProcessInfo;
import org.compiere.report.ReportStarter;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Language;
import org.compiere.util.Trx;

public class ReportePDF {

	public static void main(String[] args) {
		if (!org.compiere.Xendra.startup(false))
		{					
			return;
		}
		Env.setContext(Env.getCtx(), "#Date", new Timestamp(System.currentTimeMillis()));
		Optional<String> langName = Optional.ofNullable(Ini.getProperty(Ini.P_LANGUAGE));
		Language language = Language.getLanguage(langName.isPresent()?langName.get():"");
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());
		//
		String result = new ReportePDF().creaPdf();
	}
	private String creaPdf() {
		try {
			Map<String, Object> parametros = new HashMap<String, Object>();
			parametros.put("P_docu", "01");
			String subReportDir = "/home/xapiens/";
			parametros.put("SUBREPORT_DIR", subReportDir);
			String reportDir = subReportDir+"FacturaElectronica.jasper";
			EjecutorReporte executor = new EjecutorReporte( reportDir, parametros, "/home/xapiens/ejemplo.pdf", "/home/xapiens/logo.gif");
			executor.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	public static void main2(String[] args) {
		if (!org.compiere.Xendra.startup(false))
		{					
			return;
		}
		Env.setContext(Env.getCtx(), "#Date", new Timestamp(System.currentTimeMillis()));
		Optional<String> langName = Optional.ofNullable(Ini.getProperty(Ini.P_LANGUAGE));
		Language language = Language.getLanguage(langName.isPresent()?langName.get():"");
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());

		//org.compiere.Xendra.startupEnvironment(true);
		//
		int AD_Table_ID = 100;
		MQuery q = new MQuery("AD_Table");
		q.addRestriction("AD_Table_ID", "<", 108);
		//
		MPrintFormat f = MPrintFormat.createFromTable(Env.getCtx(), AD_Table_ID);
		PrintInfo i = new PrintInfo("test", AD_Table_ID, 108, 0);
		i.setAD_Table_ID(AD_Table_ID);
		ReportEngine re = new ReportEngine(Env.getCtx(), f, q, i);
		re.layout();
		/**
		re.createCSV(new File("C:\\Temp\\test.csv"), ',', Language.getLanguage());
		re.createHTML(new File("C:\\Temp\\test.html"), false, Language.getLanguage());
		re.createXML(new File("C:\\Temp\\test.xml"));
		re.createPS(new File ("C:\\Temp\\test.ps"));
		 **/
		re.createPDF(new File("/home/xapiens/test.pdf"));
		/****/
		//re.print();
		//	re.print(true, 1, false, "Epson Stylus COLOR 900 ESC/P 2");		//	Dialog
		//	re.print(true, 1, false, "HP LaserJet 3300 Series PCL 6");		//	Dialog
		//	re.print(false, 1, false, "Epson Stylus COLOR 900 ESC/P 2");	//	Dialog
		System.exit(0);
	}

}
