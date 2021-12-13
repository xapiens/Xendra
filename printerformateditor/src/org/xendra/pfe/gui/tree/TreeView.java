package org.xendra.pfe.gui.tree;

import javax.swing.JTree;
import javax.swing.ListSelectionModel;

import org.xendra.pfe.folder.Root;
import org.xendra.pfe.gui.frame.PFEFrameController;

public class TreeView extends JTree {
	private Root root;
	private PFETreeModel model;
	protected PFEFrameController frameController;
	
	public TreeView(PFEFrameController frameController) {
		this.frameController = frameController;
		model = PFETreeModel.getInstance();
		setModel(model);
		setShowsRootHandles(true);
		setRootVisible(false);
		expandRow(0);
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		setCellRenderer(new PFETreeCellRenderer(true));		
	}

	public void addMouseListener(TreeController treeController) {
		// TODO Auto-generated method stub
		
	}

}
