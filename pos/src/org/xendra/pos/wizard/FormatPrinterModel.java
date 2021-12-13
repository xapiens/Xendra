package org.xendra.pos.wizard;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_POSDocType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.pos.util.ResourceLoader;

public class FormatPrinterModel extends AbstractTableModel {
	private String[] columns = new String[]
			{
			ResourceLoader.getString("dialog", "machinewizard", "doctype"),			
			ResourceLoader.getString("dialog", "machinewizard", "posformat"),
			ResourceLoader.getString("dialog", "machinewizard", "messageformat"),
			ResourceLoader.getString("dialog", "machinewizard", "posprinter"),			
			};
	public static final int
	NAME_COLUMN = 0,
	POSFORMAT = 1,
	MESSAGEFORMAT = 2,
	POSPRINTER = 3;	
	private List<DocTypePrintFormat> testList = new ArrayList<DocTypePrintFormat>();
	public List<DocTypePrintFormat> getDocTypePrintModel()  {
		return testList;
	}
	public FormatPrinterModel(ListModel pdtmodel, int C_POS_ID) {
		for (int i=0; i < pdtmodel.getSize(); i++) {
			DocTypePrintFormat dtp = new DocTypePrintFormat();
			KeyNamePair kp = (KeyNamePair) pdtmodel.getElementAt(i);
			X_C_POSDocType dt = new Query(Env.getCtx(), X_C_POSDocType.Table_Name, "C_DocType_ID = ? AND C_POS_ID = ?", null)
				.setParameters(kp.getKey(), C_POS_ID).first();			
			if (dt != null) {				
				dtp.setC_DocType_ID(dt.getC_DocType_ID());
				X_C_DocType doctype = new Query(Env.getCtx(), X_C_DocType.Table_Name, "C_DocType_ID = ?", null)
					.setParameters(dt.getC_DocType_ID()).first();
				if (doctype != null) {					
					dtp.setAD_MessageFormat_ID(doctype.getAD_MessageFormat_ID());
				}
				dtp.setPOSPrinterDocumentFormat_ID(dt.getC_PrinterDocumentFormat_ID());
				dtp.setPOSMachinePrinter_ID(dt.getA_MachinePrinter_ID());
				dtp.setSource(dt.getSource());
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
		DocTypePrintFormat script = (DocTypePrintFormat) testList.get(rowIndex);
		switch (columnIndex) {
			case NAME_COLUMN:
				script.setC_DocType_ID((Integer) aValue);
				break;
			case POSFORMAT:
				script.setPOSPrinterDocumentFormat_ID((Integer) aValue);
				break;
			case MESSAGEFORMAT:
				script.setAD_MessageFormat_ID((Integer) aValue);
				break;
			case POSPRINTER:
				script.setPOSMachinePrinter_ID((Integer) aValue);
				break;			
			default:
				break;
		}
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		DocTypePrintFormat script = (DocTypePrintFormat) testList.get(rowIndex);
		switch (columnIndex) {
		case NAME_COLUMN:
			return script.getC_DocType_ID();			
		case POSFORMAT:
			return script.getPOSPrinterDocumentFormat_ID();
		case MESSAGEFORMAT:
			return script.getAD_MessageFormat_ID();
		case POSPRINTER:
			return script.getPOSMachinePrinter_ID();
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
