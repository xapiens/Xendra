package org.xendra.mfe.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.mfe.folder.MessageFolder;
import org.xendra.mfe.gui.formateditor.NewEditor;
import org.xendra.mfe.gui.frame.MFEFrameController;
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.model.AbstractFolder;


public class CompileMessageAction  extends AbstractColumbaAction implements TreeSelectionListener {
	private NewEditor m_editor;
	public CompileMessageAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_compilemessage"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_compilemessage_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_compilemessage_toolbar"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.mfe", "system-run.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.mfe", "system-run.png"));
		if (frameMediator instanceof MFEFrameController) {
			((MFEFrameController) frameMediator).addTreeSelectionListener(this);
			//m_editor = ((MFEFrameController) frameMediator).GetEditor();
			setEnabled(false);
		}
		else
			setEnabled(false);								
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		m_editor.save();
	}	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreePath t = e.getNewLeadSelectionPath();
		if (t == null)
			return;
		AbstractFolder node = (AbstractFolder) t.getLastPathComponent();
		if (node != null) {
			if (node instanceof MessageFolder) 				
				setEnabled(true);			
			else
				setEnabled(false);						
		}		
	}	
}
