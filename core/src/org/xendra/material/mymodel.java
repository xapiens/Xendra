package org.xendra.material;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class mymodel extends AbstractTableModel {
	private String[] columnnames = {"empty"};
	private Object[][] data = {{"empty"}};
			
	@Override
	public int getColumnCount() {
		return columnnames.length;			
	}
	@Override
	public int getRowCount() {
		return data.length;
	}
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
	@Override
	public Object getValueAt(int row, int col) {
		return data[row][col];
	}		
	public void setHeaders(List<String> newheaders)
	{	
		String[] columns = new String[newheaders.size ()];
		newheaders.toArray(columns);
		columnnames = columns;				
	}
	public void setdata(Object[][] newdata)
	{
		data = newdata;
	}
}