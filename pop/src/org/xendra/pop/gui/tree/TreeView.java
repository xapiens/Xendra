package org.xendra.pop.gui.tree;

import javax.swing.JTree;
import javax.swing.ListSelectionModel;

import org.xendra.pop.folder.AbstractFolder;
import org.xendra.pop.folder.PurchaseTreeNode;
import org.xendra.pop.gui.frame.PurchaseFrameController;
import org.xendra.pop.gui.tree.util.PurchaseTreeCellRenderer;

public class TreeView extends JTree {
	private PurchaseTreeNode root;
	private PurchaseTreeModel model;
	protected PurchaseFrameController frameController;
	public TreeView(PurchaseFrameController frameController) {
		this.frameController = frameController;
		model = PurchaseTreeModel.getInstance();
		setModel(model);
		setShowsRootHandles(true);
		setRootVisible(false);
		expandRow(0);
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		setCellRenderer(new PurchaseTreeCellRenderer(true));
	}
	public AbstractFolder getRootFolder() {
		return (AbstractFolder) model.getRoot();
	}
    public PurchaseFrameController getFrameController() {
        return frameController;
    }	
}