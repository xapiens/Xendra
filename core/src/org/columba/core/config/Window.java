package org.columba.core.config;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Window {
	@XmlAttribute
	Boolean maximized = true;
	@XmlAttribute
	Integer height = 507;
	@XmlAttribute
	Integer width = 902;
	@XmlAttribute
	Integer y = 123;
	@XmlAttribute
	Integer x = 219;
	public Boolean getMaximized() {
		return maximized;
	}
	public void setMaximized(Boolean maximized) {
		this.maximized = maximized;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}	
}
