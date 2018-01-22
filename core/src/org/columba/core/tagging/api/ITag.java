package org.columba.core.tagging.api;

import java.awt.Color;

public interface ITag {
	
	String getId();
	
	String getName();
	void setName(String name);
	Color getColor();
	void setColor(Color color);
	
	String getDescription();
	void setDescription(String description);
	
//	String getProperty(String name);
//	void setProperty(String name, String value);
//	
//	Hashtable getProperties();
	
}
