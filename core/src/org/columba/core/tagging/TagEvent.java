package org.columba.core.tagging;

import org.columba.core.tagging.api.ITagEvent;

public class TagEvent implements ITagEvent {

	private Object source;
	private String id;
	
	public TagEvent(Object source, String id) {
		this.source = source;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public Object getSource() {
		return source;
	}
}
