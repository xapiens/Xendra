package org.xendra.ruleeditor.gui.list;

import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JList;

import org.compiere.model.persistence.X_AD_Rule;

public class RuleListView extends JList {
	private RuleListModel model;
	
	public RuleListView(RuleListModel model) {
		super(model);
		this.model = model;
		setCellRenderer(new RuleListRenderer());
		setBorder(BorderFactory.createEmptyBorder(2,2,2,2));		
	}
	public RuleListView() {
		super();
	}
	public void setHeaderItemList(List<X_AD_Rule> list) {
		removeAll();
		model.setHeaderItemList(list);
	}
	public void setModel(RuleListModel model) {
		this.model = model;
	}
	public void addElement(X_AD_Rule item) {
		model.addElement(item);
	}
	public X_AD_Rule get(int index) {
		X_AD_Rule item = (X_AD_Rule) model.get(index);
		return item;
	}
}
