package org.xendra.ruleeditor.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.xendra.ruleeditor.folder.AbstractFolder;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameMediator;
import org.xendra.ruleeditor.gui.tree.TreeView;
import org.xendra.ruleeditor.util.ResourceLoader;

public class RefreshFolderAction extends AbstractColumbaAction implements TreeSelectionListener {
	private AbstractFolder node;
	private TreeView treeview;
	public RefreshFolderAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "refresh"));
		if (frameMediator instanceof RuleEditorFrameMediator) {
			((RuleEditorFrameMediator) frameMediator).addTreeSelectionListener(this);
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
		node = (AbstractFolder) e.getNewLeadSelectionPath().getLastPathComponent();
	}		
}
