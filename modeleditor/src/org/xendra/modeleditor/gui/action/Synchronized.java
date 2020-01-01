package org.xendra.modeleditor.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.folder.TableFolder;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameController;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameMediator;
import org.xendra.modeleditor.gui.tree.TreeController;
import org.xendra.modeleditor.util.ResourceLoader;
import org.columba.api.gui.frame.IFrameMediator;
import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.ProcessModalDialog;
import org.compiere.model.MProcess;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.frapuccino.checkabletree.CheckableItem;
import org.frapuccino.treetable.AbstractTreeTableModel;

public class Synchronized extends AbstractColumbaAction implements TreeSelectionListener {
	private AbstractFolder selectedFolder;
	public Synchronized(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_synchronize"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_synchronize_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_synchronize_toolbar"));
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
	public void actionPerformed(ActionEvent e) {
		String m_uid = selectedFolder.getElement().getAttributeValue("uid");
		if (m_uid.length() > 0) {
			MProcess pr = new Query(Env.getCtx(), MProcess.Table_Name, "classname = ?", null)
			.setParameters("org.compiere.process.TableCreateColumns").first();
			if (pr != null) {
				ModelEditorFrameController frameController = (ModelEditorFrameController) getFrameMediator();
				int m_curWindowNo = 0;
				ProcessModalDialog dialog = new ProcessModalDialog(Env.getCtx(), Env.getWindow(0), Env.getHeader(Env.getCtx(), m_curWindowNo),
						null, m_curWindowNo, pr.getAD_Process_ID(), 0, Integer.valueOf(m_uid), false);
				if (dialog.isValidDialog())
				{
					dialog.validate();
					dialog.pack();
					AEnv.showCenterWindow(Env.getWindow(m_curWindowNo), dialog);
				}
				else if (dialog.getSummary() != null && dialog.getSummary().length() > 0)
				{				
					ADialog.error(m_curWindowNo, null, "(No Valid)", dialog.getSummary());
				}
				TableFolder tf = (TableFolder) selectedFolder;				
				tf.removeAllChildren();	
				tf.loadChildren();
				TreePath path = new TreePath(tf.getPath());
				frameController.getTree().getView().setSelectionPath(path);				
				((DefaultTreeModel) frameController.getTree().getView().getModel()).nodeStructureChanged(tf);
				frameController.getTree().getView().revalidate();				
			}
		}
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreePath p = e.getPath();
		if (p == null)
			return;
		selectedFolder = (AbstractFolder) p.getLastPathComponent();
		if (selectedFolder instanceof  TableFolder) {			
			setEnabled(true);			
		} else {
			setEnabled(false);
		}			
	}	
}
