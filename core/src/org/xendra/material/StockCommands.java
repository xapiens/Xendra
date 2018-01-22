package org.xendra.material;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
/**
 */
public class StockCommands {
	static Logger log = Logger.getLogger(StockCommands.class);
	//ExecutorService executor = Executors.newFixedThreadPool(200); // creating 200 threads
	public StockCommands() {
		super();
	}

	/**
	 * Creates the concrete instance of the command class required.
	 * Then if calls that class' execute() method.
	 * @param command byte[] passed in from the client
	 * @param is InputStream from the client
	 * @param os OutputStream to the client
	 */
	public void handleCommand(StockWorker is, OutputStream os) 
	{
		final String METHOD_NAME = "handleCommand(): ";

		StockCommandHandler commandHandler = null;
		try{
			commandHandler = createCommandHandler(is, os);
//			if (commandHandler != null)
//				commandHandler.execute();
		} catch(Exception e) {
			log.error(METHOD_NAME + "Could not properly handle command:" + is.getCommand());
			log.error(METHOD_NAME + e.getMessage());
		}
	}

	private StockCommandHandler createCommandHandler(StockWorker is, OutputStream os) throws Exception
	{
		final String METHOD_NAME = "createCommandHandler(): ";

		StockCommandHandler result = null;
		try {
				if(StockWorker.Product.equals(is.getCommand())) {					
					result = new CommandProduct(is, os);
					result.execute();
					//executor.execute(result);
				} else if (StockWorker.UpdateStorage.equals(is.getCommand())) {
					result = new CommandUpdateStorage(is, os);
					result.execute();
					//executor.execute(result);
				} else if (StockWorker.IsAlive.equals(is.getCommand())) {
					result = new StockIsAlive(is, os);
					result.execute();
					//executor.execute(result);
				} else if (StockWorker.Document.equals(is.getCommand())) {
					result = new CommandDocument(is, os);
					result.execute();
				//} else if (StockWorker.CheckSignature.equals(is.getCommand())) {
				//	result = new CheckSignature(is, os);
//				} else if (StockWorker.Goals.equals(is.getCommand())) {
//					result = new Goals(is, os);
//				} else if (StockWorker.EndOfPeriod.equals(is.getCommand())) {
//					result = new EndOfPeriod(is, os);
//					executor.execute(result);
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