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

import org.compiere.util.KeyNamePair;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import com.l2fprod.common.swing.renderer.DefaultCellRenderer;

public class OptionFormEditor extends AbstractPropertyEditor implements ActionListener {
	protected JTextField textfield;
	private JButton button;
	protected KeyNamePair vp;
	public OptionFormEditor() {
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel)editor).add("Center", textfield = new JTextField());
		((JPanel)editor).add("East", button = new FixedButton());
		textfield.setBorder(LookAndFeelTweaks.EMPTY_BORDER);
		button.addActionListener(this);
	}
	public Object getValue() {
		return vp;
	}
	public void setValue(Object value) {
		vp = (KeyNamePair) value;
		textfield.setText(vp.getName());
	}
	public static class CellRenderer extends DefaultCellRenderer implements TableCellRenderer
	{
		KeyNamePair vp = null; 
		public void setValue(Object value) {			
			vp = (KeyNamePair) value;
			setText(vp.getName());
		}
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
			setValue(value);			
			return this;
		}
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
	}		
}
