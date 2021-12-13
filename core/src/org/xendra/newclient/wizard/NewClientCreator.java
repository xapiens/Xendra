package org.xendra.newclient.wizard;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.tree.TreePath;
import org.columba.core.base.SwingWorker;
import org.columba.core.plugin.ExtensionXMLParser;
import org.compiere.apps.ADialog;
import org.compiere.db.CConnection;
import org.compiere.model.MBPartner;
import org.compiere.model.MCurrency;
import org.compiere.model.MLocation;
import org.compiere.model.MRole;
import org.compiere.model.MSetup;
import org.compiere.model.MStore;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_ClientInfo;
import org.compiere.model.persistence.X_AD_Language;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_Bank;
import org.compiere.model.persistence.X_C_BankAccount;
import org.compiere.model.persistence.X_C_Cash;
import org.compiere.model.persistence.X_C_Charge;
import org.compiere.model.persistence.X_C_City;
import org.compiere.model.persistence.X_C_Country;
import org.compiere.model.persistence.X_C_Location;
import org.compiere.model.persistence.X_C_Region;
import org.compiere.model.persistence.X_C_ValidCombination;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.print.PrintUtil;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Language;
import org.compiere.util.SecureEngine;
import org.compiere.util.Util;
import org.jdom.Element;
import org.xendra.Constants;
import org.xendra.api.XendrianServer;
import org.xendra.controls.WaitLayerUI;
import org.xendra.model.AbstractFolder;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;
import com.google.common.io.Files;

public class NewClientCreator implements WizardModelListener {
	DataModel data;
	CConnection m_cc;
	String m_dbname;
	WaitLayerUI m_waitlayer;
	private String dbuser;
	private String dbpwd;

	public NewClientCreator(CConnection cc, DataModel data, String dbname, WaitLayerUI waitlayer) {
		m_cc = cc;	
		this.data = data;
		m_dbname = dbname;
		m_waitlayer = waitlayer;
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
		//Task tsk = new Task();
		//tsk.start();	
		process();
	}	
	
