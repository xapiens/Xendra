package org.columba.core.config;

import java.util.Observable;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Splitpanes extends Observable {
	@XmlAttribute
	Integer main = 100;
	@XmlAttribute
	Integer header = 100;
	@XmlAttribute
	Integer attachment;
	public Integer getMain() {
		return main;
	}
	public void setMain(Integer main) {
		this.main = main;
	}
	public Integer getHeader() {
		return header;
	}
	public void setHeader(Integer header) {
		this.header = header;
	}
	public Integer getAttachment() {
		return attachment;
	}
	public void setAttachment(Integer attachment) {
		this.attachment = attachment;
	}
	public void notifyObservers() {
		setChanged();
		super.notifyObservers();
	}	
}
