package org.xendra.mfe.wizard.newField;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.jdom.Element;
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.model.AbstractFolder;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class NewField extends AbstractStep {
	private DataModel m_data;
	protected AbstractFolder m_node;
	protected JTextField nameTextField;
	public NewField(DataModel data,AbstractFolder node) {
		super(ResourceLoader.getString("dialog", "newfieldwizard", "identity"),
				ResourceLoader.getString("dialog", "newfieldwizard",   "identity_description"));
		m_data = data;		
		m_node = node;
		setCanGoNext(true);		
	}
	
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newfieldwizard", "name_text")));
		component.add(Box.createVerticalStrut(40));	
		WizardTextField middlePanel = new WizardTextField();
		nameTextField = new JTextField();
		LabelWithMnemonic newfieldLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newfieldwizard", "name"));
		Method method = null;
		try {
			method = nameTextField.getClass().getMethod("getText", null);			
		} catch (NoSuchMethodException nsme) {}
		m_data.registerDataLookup("name.field", new DefaultDataLookup(nameTextField, method, null));
		nameTextField.getDocument().addDocumentListener(fieldListener);
		newfieldLabel.setLabelFor(nameTextField);
		middlePanel.addTextField(nameTextField);
		component.add(middlePanel);
		return component;
	}
	
	public void prepareRendering() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				nameTextField.requestFocus();
			}
		});
	}
	DocumentListener fieldListener = new DocumentListener() {
		public void removeUpdate(DocumentEvent e) {
			checkFields();
		}
		public void insertUpdate(DocumentEvent e) {
			checkFields();
		}
		protected void checkFields() {
			Boolean goahead = true;
			String name = nameTextField.getText();
			if (name == null)
				name = "";
			if (name.length() > 0)  {
				int c = m_node.getChildCount();
				for (int i = 0; i < c; i++ ) {
					AbstractFolder child = (AbstractFolder) m_node.getChildAt(i);
					Element ce = child.getNode();
					if (ce.getName().equals("field")) {
						String sectionname = ce.getAttributeValue("name");
						if (sectionname.equals(name)) {
							goahead = false;
							break;
						}					
					}					
				}
			} else {
				goahead = false;
			}		
			setCanGoNext(goahead);
		}
		public void changedUpdate(DocumentEvent e) {				
		}
	};	
}