package org.xendra.efact.wizard;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.util.Splash;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.common.FinishStep;
import org.xendra.efact.util.ResourceLoader;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class CreateEfactWizardLauncher {
	private DataModel data;
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;
		steps = new Step[] { new BPartnerStep(data), 
							 new LocationStep(data),
							 new PartnerDocTypeStep(data)};
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new EFactConfigurationCreator(data) );

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
	public static void main(String[] args) {
		org.compiere.Xendra.startup(true);
		Splash splash = Splash.getSplash();
		ALogin login = new ALogin(splash);
		if (!login.initLogin())		//	no automatic login
		{
			//	Center the window
			try
			{
				AEnv.showCenterScreen(login);	//	HTML load errors
			}
			catch (Exception ex)
			{
				//log.severe(ex.toString());
				ex.printStackTrace();
			}
			if (!login.isConnected() || !login.isOKpressed())
				AEnv.exit(1);
		}
		CreateEfactWizardLauncher l = new CreateEfactWizardLauncher();
		l.launchWizard();		
		splash.dispose();
		splash = null;							
	} 
}
