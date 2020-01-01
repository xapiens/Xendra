package org.xendra.modeleditor.model;

import org.columba.core.xml.XmlElement;

public interface IGroupModel {
	public abstract XmlElement getRootElement();
	public abstract void setName(String name);
	public abstract String getName();
}
