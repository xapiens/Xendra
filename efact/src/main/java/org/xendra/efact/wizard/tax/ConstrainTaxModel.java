package org.xendra.efact.wizard.tax;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.efact.util.ResourceLoader;

public class ConstrainTaxModel extends AbstractTableModel {
	private String[] columns = new String[]
			{
			ResourceLoader.getString("dialog", "machinewizard", "doctype"),			
			ResourceLoader.getString("dialog", "machinewizard", "typecode"),
			ResourceLoader.getString("dialog", "machinewizard", "ID"),
			ResourceLoader.getString("dialog", "machinewizard", "ECE5153"),
			ResourceLoader.getString("dialog", "machinewizard", "ECE5305"),
			};
	public static final int
	NAME_COLUMN = 0,
	TYPECODE = 1,
	TAXID = 2,
	ECE5153 = 3,
	ECE5305 = 4;	
	
	private List<ConstrainTax> testList = new ArrayList<ConstrainTax>();
	public List<ConstrainTax> getConstrainTaxModel()  {
		return testList;
	}
	public ConstrainTaxModel(ListModel pdtmodel) {
		for (int i=0; i < pdtmodel.getSize(); i++) {
			ConstrainTax dtp = new ConstrainTax();
			KeyNamePair kp = (KeyNamePair) pdtmodel.getElementAt(i);			
			X_C_Tax dt = new Query(Env.getCtx(), X_C_Tax.Table_Name, "C_Tax_ID = ?", null)
				.setParameters(kp.getKey()).first();			
			if (dt != null) {				
				dtp.setC_Tax_ID(dt.getC_Tax_ID());
				dtp.setTaxTypeCode(dt.getTaxTypeCode());
				dtp.setTaxID(dt.getTaxID());
				dtp.setECE_5153(dt.getECE_5153());
				dtp.setECE_5305(dt.getECE_5305());
			} else {
				dtp.setC_Tax_ID(kp.getKey());
			}
			testList.add(dtp);
			
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
		ConstrainTax script = (ConstrainTax) testList.get(rowIndex);
		switch (columnIndex) {
			case NAME_COLUMN:
				script.setC_Tax_ID((Integer) aValue);
				break;
			case TYPECODE:				
				script.setTaxTypeCode((String) aValue);
				break;
			case TAXID:
				script.setTaxID((String) aValue);
			case ECE5153:
				script.setECE_5153((String) aValue);
			case ECE5305:
				script.setECE_5305((String) aValue);
			default:
				break;
		}
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		ConstrainTax script = (ConstrainTax) testList.get(rowIndex);
		switch (columnIndex) {
		case NAME_COLUMN:
			return script.getC_Tax_ID();			
		case TYPECODE:
			return script.getTaxTypeCode();
		case TAXID:
			return script.getTaxID();
		case ECE5153:
			return script.getECE_5153();
		case ECE5305:
			return script.getECE_5305();
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