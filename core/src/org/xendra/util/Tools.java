package org.xendra.util;

import java.sql.Timestamp;
import java.util.Calendar;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerCertificate;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Util;

import java.io.File;
import org.xendra.Constants;
import org.xendra.printdocument.Formatter;

public class Tools {
	static Tools m_instance = null;
	public static Tools getInstance()  {
		if (m_instance == null) {
			m_instance = new Tools(); 
		}
		return m_instance;
	}
	static String[] rutaAMes = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SETIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
	//static String PathZipFile = "";
	private String m_SendPath = "";
	public String getPathZipFilesEnvio(MBPartner mb, Timestamp dateInvoiced) {
		if (m_SendPath.length() == 0) {		
			try {
				MBPartnerCertificate bc = new Query(Env.getCtx(), MBPartnerCertificate.Table_Name, "C_BPartner_ID = ?", null)
						.setParameters(mb.getC_BPartner_ID()).first();					
				String pathfilesenvio = bc.get(Constants.SENDFILESPATH);			
				m_SendPath = getDirectorio(pathfilesenvio + File.separator, dateInvoiced);
			} catch (Exception ex) {
				m_SendPath = "Error en getPathZipFilesEnvio" + ex.getMessage();			
			} 
		}
		return m_SendPath;
	}

	public String getDirectorio(String msg, Timestamp fecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(fecha.getTime());
		String year = String.valueOf(cal.get(Calendar.YEAR));		
		String month = String.valueOf(cal.get(Calendar.MONTH)+1);		
		File folder = new File(msg + year + File.separator+ month +File.separator);
		if (!folder.exists()) {
			folder.mkdirs();			
		}
		msg = msg + year + "/" + month + "/";
		return msg;
	}	
	private String m_pathFile;
	
	public String getDocumentNo(String doctaxid, String serial, String DocumentNo) {
		DocumentNo = Util.pad(DocumentNo, 8, Formatter.FIELDALIGNMENTTYPE_TrailingRight, '0');
		String letter = "";
		switch (doctaxid) {
		case "01":
			letter="F";
			break;
		case "03":
			letter="B";
			break;
		} 
		DocumentNo = String.format("%s%s-%s", letter,serial, DocumentNo);
		return DocumentNo;
	}
	public void setFile(String unidadEnvio, String taxid,  String doctaxid, String DocumentNo) {
		//m_SendPath = unidadEnvio;
		m_pathFile = String.format("%s%s-%s-%s", m_SendPath, taxid, doctaxid, DocumentNo);
	}
	public String getSendPath() {
		return m_SendPath;
	}	
	public String getFile() {
		return m_pathFile;
	}
	public String getFile(String extension) {
		String pathFile = "";
		if (extension == null)
			extension = "";
		if (extension.length() == 0)
			pathFile = m_pathFile;					
		else
			pathFile = String.format("%s.%s", m_pathFile, extension);
		return pathFile;
	}	
}
