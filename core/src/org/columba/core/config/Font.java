package org.columba.core.config;

import java.util.Observable;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Font extends Observable {	
    @XmlElement(required = true)
    Main main;
	@XmlElement(required = true)
	Text text;
	@XmlAttribute
	Boolean overwrite = true;
	public Boolean getOverwrite() {
		return overwrite;
	}
	public void setOverwrite(Boolean overwrite) {
		this.overwrite = overwrite;
	}
	public void addMain(Main main) {
		this.main = main;  		
	}	
	public void addText(Text text) {
		this.text = text;
	}	
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public Text getText() {
		return text;
	}
	public void setText(Text text) {
		this.text = text;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("main= %s %s",main.getName(), main.getSize()));
		sb.append(String.format("text= %s %s",text.getName(), text.getSize()));
		sb.append(String.format("overwrite= %s ",overwrite));
		return sb.toString();
	}	
}
