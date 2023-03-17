package org.xendra.mfe.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.xendra.mfe.folder.FieldFolder;
import org.xendra.mfe.gui.frame.MFEFrameController;
import org.xendra.mfe.gui.tree.TreeView;
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.model.AbstractFolder;

public class DeleteFolderAction extends AbstractColumbaAction implements TreeSelectionListener {
	private AbstractFolder node;
	private TreeView treeview;
	public DeleteFolderAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "delete"));
		if (frameMediator instanceof MFEFrameController) {
			((MFEFrameController) frameMediator).addTreeSelectionListener(this);
		} 		
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		node.delete();
		AbstractFolder parent = (AbstractFolder) node.getParent();
		node.removeFromParent();
		((DefaultTreeModel) treeview.getModel()).reload(parent);
		node = parent;
		TreePath p = new TreePath(node);
		treeview.setSelectionPath(p);
		treeview.makeVisible(p);       	//	expand it
		treeview.scrollPathToVisible(p);
		
	}	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreePath p = e.getNewLeadSelectionPath();
		if (p == null)
			return;
		treeview = (TreeView) e.getSource();
		node = (AbstractFolder) e.getNewLeadSelectionPath().getLastPathComponent();
		if (node instanceof FieldFolder) {				
			setEnabled(true);
		}
		else
			setEnabled(false);								
	}			
}
