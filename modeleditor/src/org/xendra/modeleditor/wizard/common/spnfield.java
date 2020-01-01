package org.xendra.modeleditor.wizard.common;

import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import org.xendra.modeleditor.util.ResourceLoader;

public class spnfield extends JSpinner {
	JLabel lblname = new JLabel();
	public spnfield(String name, int value, int min, int max) {
		setName(name);
		String text = ResourceLoader.getString("dialog", "newcolumn", name);
		lblname.setText(text);
		lblname.setLabelFor(this);
		setModel(new SpinnerNumberModel(value, min, max, 1));
	}
	public JLabel getLabel() {
		return lblname;
	}
}		
