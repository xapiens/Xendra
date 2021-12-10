package org.columba.core.gui.plugin;


import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class InstalledRenderer extends DefaultTableCellRenderer {
	JCheckBox checkBox = new JCheckBox();
	public InstalledRenderer() {
        setHorizontalAlignment(SwingConstants.CENTER);
	}
	
    public Component getTableCellRendererComponent(JTable table, Object value,
    		boolean isSelected, boolean hasFocus, int row, int column) {

    	if (value instanceof PluginNode) {
    		PluginNode node = (PluginNode) value;
    		if (node.isCategory()) {
    			return super.getTableCellRendererComponent(table, "", isSelected,
    					hasFocus, row, column);
    		} else {
    			boolean b = node.isInstalled();
    			
    			checkBox.setSelected(b);
    			checkBox.setHorizontalAlignment(JLabel.CENTER);

    			if (isSelected) {
    				checkBox.setBackground(table.getSelectionBackground());
    			} else {
    				checkBox.setBackground(table.getBackground());
    			}
    			return checkBox;
    		}    		
    	} else {
    		return this;
    	}
    }
}