package org.xendra.efact.wizard;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_Product_Category;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.efact.util.ResourceLoader;


public class PriceTypeCodeModel extends AbstractTableModel {
	private String[] columns = new String[]
			{
			ResourceLoader.getString("dialog","machinewizard","name"),
			ResourceLoader.getString("dialog","machinewizard","pricetypecode")
			};
	public static final int
	NAME_COLUMN = 0,
	PRICETYPECODE = 1;
	private List<ProductPriceTypeCode> testList = new ArrayList<ProductPriceTypeCode>();
	public List<ProductPriceTypeCode> getProductPriceTypeCodeModel() {
		return testList;
	}
	public PriceTypeCodeModel() {
		List<X_M_Product_Category> categories = new Query(Env.getCtx(), X_M_Product_Category.Table_Name, "IsActive ='Y'", null)
					.list();
		for (X_M_Product_Category category:categories) {
			ProductPriceTypeCode ptc = new ProductPriceTypeCode();
			ptc.setM_Product_Category_ID(category.getM_Product_Category_ID());
			ptc.setProductPriceTypeCode(category.getPriceTypeCode());
			testList.add(ptc);
		}
	}
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}	
	@Override
	public int getColumnCount() {
		return columns.length;
	}
	@Override
	public int getRowCount() {
		return testList.size();
	}
	public String getColumnName(int col)
	{
		return columns[col];
	}    	
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		ProductPriceTypeCode script = (ProductPriceTypeCode) testList.get(rowIndex);
		switch (columnIndex) {
			case NAME_COLUMN:
				script.setM_Product_Category_ID((Integer) aValue);				
				break;
			case PRICETYPECODE:
				script.setProductPriceTypeCode((String) aValue);
				break;
			default:
				break;
		}
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		ProductPriceTypeCode script = (ProductPriceTypeCode) testList.get(rowIndex);
		switch (columnIndex) {
		case NAME_COLUMN:
			return script.getM_Product_Category_ID();			
		case PRICETYPECODE:
			return script.getProductPriceTypeCode();
		default:
			break;		
		}
		return null;
	}

	private void fireTableChangedEv()
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				fireTableDataChanged();
			}
		});
	}

	public void scriptsAdded(List scripts)
	{
		testList.addAll(scripts);
		fireTableChangedEv();
	}

	public void scriptsRemoved(List scripts)
	{
		testList.removeAll(scripts);
		fireTableChangedEv();
	}

	public void scriptsChanged(List scripts)
	{
		fireTableChangedEv();
	}
}
