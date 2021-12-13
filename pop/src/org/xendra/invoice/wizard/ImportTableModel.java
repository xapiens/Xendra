package org.xendra.invoice.wizard;

import java.math.BigDecimal;
import java.util.LinkedList;

import javax.swing.table.*;
import javax.swing.event.*;

import org.compiere.model.MOrderLine;
import org.compiere.model.persistence.X_C_UOM;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.util.Env;
import org.compiere.util.Msg;

public class ImportTableModel extends AbstractTableModel {
	String headers[] = { Msg.getElement(Env.getCtx(), X_M_Product.COLUMNNAME_M_Product_ID),
					     Msg.getElement(Env.getCtx(), MOrderLine.COLUMNNAME_QtyEntered),
						 Msg.getElement(Env.getCtx(), X_C_UOM.COLUMNNAME_C_UOM_ID),						 
						 Msg.getElement(Env.getCtx(), X_M_Product.COLUMNNAME_Description)};
	public int getColumnCount() {
		return headers.length;
	}
	public int getRowCount() {
		return datos.size();			
	}
	public String getColumnName(int col) {
		return headers[col];
	}
	public boolean isCellEditable(int row, int col) {
		return true;
	}
	public Object getValueAt(int row, int col) {
		InvoiceLine line = (InvoiceLine) datos.get(row);
		switch (col) {
		case 0:
				return line.getM_Product_ID();
		case 1:
				return line.getQty();
		case 2:
				return line.getC_UOM_ID();
		case 3:
				return line.getDescription();
		}
		return null;
	}
	public void setValueAt(Object value, int row, int col) {
		InvoiceLine line = (InvoiceLine) datos.get(row);
		switch (col) {
		case 0:
			line.setM_Product_ID((Integer) value);
			break;
		case 1:
			line.setQty((BigDecimal) value);
			break;
		case 2:
			line.setC_UOM_ID((Integer)value);
			break;
		case 3:
			line.setDescription((String) value);
			break;
		}
		TableModelEvent event = new TableModelEvent(this, row, row, col);
		warningsubscribers(event);
	}
    public void addTableModelListener(TableModelListener l) {
        // Añade el suscriptor a la lista de suscriptores
        listeners.add (l);
    }   
	private void warningsubscribers(TableModelEvent evento) 
	{
		int i;
        for (i=0; i<listeners.size(); i++) {
            ((TableModelListener)listeners.get(i)).tableChanged(evento);
        }
    }
	public void addInvoiceLine(InvoiceLine il) {
		datos.add(il);		
		TableModelEvent event;
		event = new TableModelEvent(this, this.getRowCount()-1, 
					this.getRowCount()-1, TableModelEvent.ALL_COLUMNS, 
					TableModelEvent.INSERT);
		warningsubscribers(event);
	}
	private LinkedList datos = new LinkedList();
    private LinkedList listeners = new LinkedList(); 
}
