package org.xendra.material;

public class QueuedStockJob {
	private long jobId;
	private StockWorker sw;
	
	/**
	 * Constructor for the QueuedPrintJob.
	 * @param id the PrintQueue id of the PrintJob
	 * @param stockworker a copy of the original PrintJob stored in the PrintQueue 
	 */
	public QueuedStockJob(long id, StockWorker stockworker) {
		this.jobId = id;
		this.sw = stockworker;	
	}
	
	public long getJobId() {
		return jobId;
	}
	
	public StockWorker getStockWorker() {
		return sw;
	}	
}
