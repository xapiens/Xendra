package org.columba.core.gui.plugin;

import java.awt.Component;
import java.util.EventObject;

import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;

public class InstalledEditor extends AbstractCellEditor implements TableCellEditor {
	protected JCheckBox component = new JCheckBox();
	protected PluginNode currentNode;
	
	public InstalledEditor() {
		component.setHorizontalAlignment(SwingConstants.CENTER);
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value,
	        boolean isSelected, int rowIndex, int vColIndex) {
	        currentNode = (PluginNode) value;
	        // Configure the component with the specified value
	        ((JCheckBox) component).setSelected(currentNode.isInstalled());
	        if (isSelected) {
	            ((JCheckBox) component).setBackground(table.getSelectionBackground());
	        } else {
	            ((JCheckBox) component).setBackground(table.getBackground());
	        }
	        // Return the configured component
	        return component;
	}

	@Override
	public Object getCellEditorValue() {
		Boolean b = Boolean.valueOf(((JCheckBox) component).isSelected());
        // enable/disable tree node
        currentNode.setInstalled(b.booleanValue());
        return b;
	}

    public Component getComponent() {
        return component;
    }

}
