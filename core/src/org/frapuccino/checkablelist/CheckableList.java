//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the 
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.

package org.frapuccino.checkablelist;

import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import org.frapuccino.common.DefaultBooleanRenderer;
import org.frapuccino.common.DefaultStringRenderer;

/**
 * 
 * 
 * @author fdietz
 */
public class CheckableList extends JTable {

	//private CheckableItemListTableModel model;

	public CheckableList() {
		super();

		//		do not show header
		setTableHeader(null);

		//		no grid lines
		setShowGrid(false);

		setIntercellSpacing(new Dimension(0, 0));

		// fill with default data

		CheckableItemListTableModel model = new CheckableItemListTableModel();
		model.addElement(new CheckableItemImpl("default data 1", true));
		model.addElement(new CheckableItemImpl("default data 2", false));
		model.addElement(new CheckableItemImpl("default data 3", true));

		super.setModel(model);

		setDefaultRenderer(Boolean.class, new DefaultBooleanRenderer());
		setDefaultEditor(Boolean.class, new CheckableListEditor());

		setDefaultRenderer(String.class, new DefaultStringRenderer());

	}

	public void setOptionsCellRenderer(TableCellRenderer renderer) {
		
		setDefaultRenderer(String.class, renderer);

	}

	private void initColumns() {
		DefaultTableColumnModel model = new DefaultTableColumnModel();

		TableColumn tc = new TableColumn(0);
		tc.setIdentifier("Boolean");
		tc.setMaxWidth(20);

		model.addColumn(tc);

		tc = new TableColumn(1);
		tc.setIdentifier("String");
		model.addColumn(tc);

		setColumnModel(model);
		
		setIntercellSpacing(new Dimension(0, 0));

	}

	/**
	 * @see javax.swing.JTable#setModel(javax.swing.table.TableModel)
	 */

	public void setModel(TableModel model) {

		super.setModel(model);

		initColumns();
	}

	public CheckableItem getSelected() {
		int row = getSelectedRow();

		return ((CheckableItemListTableModel) getModel()).getElement(row);
	}

}