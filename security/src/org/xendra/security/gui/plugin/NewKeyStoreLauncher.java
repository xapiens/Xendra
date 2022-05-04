package org.columba.core.gui.plugin.wizard;

import java.awt.Frame;
import java.awt.Window;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.common.FinishStep;
import org.xendra.newclient.i18n.ResourceLoader;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class NewKeyStoreLauncher {
	private DataModel data;
	public void launchWizard() {
		data = new DataModel();
		Step[] steps = new Step[] {
				new StoreStep(data),
				new PluginReposStep(data),
				new FinishStep() };
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new KeyStoreCreator(data));

		Window w = ActiveWindowTracker.findActiveWindow();
		Wizard wizard = null;
		try {
			wizard = new Wizard((Frame) null, model, ResourceLoader
					.getString("dialog", "newclient", "title"), ImageLoader.getIcon(IconKeys.PREFERENCES));			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		wizard.setStepListRenderer(null);
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);				
	}
}