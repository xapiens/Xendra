package org.xendra.printdocument;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Vector;

public class CommandRemovePrintJob extends CommandHandler {

	protected CommandRemovePrintJob(PrintWorker i, OutputStream o) {
		super(i, o);
		// TODO Auto-generated constructor stub
	}

	
	public void execute() throws Exception {
		String queueName = pw.getQueueName(); // parseCommand() should guarantee queue is not null			
		String userName = "Name";
		String jobId = new String();

		try {
			//jobNumber = (byte[]) info.get(3);
			//jobId = new String(jobNumber); 
			// query queue for last print job if no print job number given
			List queueudPrintJobInfos = Queues.getInstance().listAllPrintJobs(queueName);
			QueuedPrintJobInfo queuedPrintJobInfo = 
					(QueuedPrintJobInfo) queueudPrintJobInfos.get(queueudPrintJobInfos.size()-1); 
			jobId = String.valueOf(queuedPrintJobInfo.getId());

			// remove job command
			Queues.getInstance().removePrintJob(queueName, userName, jobId);
		} catch(Exception e) {				
			throw new Exception(e);
		}
	}
}
