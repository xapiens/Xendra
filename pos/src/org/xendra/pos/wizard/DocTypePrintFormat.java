package org.xendra.pos.wizard;

public class DocTypePrintFormat {
	private Integer C_DocType_ID = 0;
	private Integer POSMachinePrinter_ID = 0;
	private Integer AD_MessageFormat_ID = 0;
	private Integer POSPrinterDocumentFormat_ID = 0;
	private String Source;
	public Integer getC_DocType_ID() {
		return C_DocType_ID;
	}
	public void setC_DocType_ID(Integer c_DocType_ID) {
		C_DocType_ID = c_DocType_ID;
	}
	public Integer getPOSMachinePrinter_ID() {
		return POSMachinePrinter_ID;
	}
	public void setPOSMachinePrinter_ID(Integer pOSMachinePrinter_ID) {
		POSMachinePrinter_ID = pOSMachinePrinter_ID;
	}
	public Integer getPOSPrinterDocumentFormat_ID() {
		return POSPrinterDocumentFormat_ID;
	}
	public void setPOSPrinterDocumentFormat_ID(Integer pOSPrinterDocumentFormat_ID) {
		POSPrinterDocumentFormat_ID = pOSPrinterDocumentFormat_ID;
	}	
	public Integer getAD_MessageFormat_ID() {
		return AD_MessageFormat_ID;
	}
	public void setAD_MessageFormat_ID(Integer messageFormat_ID) {
		AD_MessageFormat_ID = messageFormat_ID;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}	
}
