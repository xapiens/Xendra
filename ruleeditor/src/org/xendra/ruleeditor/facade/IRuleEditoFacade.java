package org.xendra.ruleeditor.facade;

import java.util.List;

public interface IRuleEditoFacade {
	void addRule(String id, IRuleEditorItem ruleItem);
	void addRules(String id, IRuleEditorItem[] ruleItem);
	void addRule(IRuleEditorItem ruleItem);
	void addRules(IRuleEditorItem[] ruleItem);
	public IRuleEditorItem getRuleEditorItem(String folderId, String ruleId);
	public List<IHeaderItem> getAllHeaderItems(String folderId, boolean flattenGroupItems);
} 
