package org.xendra.ruleeditor.wizard.newdecisiontable;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.persistence.X_AD_Rule;
import org.xendra.ruleeditor.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class DecisionTableNameStep extends AbstractStep {
	protected DataModel data;
	protected JTextField decisionTableName;
	public DecisionTableNameStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "newdecisiontwizard", "template"),
				ResourceLoader.getString("dialog", "newdecisiontwizard",   "template_description"));
		this.data = data;		
		setCanGoNext(true);    		
	}
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newfactwizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));		
		WizardTextField middlePanel = new WizardTextField();
		Method method = null;
		decisionTableName = new JTextField();
		try {
			method = decisionTableName.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_AD_Rule.COLUMNNAME_Name,new DefaultDataLookup(decisionTableName, method, null));        
		middlePanel.addTextField(decisionTableName);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;
	}
	public void prepareRendering() {
	}
}
