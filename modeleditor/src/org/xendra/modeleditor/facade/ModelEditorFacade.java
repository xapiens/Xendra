package org.xendra.modeleditor.facade;

import java.util.List;

import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.gui.tree.ModelEditorTreeModel;
import org.xendra.modeleditor.facade.IHeaderItem;
import org.xendra.modeleditor.facade.IRuleEditoFacade;
import org.xendra.modeleditor.facade.IRuleEditorItem;

public class ModelEditorFacade implements IRuleEditoFacade {

	@Override
	public void addRule(String uid, IRuleEditorItem ruleItem) {
		if (ruleItem == null)
			throw new IllegalArgumentException("IContactItem is null");
		if (uid == null)
			throw new IllegalArgumentException("uid == null");
		checkRuleItemValidity(ruleItem);
		AbstractFolder selectedFolder = (AbstractFolder) ModelEditorTreeModel.getInstance().getFolder(uid);
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
