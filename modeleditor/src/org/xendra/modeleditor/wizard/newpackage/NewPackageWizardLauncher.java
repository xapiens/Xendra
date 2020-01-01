package org.xendra.modeleditor.wizard.newpackage;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.common.FinishStep;
import org.xendra.modeleditor.wizard.newplugin.NewPlugin;
import org.xendra.modeleditor.wizard.newplugin.NewPluginConfirm;
import org.xendra.modeleditor.wizard.newplugin.NewPluginCreator;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class NewPackageWizardLauncher {
	private DataModel data;	
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;
		steps = new Step[] { new NewPackage(data),
				 new NewPackageConfirm(data),
				 new FinishStep() };
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewPackageCreator(data));
		
		Window w = ActiveWindowTracker.findActiveWindow();
		
		Wizard wizard = new Wizard((Frame) null, model,
				ResourceLoader.getString("dialog", "newpackagewizard", "title"),
				ImageLoader.getIcon(IconKeys.PREFERENCES));
		
		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);		
	}
}
