package org.xendra.printdocument;

import org.compiere.util.CLogger;
import org.compiere.util.Util;
import org.xendra.Constants;

/**
 * Creates the concrete implementation of the Handler we
 * will use to process PrintJobs based on the 
 * properties file.  The default if there are problems is FILE. 
 * 
 * @author Chris Simoes
 */
public class HandlerFactory {
	static CLogger log = CLogger.getCLogger(HandlerFactory.class);

	private final static HandlerFactory INSTANCE = new HandlerFactory();
	
	/**
	 * Constructor for LPD.
	 */
	private HandlerFactory() {
		super();
		final String METHOD_NAME = "HandlerFactory(): ";
		log.fine(METHOD_NAME + "STARTED");
		//handler = ConfigResources.getProperty(Constants.KEY_PRINT_JOB_HANDLER);
		//handler = "PRINT";
		//if(Util.isEmpty(handler)) {
		//	log.warn(METHOD_NAME + "The handler was not set from the properties file.");
		//	log.warn(METHOD_NAME + "Using the default of: " + Constants.VALUE_FILE);
		//	handler = Constants.VALUE_FILE;
		//}
	}

	/**
	 * This class is a singleton.  
	 * @return the only instance of HandlerFactory
	 */
	public static HandlerFactory getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Returns the concrete implementation of the HandlerInterface based
	 * on the settings in the properties file.
	 * @param printJob 
	 * @return HandlerInterface the concrete implementation of the HandlerInterface
	 */
	public HandlerInterface getPrintHandler(PrintJob printJob) {
		ControlFile cf = printJob.getControlFile();		
		final String METHOD_NAME = "getPrintHandler(): ";
		HandlerInterface result = null;
		if(Constants.VALUE_PRINTER.equals(cf.getType())) {
			result = new PDFPrintHandler();
		} else if(Constants.VALUE_PRINT.equals(cf.getType().trim())) {
			result = new PrintHandler();
		} else if(Constants.VALUE_FILE.equals(cf.getType().trim())) {
			result = new FileHandler();
		} else if(Constants.VALUE_NETWORK.equals(cf.getType().trim())) {
			log.severe(METHOD_NAME + "No Handler implemented yet for:" + Constants.VALUE_NETWORK);
		} else if(Constants.VALUE_DATABASE.equals(cf.getType().trim())) {
			log.severe(METHOD_NAME + "No Handler implemented yet for:" + Constants.VALUE_DATABASE);
		} else { // if some how it did not get set then default is FILE
			log.severe(METHOD_NAME + "The handler is not set.");
			log.severe(METHOD_NAME + "Using the default of: " + Constants.VALUE_FILE);
			result = new FileHandler();
		}
		return result;
	}
}