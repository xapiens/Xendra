package org.xendra.modeleditor.gui.action;

import java.awt.event.ActionEvent;
import java.util.Hashtable;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.folder.ModelEditorTreeNode;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameMediator;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.newcolumn.NewColumnWizardLauncher;
import org.xendra.modeleditor.wizard.newtable.NewTableWizardLauncher;

public class AddColumnAction   extends AbstractColumbaAction implements TreeSelectionListener {

	private String m_uid = "";

	public AddColumnAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_addcolumn"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_addcolumn_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_addcolumn_toolbar"));
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
		if (m_uid.length() > 0) {
			NewColumnWizardLauncher nn = new NewColumnWizardLauncher();
			nn.launchWizard(m_uid);
		}
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreePath p = e.getPath();
		if (p == null)
			return;
		AbstractFolder selectedFolder = (AbstractFolder) p.getLastPathComponent();
		if (selectedFolder != null) {
			m_uid = selectedFolder.getElement().getAttributeValue("uid");			
		}				
	}
}
