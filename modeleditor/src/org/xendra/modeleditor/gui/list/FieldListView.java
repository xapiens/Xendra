package org.xendra.modeleditor.gui.list;

import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JList;

import org.compiere.model.persistence.X_AD_Field;


public class FieldListView extends JList {
	private FieldListModel model;

	public FieldListView(FieldListModel model) {
		super(model);
		this.model = model;
		setCellRenderer(new FieldListRenderer());
		setBorder(BorderFactory.createEmptyBorder(2,2,2,2));		
	}
	public FieldListView() {
		super();
	}
	public void setHeaderItemList(List<X_AD_Field> list) {
		removeAll();
		model.setHeaderItemList(list);
	}
	public void setModel(FieldListModel model) {
		this.model = model;
	}
	public void addElement(X_AD_Field item) {
		model.addElement(item);
	}
	public X_AD_Field get(int index) {
		X_AD_Field item = (X_AD_Field) model.get(index);
		return item;
	}
}
