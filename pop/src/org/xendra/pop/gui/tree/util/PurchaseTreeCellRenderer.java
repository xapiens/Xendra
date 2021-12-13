package org.xendra.pop.gui.tree.util;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

import org.xendra.pop.folder.PurchaseTreeNode;


@SuppressWarnings("serial")
public class PurchaseTreeCellRenderer extends DefaultTreeCellRenderer {

	public PurchaseTreeCellRenderer(boolean bool) {
		super();
	}
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, 
			boolean isSelected, boolean expanded, boolean leaf, int row, 
			boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, isSelected, expanded, 
				leaf, row, hasFocus);
		PurchaseTreeNode folder = (PurchaseTreeNode) value;
		if (folder == null) {
			return this;
		}
		setText(folder.getName());
		setIcon(folder.getIcon());		
		return this;
	}

}
