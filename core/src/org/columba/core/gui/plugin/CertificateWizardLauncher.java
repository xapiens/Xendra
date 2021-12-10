package org.columba.core.gui.plugin;

import java.awt.Frame;
import java.awt.Window;
import java.io.File;

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

public class CertificateWizardLauncher {
	private DataModel data;
	private File file;

	public CertificateWizardLauncher(File file) {
		this.file = file;
	}

	public void launchWizard() {
		if (data == null)
			data = new DataModel();
		Step[] steps = new Step[] { new PasswordCertificateStep(data),
				new FinishStep() };		
		WizardModel model = new DefaultWizardModel(steps);
		
		model.addWizardModelListener(new NewCertificateCreator(data, file));
		
		Window w = ActiveWindowTracker.findActiveWindow();
		Wizard wizard = null;
		try {
			wizard = new Wizard((Frame) null, model, ResourceLoader.getString("certificate", "title"), ImageLoader.getIcon(IconKeys.PREFERENCES));			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		wizard.setStepListRenderer(null);
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);						
	}
}
