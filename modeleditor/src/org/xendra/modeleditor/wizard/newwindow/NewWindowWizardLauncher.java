package org.xendra.modeleditor.wizard.newwindow;

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

public class NewWindowWizardLauncher {
	private DataModel data;
	private Integer m_AD_Plugin_ID;
	private String m_ID;
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;
		
		steps = new Step[] { new NewWindow(data, m_ID, m_AD_Plugin_ID),
							 new NewWindowConfirm(data),
							 new FinishStep() };
		
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewWindowCreator(data));
		
		Window w = ActiveWindowTracker.findActiveWindow();
		
		Wizard wizard = new Wizard((Frame) null, model,
				ResourceLoader.getString("dialog", "newwindowwizard", "title"),
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
