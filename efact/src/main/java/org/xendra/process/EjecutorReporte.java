package org.xendra.process;

import java.sql.Connection;
import java.util.Locale;
import java.util.Map;

import org.compiere.report.JReportManager;
import org.compiere.util.DB;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;

public class EjecutorReporte {
	private String rutaReporte;
	private Map<String, Object> parametros;
	private String nombreReporteGenerado;
	
	private boolean reporteGenerado;
		
	
	public EjecutorReporte(String rutaReporte, Map<String, Object> parametros, String nombreReporteGenerado, String logoPdf) {
		super();
		this.rutaReporte = rutaReporte;
		this.parametros = parametros;
		this.nombreReporteGenerado = nombreReporteGenerado;
		this.parametros.put(JRParameter.REPORT_LOCALE, new Locale("es", "PE"));
		this.parametros.put("P_Logo", logoPdf);
	}
	public void execute() throws Exception {
		try {
			//
			Connection conn = DB.getConnectionRW(true);
			//
			JasperReport reporte;
			reporte = (JasperReport) JRLoader.loadObjectFromFile(this.rutaReporte);
			reporte.setProperty( "net.sf.jasperreports.query.executer.factory.plsql"
                    ,"com.jaspersoft.jrx.query.PlSqlQueryExecuterFactory");
			JasperPrint jasperPrint;
			jasperPrint = JasperFillManager.fillReport(reporte, parametros, conn);
			this.reporteGenerado = jasperPrint.getPages().size() > 0;
			if (this.reporteGenerado) {
				JasperExportManager.exportReportToPdfFile(jasperPrint, this.nombreReporteGenerado);
			} else {
				
			}
			// update s_docheader
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
