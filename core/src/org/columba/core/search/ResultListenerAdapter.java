package org.columba.core.search;

import org.columba.core.search.api.IResultEvent;
import org.columba.core.search.api.IResultListener;


public abstract class ResultListenerAdapter implements IResultListener {

	public void clearSearch(IResultEvent event) {
	}

	public void finished(IResultEvent event) {
	}

	public void reset(IResultEvent event) {
	}

	public void resultArrived(IResultEvent event) {
	}

}
