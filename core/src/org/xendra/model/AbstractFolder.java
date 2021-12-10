package org.xendra.model;

import java.util.Enumeration;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

import org.columba.api.plugin.IExtensionInterface;
import org.jdom.Document;
import org.jdom.Element;

public class AbstractFolder extends DefaultMutableTreeNode implements IExtensionInterface {
	protected Element node;
	protected static ImageIcon collapsedIcon;
	public AbstractFolder(String type) {
		super(type);
		Element e = new Element(type);
		e.setAttribute("name", type);	
		setNode(e);
	}
	public AbstractFolder(Element item) {
		super(item);
		setNode(item);
	}
	public void setNode(Element node) {
		this.node = node;
	}
	public Element getNode() {
		return node;
	}
	public String getName() {		
		String name = getNode().getAttributeValue("name");
		return name;
	}
	public void setName(String newName) {
		getNode().setAttribute("name", newName);		
	}
	public String getid() {
		String uid = getNode().getAttributeValue("uid");
		return uid;
	}
	public ImageIcon getIcon() {
		return collapsedIcon;
	}	
	public Document export(Document doc, Element e) {
		return null;
	}
	public void delete() {}
	public AbstractFolder findNode(Element node) {
		Enumeration en = preorderEnumeration();
		while (en.hasMoreElements()) {
			AbstractFolder nd = (AbstractFolder) en.nextElement();
			Element fe = nd.getNode();			
			if (fe != null && fe.equals(node)) {
				return nd;
			}
		}
		return null;
	}
	public HashMap<String, Double> getDimension() {
		return null;
	}
	public void loadChildren() {}
}
