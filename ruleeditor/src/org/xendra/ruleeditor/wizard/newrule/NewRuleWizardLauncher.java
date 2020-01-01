package org.xendra.ruleeditor.wizard.newrule;

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

public class NewRuleWizardLauncher {
	private DataModel data;
	private Integer m_parentid;
	
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;

		steps = new Step[] { new NewRule(data), 
							 new FinishStep() };					

		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewRuleCreator(data, m_parentid));

		Window w = ActiveWindowTracker.findActiveWindow();

		Wizard wizard = new Wizard((Frame) null, model, 
				ResourceLoader.getString("dialog", "newrulewizard", "title"), 
				ImageLoader.getIcon(IconKeys.PREFERENCES));

		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);
	}

	public DataModel getDataModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setParentRuleid(Integer m_id) {
		m_parentid = m_id;		
	}

}
