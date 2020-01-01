package org.xendra.ruleeditor.gui.tree.util;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

import org.xendra.ruleeditor.folder.RuleEditorTreeNode;

@SuppressWarnings("serial")
public class RuleEditorTreeCellRenderer extends DefaultTreeCellRenderer {

	public RuleEditorTreeCellRenderer(boolean bool) {
		super();
	}
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, 
			boolean isSelected, boolean expanded, boolean leaf, int row, 
			boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, isSelected, expanded, 
				leaf, row, hasFocus);
		RuleEditorTreeNode folder = (RuleEditorTreeNode) value;
		if (folder == null) {
			return this;
		}
		setText(folder.getName());
		setIcon(folder.getIcon());		
		return this;
	}

}
