package org.xendra.material;

import java.io.OutputStream;

import org.apache.log4j.Logger;

public class StorageCommands {
	static Logger log = Logger.getLogger(StorageCommands.class);
	/**
	 * Creates the concrete instance of the command class required.
	 * Then if calls that class' execute() method.
	 * @param command byte[] passed in from the client
	 * @param is InputStream from the client
	 * @param os OutputStream to the client
	 */
	public void handleCommand(StorageWorker is, OutputStream os) 
	{
		final String METHOD_NAME = "handleCommand(): ";

		StorageCommandHandler commandHandler = null;
		try{
			commandHandler = createCommandHandler(is, os);
			if (commandHandler != null)
				commandHandler.execute();
		} catch(Exception e) {
			log.error(METHOD_NAME + "Could not properly handle command:" + is.getCommand());
			log.error(METHOD_NAME + e.getMessage());
		}
	}
	
	private StorageCommandHandler createCommandHandler(StorageWorker is, OutputStream os) throws Exception
	{
		final String METHOD_NAME = "createCommandHandler(): ";

		StorageCommandHandler result = null;
		try {
				if(StorageWorker.NotReserved.equals(is.getCommand())) {
					result = new StorageCommandNotReserved(is, os);
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