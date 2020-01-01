package org.xendra.modeleditor.gui.propertysheet;

import org.xendra.modeleditor.gui.tree.TreeView;

public class TablePick {
	int AD_Table_ID;
	String Name;
	TreeView tree;
	public int getAD_Table_ID() {
		return AD_Table_ID;
	}
	public void setAD_Table_ID(int AD_Table_ID) {
		this.AD_Table_ID = AD_Table_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public TreeView getTree() {
		return tree;
	}
	public void setTree(TreeView tree) {
		this.tree = tree;
	}
	public void pick() {
		this.tree.getFrameController().getTree().findNode(AD_Table_ID);
	}	
}
