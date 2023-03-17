package org.xendra.mfe.wizard.newSection;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.common.FinishStep;
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.model.AbstractFolder;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class NewSectionWizardLauncher {
	private DataModel data;
	private AbstractFolder m_node;
	public NewSectionWizardLauncher(AbstractFolder node) {
		m_node = node;
	}
	
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;
		
		steps = new Step[] { new NewSection(data, m_node),
							 new FinishStep() };
		
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewSectionCreator(data, m_node));
		
		Window w = ActiveWindowTracker.findActiveWindow();
		
		Wizard wizard = new Wizard((Frame) null, model,
				ResourceLoader.getString("dialog", "newsectionwizard", "title"),
				ImageLoader.getIcon(IconKeys.PREFERENCES));		
		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);		
	}
}
