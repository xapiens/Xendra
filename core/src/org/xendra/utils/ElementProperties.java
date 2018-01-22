package org.xendra.utils;

import java.util.HashMap;

public class ElementProperties {
	HashMap properties = new HashMap();
	private boolean Processed = false;
	public void addval(String propertyName, Object propertyValue) {
		if (propertyValue == null)
			propertyValue = "null";
		properties.put(propertyName, propertyValue);
	}
	public void setval(String name, Object value) {
		addval(name, value);
	}
	public Object getval(String propertyname) {
		return properties.get(propertyname);
	}

	public void setProcessed(boolean value) {
		Processed  = value;	
	}

	public boolean isProcessed()
	{
		return Processed;
	}
}
