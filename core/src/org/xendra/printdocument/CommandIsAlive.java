package org.xendra.printdocument;

import java.io.OutputStream;
import java.util.List;

import org.compiere.util.Util;
import org.xendra.Constants;

public class CommandIsAlive extends CommandHandler {

	protected CommandIsAlive(PrintWorker i, OutputStream o) {
		super(i, o);		
	}

	public void execute() throws Exception {
		final String METHOD_NAME = "execute(): ";
		String error = "";
		try {					
			byte[] b = error.getBytes();
			os.write(b);			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
