package org.xendra.printdocument;

import org.apache.log4j.Logger;

/**
 * 
 * The abstract super-class that represents the 2 files sent to us
 * from the CommandReceiveJob.  
 * @author Chris Simoes
 *
 *
 */
public abstract class PrintFile {
	static Logger log = Logger.getLogger(PrintFile.class);
	private String jobNumber;
	private String hostName;
	private String count;
	private String m_type;
	private String m_Error;
	private Integer A_MachinePrinter_ID;
	private Integer C_PrinterDocumentFormat_ID;
	private Integer NumberCopy; 
	private Integer NumberLines;
	private PrintWorker contents;	
	
	public void setJobNumber(String a) {
		this.jobNumber = a;
	}
	public String getJobNumber() {
		return this.jobNumber;
	}
	public void setNumberCopy(Integer a) {
		this.NumberCopy = a;
    }
	public Integer getNumberCopy() {
		return this.NumberCopy;
	}
	public void setHostName(String a) {
		this.hostName = a;
	}
	public String getHostName() {
		return this.hostName;
	}
	public void setCount(String a) {
		this.count = a;
	}
	public String getCount() {
		return this.count;
	}
	public void setContents(PrintWorker a) {
		this.contents = a;
	}
	public PrintWorker getContents() {
		return this.contents;
	}	
	public String getType() {
		return m_type;
	}
	public void setType(String type)
	{
		m_type = type;
	}
	public Integer getC_PrinterDocumentFormat_ID() {
		return C_PrinterDocumentFormat_ID;
	}
	public void setC_PrinterDocumentFormat_ID(Integer format)
	{
		C_PrinterDocumentFormat_ID = format;
	}
	public Integer getA_MachinePrinter_ID() {
		return A_MachinePrinter_ID;
	}
	public void setA_MachinePrinter_ID(Integer printerid)
	{
		A_MachinePrinter_ID = printerid;
	}
	public Integer getNumberLines() {
		return NumberLines;
	}
	public void setNumberLines(Integer numberLines) {
		NumberLines = numberLines;
	}	
}