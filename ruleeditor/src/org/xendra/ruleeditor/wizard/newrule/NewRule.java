package org.xendra.ruleeditor.wizard.newrule;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.persistence.X_AD_Rule;
import org.xendra.Constants;
import org.xendra.ruleeditor.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class NewRule extends AbstractStep {
	protected DataModel data;
    protected JTextField ruleName;    


	public NewRule(DataModel data) {
		super(ResourceLoader.getString("dialog", "newrulewizard", "identity"),
				ResourceLoader.getString("dialog", "newrulewizard",   "identity_description"));
		this.data = data;		
		setCanGoNext(true);
	}
	
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newrulewizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));		

		WizardTextField middlePanel = new WizardTextField();
		Method method = null;
        ruleName = new JTextField();
        try {
            method = ruleName.getClass().getMethod("getText", null);
        } catch (NoSuchMethodException nsme) {}
        data.registerDataLookup(X_AD_Rule.COLUMNNAME_Name,new DefaultDataLookup(ruleName, method, null));        
		middlePanel.addTextField(ruleName);
		middlePanel.addEmptyExample();
		component.add(middlePanel);

		return component;
	}

	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub	
	}

}
