package org.columba.core.search.api;

public interface ISearchRequest {

	String getProvider();
	String getCriteria();
	String getSearchTerm();
}
