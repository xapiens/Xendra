package org.xendra.efact.wizard.documenttax;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.efact.util.ResourceLoader;

public class DocumentTaxModel extends AbstractTableModel {
	private String[] columns = new String[]
			{
			ResourceLoader.getString("dialog", "machinewizard", "doctype"),			
			ResourceLoader.getString("dialog", "machinewizard", "documenttax"),
			};
	public static final int
	NAME_COLUMN = 0,
	DOCUMENTTAX = 1;
	private List<DocTypeDocumentTax> testList = new ArrayList<DocTypeDocumentTax>();
	public List<DocTypeDocumentTax> getDocucmentTaxModel()  {
		return testList;
	}
	public DocumentTaxModel(ListModel pdtmodel) {
		for (int i=0; i < pdtmodel.getSize(); i++) {
			DocTypeDocumentTax dtp = new DocTypeDocumentTax();
			KeyNamePair kp = (KeyNamePair) pdtmodel.getElementAt(i);
			X_C_DocType dt = new Query(Env.getCtx(), X_C_DocType.Table_Name, "C_DocType_ID = ?", null)
				.setParameters(kp.getKey()).first();			
			if (dt != null) {				
				dtp.setC_DocType_ID(dt.getC_DocType_ID());
				X_C_DocType doctype = new Query(Env.getCtx(), X_C_DocType.Table_Name, "C_DocType_ID = ?", null)
					.setParameters(dt.getC_DocType_ID()).first();
				if (doctype != null) {					
					dtp.setC_DocumentTax_ID(doctype.getC_DocumentTax_ID());
				}
			} else {
				dtp.setC_DocType_ID(kp.getKey());
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
		DocTypeDocumentTax script = (DocTypeDocumentTax) testList.get(rowIndex);
		switch (columnIndex) {
			case NAME_COLUMN:
				script.setC_DocType_ID((Integer) aValue);
				break;
			case DOCUMENTTAX:				
				script.setC_DocumentTax_ID((Integer) aValue);
				break;
			default:
				break;
		}
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		DocTypeDocumentTax script = (DocTypeDocumentTax) testList.get(rowIndex);
		switch (columnIndex) {
		case NAME_COLUMN:
			return script.getC_DocType_ID();			
		case DOCUMENTTAX:
			return script.getC_DocumentTax_ID();
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