package org.xendra.modeleditor.gui.tree;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

import org.xendra.modeleditor.folder.ModelEditorTreeNode;

@SuppressWarnings("serial")
public class ModelEditorTreeCellRenderer extends DefaultTreeCellRenderer {

	public ModelEditorTreeCellRenderer(boolean bool) {
		super();
	}
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, 
			boolean isSelected, boolean expanded, boolean leaf, int row, 
			boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, isSelected, expanded, 
				leaf, row, hasFocus);
		ModelEditorTreeNode folder = (ModelEditorTreeNode) value;
		if (folder == null) {
			return this;
		}
		setText(folder.getName());
		setIcon(folder.getIcon());		
		return this;
	}

}
