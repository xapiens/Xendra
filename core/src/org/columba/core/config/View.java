package org.columba.core.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class View {
	@XmlAttribute
	String id = "";
	@XmlElement
	Window window;
	@XmlElement
	Toolbars toolbars = new Toolbars();
	@XmlElement
	Splitpanes splitpanes;
	@XmlAttribute
	Boolean header_enabled;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	public Window getWindow() {
		return window;
	}
	public void setWindow(Window window) {
		this.window = window;
	}
	public Toolbars getToolbars() {
		return toolbars;
	}
	public void setToolbars(Toolbars toolbars) {
		this.toolbars = toolbars;
	}
	public Splitpanes getSplitpanes() {
		return splitpanes;
	}
	public void setSplitpanes(Splitpanes splitpanes) {
		this.splitpanes = splitpanes;
	}
	public Boolean getHeader_enabled() {
		return header_enabled;
	}
	public void setHeader_enabled(Boolean header_enabled) {
		this.header_enabled = header_enabled;
	}			
}