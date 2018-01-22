package org.xendra.printdocument;

import org.apache.log4j.Logger;
import org.xendra.common.Lock;

/**
 * Watches the PrintQueue and removes jobs as they appear there.
 * The jobs are passed on to the proper handler.
 * 
 * @author Chris Simoes
 */

public class QueueMonitor implements Runnable{

	static Logger log = Logger.getLogger(QueueMonitor.class);

	private boolean run;
	private String name;
	private PrintQueue printQueue;
	private Lock queueLock;
	private HandlerFactory handlerFactory;
	private Formats formats;
		
	/**
	 * Create a QueueMonitor.
	 * @param queueName the queue we will be monitoring.
	 */
	public QueueMonitor(String queueName) throws Exception {
		super();
		run = true;
		name = queueName;
		queueLock = Queues.getInstance().getQueueLock(queueName);
		formats = Formats.getInstance();
		handlerFactory = HandlerFactory.getInstance();		
	}
	
	public void stop() {
		run = false;
	}
	
	public String getQueueName() {
		return name;
	}
	
	/**
	 * Watches the PrintQueue and process PrintJobs as they become
	 * available.  If there is an error processing a PrintJob then
	 * The PrintJob is left in the PrintQueue.
	 */ 
	public void run() {
		final String METHOD_NAME = "run(): ";
		
		QueuedPrintJob currentJob = null;
		try {
			while(run) {
				synchronized(queueLock) {
					// start spin lock
					while(0 == Queues.getInstance().getQueueSize(name)) {
						try {
							log.debug(METHOD_NAME + "Nothing to process going to wait()");
							queueLock.wait();
							log.debug(METHOD_NAME + "Somebody woke me up, going to check the Queue: " + name);
						} catch(InterruptedException e) {}  // ignored on purpose
					}
					// if queue has printJob(s) then process them
					currentJob = Queues.getInstance().getNextPrintJob(name);
				} // end synchronized
				HandlerInterface handler = handlerFactory.getPrintHandler(currentJob.getPrintJob());
				String Format = formats.getFormat(currentJob.getPrintJob().getControlFile().getC_PrinterDocumentFormat_ID());
				if(handler.process(currentJob.getPrintJob(), Format)) {
					String userName = currentJob.getPrintJob().getOwner();
					String jobId = String.valueOf(currentJob.getJobId());
					PrintJob printjob = Queues.getInstance().removePrintJob(name, userName, jobId);
					Queues.getInstance().addPrintedJob(name, printjob);
				} else {
					long jobId = currentJob.getJobId();
					String error = handler.getError();
					Queues.getInstance().addError(name, jobId, error);
					log.error(METHOD_NAME + "Error trying to process: " + currentJob.toString());
					Thread.sleep(1000);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
			log.error(METHOD_NAME + e.getMessage());
			log.fatal(METHOD_NAME + "The error above killed the QueueMonitor for:" + name);
		}
	}
}