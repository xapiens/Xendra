package org.columba.core.gui.processmanager;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.swing.CTextField;
import org.compiere.util.Env;
import org.xendra.controls.PickMachineDialog;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.renderer.DefaultCellRenderer;

public class MachineEditor extends AbstractPropertyEditor implements ActionListener {
	protected CTextField textfield;
	private JButton button;
	private X_A_Machine machine;
	public MachineEditor() {
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel)editor).add("Center", textfield = new CTextField());
		textfield.setReadWrite(false);
		((JPanel)editor).add("East", button = new FixedButton());
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PickMachineDialog dlg = new PickMachineDialog(machine);
		X_A_Machine newmachine = dlg.getMachine();
		if (newmachine != null) {
			X_A_Machine oldmachine = machine;
			machine = newmachine;
			firePropertyChange(oldmachine, newmachine);
		}

	}

	public Object getValue() {
		Integer A_Machine_ID = 0;
		if (machine != null)
			A_Machine_ID = machine.getA_Machine_ID();
		return A_Machine_ID;
	}

	public void setValue(Object value) {
		if (value != null) {
			X_A_Machine m = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters((Integer) value).first();
			if (m != null) {
				machine = m;
				textfield.setText(m.getName());
			}
		}
	}

	public static class CellRenderer extends DefaultCellRenderer implements TableCellRenderer {
		public void setValue(Object value) {
			if (value != null) {				
				X_A_Machine m = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
				.setParameters((Integer) value).first();
				if (m != null)
					setText(m.getName());
			}			
		}
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
			setValue(value);
			return this;
		}		
	}
}
