package org.xendra.ruleeditor.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.ruleeditor.folder.RuleEditorTreeNode;
import org.xendra.ruleeditor.folder.RuleFolder;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameMediator;
import org.xendra.ruleeditor.util.ResourceLoader;

public class DeleteRuleAction extends AbstractColumbaAction implements TreeSelectionListener {

	private Integer m_id;

	public DeleteRuleAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_deleterule"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_deleterule_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_deleterule_toolbar"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.ruleeditor", "edit-delete.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.ruleeditor", "edit-delete.png"));
		if (frameMediator instanceof RuleEditorFrameMediator) {
			((RuleEditorFrameMediator) frameMediator).addTreeSelectionListener(this);
			setEnabled(false);
		}
		else
			setEnabled(false);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int AD_User_ID = Env.getAD_User_ID(Env.getCtx());
		X_AD_User user = new Query(Env.getCtx(), X_AD_User.Table_Name, "AD_User_ID = ?", null)
		.setParameters(AD_User_ID)
		.first();					
		if (Util.requestAuthorization(user.getPassword())) {
			X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ? ", null)
			.setParameters(m_id).first();
			if (rule != null)
			{
				rule.delete(true);
			}			
		}
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreePath tp = e.getNewLeadSelectionPath();
		if (tp == null)
			return;
		RuleEditorTreeNode node = (RuleEditorTreeNode) tp.getLastPathComponent();
		if (node != null)
		{			
			if (node instanceof RuleFolder)
			{
				m_id = Integer.valueOf(node.getElement().getAttributeValue("uid"));
				setEnabled(true);
			}
			else
				setEnabled(false);			
		} else {
			setEnabled(false);
		}						
	}

}
