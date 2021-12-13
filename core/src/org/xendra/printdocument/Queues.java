package org.xendra.printdocument;

import java.util.*;

import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.util.CLogger;
import org.compiere.util.Util;
import org.xendra.common.Lock;

/**
 * This class maintains all of the Print queues and contains all of the logic
 * for performing operations on them.     
 *
 */
public class Queues {
	static CLogger log = CLogger.getCLogger(Queues.class);

	private final static Queues INSTANCE = new Queues();
	private final Hashtable queues = new Hashtable(); 
	//private final List<String> queuenames = new ArrayList<String>();
	//private final Hashtable devices = new Hashtable();
	//private X_A_MachinePrinter m_printer = null;
	//private List<X_A_MachinePrinter> m_printers = new ArrayList<X_A_MachinePrinter>();
	private HashMap m_printers = new HashMap();
	/**
	 * Constructor for LPD.
	 */
	private Queues() {
		super();
		log.fine("Queues(): STARTED");
	}

	/**
	 * This class is a singleton.  
	 * @return the only instance of Queues.
	 */
	public static Queues getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Creates a Print Queue with the name passed in
	 * @param queueName - the name of the print queue
	 * @throws Exception
	 */
	//public void createQueue(String queueName, String devicename) throws Exception {
	public void createQueue(X_A_MachinePrinter printer) throws Exception {	
		final String METHOD_NAME = "createQueue(): ";
		//if(Util.isEmpty(queueName)) {
		if (Util.isEmpty(printer.getQueueName())) {
			throw new Exception(METHOD_NAME + "queueName passed in was empty.");
		//} else if(queues.containsKey(queueName)) {
		} else if (queues.containsKey(printer.getQueueName())) {
			throw new Exception(METHOD_NAME + "the queue called(" + printer.getQueueName() + ") already exists.");
		} else {
			//queues.put(queueName, new PrintQueue(queueName));
			queues.put(printer.getQueueName(), new PrintQueue(printer.getQueueName()));
			//queuenames.add(queueName);
			//queuenames.add(printer.getQueueName());
			if (!m_printers.containsKey(printer.getQueueName()))
			{				
				m_printers.put(printer.getQueueName(), printer.getA_MachinePrinter_ID());
			}			
//			if (!devices.containsKey(queueName))
//			{
//				devices.put(queueName, devicename);
//			}
		}
	}
	
	/**
	 * Creates a Print Queue with the name passed in and creates a TableModel for the GUI.
	 * @param queueName - the name of the print queue
	 * @param tableModel - the TableModel passed to the View
	 * @return a PrintQueue object that was just created.
	 * @throws Exception
	 */
	//public PrintQueue createQueueWithTableModel(String queueName, String devicename, PrintJobTableModel tableModel, PrintedJobTableModel tableModel2) throws Exception {
	public PrintQueue createQueueWithTableModel(X_A_MachinePrinter printer, PrintJobTableModel tableModel, PrintedJobTableModel tableModel2) throws Exception {
		final String METHOD_NAME = "createQueue(): ";		
		//if(Util.isEmpty(queueName)) {
		if (Util.isEmpty(printer.getQueueName())) {
			throw new Exception(METHOD_NAME + "queueName passed in was empty.");
		//} else if(queues.containsKey(queueName)) {
		} else if(queues.containsKey(printer.getQueueName())) {
			//return (PrintQueue) queues.get(queueName);
			return (PrintQueue) queues.get(printer.getQueueName());
		} else {
			//PrintQueue queue = new PrintQueueWithTableModel(queueName, tableModel, tableModel2);
			PrintQueue queue = new PrintQueueWithTableModel(printer.getQueueName(), tableModel, tableModel2);
			//queues.put(queueName, queue);
			queues.put(printer.getQueueName(), queue);
			//queuenames.add(queueName);
			if (!m_printers.containsKey(printer.getQueueName()))
			{
				m_printers.put(printer.getQueueName(), printer.getA_MachinePrinter_ID());
			}						
//			if (!devices.containsKey(queueName))
//			{
//				devices.put(queueName, devicename);
//			}			
			return queue;
		}
	}

