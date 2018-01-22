package org.xendra.common;

import java.util.*;
import java.util.logging.Level;

import org.compiere.util.CLogger;

/**
 * Encapsulates any Object that is stored in a {@link Queue}
 * 
 * @author Jason Crowe
 */
public class QueuedObject {

	// logger
	private static CLogger log = CLogger.getCLogger(QueuedObject.class);

	// private constants
	private final static String CLASS = QueuedObject.class.getName();
	private final static String NEWLINE = System.getProperty("line.separator");

	// attributes
	protected final long id;
	protected final Date timeStamp;
	protected final Object object;

	/** constructor.
	 * @param id - unique identifier for this queued object.
	 * @param timeStamp - timestamp of when the queued object was queued.
	 * @param object - object that is queued. (underlying object must be cloneable)
	 */
	public QueuedObject(long id, Date timeStamp, Object object) {
		final String METHOD =
			"QueuedObject(long id, Date timeStamp, Object object)";
		// log entry
//		log.log(Level.FINE, 
//			"entry["
//				+ METHOD
//				+ "]"
//				+ NEWLINE
//				+ "  id..........["
//				+ id
//				+ "]"
//				+ NEWLINE
//				+ "  timeStamp...["
//				+ timeStamp
//				+ "]"
//				+ NEWLINE
//				+ "  object......["
//				+ object
//				+ "]");

		// assign values
		this.id = id;
		this.timeStamp = timeStamp;
		this.object = object;

		// log exit
		//log.log(Level.FINE, "exit[" + METHOD + "]");
	}

	// getters
	public long getId() {
		return id;
	}
	public Date getTimeStamp() {
		return (Date) timeStamp.clone();
	}
	public Object getObject() {
		return object; // would prefer to clone here
	}

	// setters
	// [none, only assignments done via constructor]

	// equals
	public boolean equals(Object o) {
		final String METHOD = "boolean equals(Object o)";
		// log entry
		//log.log(Level.FINE, "entry[" + METHOD + "]" + NEWLINE + "  o...[" + o + "]");

		// declare return value
		boolean rval = false;

		// compare
		if (o instanceof QueuedObject) {
			rval = (((QueuedObject) o).getId() == id);
		}

		// log exit
		//log.log(Level.FINE, "exit[" + METHOD + "]" + NEWLINE + "  rval...[" + rval + "]");

		// return
		return rval;
	}

	// toString
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(
			"["
				+ CLASS
				+ "]"
				+ NEWLINE
				+ "  id..........["
				+ id
				+ "]"
				+ NEWLINE
				+ "  timeStamp...["
				+ timeStamp
				+ "]"
				+ NEWLINE
				+ "  object......["
				+ object
				+ "]");
		return sb.toString();
	}

	// main
	public static void main(String args[]) {

		final String METHOD = "static void main(String args[])";


		// log start of test
		//log.log(Level.FINE, "starting " + CLASS + " : " + METHOD);

		// contents of test

		// log end of test
		//log.log(Level.FINE, "finished " + CLASS + " : " + METHOD);
	}
}
