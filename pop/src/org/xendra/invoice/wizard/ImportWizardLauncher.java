package org.xendra.invoice.wizard;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.util.Env;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.common.FinishStep;
import org.xendra.pop.util.ResourceLoader;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class ImportWizardLauncher {
	private DataModel data;
	public ImportWizardLauncher() {
		
	}
	
	public void launchWizard() {
		data = new DataModel();
		Step[] steps;
		steps = new Step[] { new PickPriceList(data),
				new PickStep(data),
				new PickPartner(data),
				new PickProduct(data),							 							 
							 new FinishStep()};	
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new OrderImportCreator(data));
		Window w = ActiveWindowTracker.findActiveWindow();
		Wizard wizard = new Wizard((Frame) null, model, ResourceLoader
				.getString("dialog", "accountwizard", "title"), ImageLoader
				.getIcon(IconKeys.PREFERENCES));

	wizard.setStepListRenderer(null);
	wizard.setPreferredSize(new Dimension(750,500));
	wizard.pack();
	wizard.setLocationRelativeTo(null);
	wizard.setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		org.compiere.Xendra.startup(true);
		Env.setContext(Env.getCtx(), "#AD_Client_ID", 1000038);
		Env.setContext(Env.getCtx(), "#AD_Org_ID", 1000091);
		Env.setContext(Env.getCtx(), "#AD_Role_ID", 1000146);
		Env.setContext(Env.getCtx(), "#AD_User_ID", 2000068);
		Env.setContext(Env.getCtx(), "#M_Warehouse_ID", 1000132);
		Env.setContext(Env.getCtx(), 0, "IsActive", "Y");		
		ImportWizardLauncher nn = new ImportWizardLauncher();
		nn.launchWizard();
		//if (nn.isOk())
		//{
		//	DataModel dm = nn.getDataModel();							
		//}
	}

}
