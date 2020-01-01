package org.xendra.modeleditor.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.compiere.apps.ADialog;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.util.Env;
import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.folder.ColumnFolder;
import org.xendra.modeleditor.folder.TableFolder;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameController;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameMediator;
import org.xendra.modeleditor.gui.tree.TreeView;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.newtable.NewTableWizardLauncher;

public class DeleteColumnAction extends AbstractColumbaAction implements TreeSelectionListener {
	private AbstractFolder selectedFolder;

	public DeleteColumnAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_deletecolumn"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu__deletecolumn_tooltip").replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_deletecolumn_toolbar"));
		//localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "computer.png"))));
		//putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.columba.core", "delete.png"));		
		//putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.columba.core", "delete.png"));		
		if (frameMediator instanceof ModelEditorFrameMediator) {
			((ModelEditorFrameMediator) frameMediator).addTreeSelectionListener(this);
			setEnabled(true);
		} else
			setEnabled(false);		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String m_uid = selectedFolder.getElement().getAttributeValue("uid");
		if (m_uid.length() > 0) {
			X_AD_Column c = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Column_ID = ?", null)
				.setParameters(Integer.valueOf(m_uid)).first();
			if (c != null) {
				if (!c.delete(false)) {
					ADialog.error(0, null, "no se pudo borrar!");
				} else {
					TableFolder table = (TableFolder) selectedFolder.getParent();
					table.removeAllChildren();
					table.loadChildren();
					ModelEditorFrameController frameController = (ModelEditorFrameController) getFrameMediator();
					TreePath path = new TreePath(table.getPath());
					frameController.getTree().getView().setSelectionPath(path);				
					((DefaultTreeModel) frameController.getTree().getView().getModel()).nodeStructureChanged(table);
					frameController.getTree().getView().revalidate();
				}
			}
		}
	}	
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;			
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			selectedFolder = (AbstractFolder) treeview.getSelectionPath().getLastPathComponent();			
			if (selectedFolder instanceof  ColumnFolder) {
				setEnabled(true);			
			} else {
				setEnabled(false);
			}			
		}								
	}
}