	public void process() {
		String directives = "";
		String clientvalue = (String) data.getData(X_AD_Client.COLUMNNAME_Value);
		String clientname = (String) data.getData(Constants.COLUMNNAME_AD_Client_ID);		
		//String TaxName = (String) data.getData(X_C_Tax.COLUMNNAME_C_Tax_ID);
		String BankName = (String) data.getData(X_C_Bank.COLUMNNAME_C_Bank_ID);
		String BankAccountNo = (String) data.getData(X_C_BankAccount.COLUMNNAME_AccountNo);
		int bankcurr = (int) data.getData(X_C_BankAccount.COLUMNNAME_IBAN);
		
		String ChargeName = (String) data.getData(X_C_Charge.COLUMNNAME_C_Charge_ID); 
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
		
		String orgname = (String) data.getData(Constants.COLUMNNAME_AD_Org_ID);
		String adminname = (String) data.getData(X_AD_User.COLUMNNAME_Supervisor_ID);
		String username = (String) data.getData(X_AD_User.COLUMNNAME_AD_User_ID);
		
		Language lang = (Language) data.getData(X_AD_Language.COLUMNNAME_AD_Language_ID);
		//String acctfile = (String) data.getData(X_Fact_Acct.COLUMNNAME_Fact_Acct_ID);
		MCurrency currency = (MCurrency) data.getData(MCurrency.COLUMNNAME_C_Currency_ID);
		Integer C_Location_ID = (Integer) data.getData(X_C_Location.COLUMNNAME_Address1);
		MLocation loc = new Query(Env.getCtx(), MLocation.Table_Name, "C_Location_ID = ?", null)
		.setParameters(C_Location_ID)
		.first();
		X_C_Region region = new Query(Env.getCtx(), X_C_Region.Table_Name, "C_Region_ID = ?", null)
		.setParameters(loc.getC_Region_ID()).first();
		X_C_City city = new Query(Env.getCtx(), X_C_City.Table_Name, "C_City_ID = ?", null)
		.setParameters(loc.getC_City_ID()).first();
		X_C_Country country = new Query(Env.getCtx(), X_C_Country.Table_Name, "C_Country_ID = ?", null)
		.setParameters(loc.getC_Country_ID()).first();
		
		Integer C_LocationSeveral_ID = (Integer) data.getData(X_C_Location.COLUMNNAME_Address2);
		MLocation locanothers = new Query(Env.getCtx(), MLocation.Table_Name, "C_Location_ID = ?", null)
		.setParameters(C_LocationSeveral_ID)
		.first();

		dbuser = (String) data.getData(X_C_ValidCombination.COLUMNNAME_UserElement1_ID);
		dbpwd = (String) data.getData(X_C_ValidCombination.COLUMNNAME_UserElement2_ID);

		//File fileacct = new File(acctfile);
		MSetup ms = new MSetup(Env.getCtx(), 0);
		//m_glassPane.setMessage("create client...");
		setwaitmessage("create client...");
		boolean ok = ms.createClient(clientvalue, clientname, TaxID, orgname, adminname, username, lang);
		String info = ms.getInfo();		
		if (ok) {
			KeyNamePair curr = new KeyNamePair(currency.getC_Currency_ID(), currency.getISO_Code());
			//m_glassPane.setMessage("create accounting...");
			if (!ms.createAccounting(curr,
					true /* product */ , true /* partner */ , true /* project */,
					true /* campaign */ ,true /* region ,fileacct*/))
			{
				ADialog.error(0, null, "AccountSetupError");
				//dispose();
			}
			//bpgroup.setIsDefault(true);
			//bpgroup.save();
			//  Generate Entities			
			KeyNamePair p = new KeyNamePair(country.getC_Country_ID(), country.getName());			
			ms.createEntities(country.getC_Country_ID(), 
					city.getC_City_ID(), 
					region.getC_Region_ID(), 
					currency.getC_Currency_ID(),
					loc,
					locanothers,
					BankName, BankAccountNo,bankcurr, one, two);
			info += ms.getInfo();
			//	Create Print Documents
			PrintUtil.setupPrintForm(ms.getAD_Client_ID());
			
			//m_glassPane.setMessage("create digital certificate...");
			try {
				//					
				HashMap props = Env.getMachine().getProperties();					
				HashMap directories = (HashMap) data.getData("directories");
				JLabel plugins = (JLabel) directories.get(Constants.PLUGINS);
				props.put(Constants.PLUGINS, plugins.getText());										
				JLabel trash = (JLabel) directories.get(Constants.TRASH);
				props.put(Constants.TRASH, trash.getText());
				JLabel xendrastore = (JLabel) directories.get(Constants.STORE);
				props.put(Constants.STORE, xendrastore.getText());					
				JLabel repli = (JLabel) directories.get(Constants.REPLICATION);
				props.put(Constants.REPLICATION, repli.getText());
				JLabel reports = (JLabel) directories.get(Constants.REPORTS);
				props.put(Constants.REPORTS, reports.getText());
				JLabel download = (JLabel) directories.get(Constants.DOWNLOAD);
				props.put(Constants.DOWNLOAD, download.getText());
				JLabel installed = (JLabel) directories.get(Constants.INSTALLED);
				props.put(Constants.INSTALLED, installed.getText());
				//
				String repository = (String) data.getData(X_AD_Plugin.COLUMNNAME_Source);
				char[] passwd = (char[]) data.getData("StorePassword");
				MStore store = new MStore(Env.getCtx(), 0, null);
				store.setRepository(repository);
				String keystore = (String) data.getData("KeyStorePath");
				HashMap properties = new HashMap();
				properties.put("ServerPassword", SecureEngine.encrypt(String.valueOf(passwd)));
				properties.put(Constants.KEYSTORE, SecureEngine.encrypt(keystore));
				store.setProperties(properties);
				store.save();					
				//
				Env.getMachine().setProperties(props);
				Env.getMachine().save();
				//m_glassPane.setMessage("deploy server...");
				HashMap msprops = Env.getServerProperties(Env.getMachine().getA_Machine_ID(), REF_ServerType.WebServer);
				msprops.put("port", 8080);
				msprops.put("secureport", 8888);
				ExtensionXMLParser.addservertype(REF_ServerType.WebServer, msprops);					
				//ExtensionXMLParser.addservertype(REF_ServerType.UpdateServer, null);					
				(new XendrianThread()).start();
				// sleep for 10 seconds to wait to deploy the server
				Thread.sleep(10000);
				//getThread().sleep(10000);				
				String machineid = String.valueOf(Env.getMachine().getA_Machine_ID());
				String where = "properties->'A_Machine_ID'  = ? AND servertype = ?";
				//m_glassPane.setMessage("deploy plugins...");
				MRole role = MRole.getDefault();
				if (role.getIdentifier().length() == 0) {
					role.setIdentifier(Util.getUUID());
					role.save();
				}
				//OkHttpClient client = new OkHttpClient();
				String m_directory = download.getText();
				if (!m_directory.endsWith(File.separator)) {
					m_directory += File.separator;
				}				

				TreePath[] paths = (TreePath[]) data.getData(X_AD_Rule.COLUMNNAME_Lockout);
				// first deploy the core, in case is update
				for (TreePath path:paths) {
					AbstractFolder node = (AbstractFolder) path.getLastPathComponent();			
					String m_type = node.getNode().getName();
					if (m_type.equals("plugin")) {
						Element e = node.getNode();
						String filename = e.getAttributeValue("filename");
						String askclient = e.getAttributeValue("askclient");
						if (askclient == null) {
							askclient = "N";
						}
						
						String clientid = "0";
						if (askclient.equals("Y")) {
							clientid = Env.getContext(Env.getCtx(), "#AD_Client_ID"); 													
						}
						new XendrianServer().setServlet("store").addProperty("filename",filename);
						new XendrianServer().setServlet("store").addProperty("client", clientid);
						if (filename.equals("core.zip")) {
							Path p1 = Paths.get(m_directory, filename);
							String fileinst = String.format("%s%s", m_directory,filename);
							File insfile = new File(fileinst);
							System.out.println(String.format("fileinst %s", fileinst));
							String filestore = String.format("%s%s", Env.getMachine().getStoreFolder(),filename);
							File storefile = new File(filestore);
							if (storefile.exists()) {
								storefile.delete();
							}
							Files.move(insfile, new File(filestore));
							//m_glassPane.setMessage(String.format("instalado %s", filestore));
							break;
						}
					}
				}
				// second deploy the server in case update.
				for (TreePath path:paths) {
					AbstractFolder node = (AbstractFolder) path.getLastPathComponent();			
					String m_type = node.getNode().getName();
					if (m_type.equals("plugin")) {
						Element e = node.getNode();
						String filename = e.getAttributeValue("filename");
						if (filename.equals("xendrian.zip")) {
							Path p1 = Paths.get(m_directory, filename);
							String fileinst = String.format("%s%s", m_directory,filename);
							File insfile = new File(fileinst);
							System.out.println(String.format("fileinst %s", fileinst));
							String filestore = String.format("%s%s", Env.getMachine().getStoreFolder(),filename);
							File storefile = new File(filestore);
							if (storefile.exists()) {
								storefile.delete();
							}
							Files.move(insfile, new File(filestore));
							//m_glassPane.setMessage(String.format("instalado %s", filestore));								
							break;
						}
					}
				}					
				// finally the others
				for (TreePath path:paths) {
					AbstractFolder node = (AbstractFolder) path.getLastPathComponent();			
					String m_type = node.getNode().getName();
					if (m_type.equals("plugin")) {
						Element e = node.getNode();
						String filename = e.getAttributeValue("filename");
						if (filename.equals("xendrian.zip") || filename.equals("core.zip")) 
							continue;
						//m_glassPane.setMessage(String.format("deploy %s...",filename));
						Path p1 = Paths.get(m_directory, filename);

						String fileinst = String.format("%s%s", m_directory,filename);
						File insfile = new File(fileinst);
						//							if (insfile.exists()) {
						//								insfile.delete();
						//							}								
						System.out.println(String.format("fileinst %s", fileinst));
						//String storefolder = (String) Env.getMachine().getProperties().get(Constants.STORE);				
						//String filestore = String.format("%s%s", storefolder,filename);					
						String filestore = String.format("%s%s", Env.getMachine().getStoreFolder(),filename);
						//Files.move(insfile, insfile);
						File storefile = new File(filestore);
						if (storefile.exists()) {
							storefile.delete();
						}
						Files.move(insfile, new File(filestore));
						//m_glassPane.setMessage(String.format("instalado %s", filestore));							
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}					
		//return directives;		        		
	}

	private void setwaitmessage(String message) {
		if (m_waitlayer != null)
			m_waitlayer.setMessage(message);
	}
	
	@Override
	public void wizardModelChanged(WizardModelEvent e) {
	}

	class Task extends SwingWorker {

		public Task() {
		}

		public Object construct() {
			process();
			return null;
		}

		/*
		 * Executed in event dispatching thread
		 */
		@Override
		public void finished() {
			//m_glassPane.setBusyTimer(0);
			//waitpanel.setVisible(false);
		}
	}	
	class XendrianThread extends Thread {
		public void run() {
			try {
				String className = "org.xendra.xendrian.Server";
				Class startClass = Class.forName(className);
				Object server = startClass.newInstance();
				Method method = server.getClass().getMethod("run", null);				
				method.invoke(server, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
