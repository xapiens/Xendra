package org.columba.core.search;

import org.columba.core.search.api.ISearchCriteria;

public class SearchCriteria implements ISearchCriteria {

	private String name;
	private String title;
	private String description;
	private String technicalName;
	
	public SearchCriteria(String technicalName, String name, String title, String description) {
		this.technicalName = technicalName;
		this.name = name;
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getTechnicalName() {
		return technicalName;
	}

	public String getName() {
		return name;
	}

}
