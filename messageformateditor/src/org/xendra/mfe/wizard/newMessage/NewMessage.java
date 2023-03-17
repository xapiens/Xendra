package org.xendra.mfe.wizard.newMessage;

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
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.model.AbstractFolder;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class NewMessage  extends AbstractStep {
	private DataModel data;
	protected AbstractFolder m_node;
	protected JTextField nameTextField;
	public NewMessage(DataModel data,AbstractFolder node) {
		super(ResourceLoader.getString("dialog", "newmessagewizard", "identity"),
				ResourceLoader.getString("dialog", "newmessagewizard",   "identity_description"));
		this.data = data;		
		m_node = node;
		setCanGoNext(true);		
	}	
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newmessagewizard", "name_text")));
		component.add(Box.createVerticalStrut(40));		
		WizardTextField middlePanel = new WizardTextField();
		nameTextField = new JTextField();
		LabelWithMnemonic cashbookLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newmessagewizard", "name"));
		Method method = null;
		try {
			method = nameTextField.getClass().getMethod("getText", null);			
		} catch (NoSuchMethodException nsme) {}
		DocumentListener fieldListener = new DocumentListener() {
			public void removeUpdate(DocumentEvent e) {
				checkFields();
			}
			public void insertUpdate(DocumentEvent e) {
				checkFields();
			}
			protected void checkFields() {
				setCanGoNext((nameTextField.getDocument().getLength() > 0));
			}
			public void changedUpdate(DocumentEvent e) {				
			}
		};
		data.registerDataLookup("name.message", new DefaultDataLookup(nameTextField, method, null));
		nameTextField.getDocument().addDocumentListener(fieldListener);
		cashbookLabel.setLabelFor(nameTextField);
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
}
