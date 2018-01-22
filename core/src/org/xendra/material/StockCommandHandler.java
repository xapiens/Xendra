package org.xendra.material;

import java.io.OutputStream;

import org.xendra.printdocument.PrintWorker;

public abstract class StockCommandHandler {
	protected StockWorker sw;
	protected OutputStream os;
	
	protected StockCommandHandler(StockWorker sw, OutputStream os) {
		this.sw = sw;
		this.os = os;
	}	
	/**
	 * Processes the command in the concrete subclass.  When a command
	 * is sent by the user a concrete class such as {@link CommandProduct}
	 * runs its execute method to handle the command.
	 * @throws LPDException Throws an LPDException if an error occurs.
	 */
	public abstract void execute() throws Exception;

	
}
