package org.xendra.printdocument.driver;

public interface PrinterDriver {
	public String FONT_NORMAL_BOLD = "";
	public String FONT_NORMAL = "";
	public String FONT_CONDENSED = "";  
	public String FONT_CANCELCONDENSED = "";
	public String PAPER_CUT = "";
	public String LINE_FEED	= "";
	public void boldOn() throws Exception;
	public void boldOff() throws Exception;
	public void condensedOn() throws Exception;
	public void condensedOff() throws Exception;	
	public void lineFeed() throws Exception;
	public void pageFeed() throws Exception;
	public void paperCut() throws Exception;
    public void cashdraweropen() throws Exception;
	public void output(String text) throws Exception;
	public void close() throws Exception;
}
