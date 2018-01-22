package org.columba.core.gui.search;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.columba.core.gui.search.api.ICriteriaRenderer;
import org.columba.core.search.api.ISearchCriteria;
import org.columba.core.search.api.ISearchProvider;

public class StringCriteriaRenderer implements ICriteriaRenderer {

	private JTextField textField;

	private ISearchCriteria criteria;

	private JLabel label;

	private ISearchProvider provider;

	public StringCriteriaRenderer(ISearchCriteria criteria,
			ISearchProvider provider) {
		this.criteria = criteria;
		this.provider = provider;
		label = new JLabel(criteria.getName() + ":");
		textField = new JTextField(15);
		label.setLabelFor(textField);
	}

	public JComponent getEditor() {
		return textField;
	}

	public ISearchCriteria getCriteria() {
		return criteria;
	}

	public Object getValue() {
		String s = textField.getText();
		if ( s.length() > 0 ) return s;
		
		return null;
	}

	public JLabel getLabel() {
		return label;
	}

	public ISearchProvider getProvider() {
		return provider;
	}

	public void clear() {
		textField.setText("");
	}

}
