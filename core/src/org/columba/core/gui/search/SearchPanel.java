package org.columba.core.gui.search;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import org.columba.api.gui.frame.IDock;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.IExtensionHandlerKeys;
import org.columba.api.plugin.PluginException;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.context.ContextSearchManager;
import org.columba.core.context.api.IContextProvider;
import org.columba.core.context.api.IContextSearchManager;
import org.columba.core.gui.context.ContextDebugProvider;
import org.columba.core.gui.context.ContextResultBox;
import org.columba.core.gui.frame.api.IComponentBox;
import org.columba.core.gui.search.api.IResultPanel;
import org.columba.core.gui.search.api.ISearchPanel;
import org.columba.core.logging.Logging;
import org.columba.core.plugin.PluginManager;
import org.columba.core.search.SearchManager;
import org.columba.core.search.api.ISearchCriteria;
import org.columba.core.search.api.ISearchManager;
import org.columba.core.search.api.ISearchProvider;
import org.columba.core.search.api.ISearchRequest;
import org.jdesktop.swingx.VerticalLayout;

public class SearchPanel extends JPanel implements ISearchPanel {

	private static final int RESULT_COUNT = 20;
	private static final Logger LOG = Logger.getLogger("org.columba.core.search.gui.SearchPanel");
	private IFrameMediator frameMediator;
	// private SearchResultView searchResultView;
	//private StackedBox box;
	private JPanel defaultBox;
	private JPanel searchBox;
	private Hashtable<String, SearchResultBox> searchMap = new Hashtable<String, SearchResultBox>();
	private ISearchManager searchManager;
	private Map<String, ContextResultBox> contextMap = new Hashtable<String, ContextResultBox>();
	private IContextSearchManager contextSearchManager;
	private JPanel topPanel;

