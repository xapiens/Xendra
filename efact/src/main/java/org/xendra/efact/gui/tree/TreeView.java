package org.xendra.efact.gui.tree;

import javax.swing.JTree;
import javax.swing.ListSelectionModel;

import org.xendra.efact.folder.EFactTreeNode;
import org.xendra.efact.gui.frame.EFactFrameController;
import org.xendra.model.AbstractFolder;

public class TreeView extends JTree {
	private EFactTreeNode root;
	private EFactTreeModel model;
	protected EFactFrameController frameController;
	public TreeView(EFactFrameController frameController) {
		this.frameController = frameController;
		model = EFactTreeModel.getInstance();
		setModel(model);
		setShowsRootHandles(true);
		setRootVisible(false);
		expandRow(0);
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		setCellRenderer(new EFactTreeCellRenderer(true));		
	}
	public AbstractFolder getRootFolder() {
		return (AbstractFolder) model.getRoot();
	}
    public EFactFrameController getFrameController() {
        return frameController;
    }		
}
