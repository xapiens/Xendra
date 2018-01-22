package org.columba.core.search.api;

import java.util.List;

import javax.swing.ImageIcon;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.api.plugin.IExtensionInterface;
import org.columba.core.gui.search.api.ICriteriaRenderer;
import org.columba.core.gui.search.api.IResultPanel;

/**
 * Provider does the actual search and furthermore contains a description
 * of the search criteria.
 * 
 * @author frd
 */
public interface ISearchProvider extends IExtensionInterface{

	/**
	 * Returns technical name. Should be unique.
	 * @return
	 */
	public String getTechnicalName();
	
	/**
	 * Return provider human-readable name
	 * @return
	 */
	public String getName();
	
	/**
	 * Return provider human-readable description
	 * @return
	 */
	public String getDescription();
	
	/**
	 * Return provider icon
	 * @return
	 */
	public ImageIcon getIcon();
	
	
	/**
	 * Retrieve search criteria for given search term.
	 * 
	 * @param searchTerm
	 * @return
	 */
	public List<ISearchCriteria> getAllCriteria(String searchTerm);

	
	/**
	 * Get result panel for given search criteria.
	 * 
	 * @param searchCriteriaTechnicalName
	 * @return
	 */
	public IResultPanel getResultPanel(String searchCriteriaTechnicalName);
	
	/**
	 * Get result panel for a complex search across a couple of specific criteria.
	 * 
	 * @return
	 */
	public IResultPanel getComplexResultPanel();
	
	/**
	 * Get criteria renderer fo given search criteria technical name
	 * 
	 * @param searchCriteriaTechnicalName
	 * @return
	 */
	public ICriteriaRenderer getCriteriaRenderer(String criteriaTechnicalName);
	
	/**
	 * Retrieve single search criteria for given search term.
	 * 
	 * @param technicalName
	 * @param searchTerm
	 * @return
	 */
	public ISearchCriteria getCriteria(String technicalName, String searchTerm);
	
	
	public ISearchCriteria getDefaultCriteria(String searchTerm);
	
	/**
	 * Execute query and retrieve pageable search result for given search term and
	 * a single search criteria.
	 * <p>
	 * The query returns <code>resultCount</code> individual results, from
	 * a given <code>startIndex</code>. Paging should be supported, so its
	 * up to the underlying implementation to use an intelligent caching 
	 * strategy or whatever necessary to make repetitive calls to this
	 * method fast.
	 *  
	 * @param searchTerm					search term
	 * @param searchCriteriaTechnicalName	search criteria technical name
	 * @param searchInside					search inside previous search results
	 * @param startIndex					start index of search results
	 * @param resultCount					total count of results
	 * 
	 * @return	
	 */
	public List<ISearchResult> query(String searchTerm, String searchCriteriaTechnicalName, boolean searchInside, int startIndex, int resultCount);
	
	public List<ISearchResult> query(List<ISearchRequest> list, boolean matchAll, boolean searchInside, int startIndex, int resultCount);
	
	public void showAllResults(IFrameMediator mediator, String searchTerm, String searchCriteriaTechnicalName);
	
	/**
	 * Check if search provider has executed a single criteria search.
	 * 
	 * @return	true, in case single criteria search was done. False, otherwise.
	 */
	public boolean hasSingleCriteriaSearchResult();
	
	/**
	 * Return total number of search results. Method only returns valid result after calling
	 * <code>query</code> first.
	 * 
	 * @return	total number of search results. <code>-1</code>, in case <code>query</code> was not called, yet
	 */
	public int getTotalResultCount();
}
