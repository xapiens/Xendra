package org.columba.core.search;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;
import javax.swing.event.EventListenerList;

import org.columba.api.command.IWorkerStatusController;
import org.columba.core.command.Command;
import org.columba.core.command.CommandProcessor;
import org.columba.core.search.api.IResultEvent;
import org.columba.core.search.api.IResultListener;
import org.columba.core.search.api.ISearchCriteria;
import org.columba.core.search.api.ISearchManager;
import org.columba.core.search.api.ISearchProvider;
import org.columba.core.search.api.ISearchRequest;
import org.columba.core.search.api.ISearchResult;

public class SearchManager implements ISearchManager {

	private static final Logger LOG = Logger
			.getLogger("org.columba.core.search.SearchManager");

	protected EventListenerList listenerList = new EventListenerList();

	private Map<String, ISearchProvider> providerMap = new Hashtable<String, ISearchProvider>();

	/**
	 * command hashtable used for paging to call the same command several times
	 * for a given <code>startIndex</code> and <code>resultCount</code>
	 */
	private Map<String, Command> commandMap = new Hashtable<String, Command>();

	public SearchManager() {
		// ensure map can be used by multiple threads
		commandMap = Collections.synchronizedMap(commandMap);

	}

	/**
	 * @see org.columba.core.search.api.ISearchManager#executeSearch(java.lang.String,
	 *      int, int)
	 */
	public void executeSearch(String searchTerm, boolean searchInside,
			int startIndex, int resultCount) {
		if (searchTerm == null)
			throw new IllegalArgumentException("searchTerm == null");
		if (startIndex < 0)
			throw new IllegalArgumentException("startIndex must be >= 0");
		if (resultCount <= 0)
			throw new IllegalArgumentException("resultCount must be > 0");


		Command command = new SearchCommand(new SearchCommandReference(searchTerm,
				startIndex, resultCount, searchInside));
		
		// fire up search command
		CommandProcessor.getInstance().addOp(command);
	}

	/**
	 * @see org.columba.core.search.api.ISearchManager#executeSearch(java.lang.String,
	 *      java.lang.String, int, int)
	 */
	public void executeSearch(String searchTerm, String providerName, boolean searchInside,
			int startIndex, int resultCount) {
		if (searchTerm == null)
			throw new IllegalArgumentException("searchTerm == null");
		if (providerName == null)
			throw new IllegalArgumentException("providerName == null");
		if (startIndex < 0)
			throw new IllegalArgumentException("startIndex must be >= 0");
		if (resultCount <= 0)
			throw new IllegalArgumentException("resultCount must be > 0");

	
		Command command = new SearchCommand(new SearchCommandReference(searchTerm,
				providerName, startIndex, resultCount));
		// fire up search command
		CommandProcessor.getInstance().addOp(command);
	}

	public void executeSearch(String searchTerm, String providerName,
			String criteriaName, boolean searchInside, int startIndex, int resultCount) {
		if (searchTerm == null)
			throw new IllegalArgumentException("searchTerm == null");
		if (providerName == null)
			throw new IllegalArgumentException("providerName == null");
		if (criteriaName == null)
			throw new IllegalArgumentException("criteriaName == null");
		if (startIndex < 0)
			throw new IllegalArgumentException("startIndex must be >= 0");
		if (resultCount <= 0)
			throw new IllegalArgumentException("resultCount must be > 0");

		Command command = new SearchCommand(new SearchCommandReference(searchTerm,
				providerName, criteriaName, searchInside, startIndex, resultCount));
		
		// fire up search command
		CommandProcessor.getInstance().addOp(command);
	}

	public void executeSearch(List<ISearchRequest> requests,
			boolean allCriteria, boolean searchInside, int startIndex,
			int resultCount) {
		if (requests == null)
			throw new IllegalArgumentException("requests == null");
		if (startIndex < 0)
			throw new IllegalArgumentException("startIndex must be >= 0");
		if (resultCount <= 0)
			throw new IllegalArgumentException("resultCount must be > 0");

		Command command = new SearchCommand(new SearchCommandReference(
				requests, allCriteria, startIndex, resultCount, searchInside));

		CommandProcessor.getInstance().addOp(command);
	}

	/**
	 * @see org.columba.core.search.api.ISearchManager#getAllProviders()
	 */
	public Iterator<ISearchProvider> getAllProviders() {
		return providerMap.values().iterator();
	}

