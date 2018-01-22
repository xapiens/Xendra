package org.xendra.material;

import org.apache.log4j.Logger;
import org.xendra.common.Queue;
import org.xendra.common.QueuedObject;

public class StockQueue {
	protected Queue queue = new Queue("stock");
	static Logger log = Logger.getLogger(StockQueue.class);

    public long add(StockWorker stockworker) {
		return queue.add(stockworker);
    }
    
	public QueuedStockJob getNextJob() throws Exception {
		QueuedStockJob rval = null;
		try {
			QueuedObject queuedObject = (QueuedObject) queue.getNext();
			long queueId = queuedObject.getId();
			StockWorker stockworker = (StockWorker)queuedObject.getObject();
			rval = new QueuedStockJob(queueId, (StockWorker) stockworker.clone());
		} catch (Exception e) {
			throw e;
		}
		return rval;
	}
	
    /** remove print job from queue.
     * @return PrintJob from the queue or null if it was not found
     */
    public StockWorker remove(long id) throws Exception {
    	StockWorker rval = null;
		try {
		    rval = (StockWorker)queue.remove(id);		    
		} catch (Exception objectNotFoundException) {
		    log.info("job for id[" + id + "] was not found in the queue[" + queue.getName() + "]");
		    throw objectNotFoundException;
		}
		return rval;
    }
    
	public int getsize() {
		return queue.size();
	}
}
