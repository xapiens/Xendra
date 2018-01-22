package org.columba.core.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class Folder   extends jaxbobject  {
	@XmlAttribute
	String name;
	@XmlAttribute
	String type;
	@XmlAttribute
	String uid;
	@XmlElement	
	Property property = new Property();
	String classname;
	private Folder m_parent;
	@XmlElement(name = "folder")
	List<Folder> folders = new ArrayList<Folder>();
	public void setclass(String className) {
		classname = className;		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property props) {
		this.property = props;
	}
	public String getName() {
		return getProperty().getName();
	}
	public void setName(String name) {
		getProperty().setName(name);		
	}
	public void addFolder(Folder folder) {
		folders.add(folder);
		//folder.addParent(this);
	}
	private void addParent(Folder folder) {
		m_parent = folder;		
	}
	public void removeFromParent() {
		if (m_parent != null)
		{
			m_parent.remove(this);
		}		
	}
	private void remove(Folder folder) {		
		for (Folder fold:folders)
		{
			if (fold.equals(folder))
				folders.remove(fold);
		}
	}
	public Folder getRoot() {
		return null;
	}		
	public int count() {
		return folders.size();
	}

	public Folder getFolder(int i) {
		Folder folder = folders.get(i);		
		return folder;
	}	
}
