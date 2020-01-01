package org.xendra.ruleeditor.wizard.newform;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.MultiLineLabel;
import org.xendra.ruleeditor.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;

class WelcomeStep extends AbstractStep {
    public WelcomeStep() {
        super(ResourceLoader.getString("dialog", "newformwizard", "welcome"),
        		ResourceLoader.getString("dialog", "newformwizard","welcome_description"));
    }

    protected JComponent createComponent() {
        JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
        component.add(new MultiLineLabel(ResourceLoader.getString(
                    "dialog", "newformwizard", "welcome_text")));
        component.add(Box.createVerticalGlue());

        return component;
    }

    public void prepareRendering() {
    }
}
