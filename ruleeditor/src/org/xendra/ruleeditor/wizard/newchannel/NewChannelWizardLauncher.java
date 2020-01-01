package org.xendra.ruleeditor.wizard.newchannel;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.ruleeditor.folder.AbstractFolder;
import org.xendra.ruleeditor.util.ResourceLoader;
import org.xendra.ruleeditor.wizard.common.FinishStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class NewChannelWizardLauncher {
	private DataModel data;
	private AbstractFolder parentfolder;
	public void launchWizard(AbstractFolder f) {
		parentfolder = f;
		data = new DataModel();
		Step[] steps;
		steps = new Step[] { new NewChannel(data), 
							 new FinishStep() };
		
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewChannelCreator(data, parentfolder));

		Window w = ActiveWindowTracker.findActiveWindow();

		Wizard wizard = new Wizard((Frame) null, model, 
				ResourceLoader.getString("dialog", "newchannelwizard", "title"), 
				ImageLoader.getIcon(IconKeys.PREFERENCES));

		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);				
	}
}
