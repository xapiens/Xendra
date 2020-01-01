package org.xendra.modeleditor.gui.tree;

import javax.swing.JTree;
import javax.swing.ListSelectionModel;

import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.folder.ModelEditorTreeNode;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameController;
import org.xendra.modeleditor.gui.tree.ModelEditorTreeModel;

public class TreeView extends JTree {
	private ModelEditorTreeNode root;
	private ModelEditorTreeModel model;
	protected ModelEditorFrameController frameController;
	public TreeView(ModelEditorFrameController frameController) {
		this.frameController = frameController;
		model = ModelEditorTreeModel.getInstance();
		setModel(model);
		setShowsRootHandles(true);
		setRootVisible(false);
		expandRow(0);
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		setCellRenderer(new ModelEditorTreeCellRenderer(true));
	}
	public AbstractFolder getRootFolder() {
		return (AbstractFolder) model.getRoot();
	}
    public ModelEditorFrameController getFrameController() {
        return frameController;
    }	
}
