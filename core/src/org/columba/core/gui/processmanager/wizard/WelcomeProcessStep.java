package org.columba.core.gui.processmanager.wizard;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import net.javaprog.ui.wizard.AbstractStep;

import org.columba.core.gui.base.MultiLineLabel;
import org.xendra.core.resourceloader.ResourceLoader;

public class WelcomeProcessStep extends AbstractStep {
	public WelcomeProcessStep() {
        super(ResourceLoader.getString("processwizard", "welcome"),
        		ResourceLoader.getString("processwizard", "welcome_description"));		
	}
    protected JComponent createComponent() {
        JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
        component.add(new MultiLineLabel(ResourceLoader.getString("processwizard", "welcome_text")));
        component.add(Box.createVerticalGlue());

        return component;
    }

    public void prepareRendering() {
    }	
}
