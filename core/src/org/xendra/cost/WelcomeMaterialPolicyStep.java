package org.xendra.cost;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.MultiLineLabel;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;

public class WelcomeMaterialPolicyStep extends AbstractStep {
    public WelcomeMaterialPolicyStep() {    	
        super(ResourceLoader.getString("materialpolicywizard", "welcome"),
        		ResourceLoader.getString("materialpolicywizard", "welcome_description"));
    }	
    protected JComponent createComponent() {
        JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
        component.add(new MultiLineLabel(ResourceLoader.getString("materialpolicywizard", "welcome_text")));
        component.add(Box.createVerticalGlue());

        return component;
    }
    public void prepareRendering() {
    }
}
