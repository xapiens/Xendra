package org.xendra.ruleeditor.gui.propertysheet;

import java.util.ArrayList;
import java.util.List;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FilePropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.renderer.DefaultCellRenderer;
import com.l2fprod.common.util.ResourceManager;

public class DocBaseTypePropertyEditor extends AbstractPropertyEditor {
	private DefaultCellRenderer label;
	private JButton button;
	private List<DocBase> docbasetype = new ArrayList<DocBase>();

	public DocBaseTypePropertyEditor() {
		editor = new JPanel(new BorderLayout(0,0));
		((JPanel)editor).add("Center", label = new DefaultCellRenderer());
		label.setOpaque(false);
		((JPanel)editor).add("East", button = new FixedButton());
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectDocBaseType();
			}
		});
		((JPanel)editor).setOpaque(false);		
	} 
	public Object getValue() {
		return docbasetype;
	}

	public void setValue(Object value) {
		label.setValue(value);
		docbasetype = (List<DocBase>) value;
	}	

	protected void selectDocBaseType()
	{
		ResourceManager rm = ResourceManager.all(FilePropertyEditor.class);
		String title = rm.getString("ColorPropertyEditor.title");
		List<DocBase> newdocbasetype = JDocBaseTypeChooser.showDialog(editor, title, docbasetype);

		if (newdocbasetype != null) {
			List<DocBase> oldColor = docbasetype;
			List<DocBase> newColor = newdocbasetype;
			label.setValue(newColor);
			docbasetype = newdocbasetype;
			firePropertyChange(oldColor, newColor);
		}
	}
}
