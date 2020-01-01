package org.xendra.ruleeditor.facade;

import java.util.List;

import org.xendra.ruleeditor.folder.AbstractFolder;
import org.xendra.ruleeditor.gui.tree.RuleEditorTreeModel;

public class RuleEditorFacade implements IRuleEditoFacade {

	@Override
	public void addRule(String uid, IRuleEditorItem ruleItem) {
		if (ruleItem == null)
			throw new IllegalArgumentException("IContactItem is null");
		if (uid == null)
			throw new IllegalArgumentException("uid == null");
		checkRuleItemValidity(ruleItem);
		AbstractFolder selectedFolder = (AbstractFolder) RuleEditorTreeModel.getInstance().getFolder(uid);
	}

	
	private void checkRuleItemValidity(IRuleEditorItem ruleItem) {
		if (ruleItem.getFirstName() != null) {
			
		}
		
	}


	@Override
	public void addRules(String id, IRuleEditorItem[] ruleItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRule(IRuleEditorItem ruleItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRules(IRuleEditorItem[] ruleItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IRuleEditorItem getRuleEditorItem(String folderId, String ruleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IHeaderItem> getAllHeaderItems(String folderId,
			boolean flattenGroupItems) {
		// TODO Auto-generated method stub
		return null;
	}

}
