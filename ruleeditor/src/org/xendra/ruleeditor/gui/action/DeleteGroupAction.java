package org.xendra.ruleeditor.gui.action;

import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.List;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.xendra.ruleeditor.folder.GroupFolder;
import org.xendra.ruleeditor.folder.RuleEditorTreeNode;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameMediator;
import org.xendra.ruleeditor.util.ResourceLoader;

public class DeleteGroupAction extends AbstractColumbaAction implements TreeSelectionListener {
	private RuleEditorTreeNode treeNode;
	private String AD_Rule_ID;
	public DeleteGroupAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "deletegroup"));
		if (frameMediator instanceof RuleEditorFrameMediator) {
			((RuleEditorFrameMediator) frameMediator).addTreeSelectionListener(this);
		} 
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
			.setParameters(Integer.valueOf(AD_Rule_ID)).first();
		if (rule != null) {
			rule.delete(true);
		}
		List<X_AD_Rule> rules = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "IsActive = 'Y'", null).list();
		for (X_AD_Rule rul:rules) {
			String grp = (String) rul.getProperties().get("group");
			if (grp == null) {
				grp = "";
			}
			if (grp.equals(AD_Rule_ID)) {
				HashMap props = rul.getProperties();
				props.put("group", "");
				rul.setProperties(props);
				rul.save();
			}
		}
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		RuleEditorTreeNode node = (RuleEditorTreeNode) e.getNewLeadSelectionPath().getLastPathComponent();
		if (node instanceof GroupFolder) {		
			this.AD_Rule_ID = ((GroupFolder) node).getGroup().getUid();
			setEnabled(true);
		} else {
			setEnabled(false);
		}
	}	
}
