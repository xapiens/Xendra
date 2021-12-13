package org.xendra.printdocument;

import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.MQuery;
import org.compiere.print.AReport;
import org.compiere.util.CLogger;

public class PrinterDocumentCtrl {
	
	private String m_whereExtended;
	private int m_windowNo;
	private Properties ctx;
	//private MPrinterDocumentFormat m_printformat;
	private MQuery m_query;
	private PrintWorker pw;
	private String m_processMsg;
	private PrintDocument m_printdocument;	
	private static CLogger log = CLogger.getCLogger(AReport.class);
	
	public PrinterDocumentCtrl(Properties ctx, MPrinterDocumentFormat pf, MQuery query) {
		this.ctx = ctx;
		//m_printformat = pf;
		m_query = query;
	}

	public PrinterDocumentCtrl(Properties ctx, PrintDocument pd) {
		this.ctx = ctx;
		m_printdocument = pd;
	}

	public void setWhereExtended(String whereExtended) {
		m_whereExtended = whereExtended;
	}

	public String getWhereExtended() {
		return m_whereExtended;
	}
 	
	/* Save windowNo of the report to parse the context */
	public void setWindowNo(int windowNo) {
		m_windowNo = windowNo;
	}
	
	public int getWindowNo() {
		return m_windowNo;
	}
	
	public PrintWorker getPrintWorker() {
		pw = m_printdocument.getPrintWorker(m_query);
		if (pw == null)
		{
			m_processMsg = pw.getProcessMsg();
		}
		//pw = m_printformat.getPrintWorker(m_query);
		//if (pw == null)
		//{
		//	m_processMsg = m_printformat.getProcessMsg();
		//}
		return pw;
	}

	public String getProcessMsg()
	{
		return m_processMsg;
	}	//	getProcessMsg

	public String printdirect(PrintWorker pw) {
		String error = pw.Print(PrintWorker.ReceiveJob);
		return error;
	}
	public void print(PrintWorker pw) {
		
		if (pw == null)
		{
			ADialog.error(this.getWindowNo(), null, getProcessMsg());
		}
		else
		{
			Viewer viewer = new Viewer(pw);
		}
	}
}