	/**
	 * Adds a printJob to the queue specified by queueName.
	 * @param queueName - the name of the print queue
	 * @param printJob - the printJob added to the print queue
	 * @throws Exception
	 */
	public void addPrintJob(String queueName, PrintJob printJob) throws Exception {
		final String METHOD_NAME = "addPrintJob(): ";
		if(Util.isEmpty(queueName)) {
			log.severe(METHOD_NAME + "queueName passed in was empty.");
			throw new Exception(METHOD_NAME + "queueName passed in was empty.");
		} else if(!queues.containsKey(queueName)) {
			log.severe(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
			throw new Exception(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
		} else if(null == printJob) {
			log.severe(METHOD_NAME + "PrintJob passed in was null.");
			throw new Exception(METHOD_NAME + "PrintJob passed in was null.");
		} else if(null == printJob.getDataFile()) {
			log.severe(METHOD_NAME + "DataFile in PrintJob passed in was null.");  
			throw new Exception(METHOD_NAME + "DataFile in PrintJob passed in was null.");
		} else if(null == printJob.getDataFile().getContents()) {
			log.severe(METHOD_NAME + "contents of DataFile in PrintJob passed in was null.");  
			throw new Exception(METHOD_NAME + "contents of DataFile in PrintJob passed in was null.");
		} else {
			PrintQueue queue = (PrintQueue) queues.get(queueName);
			log.fine(METHOD_NAME + "got queue: " + queueName);  
			Lock lock = queue.getLock();
			log.fine(METHOD_NAME + "got lock for queue: " + queueName);  
			synchronized(lock) {
				queue.add(printJob);
				lock.notifyAll();
				log.fine(METHOD_NAME + "sent notify all to Lock object for queue: " + queueName);  
			}
		}
	}

	/**
	 * Removes a printJob based on queueName and the jobNumber.
	 * @param queueName - the name of the print queue
	 * @param user - the user trying to delete the print job 
	 * @param jobNumber - the print job number assigned by the Queue
	 * @throws Exception
	 */
	public PrintJob removePrintJob(String queueName, String user, String jobNumber) throws Exception {
		final String METHOD_NAME = "removePrintJob(): ";
		PrintJob printjob = null;
		long jobId = 0;
		if(Util.isEmpty(queueName)) {
			log.severe(METHOD_NAME + "queueName passed in was empty.");
			throw new Exception(METHOD_NAME + "queueName passed in was empty.");
		} else if(!queues.containsKey(queueName)) {
			log.severe(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
			throw new Exception(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
		} else if(Util.isEmpty(user)) {
			log.severe(METHOD_NAME + "user passed in was empty.");
			throw new Exception(METHOD_NAME + "user passed in was empty.");
		} else if(Util.isEmpty(jobNumber)) {
			log.severe(METHOD_NAME + "PrintJob passed in was empty.");
			throw new Exception(METHOD_NAME + "PrintJob passed in was empty.");
		} else {
			try {
				jobId = Long.parseLong(jobNumber);
			} catch(NumberFormatException e) {
				log.warning(METHOD_NAME + "The jobNumber(" + jobNumber + ") passed in was not a number: ");
				log.severe(METHOD_NAME + e.getMessage());
				throw new Exception(METHOD_NAME + e.getMessage());
			}

			PrintQueue queue = (PrintQueue) queues.get(queueName);
			Lock lock = queue.getLock();

			try {
				// if user name is root or Administrator just delete
				//MRole role = MRole.getDefault(Env.getCtx(), false);
				//if (role.getAD_Role_ID() == MRole.SUPERUSER_USER_ID || role.getAD_Role_ID() == MRole.SYSTEM_USER_ID)
				//{
				//	synchronized(lock) {
				//		queue.remove(jobId);
				//	}
				//} else {  // if not then only delete if user and job number match
					List jobs = queue.list();
					Iterator iter = jobs.iterator();
					while(iter.hasNext()) {
						QueuedPrintJobInfo qpji = (QueuedPrintJobInfo) iter.next();
						if(qpji.getId() == jobId) { // match jobId
							String jobOwner = qpji.getOwner();
							if(null != jobOwner && jobOwner.trim().equals(user.trim())) { //match username
								synchronized(lock) {
									printjob = queue.remove(jobId);// if username and jobId match, then remove
								}
							}
							// break here?
						}
					}
				//}
			} catch(Exception e) {
				log.severe(METHOD_NAME + e.getMessage());
				throw new Exception(e);
			}
		}
		return printjob;
	}

	/**
	 * Removes a printJob based on queueName and the jobNumber.
	 * @param queueName - the name of the print queue
	 * @param user - the user trying to delete the print job 
	 * @param jobNumber - the print job number assigned by the Queue
	 * @throws Exception
	 */
	public void addError(String queueName, long jobNumber, String error) throws Exception {
		final String METHOD_NAME = "removePrintJob(): ";
		long jobId = 0;
		if(Util.isEmpty(queueName)) {
			log.severe(METHOD_NAME + "queueName passed in was empty.");
			throw new Exception(METHOD_NAME + "queueName passed in was empty.");
		} else if(!queues.containsKey(queueName)) {
			log.severe(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
			throw new Exception(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
		} else {

			PrintQueue queue = (PrintQueue) queues.get(queueName);
			Lock lock = queue.getLock();

			try {
				// if user name is root or Administrator just delete
				//MRole role = MRole.getDefault(Env.getCtx(), false);
				//if (role.getAD_Role_ID() == MRole.SUPERUSER_USER_ID || role.getAD_Role_ID() == MRole.SYSTEM_USER_ID)
				//{
				//	synchronized(lock) {
				//		queue.remove(jobId);
				//	}
				//} else {  // if not then only delete if user and job number match
					List jobs = queue.list();
					Iterator iter = jobs.iterator();
					while(iter.hasNext()) {
						QueuedPrintJobInfo qpji = (QueuedPrintJobInfo) iter.next();
						if(qpji.getId() == jobId) { // match jobId
							synchronized(lock) {
								queue.addError(jobId, error);
							}
							// break here?
						}
					}
				//}
			} catch(Exception e) {
				log.severe(METHOD_NAME + e.getMessage());
				throw new Exception(e);
			}
		}
	}

	/**
	 * Deletes all printJobs for this queue.
	 * @param queueName - the name of the print queue
	 * @throws Exception
	 */
	public void removeAllPrintJobs(String queueName) throws Exception {
		final String METHOD_NAME = "removeAllPrintJobs(): ";
		if(Util.isEmpty(queueName)) {
			log.severe(METHOD_NAME + "queueName passed in was empty.");
			throw new Exception(METHOD_NAME + "queueName passed in was empty.");
		} else if(!queues.containsKey(queueName)) {
			log.severe(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
			throw new Exception(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
		} else {
			PrintQueue queue = (PrintQueue) queues.get(queueName);
			Lock lock = queue.getLock();
			synchronized(lock) {
				queue.removeAll();
			}
		}
	}

	/**
	 * Returns a {@link List} of all print jobs in the Queue. 
	 * @param queueName the name of the queue we are wanting to list
	 * @return a List of all print jobs in the Queue
	 * @throws Exception thrown if we have problems getting the queue list
	 */
	public List listAllPrintJobs(String queueName) throws Exception {
		final String METHOD_NAME = "listAllPrintJobs(): ";
		List result = null;
		if(Util.isEmpty(queueName)) {
			log.severe(METHOD_NAME + "queueName passed in was empty.");
			throw new Exception(METHOD_NAME + "queueName passed in was empty.");
		} else if(!queues.containsKey(queueName)) {
			log.severe(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
			throw new Exception(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
		} else {
			PrintQueue queue = (PrintQueue) queues.get(queueName);
			Lock lock = queue.getLock();
			synchronized(lock) {
				result = queue.list();
			}
		}
		return result;
	}
	
	public int getQueueSize(String queueName) throws Exception {
		final String METHOD_NAME = "getQueueSize(): ";
		int result = -1;
		if(Util.isEmpty(queueName)) {
			log.severe(METHOD_NAME + "queueName passed in was empty.");
			throw new Exception(METHOD_NAME + "queueName passed in was empty.");
		} else if(!queues.containsKey(queueName)) {
			log.severe(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
			throw new Exception(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
		} else {
			PrintQueue queue = (PrintQueue) queues.get(queueName);
			Lock lock = queue.getLock();
			synchronized(lock) {
				result = queue.size();
			}
		}
		return result;
	}
	
	public Lock getQueueLock(String queueName)throws Exception {
		final String METHOD_NAME = "getQueueLock(): ";
		Lock result = null;
		if(Util.isEmpty(queueName)) {
			log.severe(METHOD_NAME + "queueName passed in was empty.");
			throw new Exception(METHOD_NAME + "queueName passed in was empty.");
		} else if(!queues.containsKey(queueName)) {
			log.severe(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
			throw new Exception(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
		} else {
			PrintQueue queue = (PrintQueue) queues.get(queueName);
			result = queue.getLock();
		}
		return result;
	}
	
	public QueuedPrintJob getNextPrintJob(String queueName) throws Exception {
		final String METHOD_NAME = "getNextPrintJob(): ";
		QueuedPrintJob result = null;
		if(Util.isEmpty(queueName)) {
			log.severe(METHOD_NAME + "queueName passed in was empty.");
			throw new Exception(METHOD_NAME + "queueName passed in was empty.");
		} else if(!queues.containsKey(queueName)) {
			log.severe(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
			throw new Exception(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
		} else {
			PrintQueue queue = (PrintQueue) queues.get(queueName);
			Lock lock = queue.getLock();
			
			try {
				synchronized(lock) {
					result = queue.getNextPrintJob();
				}
			} catch(Exception e) {
				log.severe(METHOD_NAME + e.getMessage());
				throw new Exception(e);
			}
		}
		return result;
	}

	public void addPrintedJob(String queueName, PrintJob printjob) throws Exception {
		final String METHOD_NAME = "getNextPrintJob(): ";
		QueuedPrintJob result = null;
		if(Util.isEmpty(queueName)) {
			log.severe(METHOD_NAME + "queueName passed in was empty.");
			throw new Exception(METHOD_NAME + "queueName passed in was empty.");
		} else if(!queues.containsKey(queueName)) {
			log.severe(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
			throw new Exception(METHOD_NAME + "the queue called(" + queueName + ") does not exist.");
		} else {			
			PrintQueue queue = (PrintQueue) queues.get(queueName);
			queue.addPrintedJob(printjob);			
		}		
	}

	public List<String> getQueueNames() {
		List<String> queuenames = new ArrayList<String>();
		Iterator it = queues.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String key = (String) entry.getKey();			
			queuenames.add(key);
		}
		return queuenames;		
	}

	public int getDeviceName(String queueName) {
		//return (String) devices.get(queueName);
		return (int) m_printers.get(queueName);
	}
}