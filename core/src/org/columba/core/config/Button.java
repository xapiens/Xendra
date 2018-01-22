package org.columba.core.config;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Button {
	public Button() {
		
	}
	@XmlAttribute
	String action;
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}	
}
