package org.xendra.ruleeditor.gui.action;

import java.awt.event.ActionEvent;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.ruleeditor.folder.KieBaseFolder;
import org.xendra.ruleeditor.folder.RuleEditorTreeNode;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameMediator;
import org.xendra.ruleeditor.util.ResourceLoader;
import org.xendra.ruleeditor.wizard.newrule.NewRuleWizardLauncher;

@SuppressWarnings("serial")
public class AddRuleAction extends AbstractColumbaAction implements TreeSelectionListener {

	private RuleEditorTreeNode treeNode;
	private Integer m_id;
	
	public AddRuleAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_addrule"));
		// tooltip text
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu", "mainframe", "menu_file_addrule_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe", "menu_file_addrule_toolbar"));
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
	public void actionPerformed(ActionEvent evt) {
		NewRuleWizardLauncher nn = new NewRuleWizardLauncher();
		nn.setParentRuleid(m_id);
		nn.launchWizard();			
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		RuleEditorTreeNode node = (RuleEditorTreeNode) e.getNewLeadSelectionPath().getLastPathComponent();
		if (node != null)
		{			
			m_id = Integer.valueOf(node.getElement().getAttributeValue("uid"));
			if (node instanceof KieBaseFolder)
			{

				setEnabled(true);
			}
			else
				setEnabled(false);
		} else {
			setEnabled(false);
		}
	}	
}
