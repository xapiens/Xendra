package org.columba.core.search;

import org.columba.core.search.api.ISearchRequest;

public class SearchRequest implements ISearchRequest {

	private String criteria;
	private String provider;
	private String searchTerm;
	
	public SearchRequest(String criteria, String provider, String searchTerm) {
		this.criteria = criteria;
		this.provider = provider;
		this.searchTerm = searchTerm;
		
	}
	
	public String getCriteria() {
		return criteria;
	}

	public String getProvider() {
		return provider;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

}
