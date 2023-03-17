package org.xendra.mfe.wizard.newProcess;

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
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.model.AbstractFolder;

public class NewProcessWizardLauncher {
	private DataModel data;
	private AbstractFolder m_node;
	public NewProcessWizardLauncher(AbstractFolder node) {
		m_node = node;
	}
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;
		steps = new Step[] { new NewProcess(data, m_node),
							 new FinishStep() };
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewProcessCreator(data, m_node));
		
		Window w = ActiveWindowTracker.findActiveWindow();
		
		Wizard wizard = new Wizard((Frame) null, model,
				ResourceLoader.getString("dialog","newprocesswizard", "title"),
				ImageLoader.getIcon(IconKeys.PREFERENCES));
		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);										
	}
	public DataModel getData() {
		return data;
	}
}
