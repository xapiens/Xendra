package org.xendra.printdocument;

import java.io.*;

import org.apache.log4j.Logger;

/**
 */
public class LinePrinterCommands {
	static Logger log = Logger.getLogger(LinePrinterCommands.class);

	public LinePrinterCommands() {
		super();
	}

	/**
	 * Creates the concrete instance of the command class required.
	 * Then if calls that class' execute() method.
	 * @param command byte[] passed in from the client
	 * @param is InputStream from the client
	 * @param os OutputStream to the client
	 */
	public void handleCommand(PrintWorker is, OutputStream os) 
	{
		final String METHOD_NAME = "handleCommand(): ";

		CommandHandler commandHandler = null;
		try{
			commandHandler = createCommandHandler(is, os);
			if (commandHandler != null)
				commandHandler.execute();
		} catch(Exception e) {
			log.error(METHOD_NAME + "Could not properly handle command:" + is.getCommand());
			log.error(METHOD_NAME + e.getMessage());
		}
	}

	private CommandHandler createCommandHandler(PrintWorker is, OutputStream os) 
		throws Exception
	{
		final String METHOD_NAME = "createCommandHandler(): ";

		CommandHandler result = null;
		try {
				if(PrintWorker.PrintJob.equals(is.getCommand())) {
					result = new CommandPrintJob(is, os);
				} else if(PrintWorker.ReceiveJob.equals(is.getCommand())) {
					result = new CommandReceiveJob(is, os);
				} else if(PrintWorker.ReportQueueStateShort.equals(is.getCommand())) {
					result = new CommandReportQueueStateShort(is, os);
				} else if(PrintWorker.ReportQueueStateLong.equals(is.getCommand())) {
					result = new CommandReportQueueStateLong(is, os);
				} else if(PrintWorker.RemovePrintJob.equals(is.getCommand())) {
					result = new CommandRemovePrintJob(is, os);
				} else if(PrintWorker.IsAlive.equals(is.getCommand())) {
					result = new CommandIsAlive(is, os);
				} else if(PrintWorker.getQueues.equals(is.getCommand())) {
					result = new CommandgetQueues(is, os);				
				} else {
					throw new Exception(METHOD_NAME + "We do not support command:" + is.getCommand());
				}
		} catch(Exception e) {
			log.error(METHOD_NAME + "Could not properly handle command:" + is.getCommand());
			log.error(METHOD_NAME + e.getMessage());
		}
		return result;
	}
}