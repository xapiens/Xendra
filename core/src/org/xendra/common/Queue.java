package org.xendra.common;

import java.util.*;
import java.util.logging.Level;

import org.compiere.util.CLogger;


/**
 * Queue is just a queue
 * 
 * @author Jason Crowe
 */
public class Queue {

	// logger
	private static CLogger log = CLogger.getCLogger(Queue.class);

	// private constants
	private final static String CLASS = Queue.class.getName();
	private final static String NEWLINE = System.getProperty("line.separator");

	// public constants
	public static final long INVALID_ID = -1;

	// queue counter
	//   used to give unique ids to each job
	protected static long counter = 0;

	// queue name
	protected String name;

	// vector to store the items
	protected List queue = new Vector();

	/** constructor.
	 * @param name - name of the print queue.
	 */
	public Queue(String name) {
		this.name = name;
	}

	/** getName.
	 * @return the queue name.
	 */
	public String getName() {
		return name;
	}

	/** add method.
	 * @param object - object to add to the queue.
	 * @return unique identifier of the queued object.
	 */
	public long add(Object object) {
		final String METHOD = "void add(Object object)";
		// log entry
		//log.log(Level.FINE, 
		//	"entry[" + METHOD + "]" + NEWLINE + "  object...[" + object + "]");

		// declare return value
		long rval = INVALID_ID;

		// generate an id and timestamp to associate with the job
		long id = counter++;
		Date timeStamp = new Date(System.currentTimeMillis());

		// store the id, timestamp, and job together
		QueuedObject queuedObject = new QueuedObject(id, timeStamp, object);

		// add to the internal queue
		boolean result = queue.add(queuedObject);

		// if successful, set rval to id (so the job can be managed)
		if (result ) {
			rval = id;
		}

		// log exit
//		log.log(Level.FINE,"exit[" + METHOD + "], rval[" + rval + "]");
		// return
		return rval;
	}

	/** remove by unique identifier.
	 * @param id - unique identifier of the queued object.
	 * @return object matching the identifier
	 * @throws ObjectNotFoundException if the object is not found in the queue
	 */
	public Object remove(long id) throws Exception {
		final String METHOD = "Object remove(long id)";
		// log entry
		//log.log(Level.FINE, "entry[" + METHOD + "]" + NEWLINE + "  id...[" + id + "]");

		// declare the return value
		Object rval = null;

		// lookup the printjob
		synchronized (queue) {
			// loop over the list
			boolean found = false;
			for (Iterator iter = queue.iterator(); iter.hasNext();) {
				QueuedObject queuedObject = (QueuedObject) iter.next();
				long queuedObjectId = queuedObject.getId();
				if (queuedObjectId == id) {
					// the id's match, so remove this object from the queue and 
					// return the object to the caller
					iter.remove();
					Object object = queuedObject.getObject();
					rval = object;
					found = true;
					break;
				}
			}
			// if the queued object was not found, then throw an ObjectNotFoundException
			if (found == false) {
				throw new Exception(
					"the object associated with id[" + id + "] was not found.");
			}
		}
		// return
		return rval;
	}

	/** size of the queue.
	 * @return size of the queue.
	 */
	public int size() {
		return queue.size();
	}

	/** list of the items in the queue (a copy of each one).
	 * @return a copy of the items in the list
	 */
	public synchronized List list() {
		List rval = null;
		List list = new ArrayList();
		for (Iterator iter = queue.iterator(); iter.hasNext();) {
			QueuedObject queuedObject = (QueuedObject) iter.next();
			list.add(queuedObject); // would prefer to clone here
		}
		rval = list;
		return rval;
	}

	/** 
	 * Gets the first Object in the Queue without removing it.
	 * @return QueuedObject the last QueuedObject in the queue
	 */
	public QueuedObject getNext() throws Exception {
		final String METHOD = "getNext(): ";

		// declare the return value
		QueuedObject rval = null;

		// get the next printjob
		synchronized (queue) {
			if(queue.size() > 0) {
				//rval = (QueuedObject)queue.get(queue.size()-1);
				rval = (QueuedObject)queue.get(0);
			} else {
				throw new Exception(METHOD + "The queue was empty.");
			}
		}
		// return
		return rval;
	}

	/** 
	 * Gets the first Object in the Queue without removing it.
	 * @return QueuedObject the last QueuedObject in the queue
	 */
	public QueuedObject getFirst() throws Exception {
		final String METHOD = "getFirst(): ";

		// declare the return value
		QueuedObject rval = null;

		// get the next printjob
		synchronized (queue) {
			if(queue.size() > 0) {
				rval = (QueuedObject)queue.get(queue.size()-1);
				//rval = (QueuedObject)queue.get(0);
			} else {
				throw new Exception(METHOD + "The queue was empty.");
			}
		}
		// return
		return rval;
	}
	
	// TODO: consider adding string representation (toString)

	// main (test method)
	public static void main(String args[]) {

		final String METHOD = "static void main(String args[])";

		// log start of test
		//log.log(Level.FINE, "starting " + CLASS + " : " + METHOD);

		// contents of test
		try {
			// 0. create queue
			Queue testQueue = new Queue("test queue");

			// 1. create some objects
			Integer i0 = new Integer(0);
			Integer i1 = new Integer(1);
			Integer i2 = new Integer(2);

			// 2. add to the queue
			long id0 = testQueue.add(i0);
			long id1 = testQueue.add(i1);
			long id2 = testQueue.add(i2);

			// 3. remove objects
			Object o0 = testQueue.remove(id0);
			Object o1 = testQueue.remove(id1);
			Object o2 = testQueue.remove(id2);

			// 4. compare objects
			if (o0.equals(i0) && o1.equals(i1) && o2.equals(i2)) {
				System.out.println("test case was successful");
			}

		} catch (Exception e) {
			log.log(Level.SEVERE,  e.getMessage(), e);
		}
		// log end of test
		//log.log(Level.FINE, "finished " + CLASS + " : " + METHOD);
	}
}
