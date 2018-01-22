package org.columba.core.config;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Toolbar {
	@XmlAttribute(name="enable_icon")
	boolean enable_icon = true;
	@XmlAttribute(name="enable_text")
	boolean enable_text = true;
	@XmlAttribute(name="text_position")
	boolean text_position = true;		
	public boolean isEnable_icon() {
		return enable_icon;
	}
	public void setEnable_icon(boolean enable_icon) {
		this.enable_icon = enable_icon;
	}
	public boolean isEnable_text() {
		return enable_text;
	}
	public void setEnable_text(boolean enable_text) {
		this.enable_text = enable_text;
	}
	public boolean isText_position() {
		return text_position;
	}
	public void setText_position(boolean text_position) {
		this.text_position = text_position;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("enable_icon= %s ",enable_icon));
		sb.append(String.format("enable_text= %s ",enable_text));
		sb.append(String.format("text_position= %s ",text_position));
		return sb.toString();
	}
}
