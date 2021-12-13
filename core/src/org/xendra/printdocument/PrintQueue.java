package org.xendra.printdocument;

import java.util.*;
import org.compiere.util.CLogger;
import org.xendra.common.Lock;
import org.xendra.common.Queue;
import org.xendra.common.QueuedObject;

/**
 * The PrintQueue is just a queue that only accepts print jobs
 * still need to figure out how the events get sent
 * 
 * @author Jason Crowe
 */
public class PrintQueue {    
    // logger
    static CLogger log = CLogger.getCLogger(PrintQueue.class);
    
    // private constants
    private final static String CLASS = PrintQueue.class.getName();
    private final static String NEWLINE = System.getProperty("line.separator");
    
    // protected variables
    protected final Lock lock;
    protected Queue queue;

	private Hashtable printJobError = new Hashtable();
	private List<Object> printedjobs = new ArrayList<Object>();

    /** constructor.
     * @param name - name of the print queue.
     */
    public PrintQueue(String name) {
		queue = new Queue(name);
		lock = new Lock(name);
    }
    
    public Lock getLock() {
    	return lock;
    }
    
    /** add print job to queue.
     * @return the unique identifier of the print job in the queue.
     */
    public long add(PrintJob printJob) {
		return queue.add(printJob);
    }
    
    /** remove print job from queue.
     * @return PrintJob from the queue or null if it was not found
     */
    public PrintJob remove(long id) throws Exception {
		PrintJob rval = null;
		try {
		    rval = (PrintJob)queue.remove(id);		    
		    if (printJobError.containsKey(id))
		    {
		    	printJobError.remove(id);
		    }
		} catch (Exception objectNotFoundException) {
		    log.info("print job for id[" + id + "] was not found in the queue[" + queue.getName() + "]");
		    throw objectNotFoundException;
		}
		return rval;
    }
    
    public void addError(long id, String error) throws Exception {    	
    	if (!printJobError.containsKey(id))
    		printJobError.put(id, error);
    }
	/**
	 * Gets the next PrintJob without removing it.
     * @return PrintJob the next printJob in the queue or null if theres an error
	 */
	public QueuedPrintJob getNextPrintJob() throws Exception {
		final String METHOD_NAME = "getNextPrintJob(): "; 
		QueuedPrintJob rval = null;
		try {
			QueuedObject queuedObject = (QueuedObject)queue.getNext();
			long queueId = queuedObject.getId();
			PrintJob printJob = (PrintJob)queuedObject.getObject();
			// create a clone of the PrintJob for our return value
			rval = new QueuedPrintJob(queueId, (PrintJob)printJob.clone()); 
		} catch (Exception e) {
			log.info(METHOD_NAME + e.getMessage()); 
			throw e;
		}
		return rval;
	}

	/** remove all print jobs from queue.
	 * @return number of jobs removed, or -1 if this failed
	 */
	public int removeAll() {
		int rval = -1;
		rval = size();
		queue = new Queue(queue.getName());
		return rval;
	}

    /** size of the print queue.
     * @return size of the print queue.
     */
    public int size() {
		return queue.size();
    }
    
    /** list items in queue.
     * @throws ClassCastException if queue contains non print jobs.
     */
    public List list() {
		List rval = null;
		
		List list = new Vector();
		// get the items from the queue
		List qlist = queue.list();
		// iterate over them
	 	for (Iterator iter = qlist.iterator(); iter.hasNext();) {
		    QueuedObject queuedObject = (QueuedObject)iter.next();
		    // create queued print job info object
		    QueuedPrintJobInfo queuedPrintJobInfo = new QueuedPrintJobInfo(queuedObject);		    
		    if (printJobError.containsKey(queuedPrintJobInfo.getId()))
		    	queuedPrintJobInfo.setError((String) printJobError.get(queuedPrintJobInfo.getId()));		    
		    // add to list
		    list.add(queuedPrintJobInfo);
		}
		rval = list;
		return rval;
    }
    
    public void closeQueue() {
    	this.notifyAll();
    }

	public void addPrintedJob(PrintJob printjob) {
		synchronized (printedjobs) {				
			if ( printedjobs.size() > 20)
			{
				printedjobs.remove(printedjobs.size()-1);				
			}
			ListIterator<Object> lir = printedjobs.listIterator();
			lir.add(printjob);
		}
	}	

    public List listPrintedJobs() {
    	List rval = null;		
    	List list = new Vector();
    	// get the items from the queue	
    	long id = 0;
    	Date timeStamp = new Date(System.currentTimeMillis());
    	synchronized (printedjobs) {
    		ListIterator<Object> lir = printedjobs.listIterator();
    		while (lir.hasNext()) {
    			PrintJob pj = (PrintJob) lir.next();
    			QueuedObject qo = new QueuedObject(id, timeStamp ,pj);
    			QueuedPrintJobInfo queuedPrintJobInfo = new QueuedPrintJobInfo(qo);
    			list.add(queuedPrintJobInfo);
    			id++;
    		}
    	}
    	rval = list;
    	return rval;
    }

	public PrintJob getPrintedJob(int i) {
		PrintJob pj = null;
		if ( i < printedjobs.size())
		 pj = (PrintJob) printedjobs.get(i);
		return pj;
	}
	
	public PrintJob getJob(int i) {
		PrintJob pj = null;
		List queueList = queue.list();
		if (i < queueList.size())
		{
			QueuedObject queuedObject = (QueuedObject)queueList.get(i);
			pj = (PrintJob) queuedObject.getObject();
		}
		return pj;
	}
}
