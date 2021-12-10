package org.xendra.controls;

import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import org.compiere.apps.AEnv;
import org.compiere.apps.ProcessDialog;
import org.compiere.util.KeyNamePair;
import org.xendra.core.command.Environment;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import com.l2fprod.common.swing.renderer.DefaultCellRenderer;

public class ProcessRunNowEditor extends AbstractPropertyEditor {
	protected JTextField textfield;
	private JButton button;
	private KeyNamePair process;
	public ProcessRunNowEditor() {
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel)editor).add("Center", textfield = new JTextField());
		((JPanel)editor).add("East", button = new FixedButton());
		textfield.setBorder(LookAndFeelTweaks.EMPTY_BORDER);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcessDialog pd = new ProcessDialog ( process.getKey(), true);
				if (!pd.init())
					return;
				Environment.getWindowManager().add(pd);
				pd.getContentPane().invalidate();
				pd.getContentPane().validate();
				pd.pack();
				//	Center the window
				AEnv.showCenterScreen(pd);				
			}
		});
	}
	public Object getValue() {
		return process;
	}
	public void setValue(Object value) {
		process = (KeyNamePair) value;
		textfield.setText(process.getName());
	}
	public static class CellRenderer extends DefaultCellRenderer implements TableCellRenderer
	{
		KeyNamePair process;
		public void setValue(Object value) {
			process = (KeyNamePair) value;
			setText(process.getName());
		}
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
			setValue(value);
			return this;
		}
	}
}
