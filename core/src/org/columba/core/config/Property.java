package org.columba.core.config;

import java.util.Properties;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.compiere.util.ValueNamePair;

@XmlAccessorType(XmlAccessType.FIELD)
public class Property {
	@XmlAttribute
	String name;
	@XmlAttribute
	String accessrights;
	@XmlAttribute
	boolean subfolder;
	@XmlAttribute
	boolean include_subfolder;
	@XmlAttribute
	Integer source_uid;
	@XmlAttribute
	Integer unseen;
	@XmlAttribute
	Boolean selectable = true;
	@XmlAttribute
	Integer exists = 0;
	@XmlAttribute
	Integer recent = 0;
	@XmlJavaTypeAdapter(PropertiesAdapter.class)
	@XmlElement(name = "attributes")
	public Properties props = new Properties();
//	private Group root;
	public String getName() {
		return name;
	}
	public void setName(String v) {
		name = v;		
	}
	public String getAccessrights() {
		return accessrights;
	}
	public void setAccessrights(String accessrights) {
		this.accessrights = accessrights;
	}
	public boolean isSubfolder() {
		return subfolder;
	}
	public void setSubfolder(boolean subfolder) {
		this.subfolder = subfolder;
	}
	public boolean isInclude_subfolder() {
		return include_subfolder;
	}
	public void setInclude_subfolder(boolean include_subfolder) {
		this.include_subfolder = include_subfolder;
	}
	public Integer getSource_uid() {
		return source_uid;
	}
	public void setSource_uid(Integer source_uid) {
		this.source_uid = source_uid;
	}
	public Boolean getSelectable() {
		return selectable;
	}
	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}
	public void addAttribute(String key, String value) {		
		props.put(key, value);
	}
	public void addAttribute(String key, int value) {
		props.put(key, value);		
	}
	public void addAttribute(String key, Property child) {
		props.put(key, child);
	}
	public void addAttribute(String key, boolean value) {
		props.put(key, value);
	}	
	public void addAttribute(String key, Object value) {	
		props.put(key, value);
	}	
	public Object getAttribute(String key) {
		return props.get(key);
	}
	public Object getAttribute(String key, Object value) {
		Object val = props.get(key);
		if (val == null) {			
			props.put(key, value);
			val = value;
		}
		return val;
	}						
	public Properties getAttributes() {
		return props;
	}
	public void removeAllElements() {
		props.clear();		
	}
	public void addValueNamePair(ValueNamePair element) {
		props.put(element.getValue(), element.getName());		
	}
	public void removeAttribute(String key) {
		props.remove(key);		
	}
	public Integer getUnseen() {
		return unseen;
	}
	public void setUnseen(Integer unseen) {
		this.unseen = unseen;
	}
	public Integer getExists() {
		return exists;
	}
	public void setExists(Integer exists) {
		this.exists = exists;
	}
	public Integer getRecent() {
		return recent;
	}
	public void setRecent(Integer recent) {
		this.recent = recent;
	}	
}
