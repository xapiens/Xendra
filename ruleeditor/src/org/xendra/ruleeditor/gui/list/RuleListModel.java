package org.xendra.ruleeditor.gui.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import javax.swing.AbstractListModel;

import org.compiere.model.persistence.X_AD_Rule;

@SuppressWarnings("serial")
public class RuleListModel extends AbstractListModel {
	private List<X_AD_Rule> list;
	private String patternString = "";

	public RuleListModel() {
		super();
		list = new Vector<X_AD_Rule>();
	}
	@Override
	public Object getElementAt(int index) {
		return (X_AD_Rule) list.get(index);
	}
	@Override
	public int getSize() {
		return list.size();
	}
	public String getPatternString() {
		return patternString;
	}
	public void setPatternString(String s) throws Exception {
		patternString = s;
	}
	public void clear() {
		list.clear();
	}
	public void addElement(X_AD_Rule item) {
		list.add(item);
		int index = 	list.indexOf(item);
		sort();
		fireIntervalAdded(this, index, index);
	}
	public void setHeaderItemList(List<X_AD_Rule> l) {
		this.list = l;
		sort();
		fireContentsChanged(this, 0, list.size() - 1);
	}
	public X_AD_Rule get(int i) {
		return (X_AD_Rule) list.get(i);
	}
	public boolean addItem(X_AD_Rule header) {
		boolean result1 = false;
		String o = header.getName();
		if (o != null) {
			String item = o;
			item = item.toLowerCase();
			String pattern = getPatternString().toLowerCase();
			if (item.indexOf(pattern) != -1) {
				result1 = true;
			} else {
				result1 = false;
			}
		} else {
			result1 = false;
		}
		return result1;
	}

	public Object[] toArray() {
		return list.toArray();
	}
	public void remove(int index) {
		list.remove(index);
		fireIntervalRemoved(this, index, index);
	}
	public void removeElement(X_AD_Rule item) {
		int index = list.indexOf(item);
		remove(index);
	}
	class IBasicModelRuleComperator implements Comparator {
		public int compare(Object o1, Object o2) {
			X_AD_Rule item1 = (X_AD_Rule) o1;
			X_AD_Rule item2 = (X_AD_Rule) o2;
			if ((item1 == null) || (item2 == null)) {
				return 0;
			}
			return item1.getName().compareTo(item2.getName());
		}
		public boolean equals(Object obj) {
			if (obj instanceof IBasicModelRuleComperator)
				return true;
			return false;
		}
	}
	public void sort() {
		Collections.sort(list, new IBasicModelRuleComperator());
	}
}
