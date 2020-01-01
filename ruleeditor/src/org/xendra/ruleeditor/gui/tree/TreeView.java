package org.xendra.ruleeditor.gui.tree;

import javax.swing.JTree;
import javax.swing.ListSelectionModel;

import org.xendra.ruleeditor.folder.AbstractFolder;
import org.xendra.ruleeditor.folder.RuleEditorTreeNode;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameController;
import org.xendra.ruleeditor.gui.tree.util.RuleEditorTreeCellRenderer;

public class TreeView extends JTree {
	private RuleEditorTreeNode root;
	private RuleEditorTreeModel model;
	protected RuleEditorFrameController frameController;
	public TreeView(RuleEditorFrameController frameController) {
		this.frameController = frameController;
		model = RuleEditorTreeModel.getInstance();
		setModel(model);
		setShowsRootHandles(true);
		setRootVisible(false);
		expandRow(0);
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		setCellRenderer(new RuleEditorTreeCellRenderer(true));
	}
	public AbstractFolder getRootFolder() {
		return (AbstractFolder) model.getRoot();
	}
    public RuleEditorFrameController getFrameController() {
        return frameController;
    }	
}
