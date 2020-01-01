package org.xendra.modeleditor.model;

import org.columba.core.xml.XmlElement;
import org.xendra.modeleditor.model.IGroupModel;

public class GroupModel implements IGroupModel {
	private XmlElement root;
	private XmlElement property;
	private String folderUid;
	public GroupModel(XmlElement group, XmlElement property, String folderUid) {
		this.root = group;
		this.property = property;
	}
	public GroupModel() {
		root = new XmlElement("group");
		property = new XmlElement("property");
		XmlElement members = new XmlElement("members");
		
		property.addElement(root);
		root.addElement(members);
	}
	@Override
	public XmlElement getRootElement() {
		return root;
	}
	public void setName(String name) {
		property.addAttribute("name", name);
	}
	public String getName() {
		return property.getAttribute("name");
	}
	
}
