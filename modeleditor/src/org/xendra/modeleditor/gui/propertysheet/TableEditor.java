package org.xendra.modeleditor.gui.propertysheet;

import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.api.gui.frame.IFrameMediator;
import org.compiere.util.KeyNamePair;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.LookAndFeelTweaks;

public class TableEditor extends AbstractPropertyEditor {
	protected JTextField textfield;
	private JButton button;
	private TablePick table_id;
	private IFrameMediator frameMediator;
	public void setFrame(IFrameMediator frame) {
		frameMediator = frame;
	}
	public TableEditor()  {
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel)editor).add("Center", textfield = new JTextField());
		((JPanel)editor).add("East", button = new FixedButton());
		textfield.setBorder(LookAndFeelTweaks.EMPTY_BORDER);    
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table_id.pick();
			}
		});		
	}
	public Object getValue() {
		return table_id;
	}

	public void setValue(Object value) {
		if (value != null) {
			table_id = (TablePick) value;
			textfield.setText(table_id.getName());
		}
	}	
}
