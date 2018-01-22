package org.xendra.newclient.wizard;

import java.awt.Frame;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

import org.columba.core.component.ComponentManager;
import org.columba.core.plugin.PluginManager;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.Xendra;
import org.compiere.db.CConnection;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.newclient.i18n.ResourceLoader;
import org.xendra.plaf.XendraPLAF;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

public class NewClientWizardLauncher {
	private DataModel data;
	private String m_dbname;
	private CConnection m_cc;	

	public void launchWizard() {
		if (data == null)
			data = new DataModel();
		Step[] steps;
		steps = new Step[] { new DatabaseAccessStep(data, m_dbname, m_cc),
						new NewDatabase(data, m_dbname, m_cc),
						 new LanguageStep(data),
						 new PartnerGroupStep(data),
						 new NewClientName(data),
						 new SeveralCustomersStep(data),
						 new NewOrgName(data),							 
							 new CurrencyStep(data),
							 new NewAdminName(data),							 
							 new NewUserName(data),
							 //new CertificateStep(data),
							 new LocationStep(data),							 
							 new ImportAccountStep(data),
							 new ImportBPartnerStep(),
							 new ImportProductStep(),
							 new ImportPriceListStep(),
							 new ImportInventoryStep(),
							 new FinishStep() };
		
		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new NewClientCreator(m_cc, data, m_dbname));
		
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
}
