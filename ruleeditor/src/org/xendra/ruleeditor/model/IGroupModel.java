package org.xendra.ruleeditor.model;

import org.columba.core.xml.XmlElement;
import org.compiere.model.persistence.X_AD_Rule;

public interface IGroupModel {
	public abstract XmlElement getRootElement();
	public abstract void setName(String name);
	public abstract String getName();
	public abstract String getUid();
	public abstract String getDescription();
	public abstract X_AD_Rule[] getMembers();
	public abstract void setDescription(String text);
	public abstract void removeAllMembers();
	public abstract void addMember(String id);
}
