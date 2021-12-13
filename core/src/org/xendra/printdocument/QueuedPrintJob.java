package org.xendra.printdocument;

import org.simoes.lpd.common.*;

import org.compiere.util.CLogger;

/**
 * A copy of a printJob plus the jobId used by the PrintQueue
 * to store the opriginal copy of this PrintJob.
 * 
 * 
 * @author Chris Simoes
 */
public class QueuedPrintJob {
	static CLogger log = CLogger.getCLogger(QueuedPrintJob.class);

	private long jobId;
	private PrintJob printJob;
	
	/**
	 * Constructor for the QueuedPrintJob.
	 * @param id the PrintQueue id of the PrintJob
	 * @param printJob a copy of the original PrintJob stored in the PrintQueue 
	 */
	public QueuedPrintJob(long id, PrintJob printJob) {
		this.jobId = id;
		this.printJob = printJob;	
	}
	
	public long getJobId() {
		return jobId;
	}
	
	public PrintJob getPrintJob() {
		return printJob;
	}
}