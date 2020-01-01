package org.xendra.modeleditor.wizard.newtable;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.common.FinishStep;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class NewTableWizardLauncher {
	private DataModel data;
	private Integer m_AD_Plugin_ID;
	private String m_ID;
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;
		
		steps = new Step[] { new NewTable(data, m_ID, m_AD_Plugin_ID),
							 new NewTableConfirm(data),
							 new FinishStep() };
		
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewTableCreator(data));
		
		Window w = ActiveWindowTracker.findActiveWindow();
		
		Wizard wizard = new Wizard((Frame) null, model,
				ResourceLoader.getString("dialog", "newtablewizard", "title"),
				ImageLoader.getIcon(IconKeys.PREFERENCES));
		
		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);
	}

	public void setAD_Plugin_ID(Integer AD_Plugin_ID) {
		m_AD_Plugin_ID = AD_Plugin_ID;
	}

	public void setID(String id) {
		m_ID = id;
	}	
}
