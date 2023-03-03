package org.xendra.security.wizard;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.model.MBPartner;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.common.FinishStep;
import org.xendra.security.util.ResourceLoader;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class ModifyCertificatePartnerWizardLauncher {
	private DataModel data;
	private MBPartner p;
	public void launchWizard(MBPartner m_p) {
		p = m_p;
		data = new DataModel();
		Step[] steps;
		steps = new Step[] {
				 new PickPartnerStep(p, data),
				 new PickKeyStoreStep(p, data),
				 new PickAliasStep(p, data),
				 new SendFilePathStep(p, data),
				 new FinishStep() };
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new BPartnerCertificateCreator(data));

		Window w = ActiveWindowTracker.findActiveWindow();

		Wizard wizard = new Wizard((Frame) null, model, 
				ResourceLoader.getString("dialog", "partnerwizard", "title"), 
				ImageLoader.getIcon(IconKeys.PREFERENCES));

		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);		
	}
}
