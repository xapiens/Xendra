package org.columba.core.gui.search.api;

import java.util.List;

import javax.swing.JComponent;

import org.columba.core.context.api.IContextSearchManager;
import org.columba.core.search.api.ISearchManager;
import org.columba.core.search.api.ISearchRequest;

public interface ISearchPanel {

	public void searchAll(String searchTerm,  boolean searchInside);

	public void searchInProvider(String searchTerm, String providerName, boolean searchInside);

	public void searchInCriteria(String searchTerm, String providerName,
			String criteriaName, boolean searchInside);
	
	public void searchComplex(List<ISearchRequest> list, boolean matchAll, boolean searchInside);
	
	public void searchInContext();
	
	public ISearchManager getSearchManager();

	public IContextSearchManager getContextSearchManager();
	
	public JComponent getView();

}