package org.xendra.ruleeditor.wizard.newform;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.ruleeditor.util.ResourceLoader;
import org.xendra.ruleeditor.wizard.common.FinishStep;
import org.xendra.ruleeditor.wizard.newfact.NewFact;
import org.xendra.ruleeditor.wizard.newfact.NewFactCreator;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class NewFormWizardLauncher {
	private DataModel data;
	private Integer m_parentid;
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;

		steps = new Step[] { new WelcomeStep(),
							 new NewForm(data, m_parentid), 
							 new FinishStep() };
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewFormCreator(data, m_parentid));

		Window w = ActiveWindowTracker.findActiveWindow();

		Wizard wizard = new Wizard((Frame) null, model, 
				ResourceLoader.getString("dialog", "newformwizard", "title"), 
				ImageLoader.getIcon(IconKeys.PREFERENCES));

		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);		
	}
	public void setParentRuleid(Integer m_id) {
		m_parentid = m_id;		
	}	

}