	public SearchPanel(IFrameMediator frameMediator) {
		super();
		this.frameMediator = frameMediator;
		this.searchManager = new SearchManager();
		initSearchProvider();
		contextSearchManager = new ContextSearchManager(frameMediator);
		initContextProvider();
		setBackground(UIManager.getColor("TextField.background"));
		//box = new StackedBox();
		defaultBox = new JPanel();
		defaultBox.setLayout(new VerticalLayout());
		defaultBox.setBackground(UIManager.getColor("TextField.background"));

		searchBox = new JPanel();
		searchBox.setLayout(new VerticalLayout());
		searchBox.setBackground(UIManager.getColor("TextField.background"));

		//box.setBackground(new Color(248, 248, 248));
//		JScrollPane pane = new JScrollPane(box);
//		pane.setBorder(null);

		setLayout(new BorderLayout());
		add(defaultBox, BorderLayout.CENTER);

		topPanel = new JPanel();
		//topPanel.setBackground(UIManager.getColor("TextField.background"));
		topPanel.setLayout(new BorderLayout());
		topPanel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		
		JButton closeButton = new JButton("Close");
		closeButton.setMnemonic('c');
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//createDefaultStackedBox();
				SearchPanel.this.removeAll();
				SearchPanel.this.add(defaultBox, BorderLayout.CENTER);
				validate();
				repaint();
			}
		});
		topPanel.add(closeButton, BorderLayout.EAST);
		add(topPanel, BorderLayout.NORTH);		
		createDefaultStackedBox();
	}

	private void initContextProvider() {
		// if in debug mode, register context debugger view
		if (Logging.DEBUG)
			contextSearchManager.register(new ContextDebugProvider());

		try {

			IExtensionHandler handler = PluginManager.getInstance()
					.getExtensionHandler(IExtensionHandlerKeys.ORG_COLUMBA_CORE_CONTEXT_PROVIDER);
			String[] ids = handler.getPluginIdList();
			for (int i = 0; i < ids.length; i++) {
				try {
					IExtension extension = handler.getExtension(ids[i]);
					IContextProvider provider = (IContextProvider) extension.instanciateExtension(null);
					contextSearchManager.register(provider);
				} catch (PluginException e) {
					LOG.severe("Error while loading plugin: " + e.getMessage());
					if (Logging.DEBUG)
						e.printStackTrace();
				}
			}

		} catch (PluginHandlerNotFoundException e) {
			LOG.severe("Error while loading plugin: " + e.getMessage());
			if (Logging.DEBUG)
				e.printStackTrace();
		}
	}

	private void initSearchProvider() {
		List<ISearchProvider> list = new Vector<ISearchProvider>();
		try {
			IExtensionHandler handler = PluginManager.getInstance()
					.getExtensionHandler(IExtensionHandlerKeys.ORG_COLUMBA_CORE_SEARCH);

			String[] ids = handler.getPluginIdList();
			for (int i = 0; i < ids.length; i++) {
				try {
					IExtension extension = handler.getExtension(ids[i]);
					ISearchProvider provider = (ISearchProvider) extension.instanciateExtension(null);
					searchManager.registerProvider(provider);
				} catch (PluginException e) {
					LOG.severe("Error while loading plugin: " + e.getMessage());
					if (Logging.DEBUG)
						e.printStackTrace();
				}
			}

		} catch (PluginHandlerNotFoundException e) {
			LOG.severe("Error while loading plugin: " + e.getMessage());
			if (Logging.DEBUG)
				e.printStackTrace();
		}
	}

	// search individual provider and individual criteria
	public void searchInCriteria(String searchTerm, String providerName,
			String criteriaName, boolean searchInside) {
		showSearchDockingView();
		ISearchManager manager = searchManager;
		// start a new search -> clear all previous search results
		manager.clearSearch(searchTerm);
		manager.reset();
		createSearchStackedBox(searchTerm, providerName, criteriaName);
		// TODO @author fdietz: no paging used currently
		// show only first 5 results
		manager.executeSearch(searchTerm, providerName, criteriaName, searchInside, 0, SearchPanel.RESULT_COUNT);
	}

	// search individual provider
	public void searchInProvider(String searchTerm, String providerName,
			boolean searchInside) {

		showSearchDockingView();
		ISearchManager manager = searchManager;
		// start a new search -> clear all previous search results
		manager.clearSearch(searchTerm);
		manager.reset();
		createSearchStackedBox(searchTerm, providerName, null);
		// TODO @author fdietz: no paging used currently
		// show only first 5 results
		manager.executeSearch(searchTerm, providerName, searchInside, 0, SearchPanel.RESULT_COUNT);
	}

	// search across all providers
	public void searchAll(String searchTerm, boolean searchInside) {
		showSearchDockingView();
		ISearchManager manager = searchManager;
		// start a new search -> clear all previous search results
		manager.clearSearch(searchTerm);
		manager.reset();
		createSearchStackedBox(searchTerm, null, null);
		// TODO @author fdietz: no paging used currently
		// show only first 5 results
		manager.executeSearch(searchTerm, searchInside, 0, SearchPanel.RESULT_COUNT);
	}

	// search across a few specific search criteria at once
	public void searchComplex(List<ISearchRequest> list, boolean matchAll,
			boolean searchInside) {
		showSearchDockingView();
		// start a new search -> clear all previous search results
		searchManager.reset();
		removeAll();
		//remove(topPanel);
		add(topPanel, BorderLayout.NORTH);
		add(searchBox, BorderLayout.CENTER);
		searchBox.removeAll();
		// first, create bucket for each provider
		Map<String, Vector<ISearchRequest>> map = new Hashtable<String, Vector<ISearchRequest>>();
		Iterator<ISearchRequest> it = list.iterator();
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
			ISearchProvider p = searchManager.getProvider(providerName);
			createComplexResultPanel(p);
		}
		validate();
		repaint();

		// TODO @author fdietz: no paging used currently
		// show only first 5 results
		searchManager.executeSearch(list, matchAll, searchInside, 0,
				SearchPanel.RESULT_COUNT);
	}

	private void createDefaultStackedBox() {
		removeAll();
		//remove(topPanel);
		add(defaultBox, BorderLayout.CENTER);
		//defaultBox.removeAll();
		try {
			IExtensionHandler handler = PluginManager.getInstance()
					.getExtensionHandler(
							IExtensionHandlerKeys.ORG_COLUMBA_CORE_COMPONENT_BOX);
			Enumeration<IExtension> e = handler.getExtensionEnumeration();
			while (e.hasMoreElements()) {
				try {
					IExtension extension = e.nextElement();
					IComponentBox compBox = (IComponentBox) extension.instanciateExtension(null);
					defaultBox.add(new ComponentBoxContainer(compBox));
				} catch (PluginException ex) {
					LOG.severe("Error while loading plugin: " + ex.getMessage());
					if (Logging.DEBUG)
						ex.printStackTrace();
				}
			}

		} catch (PluginHandlerNotFoundException e) {
			LOG.severe("Error while loading plugin: " + e.getMessage());
			if (Logging.DEBUG)
				e.printStackTrace();
		}
		Iterator<IContextProvider> it = contextSearchManager.getAllProviders().iterator();
		
		while (it.hasNext()) {
			IContextProvider p = it.next();
			// clear previous search results
			p.clear();
			ContextResultBox resultBox = new ContextResultBox(frameMediator, p,	contextSearchManager);
			defaultBox.add(resultBox);
			contextMap.put(p.getName(), resultBox);
		}
		validate();
		repaint();
	}

	// create new stacked box
	private void createSearchStackedBox(String searchTerm, String providerName,
			String criteriaName) {
		if (searchTerm == null)
			throw new IllegalArgumentException("searchTerm == null");
		//remove(topPanel);
		removeAll();
		add(topPanel, BorderLayout.NORTH);
		add(searchBox, BorderLayout.CENTER);
		searchBox.removeAll();
		// search across all providers
		boolean providerAll = (providerName == null) ? true : false;
		// search all criteria in specific provider only
		boolean providerSearch = (providerName != null) ? true : false;
		// search in specific criteria
		boolean criteriaSearch = (criteriaName != null && providerName != null) ? true
				: false;

		ISearchManager manager = searchManager;
		if (criteriaSearch) {
			// query with only a single criteria
			ISearchProvider p = manager.getProvider(providerName);
			ISearchCriteria c = p.getCriteria(criteriaName, searchTerm);
			createResultPanel(p, c);
		} else if (providerSearch) {
			// query only a single provider
			ISearchProvider p = manager.getProvider(providerName);
			Iterator<ISearchCriteria> it2 = p.getAllCriteria(searchTerm).iterator();
			while (it2.hasNext()) {
				ISearchCriteria c = it2.next();
				createResultPanel(p, c);
			}

		} else if (providerAll) {
			// query all criteria of all providers
			Iterator<ISearchProvider> it = manager.getAllProviders();
			while (it.hasNext()) {
				ISearchProvider p = it.next();
				if (p == null)
					continue;
				Iterator<ISearchCriteria> it2 = p.getAllCriteria(searchTerm).iterator();
				while (it2.hasNext()) {
					ISearchCriteria c = it2.next();
					createResultPanel(p, c);
				}
			}
		}
		// repaint box
		validate();
		repaint();
	}

	private void createComplexResultPanel(ISearchProvider p) {

		IResultPanel resultPanel = p.getComplexResultPanel();
		// add result panel as listener for new search results
		searchManager.addResultListener(resultPanel);
		// create visual container for result panel
		SearchResultBox resultBox = new SearchResultBox(frameMediator, p, null,
				resultPanel);
		resultBox.installListener(searchManager);
		// add to search panel
		searchBox.add(resultBox);
	}

	private void createResultPanel(ISearchProvider p, ISearchCriteria c) {

		IResultPanel resultPanel = p.getResultPanel(c.getTechnicalName());
		// add result panel as listener for new search results
		searchManager.addResultListener(resultPanel);
		// create visual container for result panel
		SearchResultBox resultBox = new SearchResultBox(frameMediator, p, c, resultPanel);
		resultBox.installListener(searchManager);
		// add to search panel
		searchBox.add(resultBox);
	}

	// show search docking view
	private void showSearchDockingView() {
		if (frameMediator instanceof IDock) {
			// show docking view
			((IDock) frameMediator).showDockable(IDock.DOCKING_VIEW_SEARCH);
		}
	}

	/**
	 * @see org.columba.core.gui.search.api.ISearchPanel#getView()
	 */
	public JComponent getView() {
		return this;
	}

	public ISearchManager getSearchManager() {
		return searchManager;
	}

	public IContextSearchManager getContextSearchManager() {
		return contextSearchManager;
	}

	public void searchInContext() {
		// init result view
		//createContextStackedBox();

		// execute background search
		contextSearchManager.search();
	}

//	private void createContextStackedBox() {
//
//		searchMap.clear();
//
//		remove(topPanel);
//		add(topPanel, BorderLayout.NORTH);
//
//		box.removeAll();
//
//		Iterator<IContextProvider> it = contextSearchManager.getAllProviders()
//				.iterator();
//		while (it.hasNext()) {
//			IContextProvider p = it.next();
//
//			// clear previous search results
//			p.clear();
//			ContextResultBox resultBox = new ContextResultBox(frameMediator, p,
//					contextSearchManager);
//			box.addBox(resultBox);
//
//			contextMap.put(p.getName(), resultBox);
//		}
//
//		// repaint box
//		validate();
//		repaint();
//	}
}
