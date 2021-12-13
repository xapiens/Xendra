package org.xendra.pfe.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.folder.FormatFolder;
import org.xendra.pfe.gui.formateditor.NewEditor;
import org.xendra.pfe.gui.frame.PFEFrameController;
import org.xendra.pfe.util.ResourceLoader;

public class CompileFormatAction extends AbstractColumbaAction implements TreeSelectionListener {
	private NewEditor m_editor;
	private FormatFolder f;
	public CompileFormatAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_compileformat"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_compileformat_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_compileformat_toolbar"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.pfe", "system-run.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.pfe", "system-run.png"));		
		if (frameMediator instanceof PFEFrameController) {
			((PFEFrameController) frameMediator).addTreeSelectionListener(this);
			m_editor = ((PFEFrameController) frameMediator).GetEditor();
			setEnabled(false);
		}
		else
			setEnabled(false);				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (m_editor != null) {
			m_editor.getEditor().buildDocumentMVEL(f);
		}
	}
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (e.getNewLeadSelectionPath() == null) 
			return;
		AbstractFolder node = (AbstractFolder) e.getNewLeadSelectionPath().getLastPathComponent();
		if (node != null) {
			if (node instanceof FormatFolder) {
				f = (FormatFolder) node;
				setEnabled(true);
			}
			else
				setEnabled(false);						
		}
	}
}
