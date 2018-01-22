package org.xendra.core.search;

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Vector;

import javax.swing.ImageIcon;

import org.xendra.core.gui.search.BasicResultPanel;
import org.xendra.core.gui.search.ComplexResultPanel;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.api.plugin.PluginLoadingFailedException;
import org.columba.core.gui.frame.FrameManager;
import org.columba.core.gui.search.StringCriteriaRenderer;
import org.columba.core.gui.search.api.ICriteriaRenderer;
import org.columba.core.gui.search.api.IResultPanel;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.columba.core.search.SearchCriteria;
import org.columba.core.search.api.ISearchCriteria;
import org.columba.core.search.api.ISearchProvider;
import org.columba.core.search.api.ISearchRequest;
import org.columba.core.search.api.ISearchResult;

public class InvoiceSearchProvider implements ISearchProvider {
	public static final String CRITERIA_DISPLAYNAME_CONTAINS = "displayname_contains";
	public static final String CRITERIA_EMAIL_CONTAINS = "email_contains";
	private ResourceBundle bundle;
	private int totalResultCount = 0;
	//private VirtualFolder virtualFolder;

	public InvoiceSearchProvider() {
		bundle = ResourceBundle.getBundle("org.xendra.core.i18n.search");
	}
	
	@Override
	public String getTechnicalName() {
		return "InvoiceSearchProvider";
	}

	@Override
	public String getName() {
		return bundle.getString("provider_title");
	}

	@Override
	public String getDescription() {
		return bundle.getString("provider_description");
	}

	@Override
	public ImageIcon getIcon() {
		return ImageLoader.getSmallIcon(IconKeys.INVOICE);	}

	@Override
	public List<ISearchCriteria> getAllCriteria(String searchTerm) {
		List<ISearchCriteria> list = new Vector<ISearchCriteria>();

		list.add(getCriteria(InvoiceSearchProvider.CRITERIA_EMAIL_CONTAINS,	searchTerm));		
		return list;
	}

	@Override
	public IResultPanel getResultPanel(String searchCriteriaTechnicalName) {
		return new BasicResultPanel(getTechnicalName(),	searchCriteriaTechnicalName);
	}

	@Override
	public IResultPanel getComplexResultPanel() {
		return new ComplexResultPanel(getTechnicalName());	}

	@Override
	public ICriteriaRenderer getCriteriaRenderer(String criteriaTechnicalName) {
		ICriteriaRenderer r = null;
		if (criteriaTechnicalName
				.equals(InvoiceSearchProvider.CRITERIA_DISPLAYNAME_CONTAINS)) {
			r = new StringCriteriaRenderer(getCriteria(
					InvoiceSearchProvider.CRITERIA_DISPLAYNAME_CONTAINS, ""),
					this);
		} else if (criteriaTechnicalName
				.equals(InvoiceSearchProvider.CRITERIA_EMAIL_CONTAINS)) {
			r = new StringCriteriaRenderer(getCriteria(
					InvoiceSearchProvider.CRITERIA_EMAIL_CONTAINS, ""), this);
		}

		return r;
	}

	@Override
	public ISearchCriteria getCriteria(String technicalName, String searchTerm) {
		String title = MessageFormat.format(bundle.getString(technicalName + "_title"), new Object[] { searchTerm });
		String name = bundle.getString(technicalName + "_name");
		String description = MessageFormat.format(bundle.getString(technicalName + "_description"),
				new Object[] { searchTerm });

		return new SearchCriteria(technicalName, name, title, description);
	}

	@Override
	public ISearchCriteria getDefaultCriteria(String searchTerm) {
		return getCriteria(InvoiceSearchProvider.CRITERIA_EMAIL_CONTAINS,
				searchTerm);
	}

	@Override
	public List<ISearchResult> query(String searchTerm,
			String criteriaTechnicalName, boolean searchInside,
			int startIndex, int resultCount) {
		if (searchTerm == null)
			throw new IllegalArgumentException("searchTerm == null");
		if (criteriaTechnicalName == null)
			throw new IllegalArgumentException("criteriaTechnicalName == null");

		List<ISearchResult> result = new Vector<ISearchResult>();

//		// create list of contact folders
//		List<AddressbookFolder> v = SearchUtility.createContactFolderList();
//
//		virtualFolder = new VirtualFolder();
//		Iterator<AddressbookFolder> it = v.iterator();
//		while (it.hasNext()) {
//			AddressbookFolder f = it.next();
//			String id = null;
//
//			if (criteriaTechnicalName
//					.equals(ContactSearchProvider.CRITERIA_DISPLAYNAME_CONTAINS)) {
//				id = f.findByName(searchTerm);
//			} else if (criteriaTechnicalName
//					.equals(ContactSearchProvider.CRITERIA_EMAIL_CONTAINS)) {
//				id = f.findByEmailAddress(searchTerm);
//			}
//
//			if (id != null) {
//				IContactModel model = f.get(id);
//
//				result.add(new ContactSearchResult(model.getSortString(), model
//						.getPreferredEmail(), SearchResultBuilder.createURI(f
//						.getId(), id), model));
//
//				// remember search result
//				virtualFolder.add(f, id);
//			}
//
//		}

		totalResultCount = result.size();

		return result;
	}

	@Override
	public List<ISearchResult> query(List<ISearchRequest> list,
			boolean matchAll, boolean searchInside, int startIndex,
			int resultCount) {
		Vector<ISearchResult> v = new Vector<ISearchResult>();
		Iterator<ISearchRequest> it = list.listIterator();
		while (it.hasNext()) {
			ISearchRequest request = it.next();

			List<ISearchResult> result = query(request.getSearchTerm(), request
					.getCriteria(), searchInside, startIndex, resultCount);

			v.addAll(result);
		}

		return v;
	}

	@Override
	public void showAllResults(IFrameMediator mediator, String searchTerm,
			String searchCriteriaTechnicalName) {
		// ensure that we are currently in the contact component
		IFrameMediator newMediator = null;
		try {
			newMediator = FrameManager.getInstance().switchView(
					mediator.getContainer(), "Addressbook");
		} catch (PluginLoadingFailedException e) {
			e.printStackTrace();
		}

		// update folder selection
//		((AddressbookFrameMediator) newMediator).getTree().setSelectedFolder(
//				virtualFolder);
	}

	@Override
	public boolean hasSingleCriteriaSearchResult() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getTotalResultCount() {
		return totalResultCount;
	}

}
