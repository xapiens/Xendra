package org.xendra.rules.wizard;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.gui.statusbar.ProcessManagerDialog;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class ProcessWizardLauncher {
	private DataModel data;
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;

		steps = new Step[] { new ProcessTypeStep(data),
							 new ProcessMachine(data) };

		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new ProcessCreator(data));

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
	public DataModel getDataModel() {
		return data;
	}
}
