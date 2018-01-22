package org.columba.core.filter;

import java.awt.Color;
import java.util.Properties;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class FilterAction implements IFilterAction {
	@XmlAttribute
	String type;
	@XmlAttribute
	int uid;
	@XmlAttribute
	String name;
	@XmlAttribute
	String Action;
	@XmlAttribute
	int rgb = Color.black.getRGB();
	@XmlElement
	Properties props = new Properties();
	public FilterAction(FilterAction filterAction) {
		type = filterAction.getType();
		uid = filterAction.getUid();
		name = filterAction.getName();
		Action = filterAction.getAction();
	}
	public FilterAction() {
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	public int getRgb() {
		return rgb;
	}
	public void setRgb(int rgb) {
		this.rgb = rgb;
	}
	public void set(String key, String value) {
		props.put(key, value);		
	}
	public String get(String key) {		
		return props.getProperty(key);
	}	
}
