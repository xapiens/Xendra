package org.columba.core.search.api;

import java.util.Iterator;
import java.util.List;

/**
 * Search Provider Registry.
 * 
 * @author frd
 */
public interface ISearchManager {

	public void registerProvider(ISearchProvider p);
	public void unregisterProvider(ISearchProvider p);
	
	public ISearchProvider getProvider(String technicalName);
	
	public Iterator<ISearchProvider> getAllProviders(); 
	
	/**
	 * Execute query and retrieve pageable search result for given search term.
	 * <p>
	 * The query returns <code>resultCount</code> individual results, from
	 * a given <code>startIndex</code>. Paging should be supported, so its
	 * up to the underlying implementation to use an intelligent caching 
	 * strategy or whatsoever.
	 * 
	 * @param searchTerm		search term
	 * @param searchInside		search inside previous search results
	 * @param startIndex		start index of search results
	 * @param resultCount		total count of results
	 */
	public void executeSearch(String searchTerm, boolean searchInside, int startIndex, int resultCount);
	
	
	/**
	 * Execute query and retrieve pageable search result for given search term.
	 * <p>
	 * The query returns <code>resultCount</code> individual results, from
	 * a given <code>startIndex</code>. Paging should be supported, so its
	 * up to the underlying implementation to use an intelligent caching 
	 * strategy or whatsoever.
	 * 
	 * @param searchTerm
	 * @param providerName
	 * @param startIndex		start index of search results
	 * @param resultCount		total count of results
	 * 
	 */
	public void executeSearch(String searchTerm, String providerName, boolean searchInside, int startIndex, int resultCount);
	
	/**
	 * Execute query and retrieve pageable search result for given search term.
	 * <p>
	 * The query returns <code>resultCount</code> individual results, from
	 * a given <code>startIndex</code>. Paging should be supported, so its
	 * up to the underlying implementation to use an intelligent caching 
	 * strategy or whatsoever.
	 * 
	 * @param searchTerm
	 * @param providerName
	 * @param criteriaName
	 * @param startIndex		start index of search results
	 * @param resultCount		total count of results
	 * 
	 */
	public void executeSearch(String searchTerm, String providerName, String criteriaName, boolean searchInside, int startIndex, int resultCount);
	
	
	public void executeSearch(List<ISearchRequest> requests, boolean allCriteria, boolean searchInside, int startIndex, int resultCount);
	
	/**
	 * Clear a search and discard all cached data for this <code>searchTerm</code>.
	 * 
	 * @param searchTerm	search term
	 */
	public void clearSearch(String searchTerm);
	
	public void reset();
	
	public void addResultListener(IResultListener listener);
	public void removeResultListener(IResultListener listener);
}
