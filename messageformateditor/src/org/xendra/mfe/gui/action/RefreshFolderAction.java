package org.xendra.mfe.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.xendra.mfe.gui.frame.MFEFrameController;
import org.xendra.mfe.gui.tree.TreeView;
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.model.AbstractFolder;

public class RefreshFolderAction extends AbstractColumbaAction implements TreeSelectionListener {
	private AbstractFolder node;
	private TreeView treeview;
	public RefreshFolderAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "refresh"));
		if (frameMediator instanceof MFEFrameController) {
			((MFEFrameController) frameMediator).addTreeSelectionListener(this);
		} 		
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		node.loadChildren();		
		((DefaultTreeModel) treeview.getModel()).reload(node);
	}	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		treeview = (TreeView) e.getSource();
		TreePath p = e.getNewLeadSelectionPath();
		if (p == null)
			return;
		node = (AbstractFolder) p.getLastPathComponent();
	}			
}
