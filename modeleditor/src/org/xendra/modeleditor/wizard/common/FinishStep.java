package org.xendra.modeleditor.wizard.common;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import net.javaprog.ui.wizard.AbstractStep;

import org.columba.core.gui.base.MultiLineLabel;
import org.xendra.modeleditor.util.ResourceLoader;


public class FinishStep extends AbstractStep {
    public FinishStep() {
        super(ResourceLoader.getString("dialog", "newrulewizard", "finish"),
        	  ResourceLoader.getString("dialog", "newrulewizard", "finish_description"));
        setCanFinish(true);
    }

    protected JComponent createComponent() {
        JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));

        MultiLineLabel label = new MultiLineLabel(ResourceLoader
        		.getString("dialog", "newrulewizard", "finish_text"));
        component.add(label);
        component.add(Box.createVerticalGlue());

        return component;
    }

    public void prepareRendering() {
    }
}
