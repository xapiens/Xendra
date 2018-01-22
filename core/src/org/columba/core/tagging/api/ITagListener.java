package org.columba.core.tagging.api;

import java.util.EventListener;

public interface ITagListener extends EventListener {
	
	public void tagChanged(ITagEvent event);
	public void tagAdded(ITagEvent event);
	public void tagDeleted(ITagEvent event);
}
