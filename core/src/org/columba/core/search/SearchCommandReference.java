package org.columba.core.search;

import java.util.List;

import org.columba.api.command.ICommandReference;
import org.columba.core.search.api.ISearchRequest;

/**
 * FIXME:
 * 
 * @author fdietz: No locking of folders currently implemented!
 * 
 * @author frd
 */
public class SearchCommandReference implements ICommandReference {

	public static enum TYPE {
		SIMPLE_ALL, SIMPLE_SPECIFIC_PROVIDER, SIMPLE_SPECIFIC_CRITERIA, COMPLEX
	};
	
	private String searchTerm;

	private String providerTechnicalName;

	private int startIndex;

	private int resultCount;

	private String searchCriteriaTechnicalName;

	private boolean searchInside;

	private List<ISearchRequest> request;

	private TYPE type;

	private boolean matchAll;

	public SearchCommandReference(List<ISearchRequest> request,
			boolean matchAll, int startIndex, int resultCount,
			boolean searchInside) {
		super();

		this.request = request;
		this.searchInside = searchInside;
		this.startIndex = startIndex;
		this.resultCount = resultCount;
		this.matchAll = matchAll;

		type = TYPE.COMPLEX;
	}

	public SearchCommandReference(String searchTerm, int startIndex,
			int resultCount, boolean searchInside) {
		super();

		this.searchTerm = searchTerm;
		this.startIndex = startIndex;
		this.resultCount = resultCount;
		this.searchInside = searchInside;

		type = TYPE.SIMPLE_ALL;
	}

	public SearchCommandReference(String searchTerm,
			String providerTechnicalName, int startIndex, int resultCount) {
		super();

		this.searchTerm = searchTerm;
		this.providerTechnicalName = providerTechnicalName;
		this.startIndex = startIndex;
		this.resultCount = resultCount;
		type = TYPE.SIMPLE_SPECIFIC_PROVIDER;
	}

	public SearchCommandReference(String searchTerm,
			String providerTechnicalName,
			String searchCriteriaTechnicalName, boolean searchInside, int startIndex,
			int resultCount) {
		super();

		this.searchTerm = searchTerm;
		this.providerTechnicalName = providerTechnicalName;
		this.searchCriteriaTechnicalName = searchCriteriaTechnicalName;
		this.searchInside = searchInside;
		this.startIndex = startIndex;
		this.resultCount = resultCount;
		type = TYPE.SIMPLE_SPECIFIC_CRITERIA;
	}

	public boolean tryToGetLock(Object locker) {
		return true;
	}

	public void releaseLock(Object locker) {
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public int getResultCount() {
		return resultCount;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public String getProviderTechnicalName() {
		return providerTechnicalName;
	}

	public String getSearchCriteriaTechnicalName() {
		return searchCriteriaTechnicalName;
	}

	public boolean isSearchInside() {
		return searchInside;
	}

	public List<ISearchRequest> getRequest() {
		return request;
	}

	public TYPE getType() {
		return type;
	}

	public boolean isMatchAll() {
		return matchAll;
	}

}
