package org.xendra.printdocument;

import org.apache.log4j.Logger;
import org.simoes.lpd.util.PrintUtil;

/**
 * Handles PDF PrintJobs by using AcroRd32 from Adobe to write 
 * the PDF's to a printer.
 * 
 * @author Chris Simoes
 */
public class PDFPrintHandler implements HandlerInterface {
	static Logger log = Logger.getLogger(PDFPrintHandler.class);

	public PDFPrintHandler() {
		super();
	}
	
	/**
	 * Writes the printJob to disk using the jobName and jobId.
	 * @param printJob the PrintJob we are processing
	 * @return the result of our work, true for success or false for non-success
	 */
	public boolean process(PrintJob printJob, String Format) {
		final String METHOD_NAME = "process(): ";
		boolean result = false;
		if(null != printJob 
			&& null != printJob.getControlFile()
			&& null != printJob.getDataFile()) 
		{
			PrintUtil printUtil = new PrintUtil();
			try { 
				//printUtil.printPDF(printJob.getDataFile().getContents(), null);
				result = true;
			} catch(Exception e) {
				log.error(METHOD_NAME + e.getMessage());
			}
		} else {
			log.error(METHOD_NAME + "The printJob or printJob.getControlFile() or printJob.getDataFile() were empty");
		}
		return result;
	}

	@Override
	public String getError() {
		// TODO Auto-generated method stub
		return null;
	}
}
