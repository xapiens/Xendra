package org.xendra.mfe.wizard.newFields;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.common.FinishStep;
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.mfe.wizard.newField.NewField;
import org.xendra.mfe.wizard.newField.NewFieldCreator;
import org.xendra.model.AbstractFolder;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class NewFieldsWizardLauncher {
	private DataModel data;
	private AbstractFolder m_node;	
	public NewFieldsWizardLauncher(AbstractFolder node) {
		m_node = node;
	}	
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;
		steps = new Step[] { new NewFields(data),
				 			 new FinishStep() };
		
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewFieldsCreator(data, m_node));
		
		Window w = ActiveWindowTracker.findActiveWindow();

		Wizard wizard = new Wizard((Frame) null, model,
				ResourceLoader.getString("dialog", "newfieldwizard", "title"),
				ImageLoader.getIcon(IconKeys.PREFERENCES));
		
		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);				
		
	}
}
