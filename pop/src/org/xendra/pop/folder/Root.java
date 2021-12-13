package org.xendra.pop.folder;

import java.util.Enumeration;

import javax.swing.tree.TreeNode;

import org.columba.api.command.IWorkerStatusController;
import org.columba.core.xml.XmlElement;
import org.xendra.pop.config.FolderItem;

public class Root extends PurchaseTreeNode {

	public Root(XmlElement node) {
		super(new FolderItem(node));
	}
	public Class getDefaultChild() {
		return null;
	}
	@Override
	public void createChildren(IWorkerStatusController c) {
	}
	public String getName() {
		return "Root";
	}
}
