package org.xendra.newclient.wizard;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.columba.core.base.SwingWorker;
import org.compiere.apps.ADialog;
import org.compiere.apps.AGlassPane;
import org.compiere.db.CConnection;
import org.compiere.model.MBPGroup;
import org.compiere.model.MBPartner;
import org.compiere.model.MCurrency;
import org.compiere.model.MSetup;
import org.compiere.model.persistence.X_AD_Certificate;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_ClientInfo;
import org.compiere.model.persistence.X_AD_Language;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_C_BP_Group;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_Cash;
import org.compiere.model.persistence.X_C_City;
import org.compiere.model.persistence.X_C_Country;
import org.compiere.model.persistence.X_C_Location;
import org.compiere.model.persistence.X_C_Region;
import org.compiere.model.persistence.X_C_ValidCombination;
import org.compiere.model.persistence.X_Fact_Acct;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.print.PrintUtil;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Language;
import org.postgresql.PGConnection;
import org.postgresql.copy.CopyManager;
import org.xendra.Constants;
import org.xendra.newclient.wizard.NewDatabase.Task;

import com.mchange.v2.c3p0.C3P0ProxyConnection;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewClientCreator implements WizardModelListener {
	DataModel data;
	CConnection m_cc;
	String m_dbname;
	private AGlassPane m_glassPane;
	private JFrame waitpanel;

	public NewClientCreator(CConnection cc, DataModel data, String dbname) {
		m_cc = cc;	
		this.data = data;
		m_dbname = dbname;
	}

	@Override
	public void stepShown(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardCanceled(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardFinished(WizardModelEvent e) {		
		waitpanel = new JFrame();
		waitpanel.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		waitpanel.setUndecorated(true);
		waitpanel.setPreferredSize(new Dimension(200,200));
		waitpanel.setAlwaysOnTop(true);
		waitpanel.setSize(new Dimension(300,200));
		m_glassPane = new AGlassPane();
		waitpanel.setGlassPane(m_glassPane);
		waitpanel.setLocationRelativeTo(null);
		waitpanel.setVisible(true);
		m_glassPane.setBusyTimer(10000000);
		Task tsk = new Task();
		tsk.start();		
	}	

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
	}

	class Task extends SwingWorker {

		private String dbuser;
		private String dbpwd;

		public Task() {
		}

		public Object construct() {
			String directives = "";
			String clientvalue = (String) data.getData(X_AD_Client.COLUMNNAME_Value);
			String clientname = (String) data.getData(Constants.COLUMNNAME_AD_Client_ID);
			String TaxID = (String) data.getData(X_C_BPartner.COLUMNNAME_TaxID);
			MBPartner one = new MBPartner(Env.getCtx(), 0, null);
			one.setValue(clientvalue);
			one.setName(clientname);
			one.setTaxID(TaxID);
			//
			String severalname = (String) data.getData(X_AD_ClientInfo.COLUMNNAME_C_BPartnerCashTrx_ID);
			String severalalias = (String) data.getData(X_C_Cash.COLUMNNAME_User1_ID);
			String severalTaxID = (String) data.getData(X_C_Cash.COLUMNNAME_User2_ID);
			MBPartner two = new MBPartner(Env.getCtx(), 0, null);
			two.setValue(severalalias);
			two.setName(severalname);
			two.setTaxID(severalTaxID);
			//
			String orgname = (String) data.getData(Constants.COLUMNNAME_AD_Org_ID);
			String adminname = (String) data.getData(X_AD_User.COLUMNNAME_Supervisor_ID);
			String username = (String) data.getData(X_AD_User.COLUMNNAME_AD_User_ID);
			Language lang = (Language) data.getData(X_AD_Language.COLUMNNAME_AD_Language_ID);
			String acctfile = (String) data.getData(X_Fact_Acct.COLUMNNAME_Fact_Acct_ID);
			//String partnerfile = (String) data.getData(X_C_BPartner.COLUMNNAME_C_BPartner_ID);
			//String productfile = (String) data.getData(X_M_Product.COLUMNNAME_M_Product_ID);
			MCurrency currency = (MCurrency) data.getData(MCurrency.COLUMNNAME_C_Currency_ID);
			X_C_Country country = (X_C_Country) data.getData(X_C_Country.COLUMNNAME_C_Country_ID);
			X_C_Region region = (X_C_Region) data.getData(X_C_Region.COLUMNNAME_C_Region_ID);
			String address = (String) data.getData(X_C_Location.COLUMNNAME_Address1);
			X_C_City city = (X_C_City) data.getData(X_C_City.COLUMNNAME_C_City_ID);
			MBPGroup bpgroup = (MBPGroup) data.getData(X_C_BP_Group.COLUMNNAME_C_BP_Group_ID);
			
			dbuser = (String) data.getData(X_C_ValidCombination.COLUMNNAME_UserElement1_ID);
			dbpwd = (String) data.getData(X_C_ValidCombination.COLUMNNAME_UserElement2_ID);
			String dbcertificate = (String) data.getData(X_AD_Certificate.COLUMNNAME_AD_Certificate_ID);
			
			File fileacct = new File(acctfile);
			MSetup ms = new MSetup(Env.getCtx(), 0);
			m_glassPane.setMessage("create client...");
			boolean ok = ms.createClient(clientvalue, clientname, orgname, adminname, username, lang);
			String info = ms.getInfo();		
			if (ok) {
				KeyNamePair curr = new KeyNamePair(currency.getC_Currency_ID(), currency.getISO_Code());
				m_glassPane.setMessage("create accounting...");
				if (!ms.createAccounting(curr,
						true /* product */ , true /* partner */ , true /* project */,
						true /* campaign */ ,true /* region */,
						fileacct))
				{
					ADialog.error(0, null, "AccountSetupError");
					//dispose();
				}
				//  Generate Entities
				KeyNamePair p = new KeyNamePair(country.getC_Country_ID(), country.getName());
				//int C_Country_ID = p.getKey();
				//p = (KeyNamePair)fRegion.getSelectedItem();
				//int C_Region_ID = p.getKey();
				//ms.createEntities(country.getC_Country_ID(), city.getC_City_ID(), region.getC_Region_ID(), currency.getC_Currency_ID(), TaxID);				
				m_glassPane.setMessage("create entities...");
				ms.createEntities(country.getC_Country_ID(), city.getC_City_ID(), region.getC_Region_ID(), address, currency.getC_Currency_ID(), bpgroup, one, two);
				info += ms.getInfo();
				//	Create Print Documents
				PrintUtil.setupPrintForm(ms.getAD_Client_ID());
				m_glassPane.setMessage("create digital certificate...");
				ms.createCertificate(dbcertificate);

			}					
			return directives;		        
		}

		/*
		 * Executed in event dispatching thread
		 */
		@Override
		public void finished() {
			m_glassPane.setBusyTimer(0);
			waitpanel.setVisible(false);
			Ini.deletePropertyFile();
			System.exit(0);
//			m_cc.setDbUid(dbuser);
//			m_cc.setDbPwd(dbpwd);
//			m_cc.setDbName(m_dbname);
//			Exception e = m_cc.testDatabase(true);
//			System.out.println(m_cc);
		}
	}	

}
