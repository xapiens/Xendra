package org.xendra.ruleeditor.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.xendra.ruleeditor.folder.RuleEditorTreeNode;
import org.xendra.ruleeditor.folder.RuleFolder;
import org.xendra.ruleeditor.gui.codeeditor.DroolsEditor;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameController;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameMediator;
import org.xendra.ruleeditor.util.ResourceLoader;

@SuppressWarnings("serial")
public class SaveRuleAction extends AbstractColumbaAction implements TreeSelectionListener {
	
	private RuleEditorTreeNode treeNode;
	private DroolsEditor m_editor;
	private Integer m_id;

	public SaveRuleAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_saverule"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_saverule_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_saverule_toolbar"));		
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.ruleeditor", "document-save.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.ruleeditor", "document-save.png"));
		if (frameMediator instanceof RuleEditorFrameMediator) {
			m_editor = ((RuleEditorFrameController) frameMediator).GetEditor();
			((RuleEditorFrameMediator) frameMediator).addTreeSelectionListener(this);
			setEnabled(false);
		} 
		else
			setEnabled(false);		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (m_editor != null)
		{		
			String code = m_editor.getEditor().getText();
			X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ? ", null)
				.setParameters(m_id).first();
			if (rule != null)
			{
				rule.setScript(code);
				rule.save();
			}
		}			
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		RuleEditorTreeNode node = (RuleEditorTreeNode) e.getNewLeadSelectionPath().getLastPathComponent();
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
