package org.xendra.modeleditor.gui.propertysheet;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import com.l2fprod.common.swing.renderer.DefaultCellRenderer;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.TransferHandler;
import javax.swing.table.TableCellRenderer;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;

/**
 * FilePropertyEditor. <br>
 *  
 */
public class ColumnDeveloperEditor extends AbstractPropertyEditor {

	protected JTextField textfield;
	private JButton button;
	private Integer column_id;

	public ColumnDeveloperEditor() {
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel)editor).add("Center", textfield = new JTextField());
		((JPanel)editor).add("East", button = new FixedButton());
		textfield.setBorder(LookAndFeelTweaks.EMPTY_BORDER);    
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableDeveloperDialog dlg = new TableDeveloperDialog(column_id);    	  
			}
		});
	}

	public Object getValue() {
		return column_id;
	}

	public void setValue(Object value) {
		column_id = (Integer) value;
		X_AD_Column column = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Column_ID = ?", null)
		.setParameters(column_id).first();		
		String clazz = String.format("%s %s",column.getClass().getPackage(),column.getColumnName());        
		textfield.setText(clazz);
	}

	public static class CellRenderer extends DefaultCellRenderer
	  implements TableCellRenderer
	{
		Integer column_id;
	    public void setValue(Object value)
	    {
    		column_id = (Integer) value;
    		X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Column_ID = ?", null)
    		.setParameters(column_id).first();
    		String clazz = String.format("%s %s",column.getClass().getPackage(),column.getColumnName());
    		setText(clazz);
	    }
	    
	    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	    {
	        setValue(value);
	        return this;
	    }
	}
}