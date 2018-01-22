package org.xendra.printdocument;

import java.io.*;

/**
 * This class is the super class for any class that handles a lpd command.
 * @author Chris Simoes
 *
 * There will be several subclasses for each top level command of the lpd deamon.
 */

public abstract class CommandHandler {
		
	protected PrintWorker pw;
	protected OutputStream os;
	
	protected CommandHandler(PrintWorker i, OutputStream o) {
		this.pw = i;
		this.os = o;
	}
	
	/**
	 * Processes the command in the concrete subclass.  When a command
	 * is sent by the user a concrete class such as {@link CommandReceiveJob}
	 * runs its execute method to handle the command.
	 * @throws LPDException Throws an LPDException if an error occurs.
	 */
	public abstract void execute() throws Exception;

	

}