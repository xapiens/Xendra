package org.xendra.modeleditor.gui.tree;

import java.util.Enumeration;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import org.xendra.modeleditor.folder.Root;
import org.xendra.modeleditor.folder.ModelEditorTreeNode;
import org.xendra.modeleditor.gui.tree.ModelEditorTreeModel;

public class ModelEditorTreeModel extends DefaultTreeModel implements TreeModel {
	private static ModelEditorTreeModel instance = new ModelEditorTreeModel();
	
	public ModelEditorTreeModel() {
		super(new Root());
	}
		
	public static ModelEditorTreeModel getInstance() {
		return instance;
	}
	
	public ModelEditorTreeNode getFirstFolder() {
		int uid = 0;
		ModelEditorTreeNode root = (ModelEditorTreeNode) getRoot();
		for (Enumeration e = root.breadthFirstEnumeration(); e.hasMoreElements();) 
		{
			ModelEditorTreeNode node = (ModelEditorTreeNode) e.nextElement();
			if (node instanceof Root) {
				continue;
			}
		}
		return null;		
	}
	
	public ModelEditorTreeNode getFolder(String uid) {
		ModelEditorTreeNode root = (ModelEditorTreeNode) getRoot();
		for (Enumeration e = root.breadthFirstEnumeration(); e.hasMoreElements();) 
		{
			ModelEditorTreeNode node = (ModelEditorTreeNode) e.nextElement();
			if (node instanceof Root) {
				continue;
			}
			String id = node.getElement().getAttributeValue("uid");
			if (uid.equals(id)) {
				return node;
			}
		}
		return null;
	}	
}
