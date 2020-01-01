package org.xendra.modeleditor.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.modeleditor.folder.ModelEditorTreeNode;
import org.xendra.modeleditor.folder.PluginFolder;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameMediator;
import org.xendra.modeleditor.gui.tree.TreeView;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.newtable.NewTableWizardLauncher;

public class AddTableAction  extends AbstractColumbaAction implements TreeSelectionListener {

	private String id;

	public AddTableAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_addtable"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_addtable_tooltip").replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_addtable_toolbar"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.modeleditor", "list-add.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.modeleditor", "list-add.png"));
		if (frameMediator instanceof ModelEditorFrameMediator) {
			((ModelEditorFrameMediator) frameMediator).addTreeSelectionListener(this);
			setEnabled(true);
		}
		else
			setEnabled(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		NewTableWizardLauncher nn = new NewTableWizardLauncher();
		nn.launchWizard();
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;			
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			ModelEditorTreeNode node = (ModelEditorTreeNode) treeview.getSelectionPath().getLastPathComponent();			
			if (node instanceof  PluginFolder) {
				setId(((PluginFolder) node).getName());
				setEnabled(true);			
			} else {
				setEnabled(false);
			}			
		}								
	}

	private void setId(String id) {
		this.id = id;		
	}
	private String getId() {
		return this.id;
	}
}
