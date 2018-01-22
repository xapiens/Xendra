package org.columba.core.config;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class MapEntryType {
	@XmlAttribute
	public String name;	
	//@XmlValue
	@XmlAttribute
	public String value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String val) {
		this.value = val;
	}	
}
