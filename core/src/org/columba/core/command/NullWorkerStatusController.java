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

package org.columba.core.command;

import org.columba.api.command.IWorkerStatusChangeListener;
import org.columba.api.command.IWorkerStatusController;

/**
 * @author timo
 * 
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates. To enable and disable the creation of type
 * comments go to Window>Preferences>Java>Code Generation.
 */
public class NullWorkerStatusController implements IWorkerStatusController {
    /*
         * (non-Javadoc)
         * 
         * @see org.columba.api.command.IWorkerStatusController#removeWorkerStatusChangeListener(org.columba.core.gui.statusbar.event.WorkerStatusChangeListener)
         */
    public void removeWorkerStatusChangeListener(
	    IWorkerStatusChangeListener listener) {
	// TODO Auto-generated method stub

    }

    private static NullWorkerStatusController myInstance;

    protected NullWorkerStatusController() {
	// nothing to do
    }

    public static NullWorkerStatusController getInstance() {
	if (myInstance == null) {
	    myInstance = new NullWorkerStatusController();
	}

	return myInstance;
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#setDisplayText(java.lang.String)
         */
    public void setDisplayText(String text) {
	// nothing to do
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#clearDisplayText()
         */
    public void clearDisplayText() {
	// nothing to do
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#clearDisplayTextWithDelay()
         */
    public void clearDisplayTextWithDelay() {
	// nothing to do
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#getDisplayText()
         */
    public String getDisplayText() {
	return null;
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#setProgressBarMaximum(int)
         */
    public void setProgressBarMaximum(int max) {
	// nothing to do
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#setProgressBarValue(int)
         */
    public void setProgressBarValue(int value) {
	// nothing to do
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#resetProgressBar()
         */
    public void resetProgressBar() {
	// nothing to do
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#incProgressBarValue()
         */
    public void incProgressBarValue() {
	// nothing to do
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#incProgressBarValue(int)
         */
    public void incProgressBarValue(int increment) {
	// nothing to do
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#getProgessBarMaximum()
         */
    public int getProgessBarMaximum() {
	return 0;
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#getProgressBarValue()
         */
    public int getProgressBarValue() {
	return 0;
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#cancel()
         */
    public void cancel() {
	// nothing to do
    }

    /**
         * @see org.columba.api.command.IWorkerStatusController#cancelled()
         */
    public boolean cancelled() {
	return false;
    }

    /*
         * (non-Javadoc)
         * 
         * @see org.columba.api.command.IWorkerStatusController#addWorkerStatusChangeListener(org.columba.core.gui.statusbar.event.WorkerStatusChangeListener)
         */
    public void addWorkerStatusChangeListener(IWorkerStatusChangeListener l) {
	// nothing to do
    }

    /*
         * (non-Javadoc)
         * 
         * @see org.columba.api.command.IWorkerStatusController#getTimeStamp()
         */
    public int getTimeStamp() {
	return 0;
    }
}
