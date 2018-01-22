package org.columba.core.config;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Printer {
	@XmlAttribute
	Boolean allow_scaling;
	public Boolean getAllow_scaling() {
		return allow_scaling;
	}
	public void setAllow_scaling(Boolean allow_scaling) {
		this.allow_scaling = allow_scaling;
	}	
}
