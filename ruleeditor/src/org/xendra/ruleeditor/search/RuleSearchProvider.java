package org.xendra.ruleeditor.search;

import java.io.File;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.api.plugin.PluginLoadingFailedException;
import org.columba.core.gui.frame.FrameManager;
import org.columba.core.gui.search.StringCriteriaRenderer;
import org.columba.core.gui.search.api.ICriteriaRenderer;
import org.columba.core.gui.search.api.IResultPanel;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.columba.core.search.SearchCriteria;
import org.columba.core.search.SearchResult;
import org.columba.core.search.api.ISearchCriteria;
import org.columba.core.search.api.ISearchProvider;
import org.columba.core.search.api.ISearchRequest;
import org.columba.core.search.api.ISearchResult;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.xendra.ruleeditor.folder.virtual.VirtualFolder;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameMediator;
import org.xendra.ruleeditor.gui.search.BasicResultPanel;
import org.xendra.ruleeditor.gui.search.ComplexResultPanel;

public class RuleSearchProvider implements ISearchProvider {
	public static final String CRITERIA_DISPLAYNAME_CONTAINS = "displayname_contains";
	public static final String CRITERIA_EMAIL_CONTAINS = "email_contains";
	private ResourceBundle bundle;
	private int totalResultCount = 0;
	private VirtualFolder virtualFolder;

	public RuleSearchProvider() {
		bundle = ResourceBundle.getBundle("org.xendra.ruleeditor.i18n.search");
	}

	public String getTechnicalName() {
		return "ContactSearchProvider";
	}

	public String getName() {
		return bundle.getString("provider_title");
	}

	public String getDescription() {
		return bundle.getString("provider_description");
	}

	public ImageIcon getIcon() {
    	ImageIcon icon = null;	
		try {
    		icon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "drools.gif"))));
    	}
    	catch (Exception e) {}
    	return icon;
	}

	public List<ISearchCriteria> getAllCriteria(String searchTerm) {

		List<ISearchCriteria> list = new Vector<ISearchCriteria>();

		list.add(getCriteria(RuleSearchProvider.CRITERIA_EMAIL_CONTAINS,	searchTerm));
		list.add(getCriteria(RuleSearchProvider.CRITERIA_DISPLAYNAME_CONTAINS,searchTerm));
		return list;
	}

	public IResultPanel getResultPanel(String searchCriteriaTechnicalName) {
		return new BasicResultPanel(getTechnicalName(),	searchCriteriaTechnicalName);
	}

	public IResultPanel getComplexResultPanel() {
		return new ComplexResultPanel(getTechnicalName());
	}

	public ISearchCriteria getCriteria(String technicalName, String searchTerm) {
		String title = MessageFormat.format(bundle.getString(technicalName + "_title"), new Object[] { searchTerm });
		String name = bundle.getString(technicalName + "_name");
		String description = MessageFormat.format(bundle.getString(technicalName + "_description"),
				new Object[] { searchTerm });

		return new SearchCriteria(technicalName, name, title, description);
	}

	public List<ISearchResult> query(String searchTerm,
			String criteriaTechnicalName, boolean searchInside, int startIndex,
			int resultCount) {
		if (searchTerm == null)
			throw new IllegalArgumentException("searchTerm == null");
		if (criteriaTechnicalName == null)
			throw new IllegalArgumentException("criteriaTechnicalName == null");

		List<ISearchResult> result = new Vector<ISearchResult>();

		String where = "";
		if (criteriaTechnicalName.equals(RuleSearchProvider.CRITERIA_DISPLAYNAME_CONTAINS)) {
			where = String.format("Name like '%%s%'", searchTerm);
		} else if (criteriaTechnicalName
				.equals(RuleSearchProvider.CRITERIA_EMAIL_CONTAINS)) {
			where = String.format("Name like '%%s%'", searchTerm);
		}
		List<X_AD_Rule> rules = new Query(Env.getCtx(), X_AD_Rule.Table_Name, where, null).list();
		for (X_AD_Rule rule:rules)
		{			
				SearchResult sr = new SearchResult(rule.getName(), rule.getName(), null);
				result.add(sr);
				// remember search result
				virtualFolder.add(rule);			
		}

		totalResultCount = result.size();

		return result;
	}

	public List<ISearchResult> query(List<ISearchRequest> list,	boolean matchAll, boolean searchInside, int startIndex,	int resultCount) {
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

	public int getTotalResultCount() {
		return totalResultCount;
	}

	public void showAllResults(IFrameMediator mediator, String searchTerm, String searchCriteriaTechnicalName) {

		// ensure that we are currently in the contact component
		IFrameMediator newMediator = null;
		try {
			newMediator = FrameManager.getInstance().switchView(mediator.getContainer(), "Addressbook");
		} catch (PluginLoadingFailedException e) {
			e.printStackTrace();
		}

		// update folder selection
		((RuleEditorFrameMediator) newMediator).getTree().setSelectedFolder(virtualFolder);
	}

	public ICriteriaRenderer getCriteriaRenderer(String criteriaTechnicalName) {
		ICriteriaRenderer r = null;
		if (criteriaTechnicalName.equals(RuleSearchProvider.CRITERIA_DISPLAYNAME_CONTAINS)) {
			r = new StringCriteriaRenderer(getCriteria(RuleSearchProvider.CRITERIA_DISPLAYNAME_CONTAINS, ""),
					this);
		} else if (criteriaTechnicalName.equals(RuleSearchProvider.CRITERIA_EMAIL_CONTAINS)) {
			r = new StringCriteriaRenderer(getCriteria(RuleSearchProvider.CRITERIA_EMAIL_CONTAINS, ""), this);
		}
		return r;
	}

	public ISearchCriteria getDefaultCriteria(String searchTerm) {
		return getCriteria(RuleSearchProvider.CRITERIA_EMAIL_CONTAINS, searchTerm);
	}

	public boolean hasSingleCriteriaSearchResult() {
		// doesn't support search inside yet
		return false;
	}

}
