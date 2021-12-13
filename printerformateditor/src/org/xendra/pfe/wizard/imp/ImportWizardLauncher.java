package org.xendra.pfe.wizard.imp;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.common.FinishStep;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.util.ResourceLoader;

public class ImportWizardLauncher {
	private DataModel data;
	private AbstractFolder m_node;
	public ImportWizardLauncher(AbstractFolder node) {
		m_node = node;
	}
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;
		steps = new Step[] { new ImportStep(data),
				 new FinishStep() };
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new ImportCreator(data, m_node));
		
		Window w = ActiveWindowTracker.findActiveWindow();
		
		Wizard wizard = new Wizard((Frame) null, model,
					ResourceLoader.getString("dialog","newfieldwizard", "title"),
					ImageLoader.getIcon(IconKeys.PREFERENCES));
		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);				
	}
}
