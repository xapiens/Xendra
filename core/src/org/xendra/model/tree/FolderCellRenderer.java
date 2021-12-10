package org.xendra.model.tree;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import org.xendra.model.AbstractFolder;


public class FolderCellRenderer extends DefaultTreeCellRenderer {
	public FolderCellRenderer(boolean bool) {
		super();
	}	
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, 
			boolean isSelected, boolean expanded, boolean leaf, int row, 
			boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, isSelected, expanded, 
				leaf, row, hasFocus);
		AbstractFolder folder = (AbstractFolder) value;
		if (folder == null) {
			return this;
		}
		setText(folder.getName());
		setIcon(folder.getIcon());		
		return this;
	}
}
