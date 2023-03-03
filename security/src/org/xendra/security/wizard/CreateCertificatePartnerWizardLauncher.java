package org.xendra.security.wizard;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.common.FinishStep;
import org.xendra.security.util.ResourceLoader;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class CreateCertificatePartnerWizardLauncher {
	private DataModel data;
	public void launchWizard() {		
		data = new DataModel();
		Step[] steps;
		steps = new Step[] { new PickPartnerStep(data),
				 new PickKeyStoreStep(data),
				 new PickAliasStep(data),
				 new SendFilePathStep(data),
				 new FinishStep() };
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new BPartnerCertificateCreator(data));

		Window w = ActiveWindowTracker.findActiveWindow();

		Wizard wizard = new Wizard((Frame) null, model, 
				ResourceLoader.getString("dialog", "partnerwizard", "title"), 
				ImageLoader.getIcon(IconKeys.PREFERENCES));

		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);		
		
	}

}
