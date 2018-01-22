package org.columba.core.context.api;

import java.util.EventListener;

public interface IContextResultListener extends EventListener {
	
	public void resultArrived(IContextResultEvent event);

	public void finished(IContextResultEvent event);
}
