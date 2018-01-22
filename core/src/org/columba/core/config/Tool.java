package org.columba.core.config;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Tool {
	@XmlAttribute
	String name;
	@XmlAttribute(name="first_time")
	Boolean first_time = false;
	@XmlAttribute
	String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getFirst_time() {
		return first_time;
	}
	public void setFirst_time(Boolean first_time) {
		this.first_time = first_time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}		
}
