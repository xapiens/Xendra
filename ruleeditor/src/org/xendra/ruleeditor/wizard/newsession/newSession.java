package org.xendra.ruleeditor.wizard.newsession;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.xendra.Constants;
import org.xendra.ruleeditor.util.ResourceLoader;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class newSession extends AbstractStep {
	
	public newSession(DataModel data) {		
		super(ResourceLoader.getString("dialog", "newsessionwizard","identity"),
				ResourceLoader.getString("dialog", "newsessionwizard","identity_description"));
		this.data = data;
		setCanGoNext(true);
	}

	protected DataModel data;
	protected JTextField sessionName;
	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newsessionwizard","identify_text")));
		component.add(Box.createVerticalStrut(40));
		
		WizardTextField middlePanel = new WizardTextField();
		Method method = null;
		sessionName = new JTextField();
		try {
			method = sessionName.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(Constants.XML_ATTRIBUTE_SESSIONNAME, new DefaultDataLookup(sessionName, method, null));
		middlePanel.addTextField(sessionName);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		
		return component;		
	}


}
