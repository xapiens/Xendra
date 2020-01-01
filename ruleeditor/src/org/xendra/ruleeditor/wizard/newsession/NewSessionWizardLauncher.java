package org.xendra.ruleeditor.wizard.newsession;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.ruleeditor.util.ResourceLoader;
import org.xendra.ruleeditor.wizard.common.FinishStep;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class NewSessionWizardLauncher {
	private DataModel data;
	
	public void launchWizard(Integer id) {
		data = new DataModel();
		Step[] steps;
		
		steps = new Step[] { new newSession(data),
							 new SessionProperties(data),							 
							 new FinishStep() };
		
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewSessionCreator(id, data));
		
		Window w = ActiveWindowTracker.findActiveWindow();
		
		Wizard wizard = new Wizard((Frame) null, model,
				ResourceLoader.getString("dialog", "newsessionwizard", "title"),
				ImageLoader.getIcon(IconKeys.PREFERENCES));
		
		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);
	}	
}
