package org.xendra.cost;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.common.FinishStep;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class MaterialPolicyWizardLauncher {
	private DataModel data;
	public void launchWizard(String name, int M_MaterialProcessor_ID) {
		data = new DataModel();
		Step[] steps;
		steps = new Step[] { new WelcomeMaterialPolicyStep(), 
							 new PolicyNameStep(M_MaterialProcessor_ID, data),
							 new PolicyClientStep(data),
							 new PolicyTablesStep(data),
							 new PolicyDocTypeInOutStep(data),
							 new PolicyDocTypeInOutCostStep(data),
							 new PolicyDocTypeAdjustStep(data),
							 new PolicySequence(data),
							 new PolicyStartStep(data),
							 new PolicyProcess(data),
							 new PolicyCostElementStep(data),
							 new FinishStep()};
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new MaterialPolicyCreator(data));
		
		Window w = ActiveWindowTracker.findActiveWindow();
		
		Wizard wizard = new Wizard((Frame) null, model, ResourceLoader
				.getString("global", "processwizardtitle"), ImageLoader
				.getIcon(IconKeys.PREFERENCES));

		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);
	}
}
