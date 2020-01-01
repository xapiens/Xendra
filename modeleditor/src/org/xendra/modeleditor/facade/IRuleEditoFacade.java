package org.xendra.modeleditor.facade;

import java.util.List;

import org.xendra.modeleditor.facade.IHeaderItem;
import org.xendra.modeleditor.facade.IRuleEditorItem;

public interface IRuleEditoFacade {
	void addRule(String id, IRuleEditorItem ruleItem);
	void addRules(String id, IRuleEditorItem[] ruleItem);
	void addRule(IRuleEditorItem ruleItem);
	void addRules(IRuleEditorItem[] ruleItem);
	public IRuleEditorItem getRuleEditorItem(String folderId, String ruleId);
	public List<IHeaderItem> getAllHeaderItems(String folderId, boolean flattenGroupItems);
} 
