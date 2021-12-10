package org.columba.core.gui.processmanager.wizard;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.common.FinishStep;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class ProcessWizardLauncher {
	private DataModel data;
	public void launchWizard(int A_Machine_ID) {
		data = new DataModel();
		Step[] steps;
		steps = new Step[] { new WelcomeProcessStep(),
							 new ProcessStep(data),
							 new SchedulerStep(data),
							 new FinishStep()};
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new ProcessCreator(A_Machine_ID, data));
		
		Window w = ActiveWindowTracker.findActiveWindow();
		
		Wizard wizard = new Wizard((Frame) null, model, ResourceLoader
				.getString("global", "processwizardtitle"), ImageLoader
				.getIcon(IconKeys.PREFERENCES));

		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);
		
	}
	
}
