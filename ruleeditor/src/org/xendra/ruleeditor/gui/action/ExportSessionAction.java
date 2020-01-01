package org.xendra.ruleeditor.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.ruleeditor.folder.PluginFolder;
import org.xendra.ruleeditor.folder.RuleEditorTreeNode;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameMediator;
import org.xendra.ruleeditor.util.ResourceLoader;
import org.xendra.ruleeditor.wizard.exportsession.ExportSessionWizardLauncher;


public class ExportSessionAction  extends AbstractColumbaAction implements TreeSelectionListener {
	
	//private Integer m_id;
	private RuleEditorTreeNode node;
	
	public ExportSessionAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_exportsession"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_exportsession_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_exportsession_toolbar"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.ruleeditor", "export.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.ruleeditor", "export.png"));
		if (frameMediator instanceof RuleEditorFrameMediator) {
			((RuleEditorFrameMediator) frameMediator).addTreeSelectionListener(this);
			setEnabled(false);
		}
		else
			setEnabled(false);		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ExportSessionWizardLauncher nn = new ExportSessionWizardLauncher();
		String id = node.getElement().getAttributeValue("uid");
		//nn.launchWizard(Integer.valueOf(id));		
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		node = (RuleEditorTreeNode) e.getNewLeadSelectionPath().getLastPathComponent();
		if (node != null)
		{			
			if (node instanceof PluginFolder) {
				setEnabled(true);
			}
			else
				setEnabled(false);			
		} else {
			setEnabled(false);
		}		
	}
}