	/**
	 * @see org.columba.core.search.api.ISearchManager#clearSearch(java.lang.String)
	 */
	public void clearSearch(String searchTerm) {
		// we assume user cancelled search
		// -> remove cached command
		if (commandMap.containsKey(searchTerm))
			commandMap.remove(searchTerm);

		fireClearSearch(searchTerm);
	}

	public void reset() {
		fireReset();
	}

	/**
	 * Propagates an event to all registered listeners notifying them of a item
	 * addition.
	 */
	protected void fireNewResultArrived(String searchTerm,
			String providerTechnicalName, ISearchCriteria criteria,
			List<ISearchResult> result, int totalResultCount) {

		IResultEvent e = new ResultEvent(this, searchTerm,
				providerTechnicalName, criteria, result, totalResultCount);
		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();

		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == IResultListener.class) {
				((IResultListener) listeners[i + 1]).resultArrived(e);
			}
		}
	}

	protected void fireNewResultArrived(String providerTechnicalName,
			List<ISearchResult> result, int totalResultCount) {

		IResultEvent e = new ResultEvent(this, providerTechnicalName, result,
				totalResultCount);
		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();

		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == IResultListener.class) {
				((IResultListener) listeners[i + 1]).resultArrived(e);
			}
		}
	}

	protected void fireFinished() {
		IResultEvent e = new ResultEvent(this);
		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();

		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == IResultListener.class) {
				((IResultListener) listeners[i + 1]).finished(e);
			}
		}

	}

	/**
	 * Propagates an event to all registered listeners
	 */
	protected void fireClearSearch(String searchTerm) {

		IResultEvent e = new ResultEvent(this, searchTerm);
		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();

		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == IResultListener.class) {
				((IResultListener) listeners[i + 1]).clearSearch(e);
			}
		}
	}

	protected void fireReset() {

		IResultEvent e = new ResultEvent(this);
		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();

		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == IResultListener.class) {
				((IResultListener) listeners[i + 1]).reset(e);
			}
		}
	}

	/**
	 * @see org.columba.core.search.api.ISearchManager#addResultListener(org.columba.core.search.api.IResultListener)
	 */
	public void addResultListener(IResultListener l) {
		listenerList.add(IResultListener.class, l);

	}

	/**
	 * @see org.columba.core.search.api.ISearchManager#removeResultListener(org.columba.core.search.api.IResultListener)
	 */
	public void removeResultListener(IResultListener l) {
		listenerList.remove(IResultListener.class, l);

	}

	/**
	 * Command executes the search.
	 * <p>
	 * In case new result results arrive, it ensures that all interested
	 * listeners are notified from inside the EDT.
	 * <p>
	 * FIXME: fdietz: No locking of folders currently implemented! TODO: fdietz:
	 * create new Command for every provider to introduce real "parallel" search
	 * 
	 * @author fdietz
	 */
	class SearchCommand extends Command {

		public SearchCommand(SearchCommandReference reference) {
			super(reference);
		}

		@Override
		public void execute(IWorkerStatusController worker) throws Exception {
			final SearchCommandReference ref = (SearchCommandReference) getReference();

			if (ref.getType().equals(SearchCommandReference.TYPE.SIMPLE_ALL)) {
				Iterator<ISearchProvider> it = getAllProviders();
				while (it.hasNext()) {
					final ISearchProvider p = it.next();

					// query using all criteria
					Iterator<ISearchCriteria> it2 = p.getAllCriteria(
							ref.getSearchTerm()).iterator();
					while (it2.hasNext()) {
						ISearchCriteria c = it2.next();
						String searchCriteriaTechnicalName = c
								.getTechnicalName();
						// execute search
						doExecute(ref.getSearchTerm(), p,
								searchCriteriaTechnicalName, ref
										.isSearchInside(), ref.getStartIndex(),
								ref.getResultCount());
					}

				}
			} else if (ref.getType().equals(
					SearchCommandReference.TYPE.SIMPLE_SPECIFIC_PROVIDER)) {
				String providerTechnicalName = ref.getProviderTechnicalName();
				ISearchProvider p = getProvider(providerTechnicalName);
				// query using all criteria
				Iterator<ISearchCriteria> it2 = p.getAllCriteria(
						ref.getSearchTerm()).iterator();
				while (it2.hasNext()) {
					ISearchCriteria c = it2.next();
					String searchCriteriaTechnicalName = c.getTechnicalName();
					// execute search
					doExecute(ref.getSearchTerm(), p,
							searchCriteriaTechnicalName, ref.isSearchInside(),
							ref.getStartIndex(), ref.getResultCount());
				}
			} else if (ref.getType().equals(
					SearchCommandReference.TYPE.SIMPLE_SPECIFIC_CRITERIA)) {
				String providerTechnicalName = ref.getProviderTechnicalName();
				ISearchProvider p = getProvider(providerTechnicalName);
				doExecute(ref.getSearchTerm(), p, ref
						.getSearchCriteriaTechnicalName(),
						ref.isSearchInside(), ref.getStartIndex(), ref
								.getResultCount());
			} else if (ref.getType()
					.equals(SearchCommandReference.TYPE.COMPLEX)) {

				// first, create bucket for each provider
				Map<String, Vector<ISearchRequest>> map = new Hashtable<String, Vector<ISearchRequest>>();
				Iterator<ISearchRequest> it = ref.getRequest().iterator();
				while (it.hasNext()) {
					ISearchRequest r = it.next();
					String providerName = r.getProvider();

					if (map.containsKey(providerName)) {
						Vector<ISearchRequest> v = map.get(providerName);
						v.add(r);
					} else {
						Vector<ISearchRequest> v = new Vector<ISearchRequest>();
						v.add(r);
						map.put(providerName, v);
					}
				}

				// now search through all buckets
				Iterator<String> it2 = map.keySet().iterator();
				while (it2.hasNext()) {
					final String providerName = it2.next();
					ISearchProvider p = getProvider(providerName);
					Vector<ISearchRequest> v = map.get(providerName);
					final List<ISearchResult> resultList = p.query(v, ref
							.isMatchAll(), ref.isSearchInside(), ref
							.getStartIndex(), ref.getResultCount());

					final int totalResultCount = p.getTotalResultCount();

					// notify all listeners that new search results arrived

					// ensure this is called in the EDT
					Runnable run = new Runnable() {
						public void run() {
							fireNewResultArrived(providerName, resultList,
									totalResultCount);
						}
					};
					SwingUtilities.invokeLater(run);
				}

			}

			// notify that search is finished
			Runnable run = new Runnable() {
				public void run() {
					fireFinished();
				}
			};
			SwingUtilities.invokeLater(run);
			
			// create list of all registered providers
			// Iterator<ISearchProvider> it = getAllProviders();
			// while (it.hasNext()) {
			// final ISearchProvider p = it.next();
			//
			// // if providerName specified
			// // -> skip if this isn't the matching provider
			// if (providerTechnicalName != null) {
			// if (!providerTechnicalName.equals(p.getTechnicalName()))
			// continue;
			// }
			//
			// // keep search history
			// // SearchHistoryList.getInstance().add(ref.getSearchTerm(), p,
			// // c);
			//
			// if (ref.getSearchCriteriaTechnicalName() == null) {
			// // query using all criteria
			// Iterator<ISearchCriteria> it2 = p.getAllCriteria(
			// ref.getSearchTerm()).iterator();
			// while (it2.hasNext()) {
			// ISearchCriteria c = it2.next();
			// String searchCriteriaTechnicalName = c
			// .getTechnicalName();
			// // execute search
			// doExecute(ref, p, searchCriteriaTechnicalName, ref
			// .isSearchInside());
			// }
			// } else {
			// // query only a single criteria
			//
			// // execute search
			// doExecute(ref, p, ref.getSearchCriteriaTechnicalName(), ref
			// .isSearchInside());
			// }
			//
			// }

		}

		private void doExecute(final String searchTerm,
				final ISearchProvider p,
				final String searchCriteriaTechnicalName,
				final boolean searchInside, final int startIndex,
				final int resultCount) {

			// query provider
			final List<ISearchResult> resultList = p.query(searchTerm,
					searchCriteriaTechnicalName, searchInside, startIndex,
					resultCount);

			// retrieve total result count
			final int totalResultCount = p.getTotalResultCount();

			// notify all listeners that new search results arrived

			// ensure this is called in the EDT
			Runnable run = new Runnable() {
				public void run() {
					
					fireNewResultArrived(searchTerm, p.getTechnicalName(), p
							.getCriteria(searchCriteriaTechnicalName,
									searchTerm), resultList, totalResultCount);
					
				}
			};
			SwingUtilities.invokeLater(run);
		}

	}

	/**
	 * @see org.columba.core.search.api.ISearchManager#getProvider(java.lang.String)
	 */
	public ISearchProvider getProvider(String technicalName) {
		return providerMap.get(technicalName);
	}

	public void registerProvider(ISearchProvider p) {
		providerMap.put(p.getTechnicalName(), p);
	}

	public void unregisterProvider(ISearchProvider p) {
		providerMap.remove(p.getTechnicalName());
	}

}
