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
import org.xendra.ruleeditor.wizard.newrgroup.NewGroupWizardLauncher;
import org.xendra.ruleeditor.wizard.newsession.NewSessionWizardLauncher;

public class AddGroupAction extends AbstractColumbaAction implements TreeSelectionListener {
	
	private Integer AD_Plugin_ID;
	
	public AddGroupAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_addgroup"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_addgroup_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_addgroup_toolbar"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.ruleeditor", "list-add.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.ruleeditor", "list-add.png"));
		if (frameMediator instanceof RuleEditorFrameMediator) {
			((RuleEditorFrameMediator) frameMediator).addTreeSelectionListener(this);
			setEnabled(false);
		}
		else
			setEnabled(false);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		NewGroupWizardLauncher nn = new NewGroupWizardLauncher();
		nn.launchWizard(AD_Plugin_ID);

	}
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		RuleEditorTreeNode node = (RuleEditorTreeNode) e.getNewLeadSelectionPath().getLastPathComponent();
		if (node != null)
		{			
			if (node instanceof PluginFolder) {
				AD_Plugin_ID = Integer.valueOf(node.getElement().getAttributeValue("uid"));
				setEnabled(true);
			}
			else
				setEnabled(false);			
		} else {
			setEnabled(false);
		}				
	}	
}
