package org.xendra.modeleditor.gui.tree.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.compiere.apps.ADialog;
import org.xendra.modeleditor.folder.ModelEditorTreeNode;
import org.xendra.modeleditor.folder.PluginFolder;
import org.xendra.modeleditor.folder.TableFolder;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameController;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameMediator;
import org.xendra.modeleditor.gui.tree.TreeView;

public class TableDeleteAction extends AbstractColumbaAction implements TreeSelectionListener  {

	public TableDeleteAction(IFrameMediator frameMediator) {
		super(frameMediator, "FolderDeleteAction");
		setEnabled(false);
		((ModelEditorFrameMediator) frameMediator).addTreeSelectionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ModelEditorFrameController frameController = (ModelEditorFrameController) getFrameMediator();
		TableFolder folder = (TableFolder) frameController.getTree().getSelectedFolder();
		if (ADialog.ask(0, null, "Borrar?")) {
			TableFolder f = (TableFolder) folder;
//			if (f.delete()) {
//				((PluginFolder) folder.getGroupFolder()).refresh();
//				frameController.getTree().getView().validate();				
//			}
		} 
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;			
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			ModelEditorTreeNode node = (ModelEditorTreeNode) treeview.getSelectionPath().getLastPathComponent();			
			if (node instanceof  TableFolder) {
				setEnabled(true);			
			} else {
				setEnabled(false);
			}			
		}						
	}

}
