package org.simoes.util;

import org.compiere.util.CLogger;

/**
 * This is the wrapper object for any Objects passed into our ThreadPool.
 * 
 * @author Chris Simoes
 */
public class ThreadPoolRequest {
    // all files need a static Category object for error logging
    static CLogger log = CLogger.getCLogger(ThreadPoolRequest.class);

	Runnable target;

	ThreadPoolRequest(Runnable t) {
		target = t;
	}
}

