package org.columba.core.gui.processmanager.wizard;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.MProcess;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class SchedulerStep extends AbstractStep {
	private DataModel data;
	public SchedulerStep(DataModel data) {
		super(ResourceLoader.getString("processwizard", "scheduler"),
				ResourceLoader.getString("processwizard",  "scheduler_description"));
		this.data = data;
		setCanGoNext(true);		
	}		
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("processwizard", "scheduler_description")));
		component.add(Box.createVerticalStrut(40));
		
		WizardTextField middlePanel = new WizardTextField();
		Method method = null;
		
		LabelWithMnemonic typeLabel = new LabelWithMnemonic(ResourceLoader.getString("processwizard", "scheduler"));
		JCheckBox addScheduler = new JCheckBox();
		typeLabel.setLabelFor(addScheduler);
		try {
			method = addScheduler.getClass().getMethod("isSelected", null);						
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(X_AD_Scheduler.COLUMNNAME_AD_Scheduler_ID,new DefaultDataLookup(addScheduler, method, null));
		middlePanel.addLabel(typeLabel);
		middlePanel.addTextField(addScheduler);
		middlePanel.addEmptyExample();
		component.add(middlePanel);	
		return component;
	}
	public void prepareRendering() {
	}
}
