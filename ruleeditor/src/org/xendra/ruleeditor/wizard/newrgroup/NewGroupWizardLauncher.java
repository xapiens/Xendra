package org.xendra.ruleeditor.wizard.newrgroup;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.ruleeditor.util.ResourceLoader;
import org.xendra.ruleeditor.wizard.common.FinishStep;
import org.xendra.ruleeditor.wizard.newsession.NewSessionCreator;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class NewGroupWizardLauncher {
	private DataModel data;
	
	public void launchWizard(Integer AD_Plugin_ID) {
		data = new DataModel();
		Step[] steps;
		
		steps = new Step[] { new newGroup(data),				 						
				 new FinishStep() };
		
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewGroupCreator(AD_Plugin_ID, data));
		
		Window w = ActiveWindowTracker.findActiveWindow();
		
		Wizard wizard = new Wizard((Frame) null, model,
				ResourceLoader.getString("dialog", "newgroupwizard", "title"),
				ImageLoader.getIcon(IconKeys.PREFERENCES));
		
		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);		
	}

}
