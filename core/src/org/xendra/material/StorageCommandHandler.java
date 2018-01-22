package org.xendra.material;

import java.io.OutputStream;

public abstract class StorageCommandHandler {
	protected StorageWorker sw;
	protected OutputStream os;
	
	protected StorageCommandHandler(StorageWorker i, OutputStream o) {
		this.sw = i;
		this.os = o;
	}	
	/**
	 * Processes the command in the concrete subclass.  When a command
	 * is sent by the user a concrete class such as {@link CommandProduct}
	 * runs its execute method to handle the command.
	 * @throws LPDException Throws an LPDException if an error occurs.
	 */
	public abstract void execute() throws Exception;

}
