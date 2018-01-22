//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the 
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.
package org.columba.core.base;

/**
 * @author timo
 * 
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates. To enable and disable the creation of type
 * comments go to Window>Preferences>Java>Code Generation.
 */
public class Lock {
    private boolean locked;

    private Object locker;

    private Mutex mutex;

    public Lock() {
	locked = false;
	mutex = new Mutex();
    }

    public synchronized void getLock(Object theLocker) {
	mutex.lock();
	if (this.locker == theLocker) {
	    mutex.release();
	    return;
	}
	mutex.release();

	while (!tryToGetLock(theLocker)) {
	    try {
		wait();
	    } catch (InterruptedException e) {
		// nothing to do
	    }
	}
    }

    public boolean tryToGetLock(Object theLocker) {
	mutex.lock();
	// Is it already locked from locker ?
	if ((this.locker == theLocker) && (theLocker != null)) {
	    mutex.release();
	    return true;
	}

	// Check if locked
	if (locked) {
	    mutex.release();
	    return false;
	}
	locked = true;
	this.locker = theLocker;
	mutex.release();

	return true;
    }

    public synchronized void release(Object theLocker) {
	mutex.lock();
	if ((this.locker == theLocker) || (this.locker == null)) {
	    locked = false;
	}
	notify();

	mutex.release();
    }
}
