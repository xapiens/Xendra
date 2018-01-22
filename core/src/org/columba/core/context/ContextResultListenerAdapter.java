package org.columba.core.context;

import org.columba.core.context.api.IContextResultEvent;
import org.columba.core.context.api.IContextResultListener;

// TODO why this is a class and not an interface?
public abstract class ContextResultListenerAdapter implements IContextResultListener {

	
	public void finished(final IContextResultEvent event) {
	}

	public void resultArrived(final IContextResultEvent event) {
	}

}
