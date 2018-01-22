package org.columba.core.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PropertiesMap {
	@XmlElement(name = "attribute")
	public List<MapEntryType> entry = new ArrayList<MapEntryType>();

	public List<MapEntryType> getEntry() {
		return this.entry;
	}

	public void setEntry(List<MapEntryType> e) {
		this.entry = e;
	}	
	
}
