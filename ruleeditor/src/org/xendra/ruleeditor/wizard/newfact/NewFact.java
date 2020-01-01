package org.xendra.ruleeditor.wizard.newfact;

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

public class NewFact extends AbstractStep {
	protected DataModel data;
    protected JTextField factName;
    
    public NewFact(DataModel data) {
		super(ResourceLoader.getString("dialog", "newfactwizard", "identity"),
			  ResourceLoader.getString("dialog", "newfactwizard",   "identity_description"));
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
        factName = new JTextField();
        try {
            method = factName.getClass().getMethod("getText", null);
        } catch (NoSuchMethodException nsme) {}
        data.registerDataLookup(X_AD_Rule.COLUMNNAME_Name,new DefaultDataLookup(factName, method, null));        
		middlePanel.addTextField(factName);
		middlePanel.addEmptyExample();
		component.add(middlePanel);

		return component;
	}

	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub	
	}    
}
