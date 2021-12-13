package org.xendra.newclient.wizard;

import java.awt.Frame;
import java.awt.Window;
import org.columba.core.plugin.PluginManager;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.Xendra;
import org.compiere.db.CConnection;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.controls.WaitLayerUI;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class NewClientWizardLauncher {
	private DataModel data;
	private String m_dbname;
	private CConnection m_cc;
	private WaitLayerUI m_waitlayer;	

	public void launchWizard() {
		if (data == null)
			data = new DataModel();
		Step[] steps = new Step[] {				
				new DatabaseAccessStep(data, m_dbname, m_cc),				
				new NewDatabase(data, m_dbname, m_cc),
				new LanguageStep(data),
				new NewClientName(data),
				new SeveralCustomersStep(data),
				new SeveralCustomersAddressStep(data),
				new NewOrgName(data),	
				new BankStep(data),
				new ChargeNameStep(data),
				new CurrencyStep(data),
				new NewAdminName(data),							 
				new NewUserName(data),
				new LocationStep(data),
				new ImportAccountsStep(),
				new ImportSchemaDefaultStep(),
				new ImportBPartnerStep(),
				new ImportProductStep(),
				new ImportPriceListStep(),
				new ImportInventoryStep(),
				new DirectoriesStep(data),
				//new StoreStep(data),
				//new PluginReposStep(data),
				//new PluginStep(data),									
				new FinishStep() };

		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewClientCreator(m_cc, data, m_dbname, m_waitlayer));

		Window w = ActiveWindowTracker.findActiveWindow();
		Wizard wizard = null;
		try {
			wizard = new Wizard((Frame) null, model, ResourceLoader
					.getString("dialog", "newclient", "title"), ImageLoader.getIcon(IconKeys.PREFERENCES));			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		wizard.setStepListRenderer(null);
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);		
	}
	
	public static void main (String[] args)
	{
		Xendra.startup(true);
		PluginManager.getInstance().addExtensionHandlers("org/columba/core/plugin/extensionhandler.xml");
		String path = "org/columba/core/plugin/plugin.xml";
		PluginManager.getInstance().addPlugin(path);
		NewClientWizardLauncher nn = new NewClientWizardLauncher();							
		nn.launchWizard();
	}
	
	public void setDBName(String dbname) {
		m_dbname = dbname;		
	}
	
	public void setConnection(CConnection cc) {
		m_cc = cc;
	}
	
	public void setWaitLayer(WaitLayerUI layerUI) {
		m_waitlayer = layerUI;		
	}
}
