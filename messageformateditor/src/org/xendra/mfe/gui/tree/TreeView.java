package org.xendra.mfe.gui.tree;

import javax.swing.JTree;
import javax.swing.ListSelectionModel;

import org.xendra.controls.PickTableCellRenderer;
import org.xendra.mfe.gui.frame.MFEFrameController;
import org.xendra.model.AbstractFolder;

public class TreeView extends JTree {
	private AbstractFolder root;
	private MFETreeModel model;
	protected MFEFrameController frameController;
	
	public TreeView(MFEFrameController frameController) {
		this.frameController = frameController;
		model = MFETreeModel.getInstance();
		setModel(model);
		setShowsRootHandles(true);
		setRootVisible(false);
		expandRow(0);
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		setCellRenderer(new PickTableCellRenderer(true));		
	}

	public void addMouseListener(TreeController treeController) {
		// TODO Auto-generated method stub
		
	}

	public MFEFrameController getFrameController() {
		return frameController;
	}

	public AbstractFolder getRootFolder() {
		return (AbstractFolder) model.getRoot();
	}
}
