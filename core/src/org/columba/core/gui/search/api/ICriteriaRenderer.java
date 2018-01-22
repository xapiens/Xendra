package org.columba.core.gui.search.api;

import javax.swing.JComponent;
import javax.swing.JLabel;

import org.columba.core.search.api.ISearchCriteria;
import org.columba.core.search.api.ISearchProvider;

public interface ICriteriaRenderer {
	
	ISearchCriteria getCriteria();
	
	ISearchProvider getProvider();
	
	Object getValue();
	
	void clear();
	/**
	 * Returns ui component to edit the criteria value
	 * @return
	 */
	JComponent getEditor();
	
	JLabel getLabel();
}
