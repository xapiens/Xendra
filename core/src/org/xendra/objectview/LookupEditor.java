package org.xendra.objectview;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

import org.compiere.grid.ed.VLookup;
import org.compiere.model.MLookup;

public class LookupEditor extends AbstractCellEditor
implements TableCellEditor, ActionListener {

	VLookup look;
	public LookupEditor(String name, MLookup lookup) {
		look = new VLookup(name, true, false, true, lookup);    
		look.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		//
	}

	public Object getCellEditorValue() {
		return look.getValue();
	}

	public Component getTableCellEditorComponent(JTable table,
			Object value,
			boolean isSelected,
			int row,
			int column) {
		look.refresh();
		look.setValue(value);
		return look;
	}
}
