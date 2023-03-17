package org.xendra.mfe.gui.modeler;

import java.awt.Color;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import org.jdom.Element;

public class Section extends JTable implements DropTargetListener {
	Object[][] data;
	String[] colNames = new String[] { "A", "B", "C", "D"};
	
	public Section(Element e) {
		List<Element> items = new ArrayList<Element>();
		List list = e.getChildren();
		for (int i = 0; i < list.size(); i++) {
			Element item = (Element) list.get(i);
			if (item.getName() == "field")
				items.add(item);
		}
		Collections.sort(items, new Comparator<Element>() {
			@Override
			public int compare(Element one, Element two) {
				Integer iseq1 = 0;
				Integer iseq2 = 0;
				String seq1 = one.getAttributeValue("sequence");
				if (seq1 != null)
					iseq1 = Integer.valueOf(seq1);
				String seq2 = two.getAttributeValue("sequence");
				if (seq2 != null)
					iseq2 = Integer.valueOf(seq2);
				return iseq1.compareTo(iseq2);
			}
		});
		int i = 0;
		data = new Object[items.size()][4];
		for (Element item:items) {
			data[i][0] = false;
			data[i][1] = item.getAttributeValue("name");
			data[i][2] = item;
			data[i][3] = new Boolean(false);			
			i++;
		}
		setModel(createModel());
		setTableHeader(null);
		setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		setAutoscrolls(true);
		setGridColor(Color.WHITE);
		TableColumn column = getColumnModel().getColumn(0);
		column.setMaxWidth(20);
		column = getColumnModel().getColumn(2);
		column.setMaxWidth(12);
		column = getColumnModel().getColumn(3);
		column.setMaxWidth(12);
	}

	@Override
	public void dragEnter(DropTargetDragEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragExit(DropTargetEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragOver(DropTargetDragEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drop(DropTargetDropEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropActionChanged(DropTargetDragEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("serial")
	public TableModel createModel()
	{
		return new AbstractTableModel()
		{
			public int getColumnCount()
			{
				return colNames.length;
			}

			public int getRowCount()
			{
				return data.length;
			}

			public String getColumnName(int col)
			{
				return colNames[col];
			}

			public Object getValueAt(int row, int col)
			{
				return data[row][col];
			}

			public Class<? extends Object> getColumnClass(int c)
			{
				Object value = getValueAt(0, c);
				return (value != null) ? value.getClass() : ImageIcon.class;
			}

			/*
			 * Don't need to implement this method unless your table's
			 * editable.
			 */
			public boolean isCellEditable(int row, int col)
			{
				return col == 0;
			}

			/*
			 * Don't need to implement this method unless your table's data
			 * can change.
			 */
			public void setValueAt(Object value, int row, int col)
			{
				data[row][col] = value;
				fireTableCellUpdated(row, col);
			}
		};

	}
}
