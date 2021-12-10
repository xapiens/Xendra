package org.columba.core.gui.plugin;

import javax.swing.tree.DefaultMutableTreeNode;

public class PluginProcess extends DefaultMutableTreeNode {
	String name;
	String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}
