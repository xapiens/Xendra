package org.xendra.newclient.wizard;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.MultiLineLabel;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;

public class FinishStep extends AbstractStep {

    public FinishStep() {
        super(ResourceLoader.getString("dialog", "newclient", "finish"),
        	  ResourceLoader.getString("dialog", "newclient", "finish_description"));
        setCanFinish(true);
    }
    protected JComponent createComponent() {
        JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));

        MultiLineLabel label = new MultiLineLabel(ResourceLoader.getString(
                    "dialog", "newclient", "finish_text"));
        component.add(label);
        component.add(Box.createVerticalGlue());

        return component;
    }

    public void prepareRendering() {
    }
}
