package org.xendra.modeleditor.gui.propertysheet;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

import org.compiere.util.KeyNamePair;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import com.l2fprod.common.swing.renderer.DefaultCellRenderer;

public class ValRuleEditor extends AbstractPropertyEditor {
	protected JTextField textfield;
	private JButton button;
	private KeyNamePair ruleid;
	
	public ValRuleEditor() {
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel)editor).add("Center", textfield = new JTextField());
		((JPanel)editor).add("East", button = new FixedButton());
		textfield.setBorder(LookAndFeelTweaks.EMPTY_BORDER);    
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValRuleDialog dlg = new ValRuleDialog(ruleid);				
				dlg.setModal(true);
				dlg.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dlg.setVisible(true);
				if (dlg.getValRule() != null && dlg.getValRule().compareTo(ruleid) != 0) {
					KeyNamePair newruleid = dlg.getValRule();					
					ruleid = newruleid;
				}
			}
		});
	}
	public Object getValue() {
		return ruleid;
	}
	public void setValue(Object value) {
		ruleid = (KeyNamePair) value;
		if (ruleid != null)
		textfield.setText(ruleid.getName());
	}	
	public static class CellRenderer extends DefaultCellRenderer  implements TableCellRenderer
	{
		KeyNamePair ruleid;
	    public void setValue(Object value)
	    {
	    	if (value != null) {
	    		ruleid = (KeyNamePair) value;
	        	setText(ruleid.getName());
	    	} else {
	    		setText("");
	    	}
	    }
	    
	    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	    {
	        setValue(value);
	        return this;
	    }
	}	
}
