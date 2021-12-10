package org.xendra.controls;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import com.l2fprod.common.swing.renderer.DefaultCellRenderer;

public class TableEditor extends AbstractPropertyEditor implements ActionListener {
	protected JTextField textfield;
	private JButton button;
	private X_AD_Table table;
	public TableEditor() {
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel) editor).add("Center", textfield = new JTextField());
		((JPanel) editor).add("East", button = new FixedButton());
		textfield.setBorder(LookAndFeelTweaks.EMPTY_BORDER);
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String var = "";
		if (table != null)
			var = table.getIdentifier();
		pickTableDialog dlg = pickTableDialog.getInstance(var);
		X_AD_Table newtable = dlg.getTable();
		if (newtable != null) {
			X_AD_Table oldtable = table;
			String info = String.format("%s", newtable.getTableName());
			textfield.setText(info);
			table = newtable;
			firePropertyChange(oldtable, newtable);			
		}
	}
	
	public Object getValue() {
		String var = "";
		if (table != null)
		 var = table.getIdentifier();
		return var;
	}
	
	public void setValue(Object value) {
		String id = (String) value;
		if (id == null)
			id = "";
		if (id.length() > 0) {
			table = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
			.setParameters(id).first();
			if (table != null) {
				String info = String.format("%s", table.getTableName());
				textfield.setText(info);				
			}
		}
	}
	
	public static class CellRenderer extends DefaultCellRenderer implements TableCellRenderer {
		public void setValue(Object value) {
			String id = (String) value;
			if (id == null)
				id = "";
			if (id.length() > 0) {
				X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "Identifier = ?", null)
				.setParameters(id).first();
				if (table != null) {
					String info = String.format("%s", table.getTableName());
					setText(info);				
				}
			}			
		}
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {			
			setValue(value);
			return this;
		}		
	}
}
