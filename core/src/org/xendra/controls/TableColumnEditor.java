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

public class TableColumnEditor extends AbstractPropertyEditor implements ActionListener {
	protected JTextField textfield;
	private JButton button;
	private X_AD_Column column;
	public TableColumnEditor() {
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel)editor).add("Center", textfield = new JTextField());
		((JPanel)editor).add("East", button = new FixedButton());
		textfield.setBorder(LookAndFeelTweaks.EMPTY_BORDER);
		button.addActionListener(this);
	} 	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String var = "";
		if (column != null)
			 var =column.getIdentifier();
		pickTableColumnDialog dlg = pickTableColumnDialog.getInstance(var); 
		X_AD_Column newcolumn = dlg.getColumn();
		if (newcolumn != null) {
			X_AD_Column oldcolumn = column;
			X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
			.setParameters(newcolumn.getAD_Table_ID()).first();
			String info = String.format("%s-%s", table.getTableName(), newcolumn.getColumnName());
			textfield.setText(info);
			column = newcolumn;
			firePropertyChange(oldcolumn, newcolumn);
		}
	}

	public Object getValue() {
		String var = "";
		if (column != null)
		 var =column.getIdentifier();
		return var;
	}
	
	public void setValue(Object value) {
		String id = (String) value;
		if (id == null)
			id = "";
		if (id.length() > 0) {
			column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
			.setParameters(id).first();
			if (column != null) {
				X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
				.setParameters(column.getAD_Table_ID()).first();
				String info = String.format("%s-%s", table.getTableName(), column.getColumnName());
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
				X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
				.setParameters(id).first();
				if (column != null) {
					X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
					.setParameters(column.getAD_Table_ID()).first();
					String info = String.format("%s-%s", table.getTableName(), column.getColumnName());
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
