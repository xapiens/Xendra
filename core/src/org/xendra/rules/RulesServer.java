package org.xendra.rules;

import java.awt.EventQueue;

import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.util.CLogger;
import org.compiere.util.Splash;

/**
 * based in Line Printer Daemon (LPD).  
 */
public class RulesServer implements Runnable {
	static CLogger log = CLogger.getCLogger(RulesServer.class);

	private final static RulesServer INSTANCE = new RulesServer();
	/**
	 * Constructor for LPD.
	 */
	private RulesServer() {
		super();
		log.fine("LPD(): STARTED");
		try {
			//Template t = ve.getTemplate("foo.vm");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * This class is a singleton.  
	 * @param printserver 
	 * @return the only instance of LPD.
	 */
	public static RulesServer getInstance() {
		return INSTANCE;
	}

	/**
	 * The run method is implemented so this can be run in its own Thread if desired.
	 */
	public void run() {
		//Sales.instance.connect();				
	}

	public static void main(String args[]) {
		log.fine("main(): STARTED");
		try {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
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
								ex.printStackTrace();
							}
							if (!login.isConnected() || !login.isOKpressed())
								AEnv.exit(1);
						}										
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});			
		} catch(Exception e) {
			log.severe(e.getMessage());
		}
		log.fine("main(): FINSHED");
	}
}
