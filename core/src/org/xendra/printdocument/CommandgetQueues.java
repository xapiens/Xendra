package org.xendra.printdocument;

import java.io.OutputStream;
import java.util.List;

import org.compiere.util.Util;
import org.xendra.Constants;

public class CommandgetQueues extends CommandHandler {

	protected CommandgetQueues(PrintWorker i, OutputStream o) {
		super(i, o);		
	}

	public void execute() throws Exception {
		final String METHOD_NAME = "execute(): ";		
		List<String> queuenames = Queues.getInstance().getQueueNames();		
		String queues = "";
		for (String queue:queuenames)
		{
			if (queues.length() > 0)
				queues += ",";
			queues += queue;
		}		
		try {					
			byte[] b = queues.getBytes();
			os.write(b);			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
